//   Created by IntelliJ IDEA.
// *   Author: Shreya Srivastava (shreyasrivastava18)
// *   Date: 30/10/20
// *   Time: 11:00 PM
// *   File: Race.java

package main;

import thread.rabbit.Rabbit;

public class Race {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.getRabbit().start();
    }
}
