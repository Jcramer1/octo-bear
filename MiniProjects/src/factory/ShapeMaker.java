package factory;

public class ShapeMaker {

	public Shape getShape(String shapeType)
	{
		if (shapeType == null)
		{
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE"))
		{
			return new Circle();
		}
		else if (shapeType.equalsIgnoreCase("Square"))
		{
			return new Square();
		}
		return null;
	}
	
}
