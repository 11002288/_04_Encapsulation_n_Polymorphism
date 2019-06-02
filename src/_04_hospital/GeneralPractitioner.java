package _04_hospital;

public class GeneralPractitioner extends Doctor{
	@Override
	public Object performsSurgery() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Object makesHouseCalls() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public void doMedicine() {
		// TODO Auto-generated method stub
		for (int i = 0; i < paist.size(); i++) {
			paist.get(i).care = true;
		}
	}

}
