package chap09.Smaple04;

public class Sample05 {

	public static void main(String[] args) {
		ICompute a = new Aparament();
		float area = a.compute(30);
		float area2 = a.toPyung(65);
		System.out.println(area);
		System.out.println(area2);
	}
}

class Aparament implements ICompute{

	@Override
	public float compute(int area) {
//		pyung++;
		return area * pyung;
	}
	
}

interface ICompute{
	float pyung =3.3f;
	abstract float compute(int area);
	default float toPyung(int area) { //디폴트메소드
		return area / pyung;
	}
	
	}