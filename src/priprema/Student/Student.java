package priprema.Student;

class Student {
    private final String name;
    private final String surname;
    private final int age;

    public Student(String name, String surname, int age) {
        super();
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    //bubble sort
    static void sortStudentsOnAge(Student[] students) {
        int n = students.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (students[j - 1].getAge() > students[j].getAge()) {
                    Student temp = students[j - 1];
                    students[j - 1] = students[j];
                    students[j] = temp;
                }
            }
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
}