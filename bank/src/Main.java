import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Account, Client> searchClient = new HashMap<>();
        Client client1 = new Client("Генадий", 16);
        Client client2 = new Client("Василий", 18);
        Client client3 = new Client("Блуд", 31);
        Account account1 = new Account(1111);
        List<Account> bankAccounts1 = new ArrayList<>();
        bankAccounts1.add(account1);
        Account account2 = new Account(2222);
        List<Account> bankAccounts2 = new ArrayList<>();
        bankAccounts2.add(account2);
        Account account3 = new Account(3333);
        Account account4 = new Account(4444);
        List<Account> bankAccounts3 = new ArrayList<>();
        bankAccounts3.add(account3);
        bankAccounts3.add(account4);
        searchClient = Map.of(account1, client1, account2, client2, account3, client3, account4, client3);
        Search search = new Search();
        search.getClient(account4, searchClient);
        search.getAccount(client3, bankAccounts3);
    }
    public static class Search {
        public void getClient(Account account, Map<Account, Client> searchClient)  {
            System.out.println(searchClient.get(account));
        }
        public void getAccount(Client client, List<Account> accounts) {
            System.out.print("Счета клиента: ");
            for (Account account : accounts) {
                System.out.print(account + " ");
            }
        }
    }
    public static class Client {
        String name;
        int age;

        public Client(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Имя клиента: " + name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Client client = (Client) o;
            return age == client.age && Objects.equals(name, client.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
    }

    public static class Account {
        int bankAccount;

        public Account(int bankAccount) {
            this.bankAccount = bankAccount;
        }

        @Override
        public String toString() {
            return "" + bankAccount;
        }
    }
}