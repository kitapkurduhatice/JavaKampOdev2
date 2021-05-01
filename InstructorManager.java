package homeWork2;

public class InstructorManager extends UserManager{
	
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " " + "eğitimi ekledi");
	}
	
	public void answer(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " " +"soruyu cevapladı");
	}
	
	@Override
	public void editProfile(User user) {
		user.setUserType("Eğitmen");
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + user.getUserType() + " profili düzenlendi.");
	}

}
