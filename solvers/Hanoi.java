import java.util.*;

public class Hanoi {

  static int MAX_DISKS = 5;
  static Tower[] towers = new Tower[MAX_DISKS];

  public static void main(String[] args) {
    System.out.println("Towers of Hanoi!");

    for (int i = 0; i < 3; i++)
      towers[i] = new Tower(i);
    for (int i = MAX_DISKS; i > 0; i--) {
      towers[0].add(i);
    }
    printAllTowers();
    towers[0].move(MAX_DISKS, towers[2], towers[1]);
  }

  public static class Tower {
    private Stack<Integer> disks;
    private int index;

    public Tower(int i) {
      disks = new Stack<Integer>();
      index = i;
    }

    public int getIndex() {
      return index;
    }

    public void add(int d) {
      if (!disks.isEmpty() && disks.peek() <= d) {
        System.out.println("Can't stack larger disks on top of smaller ones!");
      } else {
        disks.push(d);
      }
    }

    public void moveTopTo(Tower t) {
      int top = disks.pop();
      t.add(top);
      System.out.println("\nMoved disk " + top + " from " + getIndex() + " to " + t.getIndex());
      printAllTowers();
    }

    public void print() {
      System.out.println("Tower " + getIndex() + ":");
      for (int i = disks.size() - 1; i >= 0; i--) {
        System.out.print(" ");
        for (int j = 0; j < disks.size() - disks.get(i); j++)
          System.out.print(" ");
        for (int j = 0; j < disks.get(i); j++)
          System.out.print("oo");
        for (int j = 0; j < disks.size() - disks.get(i); j++)
          System.out.print(" ");
        System.out.print(" ");
        System.out.println();
      }
    }

    public void printLine(int l) {
      int n = 0;
      if (l < disks.size()) {
        n = disks.get(l);
      }
      System.out.print(" ");
      for (int i = 0; i < MAX_DISKS - n; i++)
        System.out.print(" ");
      for (int i = 0; i < n; i++)
        System.out.print("oo");
      for (int i = 0; i < MAX_DISKS - n; i++)
        System.out.print(" ");
      System.out.print(" ");
    }

    public void move(int n, Tower to, Tower buffer) {
      if (n > 0) {
        move(n - 1, buffer, to);
        moveTopTo(to);
        buffer.move(n - 1, to, this);
      }
    }
  }

  public static void printAllTowers() {
    for (int i = MAX_DISKS - 1; i >= 0; i--) {
      for (int j = 0; j < 3; j++) {
        towers[j].printLine(i);
      }
      System.out.println();
    }
  }
}
