import java.util.ArrayList;

public class Opgave4 {
    public class Player{
        String name;
        int skillLevel;

        public Player(String name, int skillLevel){
            this.name = name;
            this.skillLevel = skillLevel;
        }

        public String toString(){
            return this.name + " is at " + this.skillLevel + " skill level";
    }
    }

    public class Team{
        String teamName;
        ArrayList<Player> players;

        public Team(String teamName){
            this.teamName = teamName;
            this.players = new ArrayList<>();
        }

        public void addPlayer(Player p){
            players.add(p);
        }

        public int getAverageSkill(){
            int sum = 0;
            for(Player p : players){
                sum = sum + p.skillLevel;
            }
            return sum;
        }

        public void printTeam(){
            System.out.println(teamName);
            for(Player p : players){
                System.out.println("- " + p);
            }
        }

        public void compete(Team opponent){
            if(opponent.getAverageSkill() > this.getAverageSkill()){
                System.out.println("Winner is " + opponent.teamName + "!");
            } else {
                System.out.println("Winner is " + this.teamName + "!");
            }
        }

    }

    void main(){
        Team arsenal = new Team("Arsenal");
        Team tottenham = new Team("Tottenham");
        arsenal.addPlayer(new Player("Henry",1000));
        arsenal.addPlayer(new Player("yolsk",50000));
        arsenal.addPlayer(new Player("van p",100000));
        tottenham.addPlayer(new Player("jaja",500));
        tottenham.addPlayer(new Player("jojo",50000));
        tottenham.addPlayer(new Player("jepsikondi",100000));

        arsenal.printTeam();
        tottenham.printTeam();
        arsenal.compete(tottenham);



    }


}
