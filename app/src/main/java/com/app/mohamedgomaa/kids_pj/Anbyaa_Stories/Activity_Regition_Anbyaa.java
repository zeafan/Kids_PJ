package com.app.mohamedgomaa.kids_pj.Anbyaa_Stories;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.app.mohamedgomaa.kids_pj.Activity_Regition;
import com.app.mohamedgomaa.kids_pj.R;

public class Activity_Regition_Anbyaa extends AppCompatActivity {
ImageView img_v,Img_s;
    Animation anim1,Anim2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.
                FLAG_FULLSCREEN);
        setContentView(R.layout.activity__regition__anbyaa);
        ViewCompat.setLayoutDirection(findViewById(R.id.layer_id_relotion_anbyaa), ViewCompat.LAYOUT_DIRECTION_LTR);
        anim1= AnimationUtils.loadAnimation(this,R.anim.translate_story_img);
        Anim2= AnimationUtils.loadAnimation(this,R.anim.translate_video_img);
        img_v=(ImageView)findViewById(R.id.id_videos);
        Img_s=(ImageView)findViewById(R.id.id_story);
        img_v.setAnimation(anim1);
        Img_s.setAnimation(Anim2);
    }
    public void Story_list(View view) {
        startActivity(new Intent(Activity_Regition_Anbyaa.this,Activity_Regition_Anbyaa_story.class));

    }

    public void Video_list(View view) {
        startActivity(new Intent(Activity_Regition_Anbyaa.this,Activity_Regition_Anbyaa_videos.class));
    }

    public void Back_Main(View view) {
        startActivity(new Intent(this, Activity_Regition.class));
        finish();
    }
}
