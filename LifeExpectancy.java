import java.util.Scanner;

public class LifeExpectancy {

    public static Scanner numscan = new Scanner(System.in);
    public static Scanner wordscan = new Scanner(System.in);

    public static void main(String[] args) {
        int age;
        String province;
        
        System.out.println();
        System.out.println("DRIVING INSURANCE APPLICATION.");
        System.out.println();
        age = getAge();
        testAge(age);
        System.out.println();
        
        
        System.out.println("LIFE INSURANCE APPLICATION.");
        System.out.println();

        System.out.println("What province or territory are you from?");
        province = wordscan.nextLine();
        yearsLeft(age, province);
        System.out.println();

    }//end main

    public static int getAge() {
        System.out.println("What year were you born?");
        int year = numscan.nextInt();
        int age = 2020 - year;
        return age;
    }//end getAge

    public static void testAge(int age) {
        if (age < 16) {
            System.out.println("Driving Eligibility: Learners License Only");
            System.out.println("Voting Eligbility: No");
        } else if (age >= 18) {
            System.out.println("Driving Eligibility: Full License");
            System.out.println("Voting Eligbility: Yes");
        } else if (age >= 16 && age < 18) {
            System.out.println("Driving Eligibility: Graduated License");
            System.out.println("Voting Eligbility: No");
        }
    }//end testAge

    public static void yearsLeft(int age, String province) {
        if (province.equalsIgnoreCase("British Columbia") || province.equalsIgnoreCase("BC")) {
            int life = 82 - age;
            int year = 2020 + life;
            System.out.println("According to recent statistics, you will likely live for " + life + " more years, until the year " + year);
        } else if (province.equalsIgnoreCase("Alberta")) {
            int life = 82 - age;
            int year = 2020 + life;
            System.out.println("According to recent statistics, you will likely live for " + life + " more years, until the year " + year);
        } else if (province.equalsIgnoreCase("Manitoba")) {
            int life = 80 - age;
            int year = 2020 + life;
            System.out.println("According to recent statistics, you will likely live for " + life + " more years, until the year " + year);
        } else if (province.equalsIgnoreCase("Ontario")) {
            int life = 82 - age;
            int year = 2020 + life;
            System.out.println("According to recent statistics, you will likely live for " + life + " more years, until the year " + year);
        } else if (province.equalsIgnoreCase("Quebec")) {
            int life = 83 - age;
            int year = 2020 + life;
            System.out.println("According to recent statistics, you will likely live for " + life + " more years, until the year " + year);
        } else if (province.equalsIgnoreCase("Prince Edward Island") || province.equalsIgnoreCase("PEI")) {
            int life = 82 - age;
            int year = 2020 + life;
            System.out.println("According to recent statistics, you will likely live for " + life + " more years, until the year " + year);
        } else if (province.equalsIgnoreCase("New Brunswick")) {
            int life = 81 - age;
            int year = 2020 + life;
            System.out.println("According to recent statistics, you will likely live for " + life + " more years, until the year " + year);
        } else if (province.equalsIgnoreCase("Nova Scotia")) {
            int life = 81 - age;
            int year = 2020 + life;
            System.out.println("According to recent statistics, you will likely live for " + life + " more years, until the year " + year);
        } else if (province.equalsIgnoreCase("Saskatchewan")) {
            int life = 80 - age;
            int year = 2020 + life;
            System.out.println("According to recent statistics, you will likely live for " + life + " more years, until the year " + year);
        } else if (province.equalsIgnoreCase("Nunavut")) {
            int life = 72 - age;
            int year = 2020 + life;
            System.out.println("According to recent statistics, you will likely live for " + life + " more years, until the year " + year);
        } else if (province.equalsIgnoreCase("Newfoundland and Labrador") || province.equalsIgnoreCase("NL")) {
            int life = 80 - age;
            int year = 2020 + life;
            System.out.println("According to recent statistics, you will likely live for " + life + " more years, until the year " + year);   
        } else if (province.equalsIgnoreCase("Yukon")) {
            int life = 78 - age;
            int year = 2020 + life;
            System.out.println("According to recent statistics, you will likely live for " + life + " more years, until the year " + year);
        } else if (province.equalsIgnoreCase("Northwest Territories") || province.equalsIgnoreCase("NWT") || province.equalsIgnoreCase("NT")) {
            int life = 77 - age;
            int year = 2020 + life;
            System.out.println("According to recent statistics, you will likely live for " + life + " more years, until the year " + year);
        }
    }//end yearsLeft

}//end class
