package labs_examples.input_output.labs.Exercise_04_candidates;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Candidates_parse {

    public static void main(String[] args) {

        ArrayList<Candidate> candidates = new ArrayList();

        String filePath = "C:/Users/John/Documents/CodingNomads/java_fundamentals/src/labs_examples/input_output/labs/Exercise_04_candidates/candidates.csv";

        try (
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))){

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] values = line.split(",");
                candidates.add(basicCandidatesInfo(values));
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
            for (Candidate candidate : candidates){
                System.out.println(candidate.toString());
            }
    }

    private static Candidate basicCandidatesInfo(String[] values) {
        Candidate candidate = new Candidate();

        candidate.setParty(values[0]);
        candidate.setName(values[1]);
        candidate.setLastName(values[2]);
        candidate.setYearOfBirth(Integer.parseInt(values[3]));
        candidate.setState(values[4]);

        return candidate;

    }
 }
