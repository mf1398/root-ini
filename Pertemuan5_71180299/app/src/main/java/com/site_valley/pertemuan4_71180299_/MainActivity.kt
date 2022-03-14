package com.site_valley.pertemuan4_71180299_

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //buat pertemuan 5
 fun onclick(view: View) {
login(
findViewById<TextInputEditText>(R.id.edtUserName).text.toString(),
findViewById<TextInputEditText>(R.id.edtPassword).text.toString()
)
    }

fun login(userName: String, password: String) {
if (userName == "ujicoba" && password == "coba") {
startActivity(Intent(this, HomeActivity::class.java))
Toast.makeText(this, "Login Berhasil!", Toast.LENGTH_SHORT).show()
} else {
    Toast.makeText(this, "Login Gagal!", Toast.LENGTH_SHORT).show()
        }
    }
}