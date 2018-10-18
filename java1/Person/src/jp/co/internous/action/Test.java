package jp.co.internous.action;

public class Test {
	public static void main(String[]args){
		Person taro=new Person();
		taro.name="山田太郎";
		taro.age=20;
	System.out.println(taro.name);
	System.out.println(taro.age);
	taro.talk();
	taro.walk();
	taro.run();

		//木村次郎、18
		Person jiro=new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		System.out.println(jiro.name);
		System.out.println(jiro.age);

		//鈴木花子,16
		Person hana=new Person();
		hana.name="鈴木花子";
		hana.age=16;
		hana.phoneNumber="080-1111-1111";
		hana.address="東京都世田谷区";
		System.out.println(hana.name);
		System.out.println(hana.age);
		System.out.println(hana.phoneNumber);
		System.out.println(hana.address);

		//peppar,60%
		Robot pep=new Robot();
		pep.power="60%";
		pep.name="pepper";
		System.out.println(pep.power);
		System.out.println(pep.name);
		pep.talk();
	
	
	}
}