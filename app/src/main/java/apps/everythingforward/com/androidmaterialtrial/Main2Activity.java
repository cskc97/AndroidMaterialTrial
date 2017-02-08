package apps.everythingforward.com.androidmaterialtrial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {


    LineChart chart;
    LineDataSet dataSet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        chart = (LineChart) findViewById(R.id.chart);

        ArrayList<Entry> arrayList = new ArrayList<Entry>();

        arrayList.add(new Entry(0,10));
        arrayList.add(new Entry(1,20));
        arrayList.add(new Entry(2,30));
        arrayList.add(new Entry(3,40));

        dataSet = new LineDataSet(arrayList,"Fake Data");
        Toast.makeText(getApplicationContext(),"Stuff",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();

        LineData lineData = new LineData(dataSet);
        chart.setData(lineData);
        chart.invalidate(); // refresh
    }
}
