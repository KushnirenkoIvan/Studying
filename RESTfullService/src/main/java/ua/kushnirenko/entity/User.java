package ua.kushnirenko.entity;

public class User {

    private Integer id;

    private String name;

    private Integer age;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public User() {
    }

    public User(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    static void exchangeUsers(User a, User b) {
        int id = a.getId();
        a.setId(b.getId());
        b.setId(id);

        String name = a.getName();
        a.setName(b.getName());
        b.setName(name);

        Integer age = a.getAge();
        a.setAge(b.getAge());
        b.setAge(age);
    }

    public static void main(String[] args) {
        User a = new User(0, "A", 0);
        User b = new User(1, "B", 1);
        System.out.println("Before exchanging:\n" + "User A: " + a + "\n" + "User B: " + b);
        User.exchangeUsers(a, b);
        System.out.println("After exchanging:\n" + "User A: " + a + "\n" + "User B: " + b);

    }

}
