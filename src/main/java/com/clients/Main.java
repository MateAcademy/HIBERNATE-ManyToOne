package com.clients;

import java.util.List;

/**
 * @author Sergey Klunniy
 */
public class Main {
    public static void main(String[] args) {
        ClientRepository cr = new ClientRepository();

        Client client = cr.getByID(3);
//        System.out.println(client.getId() +  " " + client.getName() + " "
//                + client.getAge() + " " + client.getPhone());

        cr.remove(client);

//        List<Client> clients = cr.getAll();
//        for (Client client : clients) {
//           System.out.println(client.getId() +  " " + client.getName() + " "
//                + client.getAge() + " " + client.getPhone());
//        }

        Client client1 = cr.getByID(4);
        client.setPhone("(077)077-77-77");
        cr.add(client1);

    }
}
