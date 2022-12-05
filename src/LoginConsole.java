import java.util.HashMap;
import java.util.Scanner;

public class LoginConsole {
    public String readUsername(){
        Scanner scan = new Scanner(System.in);
        String username = scan.nextLine();
        return username;
    }
    public String readPassword(){
        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();
        return password;
    }
    public boolean checkLogin(String user, String password) {
        HashMap<String, String> UsernamePassword = new HashMap<>();
        UsernamePassword.put("Andra", "abcd");
        UsernamePassword.put("Andrei", "1357");
        UsernamePassword.put("Bogdan", "1234");
        boolean corect = false;
        for (String i: UsernamePassword.keySet()) {
            for (String j : UsernamePassword.values()) {
                if (user.equals(i) && password.equals(j)) {
                    corect = true;
                    return corect;
                }
            }
        }
        return corect;
    }
}
