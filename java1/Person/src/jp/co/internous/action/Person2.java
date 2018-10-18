package jp.co.internous.action;

public class Person2 {
	private String name=null;
	private int age=0;

	public String getName(){
		return this.name;
	}
	public  void SetName(String name){
		this.name=name;
	}

	public Person2(){}	//コンストラクタ①

	public Person2(String name,int age){	//コンストラクタ②
		this.name=name;
		this.age=age;
	}

	public Person2(String name){	//コンストラクタ③
		this.name=name;
		this.age=0;
	}

	public Person2(int age){	//コンストラクタ④
		this.name="名前なし";
		this.age=age;
	}
	public Person2(int age,String name){	//コンストラクタ⑤
		this.name=name;
		this.age=age;
	}
}



