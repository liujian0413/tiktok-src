package com.p280ss.android.ugc.aweme.qrcode;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.qrcode.ScanResultActivity */
public class ScanResultActivity extends AmeSSActivity {
    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.ScanResultActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.ScanResultActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.ScanResultActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.ScanResultActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ej);
        String stringExtra = getIntent().getStringExtra("extra_scan_result");
        DmtTextView dmtTextView = (DmtTextView) findViewById(R.id.e18);
        ((TextTitleBar) findViewById(R.id.djz)).setOnTitleBarClickListener(new C10797a() {
            /* renamed from: b */
            public final void mo25896b(View view) {
            }

            /* renamed from: a */
            public final void mo25895a(View view) {
                ScanResultActivity.this.finish();
            }
        });
        dmtTextView.setText(stringExtra);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.ScanResultActivity", "onCreate", false);
    }

    /* renamed from: a */
    public static void m119026a(Context context, String str) {
        Intent intent = new Intent(context, ScanResultActivity.class);
        intent.putExtra("extra_scan_result", str);
        context.startActivity(intent);
    }
}
