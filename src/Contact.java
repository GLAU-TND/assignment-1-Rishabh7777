import java.util.ArrayList;
import java.util.Arrays;

public class Contact {

    Node head;
    Main m = new Main();

    void add(Node data) {
        if (head == null) {
            head = data;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = data;
        }
    }

    String[] sort(ArrayList<String> arr) {
        int c = arr.size();
        String[] a = new String[c];
        for (int i = 0; i < arr.size(); i++) {
            a[i] = arr.get(i);
        }
        Arrays.sort(a);
        return a;

    }

    void view2(String[] a) {
        for (int i = 0; i < a.length; i++) {
            Node n = head;
            while (n != null) {
                if (n.data.getFirstName() == a[i]) {
                    System.out.println(i + 1 + ". " + n.data.getFirstName() + " " + n.data.getLastName());
                    ;
                }
                n = n.next;
            }
        }

    }

    void view(String[] a) {
        for (int i = 0; i < a.length; i++) {
            Node n = head;
            while (n != null) {
                if (n.data.getFirstName() == a[i]) {
                    print(n);
                }
                n = n.next;
            }
        }

    }

    void delete(String string) {
        Node n = head;
        Node previous = null;
        if (head.data.getFirstName() == string) {
            head = n.next;
            n = head;
        } else {
            while (n != null) {
                if (n.data.getFirstName() == string) {
                    previous.next = n.next;
                }
                previous = n;
                n = n.next;
            }
        }

    }

    void search(String a) {
        Node n = head;
        int c = 0;
        while (n != null) {
            if (n.data.getFirstName().equals(a)) {
                c++;
            }
            n = n.next;
        }
        if (c == 0)
            System.out.println("No match found!");
        else if (c == 1)
            System.out.println("1 match found!");
        else
            System.out.println(c + " matches found!");

        Node n1 = head;

        while (n1 != null) {

            if (n1.data.getFirstName().equals(a)) {
                print(n1);
                n1 = n1.next;
            } else {
                n1 = n1.next;
            }
        }
    }

    void print(Node n) {

        System.out.println("-------- * -------- * -------- * --------");

        String[] s = n.data.getA().split(",");

        if (s.length > 1) {

            System.out.println("First name: " + n.data.getFirstName() + " \nLast name: " + n.data.getLastName() + " \nContact number(s): "

                    + n.data.getA() + "\nEmail address: " + n.data.getEmail());

            System.out.println("-------- * -------- * -------- * --------");

        } else {
            System.out.println("First name: " + n.data.getFirstName() + " \nLast name: " + n.data.getLastName() + " \nContact number: "

                    + n.data.getA() + "\nEmail address: " + n.data.getEmail());
            System.out.println("-------- * -------- * -------- * --------");
        }

    }

}