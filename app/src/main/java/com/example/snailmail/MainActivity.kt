package com.example.snailmail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var emails: MutableList<Email>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailsRv = findViewById<RecyclerView>(R.id.emailsRv)
        // get list of emails
        emails = EmailFetcher.getEmails()
        // create adapter for passing in the list of emails
        val adapter = EmailAdapter(emails)
        // attach the adapter to the RecyclerView to populate items
        emailsRv.adapter = adapter
        // Set layout manager to position the items
        emailsRv.layoutManager = LinearLayoutManager(this)

        val load  = findViewById<Button>(R.id.loadMoreBtn)

        load.setOnClickListener{
            // Fetch next 5 emails and display in RecyclerView
            val newEmails = EmailFetcher.getNext5Emails()
            emails.addAll(newEmails)
            adapter.notifyDataSetChanged()
        }
    }
}