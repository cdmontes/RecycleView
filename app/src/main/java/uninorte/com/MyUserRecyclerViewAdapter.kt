package uninorte.com

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uninorte.com.data.User

class MyUserRecyclerViewAdapter(
    private val mValues: List<User>) : RecyclerView.Adapter<MyUserRecyclerViewAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyUserRecyclerViewAdapter.ViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: MyUserRecyclerViewAdapter.ViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    inner class ViewHolder(val mView: View) : RecyclerView.ViewHolder(mView){

    }
}