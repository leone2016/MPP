package lesson9.lecture.classPractice.enum_constant;

public enum DimensionConstants {
    //values length = 1.0, width = 2.0
    LENGTH(1.0), WIDTH(2.0);

    private double dimension;
    DimensionConstants(double value) {
        this.dimension = value;
    }

    public double getDimension() {
        return dimension;
    }
}


class Main {
    public static void main(String[] args) {
        DimensionConstants length = DimensionConstants.LENGTH;
        DimensionConstants width = DimensionConstants.WIDTH;

        System.out.println("Length: " + length.getDimension());
        System.out.println("Width: " + width.getDimension());

        // Demonstrating that enum constants are singletons
        System.out.println("Are LENGTH and WIDTH the same instance? " + (length == DimensionConstants.LENGTH));
    }
}

