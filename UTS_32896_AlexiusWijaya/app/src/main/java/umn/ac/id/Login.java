package umn.ac.id;

import android.content.DialogInterface;
import android.content.Intent;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    TextView tvlogin1;
    EditText etUsername, etPassword;
    Button btnsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        setTitle("Halaman Login");

        tvlogin1 = findViewById(R.id.login1);

        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);
        btnsubmit = findViewById(R.id.btn_submit);

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etUsername.getText().toString().equals("uasmobile") && etPassword.getText().toString().equals("uasmobilegenap")) {
                    Intent intent = new Intent(Login.this, DaftarLagu.class);
                    startActivity(intent);
                    AlertDialog.Builder builder = new AlertDialog.Builder(Login.this);
                    builder.setIcon(R.drawable.ic_check);
                    builder.setTitle("Login Successfully !!!");
                    builder.setMessage("Loading, please wait...");

                    builder.setNegativeButton("YES", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                } else {
                    Toast.makeText(getApplicationContext(), "Invalid Username or Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}