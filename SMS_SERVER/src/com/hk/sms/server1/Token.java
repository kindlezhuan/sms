package com.hk.sms.server1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.UUID;


public class Token {
	private static Properties pro1,pro2;
	
	/**
	 * »ñÈ¡¶Ë¿Ú
	 */
	public static int getServerPort()
	{
//		return Integer.parseInt(pro1.getProperty("ServicePort"));
		return 8019;
	}
}
