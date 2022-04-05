package com.company.creature.skill.modifier;

import com.company.creature.Creature;
import com.company.creature.skill.Skill;
import com.company.creature.stat.Properties;

public class DecreaseDamage extends Skill {
    public DecreaseDamage(String name) {
        super("Decrease Damage", 20);
    }

    @Override
    public void useSkill(Creature creature, Creature target) {
        super.useSkill(creature, target);

        target.getDamage().subValue(Properties.MAX_VALUE, 20);
    }
}
