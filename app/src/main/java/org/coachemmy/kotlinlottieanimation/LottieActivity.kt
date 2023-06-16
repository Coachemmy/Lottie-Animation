package org.coachemmy.kotlinlottieanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.coachemmy.kotlinlottieanimation.databinding.ActivityLottieBinding

class LottieActivity : AppCompatActivity() {

    private var  _binding: ActivityLottieBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityLottieBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            btnStart.setOnClickListener {
                walking.playAnimation()
            }

            btnStop.setOnClickListener {
                walking.pauseAnimation()
            }
        }
    }
}