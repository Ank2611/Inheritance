import com.sda.PersonalFacultate.*;
import org.junit.Test;

public class TestPersonalFacultate {
    Persoana pers = new Persoana("Ank","Craiova, Rovine", "0351 000 001","ank@email.com");
    Statut st = Statut.BOBOC;
    Student student = new Student("Ank","Craiova Rovine","0351 000 001","ank@email.com",st);
    MyDate d1 = new MyDate(10,12,2005);
    Angajat ang = new Angajat("Ank","Craiova, Rovine", "0351 000 001",
            "ank@email.com","DEp. Economic",45000.00,d1);
    MembruFacultate mf = new MembruFacultate("Ank","Craiova Rovine","0351 000 001",
            "ank@email.com","Economic",45000.00,d1,10,"lector");
    PersonalFacultate pf = new PersonalFacultate("Ank","Craiova, Rovine", "0351 000 001",
            "ank@email.com","DEp. Economic",45000.00,d1,"senior");
    @Test
    public void testPersonalFacultate() {

        System.out.println(pers.toString());
        System.out.println(student.toString());
        System.out.println(ang.toString());
        System.out.println(mf.toString());
        System.out.println(pf.toString());

    }
}
