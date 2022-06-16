package sk.aplikacie.kviz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_zaciatok_hry.*

/**
 * Trieda, v ktorej sa od uzivatela vyziada meno a ponukne moznost pokracovat na kviz
 */

class ZaciatokHry : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zaciatok_hry)

        button_zacat.setOnClickListener {
            if (meno_hraca.text.toString().isEmpty()){
                Toast.makeText(this,"Zadajte Vaše meno", Toast.LENGTH_SHORT).show()
            } else{
                val intent = Intent(this,VybratKategoriu::class.java)
                intent.putExtra(Otazky.menoHraca, meno_hraca.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}