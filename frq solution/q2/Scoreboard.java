public  class Scoreboard{
private String s1;
private String s2;
private int score1;
private int score2;
private boolean turn;
public Scoreboard(String team1, String team2){
s1=team1;
s2=team2;
score1=0;
score2=0;
turn=true;
}
public void recordPlay (int num){
if (num==0){
turn=!turn;
}else{
if(turn){
score1+=num;
}else{
score2+=num;
}
}
}
public String getScore(){
String hold=score1+"-"+score2+"-";
if (turn){
hold+=s1;
}else{
hold+=s2;
}
return hold;
}
}

