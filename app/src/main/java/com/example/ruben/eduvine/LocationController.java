package com.example.ruben.eduvine;

import android.os.AsyncTask;

import org.json.JSONArray;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Array;
import java.util.ArrayList;


/**
 * Created by Ruben on 9-4-2015.
 */
public class LocationController extends AsyncTask<String, Void, String>{

    @Override
    protected void onPreExecute() {
        //output.append("Starting task");
    }

    @Override
    protected String doInBackground(String... params) {



        return "Task complete";
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }
}
