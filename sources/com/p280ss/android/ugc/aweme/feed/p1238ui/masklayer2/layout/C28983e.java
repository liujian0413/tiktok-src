package com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.layout;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.C28969h;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.p1239a.C28955l;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.e */
public final class C28983e extends FrameLayout {

    /* renamed from: a */
    public C28955l f76350a;

    /* renamed from: b */
    private OptionDescItemLayout f76351b;

    /* renamed from: a */
    public final void mo74269a(C28969h hVar) {
        C7573i.m23587b(hVar, "item");
        this.f76350a = hVar.f76321b;
        this.f76351b.mo74258a(hVar.f76320a);
    }

    public C28983e(Context context) {
        super(context);
        View.inflate(getContext(), R.layout.xj, this);
        View findViewById = findViewById(R.id.a7i);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.desc_layout)");
        this.f76351b = (OptionDescItemLayout) findViewById;
        setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C28983e f76352a;

            {
                this.f76352a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C28955l lVar = this.f76352a.f76350a;
                if (lVar != null) {
                    C7573i.m23582a((Object) view, "it");
                    lVar.mo74232b(view);
                }
            }
        });
    }
}
