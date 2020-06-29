package com.auu.hunterblade.exampleskotlin

import android.annotation.TargetApi
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.AudioAttributes
import android.media.SoundPool
import android.os.Build
import android.util.Log
import android.widget.Toast
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import java.util.*

class AlertReceiver : BroadcastReceiver() {

    override fun onReceive(context : Context, intent : Intent) {

        val code = intent.getIntExtra("code", 0)

//        Log.d("AlertReceiver",code.toString())

        when(code){

            code1 -> {

                val cal = Calendar.getInstance()

                if(cal.get(Calendar.HOUR_OF_DAY) == 12 && cal.get(Calendar.MINUTE) == 50){

//                    Toast.makeText(context, "Notificacion de las 12", Toast.LENGTH_SHORT).show()

                    val notificationManager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

//        int notificactionId = id;
                    val channelId = "channel_00"
                    val channelName = "Channel_Mensaje_12"
                    var importance = 0
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        importance = NotificationManager.IMPORTANCE_HIGH
                    }
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                        val mChannel = NotificationChannel(channelId, channelName, importance)
                        notificationManager.createNotificationChannel(mChannel)
                    }
                    val builder = NotificationCompat.Builder(context, channelId)
                        .setAutoCancel(true)
                        .setContentTitle("Notificación")
                        .setTicker(intent.getStringExtra("taskText"))
                        .setContentText(intent.getStringExtra("taskText"))
                        .setOnlyAlertOnce(false)
                        .setVisibility(NotificationCompat.VISIBILITY_PUBLIC)


                    val notifyIntent = Intent(context, MainActivity::class.java)
                    notifyIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                    // Create the PendingIntent
                    val notifyPendingIntent = PendingIntent.getActivity(
                        context, 0, notifyIntent, 0
                    )
                    builder.setContentIntent(notifyPendingIntent)

                    with(NotificationManagerCompat.from(context)) {
                        // notificationId is a unique int for each notification that you must define
                        notify(code, builder.build())
//                        createNewSoundPool(context)
                    }

                    MyUtils.setAlarm(context)

                }

            }
            code2 -> {

                val cal = Calendar.getInstance()

                if(cal.get(Calendar.HOUR_OF_DAY) == 14 && cal.get(Calendar.MINUTE) == 30){

                    val notificationManager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

//        int notificactionId = id;
                    val channelId = "channel_01"
                    val channelName = "Channel_Mensaje_14"
                    var importance = 0
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        importance = NotificationManager.IMPORTANCE_HIGH
                    }
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                        val mChannel = NotificationChannel(channelId, channelName, importance)
                        notificationManager.createNotificationChannel(mChannel)
                    }
                    val builder = NotificationCompat.Builder(context, channelId)
                        .setAutoCancel(true)
                        .setContentTitle("Notificación")
                        .setTicker(intent.getStringExtra("taskText"))
                        .setContentText(intent.getStringExtra("taskText"))
                        .setOnlyAlertOnce(false)
                        .setVisibility(NotificationCompat.VISIBILITY_PUBLIC)


                    val notifyIntent = Intent(context, MainActivity::class.java)
                    notifyIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                    // Create the PendingIntent
                    val notifyPendingIntent = PendingIntent.getActivity(
                        context, 0, notifyIntent, 0
                    )
                    builder.setContentIntent(notifyPendingIntent)

                    with(NotificationManagerCompat.from(context)) {
                        // notificationId is a unique int for each notification that you must define
                        notify(code, builder.build())
//                        createNewSoundPool(context)
                    }

                    MyUtils.setAlarm(context)

                }

            }
            code3 -> {

                val cal = Calendar.getInstance()

                if(cal.get(Calendar.HOUR_OF_DAY) == 20  && cal.get(Calendar.MINUTE) == 30){

                    val notificationManager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

//        int notificactionId = id;
                    val channelId = "channel_02"
                    val channelName = "Channel_Mensaje_20"
                    var importance = 0
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        importance = NotificationManager.IMPORTANCE_HIGH
                    }
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                        val mChannel = NotificationChannel(channelId, channelName, importance)
                        notificationManager.createNotificationChannel(mChannel)
                    }
                    val builder = NotificationCompat.Builder(context, channelId)
                        .setAutoCancel(true)
                        .setContentTitle("Notificación")
                        .setTicker(intent.getStringExtra("taskText"))
                        .setContentText(intent.getStringExtra("taskText"))
                        .setOnlyAlertOnce(false)
                        .setVisibility(NotificationCompat.VISIBILITY_PUBLIC)


                    val notifyIntent = Intent(context, MainActivity::class.java)
                    notifyIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                    // Create the PendingIntent
                    val notifyPendingIntent = PendingIntent.getActivity(
                        context, 0, notifyIntent, 0
                    )
                    builder.setContentIntent(notifyPendingIntent)

                    with(NotificationManagerCompat.from(context)) {
                        // notificationId is a unique int for each notification that you must define
                        notify(code, builder.build())
//                        createNewSoundPool(context)
                    }

                    MyUtils.setAlarm(context)

                }

            }
            code4 -> {

                val cal = Calendar.getInstance()

                if(cal.get(Calendar.HOUR_OF_DAY) == 22  && cal.get(Calendar.MINUTE) == 30){

                    val notificationManager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

//        int notificactionId = id;
                    val channelId = "channel_03"
                    val channelName = "Channel_Mensaje_22"
                    var importance = 0
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        importance = NotificationManager.IMPORTANCE_HIGH
                    }
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                        val mChannel = NotificationChannel(channelId, channelName, importance)
                        notificationManager.createNotificationChannel(mChannel)
                    }
                    val builder = NotificationCompat.Builder(context, channelId)
                        .setAutoCancel(true)
                        .setContentTitle("Notificación")
                        .setTicker(intent.getStringExtra("taskText"))
                        .setContentText(intent.getStringExtra("taskText"))
                        .setOnlyAlertOnce(false)
                        .setVisibility(NotificationCompat.VISIBILITY_PUBLIC)


                    val notifyIntent = Intent(context, MainActivity::class.java)
                    notifyIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                    // Create the PendingIntent
                    val notifyPendingIntent = PendingIntent.getActivity(
                        context, 0, notifyIntent, 0
                    )
                    builder.setContentIntent(notifyPendingIntent)

                    with(NotificationManagerCompat.from(context)) {
                        // notificationId is a unique int for each notification that you must define
                        notify(code, builder.build())
//                        createNewSoundPool(context)
                    }

                    MyUtils.setAlarm(context)

                }

            }

        }



    }

//    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
//    fun createNewSoundPool(context: Context?) {
//        val attributes = AudioAttributes.Builder()
//            .setUsage(AudioAttributes.USAGE_NOTIFICATION_EVENT)
//            .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
//            .build()
//        val sounds = SoundPool.Builder()
//            .setAudioAttributes(attributes)
//            .build()
//        val soundId = sounds.load(context, R.raw.alarm, 1)
//        sounds.setOnLoadCompleteListener { soundPool, i, i1 ->
//            soundPool.play(
//                soundId,
//                1f,
//                1f,
//                1,
//                0,
//                1f
//            )
//        }
//    }
}