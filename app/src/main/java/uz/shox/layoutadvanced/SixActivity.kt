package uz.shox.layoutadvanced

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.Spanned
import android.text.TextUtils
import android.text.style.ForegroundColorSpan
import android.widget.TextView

class SixActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_six)

        val text = "I would like to do something similar to the https://twitter.com app"

        colorText(text)

    }

    private fun colorText(s: String) {
        val textView = findViewById<TextView>(R.id.textView1)

        if (!TextUtils.isEmpty(s)) {
            val spannable: Spannable = SpannableString(s)
            var position = 0
            position = s.indexOf("https://", position)
            while (position != -1) {
                colorSpannable(
                    spannable,
                    position,
                    if (s.indexOf(" ", position + 1) != -1) s.indexOf(
                        " ",
                        position + 1
                    ) else s.length
                )
                position = s.indexOf("#", position + 1)
            }
            textView.text = spannable
        }
    }

    private fun colorSpannable(s: Spannable, start: Int, end: Int) {
        s.setSpan(ForegroundColorSpan(Color.BLUE), start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
    }
}