// Lab 6
// Problem 8
// due 10/26 Thu

public class VectorUtil {
    static double dotProduct(double[] v1, double[] v2){
        double product[] = new double[3];
        for (int i = 0; i < 3; i++){
            product[i] = v1[i] * v2[i];
        }
        return product[0] + product[1] + product[2];
    }
}
