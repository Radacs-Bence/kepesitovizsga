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
        int damage = super.doDamage();
        if (numberOfAttacks == 0) {
            damage *= 3;
        }
        numberOfAttacks++;
        return damage;
    }

}
