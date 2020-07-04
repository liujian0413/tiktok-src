package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.content.Context;
import android.support.p022v4.view.C0961c;
import android.support.p022v4.view.C0961c.C0966d;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.shortvideo.C39804em;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.toolbar.RecordSimplifyConfigViewModel.C41121a;
import com.p280ss.android.ugc.aweme.shortvideo.widget.RecordLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.c */
final /* synthetic */ class C41300c {

    /* renamed from: a */
    private static boolean f107553a = true;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.c$a */
    static final class C41301a implements C0966d {

        /* renamed from: a */
        final /* synthetic */ Context f107554a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f107555b;

        C41301a(Context context, ViewGroup viewGroup) {
            this.f107554a = context;
            this.f107555b = viewGroup;
        }

        public final void onInflateFinished(View view, int i, ViewGroup viewGroup) {
            C7573i.m23587b(view, "view");
            int a = C41121a.m131298a(this.f107554a);
            if (a == 2 || a == 3) {
                View findViewById = view.findViewById(R.id.cun);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
            }
            if (C39805en.m127445a()) {
                switch (C39804em.f103457a) {
                    case 1:
                    case 2:
                    case 4:
                    case 5:
                        RecordLayout recordLayout = (RecordLayout) view.findViewById(R.id.co_);
                        C7573i.m23582a((Object) recordLayout, "recordLayout");
                        LayoutParams layoutParams = recordLayout.getLayoutParams();
                        if (layoutParams != null) {
                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                            layoutParams2.bottomMargin = ((int) C9738o.m28708b(this.f107554a, 33.0f)) + ((int) C9738o.m28708b(this.f107554a, 35.0f));
                            recordLayout.setLayoutParams(layoutParams2);
                            break;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        }
                }
            }
            if (C41272b.m131876a()) {
                this.f107555b.addView(view);
            }
        }
    }

    /* renamed from: a */
    public static final boolean m131885a() {
        return f107553a;
    }

    /* renamed from: a */
    public static final void m131884a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        f107553a = false;
    }

    /* renamed from: a */
    public static final void m131883a(Context context, ViewGroup viewGroup) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(viewGroup, "parent");
        C0961c cVar = new C0961c(context);
        f107553a = true;
        cVar.mo3741a(R.layout.hd, viewGroup, new C41301a(context, viewGroup));
    }
}
