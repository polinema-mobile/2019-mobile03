package id.ac.polinema.aplikasiku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ResetPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);
    }

    public void backButton (View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }

    public void postChangePassword(View view) {
        EditText k = (EditText) findViewById(R.id.edt_reset_code);
        EditText p = (EditText) findViewById(R.id.edt_new_password);
        EditText cp = (EditText) findViewById(R.id.edt_confirm_password);

        String code = k.getText().toString();
        String password = p.getText().toString();
        String con_password = cp.getText().toString();

        k.getEditableText().toString();
        p.getEditableText().toString();
        cp.getEditableText().toString();


        if (TextUtils.isEmpty(code) && TextUtils.isEmpty(password) && TextUtils.isEmpty(con_password)) {
            Toast.makeText(this, "Pastikan semua field terisi", Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(this, SuccessResetPasswordActivity.class);
            startActivity(intent);
            finish();
        }
    }
}

