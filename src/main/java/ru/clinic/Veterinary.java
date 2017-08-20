package ru.clinic;

/**
 * The veterinarian has a skill level that
 * affects the speed of the treatment
 */
public class Veterinary extends People implements Runnable {
    /**
     * Skill level of veterinary
     */
    public static enum Skill {
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
    public void Healing() {
        if (Main.orderVector.size() != 0) {
            Order healingOrder = Main.orderVector.get(0);
            Main.orderVector.remove(0);
            System.out.println("Order removed");
            try {
                java.lang.Thread.sleep(3000);
            } catch (InterruptedException e) {
            }
            healingOrder.getVisitor().getPet().setHealthy(true);
        }
    }


    /**
     * run method for Veterinary
     */
    public void run() {
        Healing();
    }
}
