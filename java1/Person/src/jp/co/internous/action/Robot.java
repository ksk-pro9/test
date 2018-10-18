package jp.co.internous.action;

public class Robot {
	public String power=null;
	public String name=null;
	
	public void talk(){
		System.out.println(this.name+"が話す");
	}
	public void walk(){
		System.out.println(this.name+"歩く");
	}
	public void run(){
		System.out.println(this.name+"が走る");
	}
}
