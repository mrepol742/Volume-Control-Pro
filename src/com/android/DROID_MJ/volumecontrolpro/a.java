package com.android.DROID_MJ.volumecontrolpro;

import android.content.Context;
import android.media.AudioManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.ActionBar;
import android.graphics.Typeface;

public class a extends AppCompatActivity {
       private AudioManager a;
       private SeekBar b;
       private SeekBar c;
       private SeekBar d;
       private SeekBar e;
       private SeekBar f;
       private TextView g;
       private TextView h;
       private TextView i;
       private TextView j;
       private TextView k;
       private String l = "Alarm Volume";
       private String m = "Music Volume";
       private String n = "Ringtone Volume";
       private String o = "System Volume";
       private String p = "Voice Volume";
       private TextView q;
       private Toolbar r;
       private String s = "Volume Control Pro";
       private Typeface t;
       private ActionBar u;

       protected void onCreate(Bundle a) {
       super.onCreate(a);
       setContentView(R.layout.a);
       this.a = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
       this.b = (SeekBar) findViewById(R.id.a);
       this.c = (SeekBar) findViewById(R.id.b);
       this.d = (SeekBar) findViewById(R.id.c);
       this.e = (SeekBar) findViewById(R.id.d);
       this.f = (SeekBar) findViewById(R.id.e);
       this.g = (TextView) findViewById(R.id.f);
       this.h = (TextView) findViewById(R.id.g);
       this.i = (TextView) findViewById(R.id.h);
       this.j = (TextView) findViewById(R.id.i);
       this.k = (TextView) findViewById(R.id.j);
       this.q = (TextView) findViewById(R.id.l);
       this.t = Typeface.createFromAsset(getAssets(), "fonts/a.ttf");
       this.r = (Toolbar) findViewById(R.id.k);
       this.g.setText(this.l);
       this.h.setText(this.m);
       this.i.setText(this.n);
       this.j.setText(this.o);
       this.k.setText(this.p);
       this.q.setText(this.s);
       this.g.setTypeface(this.t);
       this.h.setTypeface(this.t);
       this.i.setTypeface(this.t);
       this.j.setTypeface(this.t);
       this.k.setTypeface(this.t);
       this.q.setTypeface(this.t);
       setSupportActionBar(this.r);
       this.u = getSupportActionBar();
       initControls(this.b, AudioManager.STREAM_ALARM);
       initControls(this.c, AudioManager.STREAM_MUSIC);
       initControls(this.d, AudioManager.STREAM_RING);
       initControls(this.e, AudioManager.STREAM_SYSTEM);
       initControls(this.f, AudioManager.STREAM_VOICE_CALL);
   }
   
   private void initControls(SeekBar a, final int b) {
       a.setMax(this.a.getStreamMaxVolume(b));
       a.setProgress(this.a.getStreamVolume(b));
       a.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
           public void onProgressChanged(SeekBar c, int d, boolean e) {
               a.this.a.setStreamVolume(b, d, AudioManager.FLAG_PLAY_SOUND);
           }

           public void onStartTrackingTouch(SeekBar f) {
           }

           public void onStopTrackingTouch(SeekBar g) {
           }
        });
     }
}