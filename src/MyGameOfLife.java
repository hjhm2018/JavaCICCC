import java.util.*;
public class MyGameOfLife {
	
	//Created this following a tutorial and changed it to my away, adding methods, using
	// an ArrayList, etc.
	
	static ArrayList<int[]> arrs = new ArrayList<int[]>();
	static int cols= 10;
	static int rows = 10;
	
	static public ArrayList<int[]> currentGeneration() {
		
		Random rnd = new Random();
		
		for(int i = 0; i < rows; i++) {
		  arrs.add(new int[rows]);
		  for(int j = 0; j < cols; j++) {
		    arrs.get(i)[j] = (int) rnd.nextInt(2);
		  }
		}
		
		System.out.println("Current Grid:");
		
		for(int i = 0; i < arrs.size(); i++) {
			
			  for(int j = 0; j < arrs.get(i).length; j++) {
			    System.out.print(arrs.get(i)[j] + " ");
			  }
			  
			  System.out.println();
			  
		}
		
		
		return arrs;
	}
	
	static public void originalGeneration() {
		currentGeneration();
		
		System.out.println();
		
		System.out.println("Original Population:");
		for (int i = 0; i < rows; i++) 
        { 
            for (int j = 0; j < cols; j++) 
            { 
                if (arrs.get(i)[j] == 0) 
                    System.out.print("."); 
                else
                    System.out.print("*"); 
            } 
            System.out.println(); 
        } 
        System.out.println(); 
        nextGeneration(arrs, rows, cols); 
    
	}
	
	static public void nextGeneration(ArrayList<int[]> population, int rowsN, int colsN) {
		int[][] future = new int[rowsN][colsN]; 
		  
        // Loop through every cell 
        for (int l = 1; l < rowsN - 1; l++) 
        { 
            for (int m = 1; m < colsN - 1; m++) 
            { 
                // finding no Of Neighbors that are alive 
                int aliveNeighbours = 0; 
                for (int i = -1; i <= 1; i++) 
                    for (int j = -1; j <= 1; j++) 
                        aliveNeighbours += arrs.get(l + i)[m + j]; 
  
                // The cell needs to be subtracted from 
                // its neighbors as it was counted before 
                aliveNeighbours -= arrs.get(l)[m]; 
  
                // Implementing the Rules of Life 
  
                // Cell is lonely and dies 
                if ((arrs.get(l)[m] == 1) && (aliveNeighbours < 2)) 
                    future[l][m] = 0; 
  
                // Cell dies due to over population 
                else if ((arrs.get(l)[m] == 1) && (aliveNeighbours > 3)) 
                    future[l][m] = 0; 
  
                // A new cell is born 
                else if ((arrs.get(l)[m] == 0) && (aliveNeighbours == 3)) 
                    future[l][m] = 1; 
  
                // Remains the same 
                else
                    future[l][m] = arrs.get(l)[m]; 
            } 
        } 
  
        System.out.println("Next Generation:"); 
        for (int i = 0; i < rowsN; i++) 
        { 
            for (int j = 0; j < colsN; j++) 
            { 
                if (future[i][j] == 0) 
                    System.out.print("."); 
                else
                    System.out.print("*"); 
            } 
            System.out.println(); 
        } 

	}

	public static void main(String[] args) {
		originalGeneration();
	}

}
