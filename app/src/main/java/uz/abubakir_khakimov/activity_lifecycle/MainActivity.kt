package uz.abubakir_khakimov.activity_lifecycle

import android.Manifest
import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import uz.abubakir_khakimov.activity_lifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val cameraPermission =
        registerForActivityResult(ActivityResultContracts.RequestPermission()) {}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.openSecondActivity.setOnClickListener {
            startActivity(
                Intent(this, SecondActivity::class.java)
            )
        }

        binding.openDialogActivity.setOnClickListener {
            cameraPermission.launch(Manifest.permission.CAMERA)
        }

        binding.openDialog.setOnClickListener {
            showDialog()
        }

        Log.d("testLifecycle", "MainActivity_onCreate()")
    }

    override fun onStart() {
        super.onStart()

        Log.d("testLifecycle", "MainActivity_onStart()")
    }

    override fun onResume() {
        super.onResume()

        Log.d("testLifecycle", "MainActivity_onResume()")
    }

    override fun onPause() {
        super.onPause()

        Log.d("testLifecycle", "MainActivity_onPause()")
    }

    override fun onStop() {
        super.onStop()

        Log.d("testLifecycle", "MainActivity_onStop()")
    }

    override fun onRestart() {
        super.onRestart()

        Log.d("testLifecycle", "MainActivity_onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("testLifecycle", "MainActivity_onDestroy()")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        Log.d("testLifecycle", "MainActivity_onSaveInstanceState()")
    }

    private fun showDialog() {
        val customDialogBuilder = AlertDialog.Builder(this)
        customDialogBuilder.setTitle("Kanalga obuna bo'ling!")
        customDialogBuilder.setMessage("Boshqa ijtimoiy tarmoqlarimizga ham!")
        customDialogBuilder.setPositiveButton("Obuna bo'ldim") { dialog: DialogInterface, which: Int -> }
        customDialogBuilder.setNegativeButton("Xoziroq obuna bo'laman") { dialog: DialogInterface, which: Int -> }
        customDialogBuilder.create().show()
    }
}