package problem1;

public class Dodecahedron {
		
		private static int nextID = 0;
		private int ID;
		private double edge = 1.0;
		
		public Dodecahedron() {
			this.ID = nextID;
			nextID++;
		}
		
		public Dodecahedron(double edge) {
			this();
			this.edge = edge;
		}
		
		public double getEdge() {
			return edge;
		}
		
		public void setEdge(double edge) {
			this.edge = edge;
		}
		
		public double getVolume() {
			double volume = ((15.0+(7.0*Math.sqrt(5.0)))/4)*Math.pow(edge, 3.0);
			return volume;
		}
		
		public double getSurfaceArea() {
			double surfaceArea = 3.0*(Math.sqrt(25.0+(10*Math.sqrt(5.0))))*Math.pow(edge, 2.0);
			return surfaceArea;
		}
		
		public double getHeight() {
			double height = edge*((Math.sqrt(5.0)+1)/2);
			return height;
		}
		
		public int getID() {
			return ID;
		}
	
}
