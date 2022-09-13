package com.example.alertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnAddContactDialog = findViewById<Button>(R.id.btnAddContactDialog)
        btnAddContactDialog.setOnClickListener{
            creatAddContactDialog()
        }
        val btnChoiceSingleItem = findViewById<Button>(R.id.btnChoiceSingleItem)
        btnChoiceSingleItem.setOnClickListener{
            singleChoiceItem()
        }
        val btnMultipleChoiceDialog = findViewById<Button>(R.id.btnMultipleChoiceDialog)
        btnMultipleChoiceDialog.setOnClickListener{
            makeToast("We did not finish this yet, comming soon .......... ")
        }

    }

    private fun singleChoiceItem (){
        val options = arrayOf("one","two","Three","four")
         AlertDialog.Builder(this)
            .setTitle("choice one item ")
            .setSingleChoiceItems(options,0) { _, i ->
                makeToast(options[i])
            }
            .setPositiveButton("Accept"){_,_ ->
                makeToast("Accept")
            }
            .setNegativeButton("Decline"){_,_ ->
                makeToast("Decline")
            }
            .create()
            .show()

    }

    private fun creatAddContactDialog() {
       AlertDialog.Builder(this)
            .setTitle("This For Add Contact")
            .setMessage("If you want add this number, please press yes, or  press No")
            .setIcon(R.drawable.ic_contact)
            .setPositiveButton("Yes"){ _, _ ->
                makeToast("Yes")
            }
            .setNegativeButton("No"){ _, _ ->
                makeToast("No")
            }
            .create()
            .show()
    }

    private fun makeToast(text: String) {
        Toast.makeText(this,text,Toast.LENGTH_SHORT).show()
    }
}