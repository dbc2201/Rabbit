//   Created by IntelliJ IDEA.
// *   Author: Shreya Srivastava (shreyasrivastava18)
// *   Date: 30/10/20
// *   Time: 11:00 PM
// *   File: Tortoise.java

package thread.tortoise;

import javax.swing.*;
import javax.xml.catalog.Catalog;

public class Tortoise implements Runnable{

    public static final int MILESTONES = 5;

    public final Thread tortoise;

    public Tortoise(){
        this.tortoise = new Thread(this,"Tortoise");
    }

    public Thread getTortoise(){
        return tortoise;
    }


    @Override
    public void run(){
        for(int index = 0;index < MILESTONES; index++){
            switch(index){
                case 0:
                    System.out.println("The Tortoise has started from the start line!");
                    System.out.println("The Tortoise is slow and hence is going to sleep!");
                    try{
                        Thread.sleep(3000L);
                    } catch(InterruptedException e){
                        System.err.println("The Tortoise's sleep got interrupted!");
                    }
                    break;
                case 1:
                    System.out.println("The Tortoise has reached the Cool River!");
                    break;
                case 2:
                    System.out.println("The Tortoise has reached Mountain Hill!");
                    break;
                case 3:
                    System.out.println("The Tortoise has reached the Big Oak Tree!");
                    break;
                case 4:
                    System.out.println("The Tortoise has reached the Finish Line!");
                    break;
            }


        }
        JOptionPane.showConfirmDialog(
                null,
                "The Tortoise has completed the race!",
                "Tortoise",
                JOptionPane.OK_CANCEL_OPTION
        );
    }
}
