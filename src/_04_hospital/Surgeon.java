package _04_hospital;

public class Surgeon extends Doctor{
	@Override
	public Object performsSurgery() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public Object makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
	}
}
