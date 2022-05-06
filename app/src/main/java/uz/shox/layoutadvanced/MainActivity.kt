package uz.shox.layoutadvanced

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()

    }
    fun initView(){
        val firstBtn = findViewById<Button>(R.id.firstBtn)
        val twoBtn = findViewById<Button>(R.id.twoBtn)
        val threeBtn = findViewById<Button>(R.id.threeBtn)
        val fourBtn = findViewById<Button>(R.id.fourBtn)
        val fiveBtn = findViewById<Button>(R.id.fiveBtn)
        val sixBtn = findViewById<Button>(R.id.sixBtn)

        changeActivity(firstBtn,FirstActivity())
        changeActivity(twoBtn,SecondActivity())
        changeActivity(threeBtn,ThreeActivity())
        changeActivity(fourBtn,FourActivity())
        changeActivity(fiveBtn,FiveActivity())
        changeActivity(sixBtn,SixActivity())
    }
    private fun changeActivity(btn:Button, two:Activity){
        btn.setOnClickListener {
            startActivity(Intent(this,two::class.java))
        }
    }
}