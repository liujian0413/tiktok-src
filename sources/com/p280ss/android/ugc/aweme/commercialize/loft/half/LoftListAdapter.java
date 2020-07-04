package com.p280ss.android.ugc.aweme.commercialize.loft.half;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.loft.half.LoftListAdapter */
public final class LoftListAdapter extends C1262a<HomeView> {

    /* renamed from: a */
    public CrossPlatformWebView f65549a;

    /* renamed from: b */
    public String f65550b;

    /* renamed from: c */
    public int f65551c = C23486n.m77122a(400.0d);

    /* renamed from: d */
    private final Context f65552d;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.half.LoftListAdapter$HomeView */
    public static final class HomeView extends C1293v {
        public HomeView(CrossPlatformWebView crossPlatformWebView) {
            C7573i.m23587b(crossPlatformWebView, "itemView");
            super(crossPlatformWebView);
        }
    }

    public final int getItemCount() {
        return 1;
    }

    public LoftListAdapter(Context context) {
        C7573i.m23587b(context, "context");
        this.f65552d = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public HomeView onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        CrossPlatformWebView crossPlatformWebView = new CrossPlatformWebView(this.f65552d, null, 0, 6, null);
        this.f65549a = crossPlatformWebView;
        CrossPlatformWebView crossPlatformWebView2 = this.f65549a;
        if (crossPlatformWebView2 == null) {
            C7573i.m23580a();
        }
        return new HomeView(crossPlatformWebView2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(HomeView homeView, int i) {
        C7573i.m23587b(homeView, "holder");
        if (homeView.itemView != null) {
            View view = homeView.itemView;
            C7573i.m23582a((Object) view, "holder.itemView");
            ((CrossPlatformWebView) view).setLayoutParams(new LayoutParams(-1, this.f65551c));
            ((CrossPlatformWebView) homeView.itemView).mo67464a(1, 0, C23486n.m77122a(143.0d), 0, 0);
            String str = this.f65550b;
            if (str != null) {
                ((CrossPlatformWebView) homeView.itemView).mo67474a(str, false);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView");
    }
}
