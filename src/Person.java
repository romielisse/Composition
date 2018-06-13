public class Person {

    Education education;
    Job job;

    public Person(){

    }

    public Person(Education education, Job job) {
        this.education = education;
        this.job = job;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
}
