package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit {

    private int numberOfAttacks;

    public HeavyCavalry() {
        this.hitPoints = 150;
        this.attackPoints = 20;
        this.hasArmor = true;
        this.numberOfAttacks = 0;
    }

    @Override
    public int doDamage() {
        int damage = 0;
        if (numberOfAttacks == 0) {
            damage = super.doDamage() * 3;
        } else {
            damage = super.doDamage();
        }
        numberOfAttacks++;
        return damage;
    }

}
