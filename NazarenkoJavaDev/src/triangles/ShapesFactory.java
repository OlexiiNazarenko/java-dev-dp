package triangles;

import java.util.ArrayList;

public class ShapesFactory {
    private ArrayList<Shape> triangles = new ArrayList<>();
    private String errorsMessage;

    public ShapesFactory() {}

    public ArrayList<Shape> getTriangles() {
        return triangles;
    }

    public String getErrorsMessage() {
        return errorsMessage;
    }

    public void parseInputParameters(String[] inputParameters) {
        for(int i = 0; i < inputParameters.length; ++i) {
            String validString = deleteSpacesAndTabs(inputParameters[i]);
            try {
                triangles.add(createTriangle(validString));
            } catch (NumberFormatException | InvalidSidesTriangleException e) {
                errorsMessage = errorsMessage.concat(inputParameters[i] + ": " + e.getMessage() + "\n");
            }
        }
    }

    public void sort() {
        triangles.sort(new ShapeAreaComparator());
    }

    private Triangle createTriangle(String s) throws NumberFormatException, InvalidSidesTriangleException {
        String[] params = s.split(",");

        String name = params[0];
        double sideA = Double.parseDouble(params[1]);
        double sideB = Double.parseDouble(params[2]);
        double sideC = Double.parseDouble(params[3]);

        if (checkTrianglesPossibility(sideA, sideB, sideC)){
            throw new InvalidSidesTriangleException("Triangle with these sides cannot exist");
        }
        return new Triangle(name, sideA, sideB, sideC);

    }

    private boolean checkTrianglesPossibility(double sideA, double sideB, double sideC) {
        return ((sideA + sideB <= sideC) || (sideA + sideC <= sideB) || (sideB + sideC <= sideA));
    }

    private String deleteSpacesAndTabs(String s) {
        s = s.replace("\t", "");
        s = s.replace(" ", "");
        return s;
    }

    //    public static String[] readArgs() throws Exception {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter triangle's parameters:");
//        String inputString = sc.nextLine();
//        String[] input = inputString.split(",");
//        if(input.length != 4) {
//            throw new Exception("Too many or too little arguments\n" + programDescription);
//        }
//        return input;
//    }

}
