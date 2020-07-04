package com.p280ss.android.ugc.aweme.discover.searchinter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.searchinter.SearchInterMainViewHolder */
public final class SearchInterMainViewHolder extends C1293v {

    /* renamed from: b */
    public static final C26872a f70886b = new C26872a(null);

    /* renamed from: a */
    public final AmeBaseFragment f70887a;

    /* renamed from: com.ss.android.ugc.aweme.discover.searchinter.SearchInterMainViewHolder$a */
    public static final class C26872a {
        private C26872a() {
        }

        public /* synthetic */ C26872a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static SearchInterMainViewHolder m88180a(ViewGroup viewGroup, AmeBaseFragment ameBaseFragment) {
            C7573i.m23587b(viewGroup, "parent");
            C7573i.m23587b(ameBaseFragment, "fragment");
            return new SearchInterMainViewHolder(viewGroup, ameBaseFragment);
        }
    }

    public SearchInterMainViewHolder(View view, AmeBaseFragment ameBaseFragment) {
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(ameBaseFragment, "fragment");
        super(view);
        this.f70887a = ameBaseFragment;
    }
}
