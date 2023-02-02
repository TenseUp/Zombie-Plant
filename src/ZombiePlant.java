import org.junit.Test;
public class ZombiePlant {
    private int potency, treatments;

    public ZombiePlant(int p, int t){
        this.potency = p;
        this.treatments = t;
    }
    public int treatmentsNeeded(){
        return treatments;
    }
    public boolean isDangerous(){
        if(treatments <= 1){
            return false;
        }
        else{
            return true;
        }
    }

    public void treat(int c){
        if (c > potency) {
            treatments++;
            return;
        } else if ((treatments == 0) || (c <= 0)){
            return;
        }
        treatments--;



    }

    public int getPotencyRequired() {
        return potency;
    }
}
