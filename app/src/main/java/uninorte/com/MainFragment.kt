package uninorte.com


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_main.view.*
import uninorte.com.data.User

/**
 * A simple [Fragment] subclass.
 *
 */
class MainFragment : Fragment(), MyUserRecyclerViewAdapter.onListInteraction {

    val users = mutableListOf<User>()
    private var adapter : MyUserRecyclerViewAdapter? = null
    var count : Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_main, container, false)

        adapter = MyUserRecyclerViewAdapter(users, this)

        view.list.layoutManager = LinearLayoutManager(context)
        view.list.adapter = adapter

        view.floatingActionButton.setOnClickListener{
            users.add(User("User "+count))
            count++;
            adapter!!.updateData();
        }

        return view
    }

    override fun onListItemInteraction(item: User?) {
        Log.d("KRecycleView", "onListItemInteraction"+item!!.nombre)
    }

    override fun onListButtonInteraction(item: User?) {
        users.remove(item)
        adapter!!.updateData();
    }


}
