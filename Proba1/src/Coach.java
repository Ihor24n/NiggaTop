import java.util.Scanner;
public class Coach {
    private String name;
    private int age;

    ////////////////////////////
    public Coach(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int experienceAge() {
        System.out.println("Введіть у скільки років тренер почав працювати :");
        Scanner scanner = new Scanner(System.in);
        int startAge = scanner.nextInt();
        if (startAge > age) {
            System.out.println("Тренер не міг почати тренувати пізніше свого віку");
        } else if (startAge < 18) {
            System.out.println("Він не міг працювати швидше 18 років, будь-ласка введіть справжній вік роботи");
        } else {
            int experience = age - startAge;
            System.out.println("Coash's experience :" + experience);
            return experience;
        }
        return startAge;
    }
    public void numberOfYearsUntilRetirement () {
            System.out.println("Years left until retirement : " + (65 - age));
            if (age >= 65) {
                System.out.println("The coach is already retired and you can't work, create a new coach ");
            }
        }
        public void displayCoachInfo ( double height, double weight){
            System.out.println("Coach's height : " + height);
            System.out.println("Weight : " + weight);
            System.out.println("Age :" + age);
            System.out.println();
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}