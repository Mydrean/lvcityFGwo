package BuilderPattern;

import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		ArrayList<String> sequence = new ArrayList<String>();
		ArrayList<String> sequence1 = new ArrayList<String>();
		Aset_mealBuilder aset_mealBuilder= new Aset_mealBuilder();
		Bset_mealBuilder bset_mealBuilder= new Bset_mealBuilder();
		Cset_mealBuilder cset_mealBuilder= new Cset_mealBuilder();
    	//顾客甲点了A、C套餐
		sequence.add("aset_mealBuilder");
		sequence.add("cset_mealBuilder");
		//顾客乙点了B、C套餐
		sequence1.add("bset_mealBuilder");
		sequence1.add("cset_mealBuilder");

	}
}
