package com.example.app_lirik_lagu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import com.example.app_lirik_lagu.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var listAdapter: ListAdapter
    private lateinit var listData: ListData
    var dataArrayList = ArrayList<ListData?>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageList = intArrayOf(
            R.drawable.broken,
            R.drawable.power,
            R.drawable.bmth,
            R.drawable.sha,
            R.drawable.batas,
            R.drawable.nct127,
        )

        val Liriklagu = intArrayOf(
            R.string.Brokenlirik,
            R.string.ClouserLirik,
            R.string.DiE4uLirik,
            R.string.Introvertliril,
            R.string.KemanaKitaLirik,
            R.string.Touchlirik,
        )
        val Listname = arrayOf("Broken Meodies", "Closure", "DiE4u", "Introvert",
            "Kemana Kita Hari Ini", "Touch")
        val listArtis = arrayOf("NCT DREAM", "I PREVAIL", "BRING ME THE HORIZON",
            "STAND HERE ALONE", "BATAS SENJA", "NCT 127")

        for (i in imageList.indices){
            listData = ListData (
                Listname[i], imageList[i], Liriklagu[i]
            )
            dataArrayList.add(listData)
        }
        listAdapter = ListAdapter(this@MainActivity, dataArrayList)
        binding.listView.adapter = listAdapter
        binding.listView.isClickable = true
        
        binding.listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(this@MainActivity, DetailActivity::class.java)
            intent.putExtra("name", Listname[i])
            intent.putExtra("Brokenlirik)", Liriklagu[i])
            intent.putExtra("image)", imageList[i])
            startActivity(intent)
        }
    }
}