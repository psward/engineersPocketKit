import java.util.Arrays;

public class testingshitboi {
  public static void main(String[] args){
    double ax = 1;
    double ay = 6;
    double az = 3;

    double bx = 8;
    double by = 2;
    double bz = 7;

    double[] directionVector = {bx-ax, by-ay, bz-az};

    for(double t = 0; t <= 1; t+=0.1) {
      double lineEquation[] = {ax + directionVector[0] * t, ay + directionVector[1] * t, az + directionVector[2] * t};
      System.out.println(Arrays.toString(lineEquation));
    }
  }
}
