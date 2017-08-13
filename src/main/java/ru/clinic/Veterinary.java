package ru.clinic;

/**
 * The veterinarian has a skill level that
 * affects the speed of the treatment
 */
public class Veterinary extends People {
    /**
     * Skill level of veterinary
     */
    private static enum Skill {
        intern, doctor, director
    }

    ;
    private Skill skill;

    public Veterinary(String name, String surname, Skill skill) {
        super(name, surname);
        setSkill(skill);
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Skill getSkill() {
        return skill;
    }
    /**
     * add method heal
     */
}
