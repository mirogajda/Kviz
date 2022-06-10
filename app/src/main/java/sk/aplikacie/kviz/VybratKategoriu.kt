package sk.aplikacie.kviz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_vybrat_kategoriu.*
import kotlinx.android.synthetic.main.activity_zaciatok_hry.*


class VybratKategoriu : AppCompatActivity() {


    private var menoHraca: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vybrat_kategoriu)

        menoHraca = intent.getStringExtra(Otazky.menoHraca)

        button_vlajky.setOnClickListener {
            val intent = Intent(this,Kviz::class.java)
            intent.putExtra("kategoria",0)
            intent.putExtra(Otazky.menoHraca, menoHraca)
            startActivity(intent)
            finish()
        }

        button_hlavne_mesta.setOnClickListener {
            val intent = Intent(this,Kviz::class.java)
            intent.putExtra("kategoria",1)
            intent.putExtra(Otazky.menoHraca, menoHraca)
            startActivity(intent)
            finish()
        }

        button_slepa_mapa.setOnClickListener {
            val intent = Intent(this,Kviz::class.java)
            intent.putExtra("kategoria",2)
            intent.putExtra(Otazky.menoHraca, menoHraca)
            startActivity(intent)
            finish()
        }
    }
}