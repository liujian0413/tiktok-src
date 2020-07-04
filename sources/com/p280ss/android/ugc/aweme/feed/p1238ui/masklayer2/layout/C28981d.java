package com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.layout;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.C28966e;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.p1239a.C28955l;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.d */
public final class C28981d extends FrameLayout {

    /* renamed from: a */
    public C28955l f76347a;

    /* renamed from: b */
    private IMContactDescItemLayout f76348b;

    /* renamed from: a */
    public final void mo74267a(C28966e eVar) {
        C7573i.m23587b(eVar, "item");
        this.f76347a = eVar.f76319b;
        this.f76348b.mo74257a(eVar.f76318a);
    }

    public C28981d(Context context) {
        super(context);
        View.inflate(getContext(), R.layout.xe, this);
        View findViewById = findViewById(R.id.a7i);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.desc_layout)");
        this.f76348b = (IMContactDescItemLayout) findViewById;
        setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C28981d f76349a;

            {
                this.f76349a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C28955l lVar = this.f76349a.f76347a;
                if (lVar != null) {
                    C7573i.m23582a((Object) view, "it");
                    lVar.mo74232b(view);
                }
            }
        });
    }
}
