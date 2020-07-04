package com.p280ss.android.ugc.aweme.poi.p335ui.upload;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.feed.C28410h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.d */
public final class C35428d extends Dialog {

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.d$a */
    static final class C35429a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C35428d f92939a;

        C35429a(C35428d dVar) {
            this.f92939a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f92939a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.d$b */
    static final class C35430b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C35428d f92940a;

        C35430b(C35428d dVar) {
            this.f92940a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C28410h.m93362c(false);
            this.f92940a.dismiss();
        }
    }

    /* renamed from: a */
    private final void m114436a() {
        ((DmtTextView) findViewById(R.id.bfr)).setOnClickListener(new C35429a(this));
        ((DmtTextView) findViewById(R.id.c59)).setOnClickListener(new C35430b(this));
    }

    public C35428d(Context context) {
        C7573i.m23587b(context, "context");
        super(context, R.style.ug);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.lh);
        setCanceledOnTouchOutside(false);
        m114436a();
    }
}
