//1.	An educational institution maintains a database of its employees. The database is divided into a number of classes whose hierarchical relationships are shown below. Write all the classes and define the methods to create the database and retrieve individual information as and when needed. Write a driver program to test the classes.
//Staff (code, name)
//Teacher (subject, publication) is a Staff
//Officer (grade) is a Staff
//Typist (speed) is a Staff
//RegularTypist (remuneration) is a Typist
//CasualTypist (daily wages) is a Typist.
//Name - Arju Mondal, Roll no- 39
class Staff {
    private String code;
    private String name;

    public Staff(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}

 class Teacher extends Staff {
    private String subject;
    private int publication;

    public Teacher(String code, String name, String subject, int publication) {
        super(code, name);
        this.subject = subject;
        this.publication = publication;
    }

    public String getSubject() {
        return subject;
    }

    public int getPublication() {
        return publication;
    }
}

 class Officer extends Staff {
    private String grade;

    public Officer(String code, String name, String grade) {
        super(code, name);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }
}

 class Typist extends Staff {
    private int speed;

    public Typist(String code, String name, int speed) {
        super(code, name);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}

 class RegularTypist extends Typist {
    private int remuneration;

    public RegularTypist(String code, String name, int speed, int remuneration) {
        super(code, name, speed);
        this.remuneration = remuneration;
    }

    public int getRemuneration() {
        return remuneration;
    }
}

 class CasualTypist extends Typist {
    private int dailyWages;

    public CasualTypist(String code, String name, int speed, int dailyWages) {
        super(code, name, speed);
        this.dailyWages = dailyWages;
    }

    public int getDailyWages() {
        return dailyWages;
    }
}

public class _4th_2as {
    public static void main(String[] args) {
        Teacher t = new Teacher("T001", "John Doe", "Mathematics", 5);
        Officer o = new Officer("O001", "Jane Doe", "Grade A");
        RegularTypist rt = new RegularTypist("RT001", "Jim Doe", 60, 25000);
        CasualTypist ct = new CasualTypist("CT001", "Joe Doe", 55, 500);
        System.out.println("Name - Arju Mondal, Roll no- 39");
        System.out.println("Teacher Info: ");
        System.out.println("Code: " + t.getCode());
        System.out.println("Name: " + t.getName());
        System.out.println("Subject: " + t.getSubject());
        System.out.println("Publications: " + t.getPublication());

        System.out.println("\nOfficer Info: ");
        System.out.println("Code: " + o.getCode());
        System.out.println("Name: " + o.getName());
        System.out.println("Grade: " + o.getGrade());

        System.out.println("\nRegular Typist Info: ");
        System.out.println("Code: " + rt.getCode());
        System.out.println("Name: " + rt.getName());
        System.out.println("Speed: " + rt.getSpeed());
        System.out.println("Remuneration: " + rt.getRemuneration());

        System.out.println("\nCasual Typist Info: ");
        System.out.println("Code: " + ct.getCode());
        System.out.println("Name: " + ct.getName());
        System.out.println("Speed: " + ct.getSpeed());
        System.out.println("Daily Wages: " + ct.getDailyWages());
    }
}