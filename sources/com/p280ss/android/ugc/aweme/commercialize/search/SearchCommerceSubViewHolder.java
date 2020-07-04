package com.p280ss.android.ugc.aweme.commercialize.search;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.commercialize.model.SearchCommerceInfoStruct;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.commercialize.search.SearchCommerceSubViewHolder */
public final class SearchCommerceSubViewHolder extends C1293v {

    /* renamed from: a */
    public final C7562b<String, C7581n> f66091a;

    /* renamed from: b */
    public final C7562b<SearchCommerceInfoStruct, C7581n> f66092b;

    /* renamed from: c */
    private final RemoteImageView f66093c;

    /* renamed from: d */
    private final DmtTextView f66094d;

    /* renamed from: e */
    private final DmtTextView f66095e;

    /* renamed from: f */
    private final C7562b<SearchCommerceInfoStruct, C7581n> f66096f;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.search.SearchCommerceSubViewHolder$a */
    static final class C25044a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchCommerceSubViewHolder f66097a;

        /* renamed from: b */
        final /* synthetic */ SearchCommerceInfoStruct f66098b;

        C25044a(SearchCommerceSubViewHolder searchCommerceSubViewHolder, SearchCommerceInfoStruct searchCommerceInfoStruct) {
            this.f66097a = searchCommerceSubViewHolder;
            this.f66098b = searchCommerceInfoStruct;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C7562b<String, C7581n> bVar = this.f66097a.f66091a;
            String str = this.f66098b.url;
            C7573i.m23582a((Object) str, "info.url");
            bVar.invoke(str);
            this.f66097a.f66092b.invoke(this.f66098b);
        }
    }

    /* renamed from: a */
    public final void mo65529a(SearchCommerceInfoStruct searchCommerceInfoStruct) {
        C7573i.m23587b(searchCommerceInfoStruct, "info");
        C23323e.m76514a(this.f66093c, searchCommerceInfoStruct.icon);
        DmtTextView dmtTextView = this.f66094d;
        C7573i.m23582a((Object) dmtTextView, "title");
        String str = searchCommerceInfoStruct.title;
        if (str == null) {
            str = "";
        }
        dmtTextView.setText(str);
        DmtTextView dmtTextView2 = this.f66095e;
        C7573i.m23582a((Object) dmtTextView2, "tip");
        String str2 = searchCommerceInfoStruct.tip;
        if (str2 == null) {
            str2 = "";
        }
        dmtTextView2.setText(str2);
        this.f66096f.invoke(searchCommerceInfoStruct);
        this.itemView.setOnClickListener(new C25044a(this, searchCommerceInfoStruct));
    }

    public SearchCommerceSubViewHolder(View view, C7562b<? super String, C7581n> bVar, C7562b<? super SearchCommerceInfoStruct, C7581n> bVar2, C7562b<? super SearchCommerceInfoStruct, C7581n> bVar3) {
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(bVar, "click");
        C7573i.m23587b(bVar2, "mobSubShow");
        C7573i.m23587b(bVar3, "mobSubClick");
        super(view);
        this.f66091a = bVar;
        this.f66096f = bVar2;
        this.f66092b = bVar3;
        this.f66093c = (RemoteImageView) view.findViewById(R.id.dcx);
        this.f66094d = (DmtTextView) view.findViewById(R.id.dcz);
        this.f66095e = (DmtTextView) view.findViewById(R.id.dcy);
    }
}
