package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Doctor{
	ArrayList<Patient>paist = new ArrayList<Patient>();
	
	

	public void assignPatient(Patient patient) throws DoctorFullException {
		// TODO Auto-generated method stub
		if (paist.size()<=2) {
			paist.add(patient);
		}else {
			throw new DoctorFullException();
		}	
	}
	
	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return paist;
	}
	
	public void doMedicine() {
		// TODO Auto-generated method stub
		for (int i = 0; i < getPatients().size(); i++) {
			getPatients().get(i).care=false;
		}
	}
	
	public Object makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
	}

	public Object performsSurgery() {
		// TODO Auto-generated method stub
		return false;
	}


	


	

}
