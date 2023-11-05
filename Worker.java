
package MythirdProgram;
import java.util.InputMismatchException;


public class Worker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Worker1 worker1 = new Worker1("rey",4000);
			Worker1 worker2 = new Worker1("john",2340000);
			Worker1 worker3 = new Worker1("coty",20000);
			System.out.println("Total of number of workers :"+Worker1.getWorkerCounter());
		}catch(InputMismatchException e) {
			System.out.println("Exception :"+  e.getMessage());
		}


	}

}
