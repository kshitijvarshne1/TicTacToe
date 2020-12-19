package varshney.kshitij.tictactoe

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var board: Array<Array<Button>>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        board = arrayOf(
                arrayOf(button, button2, button3),
                arrayOf(button4, button5, button6),
                arrayOf(button7, button8, button9)
        )
        for (i in board) {
            for (button in i) {
                button.setOnClickListener(this)
            }
        }
        resetBtn.setOnClickListener { }
    }a

    override fun onClick(view: View) {
        when (view.id) {
            R.id.button -> {

            }
            R.id.button2 -> {

            }
            R.id.button3 -> {

            }
            R.id.button4 -> {

            }
            R.id.button5 -> {

            }
            R.id.button6 -> {

            }
            R.id.button7 -> {

            }
            R.id.button8 -> {

            }
            R.id.button9 -> {

            }

        }
    }
}