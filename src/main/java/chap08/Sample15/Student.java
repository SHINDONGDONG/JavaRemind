package chap08.Sample15;

public class Student {
		static String name;

		public Student(String name) {
			this.name = name;
		}
		
		public static class Score{
			int eng;
			int mat;
			
			public Score(String name) {
				Student.name  = name;
			}

			
			public void showInfo() {
				System.out.println(name);
				System.out.println("수학 : " + mat);
				System.out.println("영어 : " + eng);
			}
		}
}
