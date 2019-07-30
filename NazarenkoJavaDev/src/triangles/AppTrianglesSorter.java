package triangles;

import service.ConsoleWriter;

public class AppTrianglesSorter {
    public static void main(String[] args) {

        ParamsTriangles paramsTriangles = new ParamsTriangles();
        ConsoleWriter.printText(paramsTriangles.getProgramDescription());
        paramsTriangles.readParams();

        ShapesFactory shapesFactory = new ShapesFactory();
        shapesFactory.parseInputParameters(paramsTriangles.getParams());
        ConsoleWriter.printText(shapesFactory.getErrorsMessage());

        TrianglesSorter trianglesSorter = new TrianglesSorter();
        trianglesSorter.sortTriangles(shapesFactory);

        ConsoleWriter.printText(trianglesSorter.getSortedListOfTriangles());

    }
}
