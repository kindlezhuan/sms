package com.hk.sms.server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;


public class ServerThread extends Thread{
	// 服务器端服务线程类
		private ObjectInputStream ois;
		private ObjectOutputStream oos;
	    private Socket s;
		public ServerThread(Socket s)
		{
			try
			{
				ois = new ObjectInputStream(s.getInputStream());
				oos = new ObjectOutputStream(s.getOutputStream());
			} catch (IOException e)
			{
				e.printStackTrace();
			}

		}

		public void run()
		{
			javax.xml.ws.Response res = null;
			try
			{
				System.out.println("service : run");
				String req = (String) ois.readObject();// 读取请求
				res = SMSserver.controller.execute(req);
				oos.writeObject(res);// 写出回复
				System.out.println(((Request) res).getType());
				oos.flush();
			} catch (IOException e)
			{
				e.printStackTrace();
				
			} catch (ClassNotFoundException e)
			{
				e.printStackTrace();
			} catch (Exception e)
			{
				e.printStackTrace();
			}
		}

}
