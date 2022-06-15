package sk.aplikacie.kviz.data

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import sk.aplikacie.kviz.R

class UserAdapter() :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var list = emptyList<User>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.user_item, parent, false)

        return ViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        val itemsViewModel = list[position]
        (holder as ViewHolder).tvMeno.text = itemsViewModel.meno
        holder.tvSkore.text = itemsViewModel.skore.toString()
        holder.tvPoradie.text = (position + 1).toString() + "."
        holder.tvId.text = itemsViewModel.kategoria.toString()
    }
    override fun getItemCount(): Int {
        return list.size
    }
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val tvMeno: TextView = itemView.findViewById(R.id.user_name)
        val tvSkore: TextView = itemView.findViewById(R.id.skore)
        val tvPoradie: TextView = itemView.findViewById(R.id.poradie)
        val tvId: TextView = itemView.findViewById(R.id.kategoria)
    }

    fun setData(user: List<User>){
        this.list = user
        notifyDataSetChanged()
    }
}