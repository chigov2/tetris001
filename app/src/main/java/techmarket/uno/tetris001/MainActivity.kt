package techmarket.uno.tetris001

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import techmarket.uno.tetris001.storage.AppPreferences

class MainActivity : AppCompatActivity() {

    var tvHighScore: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        init()
        //val btnNewGame = findViewById<Button>(R.id.btn_new_game)
        //val btnResetScore = findViewById<Button>(R.id.btn_reset_score)
        //val btnExit = findViewById<Button>(R.id.btn_exit)
        //tvHighScore = findViewById<TextView>(R.id.tv_high_score)
        //btnNewGame.setOnClickListener(this::onButtonNewGameClick)

    }

    fun onButtonNewGameClick(view: View) {
        val intent = Intent(this, GameActivity::class.java)
        startActivity(intent)
    }

    fun onBtnResetScoreClick(view: View) {
        val duration = Toast.LENGTH_SHORT
        val preferences = AppPreferences(this)
        preferences.clearHighScore()
        Snackbar.make(view, "Score successfully reset", Snackbar.LENGTH_SHORT).show()
        //Toast.makeText(applicationContext, "text", duration).show()
        tvHighScore?.text = "High score: ${preferences.getHighScore()}"

    }

    fun onBtnExitClick(view: View) {
        System.exit(0)
    }


    public fun init()
    {
        val btnNewGame = findViewById<Button>(R.id.btn_new_game)
        val btnResetScore = findViewById<Button>(R.id.btn_reset_score)
        val btnExit = findViewById<Button>(R.id.btn_exit)
        tvHighScore = findViewById<TextView>(R.id.tv_high_score)
        btnNewGame.setOnClickListener(this::onButtonNewGameClick)

    }


}