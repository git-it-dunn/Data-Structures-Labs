//Riley Dunn
//Monday Sept 27 2021
//part 1 applies a unary function to elements of an array
//part two deals with classes and making song titles

public class Lab02 {
    static double currentNum;

    //loops through the nums array and applies the UnaryFunction then returns array
    public static double[] map(double[] nums, UnaryFunction doubler){
        for (int i = 0; i < nums.length; i++){
            nums[i] = doubler.exec(nums[i]);
        }
        return nums;
    }

    public static void main(String[] args){
        //part 1 - arrays and interfaces
        double[] nums = {1.0,2.0,3.0,4.0,5.0};
        UnaryFunction doubler = (double x) -> {
            return x * 2;
        };
        double[] temp = map(nums, doubler);
        System.out.println("Part 1:");
        for (int i = 0; i < temp.length; i++){
            System.out.print(temp[i] + ", ");
        }

        //part 2 - songs
        System.out.println(" ");
        System.out.println("Part2");
        Song sed = new Song("The Ramones", "I Wanna be Sedated", 148);
        Song one = new Song("Daft Punk", "One More Time", 322);

        Song.collectionName = "Randy's Collection";
        System.out.println("Collection: " + Song.collectionName);

        System.out.println(sed);
        System.out.println(one);

    }
}
