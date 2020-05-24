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

            if (inputId == "admin@admin.com" && inputPw == "qwer")
            {
                Log.d("로그인확인" , "관리자입니다.")
            } else {
                Log.d("로그인확인" , "로그인에 실패했습니다." )
            }

        }


    }
}
