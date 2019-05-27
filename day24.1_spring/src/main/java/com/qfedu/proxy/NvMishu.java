package com.qfedu.proxy;

public class NvMishu implements MeetingIntegerface{
	
	private MeetingIntegerface target;
	
	public NvMishu(MeetingIntegerface _target) {
		this.target = _target;
	}

	@Override
	public void notice() {
		
		System.out.println("小喇叭开始广播了");
		this.target.notice();
		
		System.out.println("迟到的，月薪永远两万");
	}

}
