package andro.jf;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LocalStartUI extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    // TODO Auto-generated method stub
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);

    Button b = (Button) findViewById(R.id.button1);
    b.setOnClickListener(new OnClickListener() {

      @Override
      public void onClick(View v) {
        Intent startService = new Intent("andro.jf.manageServiceAction");
        startService(startService);

      }
    });
    Button b2 = (Button) findViewById(R.id.button2);
    b2.setOnClickListener(new OnClickListener() {

      @Override
      public void onClick(View v) {
        Intent stopService = new Intent("andro.jf.manageServiceAction");
        stopService(stopService);

      }
    });
  }



}
