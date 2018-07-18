package BuilderPattern;

import java.util.ArrayList;

public class Bset_mealBuilder extends Set_mealBuilder{
	private  Bset_mealModel bset_mealModel = new Bset_mealModel();
	public Set_mealModel getSet_mealModel() {
		return this.bset_mealModel;
	}
	public void setSequence(ArrayList<String> sequence){
		this.bset_mealModel.setSequence(sequence);
	}
}
