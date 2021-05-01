package homeWork2;

public class StudentManager extends UserManager{
	
	public void ask(Student[] students) {
		for (Student student : students) {
			System.out.println(student.getFirstName() + " " + student.getLastName() + " " + "soru sordu.");
		}
	}
	
	@Override
	public void editProfile(User user) {
		user.setUserType("Öğrenci");
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + user.getUserType() + " profili düzenlendi.");
	}
	
	public void join(Student[] students) {
		for(Student student : students) {
			System.out.println(student.getFirstName() + " " + student.getLastName() + " derse katıldı.");
			int success = student.getPercentOfSuccess() * 30 / 100 ;  
			System.out.println(student.getSchoolNumber() + " nolu öğrencinin başarılı notu : " + success);
		}
		
	}
		
		
	

}
