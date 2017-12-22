package ru.byulent.chgkrating;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    DrawerLayout mDrawer;
    ActionBarDrawerToggle mToggle;
    NavigationView mNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDrawer = findViewById(R.id.drawer_layout);
        mNavigation = findViewById(R.id.navigation_view);
        mToggle = new ActionBarDrawerToggle(this,mDrawer,R.string.open, R.string.close);

        mDrawer.addDrawerListener(mToggle);
        mToggle.syncState();
        mNavigation.setNavigationItemSelectedListener(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(mToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Intent intent;
        int id = item.getItemId();
        switch (id) {
            case R.id.players: {
                intent = new Intent("ru.byulent.intent.action.players");
                startActivity(intent);
                break;
            }
            case R.id.teams: {
                intent = new Intent("ru.byulent.intent.action.teams");
                startActivity(intent);
                break;
            }
            case R.id.tournaments: {
                intent = new Intent("ru.byulent.intent.action.tournaments");
                startActivity(intent);
                break;
            }
        }
        mDrawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
