package com.mobeisecurity.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

import com.mobeisecurity.app.ui.Main;

public class AppStart extends Activity {

	@SuppressLint("SetJavaScriptEnabled")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		final View view = View.inflate(this, R.layout.start, null);
		setContentView(view);
		
		//渐变展示启动屏
		AlphaAnimation aa = new AlphaAnimation(0.3f,1.0f);
		// 动画持续时间2s
		aa.setDuration(2000);
		// 启动动画
		view.startAnimation(aa);
		// 动画监听
		aa.setAnimationListener(new AnimationListener()
		{
			@Override
			public void onAnimationEnd(Animation arg0) {
				// 动画结束，
				redirectTo();
			}
			@Override
			public void onAnimationRepeat(Animation animation) {}
			@Override
			public void onAnimationStart(Animation animation) {}
			
		});

	}
	
	/**
     * 跳转到主页面
     */
    private void redirectTo(){        
        Intent intent = new Intent(this, Main.class);
        startActivity(intent);
        finish();
    }


}
