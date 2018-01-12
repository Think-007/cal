package com.thinker.cal.test;
import lib.MESSAGEXsend;
import utils.ConfigLoader;
import config.AppConfig;



public class MessageXSendDemo {

	public static void main(String[] args) {
		AppConfig config = ConfigLoader.load(ConfigLoader.ConfigType.Message);
		MESSAGEXsend submail = new MESSAGEXsend(config);
		submail.addTo("18201410900");
		submail.setProject("5gk8m1");
		submail.addVar("code", "1234547");
		submail.addVar("time", "2289s");
		String response=submail.xsend();
		System.out.println("接口返回数据："+response);
	}	
}
