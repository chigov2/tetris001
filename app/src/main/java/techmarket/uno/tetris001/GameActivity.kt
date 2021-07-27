package techmarket.uno.tetris001

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.TextView
import techmarket.uno.tetris001.storage.AppPreferences

class GameActivity : AppCompatActivity() {
    var tvHighScore: TextView? = null
    var tvCurrentScore: TextView? = null
    var appPreferences: AppPreferences? = null

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        supportActionBar?.hide()
        appPreferences = AppPreferences(this)
        val btnRestart = findViewById<Button>(R.id.btn_restart)
        tvHighScore = findViewById<TextView>(R.id.tv_high_score)
        tvCurrentScore = findViewById<TextView>(R.id.tv_current_score)
        updateHighScore()
        updateCurrentScore()
    }

    private fun updateHighScore() {
        tvHighScore?.text = "${appPreferences?.getHighScore()}"
    }

    private fun updateCurrentScore() {
        tvCurrentScore?.text = "0"
    }


}

