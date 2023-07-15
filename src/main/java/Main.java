import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException {
        String name = "";
        String sirname = "";
        String phoneNumber = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        name = reader.readLine();
        sirname = reader.readLine();
        phoneNumber = reader.readLine();
        System.out.printf("Пользователя зовут %s . Его фамилия - %s. Его номер телефона - %s", name,sirname,phoneNumber);
        reader.close();
    }
}
