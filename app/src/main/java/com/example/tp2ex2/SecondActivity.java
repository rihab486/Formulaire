package  com.example.tp2ex2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView t;
    Button b,valider;
    EditText nom,prenom,age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        t=findViewById(R.id.txt);
        /* Exercice 2 */
        nom=findViewById(R.id.nom);
        prenom=findViewById(R.id.prenom);
        age=findViewById(R.id.age);
        valider=findViewById(R.id.valider);
        valider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder a=new AlertDialog.Builder(SecondActivity.this);
                a.setTitle("Nom");
                a.setMessage(nom.getText().toString());
                a.setNeutralButton("Oui", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {


                        AlertDialog.Builder a=new AlertDialog.Builder(SecondActivity.this);
                        a.setTitle("Preom");
                        a.setMessage(prenom.getText().toString());
                        a.setNeutralButton("Oui", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                AlertDialog.Builder a=new AlertDialog.Builder(SecondActivity.this);
                                a.setTitle("age");
                                a.setMessage(age.getText().toString());
                                a.setNeutralButton("Oui", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {


                                    }
                                });

                                a.show();

                            }
                        });

                        a.show();


                    }
                });

                a.show();

            }
        });

        /* Exercice 2 */
        Bundle extras=getIntent().getExtras();
        if(extras!=null)
        {
            String s=extras.getString("x");
            t.setText(s);

        }


        b=findViewById(R.id.google);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i= new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(i);

            }
        });




    }
}