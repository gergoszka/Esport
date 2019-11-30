package com.example.myapplication;

import android.app.AlertDialog;
import android.app.AppComponentFactory;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatDialogFragment;
import com.android.volley.Cache;
import com.android.volley.Network;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.DiskBasedCache;
import com.android.volley.toolbox.HurlStack;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONException;
import org.json.JSONObject;

import static com.example.myapplication.MainActivity.counter;


public class display extends AppCompatDialogFragment {
    private EditText editTextUsername;
    private ExampleDialogListener listener;
    private Cache cache;
    private String summonerName;
    public int level;


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());


        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.display, null);

        builder.setView(view)
                .setTitle("Login")
                .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        summonerName = editTextUsername.getText().toString();
                        RequestQueue requestQueue;

                        // Set up the network to use HttpURLConnection as the HTTP client.
                        Network network = new BasicNetwork(new HurlStack());

                        // Instantiate the RequestQueue with the cache and network.
                        requestQueue = new RequestQueue(cache, network);

                        // Start the queue
                        requestQueue.start();

                        String key ="?api_key=RGAPI-8d313710-bde6-4c8d-81da-ad1b6494065e";
                        String url1 ="https://eun1.api.riotgames.com/lol/summoner/v4/summoners/by-name/" + summonerName + key;


                        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                                (Request.Method.GET, url1, null, new Response.Listener<JSONObject>() {

                                    @Override
                                    public void onResponse(JSONObject response) {
                                        try {
                                            String levelString = response.getString("summonerLevel");
                                            level = Integer.parseInt(levelString,10);
                                            listener.applyTexts(level);
                                        }catch (JSONException e){
                                           counter = -1;
                                        }
                                    }
                                }, new Response.ErrorListener() {

                                    @Override
                                    public void onErrorResponse(VolleyError error) {
                                        counter = -2;

                                    }
                                });

                        // Add the request to the RequestQueue.
                        requestQueue.add(jsonObjectRequest);
                    }
                });

        editTextUsername = view.findViewById(R.id.username);

        return builder.create();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try {
            listener = (ExampleDialogListener) context;
            cache = new DiskBasedCache(context. getCacheDir(), 1024 * 1024); // 1MB cap
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() +
                    "must implement ExampleDialogListener");
        }
    }

    public interface ExampleDialogListener {
        void applyTexts(int level);
    }
}