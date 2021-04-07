package xyz.andornot.records;

public record Range(int low, int high) {
    public static void main(String[] args) {
        var range = new Range(1, 2);
        System.out.println(range);

        // no getter setter
        System.out.printf("low %s high %s", range.low(), range.high());

        // range.high = 3; field is final
    }
}

