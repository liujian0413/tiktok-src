package com.p280ss.android.ugc.aweme.discover.searchinter;

import android.arch.lifecycle.C0043i;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.searchinter.SearchInterSecondFloorViewHolder */
public final class SearchInterSecondFloorViewHolder extends C1293v {

    /* renamed from: b */
    public static final C26873a f70888b = new C26873a(null);

    /* renamed from: a */
    public final AmeBaseFragment f70889a;

    /* renamed from: com.ss.android.ugc.aweme.discover.searchinter.SearchInterSecondFloorViewHolder$a */
    public static final class C26873a {
        private C26873a() {
        }

        public /* synthetic */ C26873a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static SearchInterSecondFloorViewHolder m88181a(ViewGroup viewGroup, AmeBaseFragment ameBaseFragment, C0043i iVar) {
            C7573i.m23587b(viewGroup, "parent");
            C7573i.m23587b(ameBaseFragment, "fragment");
            C7573i.m23587b(iVar, "owner");
            return new SearchInterSecondFloorViewHolder(new View(viewGroup.getContext()), ameBaseFragment, iVar);
        }
    }

    public SearchInterSecondFloorViewHolder(View view, AmeBaseFragment ameBaseFragment, C0043i iVar) {
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(ameBaseFragment, "fragment");
        C7573i.m23587b(iVar, "owner");
        super(view);
        this.f70889a = ameBaseFragment;
    }
}
