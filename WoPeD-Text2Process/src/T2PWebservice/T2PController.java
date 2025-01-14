package T2PWebservice;

import TextToWorldModel.WorldModelBuilder;
import WorldModelToPetrinet.PetrinetBuilder;
import WorldModelToPetrinet.PetrinetGenerationException;
import worldModel.WorldModel;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T2PController extends Thread {


    public static final int MAX_INPUT_LENGTH=15000;//Reject any Request larger than this
    private String text;
    private String PNML;


    public T2PController( String text) throws InvalidInputException {
        checkInputValidity(text);

        this.text=text;
    }

    public void resetNLPTools(){
        WorldModelBuilder.resetNLPTools();
    }

    //Thread support only for Testing -> Servlet does the Job in Production
    public void run(){
        try {
            PNML= generatePetrinetFromText();
        } catch (PetrinetGenerationException e) {
            e.printStackTrace();
        }
    }

    public String getPNML() {
        return PNML;
    }

    public String getText() {
        return text;
    }

    public String generatePetrinetFromText() throws PetrinetGenerationException {
        WorldModelBuilder wmBuilder = new WorldModelBuilder(text);
        PetrinetBuilder pnBuilder = new PetrinetBuilder(wmBuilder.buildWorldModel(false));
        String PNML = pnBuilder.buildPNML();
        PNML=minifyResult(PNML);
        return PNML;
    }


    private String minifyResult(String result){
        //A few characters less to bother the internet with  ¯\_(ツ)_/¯
        result=result.replaceAll("\n","");
        result=result.replaceAll("\t","");
        while (result.contains("  ")){
            result=result.replace("  "," ");
        }
        return result;
    }

    private void checkInputValidity(String text) throws InvalidInputException {
        if(text.length()>MAX_INPUT_LENGTH | text.equals(""))
            throw new InvalidInputException("The input is too long.");

        //Accept only charcaters common in a plain text in english language
        Pattern p = Pattern.compile("[^a-z0-9,./?:!\\s\\t\\n£$%&*()_\\-`]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(text);
        int count = 0;
        String message="";
        while (m.find()) {
            count = count+1;
            message+="position "  + m.start() + ": " + text.charAt(m.start())+"\n";
        }
        if(count>0){
            throw new InvalidInputException("There are " + count + " invalid characters in the input:\n"+message);
        }
    }

}
