package transport;

public enum LoadCapacity {
    N1(0F,3.5F),
    N2(3.5F,12.0F),
    N3(12.0F,0F);

    private Float lowerBound;
    private Float upperBound;

    LoadCapacity(Float lowerBound, Float upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }
    public float getLowerBound() {
        return lowerBound;
    }
    public float getUpperBound() {
        return upperBound;
    }

    @Override
    public String toString() {
        if (lowerBound == null) {
            return "Грузоподъемность до: " + upperBound + " тонн.";
        } else if (upperBound == null) {
            return "Грузоподъемность от: " + lowerBound + " тонн.";
        } else {
            return "Грузоподъемность от: " + lowerBound + " тонн, до " + upperBound + " тонн";
        }

    }
}
