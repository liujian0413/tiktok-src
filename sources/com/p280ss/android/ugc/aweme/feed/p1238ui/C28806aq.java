package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.aq */
public final class C28806aq extends Dialog {

    /* renamed from: a */
    public C7561a<C7581n> f75952a;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.aq$a */
    static final class C28807a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C28806aq f75953a;

        C28807a(C28806aq aqVar) {
            this.f75953a = aqVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f75953a.f75952a.invoke();
            this.f75953a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.aq$b */
    static final class C28808b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C28806aq f75954a;

        C28808b(C28806aq aqVar) {
            this.f75954a = aqVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f75954a.dismiss();
        }
    }

    /* renamed from: a */
    private void m94813a() {
        ((DmtTextView) findViewById(R.id.title)).setFontType(C10834d.f29332b);
        DmtTextView dmtTextView = (DmtTextView) findViewById(R.id.a7e);
        C7573i.m23582a((Object) dmtTextView, "desc");
        StringBuilder sb = new StringBuilder();
        sb.append(getContext().getString(R.string.b5z));
        sb.append("\n\n");
        sb.append(getContext().getString(R.string.b60));
        dmtTextView.setText(sb.toString());
        DmtTextView dmtTextView2 = (DmtTextView) findViewById(R.id.c97);
        dmtTextView2.setFontType(C10834d.f29337g);
        dmtTextView2.setOnClickListener(new C28807a(this));
        ((DmtTextView) findViewById(R.id.asg)).setOnClickListener(new C28808b(this));
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.kv);
        m94813a();
    }

    public C28806aq(Context context, C7561a<C7581n> aVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(aVar, "onClick");
        super(context, R.style.uu);
        this.f75952a = aVar;
    }
}
