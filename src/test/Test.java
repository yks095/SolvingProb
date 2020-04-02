package test;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String S = "John Doe; Peter Benjamin Parker; Mary Jane Watson-Parker; John Elvis Doe; John Evan Doe; Jane Doe; Peter Brian Parker";
        String C = "Example";
        System.out.println(solution(S, C));

    }

    private static String solution(String S, String C) {

        String[] name = S.split("; ");
        String[][] splitedName = new String[name.length + 1][3];
        String[] email = new String[name.length + 1];
        String results = "";

        for(int i = 0; i < name.length; i++)    {
            splitedName[i] = name[i].split("\\s+");
//            System.out.println(Arrays.toString(splitedName[i]));
            if(splitedName[i].length == 3)   {
                email[i] = " <" + splitedName[i][2] + "_" + splitedName[i][0] + "@" + C + ".com>;";
                System.out.println(splitedName[i][2] + "1");
                System.out.println(splitedName[i][0] + "2");

            }
            else    {
                email[i] = " <" + splitedName[i][1] + "_" + splitedName[i][0] + "@" + C + ".com>;";
            }

            results = results + name[i] + email[i].toLowerCase().replaceAll("-", "");
        }


        return results;

    }
}