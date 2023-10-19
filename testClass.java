import java.util.Random;

public class testClass {

        public static void main(String[] args) {
            Random random = new Random();

            int[] rollCount = new int[6];

            int totalRolls = 60000000;

            for (int i = 0; i < totalRolls; i++) {
                int rollResult = random.nextInt(6) + 1;
                rollCount[rollResult - 1]++;
            }
            System.out.println("Face\tFrequency");
            for (int face = 1; face <= 6; face++) {
                System.out.println(face + "\t" + rollCount[face - 1]);
            }
        }
    }


