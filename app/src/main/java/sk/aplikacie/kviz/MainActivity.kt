package sk.aplikacie.kviz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Trieda s hlavnym menu
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener {
            val intent = Intent(this,ZaciatokHry::class.java)
            startActivity(intent)
            finish()
        }


        button2.setOnClickListener {
            startActivity(Intent(this, NajlepsiHraci::class.java))
        }
    }
}