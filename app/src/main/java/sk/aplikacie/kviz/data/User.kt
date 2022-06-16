package sk.aplikacie.kviz.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import sk.aplikacie.kviz.Kategoria


/**Trieda uzivatela, ktory sa uklada do databazy*/

@Entity(tableName = "user_table")
data class User (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val meno: String,
    val skore: Int,
    val kategoria: String
        )
