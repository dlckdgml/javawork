package com.kh._interface.step3;

public class Audio implements RemoteControl, Searchable{

	private int volum;
	
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volum = RemoteControl.MIN_VOLUME;
		} else if (volum < RemoteControl.MAX_VOLUME)
			this.volum = RemoteControl.MIN_VOLUME;
		} else {
			this.volum = volum;
		}
	System.out.println("현재 Audio 볼륨 : " + this.)

	@Override
	public void search(String url) {
		System.out.println(url + "을 연결합니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}

	
}
