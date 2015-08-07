package com.hk.sms.server.main;

import com.hh.sms.info.AskMsg;
import com.hh.sms.info.BaseMsg;
import com.hh.sms.info.LoginMsg;
import com.hh.sms.info.MsgType;
import com.hh.sms.info.NettyChannelMap;
import com.hh.sms.info.PingMsg;
import com.hh.sms.info.ReplyClientBody;
import com.hh.sms.info.ReplyMsg;
import com.hh.sms.info.ReplyServerBody;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.SocketChannel;
import io.netty.util.ReferenceCountUtil;

public class NettyServerHandler extends SimpleChannelInboundHandler<BaseMsg> {
	  @Override
	  public void channelInactive(ChannelHandlerContext ctx) throws Exception {
	    //channel失效，从Map中移除
		  System.out.println("server:channelInactive:断开");
	    NettyChannelMap.remove((SocketChannel)ctx.channel());
	  }
	@Override
	
	protected void channelRead0(ChannelHandlerContext ctx, BaseMsg msg)
			throws Exception {
		System.out.println("server:channelRead0");
		System.out.println(msg.toString());
		System.out.println(MsgType.LOGIN.equals(msg.getType()));
	    if(MsgType.LOGIN.equals(msg.getType())){
	      LoginMsg loginMsg=(LoginMsg)msg;
	      if("robin".equals(loginMsg.getUserName())&&"yao".equals(loginMsg.getPassword())){
	        //登录成功,把channel存到服务端的map中
	        NettyChannelMap.add(loginMsg.getClientId(),(SocketChannel)ctx.channel());
	        System.out.println(loginMsg.getUserName()+":"+loginMsg.getPassword());
	        System.out.println("client"+loginMsg.getClientId()+" 3:登录成功");
	      }
	      else{
	    	  ctx.channel().write("error");
	    	  ctx.channel().closeFuture();
//	    	  ctx.channel().close();
	      }
	    }else{
	      if(NettyChannelMap.get(msg.getClientId())==null){
	          //说明未登录，或者连接断了，服务器向客户端发起登录请求，让客户端重新登录
	    	  System.out.println("NULL");
	          LoginMsg loginMsg=new LoginMsg();
	          ctx.channel().writeAndFlush(loginMsg);
	      }
	    }
	    System.out.println("::"+msg.getType());
	    switch (msg.getType()){
	      case PING:{
	        PingMsg pingMsg=(PingMsg)msg;
	        PingMsg replyPing=new PingMsg();
	        NettyChannelMap.get(pingMsg.getClientId()).writeAndFlush(replyPing);
	      }break;
	      case ASK:{
	        //收到客户端的请求
	        AskMsg askMsg=(AskMsg)msg;
	        System.out.println("authToken".equals(askMsg.getParams().getAuth()));
	        if("authToken".equals(askMsg.getParams().getAuth())){
	          ReplyServerBody replyBody=new ReplyServerBody("server info $$$$ !!!");
	          ReplyMsg replyMsg=new ReplyMsg();
	          replyMsg.setBody(replyBody);
	          NettyChannelMap.get(askMsg.getClientId()).writeAndFlush(replyMsg);
	        }
	      }break;
	      case REPLY:{
	        //收到客户端回复
	        ReplyMsg replyMsg=(ReplyMsg)msg;
	        ReplyClientBody clientBody=(ReplyClientBody)replyMsg.getBody();
	        System.out.println("receive client msg: "+clientBody.getClientInfo());
	      }break;
	      default:break;
	    }
	    ReferenceCountUtil.release(msg);
	  
	}
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		System.out.println("server:channelActive");
	}
	}
