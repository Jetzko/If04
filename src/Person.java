public class Person {
    int age;
    public Person(){
        double randomAge = Math.floor(Math.random()*(80-5+1)+5);
        int myAge = (int) randomAge;
        this.age = myAge;
        System.out.println(this.age);
    }
    void getLifeStage(){
        if (age <= 12){
            System.out.println("Child");
        } else if (age >= 13 && age <= 19 ) {
            System.out.println("Teen");
        } else if (age >= 20 && age <= 59) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior Adult");
        }
    }
}
