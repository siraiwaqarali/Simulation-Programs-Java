import java.util.Random;

public class Scenario2 {
    public static void main(String[] args) {
        int[] max = {50, 100, 1000, 10000, 50000, 100000, 500000, 1000000};
        Random generator = new Random();

        for(int i=0; i<max.length; i++) {

            // ************ Begin Simulation ************

            int n_E = 0;                // Initialize success counter
            for(int n=1; n<max[i]; n++) {
                int heads = 0;
                // Trial consists of 5 tosses
                for(int j=1; j<=5; j++) {
                    // Generate random integer between 0 and 1
                    int r_e = generator.nextInt(2);    // 1 for head, 0 for tails
                    heads += r_e;
                }
                if(heads == 3) {
                    n_E++;          // Increment success counter
                }
            }

            double prob = (double) n_E / max[i];        // Calculate probability

            // ************ End Simulation ************

            System.out.println("n_E = " + n_E + " max = " + max[i] + " n_E/max[i] = " + prob);
        }
    }
}