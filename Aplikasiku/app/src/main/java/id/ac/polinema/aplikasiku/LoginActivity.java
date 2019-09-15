package id.ac.polinema.aplikasiku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void clickForgot(View view) {
        Intent intent = new Intent(this, ForgotPasswordActivity.class);
        startActivity(intent);
        finish();
    }

    public void postLogin(View view) {
        EditText u = (EditText)findViewById(R.id.edt_reset_code);
        EditText p = (EditText)findViewById(R.id.edt_new_password);

        String username = u.getText().toString();
        String password = p.getText().toString();

        u.getEditableText().toString();
        p.getEditableText().toString();

        if (username.equals("admin") && password.equals("admin")) {
            Intent intent = new Intent(this, SuccessLoginActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Cek kembali username dan email anda", Toast.LENGTH_SHORT).show();
        }
    }
}