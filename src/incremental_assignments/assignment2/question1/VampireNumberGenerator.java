package incremental_assignments.assignment2.question1;

import java.util.ArrayList;

public class VampireNumberGenerator {

    private static long currentFang1, currentFang2;

    /**
     * @param prefix
     * @param number
     * @param allPermutations
     * populates allPermutations with all possible permutations of the string str
     */
    private static void fillAllPermutations(String prefix, String number, ArrayList<String> allPermutations) {
        int length = number.length();
        if (length == 0) allPermutations.add(prefix);
        else {
            for (int index = 0; index < length; index++)
                fillAllPermutations(prefix + number.charAt(index), number.substring(0, index) + number.substring(index+1, length),
                        allPermutations);
        }
    }

    /**
     * @param strNumber
     * @return a boolean indicating the presence of fangs for the given number
     */
    private static boolean hasFangs(String strNumber) {
        String strFang1, strFang2;
        long fang1, fang2, longNumber = Long.parseLong(strNumber);
        int numLength = strNumber.length();
        ArrayList<String> allPermutations = new ArrayList<>();

        // Get all possible permutations of the given number
        fillAllPermutations("", strNumber, allPermutations);

        // Check if any permutation can be broken into two halves that form the fangs of a vampire number
        for (String number: allPermutations) {
            strFang1 = number.substring(0, numLength/2);
            strFang2 = number.substring(numLength/2, numLength);

            // Both the fangs mustn't simultaneously end with 0
            if (!(strFang1.endsWith("0") && strFang2.endsWith("0"))) {
                fang1 = Long.parseLong(strFang1);
                fang2 = Long.parseLong(strFang2);
                // Both the fangs when multiplied must result in the original number
                if (fang1 * fang2 == longNumber) {
                    currentFang1 = fang1;
                    currentFang2 = fang2;
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isVampire(Long number) {
        String strNumber = number.toString();

        // Consider only numbers with even number length
        if ((strNumber.length() % 2) != 0)
            return false;
        else
            return hasFangs(strNumber);
    }

    public static void main(String[] args) {
        int noOfVampireNumbers = 0;
        Long number = 10L;

        // Print First 100 vampire numbers
        while (noOfVampireNumbers < 100) {
            if (isVampire(number)) {
                noOfVampireNumbers++;
                System.out.println(noOfVampireNumbers + ". " + number);
                System.out.println("\tFangs: " + currentFang1 + ", " + currentFang2);
            }
            number++;
        }
    }
}
