public class RoomRunner {
    public static void main(String[] args) {
        Room room = name ->{ System.out.println(name + " entered the room.");};
        room.enter("Raju");
    }
}