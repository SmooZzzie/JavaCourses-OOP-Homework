package week2.interfaces.doctorInterfaces;

/**
 * Created by SmooZzzie on 22.04.2017.
 */
public class NeuroSurgeon implements Doctor{

    private String name;
    private int experienceAsNeuroSurgeon;

    public NeuroSurgeon(String name, int overallExperienceAsSurgeon) {
        this.name = name;
        this.experienceAsNeuroSurgeon = overallExperienceAsSurgeon;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void work() {
        experienceAsNeuroSurgeon++;
        System.out.println("I'm doing neurosurgery! My experience as neurosurgeon now: " +experienceAsNeuroSurgeon);
    }

}
