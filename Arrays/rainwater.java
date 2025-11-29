package Arrays;

public class rainwater {
    public static void aux_arrays(int leftmax[], int rightmax[], int rain[]) {
        leftmax[0] = rain[0];
        for (int i = 1; i < rain.length; i++) {
            leftmax[i] = Math.max(rain[i], leftmax[i - 1]);
        }
        rightmax[rain.length - 1] = rain[rain.length - 1];
        for (int i = rain.length - 2; i >= 0; i--) {
            rightmax[i] = Math.max(rightmax[i + 1], rain[i]);
        }
    }

    public static int rainwater_stored(int rain[], int leftmax[], int rightmax[]) {
        int stored = 0;
        aux_arrays(leftmax, rightmax, rain);
        for (int i = 0; i < rightmax.length; i++) {
            int min = Math.min(leftmax[i], rightmax[i]);
            stored = stored + (min - rain[i]);
        }
        return stored;
    }

    public static void main(String[] args) {
        int rain[] = { 4, 2, 0, 6, 3, 2, 5 };
        int leftmax[] = new int[rain.length];
        int rightmax[] = new int[rain.length];
        System.out.println("The total stored squares of water :" + rainwater_stored(rain, leftmax, rightmax));
    }
}
