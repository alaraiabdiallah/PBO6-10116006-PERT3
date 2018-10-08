package me.alarai;

public class User {

    private final static String username = "RizkiAdam";
    private final static String password = "terbaikselalu";

    private boolean statusAkun;

    private boolean cekAkun(String parUserName, String parPassword){
        return username.equals(parUserName) && password.equals(parPassword);
    }

    private void hasilLogin(Boolean status, String parUserName){
        if (status){
            System.out.println("****** HALLO "+parUserName.toUpperCase()+" ******");
            System.out.println("Selamat Datang di Aplikasi ini");
        }else{
            System.out.println("Ooops, Username atau Password anda salah");
        }
    }

    public void pengecheckkanLogin(String parUserName, String parPassword){
        this.statusAkun = cekAkun(parUserName,parPassword);
        this.hasilLogin(this.statusAkun,parUserName);
    }
}
