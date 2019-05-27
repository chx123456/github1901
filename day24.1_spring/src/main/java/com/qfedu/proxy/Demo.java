package com.qfedu.proxy;

public class Demo {
	public static void main(String[] args) {
		
		//目标对象
		Boss boss = new Boss();
		//代理对象
		NvMishu mishu = new NvMishu(boss);
		
		mishu.notice();
		
		MeetingIntegerface target = new Boss();
		MeetingIntegerface proxy = new NvMishu(target);
		proxy.notice();
		
		MeetingIntegerface boss2 = new Boss();
		boss2 = new NvMishu(boss2);
		boss2.notice();
	}
}
