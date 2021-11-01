//Riley Dunn 100760858
//Monday September 25 2021

public class SortedArray {
    public int assignmentCount;
    Warrior[] arr = {};

    //insert function adds a warrior to my own array
    //increases array based on how many objects are in it + 1
    public void insert(Warrior warrior){
        Warrior[] temp = new Warrior[arr.length + 1];
        for (int i = 0; i != arr.length; i++){
            temp[i] = arr[i];
        }
        //adds new warrior and calls print
        temp[arr.length] = warrior;
        arr = temp;
        sort();
    }

    //sorting function
    //sorts through array once and compares array[i] and array[i+1]
    //swaps them if scond one is higher than the first
    //loops over the entire array 50 times.  50 times or equal to however long the array is
    public void sort(){
        int x = 0;
        Warrior temp;
        while (x <= arr.length){                                //makes the loop go over the entire array 50 times
            for (int i = 0; i < arr.length - 1; i++){           //loops over the entire array
                if (arr[i].getSpeed() < arr[i+1].getSpeed()){   //swaps if needed
                    temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                    assignmentCount++;
                }else{
                    continue;
                }
            }
            x++;
        }
    }

    //prints the array
    public String toString(){
        String show = "";
        for (int i = 0; i < arr.length; i++){
            show = show + arr[i] + ", ";
        }
        return show;
    }
}
