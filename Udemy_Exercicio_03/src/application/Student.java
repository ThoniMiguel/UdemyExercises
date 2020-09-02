package application;

public class Student {
    private String name;
    private double g1, g2, g3;
    private final double MIN = 60;
    private boolean right = true;

    public Student(String name, double g1, double g2, double g3) {
        if(g1 > 30 || g1 < 0){
            this.right = false;
            System.out.println("The first grade must not be greater than 30, or less than 0");
        }
        if(( g2 > 35 || g2 < 0)){
            this.right = false;
            System.out.println("The second grade must not be greater than 35, or less than 0");
        }
        if((g3 > 35 || g3 < 0)){
            this.right = false;
            System.out.println("The third grade must not be greater than 35, or less than 0");
        }
        else{
            this.name = name;
            this.g1 = g1;
            this.g2 = g2;
            this.g3 = g3;

            System.out.println(this.isPassed());
        }
    }

    //methods

    public String isPassed(){
        double finalGrade = this.g1 + this.g2 + this.g3;
        String strGrade = String.format("%.2f", finalGrade);
        if(finalGrade >= 60){
            return "FINAL GRADE = " + strGrade + "\nPASSED!";
        }else{
            double missing = finalGrade - MIN;
            missing *= -1;
            String strMissingPoints = String.format("%.2f", missing);
            return "FINAL GRADE = " + strGrade + "\nFAILED" + "\nMissing " + strMissingPoints;
        }
    }






    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getG1() {
        return g1;
    }

    public void setG1(double g1) {
        this.g1 = g1;
    }

    public double getG2() {
        return g2;
    }

    public void setG2(double g2) {
        this.g2 = g2;
    }

    public double getG3() {
        return g3;
    }

    public void setG3(double g3) {
        this.g3 = g3;
    }
}
