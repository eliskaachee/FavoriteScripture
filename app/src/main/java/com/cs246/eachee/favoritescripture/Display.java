package com.cs246.eachee.favoritescripture;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class Display extends ActionBarActivity {

    //private TextView favoriteScriptureText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle bundle = getIntent().getExtras();

        Intent intent = getIntent();
        String favoriteBook = bundle.getString("favoriteBook");
        String favoriteChapter = bundle.getString("favoriteScripture");
        String favoriteVerse = bundle.getString("favoriteVerse");

        TextView book = (TextView) findViewById(R.id.bookDisplay);
        book.setText(favoriteBook);

        TextView chapter = (TextView) findViewById(R.id.chapterDisplay);
        chapter.setText(favoriteChapter);

        TextView verse = (TextView) findViewById(R.id.verseDisplay);
        verse.setText(favoriteVerse);

        //String scripture = (favoriteBook + " " + favoriteChapter + ":" + favoriteVerse);
        //favoriteScriptureText = (TextView) findViewById(R.id.favoriteScriptureOutput);
        //favoriteScriptureText.setText(favoriteBook);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_display, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
