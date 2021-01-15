public abstract class Abstract {

    String abs2;
    public Abstract(String abs2){
        this.abs2 = abs2;
    }

    public String getAbs1() {
        return abs2;
    }

    public void setAbs1(String abs2) {
        this.abs2 = abs2;
    }

    public abstract boolean isAbstract();


}
