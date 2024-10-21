package cn.arorms.demo.entity;

/**
 * User
 * @version 0.1 2024-10-20
 * @author Holmes Amzish
 */
public class User {
    private int id;
    private String name;
    private String password;
    private int age;

    // Important data
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }


    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
