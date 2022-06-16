package sk.aplikacie.kviz.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

/**
 * Predstavuje objekt, ktory definuje metody, ktorymi pristupujem k databaze
 *
 */

@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addUser(user: User)

    @Query("SELECT * FROM user_table ORDER BY skore DESC")
    fun readAllData(): LiveData<List<User>>
}