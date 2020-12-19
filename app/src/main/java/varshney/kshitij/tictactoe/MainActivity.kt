package varshney.kshitij.tictactoe

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var PLAYER = true
    var TURN_COUNT = 0
    var boardStatus = Array(3) { IntArray(3) }
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

        initializeBoardStatus()

        resetBtn.setOnClickListener {
            PLAYER = true
            TURN_COUNT = 0
            initializeBoardStatus()

        }
    }

    private fun initializeBoardStatus() {
        for (i in 0..2) {
            for (j in 0..2) {
                boardStatus[0][0] == -1
                board[0][0].isEnabled = true
                board[0][0].text = ""
            }
        }
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.button -> {
                updateValue(row = 0, col = 0, player = PLAYER)
            }
            R.id.button2 -> {
                updateValue(row = 0, col = 1, player = PLAYER)
            }
            R.id.button3 -> {
                updateValue(row = 0, col = 2, player = PLAYER)
            }
            R.id.button4 -> {
                updateValue(row = 1, col = 0, player = PLAYER)
            }
            R.id.button5 -> {
                updateValue(row = 1, col = 1, player = PLAYER)
            }
            R.id.button6 -> {
                updateValue(row = 1, col = 2, player = PLAYER)
            }
            R.id.button7 -> {
                updateValue(row = 2, col = 0, player = PLAYER)
            }
            R.id.button8 -> {
                updateValue(row = 2, col = 1, player = PLAYER)
            }
            R.id.button9 -> {
                updateValue(row = 2, col = 2, player = PLAYER)
            }
        }
        TURN_COUNT++
        PLAYER = !PLAYER
        if (PLAYER) {
            updateDisplay("Player X Turn")
        } else {
            updateDisplay("Player 0 Turn")
        }
        if (TURN_COUNT == 9) {
            updateDisplay("Game Draw")
        }

    }

    private fun updateDisplay(text: String) {
        displayTv.text = text
    }

    private fun updateValue(row: Int, col: Int, player: Boolean) {
        var text = if (player) "X" else "0"
        var value = if (player) 1 else 0
        board[row][col].apply {
            isEnabled = false
            setText(text)
        }
        boardStatus[row][col] = value
    }
}