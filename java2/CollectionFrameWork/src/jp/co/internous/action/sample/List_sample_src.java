package jp.co.internous.action.sample;
import java.util.ArrayList;
import java.util.List;

public class List_sample_src {
	public static void main(String[]args){
		List<String>list=new ArrayList<String>();

		//値の記憶をaddメソッドを利用
		list.add("1");
		list.add("2");	//Listを使った場合はadd()で要素を記憶できます。
		list.add("3");
		list.add("4");
		list.add("5");

	//値を取得
		for(int i=0;i<list.size() -1;i++){
			//値の取得はgetメソッドを利用
			System.out.println(list.get(i));//Listを使った場合には、get()で要素を取得できます。
	}

	//拡張for文を使えばもっと簡単
		for(String s:list){
			System.out.println(s);	//Listを使った場合には、拡張for文でも要素を取得できます。
		}							//list内の要素を都度sに記憶して、これを画面表示しています。
}
}