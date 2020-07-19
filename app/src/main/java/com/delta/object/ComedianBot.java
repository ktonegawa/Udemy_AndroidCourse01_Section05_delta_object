package com.delta.object;

import android.util.Log;
import java.util.ArrayList;

public class ComedianBot extends JokeBot {
    public ComedianBot(String aName){
        super(null);
        setName(aName);
        jokesIKnow = JokeWriter.getJokeListTwo();
    }

    public void performShow(){
        talk("Good evening everyone, my name is " + getName());
        talk("Why don\'t I Tell you some of my favourite jokes?");

        for(Joke joke : jokesIKnow){
            sayJoke(joke);
        }

        talk("Thanks everyone, goodnight!");
    }

    @Override
    protected void sayJoke(Joke aJoke) {
//        super.sayJoke(aJoke);
        talk(aJoke.getJokeSetup() + " " + aJoke.getJokePunchline());
    }
}
