package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman extends MilitaryUnit {

    private boolean intactShield;

    public Swordsman(boolean armor) {
        this.hitPoints = 100;
        this.attackPoints = 10;
        this.hasArmor = armor;
        this.intactShield = true;
    }


    @Override
    public void sufferDamage(int damage) {
        if (!intactShield){
            super.sufferDamage(damage);
        }
        intactShield = false;
    }

}
