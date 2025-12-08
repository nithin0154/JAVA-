import java.util.*;

public class test {

    public static List<Integer> findAvailableRooms(
            int startTime,
            int endTime,
            int noOfRooms,
            List<List<Integer>> existingBookings) {
        ArrayList<Integer> avblRooms = new ArrayList<>();
        ArrayList<Integer> closedRooms = new ArrayList<>();
        

        for (List<Integer> list : existingBookings) {
            int currRoom = list.get(0);
            int curStartTime = list.get(1);
            int currEndTime = list.get(2);
            if((curStartTime>startTime && currEndTime>endTime) || curStartTime<startTime && currEndTime<endTime ){
                avblRooms.add(currRoom);
            }
            closedRooms.add(currRoom);
        }
        for (int i = 1; i < noOfRooms; i++) {
            if(!avblRooms.contains(i) && !closedRooms.contains(i)){
                avblRooms.add(i);
            }
        }

        return avblRooms;
    }

    public static void main(String[] args) {
        List<List<Integer>> existing = new ArrayList<>();
        existing.add(Arrays.asList(1, 2, 3));
        existing.add(Arrays.asList(2, 5, 6));
        existing.add(Arrays.asList(2, 7, 9));

        int start = 2;
        int end = 6;
        int rooms = 5;

        List<Integer> result = findAvailableRooms(start, end, rooms, existing);
        System.out.println("Available Rooms: " + result);
    }
}

