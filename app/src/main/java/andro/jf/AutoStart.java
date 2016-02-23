package andro.jf;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AutoStart extends BroadcastReceiver {
  public void onReceive(Context context, Intent intent) {
    Intent startServiceIntent = new Intent(context, AndroService.class);
    context.startService(startServiceIntent);       
  }
}
