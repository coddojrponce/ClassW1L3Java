
public class Joke {
    private String type;
    private String setup;
    private String punchline;

    // create a constructor that will take a String of type, a String of setup, and a String of punchline
    public Joke(String type,String setup,String punchline){
        this.type = type;
        this.setup = setup;
        this.punchline = punchline;
    }
    //create a getter for the setup
    public String getSetup(){
        return this.setup;
    }

   
    //create a getter for the punchline
    public String getPunch(){
        return this.punchline;
    }


    @Override
    public String toString() {
        return "Joke{" +
                "type='" + type + '\'' +
                ", setup='" + setup + '\'' +
                ", punchline='" + punchline + '\'' +
                '}';
    }
}