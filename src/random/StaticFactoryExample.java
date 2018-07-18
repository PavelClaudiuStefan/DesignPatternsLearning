package random;

public class StaticFactoryExample {

    public static void main(String[] args) {
        BasicColor basicColorRed = new BasicColor(Integer.parseInt("ff0000", 16));
        System.out.println(basicColorRed);

        SFColor sfRed = SFColor.makeFromRGB("ff0000");
        System.out.println(sfRed);

        Color red = new RGBColor(255, 0, 0);
        System.out.println(red);
    }

}

// Basic - Overloading
// ********************************************** BEGIN 1
class BasicColor {
    private final int hex;

    BasicColor(String rgb) {
        this(Integer.parseInt(rgb, 16));
    }

    BasicColor(int red, int green, int blue) {
        this(red << 16 + green << 8 + blue);
    }

    BasicColor(int hex) {
        this.hex = hex;
    }

    @Override
    public String toString() {
        return "BasicColor{" +
                "hex=" + hex +
                '}';
    }
}
// ********************************************** END 1


// Static factory
// ********************************************** BEGIN 1
class SFColor {
    private final int hex;

    static SFColor makeFromRGB(String rgb) {
        return new SFColor(Integer.parseInt(rgb, 16));
    }

    static SFColor makeFromPallete(int red, int green, int blue) {
        return new SFColor(red << 16 + green << 8 + blue);
    }

    static SFColor makeFromHex(int hex) {
        return new SFColor(hex);
    }

    private SFColor(int hex) {
        this.hex = hex;
    }

    @Override
    public String toString() {
        return "StaticFactoryColor{" +
                "hex=" + hex +
                '}';
    }
}
// ********************************************** END 1


// Static factory alternative
// ********************************************** BEGIN 2
interface Color {}

class HexColor implements Color{
    private final int hex;

    HexColor(int hex) {
        this.hex = hex;
    }

    @Override
    public String toString() {
        return "Color{" +
                "hex=" + hex +
                '}';
    }
}

class RGBColor implements Color {
    private final Color origin;

    RGBColor(int red, int green, int blue) {
        this.origin = new HexColor(red << 16 + green << 8 + blue);
    }

    @Override
    public String toString() {
        return origin.toString();
    }
}
// ********************************************** END 2