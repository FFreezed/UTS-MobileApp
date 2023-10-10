package id.ac.umn.fadhil.uts_1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
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
        val nameInput = findViewById<TextInputEditText>(R.id.name_input)
            ?.text.toString().trim()
        if(nameInput.isEmpty()){
            Toast
                .makeText(this,
                    getString(R.string.name_input_empty), Toast.LENGTH_LONG)
                .show()
        }
        else{
            val HomeIntent = Intent(this, HomeActivity::class.java)
            HomeIntent.putExtra("userName", nameInput)

            startActivity(HomeIntent)
        }
    }

}