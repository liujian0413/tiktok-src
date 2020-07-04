package com.p280ss.android.ugc.aweme.discover.p1185ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.aw */
public abstract class C27022aw<T> {

    /* renamed from: a */
    protected Context f71308a;

    /* renamed from: b */
    protected View f71309b;

    /* renamed from: c */
    public DmtTextView f71310c;

    /* renamed from: d */
    protected TextView f71311d;

    /* renamed from: e */
    protected ViewGroup f71312e;

    /* renamed from: f */
    protected LinearLayout f71313f;

    /* renamed from: g */
    protected C27024a f71314g;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.aw$a */
    public interface C27024a {
        /* renamed from: a */
        void mo68509a();
    }

    /* renamed from: b */
    public final View mo69798b() {
        return this.f71309b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo69796a() {
        this.f71310c = (DmtTextView) this.f71309b.findViewById(R.id.d16);
        this.f71313f = (LinearLayout) this.f71309b.findViewById(R.id.d14);
        this.f71311d = (TextView) this.f71309b.findViewById(R.id.d1a);
        this.f71312e = (ViewGroup) this.f71309b.findViewById(R.id.d18);
        this.f71312e.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (C27022aw.this.f71314g != null) {
                    C27022aw.this.f71314g.mo68509a();
                }
            }
        });
        C23487o.m77146a(!C6399b.m19944t(), this.f71309b.findViewById(R.id.b54));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69797a(boolean z) {
        if (z) {
            this.f71312e.setVisibility(0);
        } else {
            this.f71312e.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void mo69744a(T t, SearchResultParam searchResultParam, boolean z) {
        mo69797a(z);
    }

    public C27022aw(View view, Context context, C27024a aVar) {
        this.f71309b = view;
        this.f71308a = context;
        this.f71314g = aVar;
        mo69796a();
    }
}
