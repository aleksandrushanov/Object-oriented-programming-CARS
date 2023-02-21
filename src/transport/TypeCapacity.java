package transport;

public enum TypeCapacity {
    AVERAGE(40, 50),
    BIG(60, 80),
    ESPECIALLY_BIG(100, 120),
    ESPECIALLY_SMALL(10),
    MINI(25);

    private int mincapacity;
    private int maxcapacity;

    TypeCapacity(int mincapacity) {
        this.mincapacity = mincapacity;
    }

    TypeCapacity(int mincapacity, int maxcapacity) {
        this.mincapacity = mincapacity;
        this.maxcapacity = maxcapacity;
    }

    public int getMincapacity() {
        return mincapacity;
    }

    public int getMaxcapacity() {
        return maxcapacity;
    }

    @Override
    public String toString() {
        if (mincapacity <= 10) {
            return " Особо малая классификация ";
        } else if (mincapacity >= 11 && mincapacity <= 25) {
            return "Малая класификация ";
        } else {
            return "Вместимость:" + getMincapacity() + "-"+ getMaxcapacity() + " мест";
        }
    }
}
