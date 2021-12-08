//Riley Dunn
//100760858
//Monday, November 15, 2021
//this code is meant to receive a tictactoe board and come up with every combination to finish it using recursion

public class TicTacToeTree {
    public static TicTacToeTreeNode createNode(String board, String player){
        TicTacToeTreeNode root = new TicTacToeTreeNode();
        root.board = board;
        leTree(root, player);
        return root;
    }

    public static void leTree(TicTacToeTreeNode root, String player){
        //checks if it is a leaf or no
        boolean var = false;
        int size = root.board.length();
        for (int x = 0; x < size; x++){
            if(root.board.charAt(x) == ' '){
                var = false;
            }
        }

        //finds possible boards to create
        if (!var){
            String boards[] = {};
            for (int x = 0; x < root.board.length(); x++){
                if(root.board.charAt(x) == ' '){
                    String temp[] = new String[boards.length + 1];
                    for (int y = 0; y < boards.length; y++){
                        temp[y] = boards[y];
                    }
                    temp[boards.length] = makeMove(root.board, x, player);
                    boards = temp;
                }
            }

            //recursively calls function to fill list
            for (int x = 0; x < boards.length; x++){
                TicTacToeTreeNode temp2 = new TicTacToeTreeNode();
                temp2.board = boards[x];
                root.children.add(temp2);
                //changes x or o for next turn
                String change;
                if (player == "x"){
                    change = "o";
                }else{
                    change = "x";
                }
                leTree(temp2,change);
            }
        }
    }

    public static String treeToString(TicTacToeTreeNode root){
        int size = root.board.length();
        int count = 0;
        for (int x = 0; x < size; x++){
            if(root.board.charAt(x) == ' '){
                count++;
            }
        }

        //find indent
        int indent = 0;
        if(count == 0){
            return nodeToString(root, 12) + System.lineSeparator();
        }else if(count == 1){
            indent = 8;
        }else if(count == 2){
            indent = 4;
        }else if(count == 3){
            indent = 0;
        }

        //recursively calls to create string
        String finalString = nodeToString(root, indent) + System.lineSeparator();
        int x = 0;
        int size2 = root.children.size();
        while(x < size2){
            finalString += treeToString(root.children.get(x));
            x++;
        }
        return finalString;
    }

    public static String nodeToString(TicTacToeTreeNode root, int indentation){
        //turns node to string
        String finalString = "";
        int x = 0;
        while(x < indentation){
            finalString = finalString + " ";
            x++;
        }
        finalString = finalString + "'" + root.board + "'";
        return finalString;
    }

    //yes
    public static String makeMove(String oldBoard, int position, String player) {
        return oldBoard.substring(0, position) + player + oldBoard.substring(position + 1);
    }
}