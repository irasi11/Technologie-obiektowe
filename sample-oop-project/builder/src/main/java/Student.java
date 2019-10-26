public class Student {
    private String name, surname, pesel;
    private int age;

    public Student(String name, String surname, String pesel, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.pesel = pesel;
    }

    public Student(){
        this.name = "";
        this.surname = "";
        this.age = 0;
        this.pesel = "";
    }

    public static StudentBuilder builder(){
        return new StudentBuilder();
    }

    static class StudentBuilder{
        private String name, surname, pesel;
        private int age;


        public StudentBuilder name(String name){
            this.name = name;
            return this;
        }
        public StudentBuilder surname(String surname){
            this.surname = surname;
            return this;
        }
        public StudentBuilder pesel(String pesel){
            this.pesel = pesel;
            return this;
        }
        public StudentBuilder age(int age){
            this.age = age;
            return this;
        }

        public Student build(){
            if (pesel.length() != 9)
                throw new IllegalArgumentException("Pesel must have 9 numebrs!");
            return new Student(name, surname, pesel, age);
        }
    }


    //Getters
    public String getPesel() {
        return pesel;
    }

    public int getAge() {
        return age;
    }

    public String getSurname() {
        return surname;
    }

    public String getName(){
        return name;
    }

}


