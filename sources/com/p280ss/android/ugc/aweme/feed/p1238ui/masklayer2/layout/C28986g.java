package com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.layout;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.AutoRTLImageView;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.C28969h;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.p1239a.C28935a;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.p1239a.C28955l;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.g */
public final class C28986g extends ConstraintLayout {

    /* renamed from: g */
    public C28935a f76355g;

    /* renamed from: h */
    private AutoRTLImageView f76356h;

    /* renamed from: a */
    public final void mo74274a(C28969h hVar) {
        C7573i.m23587b(hVar, "item");
        C28955l lVar = hVar.f76321b;
        if (lVar != null) {
            this.f76355g = (C28935a) lVar;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.ui.masklayer2.action.BackPrimaryAction");
    }

    public C28986g(Context context) {
        super(context);
        View.inflate(getContext(), R.layout.xk, this);
        View findViewById = findViewById(R.id.b6a);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.iv_back)");
        this.f76356h = (AutoRTLImageView) findViewById;
        this.f76356h.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C28986g f76357a;

            {
                this.f76357a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C28935a aVar = this.f76357a.f76355g;
                if (aVar != null) {
                    C7573i.m23582a((Object) view, "it");
                    aVar.mo74232b(view);
                }
            }
        });
        setOnClickListener(C289882.f76358a);
    }
}
