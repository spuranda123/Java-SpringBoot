package helloWorld.models.Greeting;

public class GreetingUser {
    int id;

    String user;

    public GreetingUser(int id, String user){
        this.id = id;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public String getUser() {
        return user;
    }
}
