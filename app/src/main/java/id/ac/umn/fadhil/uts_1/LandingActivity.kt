package id.ac.umn.fadhil.uts_1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class LandingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginSubmit = findViewById<Button>(R.id.button_submit)
        loginSubmit.setOnClickListener{
            handleSubmit()
        }

    }

    private fun handleSubmit() {
        val editText = findViewById<EditText>(R.id.name_input)
        val input_name = editText.text.toString()

        if (input_name.isEmpty()) {
            Toast.makeText(this, "Please fill your name", Toast.LENGTH_SHORT).show()
            return
        }

        val homeIntent = Intent(this, HomeActivity::class.java).also {
            it.putExtra("userName", input_name)
            startActivity(it)
        }
    }

}