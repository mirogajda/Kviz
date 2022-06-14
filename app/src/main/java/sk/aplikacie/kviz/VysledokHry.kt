package sk.aplikacie.kviz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_vysledok_hry.*
import sk.aplikacie.kviz.data.User
import sk.aplikacie.kviz.data.UserViewModel

class VysledokHry : AppCompatActivity() {

    private lateinit var mUserViewModel: UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vysledok_hry)

        val menohraca = intent.getStringExtra(Otazky.menoHraca)
        meno_hraca.text = menohraca

        val pocetOtazok = intent.getIntExtra(Otazky.pocetOtazok, 0)
        val pocetSpravnych = intent.getIntExtra(Otazky.pocetSpravnych, 0)

        text_skore.text = "Vaše skóre je $pocetSpravnych/$pocetOtazok"

        val user = User (0, menohraca.toString(), pocetSpravnych)
        mUserViewModel = ViewModelProvider(this).get(UserViewModel::class.java)
        mUserViewModel.addUser(user)

        znova.setOnClickListener {
            startActivity(Intent(this, Kviz::class.java))
            finish()
        }

        hlavne_menu.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}