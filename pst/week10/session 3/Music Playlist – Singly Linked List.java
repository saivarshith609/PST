class Node {
    String song;
    Node next;

    Node(String song) {
        this.song = song;
        this.next = null;
    }
}

class Playlist {
    Node head;

    void addSong(String song) {
        Node newNode = new Node(song);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    void removeSong(String song) {
        if (head == null)
            return;

        if (head.song.equals(song)) {
            head = head.next;
            return;
        }

        Node temp = head;

        while (temp.next != null &&
               !temp.next.song.equals(song)) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    void displayPlaylist() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.song + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }
}

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        playlist.addSong("ShapeOfYou");
        playlist.addSong("Believer");
        playlist.addSong("Perfect");

        System.out.println("Playlist:");
        playlist.displayPlaylist();

        playlist.removeSong("Believer");

        System.out.println("After Removing Believer:");
        playlist.displayPlaylist();
    }
}