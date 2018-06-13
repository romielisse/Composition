import java.util.ArrayList;

public class Job {

    ArrayList<String> jobs;

    public Job(){

    }

    public ArrayList<String> getJobs() {
        return jobs;
    }

    public void setJobs(ArrayList<String> jobs) {
        this.jobs = jobs;
    }

    @Override
    public String toString() {
        String list = "";

        for(String job:jobs){
            list += job + "\n";
        }

        return list;
    }
}
