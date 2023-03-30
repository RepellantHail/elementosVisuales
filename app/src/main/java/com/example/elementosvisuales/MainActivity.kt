package com.example.elementosvisuales

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btntxt:Button
        btntxt = findViewById(R.id.activity_maon_btnTexto)

        btntxt.setOnClickListener(object: View.OnClickListener{
            override fun onClick(view: View){
                mostrarMensaje()
            }
        })

    }

    fun mostrarMensaje(){
        val toast = Toast.makeText(this@MainActivity, "Activado desde Código",Toast.LENGTH_LONG)
        toast.setGravity(Gravity.BOTTOM or Gravity.CENTER, 0,0)
        toast.show()
    }
}