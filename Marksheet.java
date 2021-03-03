import java.util.*;
public class Marksheet {
	private  List<Integer> listOfMarks=new ArrayList<Integer>();
	
	/*
	 * Gives the list of the grades
	 * @return List of the grades
	 */
	public List<Integer> getListOfMarks() {
		return listOfMarks;
	}
	/*
	 * set the grades of user in list of the grades
	 * @param i integer value as an input
	 */
	public void setListOfMarks(int i) {
		this.listOfMarks.add(i);
	}
	
	
	/*
	 * Gives Average of the grades
	 * @param lm ArrayList as an input
	 * @return Average of the grades
	 */
	
	public double Avg(List<Integer> listOfMarks)throws ArithmeticException
	{
		int sum=0;
		for(int i=0;i<listOfMarks.size();i++)
		{
			sum+=listOfMarks.get(i);
		}
		return sum/listOfMarks.size();	
		
	}
	
	/*
	 * Print MaxGrade from the Given Array List
	 * @param lm ArrayList Input
	 * @return Maximum from the Array List
	 */
	
	public int MaxGrade(List<Integer> listOfMarks)
	{
		int maxgrade=listOfMarks.get(0);
		for(int i=0;i<listOfMarks.size();i++)
		{
			if (maxgrade<listOfMarks.get(i)){
				maxgrade=listOfMarks.get(i);
			}
		}
		return maxgrade;
	}
	
	/*
	 * Print MinGrade from the Given Array List
	 * @param lm ArrayList Input
	 * @return Minimum from the Array List
	 */
	
	public int MinGrade(List<Integer> listOfMarks)
	{
		int mingrade=listOfMarks.get(0);
		for(int i=0;i<listOfMarks.size();i++){
			if (mingrade>listOfMarks.get(i)){
				mingrade=listOfMarks.get(i);
			}
		}
		return mingrade;
	}
	
	/*
	 * Pass Percentage of Students
	 * @param lm ArrayList Input
	 * @return Percentage of Students who passed
	 */
	
	public double PassPerc(List<Integer> listOfMarks)throws ArithmeticException
	{
		int tot=0;
		for(int i=0;i<listOfMarks.size();i++){
			if(listOfMarks.get(i)>=40){
				tot+=1;
			}
		}
		return (tot*100)/listOfMarks.size();
	}
	
	public static void main(String...arg)
	{
		Marksheet mark=new Marksheet();
		Scanner sc=new Scanner(System.in);
		int n;
		int grades;
		try{
		System.out.print("Enter Number of Students : ");
		n=sc.nextInt();
		System.out.print("Enter Grades for "+n+" students :");
		for(int i=0;i<n;i++)
		{
			
			grades=sc.nextInt();
			mark.setListOfMarks(grades);
		}
		sc.close();
	
		System.out.println("\nThe Average of the grades of all Students : "+mark.Avg(mark.listOfMarks));
		System.out.println("\nThe Maximum of the grades of all Students : "+mark.MaxGrade(mark.listOfMarks));
		System.out.println("\nThe Minimum of the grades of all Students : "+mark.MinGrade(mark.listOfMarks));
		System.out.println("\nThe Percentage of students passed are : "+mark.PassPerc(mark.listOfMarks));
		}
		catch(ArithmeticException e)
		{
			System.out.println("Sorry!, Number of Students cannot be Zero");
		}
		catch(IndexOutOfBoundsException c)
		{
			System.out.println("Sorry!, Index Out Of Bounds Exception occurs ");
		}
	}

}