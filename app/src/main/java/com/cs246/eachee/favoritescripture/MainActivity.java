package com.cs246.eachee.favoritescripture;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    Button displayScriptureButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayScriptureButton = (Button) findViewById(R.id.displayScriptureButton);

        displayScriptureButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Display.class);
                EditText bookText = (EditText) findViewById(R.id.favoriteBookInput);
                EditText chapterText = (EditText) findViewById(R.id.favoriteChapterInput);
                EditText verseText = (EditText) findViewById(R.id.favoriteVerseInput);

                String book = bookText.getText().toString();
                String chapter = chapterText.getText().toString();
                String verse = verseText.getText().toString();

                Bundle bundle = new Bundle();
                bundle.putString("favoriteBook", book);
                bundle.putString("favoriteChapter", chapter);
                bundle.putString("favoriteVerse", verse);

                intent.putExtras(bundle);
                MainActivity.this.startActivity(intent);


            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

//    public void displayScripture() {
//
//        EditText book = (EditText) findViewById(R.id.favoriteBookInput);
//        EditText chapter = (EditText) findViewById(R.id.favoriteChapterInput);
//        EditText verse = (EditText) findViewById(R.id.favoriteVerseInput);
//        Intent i = new Intent(this, Display.class);
//        i.putExtra("book", findViewById(R.id.favoriteBookInput))
//
//    }
}
