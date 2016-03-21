package ua.kushnirenko.rest.entity;

public class User {

    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User() {
    }

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(String usrString) {
        if (!usrString.matches("^User\\{id=([0-9]*||null), name=[A-Za-z0-9]*}")) {
            throw new IllegalArgumentException("Input String doesn't math user format!");
        }
        int startIdx = usrString.indexOf("=");
        int endIdx = usrString.indexOf(",");
        String idString = usrString.substring(startIdx + 1, endIdx);

        if (idString.length() == 0 || idString.equals("null")) {
            this.id = null;
        } else {
            this.id = Integer.parseInt(idString);
        }

        startIdx = usrString.lastIndexOf("=");
        endIdx = usrString.lastIndexOf("}");

        String nameString = usrString.substring(startIdx + 1, endIdx);

        if (nameString.length() == 0 || nameString.equals("null")) {
            this.name = null;
        } else {
            this.name = nameString;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name=" + name + "}";
    }
}
