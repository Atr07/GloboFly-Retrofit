package com.example.globofly.activities

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.example.globofly.R
import com.example.globofly.services.MessageService
import com.example.globofly.services.ServiceBuilder
import kotlinx.android.synthetic.main.activity_welcome.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class WelcomeActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_welcome)

		// To be replaced by retrofit code

        val messageService = ServiceBuilder.buildService(MessageService::class.java)
        val requestCall = messageService.getMessages("https://0ce9cdc1.ngrok.io/messages")

        requestCall.enqueue(object: Callback<String> {

            override fun onResponse(call: Call<String>, response: Response<String>) {
                if (response.isSuccessful) {
                    val msg = response.body()
                    msg?.let {
                        message.text = msg
                    }
                } else {
                    Toast.makeText(this@WelcomeActivity,
                        "Failed to retrieve items", Toast.LENGTH_LONG).show()
                }
            }

            override fun onFailure(call: Call<String>, t: Throwable) {
                Toast.makeText(this@WelcomeActivity,
                    "Failed to retrieve items", Toast.LENGTH_LONG).show()
            }

        })
	}

	fun getStarted(view: View) {
		val intent = Intent(this, DestinationListActivity::class.java)
		startActivity(intent)
		finish()
	}
}
