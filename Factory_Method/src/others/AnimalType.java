package others;

public enum AnimalType {

	DOG("factorys.DogFactory"),
	CAT("factorys.CatFactory"),
	WOLF("factorys.WolfFactory");
	
	private String factoryName;
	
	AnimalType(String factoryName) {
		this.factoryName = factoryName;
	}
	
	public String getFactoryName() {
		return this.factoryName;
	}
}
