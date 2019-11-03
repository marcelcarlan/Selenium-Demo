package utilities;

public enum Urls {

    LINKEDIN_SIGN_UP("https://www.linkedin.com/signup/cold-join");

    private String value;

    Urls(String value){
        this.value=value;
    }

    public String getValue() {
        return value;
    }
}
