import java.util.Random;

public class Scenario1 {
    public static void main(String[] args) {
        int[] max = {50, 100, 1000, 10000, 50000, 100000, 500000, 1000000};
        Random generator = new Random();

        for(int i=0; i<max.length; i++) {

            // ************ Begin Simulation ************

            int n_E = 0;                // Initialize success counter
            for(int n=1; n<max[i]; n++) {
                // Generate random integer between 0 and 35
                int r_e = generator.nextInt(36);
                if(r_e < 3) {
                    n_E++;          // Increment success counter
                }
            }

            double prob = (double) n_E / max[i];        // Calculate probability

            // ************ End Simulation ************

            System.out.println("n_E = " + n_E + " max = " + max[i] + " n_E/max[i] = " + prob);
        }
    }
}