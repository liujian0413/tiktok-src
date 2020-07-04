package com.p280ss.android.ugc.aweme.base.activity;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import cat.ereza.customactivityoncrash.CustomActivityOnCrash;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.util.C42881i;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.base.activity.CustomErrorActivity */
public class CustomErrorActivity extends Activity {

    /* renamed from: a */
    TextView f61277a;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.base.activity.CustomErrorActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.base.activity.CustomErrorActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.base.activity.CustomErrorActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    private static String m76344a(String str) {
        StringBuilder sb = new StringBuilder();
        if (str.contains("android.view.InflateException: You must specifiy a valid layout reference") && str.contains("com.by.inflate_lib.AndInflater")) {
            sb.append("如果是5.x及以下手机装debug 复现此问题，local.properties设置enableX2c=true 复制命令 ./gradlew :app:assembleDouyinCnDebug 试试? 详细@包寅\n\n");
        }
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.base.activity.CustomErrorActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.b6);
        this.f61277a = (TextView) findViewById(R.id.afk);
        final String c = CustomActivityOnCrash.m7918c(getIntent());
        this.f61277a.setText(m76344a(c));
        Button button = (Button) findViewById(R.id.csb);
        Button button2 = (Button) findViewById(R.id.a2y);
        Button button3 = (Button) findViewById(R.id.be4);
        final Class d = CustomActivityOnCrash.m7919d(getIntent());
        if (d != null) {
            button.setText(R.string.dgk);
            button.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    CustomActivityOnCrash.m7906a((Activity) CustomErrorActivity.this, new Intent(CustomErrorActivity.this, d));
                }
            });
            button2.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    ((ClipboardManager) CustomErrorActivity.this.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("crashlog", CustomErrorActivity.this.f61277a.getText().toString()));
                    C10761a.m31383a((Context) CustomErrorActivity.this, (int) R.string.ahg).mo25750a();
                }
            });
        } else {
            button.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    CustomActivityOnCrash.m7905a((Activity) CustomErrorActivity.this);
                }
            });
        }
        button3.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C42881i.m136161a(CustomErrorActivity.this.getApplication(), c);
            }
        });
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.base.activity.CustomErrorActivity", "onCreate", false);
    }
}
