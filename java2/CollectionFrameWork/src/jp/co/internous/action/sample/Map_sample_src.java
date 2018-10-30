package jp.co.internous.action.sample;
import java.util.HashMap;
import java.util.Map;

public class Map_sample_src {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Map<String,String> map=new HashMap<String,String>();

		//値のセットはputメソッドを利用
		map.put("key1", "value1");		//Mapを使った場合には、put()で要素を記憶できます。
		map.put("key2", "value2");
		map.put("key3", "value3");
		map.put("key4", "value4");
		map.put("key5", "value5");

		//値の取得
		String value=map.get("key1");//value1が取得できる
		System.out.println(value);		//Mapを使った場合には、get()で要素を取得できます。

		String valueNull=map.get("key6");//存在しないkeyの場合はnull
		System.out.println(valueNull);

		//mapに該当するkeyが存在するか否かチェックすることも可能
		if(map.containsKey("key1")){
			System.out.println("keyは存在します");
		}else{
			System.out.println("Keyは存在しません");

		}

		//拡張for文を利用してすべての情報を取得する
		for(Map.Entry<String,String>e:map.entrySet()){
			System.out.println(e.getKey()+":"+e.getValue());


		//拡張for文:map.entrySet()に要素が記録されています。これをMap.EntryでString,Stringで取得できるようにします。
		//拡張for文を使って、取得したものは都度(ループ毎に)eに記憶されます。
		//e.getKey()とするとキーが、e.getValue()とすると、要素が取得できます。
		}

	}

}
