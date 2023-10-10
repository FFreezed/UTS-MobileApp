package id.ac.umn.fadhil.uts_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val name = intent.getStringExtra("userName")
        val name_display = findViewById<TextView>(R.id.name_display).apply {
            text = name
        }

        val logoutButton = findViewById<Button>(R.id.button_logout)
        logoutButton.setOnClickListener{
            finish()
        }
    }
}