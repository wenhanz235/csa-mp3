class Main {
  public static void main(String[] args) {
    Feeder f= new Feeder(100);
    f.simulateOneDay(10);
    System.out.println(f.simulateManyDays(10,5));
  }
}

