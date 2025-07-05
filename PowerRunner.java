class PowerRunner {
    public static void main(String[] args) {
        Power power = (x, y) -> {
            System.out.println(Math.pow(x, y));
        };
        power.power(2, 3);
    }
}
