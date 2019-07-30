package triangles;

public class TrianglesSorter {
    private StringBuilder sortedListOfTriangles = new StringBuilder("");

    public TrianglesSorter() {
        sortedListOfTriangles.append("============= Triangles list: ===============\n");
    }

    public String getSortedListOfTriangles() {
        return sortedListOfTriangles.toString();
    }

    public void sortTriangles(ShapesFactory tf) {
        if(tf.getTriangles().size() == 0) {
            sortedListOfTriangles.append("No valid triangles\n");
        } else {
            tf.sort();
            for(Shape t : tf.getTriangles()) {
                sortedListOfTriangles.append(t.toString().concat("\n"));
            }
        }
    }


}
