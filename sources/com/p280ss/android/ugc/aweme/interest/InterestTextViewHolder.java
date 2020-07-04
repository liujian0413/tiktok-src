package com.p280ss.android.ugc.aweme.interest;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.interest.IntereSelectAdapter.C32143a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.interest.InterestTextViewHolder */
public final class InterestTextViewHolder extends C1293v {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f84038a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(InterestTextViewHolder.class), "titleView", "getTitleView()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;"))};

    /* renamed from: b */
    private final C7541d f84039b;

    /* renamed from: com.ss.android.ugc.aweme.interest.InterestTextViewHolder$a */
    static final class C32180a extends Lambda implements C7561a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ View f84042a;

        C32180a(View view) {
            this.f84042a = view;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtTextView invoke() {
            return (DmtTextView) this.f84042a.findViewById(R.id.title);
        }
    }

    /* renamed from: a */
    public final DmtTextView mo83324a() {
        return (DmtTextView) this.f84039b.getValue();
    }

    public InterestTextViewHolder(final View view) {
        C7573i.m23587b(view, "v");
        super(view);
        this.f84039b = C7546e.m23569a(new C32180a(view));
        if (C32143a.m104387a() == -1) {
            mo83324a().post(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ InterestTextViewHolder f84040a;

                {
                    this.f84040a = r1;
                }

                public final void run() {
                    DmtTextView a = this.f84040a.mo83324a();
                    C7573i.m23582a((Object) a, "titleView");
                    C32143a.m104388a(a.getBottom() - view.getTop());
                }
            });
        }
    }
}
