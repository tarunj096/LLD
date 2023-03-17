package accessModifierandConstructor;

public class Student {
        private String name;//null
        private int rno;//0
        private boolean pass;//false
        private double percentage;//0.0
        private  char grade;//

        public Student(){
                name ="s";
                rno = 1;
                pass = true;
                percentage = 36;
                grade = 'c';
        }
        public Student(String name,int rno,boolean pass, double percentage,char grade){
                this.name = name;
                this.rno = rno;
                this.pass = pass;
                this.percentage = percentage;
                this.grade = grade;
        }
        public String getName() {
                return name;
        }

        public int getRno() {
                return rno;
        }

        public void setRno(int rno) {
                this.rno = rno;
        }

        public boolean isPass() {
                return pass;
        }

        public void setPass(boolean pass) {
                this.pass = pass;
        }

        public double getPercentage() {
                return percentage;
        }

        public void setPercentage(double percentage) {
                this.percentage = percentage;
        }

        public char getGrade() {
                return grade;
        }

        public void setGrade(char grade) {
                this.grade = grade;
        }

        public void setName(String name) {
                if(name.equals("")){
                        System.out.println("Cannot update empty string");
                }else {
                        this.name = name;
                }
        }
}
