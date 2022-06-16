package sk.aplikacie.kviz.data

import androidx.lifecycle.LiveData

/**
 * Trieda, ktora je zodpovedna za interakciu s databazou v prospech UserViewModelu
 */

class UserRepository(private val userDao: UserDao) {

    val readAllData: LiveData<List<User>> = userDao.readAllData()

    suspend fun addUser(user: User){
        userDao.addUser(user)
    }
}