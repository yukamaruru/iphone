package iphone;

public class Smartphone extends Mp3player{
	//extendsを使うことで、Mp3playerからSmartphoneへ継承するという意味。
	public void call() {
		System.out.println("電話");
	}
	public void mail() {
		System.out.println("メール");
	}
	public void photo() {
		System.out.println("写真");
	}
	public void internet() {
		System.out.println("インターネット");
	}
}
