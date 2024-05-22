public class Feeder{
  private int currentFood;
  public Feeder(int count){
    currentFood=count;
  }
  public void simulateOneDay(int numOfBirds){
    int choice=(int)(Math.random()*100)+1;
    if(choice>95){
      currentFood=0;
    }else{
      int gram=(int)(Math.random()*41)+10;
      if(currentFood<=gram*numOfBirds){
        currentFood=0;
      }else{
        currentFood-=gram*numOfBirds;
      }
    }
  }
  public int simulateManyDay(int numOfBird,int numOfDay){
    int count=0;
    if(currentFood==0){
      return 0;
    }
    for(int i=0;i<numOfDay;i++){
      simulateOneDay(numOfDay);
        if(currentFood>0){
          count++;
        }else{
          return count+1;
        }
    }
    return count;
  }
}
