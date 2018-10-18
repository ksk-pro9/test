/**
 *
 */
package jp.co.internous.action;

/**
 * @author USER
 *
 */
public class Chkloadjdbc {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InstantiationException,IllegalAccessException{
		String msg="";
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			msg="ドライバーのインストールに成功しました。";
		}catch(ClassNotFoundException e){
			msg="ドライバーのロードに失敗しました。";
		}
		System.out.println(msg);
	}
		// TODO 自動生成されたメソッド・スタブ

	}

