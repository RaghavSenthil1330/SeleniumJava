package selenium.basic.Learning;

public class challenge {

	public static void main(String[] args) {
		
		double firstNum,secondNum,step1Result,step2Result,step3Result,step4Result,step5Result;
		
		 firstNum= 20.0;
		 secondNum= 100.0;
		 step1Result= firstNum*secondNum ;
		 step2Result= step1Result%20.0d;
		 step3Result= step1Result+20.0;
		 step4Result= step3Result%40;
		 step5Result= (step4Result*35.0)+20.0;
		 System.out.println("The result is : " + step5Result);
		
	}

}
