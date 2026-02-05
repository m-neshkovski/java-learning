public class Simple {

    private int arg;

    public Simple(int arg) {
        this.arg = arg;
    }

    public int getArg() {
        return arg;
    }

    public void setArg(int arg) {
        this.arg = arg;
    }

    @Override
    public String toString() {
        return super.toString() + " [ arg=" + arg + " ]";
    }
}
