package com.p280ss.android.ugc.aweme.app.debug;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.provider.Settings;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtButton;
import com.facebook.ads.AdError;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.LogListActivity;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.app.debug.FlowWindowService */
public class FlowWindowService extends Service {
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    /* renamed from: a */
    private void m75432a() {
        WindowManager windowManager = (WindowManager) getSystemService("window");
        DmtButton dmtButton = new DmtButton(getApplicationContext());
        dmtButton.setText("Log");
        dmtButton.setBackgroundDrawable(AwemeApplication.m21341a().getResources().getDrawable(R.drawable.bkp));
        dmtButton.setWidth((int) C9738o.m28708b((Context) AwemeApplication.m21341a(), 50.0f));
        dmtButton.setHeight((int) C9738o.m28708b((Context) AwemeApplication.m21341a(), 50.0f));
        LayoutParams layoutParams = new LayoutParams();
        layoutParams.type = AdError.CACHE_ERROR_CODE;
        layoutParams.format = 1;
        layoutParams.gravity = 51;
        layoutParams.flags = 40;
        layoutParams.width = (int) C9738o.m28708b((Context) AwemeApplication.m21341a(), 50.0f);
        layoutParams.height = (int) C9738o.m28708b((Context) AwemeApplication.m21341a(), 50.0f);
        layoutParams.x = C9738o.m28691a((Context) AwemeApplication.m21341a()) - ((int) C9738o.m28708b((Context) AwemeApplication.m21341a(), 55.0f));
        layoutParams.y = (int) C9738o.m28708b((Context) AwemeApplication.m21341a(), 120.0f);
        windowManager.addView(dmtButton, layoutParams);
        dmtButton.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (VERSION.SDK_INT < 23) {
                    C10761a.m31396b((Context) FlowWindowService.this, "请使用Android 5.0以上系统手机", 1).mo25750a();
                } else if (Settings.canDrawOverlays(FlowWindowService.this)) {
                    Intent intent = new Intent(FlowWindowService.this, LogListActivity.class);
                    intent.addFlags(268435456);
                    FlowWindowService.this.startActivity(intent);
                } else {
                    C10761a.m31396b((Context) FlowWindowService.this, "请先授予抖音悬浮窗权限", 1).mo25750a();
                }
            }
        });
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        m75432a();
        return super.onStartCommand(intent, i, i2);
    }
}
