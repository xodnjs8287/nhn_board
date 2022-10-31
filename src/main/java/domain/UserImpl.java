package domain;

import lombok.Data;

@Data
public class UserImpl implements User{
    private String id;
    private String passward;
    private String name;

    private String profileFileName;

    public UserImpl(String id, String passward, String name, String img) {
        this.id = id;
        this.passward = passward;
        this.name = name;
        this.profileFileName = img;
    }

    @Override
    public String getId() {
        return id;
    }


    public String getPassward() {
        return passward;
    }

    @Override
    public String setPassward() {
        setPassward(getPassward());
        return getPassward();
    }

    public String getPassword() {
        return passward;
    }

    public void setPassword(String password) {
        this.passward = password;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getProfileFileName() {
        return null;
    }

    @Override
    public void setProfileFileName(String profileFileName) {
        
    }

//    public String getProfileFileName() {
//        return profileFileName;
//    }
//
//    @Override
//    public void setProfileFileName(String profileFileName) {
//        this.profileFileName = profileFileName;
//    }
}
