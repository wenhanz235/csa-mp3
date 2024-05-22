public class GridPath
{
/** Initialized in the constructor with distinct values that never change */
private int[][] grid;
  public GridPath(int [][] list){
   grid = list;
  }
/**
* Returns the Location representing a neighbor of the grid element at row and col,
* as described in part (a)
* Preconditions: row is a valid row index and col is a valid column index in grid.
* row and col do not specify the element in the last row and last column of grid.
*/
public Location getNextLoc(int row, int col){
  if (row==grid.length-1){
    return new Location(row, col+1);
  }
  if (col==grid[0].length-1){
    return new Location(row+1,col);
  }
  int num1=grid[row+1][col];
  int num2=grid[row][col+1];
  if (num1<num2){
    return new Location(row+1,col);
  }
  return new Location(row,col+1);
  /* to be implemented in part (a) */ }
/**
* Computes and returns the sum of all values on a path through grid, as described in
* part (b)
* Preconditions: row is a valid row index and col is a valid column index in grid.
* row and col do not specify the element in the last row and last column of grid.
*/
public int sumPath(int row, int col){ 
  Location l= getNextLoc(row,col);
  int sum=grid[row][col];
  
  while((l.getRow()+1)*(l.getCol()+1) != grid.length * grid[0].length){
    sum+=grid[l.getRow()][l.getCol()];
    l=getNextLoc(l.getRow(),l.getCol());
  }
  sum+=grid[grid.length-1][grid[0].length-1];
  return sum;
  /* to be implemented in part (b) */ }
// There may be instance variables, constructors, and methods that are not shown.
}
