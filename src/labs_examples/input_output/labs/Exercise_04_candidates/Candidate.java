package labs_examples.input_output.labs.Exercise_04_candidates;

public class Candidate {

    public Candidate(String party, String name, String lastName, int yearOfBirth, String state) {
        this.party = party;
        this.name = name;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "party='" + party + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", state='" + state + '\'' +
                '}';
    }

    public Candidate() {

    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private String party;
    private String name;
    private String lastName;
    private int yearOfBirth;
    private String state;

}
