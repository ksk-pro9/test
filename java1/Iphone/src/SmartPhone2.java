//抽象クラスMp3player2から継承
public class SmartPhone2 implements Mp3Player2{
	public void play(){
		System.out.println("再生");
	}
	public void stop(){
		System.out.println("停止");
	}
	public void next(){
		System.out.println("次へ");
		}
	public void back(){
		System.out.println("戻る");
	}

}
