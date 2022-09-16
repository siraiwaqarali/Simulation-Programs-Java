import java.util.Random;

public class Scenario4 {
    public static void main(String[] args) {
        int[] max = {50, 100, 1000, 10000, 50000, 100000, 500000, 1000000};
        Random generator = new Random();

        for(int i=0; i<max.length; i++) {

            // ************ Begin Simulation ************

            int n_E = 0;                // Initialize success counter
            for(int n=1; n<max[i]; n++) {
                int b1=3; int r1=7; int b2=4; int r2=3;     // Select colors

                int r_e = generator.nextInt(b1+r1);
                if(r_e < b1) {
                    b1--; b2++;     // Blue ball moves from box1 to box2
                } else {
                    r1--; r2++;     // Red ball moves from box1 to box2
                }

                r_e = generator.nextInt(b2+r2);
                if(r_e < b2) {
                    b2--; b1++;     // Blue ball moves from box2 to box1
                } else {
                    r2--; r1++;     // Red ball moves from box2 to box1
                }

                r_e = generator.nextInt(b1+r1);
                if(r_e < b1) {
                    n_E++;          // Increment success counter
                }
            }

            double prob = (double) n_E / max[i];        // Calculate probability

            // ************ End Simulation ************

            System.out.println("n_E = " + n_E + " max = " + max[i] + " n_E/max[i] = " + prob);
        }
    }
}