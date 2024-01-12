package com.example.app_lirik_lagu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.app_lirik_lagu.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = this.intent
        if (intent != null){
            val nama = intent.getStringExtra("nama")
            val liriklagu = intent.getIntExtra("Lirik", R.string.Brokenlirik)
            val image = intent.getIntExtra("image", R.drawable.broken)

            binding.DetailHome.text = nama
            binding.liriklagu.setText(liriklagu)
            binding.detailImage.setImageResource(image)
        }
    }
}