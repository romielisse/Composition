import java.util.ArrayList;

public class Education {

    ArrayList<String> schools;

    public Education(){

    }

    public ArrayList<String> getSchools() {
        return schools;
    }

    public void setSchools(ArrayList<String> schools) {
        this.schools = schools;
    }

    @Override
    public String toString() {
        String list = "";

        for(String school:schools){
            list += school + "\n";
        }

        return list;
    }
}
