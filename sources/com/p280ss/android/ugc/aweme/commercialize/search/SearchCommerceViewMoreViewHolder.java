package com.p280ss.android.ugc.aweme.commercialize.search;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23764b;
import com.p280ss.android.ugc.aweme.commercialize.model.SearchCommerceInfoStruct;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.commercialize.search.SearchCommerceViewMoreViewHolder */
public final class SearchCommerceViewMoreViewHolder extends C1293v {

    /* renamed from: a */
    public final C7562b<String, C7581n> f66103a;

    /* renamed from: b */
    public final C7562b<SearchCommerceInfoStruct, C7581n> f66104b;

    /* renamed from: c */
    private final RemoteImageView f66105c;

    /* renamed from: d */
    private final DmtTextView f66106d;

    /* renamed from: e */
    private final DmtTextView f66107e;

    /* renamed from: f */
    private final DmtTextView f66108f;

    /* renamed from: g */
    private final RelativeLayout f66109g;

    /* renamed from: h */
    private final C7562b<SearchCommerceInfoStruct, C7581n> f66110h;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.search.SearchCommerceViewMoreViewHolder$a */
    static final class C25045a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchCommerceViewMoreViewHolder f66111a;

        /* renamed from: b */
        final /* synthetic */ SearchCommerceInfoStruct f66112b;

        C25045a(SearchCommerceViewMoreViewHolder searchCommerceViewMoreViewHolder, SearchCommerceInfoStruct searchCommerceInfoStruct) {
            this.f66111a = searchCommerceViewMoreViewHolder;
            this.f66112b = searchCommerceInfoStruct;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C7562b<String, C7581n> bVar = this.f66111a.f66103a;
            String str = this.f66112b.url;
            C7573i.m23582a((Object) str, "info.url");
            bVar.invoke(str);
            this.f66111a.f66104b.invoke(this.f66112b);
        }
    }

    /* renamed from: a */
    public final void mo65531a(SearchCommerceInfoStruct searchCommerceInfoStruct) {
        C7573i.m23587b(searchCommerceInfoStruct, "info");
        C23323e.m76514a(this.f66105c, searchCommerceInfoStruct.icon);
        DmtTextView dmtTextView = this.f66106d;
        C7573i.m23582a((Object) dmtTextView, "title");
        String str = searchCommerceInfoStruct.title;
        if (str == null) {
            str = "";
        }
        dmtTextView.setText(str);
        DmtTextView dmtTextView2 = this.f66107e;
        C7573i.m23582a((Object) dmtTextView2, "desc");
        String str2 = searchCommerceInfoStruct.desc;
        if (str2 == null) {
            str2 = "";
        }
        dmtTextView2.setText(str2);
        if (C23764b.m77913a(searchCommerceInfoStruct.btnText)) {
            RelativeLayout relativeLayout = this.f66109g;
            C7573i.m23582a((Object) relativeLayout, "layoutBtn");
            relativeLayout.setVisibility(0);
            DmtTextView dmtTextView3 = this.f66108f;
            C7573i.m23582a((Object) dmtTextView3, "btn");
            dmtTextView3.setText(searchCommerceInfoStruct.btnText);
        } else {
            RelativeLayout relativeLayout2 = this.f66109g;
            C7573i.m23582a((Object) relativeLayout2, "layoutBtn");
            relativeLayout2.setVisibility(8);
        }
        this.f66110h.invoke(searchCommerceInfoStruct);
        this.itemView.setOnClickListener(new C25045a(this, searchCommerceInfoStruct));
    }

    public SearchCommerceViewMoreViewHolder(View view, C7562b<? super String, C7581n> bVar, C7562b<? super SearchCommerceInfoStruct, C7581n> bVar2, C7562b<? super SearchCommerceInfoStruct, C7581n> bVar3) {
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(bVar, "click");
        C7573i.m23587b(bVar2, "mobViewMoreShow");
        C7573i.m23587b(bVar3, "mobViewMoreClick");
        super(view);
        this.f66103a = bVar;
        this.f66110h = bVar2;
        this.f66104b = bVar3;
        this.f66105c = (RemoteImageView) view.findViewById(R.id.ecc);
        this.f66106d = (DmtTextView) view.findViewById(R.id.ecd);
        this.f66107e = (DmtTextView) view.findViewById(R.id.ecb);
        this.f66108f = (DmtTextView) view.findViewById(R.id.eca);
        this.f66109g = (RelativeLayout) view.findViewById(R.id.bgg);
    }
}
