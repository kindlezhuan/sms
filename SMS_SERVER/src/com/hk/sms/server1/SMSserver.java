package com.hk.sms.server1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class SMSserver {

    private ServerSocket ss;//���ܿͻ�������serversocket
    public static Controller controller;// ������������һϵ�е�ҵ������
    
    static
	{
		controller = new Controller();
	}

    public void startService()
	{
		try
		{
			System.out.println("Service start!");
			int port = Token.getServerPort();
			ss = new ServerSocket(port);
		} catch (IOException e1)
		{
			e1.printStackTrace();
		}

		while (true)
		{
			try
			{
			    Socket s = ss.accept();
				new ServerThread(s).start();
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
    
    public void close()
	{
		try
		{
			ss.close();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args)
	{
		new SMSserver().startService();
	}

}
