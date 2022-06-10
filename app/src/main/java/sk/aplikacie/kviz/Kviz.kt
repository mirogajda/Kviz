package sk.aplikacie.kviz

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_kviz.*

class Kviz : AppCompatActivity(), View.OnClickListener {

    private var aktPozicia: Int = 1
    private var testoveOtazky: ArrayList<OtazkaModel>? = null
    private var zvolenaOtazka: Int = 0
    private var pocetSpravnychOdpovedi: Int = 0
    private var menoHraca: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kviz)

        menoHraca = intent.getStringExtra(Otazky.menoHraca)

        testoveOtazky = Otazky.getOtazkyVlajky()

        nastavOtazku()

        moznost1.setOnClickListener(this)
        moznost2.setOnClickListener(this)
        moznost3.setOnClickListener(this)
        moznost4.setOnClickListener(this)
        button_potvrdit.setOnClickListener(this)
    }


    private fun nastavOtazku(){

        val otazka  = testoveOtazky!!.get(aktPozicia - 1)

        zakladnyRamOdpovedi()

        if (aktPozicia == testoveOtazky!!.size){
            button_potvrdit.text = "Dokončiť"
        }else{
            button_potvrdit.text = "Potvrdiť"
        }

        postup.progress = aktPozicia
        popis_progresu.text = "$aktPozicia" + "/" + postup.max

        otazky.text = otazka!!.otazka
        obrazok.setImageResource(otazka.obrazok)
        moznost1.text = otazka!!.moznost1
        moznost2.text = otazka!!.moznost2
        moznost3.text = otazka!!.moznost3
        moznost4.text = otazka!!.moznost4
    }

    private fun zakladnyRamOdpovedi(){
        val moznosti = ArrayList<TextView>()
        moznosti.add(0, moznost1)
        moznosti.add(1, moznost2)
        moznosti.add(2, moznost3)
        moznosti.add(3, moznost4)

        for (moznost in moznosti){
            moznost.setTextColor(Color.parseColor("#7A8089"))
            moznost.typeface = Typeface.DEFAULT
            moznost.background = ContextCompat.getDrawable(this, R.drawable.zakladny_ram)
        }
    }

    private fun zvolenyRamOdpovedi(tv: TextView, cisloMoznosti: Int){
        zakladnyRamOdpovedi()
        zvolenaOtazka = cisloMoznosti
        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this, R.drawable.zvoleny_ram)
    }

    private fun odpovedRam(odpoved: Int, vzhlad: Int){
        when(odpoved){
            1 ->{
                moznost1.background = ContextCompat.getDrawable(this, vzhlad)
            }
            2 ->{
                moznost2.background = ContextCompat.getDrawable(this, vzhlad)
            }
            3 ->{
                moznost3.background = ContextCompat.getDrawable(this, vzhlad)
            }
            4 ->{
                moznost4.background = ContextCompat.getDrawable(this, vzhlad)
            }
        }
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.moznost1->{
                zvolenyRamOdpovedi(moznost1,1)
            }
            R.id.moznost2->{
                zvolenyRamOdpovedi(moznost2,2)
            }
            R.id.moznost3->{
                zvolenyRamOdpovedi(moznost3,3)
            }
            R.id.moznost4->{
                zvolenyRamOdpovedi(moznost4,4)
            }
            R.id.button_potvrdit->{
                if (zvolenaOtazka == 0){
                    aktPozicia++

                    when{
                        aktPozicia <= testoveOtazky!!.size ->{
                            nastavOtazku()
                        }else->{
                            val intent = Intent(this, VysledokHry::class.java)
                            intent.putExtra(Otazky.menoHraca, menoHraca)
                            intent.putExtra(Otazky.pocetOtazok, testoveOtazky!!.size)
                            intent.putExtra(Otazky.pocetSpravnych, pocetSpravnychOdpovedi)
                            startActivity(intent)
                            finish()
                        }
                    }
                } else{
                    val otazka = testoveOtazky?.get(aktPozicia - 1)
                    if (otazka!!.spravnaOdpoved != zvolenaOtazka){
                        odpovedRam(zvolenaOtazka, R.drawable.nespravna_odpoved_ram)
                    }else{
                        pocetSpravnychOdpovedi++
                    }
                    odpovedRam(otazka.spravnaOdpoved, R.drawable.spravna_odpoved_ram)

                    if (aktPozicia == testoveOtazky!!.size){
                        button_potvrdit.text = "Dokončiť"
                    }else{
                        button_potvrdit.text = "Ďalšia otázka"
                    }
                    zvolenaOtazka = 0
                }
            }
        }

    }
}