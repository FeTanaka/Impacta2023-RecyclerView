package br.com.impacta.curso.listview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import br.com.impacta.curso.listview.databinding.FragmentListViewBinding

class ListViewFragment : Fragment() {

    private var _binding: FragmentListViewBinding? = null
    private val binding get() = _binding!!

    private val listaVersoesAndroid: ArrayList<String> = arrayListOf(
        "Cupcake", "Donut", "Eclair", "Froyo", "Gingerbread", "Honeycomb",
        "Ice Cream Sandwich", "Jelly Bean", "KitKat", "Lollipop", "Marshmallow",
        "Nougat", "Oreo", "Pie", "Android 10", "Android 11", "Android 12", "Android 13",
        "Android 14"
    )

    private var adapter: ArrayAdapter<String>? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentListViewBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter =
            ArrayAdapter<String>(requireContext(), R.layout.listview_item, listaVersoesAndroid)
        binding.listView.adapter = adapter

        binding.button.setOnClickListener {
            listaVersoesAndroid.add("Botão")
            adapter?.notifyDataSetChanged()
        }

    }


}