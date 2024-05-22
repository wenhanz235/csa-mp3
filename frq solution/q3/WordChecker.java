import java.util.*;
public class WordChecker{
  private ArrayList<String> wordlist;
  public WordChecker(ArrayList<String>list){
    wordlist=list;
    
  }
  public boolean isWordChain(){
    for(int i=1;i<wordlist.size();i++){
      if (wordlist.get(i).indexOf(wordlist.get(i-1))==-1){
        return false;
      }
    }
    return true;
    }
  public ArrayList<String> createList(String target){
    ArrayList<String> arr= new ArrayList<String>();
    for (String str: wordlist){
      if (str.indexOf(target)>=0){
        if (str.length()==target.length()){
          arr.add("");
        }else{
          arr.add(str.substring(target.length()));
        }
      }
    }
    return arr;
  }
  }

