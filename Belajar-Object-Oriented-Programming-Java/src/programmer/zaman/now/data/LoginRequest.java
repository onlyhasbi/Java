package programmer.zaman.now.data;

public record LoginRequest(String username,String password) {
    public LoginRequest {
        System.out.println("Membuat objek LoginRequest");
    }

    public LoginRequest(String name){
        this(name,"");
    }

    public LoginRequest(){
        this("");
    }
}
