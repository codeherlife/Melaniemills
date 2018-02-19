package com.codeherlife.melaniemills;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) this.findViewById(R.id.text_view_title);
        textView.setText(R.string.songs_title);


        ArrayList<String> events_list = new ArrayList<String>();
        events_list.add("Ancora by Einaudi");
        events_list.add("Carry On by Fun");
        events_list.add("Chim Chim Cheree (Mary Poppins)");
        events_list.add("Chopin Nocturne");
        events_list.add("Counting Stars by OneRepublic");
        events_list.add("Dark Horse (Katy Perry");
        events_list.add("The Earth Prelude by Einaudi");
        events_list.add("Eleanor Rigby by Beatles");
        events_list.add("Firework (Katy Perry)");
        events_list.add("Fur Elise by Beethoven");
        events_list.add("Gymnopedie #1 by Satie");
        events_list.add("Hallelujah by Leonard Cohen");
        events_list.add("I Giorni by Einaudi");
        events_list.add("In Principio by Einaudi");
        events_list.add("It's No Good by Depeche Mode");
        events_list.add("Le Onde by Einaudi");
        events_list.add("Let It Go (Disney's Frozen)");
        events_list.add("Life by Einaudi");
        events_list.add("Love Me Harder (Arianna Grande)");
        events_list.add("Love Story by Francis Lai");
        events_list.add("Mad World by Gary Jules");
        events_list.add("Marriage D'amour by Paul de Senneville");
        events_list.add("Monday by Einaudi");
        events_list.add("Moonlight Sonata by Beethoven");
        events_list.add("Nightbook by Einaudi");
        events_list.add("Ombre by Einaudi");
        events_list.add("Over the Rainbow");
        events_list.add("Prelude No. 4 in F maj by Bach");
        events_list.add("Rondo Alla Turka by Mozart");
        events_list.add("Secrets by OneRepublic");
        events_list.add("Solfigietto by Bach");
        events_list.add("Some Nights by Fun");
        events_list.add("Sonata Pathetique by Beethoven");
        events_list.add("Sonatina 1 by Muzio Clementi");
        events_list.add("Thousand Years (popular)");
        events_list.add("Try by Pink");
        events_list.add("Yellow Submarine by Beatles");
        events_list.add("You Raise Me Up by Josh Groban");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                R.layout.list_item_candy,
                R.id.list_view_candy,
                events_list);
        ListView listView = (ListView) this.findViewById(R.id.list_view_candy);
        listView.setAdapter(adapter);
    }

}
