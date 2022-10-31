public enum Grad {
    Sarajevo("033"), Tuzla("032"), Zenica("034");
    private String s;

    Grad(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }
}
