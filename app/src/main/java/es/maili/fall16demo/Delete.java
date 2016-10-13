package es.maili.fall16demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Delete extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);
        input2=(EditText)this.findViewById(R.id.input2);
    }
    EditText input2;
    public void delete(View view){
        Data.people.remove(Integer.parseInt(input2.getText().toString())-1);
        Intent i = new Intent(getApplicationContext(),MainActivity.class);

        startActivity(i);
    }
}
