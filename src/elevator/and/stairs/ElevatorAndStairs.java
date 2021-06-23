/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevator.and.stairs;
import java.util.Scanner;
public class ElevatorAndStairs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t>0)
        {
            int N=in.nextInt();
            int V1=in.nextInt();
            int V2=in.nextInt();
            if(V2>(int)(V1*Math.sqrt(2)))
            {
                System.out.println("Elevator");
            }
            else
            {
                System.out.println("Stairs");
            }
        }
    }
    
}
