package id.ac.polinema.aplikasiku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ForgotPasswordActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_forgot_password);
	}

	public void backButton(View view) {
		Intent intent = new Intent(this, LoginActivity.class);
		startActivity(intent);
		finish();
	}

	public void postSentRequest(View view) {
		EditText u = (EditText)findViewById(R.id.edt_reset_code);
		String username = u.getText().toString();
		u.getEditableText().toString();


		if(TextUtils.isEmpty(username)) {
			Toast.makeText(this, "Cek kembali username anda", Toast.LENGTH_SHORT).show();
		} else {
			Intent intent = new Intent(this, ResetPasswordActivity.class);
			startActivity(intent);
			finish();
		}
	}
}
