
public class HelloWorld {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//Hello worldの出力
		System.out.println("Hello world");
		antroop(0);
	}



	public static void aisatsu(){
	 System.out.println("おはよう");

	}

	public static void roop(){
	for(int i=0;i<10;i++){
		System.out.println(i);
		if(i%2==0){
			System.out.println("偶数");
		}
		System.out.println("\r\n");
	}
	}


		public static void antroop(int a){

			do{
				System.out.println(a);

				switch(a){
				case 0:
					System.out.println("0です");
				break;

				case 5:
					System.out.println("5です");
				break;
				}

			a++;
			}while(a<10);



		}



}

