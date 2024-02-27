package java_Projects;

public class CheckIfNoPresentInArray {

	public static void main(String[] args) {
		
		
		int no[] = {11,12,33,44};
		
		int checker = 44;
		
		for (int i=0 ; i<no.length ;i++)
		{
			if(checker == no[i])
			{
				System.out.println("I am Available at: " + i);
			}
			else
			{
				System.out.println("I am NA at: " + i);
			}
			
			
		}
		
		
		

	}

}
