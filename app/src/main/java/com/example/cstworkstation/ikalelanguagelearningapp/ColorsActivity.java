package com.example.cstworkstation.ikalelanguagelearningapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create an arraylist of words
        ArrayList<Word> words = new ArrayList<Word>();

        //Add words to the ArrayList
        //words.add("one");
        words.add(new Word("red", "pupa", R.drawable.color_red));
        words.add(new Word("green", "green", R.drawable.color_green));
        words.add(new Word("brown", "brown", R.drawable.color_brown));
        words.add(new Word("grey", "grey", R.drawable.color_gray));
        words.add(new Word("black", "didun", R.drawable.color_black));
        words.add(new Word("white", "fifun", R.drawable.color_white));
        words.add(new Word("orange", "orange", R.drawable.color_orange));
        words.add(new Word("blue", "buluu", R.drawable.color_blue));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);

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
