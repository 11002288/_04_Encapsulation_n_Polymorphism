package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	ArrayList<Doctor> docs = new ArrayList<Doctor>();
	ArrayList<Patient> pList = new ArrayList<Patient>();

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

	public void assignPatientsToDoctors() throws DoctorFullException {
		// TODO Auto-generated method stub
		int noodle = 0;
		for (int i = 0; i < docs.size(); i++) {
			for (int j = noodle; j < pList.size(); j++) {
				if (docs.get(i).getPatients().size() <= 2) {
					docs.get(i).assignPatient(pList.get(j));

				} else {
					noodle +=3;
					break;
				}

			}

		}
	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return pList;
	}

}
