public class SecondTwoArrays {
    public static void main(String[] args) {
    
    int [][] a = 

        {
            {98, 78, 100},
            {87, 96, 95},
            {92, 80, 90}
        };

    int row = 0;
    int column = 2;

    int values = getTotal(a);
    double average = getAVG(a);
    int rowTotal = getRowTotal(a, row);
    int columnTotal = getColumnTotal(a, column);
    int highestInRow = getHighestInRow(a, row);
    int lowestInRow = getLowestInRow(a, row);

    System.out.println("Total value: " + values);
    System.out.println("Average: " + average);
    System.out.println("Total in the row: " + rowTotal);
    System.out.println("Total in the column: " + columnTotal);
    System.out.println("Highest in the row: " + highestInRow);
    System.out.println("Lowest in the row: " + lowestInRow);

 } 

    public static int getTotal(int [][] a){
    
        int totalValues = 0;

        for(int row = 0; row < a.length; row++){
    
            for(int col = 0; col < a[row].length; col++){
        
                totalValues += (a[row][col]);
        }
    }
        return totalValues; 
    }


    public static double getAVG (int [][] a){
    
    double AVG = getTotal(a);

    double count = a.length * a[0].length;
    
    return AVG / count;
    
    }


    public static int getRowTotal (int[][]a, int row){
    
    int rowTotal = 0;

    for(int column = 0; column < a[row].length; column++){
        
        rowTotal += a[row][column];

    }
    
    return rowTotal;
    
    }


    public static int getColumnTotal (int[][]a, int columns){
    
    int columnsTotal = 0;

    for(int row = 0; row < a.length; row++){
        
        columnsTotal += a[row][columns];

    }
    
    return columnsTotal;
    
    }


    public static int getHighestInRow(int [][] a, int row){
    
    int highestInRow = Integer.MIN_VALUE;

    for(int column = 0; column < a[row].length; column++){
    
        if(highestInRow < a[row][column]){
        
            highestInRow = a[row][column];
        
        }

    }

    return highestInRow;
    
    }

    public static int getLowestInRow(int [][] a, int row){
    
    int lowestInRow = Integer.MAX_VALUE;

    for(int column = 0; column < a[row].length; column++){
    
        if(lowestInRow > a[row][column]){
        
            lowestInRow = a[row][column];
        
        }

    }

    return lowestInRow;
    
    }

    

}