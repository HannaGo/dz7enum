
public enum Planets {
    MERCURY(0, 111111, 123000e6, null, "Venus"),
    VENUS(1, 222222, 234000e45, "Mercury", "Earth"),
    EARTH(2,333333,3458e7, "Venus", "Mars"),
    MARS(3,444444, 456001e4, "Earth", "Jupiter"),
    JUPITER(4,555555, 56778e9,"Mars", "Saturn"),
    SATURN(5,666666,1300e7, "jupiter", "Uranus"),
    URANUS(6,777777, 315545e45, "Saturn", "Neptune"),
    NEPTUNE(7,888888, 450001e2, "Uranus", null);


    private final Integer sequenceNumber;
    private final Integer distFromPrevPlanet;
    private final Double planetRadius;
    private final String prevPlanet;
    private final  String nextPlanet;
    private final Integer distSun;



    Planets(Integer sequenceNumber, Integer distFromPrevPlanet, Double planetRadius, String prevPlanet, String nextPlanet){



        this.sequenceNumber = sequenceNumber;
        this.distFromPrevPlanet = distFromPrevPlanet;
        this.planetRadius = planetRadius;

        this.nextPlanet = nextPlanet;
        this.prevPlanet = prevPlanet;

        if (sequenceNumber == 0) {
            this.distSun = distFromPrevPlanet;
        } else {
            this.distSun = values()[sequenceNumber - 1].distSun + distFromPrevPlanet;
        }
    }

    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    public Integer getDistFromPrevPlanet() {
        return distFromPrevPlanet;
    }

    public Double getPlanetRadius() {
        return planetRadius;
    }

    public String getPrevPlanet() {
        return prevPlanet;
    }

    public String getNextPlanet() {
        return nextPlanet;
    }

    public Integer getDistSun() {
        return distSun;
    }
}
