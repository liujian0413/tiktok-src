package com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.layout;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.C28964c;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.p1239a.C28955l;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.a */
public final class C28975a extends LinearLayout {

    /* renamed from: a */
    public C28955l f76335a;

    /* renamed from: b */
    public C28955l f76336b;

    /* renamed from: c */
    private OptionDescItemLayout f76337c;

    /* renamed from: d */
    private LinearLayout f76338d;

    /* renamed from: e */
    private DmtTextView f76339e;

    /* renamed from: a */
    public final void mo74259a(C28964c cVar) {
        C7573i.m23587b(cVar, "item");
        this.f76335a = cVar.f76314b;
        this.f76336b = cVar.f76315c;
        this.f76337c.mo74258a(cVar.f76313a);
    }

    public C28975a(Context context) {
        super(context);
        View.inflate(getContext(), R.layout.xh, this);
        View findViewById = findViewById(R.id.a7i);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.desc_layout)");
        this.f76337c = (OptionDescItemLayout) findViewById;
        View findViewById2 = findViewById(R.id.c07);
        C7573i.m23582a((Object) findViewById2, "findViewById(R.id.more_layout)");
        this.f76338d = (LinearLayout) findViewById2;
        View findViewById3 = findViewById(R.id.dxy);
        C7573i.m23582a((Object) findViewById3, "findViewById(R.id.tv_more)");
        this.f76339e = (DmtTextView) findViewById3;
        TextPaint paint = this.f76339e.getPaint();
        C7573i.m23582a((Object) paint, "mTvMore.paint");
        paint.setFakeBoldText(true);
        this.f76337c.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C28975a f76340a;

            {
                this.f76340a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C28955l lVar = this.f76340a.f76335a;
                if (lVar != null) {
                    C7573i.m23582a((Object) view, "it");
                    lVar.mo74232b(view);
                }
            }
        });
        this.f76338d.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C28975a f76341a;

            {
                this.f76341a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C28955l lVar = this.f76341a.f76336b;
                if (lVar != null) {
                    C7573i.m23582a((Object) view, "it");
                    lVar.mo74232b(view);
                }
            }
        });
    }
}
