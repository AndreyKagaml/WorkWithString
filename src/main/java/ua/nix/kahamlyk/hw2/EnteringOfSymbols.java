package ua.nix.kahamlyk.hw2;

public class EnteringOfSymbols {


    public static String AmountOfEnterings(String value) {
        char[] newarr = value.toCharArray();
        String result = "";

        for (int i = 0; i < newarr.length; i++) {

            if(!(newarr[i] >= 'a' && newarr[i] <= 'z') && !(newarr[i] >= 'A' && newarr[i] <= 'Z')) continue;
            int score = 0;
            boolean availabilityOfSymbol = true;

            for (int k = 0; k < result.toCharArray().length; k++) {
                if (result.toCharArray()[k] == newarr[i]) availabilityOfSymbol = false;
            }

            if (availabilityOfSymbol) {
                for (int j = 0; j < newarr.length; j++) {
                    if (newarr[i] == newarr[j] && (newarr[i] >= 'a' && newarr[i] <= 'z')) score++;
                }
                result += newarr[i] + "-" + score + "\n";
            }
        }
        return result;
    }
}