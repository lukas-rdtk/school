public class Priority {

    int value;
    String name;

    public Priority(int value, String name) {
        if (value < 0) {
            this.value = 0;
        } else {
            this.value = value;
        }
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public void setValue(int value) {
        if (value < 0) {
            this.value = 0;
        } else {
            this.value = value;
        }
    }
}
