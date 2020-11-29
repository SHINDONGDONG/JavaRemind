package chap09.Smaple04;

public class Sample04 {

	public static void main(String[] args) {
		Pet cat = new Cat(false, 4);
		cat.run(getPetName(cat));
		Parrot parrot = new Parrot(true, 2);
		parrot.run(getPetName(parrot));

		parrot.fly(getPetName(parrot));
	}
	
	public static String getPetName(Pet pet) {
		String str = "";
		if(pet instanceof Cat) {
			str = "고양이";
		}else if(pet instanceof Parrot) {
			str ="앵무새";
		}
		return str;
	}

}
