package com.example.generic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO 제너릭 타입 클래스
        val stringType = GenericTypeClass("Richard")
        Log.e("", stringType.t)     // Richard

        val intType = GenericTypeClass(10)
        Log.e("", intType.t.toString())     // 10


        // TODO 제너릭 타입 인터페이스
        val genericTypeInterface = object : GenericTypeInterface<String, Int> {
            override fun stringToInt(s: String): Int = s.toInt()
            override fun intToString(i: Int): String = i.toString()
        }

        Log.e("", genericTypeInterface.stringToInt("11").toString())    // 11
        Log.e("", genericTypeInterface.intToString(111))        // 111


        // TODO 제너릭 타입 함수
        var arrList: MutableList<String> = ArrayList<String>()
        Log.e("", arrList.size.toString())      // 0
        addItem(arrList, "Richard")
        Log.e("", arrList.size.toString())      // 1

    }

    /**
     * 제너릭 타입 함수
     */
    private fun <T> addItem(list: MutableList<T>, item: T): List<T> {
        item?.let {
            list.add(it)
        }
        return list
    }

}