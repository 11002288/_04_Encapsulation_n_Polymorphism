package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital{
	ArrayList<Doctor> docs = new ArrayList<Doctor>();
	ArrayList<Patient>pList = new ArrayList<Patient>();
	
	public void addDoctor(GeneralPractitioner generalPractitioner) {
		// TODO Auto-generated method stub
		docs.add(generalPractitioner);
	}

	public void addDoctor(Surgeon surgeon) {
		// TODO Auto-generated method stub
		docs.add(surgeon);
	}

	public List<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return docs;
	}
	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		pList.add(patient);
	}
	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub
		for (int i = 0; i < docs.size()-1; i++) {
			for (int j = 0; j < pList.size(); j++) {
				if(docs.get(i).getPatients().equals(3)) {
					
				}else {
					docs.get(i).assignPatient(pList.get(j));
				}
			}
		}
	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return pList;
	}


}
