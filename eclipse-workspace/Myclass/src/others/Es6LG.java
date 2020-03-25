package others;

import java.util.Scanner;
public class Es6LG {
public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    Bank myBank = new Bank();

    	int scelta = 4;
    	int a = 0;
    	int lu = 0;
    	while( a == lu) {
    	try {
    	System.out.println("Buongiono, benvenuti in Bank");
        System.out.println();
        System.out.println("1) apri un conto bancario");
        System.out.println("2) fai un versamento");
        System.out.println("3) fai un prelievo");
        System.out.println("4) mostra informazioni account");
        System.out.println("5) mostra l'ultima transazione");
        System.out.println("6) esci");
        System.out.println();
        System.out.print("Inserisci una scelta [1-6]: ");
        scelta = Integer.parseInt(s.nextLine());
        switch (scelta) {
            case 1: System.out.println("Inserisci nome");
                    String nom = s.nextLine();
                    System.out.println("Inserisci il tuo credito");
                    double cre = Double.parseDouble(s.nextLine());
                    System.out.println("Account creato con numero identificativo: " + myBank.openNewAccount(nom, cre));
                    break;
            case 2: System.out.println("Inserisci numero account");
                    int ac = Integer.parseInt(s.nextLine());
                    System.out.println("Inserisci versamento");
                    double ve = Double.parseDouble(s.nextLine());
                    myBank.versamento(ac, ve);
                    break;
            case 3: System.out.println("inserisci account");
                    int account = Integer.parseInt(s.nextLine());
                    System.out.println("inserisci prelievo");
                    double pre = Double.parseDouble(s.nextLine());
                    myBank.prelievo(account, pre);
                    break;
            case 4: System.out.println("inserisci numero account");
                    int numacc = Integer.parseInt(s.nextLine());
                    myBank.printAccountInfo(numacc);
                    break;
           case 5:  System.out.println("inserisci numero account");
                    numacc = Integer.parseInt(s.nextLine());
                    myBank.printTransactionInfo(numacc);
                    break;
           case 6:  System.out.println("Operazione finita");
           			a=1;
           			break;
          default: System.out.println("Operazione non valida, riprovare.");

        }
    	
    } catch(NumberFormatException e) {
        System.out.println( "Non puoi usare caratteri" );
    }
    }
    s.close();
}
}
class Bank {
  BankAccount[] accounts;     
  int numOfAccounts;      

public Bank() {
    accounts = new BankAccount[100];
    numOfAccounts = 0;
    }


public int openNewAccount(String customerName, double openingBalance) {

    BankAccount bank = new BankAccount(customerName, openingBalance);
    accounts[numOfAccounts] = bank;
    numOfAccounts++;
    return bank.getAccountNum();
}

public void prelievo(int accountNum, double amount) {
    for (int i =0; i<numOfAccounts; i++) {
        if (accountNum == accounts[i].getAccountNum()  ) {
            accounts[i].prelevare(amount);
            //System.out.println("Importo prelevato con successo");
            return;
        }
    }
    System.out.println("Numero account non trovato.");
    }

public void versamento(int accountNum, double amount) {
    for (int i =0; i<numOfAccounts; i++) {
        if (accountNum == accounts[i].getAccountNum()  ) {
            accounts[i].versare(amount);
            //System.out.println("Importo versato con successo");
            return;
        }
    }
    System.out.println("Account non trovato.");
}

public void printAccountInfo(int accountNum) {
    for (int i =0; i<numOfAccounts; i++) {
                if (accountNum == accounts[i].getAccountNum()  ) {
                    System.out.println(accounts[i].getAccountInfo());
                    return;
                }
            }
    System.out.println("Account non trovato.");
}

public void printTransactionInfo(int accountNum) {
    for (int i =0; i<numOfAccounts; i++) {
                if (accountNum == accounts[i].getAccountNum()  ) {
                    System.out.println(accounts[i].getAccountInfo());
                    System.out.println("Last transaction: " + accounts[i].getTransactionInfo(accounts[i].getNumberOfTransactions()-1));
                    return;
                }
            }
    System.out.println("Account non trovato.");
}

public void printAccountInfo(int accountNum, int n) {
    for (int i =0; i<numOfAccounts; i++) {
                        if (accountNum == accounts[i].getAccountNum()  ) {
                            System.out.println(accounts[i].getAccountInfo());
                            System.out.println(accounts[i].getTransactionInfo(n));
                            return;
                        }
                    }
    System.out.println("Account non trovato.");
    }

}
class BankAccount{

       private int accountNum;
       private String customerName;
       private double balance;
       private double[] transactions;
       private String[] riepilogoTransazioni;
       private int numOfTransactions;
       private  static int noOfAccounts=0;

       public String getAccountInfo(){
           return "Account numbero: " + accountNum + "\nCliente Nome: " + customerName + "\nSaldo:" + balance +"\n";
       }

       public String getTransactionInfo(int n)
       {
            String transaction = riepilogoTransazioni[n];
            if (transaction == null) {
                return "Non esiste trasanzione con quel numero";
            }
            else {
                return transaction;
            }
        }

       public BankAccount(String nome, double saldo){
         customerName = nome;
         balance = saldo;
         noOfAccounts ++;
         accountNum = noOfAccounts;
         transactions = new double[100];
         riepilogoTransazioni = new String[100];
         transactions[0] = balance;
         riepilogoTransazioni[0] = "Saldo : euro " + Double.toString(balance) + " è stato depositato";
         numOfTransactions = 1;
       }

    public int getAccountNum(){
        return accountNum;
    }

    public int getNumberOfTransactions() {
        return numOfTransactions;
    }

    public void versare(double amount){

        if (amount<=0) {
            System.out.println("Importo deve essere positivo");
        } else {
            balance = balance + amount;
            transactions[numOfTransactions] = amount;
            riepilogoTransazioni[numOfTransactions] = "euro " + Double.toString(amount) + " sono stati versati.";
            numOfTransactions++;
        }
    }
    public void prelevare(double amount)
    {
        if (amount<=0){
             System.out.println("Importo deve essere positivo");
         }
        else
        {
            if (balance < amount) {
                System.out.println("Saldo insufficente");
            } else {
                balance = balance - amount;
                transactions[numOfTransactions] = amount;
                riepilogoTransazioni[numOfTransactions] = "euro " + Double.toString(amount) + " sono stati prelevati";
                numOfTransactions++;
            }
        }
    }

    }
