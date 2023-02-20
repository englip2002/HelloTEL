package my.edu.tarc.hellotel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Switch
import android.widget.TextView

//Instant name: Type / Class Name
class MainActivity : AppCompatActivity() {

    //onCreate = main function
    override fun onCreate(savedInstanceState: Bundle?) {
        //super = parent
        super.onCreate(savedInstanceState)
        //Load UI to memory
        //R = resources (R manages all resources required for application)
        setContentView(R.layout.activity_main)

        //Linking UI to program code
        //Declare variable here
        //val = value, var = variable
        val imageViewQR: ImageView = findViewById(R.id.imageViewQR)
        val textViewName: TextView = findViewById(R.id.textViewName)
        val buttonShow: Button = findViewById(R.id.buttonShow)
        val buttonHide = findViewById<Button>(R.id.buttonHide) //casting to Button (not preferred)
        val switchShow: Switch = findViewById(R.id.switchShow)


        //Insert event handler
        buttonShow.setOnClickListener{
            switchShow.isChecked = true
            imageViewQR.visibility = View.VISIBLE
            textViewName.visibility = View.VISIBLE
        }

        buttonHide.setOnClickListener {
            switchShow.isChecked = false
            imageViewQR.visibility = View.INVISIBLE
            textViewName.visibility = View.INVISIBLE
        }

        switchShow.setOnClickListener {
            if (switchShow.isChecked){
                imageViewQR.visibility = View.VISIBLE
                textViewName.visibility = View.VISIBLE
            }
            else{
                imageViewQR.visibility = View.INVISIBLE
                textViewName.visibility = View.INVISIBLE
            }
        }


    }
}