package ru.byulent.chgkrating;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

import ru.byulent.chgkrating.stub.Player;

public class ListActivity extends AppCompatActivity {

    TextView mHeader;
    TableLayout mTable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        mHeader = findViewById(R.id.list_header);
        mTable = findViewById(R.id.list_table);
        Intent intent = getIntent();
        String action = intent.getAction();
        switch (action) {
            case "ru.byulent.intent.action.players": {
                mHeader.setText(R.string.players);
                getSupportActionBar().setTitle(R.string.players);
                LoadPlayers();
                break;
            }
            case "ru.byulent.intent.action.teams": {
                mHeader.setText(R.string.teams);
                getSupportActionBar().setTitle(R.string.teams);
                LoadTeams();
                break;
            }
            case "ru.byulent.intent.action.tournaments": {
                mHeader.setText(R.string.tournaments);
                getSupportActionBar().setTitle(R.string.tournaments);
                LoadTournaments();
                break;
            }
            default: {
                break;
            }
        }

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void LoadPlayers() {
        mTable.addView(new TableRow(this));
        TableRow row = (TableRow) mTable.getChildAt(0);
        TextView tv = new TextView(this);
        //tv.setTextColor();
        tv.setText("№");
        row.addView(tv);
        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player(4270,14264,"Брутер","Александра","Владимировна"));
        players.add(new Player(27403,14264,"Руссо","Максим","Михайлович"));
        players.add(new Player(27822,14264,"Савченков","Михаил","Владимирович","Соль"));

    }

    private void LoadTeams() {

    }

    private void LoadTournaments() {

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
