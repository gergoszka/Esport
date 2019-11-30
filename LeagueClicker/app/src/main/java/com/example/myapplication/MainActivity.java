package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.ref.WeakReference;


public class MainActivity extends AppCompatActivity implements display.ExampleDialogListener {

    static public int counter = 0;
    public TextView points;
    ImageView krug, minion, red, herald, baron;
    static int inc = 0;
    boolean k_bought,r_bought,h_bought,b_bought=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        points = (TextView) findViewById(R.id.points);

        minion = (ImageView) findViewById(R.id.minion);
        krug = (ImageView) findViewById(R.id.krug);
        red = (ImageView) findViewById(R.id.red);
        herald = (ImageView) findViewById(R.id.herald);
        baron = (ImageView) findViewById(R.id.baron);

        openDialog();

        final background task = new background(this);

        minion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                points.setText("Gold: "+Integer.toString(counter));
            }
        });

        krug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (counter >= 10 && !k_bought) {
                    k_bought = true;
                    counter-=10;
                    task.execute(2);
                    krug.setImageResource(R.drawable.krug_done);
                }else
                {
                    Toast.makeText(getApplicationContext(), "Big nono", Toast.LENGTH_SHORT).show();
                }
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (counter >= 250 && !r_bought) {
                    r_bought = true;
                    counter-=250;
                    inc = 3;
                    red.setImageResource(R.drawable.red_done);
                }else
                {
                    Toast.makeText(getApplicationContext(), "Big nono", Toast.LENGTH_SHORT).show();
                }
            }
        });

        herald.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter >= 500 && !h_bought) {
                    h_bought = true;
                    counter-=500;
                    inc = 8;
                    herald.setImageResource(R.drawable.herald_done);
                }else
                {
                    Toast.makeText(getApplicationContext(), "Big nono", Toast.LENGTH_SHORT).show();
                }
            }
        });

        baron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter >= 1000 && !b_bought) {
                    b_bought = true;
                    counter-=1000;
                    inc = 18;
                    baron.setImageResource(R.drawable.baron_done);
                }else
                {
                    Toast.makeText(getApplicationContext(), "Big nono", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void openDialog(){
        display popup = new display();
        popup.show(getSupportFragmentManager(),"asd");
    }

    @Override
    public void applyTexts(int level1) {
        counter = level1;
        points.setText("Gold: "+Integer.toString(counter));
    }



    private static class background extends AsyncTask <Integer, Integer, Void>{

        private WeakReference<MainActivity> activityWeakReference;

        background(MainActivity activity) {
            activityWeakReference = new WeakReference<MainActivity>(activity);
        }

        @Override
        protected  void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected Void doInBackground(Integer... integers) {
            while(true) {

                publishProgress(integers[0]);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (isCancelled())
                {
                    break;
                }

            }
        return null;}

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);

            MainActivity activity = activityWeakReference.get();
            if (activity == null || activity.isFinishing()) {
                return;
            }
            if (inc ==0) {
                counter += values[0];
            }else if (inc == 3) {
                counter += values[0] + inc;
            }else if (inc == 8) {
                counter += values[0] + inc;
            }else if (inc == 18) {
                counter += values[0] + inc;
            }
            activity.points.setText("Gold: "+Integer.toString(counter));
        }


    }
}


