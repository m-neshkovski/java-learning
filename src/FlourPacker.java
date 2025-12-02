public class FlourPacker {

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 11));
        System.out.println(canPack(2, 0, 9));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        // bigCount = 5kg, smallCount = 1kg

        // Parameters must be positive
        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;
        // The total amount of flour must be less than or equal to the goal
        if (bigCount * 5 + smallCount < goal) return false;
        // Here we know we have enough flour to make the goal
        int bigNeeded = goal / 5;

        if(bigCount > 0 && bigCount >= bigNeeded) {
            goal -= bigNeeded * 5;
        } else if (bigCount > 0) {
            goal -= bigCount * 5;
        }

        return goal == 0 || (goal > 0 && goal <= smallCount);
    }
}
