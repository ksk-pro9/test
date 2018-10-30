package jp.co.internous.action.sample;
import java.util.HashSet;
import java.util.Set;

public class Set_sample_src {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Set<String> set=new HashSet<String>();

	//値のセットはaddメソッドを利用
		set.add("value1");
		set.add("value2");
		set.add("value3");	//Setを使った場合には、add()で要素を記憶できます。
		set.add("value4");
		set.add("value5");

	set.add("value2");//重複要素をadd

	//拡張for文を利用
	for(String s:set){
		System.out.println(s);//Setを使った場合には、拡張For文で要素を取得できます。
								//set内の要素を都度sに記憶して、画面表示しています。
	}



	}

}

//重複を削除したい場合に一旦Setにデータを入れて、すべてを取り出すといった使い方をすることが多いです。