package uz.shox.layoutadvanced

import android.graphics.Color
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.Spanned
import android.text.TextUtils
import android.text.style.ForegroundColorSpan
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class FiveActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_five)


        val text = "I would #like to do #something similar to the #Twitter app"

        colorText(text)
//        val toSpanWord: Spannable = SpannableString(text)
//        toSpanWord.setSpan(
//            ForegroundColorSpan(Color.GREEN), 8, 13,
//            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
//        )
//        toSpanWord.setSpan(
//            ForegroundColorSpan(Color.GREEN), 20, 30,
//            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
//        )
//        toSpanWord.setSpan(
//            ForegroundColorSpan(Color.GREEN), 46, 54,
//            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
//        )
//        textView.text = toSpanWord


    }

    private fun colorText(s: String) {
        val textView = findViewById<TextView>(R.id.textView)

        if (!TextUtils.isEmpty(s)) {
            val spannable: Spannable = SpannableString(s)
            var position = 0
            position = s.indexOf("#", position)
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
        s.setSpan(ForegroundColorSpan(Color.GREEN), start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
    }
}