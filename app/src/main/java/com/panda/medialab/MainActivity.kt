package com.panda.medialab

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.panda.core.Test
import com.panda.medialab.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Test.init()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.text.text = Test.getString()
        binding.ffmpeg.text = Test.getFFmpegInfo()
    }
}