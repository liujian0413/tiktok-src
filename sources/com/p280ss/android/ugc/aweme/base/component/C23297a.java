package com.p280ss.android.ugc.aweme.base.component;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.base.component.a */
public final class C23297a extends Dialog {

    /* renamed from: a */
    public C23299a f61350a;

    /* renamed from: b */
    private View f61351b;

    /* renamed from: com.ss.android.ugc.aweme.base.component.a$a */
    public static class C23299a {

        /* renamed from: a */
        public String f61353a;

        /* renamed from: a */
        public final C23299a mo60593a(String str) {
            this.f61353a = str;
            return this;
        }

        /* renamed from: a */
        public final C23297a mo60594a(Context context) {
            C23297a aVar = new C23297a(context);
            aVar.f61350a = this;
            return aVar;
        }
    }

    /* renamed from: a */
    private void m76468a() {
        if (VERSION.SDK_INT >= 19) {
            this.f61351b.getLayoutParams().height = C10994a.m32204a(getContext());
        }
    }

    public C23297a(Context context) {
        super(context, R.style.w2);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().requestFeature(1);
        getWindow().addFlags(67108864);
        setContentView(R.layout.ah9);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().setLayout(-1, -1);
        setCancelable(true);
        ((TextView) findViewById(R.id.title)).setText(R.string.c3);
        View findViewById = findViewById(R.id.jo);
        this.f61351b = findViewById(R.id.dal);
        findViewById.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C23297a.this.hide();
            }
        });
        C23300b.m76471a((WebView) findViewById(R.id.egh), this.f61350a.f61353a);
        m76468a();
    }
}
