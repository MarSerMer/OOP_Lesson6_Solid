package solid;

import solid.srp.models.Order;
import solid.srp.models.View;
import solid.srp.models.WriteToFileJSON;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        View v = new View();
        Order order = v.inputOrderFromConsole();
        WriteToFileJSON w = new WriteToFileJSON("order.json");
        w.saveToJson(order);
    }
}
