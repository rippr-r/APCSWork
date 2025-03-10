public class SwimEvent {
    private String event_name;
    private int event_yards;
    private int yards_swam;

    public SwimEvent(){
        event_name = "Freestyle";
        event_yards = 50;
        yards_swam = 0;
    }

    public SwimEvent(String a, int b){
        event_name = a;
        event_yards = b;
        yards_swam = 0;
    }

    public void change_name(String name){
        event_name = name;
    }

    public String get_name(){
        return event_name;
    }
    
    public int get_event_yards(){
        return event_yards;
    }

    public int get_swam_yards(){
        return yards_swam;
    }

    public void swim(){
        if(yards_swam + 25 > event_yards){
            yards_swam = event_yards;
        }
        else{
            yards_swam += 25;
        }
    }

    public void swim(int a){
        if(yards_swam + a > event_yards){
            yards_swam = event_yards;
        }
        else{
            yards_swam += a;
        }
    }

    public boolean event_complete(){
        if(yards_swam == event_yards){
            return true;
        }
        return false;
    }
}   
