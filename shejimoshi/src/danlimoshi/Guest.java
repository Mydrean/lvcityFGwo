package danlimoshi;

public class Guest {
	public static void main(String[] args) {
		//定义8个客人
		int guestNum=5;
		for(int i=0;i<guestNum;i++){
			Wife wife=Wife.getInstance();
			System.out.println("第"+(i+1)+"个客人见的是：");
			wife.say();
		}
	}

}
