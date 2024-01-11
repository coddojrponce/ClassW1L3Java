
import java.util.ArrayList;
import java.util.Random;
//We will use this to pause :D 
// for example TimeUnit.SECONDS.sleep(4) this will need to be in a try catch;
import java.util.concurrent.TimeUnit;


public class Test{

    public static void main(String[] args) {

        // create an array List with a name of jokes
        ArrayList<Joke> jokes = new ArrayList<>();
        //adding jokes to the array list

        jokes.add(new Joke("general", "What did the fish say when it hit the wall?", "Dam."));
        jokes.add(new Joke("general", "How do you make a tissue dance?", "You put a little boogie on it."));
        jokes.add(new Joke("general", "What's Forrest Gump's password?", "1Forrest1"));
        jokes.add(new Joke("general", "What do you call a belt made out of watches?", "A waist of time."));
        jokes.add(new Joke("general", "Why can't bicycles stand on their own?", "They are two tired"));
        jokes.add(new Joke("general", "How does a train eat?", "It goes chew, chew"));
        jokes.add(new Joke("general", "What do you call a singing Laptop?", "A Dell"));
        jokes.add(new Joke("general", "How many lips does a flower have?", "Tulips"));
        jokes.add(new Joke("general", "How do you organize an outer space party?", "You planet"));
        jokes.add(new Joke("general", "What kind of shoes does a thief wear?", "Sneakers"));
        jokes.add(new Joke("general", "What's the best time to go to the dentist?", "Tooth hurty."));
        jokes.add(new Joke("knock-knock", "Knock knock. Who's there? A broken pencil. A broken pencil who?", "Never mind. It's pointless."));
        jokes.add(new Joke("knock-knock", "Knock knock. Who's there? Cows go. Cows go who?", "No, cows go moo."));
        jokes.add(new Joke("knock-knock", "Knock knock. Who's there? Little old lady. Little old lady who?", "I didn't know you could yodel!"));
        jokes.add(new Joke("programming", "What's the best thing about a Boolean?", "Even if you're wrong, you're only off by a bit."));
        jokes.add(new Joke("programming", "What's the object-oriented way to become wealthy?", "Inheritance"));
        jokes.add(new Joke("programming", "Where do programmers like to hangout?", "The Foo Bar."));
        jokes.add(new Joke("programming", "Why did the programmer quit his job?", "Because he didn't get arrays."));
        jokes.add(new Joke("general", "Did you hear about the two silk worms in a race?", "It ended in a tie."));
        jokes.add(new Joke("general", "What do you call a laughing motorcycle?", "A Yamahahahaha."));
        

        //Print the jokes
        for (Joke joke : jokes) {
            System.out.println(joke);
        }

        // Have the robot ask if you want to hear a joke

        // String input = System.console().readLine();
        // System.out.println(new Random().nextInt(10));
        // System.out.println(jokes.size());
        // TimeUnit.SECONDS.sleep(6);
            
        }
       




}


