package com.p280ss.android.ugc.aweme.commercialize.utils;

import android.support.transition.C0476c;
import android.support.transition.C0508m;
import android.support.transition.C0516o;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Iterator;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.p1878b.C47891a;
import kotlin.p356e.C7551d;
import kotlin.sequences.C7604g;
import kotlin.sequences.C7605h;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.aa */
public final class C25212aa {

    /* renamed from: a */
    public static final C25212aa f66520a = new C25212aa();

    /* renamed from: b */
    private static final int f66521b = R.id.dj;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.aa$a */
    static final class C25213a extends Lambda implements C7562b<Integer, View> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f66522a;

        C25213a(ViewGroup viewGroup) {
            this.f66522a = viewGroup;
            super(1);
        }

        /* renamed from: a */
        private View m82911a(int i) {
            return this.f66522a.getChildAt(i);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m82911a(((Number) obj).intValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.aa$b */
    static final class C25214b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f66523a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f66524b;

        /* renamed from: c */
        final /* synthetic */ ViewGroup f66525c;

        C25214b(View view, ViewGroup viewGroup, ViewGroup viewGroup2) {
            this.f66523a = view;
            this.f66524b = viewGroup;
            this.f66525c = viewGroup2;
        }

        public final void run() {
            C25212aa.f66520a.mo65827a(this.f66524b, this.f66525c, this.f66523a);
        }
    }

    private C25212aa() {
    }

    /* renamed from: b */
    private static C7604g<View> m82908b(ViewGroup viewGroup) {
        return C7605h.m23659d(C7525m.m23526p(C7551d.m23565b(0, viewGroup.getChildCount())), new C25213a(viewGroup));
    }

    /* renamed from: c */
    private final boolean m82909c(ViewGroup viewGroup) {
        boolean z;
        Iterator a = m82908b(viewGroup).mo19416a();
        do {
            z = false;
            if (!a.hasNext()) {
                return false;
            }
            if (((View) a.next()).getVisibility() == 0) {
                z = true;
                continue;
            }
        } while (!z);
        return true;
    }

    /* renamed from: a */
    public static final void m82905a(ViewGroup viewGroup) {
        int i;
        long j;
        if (viewGroup != null) {
            Iterator a = C7605h.m23662f(m82908b(viewGroup)).mo19416a();
            while (true) {
                i = 8;
                if (!a.hasNext()) {
                    break;
                }
                View view = (View) a.next();
                Object tag = view.getTag(f66521b);
                if (!(tag instanceof Long)) {
                    tag = null;
                }
                Long l = (Long) tag;
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = 0;
                }
                if (j > 0) {
                    view.setVisibility(8);
                } else {
                    view.setVisibility(0);
                }
            }
            if (f66520a.m82909c(viewGroup)) {
                i = 0;
            }
            viewGroup.setVisibility(i);
        }
    }

    /* renamed from: a */
    private static void m82907a(ViewGroup viewGroup, C0508m... mVarArr) {
        if (viewGroup != null) {
            try {
                C0516o.m2171a(viewGroup, mVarArr[0]);
            } catch (NullPointerException unused) {
            }
        }
    }

    /* renamed from: a */
    public static final void m82904a(View view, AwemeTextLabelModel awemeTextLabelModel) {
        long j;
        if (view != null) {
            if (awemeTextLabelModel != null) {
                j = C47891a.m148823b(awemeTextLabelModel.getShowSeconds() * 1000.0f);
            } else {
                j = 0;
            }
            view.setTag(f66521b, Long.valueOf(j));
        }
    }

    /* renamed from: a */
    public static final void m82906a(ViewGroup viewGroup, ViewGroup viewGroup2) {
        long j;
        if (viewGroup2 != null) {
            Iterator a = C7605h.m23662f(m82908b(viewGroup2)).mo19416a();
            while (a.hasNext()) {
                View view = (View) a.next();
                Object tag = view.getTag(f66521b);
                if (!(tag instanceof Long)) {
                    tag = null;
                }
                Long l = (Long) tag;
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = 0;
                }
                if (j > 0) {
                    view.postDelayed(new C25214b(view, viewGroup, viewGroup2), j);
                } else {
                    f66520a.mo65827a(viewGroup, viewGroup2, view);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo65827a(ViewGroup viewGroup, View view, View view2) {
        long j;
        C7573i.m23587b(view, "tagLayout");
        C7573i.m23587b(view2, "child");
        if (view2.getVisibility() != 0) {
            Object tag = view2.getTag(f66521b);
            if (!(tag instanceof Long)) {
                tag = null;
            }
            Long l = (Long) tag;
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            view2.setVisibility(0);
            if (j <= 0 || view.getVisibility() != 0) {
                view2.setAlpha(1.0f);
                m82907a(viewGroup, new C0476c());
                view.setVisibility(0);
                return;
            }
            view2.setAlpha(0.0f);
            view2.animate().alpha(1.0f).setDuration(200).start();
        }
    }
}
