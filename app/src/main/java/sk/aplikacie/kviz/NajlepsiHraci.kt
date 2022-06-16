package sk.aplikacie.kviz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_najlepsi_hraci.*
import sk.aplikacie.kviz.data.UserAdapter
import sk.aplikacie.kviz.data.UserViewModel

/**
 * Trieda, ktora zobrazuje najlepsich hracov z databazy pomocou RecyclerView
 */

class NajlepsiHraci : AppCompatActivity() {

    private lateinit var mUserViewModel: UserViewModel
    private lateinit var adapter: UserAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_najlepsi_hraci)

        mUserViewModel = ViewModelProvider(this).get(UserViewModel::class.java)
        Log.d("databaza", mUserViewModel.readAllData.value.toString())
        adapter = UserAdapter()

        recyclerView.layoutManager = LinearLayoutManager(applicationContext)
        recyclerView.adapter = adapter

        hlavne_menu3.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))

       }
        mUserViewModel.readAllData.observe(this, Observer { user ->
            adapter.setData(user)
        })
    }

}