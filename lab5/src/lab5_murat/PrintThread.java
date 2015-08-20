/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_murat;

/**
 *
 * @author alex
 */
public class PrintThread extends Thread {
    /* Introductory text for the threads */

    public static final String INTRO = "THREAD: ";
    /* Keeps track of the number of threads we have active */
    private static int threadsRunning = 0;
    /* Which thread am I? */
    private int threadId = 0;
    /* What are we going to be printing */
    private String text = "na";
    /* How long do we wait for */
    private int sleep = 1000;
    /* How many times am I printing this? */
    private int reps = 0;
    /* Are we running? */
    private boolean active = false;

    /* My constructor */
    public PrintThread(String text, int sleep, int reps) {
        this.sleep = sleep;
        this.text = text;
        this.reps = reps;
    }

    /* My getters & setters */
    public static int getThreadsRunning() {
        return threadsRunning;
    }

    public int getThreadId() {
        return threadId;
    }

    public boolean getActive() {
        return this.active;
    }

    public int getReps() {
        return this.reps;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    /* My run method for the thread */
    public void run() {
        threadsRunning++; // We now have more threads
        this.threadId = threadsRunning;
        active = true;
        try {
            int loop = 0;

            while (active && loop <= this.reps) {
                //for (int loop = 0; loop <= this.reps; loop++){

                //getHandshake(this.threadId);
                System.out.println(INTRO + "(" + this.threadId + " of " + threadsRunning
                        + ")" + "[" + text + "]" + " Loops: " + loop + " of " + this.reps);

                Thread.sleep(sleep);
                loop++;
            }

        } catch (Exception e) {
            System.out.println("Exception at PrintThread.run: " + e);
        }
        //   threadsRunning--;
    }

    /* The following method simply prints 3 dots but only allows one thread to do so at the time
     * the idea is to add the synchronized keyword
     */
    public static synchronized void getHandshake(int id) {
        System.out.print("[" + id + "]");
        for (int loop = 0; loop < 3; loop++) {
            System.out.print(".");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }
        }
        System.out.println();
    }
}
