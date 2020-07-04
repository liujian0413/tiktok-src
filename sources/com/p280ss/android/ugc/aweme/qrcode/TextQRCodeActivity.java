package com.p280ss.android.ugc.aweme.qrcode;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.qrcode.p1498d.C37073c;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.qrcode.TextQRCodeActivity */
public class TextQRCodeActivity extends AmeSSActivity {

    /* renamed from: a */
    public String f96929a;

    /* renamed from: b */
    private View f96930b;

    /* renamed from: c */
    private TextView f96931c;

    /* renamed from: d */
    private View f96932d;

    /* renamed from: e */
    private View f96933e;

    /* renamed from: f */
    private DmtTextView f96934f;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.TextQRCodeActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.TextQRCodeActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.TextQRCodeActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.TextQRCodeActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.f2);
        this.f96933e = findViewById(R.id.b6a);
        this.f96930b = findViewById(R.id.e0u);
        this.f96932d = findViewById(R.id.dsn);
        this.f96931c = (TextView) findViewById(R.id.dsf);
        this.f96930b.setVisibility(8);
        this.f96934f = (DmtTextView) findViewById(R.id.dyu);
        Intent intent = getIntent();
        if (intent != null) {
            this.f96929a = intent.getStringExtra("intent_extra_content");
        }
        this.f96931c.setText(this.f96929a);
        if (C37073c.m119203c(this.f96929a) || this.f96929a.contains("snssdk1128")) {
            this.f96934f.setText(getResources().getText(R.string.dj6));
        }
        this.f96932d.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                ClipboardManager clipboardManager = (ClipboardManager) TextQRCodeActivity.this.getSystemService("clipboard");
                ClipData newPlainText = ClipData.newPlainText("label", TextQRCodeActivity.this.f96929a);
                if (clipboardManager != null) {
                    clipboardManager.setPrimaryClip(newPlainText);
                }
                C10761a.m31383a((Context) TextQRCodeActivity.this, (int) R.string.ahg).mo25750a();
            }
        });
        this.f96933e.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                TextQRCodeActivity.this.finish();
            }
        });
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.TextQRCodeActivity", "onCreate", false);
    }

    /* renamed from: a */
    public static void m119029a(Context context, String str) {
        Intent intent = new Intent(context, TextQRCodeActivity.class);
        intent.putExtra("intent_extra_content", str);
        context.startActivity(intent);
    }
}
