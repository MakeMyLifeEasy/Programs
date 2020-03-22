import java.util.Scanner;
public class Main { 
public static final int total_rows = 8; 
public static final int total_columns = 8; 
  
    static int possibleMoves(int x, int y) 
    { 
        //list all posible moves wrt the rows and columns taking knight position as 0
        int row[] = { 2, 1, -1, -2, -2, -1, 1, 2 }; 
        int column[] = { 1, 2, 2, 1, -1, -2, -2, -1 }; 
  
        int count = 0; 
  
        //calculate the number of moves 
        for (int i = 0; i < 8; i++) { 
  
            int next_row = x + row[i]; 
            int next_column = y + column[i]; 
  
            if (next_row >= 0 && next_column >= 0 && next_row < total_rows && next_column < total_columns) 
                count++; 
        } 
  
        // Number of moves
        return count; 
    } 
  
    public static void main(String[] args) 
    { 
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter knight row number:");
        int x = in.nextInt();
        System.out.println("Enter knight column number:");
        int y = in.nextInt();
        
        System.out.println(possibleMoves(x, y)); 
    } 
} 
