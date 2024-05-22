import java.util.*;
class Main {
  public static void main(String[] args) {
    ArrayList <String> list=new ArrayList<String>();
    list.add("an");
    list.add("band");
    list.add("band");
    list.add("abandon");
    WordChecker w= new WordChecker (list);
    System.out.println(w.isWordChain());
    System.out.println(w.createList("ba"));
  }
}

