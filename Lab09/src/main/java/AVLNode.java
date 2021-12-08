//Riley Dunn
//100760858
//Monday November 22 2021

public class AVLNode {
    public AVLNode left = null;
    public AVLNode right = null;
    public int value = 0;
    public AVLNode parent = null;
    public AVLNode root;

    public AVLNode insert(int newValue) {
        if (newValue == 6){

        }
        // perform binary-search style insertion
        if (newValue < this.value) {
            // insert the value to the left sub-tree
            if (this.left == null) {
                AVLNode newNode = new AVLNode();
                newNode.value = newValue;
                newNode.parent = this;
                this.left = newNode;
            } else {
                this.left.insert(newValue);
            }
        } else {
            // insert the value into the right sub-tree
            if (this.right == null) {
                AVLNode newNode = new AVLNode();
                newNode.value = newValue;
                newNode.parent = this;
                this.right = newNode;
            } else {
                this.right.insert(newValue);
            }
        }
        return rebalance();
    }

    public void isBalanced(){
        //check if parent and nodes are in balance
        //if they are then move on to next node, left or right
        boolean isBalance = false;
        if (right.value > parent.value && left.value < parent.value){
            isBalance = true;
            parent = left;
        }
    }

    public AVLNode rebalance() {
        //if the balance is off, find the highest val, lowest val, and middle val and set as right, left, and parent
        if (getBalance() <= -2 || getBalance() >= 2){
            //if the node has a right and a left then you can sort them
            if (right != null && left != null){
                System.out.println("Value of parent: " + parent);
                System.out.println("Value of right: " + right.value);
                System.out.println("Value of left: " + left.value);
                //find max, min
                //right node is max, left node is min, parent node is mid
                int max = Math.max(Math.max(right.value, left.value), parent.value);
                int min = Math.min(Math.min(right.value, left.value), parent.value);
                //find mid
                int mid;
                int a = right.value;
                int b = left.value;
                int c = parent.value;
                if ((a < b && b < c) || (c < b && b < a)) {
                    mid =  b;
                }else if ((b < a && a < c) || (c < a && a < b)) {
                    mid =  a;
                }else {
                    mid =  c;
                }
                right.value = max;
                left.value = min;
                parent.value = mid;

                //if either the right side or left side doesn't exist, make node then sort
            }else{
                if (right == null){
                    AVLNode right = new AVLNode();
                    right.value = 0;
                }else{
                    AVLNode left = new AVLNode();
                    left.value = 0;
                }
                //now that nodes are made, you can sort
                //find max, min
                //right node is max, left node is min, parent node is mid
                int max = Math.max(Math.max(right.value, left.value), parent.value);
                int min = Math.min(Math.min(right.value, left.value), parent.value);
                //find mid
                int mid;
                int a = right.value;
                int b = left.value;
                int c = parent.value;
                if ((a < b && b < c) || (c < b && b < a)) {
                    mid =  b;
                }else if ((b < a && a < c) || (c < a && a < b)) {
                    mid =  a;
                }else {
                    mid =  c;
                }
                right.value = max;
                left.value = min;
                parent.value = mid;
            }
        }else{
            return null;
        }
        //calls towards the unbalanced side by setting right or left to parent
        if (getBalance() <= -2){
            left = parent;
            rebalance();
        }else if (getBalance() >= 2){
            right = parent;
            rebalance();
        }
        return parent;
    }

    public int getBalance() {
        int rightHeight = 0;
        if (this.right != null) {
            rightHeight = this.right.getHeight();
        }

        int leftHeight = 0;
        if (this.left != null) {
            leftHeight = this.left.getHeight();
        }

        return rightHeight - leftHeight;
    }

    public int getHeight() {
        int leftHeight = 1;
        if (left != null) {
            leftHeight = left.getHeight() + 1;
        }

        int rightHeight = 0;
        if (right != null) {
            rightHeight = right.getHeight() + 1;
        }

        return (leftHeight > rightHeight) ? leftHeight : rightHeight;
    }

    public String nodeToString(int depth) {
        String result = "";

        if (this.right != null) {
            result += this.right.nodeToString(depth + 1);
        }

        for (int i = 0; i < depth; i++) {
            result += "\t";
        }
        result += this.value + "\n";

        if (this.left != null) {
            result += this.left.nodeToString(depth + 1);
        }

        return result;
    }
}
