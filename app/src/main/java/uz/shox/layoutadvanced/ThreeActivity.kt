package uz.shox.layoutadvanced

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.addTextChangedListener

class ThreeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)
        initView()

    }
    private fun initView(){
        val editText = findViewById<EditText>(R.id.editText)
        val resultTxt = findViewById<TextView>(R.id.resultTxt)
        val editText1 = findViewById<EditText>(R.id.editText1)
        val resultTxt1 = findViewById<TextView>(R.id.resultTxt1)

        editText.addTextChangedListener {
            resultTxt.text = it
        }

        editText1.setOnKeyListener(object : View.OnKeyListener {
            override fun onKey(v: View?, keyCode: Int, event: KeyEvent): Boolean {

                // if the event is a key down event on the enter button
                if (event.action == KeyEvent.ACTION_DOWN &&
                    keyCode == KeyEvent.KEYCODE_ENTER
                ) {
                    // perform action on key press
                    resultTxt1.text = "Pressed Enter Key\n\n${editText1.text}"

                    // clear focus and hide cursor from edit text
                    editText1.clearFocus()
                    editText1.isCursorVisible = false

                    return true
                }
                return false
            }
        })
    }
}