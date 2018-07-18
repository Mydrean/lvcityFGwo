package BuilderPattern;

import java.util.ArrayList;

public abstract class Set_mealModel {
	private ArrayList<String> sequence = new ArrayList<String>();
	protected abstract void drink();
	protected abstract void staplefood();
	protected abstract void assistedfood();
	final public void make(){
		for(int i=0;i<this.sequence.size();i++){
			String actionName = this.sequence.get(i);
			if(actionName.equals("drink")){
				this.drink();
			}else if(actionName.equals("staplefood")){
				this.staplefood();
			}else if(actionName.equals("assistedfood")){
				this.assistedfood();
			}
		}
	}
	final public void setSequence(ArrayList<String> sequence){
		this.sequence=sequence;
	}
}
