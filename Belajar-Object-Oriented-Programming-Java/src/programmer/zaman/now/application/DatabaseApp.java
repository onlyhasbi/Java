package programmer.zaman.now.application;

import programmer.zaman.now.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        databaseConnection("Hasbi",null);
        System.out.println("Sambungan ke database sukses");
    }

    public static void databaseConnection(String username,String password){
        if(username==null || password==null){
            throw new DatabaseError("Tidak bisa konek ke database");
        }
    }
}
