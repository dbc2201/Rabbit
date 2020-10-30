//   Created by IntelliJ IDEA.
// *   Author: Shreya Srivastava (shreyasrivastava18)
// *   Date: 30/10/20
// *   Time: 11:00 PM
// *   File: Rabbit.java

package thread.rabbit;

import javax.swing.*;

public class Rabbit implements Runnable {

    public static final int MILESTONES = 5;

    public  final Thread rabbit;

    public Rabbit(){
        this.rabbit = new Thread(this,"Rabbit");
    }

    public Thread getRabbit(){
        return rabbit;
    }

    @Override
    public void run(){
        for (int index = 0; index < MILESTONES; index++){
            switch (index){
                case 0:
                    System.out.println("The Rabbit has started from the first line");
                    break;
                case 1:
                    System.out.println("The eRabbit has reached the Cool River!");
                    break;
                case 2:
                    System.out.println("The Rabbit has reached the mountain Hill!");
                    break;
                case 3:
                    System.out.println("The Rabbit has reached the Big Oak Tree!");
                    System.out.println("The Rabbit is leading and hence is going to sleep!");
                    try {
                        Thread.sleep(1500L);
                    } catch (InterruptedException e){
                        System.err.println("The Rabbit has lost the path!");
                    }
            }
            JOptionPane.showConfirmDialog(
                    null,
                    "The Rabbit has completed the race!",
                    "Rabbit",
                    JOptionPane.OK_CANCEL_OPTION
            );
        }
    }

}
