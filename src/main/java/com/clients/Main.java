package main.java.com.clients;

import java.util.List;

/**
 * @author Sergey Klunniy
 */
public class Main {
    public static void main(String[] args) {
        ClientRepository cr = new ClientRepository();

//        Client c = new Client();
//        c.setName("Kirill");
//        c.setAge(20);
//        c.setPhone("(050)2223344");
//        cr.add(c);
//
//        Client client = new Client();
//        client.setAge(55);
//        client.setName("Artur");
//        client.setPhone("(050)1430721");
//        cr.add(client);




//        List<Client> clients = cr.getAll();
//
//        for (Client client:clients) {
//            System.out.println(client.getId() + " " + client.getName() + " "
//            + client.getAge() + " " + client.getPhone());
//        }




//        Client client = cr.getByID(3);
//        System.out.println(client.getId() + " " + client.getName() + " "
//                + client.getAge() + " " + client.getPhone());
//
//        cr.remove(client);
//
//        List<Client> clients = cr.getAll();
//        for (Client client2 : clients) {
//            System.out.println(client2.getId() + " " + client2.getName() + " "
//                    + client2.getAge() + " " + client2.getPhone());
//        }




//        Client client1 = cr.getByID(2);
//        client1.setPhone("(050)2223355");
//        cr.add(client1);
        List<Client> clients = cr.getAll();
        for (Client client2 : clients) {
            System.out.println(client2.getId() + " " + client2.getName() + " "
                    + client2.getAge() + " " + client2.getPhone());
        }


//        Client c = new Client();
//        c.setName("Kirill");
//        c.setAge(20);
//        c.setPhone("(050)2223344");
//        client.setPhone("(097)7776655");
//        client.setAge(client.getAge() + 1);
//        cr.add(client);
//
//        cr.remove(client);
//        client.setName("Petro");
//        client.setAge(75);
//        client.setPhone("+380503117088");
//        cr.add(client);

//        List<Client> clients = cr.getAll();
//        for (Client client : clients) {
//           System.out.println(client.getId() +  " " + client.getName() + " "
//                + client.getAge() + " " + client.getPhone());
//        }
    }
}
