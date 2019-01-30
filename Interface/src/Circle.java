class Circle implements HasGetAreaMethod{
    private double r;
    Circle(double r){
        this.r = r;
    }

    public double getR(){
        return r;
    }

    public void setR(double r){
        this.r = r;
    }

    public double getArea(){
        return Math.PI*r*r;
    }
}