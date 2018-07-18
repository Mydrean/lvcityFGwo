package BuilderPattern;

import java.util.ArrayList;

public class Aset_mealBuilder extends Set_mealBuilder{
	private  Aset_mealModel aset_mealModel = new Aset_mealModel();
	public Set_mealModel getSet_mealModel() {
		return this.aset_mealModel;
	}
	public void setSequence(ArrayList<String> sequence){
		this.aset_mealModel.setSequence(sequence);
	}
}
