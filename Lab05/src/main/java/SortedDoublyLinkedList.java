//this code is meant to sort data with linked lists and a quick sort
//Riley Dunn 100760858

public class SortedDoublyLinkedList implements LinkedList{
    public node first;
    public node last;
    public int assignmentCount;

    //makes node
    public class node{
        Warrior data;
        node next;
        node previous;
        public node(Warrior warrior) {
            this.data = warrior;
            this.next = null;
            this.previous = previous;
        }
    }

    //adds new data to a list in a linked list and calls sort
    public void insert(Warrior warrior) {
        node temp = new node(warrior);
        if(first == null) {
            first = temp;
            last = temp;
        }else{
            last.next = temp;
            last = temp;
            sort();
        }
    }

    //sorts the list using the speeds of the warriors
    public void sort() {
        node current = first;
        node index = null;
        Warrior temp;
        //if the first is empty then it just returns
        if(first == null) {
            return;
        }else {
            //while current(first) isnt empty then the sort continues
            while(current != null) {
                index = current.next;
                while(index != null) {
                    //compares speed of warriors
                    if(current.data.getSpeed() < index.data.getSpeed()) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                        assignmentCount++;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    //prints off sorted list
    public String toString() {
        node temp = first;
        String words = "";
        if(first == null) {
            return("List is empty");
        }
        while(temp != null) {
            words += (" " + temp.data);
            temp = temp.next;
        }
        return words;
    }
}
