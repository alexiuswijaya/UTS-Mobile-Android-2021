package umn.ac.id;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.TextView;

public class Profil extends AppCompatActivity {
    private TextView tvprofil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        tvprofil = findViewById(R.id.profil);

        setTitle("Profil Saya");
    }
}