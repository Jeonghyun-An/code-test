package week14;

public class Product<K,M>{
	private K kind;
	private M model;
	
	public K getK() {
		return kind;
	}
	
	public void setK(K kind) {
		this.kind = kind;
	}
	
	public M getM() {
		return model;
	}
	
	public void setM(M model) {
		this.model = model;
	}

}
