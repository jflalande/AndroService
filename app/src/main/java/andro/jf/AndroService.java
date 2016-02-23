package andro.jf;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.widget.Toast;

public class AndroService extends Service {

  Timer timer;
  TimerTask task; 

  public void onCreate() {
    // Création du service
    Toast.makeText(this, "Service Created", 
        Toast.LENGTH_SHORT).show();
    timer = new Timer();
  }
  public void onDestroy() {
    // Destruction du service
    Toast.makeText(this, "Destruction du service", 
        Toast.LENGTH_SHORT).show();
    timer.cancel();
  }
  public int onStartCommand(Intent intent, int flags, int startId) {
    // Démarrage du service
    Toast.makeText(this, "Démarrage du service", Toast.LENGTH_SHORT).show();
    /* boolean blop = true; // Vraiment pas une bonne idée !
		while (blop == true)
			; */
    final Handler handler = new Handler(); 
    task = new TimerTask() {
      public void run() { 
        handler.post(new Runnable() {
          public void run() {
            Toast.makeText(AndroService.this, "plop !", 
                Toast.LENGTH_SHORT).show();
          }
        });
      }
    };
    timer.schedule(task, 0, 5000);

    return START_STICKY;
  }
  public IBinder onBind(Intent arg0) {
    return null;
  }
}