package BankApp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BulkAccountCreator {

    public static List<String[]> csvReader(String file) {
        List<String[]> data = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                String[] arr = line.split(",");
                data.add(arr);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return data;
    }

    public static void bulkAccountCerator (String file){
        List<String[]> newAccounts = csvReader(file);
        for (String[] w: newAccounts){
            String name = w[0];
            String socialSecurityNumber = w[1];
            String accountType = w[2];
            int initBalance = Integer.parseInt(w[3]);
            if (accountType.equals("Savings")){
                new SavingsAccount(name, socialSecurityNumber, initBalance);
            }
            if (accountType.equals("Checking")){
                new CheckingAccount(name, socialSecurityNumber, initBalance);
            }
        }
    }


}
