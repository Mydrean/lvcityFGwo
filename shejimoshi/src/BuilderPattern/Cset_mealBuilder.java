package BuilderPattern;

import java.util.ArrayList;

public class Cset_mealBuilder extends Set_mealBuilder{
	private  Cset_mealModel cset_mealModel = new Cset_mealModel();
	public Set_mealModel getSet_mealModel() {
		return this.cset_mealModel;
	}
	public void setSequence(ArrayList<String> sequence){
		this.cset_mealModel.setSequence(sequence);
	}
}
