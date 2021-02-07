package selenium.basic.Learning;

public class LogicalOperators {

	public static void main(String[] args) {
	int mathScore=30,sciScore=100;
	
	if((mathScore >= 60) && (sciScore >=61))
	{
		
		System.out.println("Student is Average");
	}
	
	System.out.println(".................................................................");
	

	int totalMarks= mathScore + sciScore;
	boolean marksCheck1= mathScore>80 && sciScore >80;
	boolean marksCheck2 = mathScore < 35 || sciScore <35;
	//System.out.println(marksCheck1);
	boolean marksCheck3= totalMarks>=160;
	//System.out.println(totalMarks);
	boolean marksCheck4= !marksCheck2 && totalMarks>120;
	
	if(marksCheck1)
	{
		System.out.println("The student accured: Distinction");
	}
	else if(marksCheck2)
	{
		System.out.println("The student performance is not good");
	}
	else if (marksCheck3)
	{
		System.out.println("The student accured: Distinction");
	}
	else if (marksCheck4)
	{
		System.out.println("The student accured : First Class");
	}
	else
	{
		System.out.println("The student is Average");
	}
	
	System.out.println(".................................................................");
	
	if(marksCheck3)
	{
		System.out.println("He deserves Distinction");
	}
	else
	{
		System.out.println("He does not deserves a Distinction");
	}
	System.out.println(".................................................................");
	
	if(!(totalMarks > 160))

	{
		System.out.println("Not Distinction");
	}
	
	System.out.println(".................................................................");
	
	boolean isAllien = false;
	
	if(!!isAllien)
	{
		System.out.println("I am allien :(");
	}
	else if(!isAllien)
	{
		System.out.println("I am not a allien :)");
	}
	
	}
}
