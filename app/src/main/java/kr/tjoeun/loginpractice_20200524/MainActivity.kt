package kr.tjoeun.loginpractice_20200524

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.setOnClickListener {

            val inputId = idEdt.text.toString()
            val inputPw = pwEdt.text.toString()

            Log.d("입력아이디" , inputId)
            Log.d("입력비번", inputPw)

            if (inputId == "admin") {
//                둘이 실제로 같을때만 실행되는 코드
                Log.d("입력ID확인", "admin임")

            }
            else if(inputId == "admin@admin.com") {
                Log.d("입력ID확인", "관리자이메일임")
            }
            else {
                Log.d("입력ID확인", "틀린 아이디")
            }

        }


    }
}
