package jp.co.internous.action;

public class test2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・ス

	Person2 taro=new Person2();
	taro.name="taro";
	taro.age=18;
	System.out.println(taro.name);
	System.out.println(taro.age);

	Person2 jiro=new Person2("jiro",20);
	System.out.println(jiro.name);
	System.out.println(jiro.age);


	//コンストラクタ③使用
	Person2 saburo=new Person2("saburo");
	System.out.println(saburo.name);
	System.out.println(saburo.age);

	//コンストラクタ④使用
	Person2 noname=new Person2(25);
	System.out.println(noname.name);
	System.out.println(noname.age);

	//コンストラクタ⑤使用
	Person2 hanako=new Person2("hanako",17);
	System.out.println(hanako.name);
	System.out.println(hanako.age);
	}
}
