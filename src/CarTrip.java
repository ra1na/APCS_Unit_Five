public class CarTrip {
    int myStartOdometer;
    int myEndOdometer;
    double myTime;
    double myGallonsUsed;


    public CarTrip (int myStartOdometer, int myEndOdometer, double myTime, double myGallonsUsed) {
        this.myStartOdometer = myStartOdometer;
        this.myEndOdometer = myEndOdometer;
        this.myTime = myTime;
        this.myGallonsUsed = myGallonsUsed;
    }

    public int getMyStartOdometer () {
        return myStartOdometer;
    }

    public int getMyEndOdometer() {
        return myEndOdometer;
    }

    public double getMyTime() {
        return myTime;
    }

    public double getMyGallonsUsed() {
        return myGallonsUsed;
    }

    public void setMyStartOdometer (int myStartOdometer) {
        this.myStartOdometer = myStartOdometer;
    }

    public void setMyEndOdometer(int myEndOdometer) {
        this.myEndOdometer = myEndOdometer;
    }

    public void setMyTime(double myTime) {
        this.myTime = myTime;
    }

    public void setMyGallonsUsed(double myGallonsUsed) {
        this.myGallonsUsed = myGallonsUsed;
    }

    public int getTripDistance () {
        return myEndOdometer - myStartOdometer;
    }

    public double getAverageSpeed () {
        return getTripDistance()/myTime;
    }

    public double getGasMileage () {
        return getTripDistance()/myGallonsUsed;
    }

    public String getTotalGasPrice (double pricePerGallon) {
        int distanceTraveled = (int)(((myGallonsUsed * pricePerGallon) * 100) + 0.5);
        return "Distance traveled: " + distanceTraveled + " miles";
    }
}