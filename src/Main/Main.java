package Main;

import People.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Programmer man1 = new Programmer("Wolkow");
        Programmer man2 = new Programmer("Petrikow");
        Programmer man3 = new Programmer("Klichow");
        Cooker man4 = new Cooker("Piter");
        Cooker man5 = new Cooker("Loh");
        Cooker man6 = new Cooker("Klohow");
        Driver man7 = new Driver("Tylopir");
        Driver man8 = new Driver("Driverski");
        Driver man9 = new Driver("Polupski");

        ArrayList<Man> people = new ArrayList();
        people.add(man3);
        people.add(man1);
        people.add(man2);
        people.add(man4);
        people.add(man5);
        people.add(man6);
        people.add(man7);
        people.add(man8);
        people.add(man9);
        for (Man peopleVoice : people) {
            peopleVoice.voice();
        }

        ArrayList<Drive> peoplesDrive = new ArrayList<>();
        peoplesDrive.add(man7);
        peoplesDrive.add(man8);
        peoplesDrive.add(man9);
        for (Drive peopleDrive : peoplesDrive) {
            peopleDrive.drive();
        }
        ArrayList<CanProgramming> peoplesProgram = new ArrayList<>();
        peoplesProgram.add(man1);
        peoplesProgram.add(man2);
        peoplesProgram.add(man3);

        for (CanProgramming peopleProg : peoplesProgram) {
            peopleProg.programming();
        }
        ArrayList<Coocking> peoplesCoocking = new ArrayList();
        peoplesCoocking.add(man4);
        peoplesCoocking.add(man5);
        peoplesCoocking.add(man6);
        for (Coocking peopleCook : peoplesCoocking) {
            peopleCook.cook();
        }


    }
}
