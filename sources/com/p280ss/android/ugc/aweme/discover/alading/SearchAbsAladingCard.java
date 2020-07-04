package com.p280ss.android.ugc.aweme.discover.alading;

import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import com.p280ss.android.ugc.aweme.discover.adapter.C26501r;
import com.p280ss.android.ugc.aweme.discover.mixfeed.p1181a.C26743b;
import com.p280ss.android.ugc.aweme.discover.mixfeed.p1181a.C26743b.C26744a;
import com.p280ss.android.ugc.aweme.discover.mixfeed.p1181a.C26745c;
import com.p280ss.android.ugc.aweme.discover.mob.C26804x.C26805a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.discover.alading.SearchAbsAladingCard */
public abstract class SearchAbsAladingCard<ITEM> extends C1293v implements C26743b {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f70027a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SearchAbsAladingCard.class), "param", "getParam()Lcom/ss/android/ugc/aweme/discover/adapter/MobParam;"))};

    /* renamed from: b */
    public RecyclerView f70028b;

    /* renamed from: c */
    private final C7541d f70029c;

    /* renamed from: com.ss.android.ugc.aweme.discover.alading.SearchAbsAladingCard$a */
    static final class C26545a extends Lambda implements C7561a<C26501r> {

        /* renamed from: a */
        final /* synthetic */ View f70030a;

        C26545a(View view) {
            this.f70030a = view;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C26501r invoke() {
            return C26805a.m88001a(this.f70030a);
        }
    }

    /* renamed from: a */
    public final C26501r mo68174a() {
        return (C26501r) this.f70029c.getValue();
    }

    /* renamed from: b */
    public Map<String, String> mo68176b() {
        return C26744a.m87799a(this);
    }

    /* renamed from: c */
    public Map<String, String> mo68178c() {
        return C26744a.m87800b(this);
    }

    /* renamed from: a */
    public void mo68175a(Map<String, String> map) {
        Map b = mo68176b();
        if (!(map == null || b == null)) {
            b.putAll(map);
        }
        C26745c.m87801a(mo68174a(), getAdapterPosition(), map);
    }

    /* renamed from: b */
    public void mo68177b(Map<String, String> map) {
        Map c = mo68178c();
        if (!(map == null || c == null)) {
            c.putAll(map);
        }
        C26745c.m87803b(mo68174a(), getAdapterPosition(), map);
    }

    public SearchAbsAladingCard(View view, List<? extends ITEM> list) {
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(list, "list");
        super(view);
        this.f70029c = C7546e.m23569a(new C26545a(view));
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.tc);
        C7573i.m23582a((Object) recyclerView, "itemView.card_list");
        this.f70028b = recyclerView;
        this.f70028b.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        ((ScrollToOpenLayout) view.findViewById(R.id.czh)).setEnable(false);
    }
}
