class Main {
  public static void main(String[] args) {
    int [][] list={{12,30,40,25,5},{11,3,22,15,43},{7,2,9,4,0},{8,33,18,6,1}};
        GridPath g= new GridPath(list);
    System.out.println(g.sumPath(1,1));
   
  }
}
 
