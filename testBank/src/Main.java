import java.util.*;
public class Main {
    public static void main(String[] args) {
        Map<Account, Client> searchClient = new HashMap<>();
        Map<Client, List> searchAcc = new HashMap<>();
        Client client1 = new Client("Генадий", 16);
        Client client2 = new Client("Василий", 18);
        Client client3 = new Client("Блуд", 31);
        List<Integer> bankAccounts1 = new ArrayList<>();
        Collections.addAll(bankAccounts1, 1111,2222);
        Account account1 = new Account(bankAccounts1); // акк 1 клиента
        List<Integer> bankAccounts2 = new ArrayList<>();
        bankAccounts2.add(4444);
        Account account2 = new Account(bankAccounts2); // акк 2 клиента
        List<Integer> bankAccounts3 = new ArrayList<>();
        Collections.addAll(bankAccounts3, 5555,6666);
        Account account3 = new Account(bankAccounts3); // акк 3 клиента
        searchClient = Map.of(account1, client1, account2, client2, account3, client3);
        searchAcc = Map.of(client1, bankAccounts1, client2, bankAccounts2, client3, bankAccounts3);
        Search search = new Search();
        search.findClient(account3, searchClient); // Поиск по 3 аккаунту
        search.getAccounts(client3, searchAcc); // банковские счета 3 клиента
        search.findClient(account1, searchClient); // Поиск по 1 аккаунту
        search.getAccounts(client1, searchAcc); // банковские счета 1 клиента
        search.findClient(account2, searchClient); // Поиск по 2 аккаунту
        search.getAccounts(client2, searchAcc); // банковские счета 2 клиента
    }
    public static class Search {
        public void findClient(Account account, Map<Account, Client> searchClient)  {
            System.out.println(searchClient.get(account));
            System.out.println("");
        }
        public void getAccounts(Client client, Map<Client, List> searchAcc) {
            System.out.print("Счета клиента " + client.getName() + ": ");
            System.out.println(searchAcc.get(client));
            System.out.println("");
        }
    }
    public static class Client {
        private final String NAME;
        private final int AGE;


        public Client(String name, int age) {
            this.NAME = name;
            this.AGE = age;
        }
        public String getName() {
            return NAME;
        }


        @Override
        public String toString() {
            return "Имя клиента: " + NAME;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Client client = (Client) o;
            return AGE == client.AGE && Objects.equals(NAME, client.NAME);
        }

        @Override
        public int hashCode() {
            return Objects.hash(NAME, AGE);
        }

    }

    public static class Account {
        List<Integer> bankAccount = new ArrayList<>();
        private Client client;
        public Account(List<Integer> bankAccount) {
            this.bankAccount = bankAccount;
        }


        @Override
        public String toString() {
            return "" + bankAccount;
        }



    }


}