package uz.abubakir_khakimov.activity_lifecycle

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import uz.abubakir_khakimov.activity_lifecycle.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d("testLifecycle", "SecondActivity_onCreate()")
    }

    override fun onStart() {
        super.onStart()

        Log.d("testLifecycle", "SecondActivity_onStart()")
    }

    override fun onResume() {
        super.onResume()

        Log.d("testLifecycle", "SecondActivity_onResume()")
    }

    override fun onPause() {
        super.onPause()

        Log.d("testLifecycle", "SecondActivity_onPause()")
    }

    override fun onStop() {
        super.onStop()

        Log.d("testLifecycle", "SecondActivity_onStop()")
    }

    override fun onRestart() {
        super.onRestart()

        Log.d("testLifecycle", "SecondActivity_onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("testLifecycle", "SecondActivity_onDestroy()")
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)

        Log.d("testLifecycle", "SecondActivity_onSaveInstanceState()")
    }
}