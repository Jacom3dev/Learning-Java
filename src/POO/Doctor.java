package POO;

public class Doctor {

    private int id;
    private String name;
    private String speciality;


    //getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    //constructor
    Doctor(int id,String name,String speciality){
        this.id = id;
        this.name = name;
        this.speciality = speciality;
    }



    public  void  showInfo(){
        System.out.println("id -> "+id);
        System.out.println("name -> "+name);
        System.out.println("speciality -> "+speciality);
    }
}
