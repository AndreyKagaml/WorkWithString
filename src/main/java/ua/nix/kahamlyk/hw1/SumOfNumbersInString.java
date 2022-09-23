package ua.nix.kahamlyk.hw1;

public class SumOfNumbersInString {

    public static int SumOfNumbers(String line){
        char[] newarr = line.toCharArray();
        int currentSymbol = 0;
        int result =0;
        for(int i=0; i<newarr.length; i++){
            currentSymbol = (int) newarr[i];
            if(currentSymbol>47 && currentSymbol<58) {
                result += currentSymbol - 48;
            }
        }
        return result;
    }

}
