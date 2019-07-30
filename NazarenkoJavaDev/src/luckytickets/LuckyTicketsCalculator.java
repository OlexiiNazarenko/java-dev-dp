package luckytickets;

public class LuckyTicketsCalculator {
    private int startNumber;
    private int endNumber;
    private int numberByMoscowMethod;
    private int numberByPiterMethod;
    private int numberByDniproMethod;

    public LuckyTicketsCalculator(int startNumber, int endNumber) {
        this.startNumber = startNumber;
        this.endNumber = endNumber;
    }

    public int getNumberByMoscowMethod() {
        return numberByMoscowMethod;
    }

    public int getNumberByPiterMethod() {
        return numberByPiterMethod;
    }

    public int getNumberByDniproMethod() {
        return numberByDniproMethod;
    }

    @Override
    public String toString() {
        return "LuckyTicketsCalculator{" +
                "\n StartNumber=" + startNumber +
                ",\n EndNumber=" + endNumber +
                ",\n Number Of Lucky Tickets By Moscow Method = " + numberByMoscowMethod +
                ",\n Number Of Lucky Ticket By Piter Method = " + numberByPiterMethod +
                ",\n Number Of Lucky Ticket By Dnipro Method = " + numberByDniproMethod +
                "\n}";
    }

    public void calculate(){
        for(int i = startNumber; i <= endNumber; ++i) {
            int[] number = parseNumber(i);
            if(compareMoscow(number)) {
                ++numberByMoscowMethod;
            } else if(comparePiter(number)) {
                ++numberByPiterMethod;
            } else if(compareDnipro(number)) {
                ++numberByDniproMethod;
            }
        }
    }

    private boolean compareMoscow(int[] number) {
        int sumLeft = 0;
        int sumRight = 0;

        for(int i = 0; i < 3; ++i) {
            sumLeft += number[i];
        }
        for(int j = 3; j < 6; ++j) {
            sumRight += number[j];
        }

        return sumLeft == sumRight;
    }

    private boolean comparePiter(int[] number) {
        int sumEvenPositions = 0;
        int sumOddPositions = 0;

        for(int i = 0; i < 6; ++i) {
            if((i % 2) == 0) {
                sumEvenPositions += number[i];
            } else {
                sumOddPositions += number[i];
            }
        }

        return sumEvenPositions == sumOddPositions;
    }

    private boolean compareDnipro(int[] number) {
        int sumEvenNumbers = 0;
        int sumOddNumbers = 0;

        for (int i = 0; i < 6; ++i) {
            if((number[i] % 2) == 0) {
                sumEvenNumbers += number[i];
            } else  {
                sumOddNumbers += number[i];
            }
        }

        return sumEvenNumbers == sumOddNumbers;
    }

    private int[] parseNumber(int number) {
        int[] res = new int[6];

        for(int i = 0; i < 6; ++i) {
            res[i] = number % 10;
            number = number / 10;
        }

        return res;
    }
}
