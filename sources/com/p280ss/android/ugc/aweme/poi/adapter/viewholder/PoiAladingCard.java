package com.p280ss.android.ugc.aweme.poi.adapter.viewholder;

import android.content.Context;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.discover.alading.ScrollToOpenLayout;
import com.p280ss.android.ugc.aweme.discover.alading.ScrollToOpenLayout.C26542b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiAladingCard */
public abstract class PoiAladingCard<ITEM> extends C1293v implements C26542b {

    /* renamed from: f */
    public static final C35017a f91477f = new C35017a(null);

    /* renamed from: a */
    public RecyclerView f91478a;

    /* renamed from: b */
    public final Context f91479b;

    /* renamed from: c */
    public ScrollToOpenLayout f91480c;

    /* renamed from: d */
    public DmtTextView f91481d;

    /* renamed from: e */
    public List<? extends ITEM> f91482e;

    /* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiAladingCard$a */
    public static final class C35017a {
        private C35017a() {
        }

        public /* synthetic */ C35017a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: b */
    public final int mo88786b() {
        List<? extends ITEM> list = this.f91482e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo88784a(List<? extends ITEM> list) {
        boolean z;
        this.f91482e = list;
        ScrollToOpenLayout scrollToOpenLayout = this.f91480c;
        if (mo88786b() >= 5) {
            z = true;
        } else {
            z = false;
        }
        scrollToOpenLayout.setEnable(z);
    }

    public PoiAladingCard(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.tc);
        C7573i.m23582a((Object) recyclerView, "itemView.card_list");
        this.f91478a = recyclerView;
        Context context = view.getContext();
        C7573i.m23582a((Object) context, "itemView.context");
        this.f91479b = context;
        ScrollToOpenLayout scrollToOpenLayout = (ScrollToOpenLayout) view.findViewById(R.id.czh);
        C7573i.m23582a((Object) scrollToOpenLayout, "itemView.scroll_to_open");
        this.f91480c = scrollToOpenLayout;
        DmtTextView dmtTextView = (DmtTextView) view.findViewById(R.id.dhf);
        C7573i.m23582a((Object) dmtTextView, "itemView.textView3");
        this.f91481d = dmtTextView;
        this.f91478a.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
    }

    /* renamed from: a */
    public final void mo88785a(boolean z, int i) {
        if (!z || i < 5) {
            this.f91480c.setOnScrollToEndListener(null);
            this.f91481d.setText(this.f91479b.getString(R.string.cmf));
            return;
        }
        this.f91480c.setOnScrollToEndListener(this);
        this.f91481d.setText(this.f91479b.getString(R.string.b5i));
    }
}
