package com.example.saibahmed.phonebook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int[] IMAGES = {R.drawable.friend1,
            R.drawable.friend2,
            R.drawable.friend3,
            R.drawable.friend4,
            R.drawable.friend5,
            R.drawable.friend6,
            R.drawable.friend7,
            R.drawable.friend8,
            R.drawable.friend9,
            R.drawable.friend10 };

    String[] NAMES = {"Lesa Bates",
            "Mabel Young",
            "Thomas Rice",
            "Alyssa James",
            "Tracy Hughes",
            "Jean Coleman",
            "Tyler Young",
            "Felix Washington",
            "Andre Green",
            "Brandie Jennings"};

    String[] PHONES = {"588-930-2178",
            "782-760-6801",
            "800-500-7103",
            "810)-438-1930",
            "651-305-9242",
            "563-355-7671",
            "648-179-5711",
            "424-993-1478",
            "244-336-5495",
            "159-193-7791"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView)findViewById(R.id.list);

        CustomAdaptor customAdaptor = new CustomAdaptor();

        listView.setAdapter(customAdaptor);
        
    }

    class CustomAdaptor extends BaseAdapter{

        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            view=getLayoutInflater().inflate(R.layout.phone_layout,null);

            //Grab references from UI
            ImageView imageView = view.findViewById(R.id.imageView);
            TextView textView_name = view.findViewById(R.id.textView_name);
            TextView textView_phone = view.findViewById(R.id.textView_phone);

            //Settings elements to actual value
            imageView.setImageResource(IMAGES[i]);
            textView_name.setText(NAMES[i]);
            textView_phone.setText(PHONES[i]);



            return view;
        }
    }
}
