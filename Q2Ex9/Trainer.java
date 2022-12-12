package exercise09muonlaxinamoniquejhoienyl;

import java.util.ArrayList;

public class Trainer extends Character{
    private Monster activeMonster;
    private ArrayList<Monster> team;
    
    public Trainer(String n){
        super(n);
        this.activeMonster = null;
        this.team = new ArrayList<>();
    }    
    public Monster getActiveMonster(){
        return activeMonster;
    }
    public ArrayList<Monster> getTeam(){
        return team;
    }

    public void capture(Monster m){
        if(m.getHP() < m.getMaxHP()*0.2){
            team.add(m);
            System.out.println(this.getName() + " caught " + m.getName() + ".");
        }
        else{
            System.out.println(this.getName() + " failed to catch " + m.getName() + ".");
        }
    }
    public void battle(Monster m){
        activeMonster.attack(m);
    }
    public void battle(Trainer t){
        activeMonster.attack(t.getActiveMonster());
    }
    
    public void sureCapture(Monster m) throws AlreadyCapturedException, FullTeamException{
        if(m!=null){
            if (team.contains(m)){
                throw new AlreadyCapturedException("Monster Already Captured");
            }
            if (team.size() == 6){
                throw new FullTeamException("Team Already Full");
            }
            team.add(m);
            System.out.printf("%s was successfully captured.%n", m.getName());
            /**for(Monster i : team){
                System.out.printf(i.getName() + ", ");
            }**/
            System.out.println();
        }
    }
    
    public void release(Monster m) throws NotInTeamException{
        boolean found = false;
        for(Monster i : team){
            if(i.equals(m)){
                found = true;
                team.remove(i);
                System.out.printf("%s was released from the team.%n", i.getName());
                break; 
            }            
        }
        if(found == false){
            throw new NotInTeamException("Monster not in team");
        }
    }
}