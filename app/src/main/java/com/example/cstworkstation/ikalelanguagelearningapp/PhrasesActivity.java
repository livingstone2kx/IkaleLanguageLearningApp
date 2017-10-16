package com.example.cstworkstation.ikalelanguagelearningapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create an arraylist of words
        ArrayList<Word> words = new ArrayList<Word>();

        //Add words to the ArrayList
        //words.add("one");
        words.add(new Word("Where are you going?", "Ku bo we lo?"));
        words.add(new Word("What is your name?", "K'oruko e?"));
        words.add(new Word("My name is...", "Oruko mi e je..."));
        words.add(new Word("How are you feeling?", "Kon ti ri ke?"));
        words.add(new Word("I'm feeling good.", "O han."));
        words.add(new Word("Are you coming?", "Se we wa?"));
        words.add(new Word("Yes, I'm coming.", "Uhn, me wa."));
        words.add(new Word("Let's go home.", "Je j'a ka loo li."));
        words.add(new Word("Come here.", "Boo be yi."));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);
    }

}
