package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.ArrayList;
import java.util.List;

public class Army {

    private List<MilitaryUnit> armyUnits = new ArrayList<>();

    public int getArmySize() {
        return armyUnits.size();
    }

    public void addUnit(MilitaryUnit militaryUnit) {
        armyUnits.add(militaryUnit);
    }

    public int getArmyDamage() {
        int damage = 0;
        for (MilitaryUnit armyUnit : armyUnits) {
            damage += armyUnit.doDamage();
        }
        return damage;
    }

    public void damageAll(int damage) {
        List<MilitaryUnit> criticallyDamaged = new ArrayList<>();
        for (MilitaryUnit armyUnit : armyUnits) {
            armyUnit.sufferDamage(damage);
            if (armyUnit.getHitPoints() < 25){
                criticallyDamaged.add(armyUnit);
            }
        }
        armyUnits.removeAll(criticallyDamaged);
    }
}
