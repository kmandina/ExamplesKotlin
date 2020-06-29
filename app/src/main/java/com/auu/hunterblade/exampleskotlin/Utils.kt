package com.auu.hunterblade.exampleskotlin

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import java.util.*

object MyUtils {

    fun setAlarm(applicationContext: Context){

        val alarmMgr =
            applicationContext.getSystemService(Context.ALARM_SERVICE) as AlarmManager

        val intent = Intent(applicationContext, AlertReceiver::class.java)
        intent.putExtra("taskText", "Primer tast Text")
        intent.putExtra("code", code1)
        val alarmIntent = PendingIntent.getBroadcast(applicationContext, code1, intent, PendingIntent.FLAG_UPDATE_CURRENT)

        val cal1: Calendar = Calendar.getInstance()
        cal1.set(Calendar.HOUR_OF_DAY, 12)
        cal1.set(Calendar.MINUTE, 50)
        cal1.set(Calendar.SECOND, 0)

        alarmMgr.setExact(AlarmManager.RTC, cal1.timeInMillis, alarmIntent)

        val intent2 = Intent(applicationContext, AlertReceiver::class.java)
        intent2.putExtra("taskText", "Segundo Task Text")
        intent2.putExtra("code", code2)
        val alarmIntent2 = PendingIntent.getBroadcast(applicationContext, code2, intent2, PendingIntent.FLAG_UPDATE_CURRENT)

        val cal2: Calendar = Calendar.getInstance()
        cal2.set(Calendar.HOUR_OF_DAY, 14)
        cal2.set(Calendar.MINUTE, 30)
        cal2.set(Calendar.SECOND, 0)

        alarmMgr.setExact(AlarmManager.RTC, cal2.timeInMillis, alarmIntent2)

        val intent3 = Intent(applicationContext, AlertReceiver::class.java)
        intent3.putExtra("taskText", "Tercer Task text")
        intent3.putExtra("code", code3)
        val alarmIntent3 = PendingIntent.getBroadcast(applicationContext, code3, intent3, PendingIntent.FLAG_UPDATE_CURRENT)

        val cal3: Calendar = Calendar.getInstance()
        cal3.set(Calendar.HOUR_OF_DAY, 20)
        cal3.set(Calendar.MINUTE, 30)
        cal3.set(Calendar.SECOND, 0)

        alarmMgr.setExact(AlarmManager.RTC, cal3.timeInMillis, alarmIntent3)

        val intent4 = Intent(applicationContext, AlertReceiver::class.java)
        intent4.putExtra("taskText", "Cuarto Task Test")
        intent4.putExtra("code", code4)
        val alarmIntent4 = PendingIntent.getBroadcast(applicationContext, code4, intent4, PendingIntent.FLAG_UPDATE_CURRENT)

        val cal4: Calendar = Calendar.getInstance()
        cal4.set(Calendar.HOUR_OF_DAY, 22)
        cal4.set(Calendar.MINUTE, 30)
        cal4.set(Calendar.SECOND, 0)

        alarmMgr.setExact(AlarmManager.RTC, cal4.timeInMillis, alarmIntent4)

    }
}