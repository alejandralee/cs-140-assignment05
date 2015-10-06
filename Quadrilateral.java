package assignment05;

public class Quadrilateral {
	private double topLeft;
	private double topRight;
	private double bottomLeft;
	private double bottomRight;

	public Quadrilateral(double[] arr) {
		if(arr.length != 4) {
			throw new IllegalArgumentException("Must provide 4 values");
		}
		topLeft = Math.min(arr[0], arr[1]);
		topRight = Math.max(arr[0], arr[1]);
		bottomLeft = Math.min(arr[2], arr[3]);
		bottomRight = Math.max(arr[2], arr[3]);
		}
		
	public String form(){
		String shape = "shape";
		if(topLeft == topRight){
			if(bottomLeft==bottomRight){
				shape = "Line";
			}
			else{
				shape = "Triangle";
			}
		}
		else if(topLeft == bottomLeft){
			if(topRight-topLeft==bottomRight-bottomLeft){
				if(topRight-topLeft==1){
					shape = "Square";
				}
				else{
					shape = "Rectangle";
				}
			}
		}
		else if(bottomLeft == bottomRight){
			if(topLeft != topRight){
				shape = "Triangle";
			}
		}
		else if(topLeft>bottomLeft){
			if(topRight-topLeft==bottomRight-bottomLeft){
				if(topRight-topLeft==1){
					shape="Rhombus";
				}
				else{
					shape="Parallelogram";
				}
			}
			else{
				if(topRight<bottomRight){
					if(bottomRight-topRight==topLeft-bottomLeft){
						shape = "Symmetric Trapezoid";
					}
					else{
						shape = "Trapezoid";
					}
				}
			}

		}
		else if(bottomLeft>topLeft){
			if(topRight>bottomRight){
				if(bottomLeft-topLeft==topRight-bottomRight){
					shape = "Symmetric Trapezoid";
				}
				else{
					shape = "Trapezoid";
				}
			}
		}
		
		return shape;
	}
}