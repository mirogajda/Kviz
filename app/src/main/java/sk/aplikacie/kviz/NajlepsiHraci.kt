package sk.aplikacie.kviz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_najlepsi_hraci.*

class NajlepsiHraci : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_najlepsi_hraci)

        hlavne_menu3.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}