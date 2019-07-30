package fibonacci;

public class InputReader {

    public static int[] parseInput(String[] args) {
        int[] out = new int[2];

        out[0] = Integer.parseInt(args[0]);
        out[1] = Integer.parseInt(args[1]);

        return out;
    }
}
