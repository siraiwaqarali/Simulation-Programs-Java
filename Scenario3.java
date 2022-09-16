import java.util.Random;

public class Scenario3 {
    public static void main(String[] args) {
        int[] max = {50, 100, 1000, 10000, 50000, 100000, 500000, 1000000};
        Random generator = new Random();

        for(int i=0; i<max.length; i++) {

            // ************ Begin Simulation ************

            int n_E = 0;                // Initialize success counter
            for(int n=1; n<max[i]; n++) {
                int[] birthday = new int[23];           // Array to store dates
                boolean match = false;
                int j= 0;
                // Generate upto 23 random dates and compare them
                while(!match && j<23) {
                    birthday[j] = generator.nextInt(365);  // Generate new date
                    // Compare with others
                    for(int k=0; k<j; k++) {
                        // Match?
                        if(birthday[j] == birthday[k]) {
                            match = true;
                        }
                    }
                    j++;
                }
                if(match) {
                    n_E++;          // Increment success counter
                }
            }

            double prob = (double) n_E / max[i];        // Calculate probability

            // ************ End Simulation ************

            System.out.println("n_E = " + n_E + " max = " + max[i] + " n_E/max[i] = " + prob);
        }
    }
}