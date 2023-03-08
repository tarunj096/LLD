package accessModifierandConstructor;

public class Student {
        private String name;
        public int rno;

        public String getName() {
                return name;
        }

        public void setName(String name) {
                if(name.equals("")){
                        System.out.println("Cannot update empty string");
                }else {
                        this.name = name;
                }
        }
}
