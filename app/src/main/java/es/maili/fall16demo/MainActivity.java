package es.maili.fall16demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //here is us!
        input=(EditText)this.findViewById(R.id.input);
        output=(TextView)this.findViewById(R.id.output);
        refresh();
    }
    TextView output;
    EditText input;
    public void add(View view){
        Data.people.add(input.getText().toString());
        refresh();
    }
    private void refresh(){
        output.setText(Data.getAll());
        input.setText("");
    }
    public void goToDelete(View view){
        Intent i = new Intent(getApplicationContext(),Delete.class);

        startActivity(i);
    }
}
