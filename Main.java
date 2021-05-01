package homeWork2;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Aydın");
		instructor.setLastName("Korkmaz");
		instructor.setIdentificationNumber("11111111111");
		instructor.setAddress("Türkiye");
		instructor.setTelephone("(0352) 444 44 44");
		instructor.setYear(2021);
		instructor.setBirthdayYear(1989);
		instructor.setBranch("Sınıf Öğretmeni");
		instructor.setInstitution("Ankara İlköğretim Okulu");
		
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " yaşı : " + instructor.ageHesapla());
		
		Student student = new Student();
		
		student.setId(1);
		student.setFirstName("İpek");
		student.setLastName("Kork");
		student.setIdentificationNumber("11111111112");
		student.setAddress("Türkiye");
		student.setTelephone("(0352) 444 44 45");
		student.setYear(2021);
		student.setBirthdayYear(2013);
		student.setSchoolNumber("213");
		student.setGradeClass("2.");
		student.setSchollName("Ankara İlköğretim Okulu");
		student.setPercentOfSuccess(80);
		System.out.println(student.getFirstName() + " " + student.getLastName() +" yaşı : " + student.ageHesapla());

		
		
		Student student2 = new Student();
		
		student2.setId(1);
		student2.setFirstName("Onur");
		student2.setLastName("Tok");
		student2.setIdentificationNumber("11111111222");
		student2.setAddress("Türkiye");
		student2.setTelephone("(0352) 445 45 45");
		student2.setYear(2021);
		student2.setBirthdayYear(2013);
		student2.setSchoolNumber("215");
		student2.setGradeClass("2.");
		student2.setSchollName("Ankara İlköğretim Okulu");
		student2.setPercentOfSuccess(60);
		System.out.println(student2.getFirstName() + " " + student2.getLastName() +" yaşı : " + student2.ageHesapla());
		
		System.out.println("-------------------");
		System.out.println();
		Student[] students = {student, student2};
		
		StudentManager studentManager = new StudentManager();
		
		studentManager.join(students);
		System.out.println("-------------------");
		studentManager.ask(students);
		System.out.println();
		studentManager.editProfile(student);
		System.out.println();
		studentManager.editProfile(student2);
		System.out.println();
		System.out.println("----------------------");
		System.out.println();
		InstructorManager insManager = new InstructorManager();
		insManager.add(instructor);
		System.out.println("--------------------");
		insManager.answer(instructor);
		System.out.println();
		insManager.editProfile(instructor);


		

		
		

	}

}
