import java.util.*;

public class BinaryRadixSorter {

    public static List sort(int numDigits, List numbers){
        int realNumDigits = numDigits - 1;

        for (int digit = realNumDigits; digit >= 0; digit--){
            Buckets bucket = new Buckets();

            for (int i = 0; i < numbers.size(); i++){
                Object temp = numbers.get(i);
                String num = temp.toString();

                if (num.charAt(digit) == '1'){
                    bucket.addOne(num);
                }else{
                    bucket.addZero(num);
                }
            }

            numbers = bucket.getAllInOrder();
            System.out.println("~"+numbers+"~");
        }
        return numbers;
    }

    public static String toString(List numbers){
        String words = " ";
        int megaLorge = numbers.size()-1;

        for (int var = megaLorge; var >= 0; var--){
            words = " "+numbers.get(var).toString()+words;
        }

        int wordsToReturn;
        words = "[ "+ words + " ]";
        return words;
    }

}
