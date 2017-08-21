package ru.clinic;


/**
 * The vet has a skill level that
 * affects the speed of the treatment
 */
public class Veterinary extends People implements Runnable {
    /**
     * Skill level of veterinary
     */
    public static enum Skill {
        intern, doctor, director
    }

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
     * Method Healing
     */
    public void Healing() {
        String s = "";
        if (Main.orderVector.size() != 0) {
            Order healingOrder = Main.orderVector.get(0);
            Main.removeOrder();
            s = "Veterinarian cures " + healingOrder.getVisitor().getSurname() + "'s pet: " + healingOrder.getVisitor().getPet().getName();
            addString(s);
            int i = 0;
            switch (this.getSkill()) {
                case intern: {
                    i = 5000;
                    break;
                }
                case doctor: {
                    i = 5000;
                    break;
                }
                case director: {
                    i = 1000;
                    break;
                }
            }
            try {
                java.lang.Thread.sleep(i);
            } catch (InterruptedException e) {
            }
            healingOrder.getVisitor().getPet().setHealthy(true);
            s = healingOrder.getVisitor().getName() + "'s pet: " + healingOrder.getVisitor().getPet().getName() + " is healthy";
            addString(s);
            Healing();
        } else {
            try {
                java.lang.Thread.sleep(5000);
            } catch (InterruptedException e) {
            }
            Healing();
        }
    }


    /**
     * run method for Veterinary
     */
    @Override
    public void run() {
        Healing();

    }

    /**
     * This method print text with a border
     *
     * @param s text to print
     */
    private void addString(String s) {
        System.out.println(String.format("+%" + (s.length() + 2) + "s+", '-').replace(' ', '-'));
        System.out.println("| " + s + " |");
        System.out.println(String.format("+%" + (s.length() + 2) + "s+", '-').replace(' ', '-'));
        System.out.println();
        Main.orderMonitor(Main.orderVector);

    }

}
