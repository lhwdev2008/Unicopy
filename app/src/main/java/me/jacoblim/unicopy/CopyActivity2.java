package me.jacoblim.unicopy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CopyActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_copy2);

        Button btPrevious = findViewById(R.id.btLeft);
        btPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CopyActivity2.this, CopyActivity.class);
                startActivity(intent);
                finish();
            }
        });

        Button btNext = findViewById(R.id.btRight);
        btNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CopyActivity2.this, CopyActivity3.class);
                startActivity(intent);
                finish();
            }
        });

        Button bt1 = findViewById(R.id.btCategory1);
        TextView tv1 = findViewById(R.id.tvCategory1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("Copied from UniCopy", tv1.getText().toString());
                clipboardManager.setPrimaryClip(clip);

                Toast.makeText(CopyActivity2.this, "Copied!", Toast.LENGTH_SHORT).show();
            }
        });

        Button bt2 = findViewById(R.id.btCategory2);
        TextView tv2 = findViewById(R.id.tvCategory2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("Copied from UniCopy", tv2.getText().toString());
                clipboardManager.setPrimaryClip(clip);

                Toast.makeText(CopyActivity2.this, "Copied!", Toast.LENGTH_SHORT).show();
            }
        });

        Button bt3 = findViewById(R.id.btCategory3);
        TextView tv3 = findViewById(R.id.tvCategory3);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("Copied from UniCopy", tv3.getText().toString());
                clipboardManager.setPrimaryClip(clip);

                Toast.makeText(CopyActivity2.this, "Copied!", Toast.LENGTH_SHORT).show();
            }
        });

        Button bt4 = findViewById(R.id.btCategory4);
        TextView tv4 = findViewById(R.id.tvCategory4);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("Copied from UniCopy", tv4.getText().toString());
                clipboardManager.setPrimaryClip(clip);

                Toast.makeText(CopyActivity2.this, "Copied!", Toast.LENGTH_SHORT).show();
            }
        });

        Button bt5 = findViewById(R.id.btCategory5);
        TextView tv5 = findViewById(R.id.btCategory5);
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("Copied from UniCopy", tv5.getText().toString());
                clipboardManager.setPrimaryClip(clip);

                Toast.makeText(CopyActivity2.this, "Copied!", Toast.LENGTH_SHORT).show();
            }
        });

        Button bt6 = findViewById(R.id.btCategory6);
        TextView tv6 = findViewById(R.id.tvCategory6);
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("Copied from UniCopy", tv6.getText().toString());
                clipboardManager.setPrimaryClip(clip);

                Toast.makeText(CopyActivity2.this, "Copied!", Toast.LENGTH_SHORT).show();
            }
        });

        Button bt7 = findViewById(R.id.btCategory7);
        TextView tv7 = findViewById(R.id.tvCategory7);
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("Copied from UniCopy", tv7.getText().toString());
                clipboardManager.setPrimaryClip(clip);

                Toast.makeText(CopyActivity2.this, "Copied!", Toast.LENGTH_SHORT).show();
            }
        });

        Button bt8 = findViewById(R.id.btCategory8);
        TextView tv8 = findViewById(R.id.tvCategory8);
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("Copied from UniCopy", tv8.getText().toString());
                clipboardManager.setPrimaryClip(clip);

                Toast.makeText(CopyActivity2.this, "Copied!", Toast.LENGTH_SHORT).show();
            }
        });

        Button bt9 = findViewById(R.id.btCategory9);
        TextView tv9 = findViewById(R.id.tvCategory9);
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("Copied from UniCopy", tv9.getText().toString());
                clipboardManager.setPrimaryClip(clip);

                Toast.makeText(CopyActivity2.this, "Copied!", Toast.LENGTH_SHORT).show();
            }
        });

        Button bt10 = findViewById(R.id.btCategory10);
        TextView tv10 = findViewById(R.id.tvCategory10);
        bt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("Copied from UniCopy", tv10.getText().toString());
                clipboardManager.setPrimaryClip(clip);

                Toast.makeText(CopyActivity2.this, "Copied!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}