package com.p280ss.android.ugc.aweme.discover.mixfeed.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.discover.adapter.AbsSearchViewHolder;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchCustomViewHolder */
public final class SearchCustomViewHolder extends AbsSearchViewHolder {

    /* renamed from: c */
    public static final C26760a f70573c = new C26760a(null);

    /* renamed from: d */
    private DmtTextView f70574d;

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchCustomViewHolder$a */
    public static final class C26760a {
        private C26760a() {
        }

        public /* synthetic */ C26760a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public final SearchCustomViewHolder mo68507a(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "parent");
            return m87839a(viewGroup, false);
        }

        /* renamed from: a */
        private static SearchCustomViewHolder m87839a(ViewGroup viewGroup, boolean z) {
            C7573i.m23587b(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a_v, viewGroup, false);
            C7573i.m23582a((Object) inflate, "view");
            return new SearchCustomViewHolder(inflate);
        }
    }

    /* renamed from: d */
    public final View mo67902d() {
        View view = this.itemView;
        C7573i.m23582a((Object) view, "itemView");
        return view;
    }

    /* renamed from: a */
    public final void mo68506a(String str) {
        C7573i.m23587b(str, "title");
        DmtTextView dmtTextView = this.f70574d;
        if (dmtTextView != null) {
            dmtTextView.setText(str);
        }
    }

    public SearchCustomViewHolder(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
        this.f70574d = (DmtTextView) view.findViewById(R.id.d16);
        View findViewById = view.findViewById(R.id.d1a);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        View findViewById2 = view.findViewById(R.id.bbo);
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
    }
}
