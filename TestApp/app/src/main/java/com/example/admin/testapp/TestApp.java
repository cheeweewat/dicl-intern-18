package com.example.admin.testapp;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TestApp extends AppCompatActivity {

    ArrayList<String> listmovie = new ArrayList<>();
    ArrayList<String> listid = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_app);

        get_Json();
        list_Movie();
    }
    private void list_Movie() {

        ListView listView = (ListView) findViewById(R.id.listshow);

        ArrayAdapter<String> arrayadapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listmovie);
        listView.setAdapter(arrayadapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView tv = (TextView) view;
                Toast.makeText(TestApp.this, tv.getText() + "  " + position, Toast.LENGTH_LONG).show();
            }
        });
    }

    public void get_Json(){

        String json;
        try{
            InputStream is =getAssets().open("movie.json");
            Toast.makeText(getApplicationContext(),"Now Here....",Toast.LENGTH_LONG).show();
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();


            json = new String(buffer,"UTF-8");
            JSONArray jsonArray = new JSONArray(json);

            for (int i = 0;i<jsonArray.length();i++){

                JSONObject obj = jsonArray.getJSONObject(i);

                listmovie.add(obj.getString("name"));
                listid.add(obj.getString("id"));

            }
        } catch (IOException e){
            e.printStackTrace();
        } catch (JSONException e){
            e.printStackTrace();
        }
    }
}