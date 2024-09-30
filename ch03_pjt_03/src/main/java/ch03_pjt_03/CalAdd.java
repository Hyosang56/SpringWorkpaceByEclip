package ch03_pjt_03;

public class CalAdd implements ICalculator {
	public CalAdd()
	   {
	      System.out.println("CalAdd기본생성자 호출됨");
	   }

	@Override
	public int doOperation(int firstNum, int secondNum) {
		
		return firstNum + secondNum;
	}

}
