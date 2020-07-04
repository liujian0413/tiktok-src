package com.p280ss.android.ugc.aweme.discover.p1185ui;

import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.StaggeredGridLayoutManager;
import android.support.transition.C0498l;
import android.support.transition.C0508m;
import android.support.transition.C0508m.C0514c;
import android.support.transition.C0515n;
import android.support.transition.C0516o;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.discover.base.HeaderAndFooterWrapper;
import com.p280ss.android.ugc.aweme.discover.model.GuideSearchWord;
import com.p280ss.android.ugc.aweme.discover.widget.GuideSearchHeadView;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.GuideSearchBar */
public final class GuideSearchBar extends C1281m {

    /* renamed from: a */
    public boolean f70980a;

    /* renamed from: b */
    private boolean f70981b;

    /* renamed from: c */
    private final GuideSearchHeadView f70982c;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.GuideSearchBar$a */
    public static final class C26898a extends C0515n {

        /* renamed from: a */
        final /* synthetic */ GuideSearchBar f70983a;

        C26898a(GuideSearchBar guideSearchBar) {
            this.f70983a = guideSearchBar;
        }

        /* renamed from: a */
        public final void mo2042a(C0508m mVar) {
            C7573i.m23587b(mVar, "p0");
            this.f70983a.f70980a = false;
        }

        /* renamed from: d */
        public final void mo2045d(C0508m mVar) {
            C7573i.m23587b(mVar, "transition");
            this.f70983a.f70980a = true;
        }
    }

    /* renamed from: a */
    private final void m88325a() {
        this.f70982c.setVisibility(8);
    }

    public GuideSearchBar(GuideSearchHeadView guideSearchHeadView) {
        C7573i.m23587b(guideSearchHeadView, "guideSearchBar");
        this.f70982c = guideSearchHeadView;
    }

    /* renamed from: a */
    private final void m88326a(boolean z) {
        int i;
        if (!this.f70980a) {
            C0498l lVar = new C0498l();
            lVar.mo2117a((C0514c) new C26898a(this));
            lVar.mo2112a(48);
            lVar.mo2115a(300);
            ViewParent parent = this.f70982c.getParent();
            if (parent != null) {
                C0516o.m2171a((ViewGroup) parent, lVar);
                GuideSearchHeadView guideSearchHeadView = this.f70982c;
                if (z) {
                    i = 8;
                } else {
                    i = 0;
                }
                guideSearchHeadView.setVisibility(i);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    /* renamed from: a */
    public final void mo69586a(List<GuideSearchWord> list, String str, String str2) {
        C7573i.m23587b(str, "originalKeyword");
        C7573i.m23587b(str2, "labelName");
        this.f70981b = !C6307b.m19566a((Collection<T>) list);
        if (!this.f70981b) {
            m88325a();
            return;
        }
        GuideSearchHeadView guideSearchHeadView = this.f70982c;
        if (list == null) {
            C7573i.m23580a();
        }
        guideSearchHeadView.mo70025a(list, str, str2);
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        C7573i.m23587b(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        if (this.f70981b && i2 != 0) {
            C1262a adapter = recyclerView.getAdapter();
            if (!(adapter instanceof HeaderAndFooterWrapper)) {
                adapter = null;
            }
            HeaderAndFooterWrapper headerAndFooterWrapper = (HeaderAndFooterWrapper) adapter;
            if (headerAndFooterWrapper != null) {
                List b = headerAndFooterWrapper.mo68260b();
                int size = b.size();
                boolean z = false;
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    } else if (!(b.get(i3) instanceof GuideSearchHeadView)) {
                        i3++;
                    } else if (b.get(i3) == null) {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.widget.GuideSearchHeadView");
                    }
                }
                C1273i layoutManager = recyclerView.getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    ((LinearLayoutManager) layoutManager).mo5445j();
                } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                    StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                    staggeredGridLayoutManager.mo6009a(new int[staggeredGridLayoutManager.f5123a]);
                }
                if (i2 > 0) {
                    z = true;
                }
                m88326a(z);
            }
        }
    }
}
