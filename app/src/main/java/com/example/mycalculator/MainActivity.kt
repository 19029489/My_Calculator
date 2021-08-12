package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var sign = ""
    var firstNo = ""
    var secondNo = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnOnClick (view: View) {
        var msg = textView.text.toString()

        if (sign.equals("")){
            firstNo = msg
        } else {
            secondNo = msg
        }

        val btnSelected = view as Button
        when (btnSelected.id) {

            button1.id -> {
                if (!sign.equals("")) {
                    if (secondNo.equals("")) {
                        msg = "1"
                    } else {
                        msg += "1"
                    }
                } else {
                    if (firstNo.equals("0")) {
                        msg = "1"
                    } else {
                        msg += "1"
                    }
                }
            }

            button2.id -> {
                if (!sign.equals("")) {
                    if (secondNo.equals("")) {
                        msg = "2"
                    } else {
                        msg += "2"
                    }
                } else {
                    if (firstNo.equals("0")) {
                        msg = "2"
                    } else {
                        msg += "2"
                    }
                }
            }

            button3.id -> {
                if (!sign.equals("")) {
                    if (secondNo.equals("")) {
                        msg = "3"
                    } else {
                        msg += "3"
                    }
                } else {
                    if (firstNo == "0") {
                        msg = "3"
                    } else {
                        msg += "3"
                    }
                }
            }

            button4.id -> {
                if (!sign.equals("")) {
                    if (secondNo.equals("")) {
                        msg = "4"
                    } else {
                        msg += "4"
                    }
                } else {
                    if (firstNo.equals("0")) {
                        msg = "4"
                    } else {
                        msg += "4"
                    }
                }
            }

            button5.id -> {
                if (!sign.equals("")) {
                    if (secondNo.equals("")) {
                        msg = "5"
                    } else {
                        msg += "5"
                    }
                } else {
                    if (firstNo.equals("0")) {
                        msg = "5"
                    } else {
                        msg += "5"
                    }
                }
            }

            button6.id -> {
                if (!sign.equals("")) {
                    if (secondNo.equals("")) {
                        msg = "6"
                    } else {
                        msg += "6"
                    }
                } else {
                    if (firstNo.equals("0")) {
                        msg = "6"
                    } else {
                        msg += "6"
                    }
                }
            }

            button7.id -> {
                if (!sign.equals("")) {
                    if (secondNo.equals("")) {
                        msg = "7"
                    } else {
                        msg += "7"
                    }
                } else {
                    if (firstNo.equals("0")) {
                        msg = "7"
                    } else {
                        msg += "7"
                    }
                }
            }

            button8.id -> {
                if (!sign.equals("")) {
                    if (secondNo.equals("")) {
                        msg = "8"
                    } else {
                        msg += "8"
                    }
                } else {
                    if (firstNo.equals("0")) {
                        msg = "8"
                    } else {
                        msg += "8"
                    }
                }
            }

            button9.id -> {
                if (!sign.equals("")) {
                    if (secondNo.equals("")) {
                        msg = "9"
                    } else {
                        msg += "9"
                    }
                } else {
                    if (firstNo.equals("0")) {
                        msg = "9"
                    } else {
                        msg += "9"
                    }
                }
            }

            button0.id -> {
                if (!sign.equals("")) {
                    if (secondNo.equals("")) {
                        msg = "0"
                    } else {
                        if (msg != "0"){
                            msg += "0"
                        }
                    }
                } else {
                    if (firstNo.equals("")) {
                        msg = "0"
                    } else {
                        if (msg != "0"){
                            msg += "0"
                        }
                    }
                }
            }

            buttonAC.id -> {
                firstNo = "0"
                msg = "0"
            }

            buttonPlus.id -> {
                if (!firstNo.equals("")){
                    sign = "+"
                    msg = ""
                }
            }
            buttonMinus.id -> {
                if (!firstNo.equals("")){
                    sign = "-"
                    msg = ""
                }
            }
            buttonMultiply.id -> {
                if (!firstNo.equals("")){
                    sign = "*"
                    msg = ""
                }
            }

            buttonDivide.id -> {
                if (!firstNo.equals("")){
                    sign = "/"
                    msg = ""
                }
            }

            buttonDot.id -> {
                if (!msg.contains(".")) {
                    msg += "."
                }
            }

            buttonEqual.id -> {

                if (!sign.equals("")){
                    if (firstNo.contains(".") || secondNo.contains(".")) {
                        if (!firstNo.equals("") && !secondNo.equals("")) {
                            if (sign.equals("+")) {
                                msg = (firstNo.toDouble() + secondNo.toDouble()).toString()
                            } else if (sign.equals("-")) {
                                msg = (firstNo.toDouble() - secondNo.toDouble()).toString()
                            } else if (sign.equals("*")) {
                                msg = (firstNo.toDouble() * secondNo.toDouble()).toString()
                            } else {
                                msg = (firstNo.toDouble() / secondNo.toDouble()).toString()
                            }
                        }
                    } else {
                        if (!firstNo.equals("") && !secondNo.equals("")) {
                            if (sign.equals("+")) {
                                msg = (firstNo.toInt() + secondNo.toInt()).toString()
                            } else if (sign.equals("-")) {
                                msg = (firstNo.toInt() - secondNo.toInt()).toString()
                            } else if (sign.equals("*")) {
                                msg = (firstNo.toInt() * secondNo.toInt()).toString()
                            } else {
                                msg = (firstNo.toInt() / secondNo.toInt()).toString()
                            }
                        }
                    }

                    secondNo = ""
                    sign = ""

                } else {
                    msg = firstNo
                }

            }
        }

        textView.text = msg
    }
}