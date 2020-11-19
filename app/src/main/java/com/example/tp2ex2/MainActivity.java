package  com.example.tp2ex2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e,e2;
    Button b,q;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e=findViewById(R.id.edt);
        b=findViewById(R.id.btn);
        q=findViewById(R.id.quit);
        e2=findViewById(R.id.edt2);




        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             /*   Toast.makeText(MainActivity.this,e.getText().toString(),Toast.LENGTH_LONG).show();

                Intent i=new Intent(MainActivity.this,SecondActivity.class);

                i.putExtra("x",e.getText().toString());

                startActivity(i);*/
                /* Exercice 2 */

                if(e.getText().toString().equals("admin") && e2.getText().toString().equals("admin"))
                {
                    Intent i=new Intent(MainActivity.this,SecondActivity.class);

                    i.putExtra("x",e.getText().toString());

                    startActivity(i);
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Authentification échouée",Toast.LENGTH_LONG).show();
                }
                /* Exercice 2 */




            }
        });

        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                AlertDialog.Builder a=new AlertDialog.Builder(MainActivity.this);
                a.setTitle("Attention");
                a.setMessage("Etes vous sur de vouloir quitter");
                a.setPositiveButton("Oui", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        finish();

                    }
                });
                a.setNegativeButton("Non",null);
                a.show();
            }
        });



    }
}