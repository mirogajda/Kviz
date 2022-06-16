package sk.aplikacie.kviz

/**
 * Modelova trieda pre otazku
 */

data class OtazkaModel (
        val id: Int,
        val otazka: String,
        val obrazok: Int,
        val moznost1: String,
        val moznost2: String,
        val moznost3: String,
        val moznost4: String,
        val spravnaOdpoved: Int
)