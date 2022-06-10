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
            R.drawable.au, "Nový Zéland", "Austrália",
            "Island",
            "Ukrajina", 2)
        zoznamOtazok.add(ot1)

        val ot2 = OtazkaModel(2,"Hlavným mestom ktorej krajiny je?",
            R.drawable.ae, "Nový Zéland", "Austrália",
            "Island",
            "Spojené arabské emiráty", 4)
        zoznamOtazok.add(ot2)

        val ot3 = OtazkaModel(3,"Hlavným mestom ktorej krajiny je?",
            R.drawable.af, "Afganistan", "Pakistan",
            "Island",
            "Vatikan", 1)
        zoznamOtazok.add(ot3)

        val ot4 = OtazkaModel(4,"Hlavným mestom ktorej krajiny je?",
            R.drawable.ag, "Angola", "Antigua a Barbuda",
            "Island",
            "Ukrajina", 2)
        zoznamOtazok.add(ot4)

        val ot5 = OtazkaModel(5,"Hlavným mestom ktorej krajiny je?",
            R.drawable.ao, "Nový Zéland", "Austrália",
            "Angola",
            "Antigua a Barbuda", 3)
        zoznamOtazok.add(ot5)

        val ot6 = OtazkaModel(6,"Hlavným mestom ktorej krajiny je?",
            R.drawable.aq, "Antarktída", "Island",
            "Írsko",
            "Argentína", 1)
        zoznamOtazok.add(ot6)

        val ot7 = OtazkaModel(7,"Hlavným mestom ktorej krajiny je?",
            R.drawable.im, "India", "Francúzska Polynézia",
            "Island",
            "Ostrov Man", 4)
        zoznamOtazok.add(ot7)

        val ot8 = OtazkaModel(8,"Hlavným mestom ktorej krajiny je?",
            R.drawable.lt, "Nový Zéland", "Maurícius",
            "Litva",
            "Lotyšsko", 3)
        zoznamOtazok.add(ot8)

        val ot9 = OtazkaModel(9,"Hlavným mestom ktorej krajiny je?",
            R.drawable.mg, "Madagaskar", "Maurícius",
            "Maroko",
            "Marshallove ostrovy", 1)
        zoznamOtazok.add(ot9)

        val ot10 = OtazkaModel(10,"Hlavným mestom ktorej krajiny je?",
            R.drawable.mh, "Nový Zéland", "Marshallove ostrovy",
            "Maroko",
            "Mongolsko", 2)
        zoznamOtazok.add(ot10)

        zoznamOtazok.shuffle()

        return zoznamOtazok
    }

    fun getOtazkySlepaMapa(): ArrayList<OtazkaModel>{
        val zoznamOtazok = ArrayList<OtazkaModel>()
        val ot1 = OtazkaModel(1,"Hlavným mestom ktorej krajiny je?",
            R.drawable.au, "Nový Zéland", "Austrália",
            "Island",
            "Ukrajina", 2)
        zoznamOtazok.add(ot1)

        val ot2 = OtazkaModel(2,"Hlavným mestom ktorej krajiny je?",
            R.drawable.ae, "Nový Zéland", "Austrália",
            "Island",
            "Spojené arabské emiráty", 4)
        zoznamOtazok.add(ot2)

        val ot3 = OtazkaModel(3,"Hlavným mestom ktorej krajiny je?",
            R.drawable.af, "Afganistan", "Pakistan",
            "Island",
            "Vatikan", 1)
        zoznamOtazok.add(ot3)

        val ot4 = OtazkaModel(4,"Hlavným mestom ktorej krajiny je?",
            R.drawable.ag, "Angola", "Antigua a Barbuda",
            "Island",
            "Ukrajina", 2)
        zoznamOtazok.add(ot4)

        val ot5 = OtazkaModel(5,"Hlavným mestom ktorej krajiny je?",
            R.drawable.ao, "Nový Zéland", "Austrália",
            "Angola",
            "Antigua a Barbuda", 3)
        zoznamOtazok.add(ot5)

        val ot6 = OtazkaModel(6,"Hlavným mestom ktorej krajiny je?",
            R.drawable.aq, "Antarktída", "Island",
            "Írsko",
            "Argentína", 1)
        zoznamOtazok.add(ot6)

        val ot7 = OtazkaModel(7,"Hlavným mestom ktorej krajiny je?",
            R.drawable.im, "India", "Francúzska Polynézia",
            "Island",
            "Ostrov Man", 4)
        zoznamOtazok.add(ot7)

        val ot8 = OtazkaModel(8,"Hlavným mestom ktorej krajiny je?",
            R.drawable.lt, "Nový Zéland", "Maurícius",
            "Litva",
            "Lotyšsko", 3)
        zoznamOtazok.add(ot8)

        val ot9 = OtazkaModel(9,"Hlavným mestom ktorej krajiny je?",
            R.drawable.mg, "Madagaskar", "Maurícius",
            "Maroko",
            "Marshallove ostrovy", 1)
        zoznamOtazok.add(ot9)

        val ot10 = OtazkaModel(10,"Hlavným mestom ktorej krajiny je?",
            R.drawable.mh, "Nový Zéland", "Marshallove ostrovy",
            "Maroko",
            "Mongolsko", 2)
        zoznamOtazok.add(ot10)

        zoznamOtazok.shuffle()

        return zoznamOtazok
    }
}