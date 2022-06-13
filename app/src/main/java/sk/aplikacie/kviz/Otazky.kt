package sk.aplikacie.kviz

object Otazky{

    const val menoHraca: String = "meno hraca"
    const val pocetOtazok: String = "pocetOtazok"
    const val pocetSpravnych: String = "pocetSpravnych"

    fun getOtazkyVlajky(): ArrayList<OtazkaModel>{
        val zoznamOtazok = ArrayList<OtazkaModel>()
        val ot1 = OtazkaModel(1,"Ktorej krajine patrí táto vlajka?",
        R.drawable.au, "Nový Zéland", "Austrália",
            "Island",
            "Ukrajina", 2)
        zoznamOtazok.add(ot1)

        val ot2 = OtazkaModel(2,"Ktorej krajine patrí táto vlajka?",
            R.drawable.ae, "Nový Zéland", "Austrália",
            "Island",
            "Spojené arabské emiráty", 4)
        zoznamOtazok.add(ot2)

        val ot3 = OtazkaModel(3,"Ktorej krajine patrí táto vlajka?",
            R.drawable.af, "Afganistan", "Pakistan",
            "Island",
            "Vatikan", 1)
        zoznamOtazok.add(ot3)

        val ot4 = OtazkaModel(4,"Ktorej krajine patrí táto vlajka?",
            R.drawable.ag, "Angola", "Antigua a Barbuda",
            "Island",
            "Ukrajina", 2)
        zoznamOtazok.add(ot4)

        val ot5 = OtazkaModel(5,"Ktorej krajine patrí táto vlajka?",
            R.drawable.ao, "Nový Zéland", "Austrália",
            "Angola",
            "Antigua a Barbuda", 3)
        zoznamOtazok.add(ot5)

        val ot6 = OtazkaModel(6,"Ktorej krajine patrí táto vlajka?",
            R.drawable.aq, "Antarktída", "Island",
            "Írsko",
            "Argentína", 1)
        zoznamOtazok.add(ot6)

        val ot7 = OtazkaModel(7,"Ktorej krajine patrí táto vlajka?",
            R.drawable.im, "India", "Francúzska Polynézia",
            "Island",
            "Ostrov Man", 4)
        zoznamOtazok.add(ot7)

        val ot8 = OtazkaModel(8,"Ktorej krajine patrí táto vlajka?",
            R.drawable.lt, "Nový Zéland", "Maurícius",
            "Litva",
            "Lotyšsko", 3)
        zoznamOtazok.add(ot8)

        val ot9 = OtazkaModel(9,"Ktorej krajine patrí táto vlajka?",
            R.drawable.mg, "Madagaskar", "Maurícius",
            "Maroko",
            "Marshallove ostrovy", 1)
        zoznamOtazok.add(ot9)

        val ot10 = OtazkaModel(10,"Ktorej krajine patrí táto vlajka?",
            R.drawable.mh, "Nový Zéland", "Marshallove ostrovy",
            "Maroko",
            "Mongolsko", 2)
        zoznamOtazok.add(ot10)

        zoznamOtazok.shuffle()

        return zoznamOtazok
    }

    fun getOtazkyHlavneMesta(): ArrayList<OtazkaModel>{
        val zoznamOtazok = ArrayList<OtazkaModel>()
        val ot1 = OtazkaModel(1,"Hlavným mestom ktorej krajiny je?",
            R.drawable.oslo, "Nórsko", "Švédsko",
            "Dánsko",
            "Fínsko", 1)
        zoznamOtazok.add(ot1)

        val ot2 = OtazkaModel(2,"Hlavným mestom ktorej krajiny je?",
            R.drawable.minsk, "Kazachstan", "Grónsko",
            "Bielorusko",
            "Lotyšsko", 3)
        zoznamOtazok.add(ot2)

        val ot3 = OtazkaModel(3,"Hlavným mestom ktorej krajiny je?",
            R.drawable.sofia, "Island", "Gruzínsko",
            "Belgicko",
            "Bulharsko", 4)
        zoznamOtazok.add(ot3)

        val ot4 = OtazkaModel(4,"Hlavným mestom ktorej krajiny je?",
            R.drawable.bratislava, "Slovensko", "Rakúsko",
            "Česko",
            "Ukrajina", 1)
        zoznamOtazok.add(ot4)

        val ot5 = OtazkaModel(5,"Hlavným mestom ktorej krajiny je?",
            R.drawable.tokio, "Čína", "Japonsko",
            "Haiti",
            "Antigua a Barbuda", 2)
        zoznamOtazok.add(ot5)

        val ot6 = OtazkaModel(6,"Hlavným mestom ktorej krajiny je?",
            R.drawable.madrid, "Portugalsko", "Brazília",
            "Španielsko",
            "Argentína", 3)
        zoznamOtazok.add(ot6)

        val ot7 = OtazkaModel(7,"Hlavným mestom ktorej krajiny je?",
            R.drawable.suva, "India", "Francúzska Polynézia",
            "Bolívia",
            "Fidži", 4)
        zoznamOtazok.add(ot7)

        val ot8 = OtazkaModel(8,"Hlavným mestom ktorej krajiny je?",
            R.drawable.manila, "Bahrajn", "Mozambik",
            "Filipíny",
            "Libéria", 3)
        zoznamOtazok.add(ot8)

        val ot9 = OtazkaModel(9,"Hlavným mestom ktorej krajiny je?",
            R.drawable.lisabon, "Portugalsko", "Argentína",
            "Maroko",
            "Francúzsko", 1)
        zoznamOtazok.add(ot9)

        val ot10 = OtazkaModel(10,"Hlavným mestom ktorej krajiny je?",
            R.drawable.vaduz, "Nový Zéland", "Lichtenštajnsko",
            "Maroko",
            "Mongolsko", 2)
        zoznamOtazok.add(ot10)

        zoznamOtazok.shuffle()

        return zoznamOtazok
    }

    fun getOtazkySlepaMapa(): ArrayList<OtazkaModel>{
        val zoznamOtazok = ArrayList<OtazkaModel>()
        val ot1 = OtazkaModel(1,"Ktorá krajina je vyznačená na mape?",
            R.drawable.slep_nem, "Rakúsko", "Nemecko",
            "Česko",
            "Ukrajina", 2)
        zoznamOtazok.add(ot1)

        val ot2 = OtazkaModel(2,"Ktorá krajina je vyznačená na mape?",
            R.drawable.slep_rum, "Srbsko", "Ukrajina",
            "Bulharsko",
            "Rumunsko", 4)
        zoznamOtazok.add(ot2)

        val ot3 = OtazkaModel(3,"Ktorá krajina je vyznačená na mape?",
            R.drawable.slep_tal, "Taliansko", "Francúzsko",
            "Chorvátsko",
            "Grécko", 1)
        zoznamOtazok.add(ot3)

        val ot4 = OtazkaModel(4,"Ktorá krajina je vyznačená na mape?",
            R.drawable.slep_bulharsko, "Rumunsko", "Bulharsko",
            "Grécko",
            "Macedónsko", 2)
        zoznamOtazok.add(ot4)

        val ot5 = OtazkaModel(5,"Ktorá krajina je vyznačená na mape?",
            R.drawable.slep_mac, "Kosovo", "Srbsko",
            "Macedónsko",
            "Albánsko", 3)
        zoznamOtazok.add(ot5)

        val ot6 = OtazkaModel(6,"Ktorá krajina je vyznačená na mape?",
            R.drawable.slep_alb, "Albánsko", "Kosovo",
            "Srbsko",
            "Macedónsko", 1)
        zoznamOtazok.add(ot6)

        val ot7 = OtazkaModel(7,"Ktorá krajina je vyznačená na mape?",
            R.drawable.slep_madar, "Slovensko", "Rakúsko",
            "Srbsko",
            "Maďarsko", 4)
        zoznamOtazok.add(ot7)

        val ot8 = OtazkaModel(8,"Ktorá krajina je vyznačená na mape?",
            R.drawable.slep_chor, "Bosna a Hercegovina", "Slovinsko",
            "Chorvátsko",
            "Lotyšsko", 3)
        zoznamOtazok.add(ot8)

        val ot9 = OtazkaModel(9,"Ktorá krajina je vyznačená na mape?",
            R.drawable.slep_span, "Španielsko", "Portugalsko",
            "Francúzsko",
            "Alžírsko", 1)
        zoznamOtazok.add(ot9)

        val ot10 = OtazkaModel(10,"Ktorá krajina je vyznačená na mape?",
            R.drawable.slep_ukra, "Poľsko", "Ukrajina",
            "Rumunsko",
            "Bulharsko", 2)
        zoznamOtazok.add(ot10)

        zoznamOtazok.shuffle()

        return zoznamOtazok
    }
}