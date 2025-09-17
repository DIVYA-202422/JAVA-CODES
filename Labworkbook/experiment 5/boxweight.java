import java.util.Scanner;
class Box {
    float width, height, depth;

    Box() {
        width = height = depth = 0;
    }

    Box(float w, float h, float d) {
        width = w;
        height = h;
        depth = d;
    }

    Box(Box b) {
        this.width = b.width;
        this.height = b.height;
        this.depth = b.depth;
    }

    void setDimensions(float w, float h, float d) {
        width = w;
        height = h;
        depth = d;
    }

    void displayVolume() {
        System.out.println("Volume: " + (width * height * depth));
    }
}

class BoxWeight extends Box {
    float weight;

    BoxWeight() {
        super();
        weight = 0;
    }

    BoxWeight(float w, float h, float d, float wt) {
        super(w, h, d); 
        weight = wt;
    }

    BoxWeight(BoxWeight bw) {
        super(bw); 
        this.weight = bw.weight;
    }

    void setWeight(float wt) {
        weight = wt;
    }

    void displayWeight() {
        System.out.println("Weight: " + weight);
    }
}

class BoxWeightDemo {
    public static void main(String[] args) {
        BoxWeight bw1 = new BoxWeight();
        bw1.setDimensions(2, 3, 4);
        bw1.setWeight(5);
        bw1.displayVolume();
        bw1.displayWeight();

        BoxWeight bw2 = new BoxWeight(5, 6, 7, 10);
        bw2.displayVolume();
        bw2.displayWeight();

        BoxWeight bw3 = new BoxWeight(bw2);
        bw3.displayVolume();
        bw3.displayWeight();

        System.out.println("Divya:24csu357");
    }
}
