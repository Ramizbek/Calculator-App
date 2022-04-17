package ramizbek.aliyev.caculator


import android.content.Context
import android.media.MediaPlayer
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.VibrationEffect
import android.os.Vibrator
import android.view.View
import android.widget.Button
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*
import org.mariuszgromada.math.mxparser.Expression
import java.lang.Exception
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        input.text = "0"
        btn_clear.setOnClickListener {
            if (input.text != "0") {
                input.text = input.text.substring(0, input.text.length - 1)
            }
            val mediaPlayer = MediaPlayer.create(this, R.raw.click)
            mediaPlayer.start()
            val vibrator = this.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            if (Build.VERSION.SDK_INT >= 26) {
                vibrator.vibrate(
                    VibrationEffect.createOneShot(
                        100,
                        VibrationEffect.DEFAULT_AMPLITUDE
                    )
                )
            } else {
                vibrator.vibrate(100)
            }
        }

        btn_clear.setOnLongClickListener {
            input.text = "0"
            output.text = "0"
            val mediaPlayer = MediaPlayer.create(this, R.raw.click)
            mediaPlayer.start()
            val vibrator = this.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            if (Build.VERSION.SDK_INT >= 26) {
                vibrator.vibrate(
                    VibrationEffect.createOneShot(
                        100,
                        VibrationEffect.DEFAULT_AMPLITUDE
                    )
                )
            } else {
                vibrator.vibrate(100)
            }
            true
        }


        btn_bracket_left.setOnClickListener {
            input.text = "${input.text.toString().toInt() * -1}"

            if (input.text.toString().toInt() > 0) {
                val a = input.text.reversed()
                val b = "$a-"
                val c = b.reversed()
                input.text = c
            }else if (input.text.toString().toInt() < 0){
                val a = input.text.reversed()
                val b = a.substring(0, a.length - 1)
                val c = b.reversed()
                input.text = c
            }

            val mediaPlayer = MediaPlayer.create(this, R.raw.click)
            mediaPlayer.start()
            val vibrator = this.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            if (Build.VERSION.SDK_INT >= 26) {
                vibrator.vibrate(
                    VibrationEffect.createOneShot(
                        70,
                        VibrationEffect.DEFAULT_AMPLITUDE
                    )
                )
            } else {
                vibrator.vibrate(70)
            }

        }
        btn_bracket_right.setOnClickListener {
            input.text = addToInputText("%")
            var no = input.text.toString().toDouble() / 100
            input.text = no.toString()
            isNewop = true
            val mediaPlayer = MediaPlayer.create(this, R.raw.click)
            mediaPlayer.start()
            val vibrator = this.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            if (Build.VERSION.SDK_INT >= 26) {
                vibrator.vibrate(
                    VibrationEffect.createOneShot(
                        70,
                        VibrationEffect.DEFAULT_AMPLITUDE
                    )
                )
            } else {
                vibrator.vibrate(70)
            }
        }
        btn_0.setOnClickListener {
            input.text = addToInputText("0")
            val mediaPlayer = MediaPlayer.create(this, R.raw.click)
            mediaPlayer.start()
            val vibrator = this.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            if (Build.VERSION.SDK_INT >= 26) {
                vibrator.vibrate(
                    VibrationEffect.createOneShot(
                        30,
                        VibrationEffect.DEFAULT_AMPLITUDE
                    )
                )
            } else {
                vibrator.vibrate(30)
            }
        }
            btn_1.setOnClickListener {
                input.text = "1"
            val mediaPlayer = MediaPlayer.create(this, R.raw.click)
            mediaPlayer.start()
            val vibrator = this.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            if (Build.VERSION.SDK_INT >= 26) {
                vibrator.vibrate(
                    VibrationEffect.createOneShot(
                        30,
                        VibrationEffect.DEFAULT_AMPLITUDE
                    )
                )
            } else {
                vibrator.vibrate(30)
            }
        }
        btn_2.setOnClickListener {
            input.text = addToInputText("2")
            val mediaPlayer = MediaPlayer.create(this, R.raw.click)
            mediaPlayer.start()
            val vibrator = this.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            if (Build.VERSION.SDK_INT >= 26) {
                vibrator.vibrate(
                    VibrationEffect.createOneShot(
                        30,
                        VibrationEffect.DEFAULT_AMPLITUDE
                    )
                )
            } else {
                vibrator.vibrate(30)
            }
        }
        btn_3.setOnClickListener {
            input.text = addToInputText("3")
            val mediaPlayer = MediaPlayer.create(this, R.raw.click)
            mediaPlayer.start()
            val vibrator = this.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            if (Build.VERSION.SDK_INT >= 26) {
                vibrator.vibrate(
                    VibrationEffect.createOneShot(
                        30,
                        VibrationEffect.DEFAULT_AMPLITUDE
                    )
                )
            } else {
                vibrator.vibrate(30)
            }
        }
        btn_4.setOnClickListener {
            input.text = addToInputText("4")
            val mediaPlayer = MediaPlayer.create(this, R.raw.click)
            mediaPlayer.start()
            val vibrator = this.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            if (Build.VERSION.SDK_INT >= 26) {
                vibrator.vibrate(
                    VibrationEffect.createOneShot(
                        30,
                        VibrationEffect.DEFAULT_AMPLITUDE
                    )
                )
            } else {
                vibrator.vibrate(30)
            }
        }
        btn_5.setOnClickListener {
            input.text = addToInputText("5")
            val mediaPlayer = MediaPlayer.create(this, R.raw.click)
            mediaPlayer.start()
            val vibrator = this.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            if (Build.VERSION.SDK_INT >= 26) {
                vibrator.vibrate(
                    VibrationEffect.createOneShot(
                        30,
                        VibrationEffect.DEFAULT_AMPLITUDE
                    )
                )
            } else {
                vibrator.vibrate(30)
            }
        }
        btn_6.setOnClickListener {
            input.text = addToInputText("6")
            val mediaPlayer = MediaPlayer.create(this, R.raw.click)
            mediaPlayer.start()
            val vibrator = this.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            if (Build.VERSION.SDK_INT >= 26) {
                vibrator.vibrate(
                    VibrationEffect.createOneShot(
                        30,
                        VibrationEffect.DEFAULT_AMPLITUDE
                    )
                )
            } else {
                vibrator.vibrate(30)
            }
        }
        btn_7.setOnClickListener {
            input.text = addToInputText("7")
            val mediaPlayer = MediaPlayer.create(this, R.raw.click)
            mediaPlayer.start()
            val vibrator = this.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            if (Build.VERSION.SDK_INT >= 26) {
                vibrator.vibrate(
                    VibrationEffect.createOneShot(
                        30,
                        VibrationEffect.DEFAULT_AMPLITUDE
                    )
                )
            } else {
                vibrator.vibrate(30)
            }
        }
        btn_8.setOnClickListener {
            input.text = addToInputText("8")
            val mediaPlayer = MediaPlayer.create(this, R.raw.click)
            mediaPlayer.start()
            val vibrator = this.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            if (Build.VERSION.SDK_INT >= 26) {
                vibrator.vibrate(
                    VibrationEffect.createOneShot(
                        30,
                        VibrationEffect.DEFAULT_AMPLITUDE
                    )
                )
            } else {
                vibrator.vibrate(30)
            }
        }
        btn_9.setOnClickListener {
            input.text = addToInputText("9")
            val mediaPlayer = MediaPlayer.create(this, R.raw.click)
            mediaPlayer.start()
            val vibrator = this.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            if (Build.VERSION.SDK_INT >= 26) {
                vibrator.vibrate(
                    VibrationEffect.createOneShot(
                        30,
                        VibrationEffect.DEFAULT_AMPLITUDE
                    )
                )
            } else {
                vibrator.vibrate(30)
            }
        }
        btn_dot.setOnClickListener {
            input.text = addToInputText(".")
            val mediaPlayer = MediaPlayer.create(this, R.raw.click)
            mediaPlayer.start()
            val vibrator = this.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            if (Build.VERSION.SDK_INT >= 26) {
                vibrator.vibrate(
                    VibrationEffect.createOneShot(
                        70,
                        VibrationEffect.DEFAULT_AMPLITUDE
                    )
                )
            } else {
                vibrator.vibrate(70)
            }
        }
//        input.text = "0"
        btn_division.setOnClickListener {
            if (input.text != "0") {
                val a = input.text.substring(input.text.length - 1, input.text.length)
                if (a == "+" || a == "-" || a == "*" || a == "÷") {
                    val b = input.text.substring(0, input.text.length - 1)
                    input.text = "$b÷"
                } else {
                    input.text = "${input.text}÷"
                }
                val mediaPlayer = MediaPlayer.create(this, R.raw.click)
                mediaPlayer.start()
                val vibrator = this.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                if (Build.VERSION.SDK_INT >= 26) {
                    vibrator.vibrate(
                        VibrationEffect.createOneShot(
                            70,
                            VibrationEffect.DEFAULT_AMPLITUDE
                        )
                    )
                } else {
                    vibrator.vibrate(70)
                }
            }
        }
        btn_multiply.setOnClickListener {
            input.text = addToInputText("×")
            val mediaPlayer = MediaPlayer.create(this, R.raw.click)
            mediaPlayer.start()
            val vibrator = this.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            if (Build.VERSION.SDK_INT >= 26) {
                vibrator.vibrate(
                    VibrationEffect.createOneShot(
                        70,
                        VibrationEffect.DEFAULT_AMPLITUDE
                    )
                )
            } else {
                vibrator.vibrate(70)
            }
        }
        btn_subtraction.setOnClickListener {
            input.text = addToInputText("-")
            val mediaPlayer = MediaPlayer.create(this, R.raw.click)
            mediaPlayer.start()
            val vibrator = this.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            if (Build.VERSION.SDK_INT >= 26) {
                vibrator.vibrate(
                    VibrationEffect.createOneShot(
                        70,
                        VibrationEffect.DEFAULT_AMPLITUDE
                    )
                )
            } else {
                vibrator.vibrate(70)
            }
        }
        btn_addition.setOnClickListener {
            input.text = addToInputText("+")
            val mediaPlayer = MediaPlayer.create(this, R.raw.click)
            mediaPlayer.start()
            val vibrator = this.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            if (Build.VERSION.SDK_INT >= 26) {
                vibrator.vibrate(
                    VibrationEffect.createOneShot(
                        70,
                        VibrationEffect.DEFAULT_AMPLITUDE
                    )
                )
            } else {
                vibrator.vibrate(70)
            }
        }
        btn_equals.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(this, R.raw.click)
            mediaPlayer.start()
            val vibrator = this.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            if (Build.VERSION.SDK_INT >= 26) {
                vibrator.vibrate(
                    VibrationEffect.createOneShot(
                        100,
                        VibrationEffect.DEFAULT_AMPLITUDE
                    )
                )
            } else {
                vibrator.vibrate(100)
            }
            showResult()
        }

    }

    private fun addToInputText(buttonValue: String): String {
        return "${input.text}$buttonValue"
    }

    private fun getInputExpression(): String {
        var expression = input.text.replace(Regex("÷"), "/")
        expression = expression.replace(Regex("×"), "*")
        return expression
    }

    private fun showResult() {
        try {
            val expression = getInputExpression()
            val result = Expression(expression).calculate()
            if (result.isNaN()) {
                //show error message
                output.text = "Error"
                output.setTextColor(ContextCompat.getColor(this, R.color.red))
            } else {
                //show result
                output.text = DecimalFormat("0.######").format(result).toString()
                output.setTextColor(ContextCompat.getColor(this, R.color.green))
            }
        } catch (e: Exception) {
            //show error message
            output.text = "Error"
            output.setTextColor(ContextCompat.getColor(this, R.color.red))
        }
    }
    }














}