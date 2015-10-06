package assignment05;

public class Tester2{
	public static void main(String[] args){
		double[] lineArray = {1,1,0,0};
		Quadrilateral line = new Quadrilateral(lineArray);
		System.out.println(line.form());
		
		double[] triangleArray = {1,1,0,1};
		Quadrilateral triangle = new Quadrilateral(triangleArray);
		System.out.println(triangle.form());
		
		double[] squareArray = {0,1,0,1};
		Quadrilateral square = new Quadrilateral(squareArray);
		System.out.println(square.form());

		double[] rectangleArray = {0,4,0,4};
		Quadrilateral rectangle = new Quadrilateral(rectangleArray);
		System.out.println(rectangle.form());
		
		double[] triangleUpsideDownArray = {0,1,.5,.5};
		Quadrilateral triangleUpsideDown = new Quadrilateral(triangleUpsideDownArray);
		System.out.println(triangleUpsideDown.form());
		
		double[] rhombusArray = {.5,1.5,0,1};
		Quadrilateral rhombus = new Quadrilateral(rhombusArray);
		System.out.println(rhombus.form());
		
		double[] parallelogramArray = {.5,2.5,0,2};
		Quadrilateral parallelogram = new Quadrilateral(parallelogramArray);
		System.out.println(parallelogram.form());
		
		double[] symmetryTrapezoidArray = {.5,1,.25,1.25};
		Quadrilateral symmetryTrapezoid = new Quadrilateral(symmetryTrapezoidArray);
		System.out.println(symmetryTrapezoid.form());
		
		double[] trapezoidArray = {0.5,1.35,.15,1.65};
		Quadrilateral trapezoid = new Quadrilateral(trapezoidArray);
		System.out.println(trapezoid.form());
		
		double[] trapezoidUpsideDownArray = {0.15,1.65,.5,1.35};
		Quadrilateral trapezoidUpsideDown = new Quadrilateral(trapezoidUpsideDownArray);
		System.out.println(trapezoidUpsideDown.form());
	}
}