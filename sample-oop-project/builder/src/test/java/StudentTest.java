import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {
    @Test
    void test1() {
        String name = "Adam", surname = "Kowalski", pesel="597485479";
        int age = 23;
        Student student1 = Student.builder()
                .name(name)
                .surname(surname)
                .pesel(pesel)
                .age(age)
                .build();

        assertEquals(name, student1.getName());
        assertEquals(surname, student1.getSurname());
        assertEquals(pesel, student1.getPesel());
        assertEquals(age, student1.getAge());
    }
}