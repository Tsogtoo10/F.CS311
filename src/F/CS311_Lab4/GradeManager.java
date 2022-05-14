package F.CS311_Lab4;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

/** 
 * A GradeManager will create a command-line prompt that will let someone add grades
 * and display grades in histogram format.
 * 
 */

public class GradeManager {
	
	// Keeps track of the number of each grade this has
	private HashMap<LetterGrade,Integer> allGrades;
    int a=0, b=0, c=0, d=0, e=0;
	/**
	 * Creates a new GradeManager.
	 * @throws Exception 
	 */
	public GradeManager() throws Exception {
		// Create a new HashMap of the grades
		this.allGrades = new HashMap<LetterGrade,Integer>();
		// Add in all grades and set the occurance to 0
		for (LetterGrade gl : LetterGrade.values()) {
			allGrades.put(gl, 0);
		}
	}
	
	
	/**
	 * Adds grade to this GradeManager.
	 * @param grade - grade to add to this grad manager
	 */
	public void addGrade(String grade) throws InvalidGradeException {
		if (grade.equals("A")) {
			// TODO: YOUR CODE HERE
			a=a+1;
			allGrades.replace( LetterGrade.A, a);
		} else if (grade.equals("B")) {
			// TODO: YOUR CODE HERE
			b=b+1;
			allGrades.replace( LetterGrade.B, b);
		} else if (grade.equals("C")) {
			// TODO: YOUR CODE HERE
			c=c+1;
			allGrades.replace( LetterGrade.C, c);
		} 
		 else if (grade.equals("D")) {
				// TODO: YOUR CODE HERE
				d=d+1;
				allGrades.replace( LetterGrade.D, d);
		} 
		 else if (grade.equals("F")) {
				// TODO: YOUR CODE HERE
				e=e+1;
				allGrades.replace( LetterGrade.F, e);
		} 
		 else {
			 throw new InvalidGradeException("Таны оруулсан мэдээлэл алдаатай байна!!!");
		 }
		// TODO: Add more cases in here
		
		// If grade doesn't match a valid grade, throw an InvalidGradeException
	}

	/**
	 * Prints out a histogram of the grades to the console.
	 *
	 */
	public void printHistogram() {
		if(allGrades.size() != 0) {
			System.out.println(getHistString());
		}
		else {
			// TODO: YOUR CODE HERE
			throw new RuntimeException("GradeManger.printHistogram() not yet implemented!");
		}
	}
	
	/**
	 * Returns a string representation of the histogram of the grades.
	 * @return a string representation of the histogram of the grades.
	 */
	public String getHistString() {
		StringBuffer sb = new StringBuffer();
		for (LetterGrade gl : LetterGrade.values()) {
			sb.append( gl+":");
			for (int i = 0; i < this.allGrades.get(gl); i++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	/**
	 * Simple loop that accepts 3 commands from System.in:
	 *    add <some grade> : for example, "add a" or "add b"
	 *                       adds the given grade to the GradeManager
	 *    print            : prints out all the grades in this GradeManager
	 *                       in a histogram format
	 *    exit             : exits the program
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[]  args) throws Exception {
		try {
			Scanner sc = new Scanner(System.in);
			GradeManager gm = new GradeManager();
			
			BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Starting the grade manager");
			System.out.println("1. add\n2. print\n3. exit\nEnter your command:");
			
			while (true) {
					String input = cin.readLine();
					String g;
					if (input.startsWith("add")) {
						System.out.println("Утгаа оруулна уу:");
						g = sc.nextLine();
						gm.addGrade(g);
						System.out.println("Амжилттай.");
						// TODO: YOUR CODE HERE
					} else if (input.equals("print")) {
						gm.printHistogram();
						// TODO: YOUR CODE HERE
					}  else if (input.equals("exit")) {
						break;
					}
					else {
						System.out.println("Буруу утга оруулсан байна!!!");
					}
			}
		}
		catch(RuntimeException er) {
			System.out.println("Ажиллах үед алдаа гарлаа!!!");
			main(null);
		}
		catch(InvalidGradeException egi) {
			System.out.println("Та буруу утга оруулсан байна!!!");
			main(null);
		}
	}

}