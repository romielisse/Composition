import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Education edu = new Education();
        Job job = new Job();
        Person person = new Person(edu, job);

        ArrayList<String> schools = new ArrayList<>();
        ArrayList<String> jobs = new ArrayList<>();

        populateLists(schools, jobs);

        person.education.setSchools(schools);
        person.job.setJobs(jobs);

        // Print out list of schools attended and jobs held for a person object
        System.out.println("SCHOOLS ATTENDED\n" + person.education.toString() + "\n");
        System.out.println("JOBS HELD\n" + person.job.toString());
    }

    protected static void populateLists(ArrayList<String> schools, ArrayList<String> jobs) {
        schools.add("Academy of Art University");
        schools.add("Adams State University");
        schools.add("Adler Graduate School");
        schools.add("Alaska Pacific University");
        schools.add("American University");
        schools.add("Auburn University");
        schools.add("Bellarmine University");
        schools.add("Bellin College");
        schools.add("Belmont University");
        schools.add("Blackburn College");

        jobs.add("Business Analyst");
        jobs.add("Junior Developer");
        jobs.add("Project Manager");
    }
}
