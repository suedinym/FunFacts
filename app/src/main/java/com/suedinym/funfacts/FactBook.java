package com.suedinym.funfacts;

import java.util.Random;

/**
 * Created by sue on 8/30/15.
 */
public class FactBook {
    // Member variable (properties about the object)
    public String [] mFacts = {
            "Although Johnny Cash sang 'A Boy Named Sue', the lyrics were written by Shel Silverstein.",
            "There is no word that rhymes with orange.",
            "Oscar the grouch used to be orange.",
            "'Utopia' is an ancient greek word meaning 'nowhere'.",
            "The pineapple is a berry.",
            "A 'spermologer' collects trivia. Who woulda thunk it?",
            "It is illegal to walk across a street on your hands in Connecticut.",
            "It is illegal to sleep outdoors, on the top of a refrigerator, in Pennsylvania.",
            "In Harper Woods, Minnesota it's illegal to paint a sparrow with the intent of selling it as a parakeet.",
            "Barack Obama collects 'Spider-Man' and 'Conan the Barbarian' comics.",
            "Dragonflies can fly up to 50 mph.",
            "Paul Revere took his midnight ride on a horse named 'Brown Beauty'.",
            "Jimi Hendrix and Bing Crosby were both born in Washington State.",
            "The song 'Happy Birthday to You' was written by two Louisville, Kentucky sisters in 1893.",
            "The Beatles were originally called 'The Quarrymen' and then 'Johnny and the Moondogs', before becoming 'The Beatles'!",
            "In the 1700's, you could sell a fresh deerskin of a buck for one dollar, hence the term 'buck'.",
            "Eskimo ice cream is neither icy, nor creamy",
            "Almonds are a member of the peach family",
            "In Tennessee it is illegal to gather and consume roadkill.",
            "In California, animals are banned from mating publicly within 1500 feet of a tavern, school or place of worship.",
            "The sentence 'The quick brown fox jumps over a lazy dog.' uses every letter of the alphabet",
            "This app was built for a course taught at Treehouse (teamtreehouse.com)."
    };

    //Method (abilities: things the object can do)
    public String getFact(){

        String fact = " ";
        //Randomly select a fact
        Random randomGenerator = new Random(); // construct a new random number generator
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        fact = mFacts[randomNumber];
        return fact;
    }
}
