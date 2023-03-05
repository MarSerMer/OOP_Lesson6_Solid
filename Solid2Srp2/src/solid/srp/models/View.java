package solid.srp.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {

/*    public List<String> inputFromConsole(){
        List<String> orderDatas = new ArrayList<>();
        orderDatas.add(prompt("Client name: "));
        orderDatas.add(prompt("Product: "));
        orderDatas.add(prompt("Quantity: "));
        orderDatas.add(prompt("Price: "));
        return orderDatas;
    }*/
public Order inputOrderFromConsole(){
    String name = prompt("Client name: ");
    String product = prompt("Product: ");
    int qnt = Integer.parseInt(prompt("Quantity: "));
    int price = Integer.parseInt(prompt("Price: "));
    return new Order(name,product,qnt,price);
}
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
