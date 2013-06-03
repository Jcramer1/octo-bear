package training;

public class TrainingMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		EmployeeMaker em = new EmployeeMaker();
		
		Employee sam = em.getEmpType("Manager");
		System.out.println(sam.getName());
	}

}
