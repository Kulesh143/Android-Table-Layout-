package Moddle;

public class user_resycleView {
    private String id;
    private String name;
    private String mobile;
    private String gender;
    private String city;

    public user_resycleView(String id, String name, String mobile, String gender, String city) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.gender = gender;
        this.city = city;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
