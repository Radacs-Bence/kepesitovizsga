package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class MilitaryUnit {

    protected int hitPoints;
    protected int attackPoints;
    protected boolean hasArmor;

    public int doDamage() {
        return attackPoints;
    }

    public void sufferDamage(int damage) {
        if (hasArmor){
            hitPoints -= damage/2;
        } else{
            hitPoints -= damage;
        }
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
