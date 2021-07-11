package pl.garusm.covidapp.model;

public class LocationStats {

    private String country;
    private String state;
    private long latestTotalCases;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getLatestTotalCases() {
        return latestTotalCases;
    }

    public void setLatestTotalCases(long latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }

    @Override
    public String toString() {
        return "LocationStats: " +
                "country = " + country +
                ", state = " + state +
                ", latestTotalCases = " + latestTotalCases;
    }
}
