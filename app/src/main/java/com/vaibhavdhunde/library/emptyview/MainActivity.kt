package com.vaibhavdhunde.library.emptyview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        empty_view.setEmptyViewImage(R.drawable.ic_email)
        empty_view.setEmptyViewTitle("No mail received yet...")
        empty_view.setEmptyViewSubtitle("Start sending emails to the contacts...")
    }
}
