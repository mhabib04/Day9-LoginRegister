package com.example.day9_loginregister.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.day9_loginregister.R;
import com.example.day9_loginregister.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.tvCreateAccount.setOnClickListener(this);
        binding.btnLogin.setOnClickListener(this);
        binding.toggleButtonShowPassword.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.tvCreateAccount){
            Intent intent = new Intent(this, RegisterActivity.class);
            startActivity(intent);
            finish();
        }
        if (v.getId() == R.id.btnLogin){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        }
        if (v.getId() == R.id.toggleButtonShowPassword){
            int selectionStart = binding.etPasswordLogin.getSelectionStart();
            int selectionEnd = binding.etPasswordLogin.getSelectionEnd();
            if (binding.toggleButtonShowPassword.isChecked()) {
                // Show password
                binding.etPasswordLogin.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
            } else {
                // Hide password
                binding.etPasswordLogin.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
            }
            binding.etPasswordLogin.setSelection(selectionStart, selectionEnd);
        }
    }
}