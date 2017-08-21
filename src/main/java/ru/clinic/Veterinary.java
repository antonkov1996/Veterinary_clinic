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
    /**
     * variable with count of threads
     */
    private final static int threadCount = 3;
    private Skill skill;
    public static int countRunThreads = 0;

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

    public int getCountRunThreads() {
        return countRunThreads;
    }

    public void setCountRunThreads(int countRunThreads) {
        this.countRunThreads = countRunThreads;
    }

    /**
     * add method heal
     */
    public void Healing() {
        if (Main.orderVector.size() != 0) {
            Order healingOrder = Main.orderVector.get(0);
            Main.removeOrder();
            System.out.println("Order removed by " + this.getName() + " " + this.getSurname());
            try {
                java.lang.Thread.sleep(1000);
            }catch (InterruptedException e){}
            healingOrder.getVisitor().getPet().setHealthy(true);
            System.out.println(healingOrder.getVisitor().getName() + "'s pet: " + healingOrder.getVisitor().getPet().getName() + " is heality");
        }
    }


    /**
     * run method for Veterinary
     */
    @Override
    public void run() {
        setCountRunThreads(getCountRunThreads()+1);
        System.out.println("Count "+getCountRunThreads());
            if (checkRunning()) {

                while (Main.orderVector.size() != 0) {
                    Healing();
                }
            }


    }
    public synchronized boolean checkRunning() {
        if (countRunThreads != threadCount) {

            try {
                System.out.println("Stop");
                this.wait();

                return false;
            } catch (InterruptedException e) {
            }
        } else {
            notifyAll();
            System.out.println("Оповещены все");
            return true;
        }
        return false;
    }

}
