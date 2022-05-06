package uz.shox.layoutadvanced

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.google.android.material.imageview.ShapeableImageView
import com.google.android.material.shape.CornerFamily

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val imageShap = findViewById<ShapeableImageView>(R.id.imageShapeable)

        imageShap.setOnClickListener {
            val radius = resources.getDimension(R.dimen.corner)
            val shapeAppearanceModel = imageShap.shapeAppearanceModel.toBuilder()
                .setAllCorners(CornerFamily.CUT, radius)
                .build()
            imageShap.shapeAppearanceModel = shapeAppearanceModel
        }

    }
}