
public class SmartPhone extends Phone{
	//オーバーライド
		public void play(){
			System.out.println("再生（ハイレゾ）");
		}
		public void stop(){
			System.out.println("停止（ハイレゾ）");
		}
		public void next(){
			System.out.println("次へ（ハイレゾ）");
			}
		public void back(){
			System.out.println("戻る（ハイレゾ）");
		}


	public void call(){
		System.out.println("電話");
	}
	public void mail(){
		System.out.println("メール");
	}
	public void photo(){
		System.out.println("写真");
	}
	public void internet(){
		System.out.println("インターネット");
	}
}
