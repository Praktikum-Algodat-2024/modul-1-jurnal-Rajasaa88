class Node{
    String nama;
    String skill;
    int umur;
    String hobi;
    Node next;

    public Node(String nama, String skill, int  umur, String hobi){
        this.nama = nama;
        this.skill = skill;
        this.umur = umur;
        this.hobi = hobi;
    }
}

class Single {
    Node head;
  
    public Single() {
      this.head = null;
    }
  
    public void addFirst (String nama, String skill, int umur, String hobi) {
      Node newNode = new Node(nama, skill, umur, hobi);
      if (head == null) {
        head = newNode;
      } else {
        newNode.next = head;
        head = newNode;
      }
    }
  
    public void addLast (String nama, String skill, int umur, String hobi) {
      Node newNode = new Node(nama, skill, umur, hobi);
      if (head == null) {
        head = newNode;
      } else {
        Node temp = head;
        while (temp.next != null) {
          temp = temp.next;
        }
        temp.next = newNode;
      }
    }
  
    public void deleteFirst () {
      if (head == null) {
        System.out.println("list kosong");
      } else {
        head = head.next;
      }
    }
  
    public void deleteLast () {
      if (head == null) {
        System.out.println("list kosong");
      } else {
        Node temp = head;
        while (temp.next.next != null) {
          temp = temp.next;
        }
        temp.next = null;
      }
    }
  
    public void display () {
      Node temp = head;
        while (temp != null) {
          System.out.println("Nama  : " + temp.nama);
          System.out.println("Skill : " + temp.skill);
          System.out.println("Umur  : " + temp.umur);
          System.out.println("Hobi  : " + temp.hobi);
          System.out.println(" ");
          temp = temp.next;
        }
    }
  
  }
  
public class OrangUnik {
    public static void main(String[] args) {
        Single list = new Single();
        
        list.addLast("Vadel", "Dance Geter", 19, "Dance");
        list.addLast("Agus", "Agus Sakit", 35, "Donasi");
        list.addLast("Loli", "ATM Berjalan", 16, "Liat Vadel");
        list.addLast("Fufu Fafa", "Roasting", 30, "Buka Kaskus");

        System.out.println("\nSebelum add kak gem");
        list.display();
        list.addFirst("Kak Gem", "Kasi Faham", 32, "Bernafas");
        System.out.println("\nSetelah add kak gem");
        list.display();
        list.deleteLast();
        System.out.println("\nSetelah hapus fufufafa");
        list.display();
        list.deleteFirst();
        System.out.println("\nSetelah hapus kak gem / manusia yang tersisa");
        list.display();
    }
}