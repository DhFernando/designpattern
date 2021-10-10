import java.util.HashMap;
import java.util.Random;

class Flywaight {

    private static String employeeType[] = { "Developer", "Tester" };
    private static String skills[] = { "JS", "Java", "HTML" };

    public static void main(String args[]) {
        for (int i = 0; i < 15; i++) {
            __Employee e = __EmployeeFactory.getEmployee(getRandomEmployeeType());
            e.assignSkill(getRandomSkill());
            e.task();
        }
    }

    public static String getRandomEmployeeType() {
        Random r = new Random();
        int randInt = r.nextInt(employeeType.length);
        return employeeType[randInt];
    }

    public static String getRandomSkill() {
        Random r = new Random();
        int randInt = r.nextInt(skills.length);
        return skills[randInt];
    }
}

interface __Employee {
    public void assignSkill(String skill);

    public void task();
}

class Developer implements __Employee {
    private final String JOB;
    private String skill;

    public Developer() {
        this.JOB = "Fix the bugs";
    }

    @Override
    public void assignSkill(String skill) {
        this.skill = skill;

    }

    @Override
    public void task() {
        System.out.println("Developer with skill: " + this.skill + ", and with Job : " + this.JOB);

    }

}

class Tester implements __Employee {
    private final String JOB;
    private String skill;

    public Tester() {
        this.JOB = "Test the issues";
    }

    @Override
    public void assignSkill(String skill) {
        this.skill = skill;

    }

    @Override
    public void task() {
        System.out.println("Tester with skill: " + this.skill + ", and with Job : " + this.JOB);

    }

}

class __EmployeeFactory {
    public static HashMap<String, __Employee> m = new HashMap<String, __Employee>();

    public static __Employee getEmployee(String type) {
        __Employee p = null;
        if (m.get(type) != null) {
            p = m.get(type);
        } else {
            if (type == "Developer") {
                System.out.println("Developer created");
                p = new Developer();
            } else if (type == "Tester") {
                System.out.println("Tester created");
                p = new Tester();
            } else {
                System.out.println("No such a kind of __Employee");
            }

            m.put(type, p);
        }
        return p;
    }
}
