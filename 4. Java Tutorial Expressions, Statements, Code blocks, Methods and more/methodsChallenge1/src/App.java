public class App {
    public static void main(String[] args) throws Exception {
        String player= "hari";
        int position = 1;
        displayHighScorePosition(player, position);

        int scores[]=new int[]{1500,900,400,50};

        for(int i=0;i<scores.length;i++){
            System.out.println(scores[i]+" ==> "+calculateHighScorePosition(scores[i]));
        }
        

    }

    public static void displayHighScorePosition(String player , int position){
        System.out.println(player+" managed to get into position "+position+" on the highscore table");
    }

    public static int calculateHighScorePosition(int score){
        if(score>=1000)
            return 1;
        else if(score>=500)
            return 2;
        else if(score >=100)
            return 3;
        return 4 ;
    }
}
