package com.p280ss.android.ugc.aweme.discover.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.discover.mixfeed.p1181a.C26741a;
import com.p280ss.android.ugc.aweme.discover.mixfeed.p1181a.C26741a.C26742a;
import com.p280ss.android.ugc.aweme.discover.mixfeed.p1181a.C26745c;
import com.p280ss.android.ugc.aweme.discover.mob.C26804x.C26805a;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.AbsSearchViewHolder */
public abstract class AbsSearchViewHolder extends C1293v implements C26741a {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f69404a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(AbsSearchViewHolder.class), "param", "getParam()Lcom/ss/android/ugc/aweme/discover/adapter/MobParam;"))};

    /* renamed from: b */
    public C26501r f69405b = new C26501r(false);

    /* renamed from: c */
    private final C7541d f69406c;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.AbsSearchViewHolder$a */
    static final class C26370a extends Lambda implements C7561a<C26501r> {

        /* renamed from: a */
        final /* synthetic */ View f69407a;

        C26370a(View view) {
            this.f69407a = view;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C26501r invoke() {
            return C26805a.m88001a(this.f69407a);
        }
    }

    /* renamed from: a */
    public final C26501r mo67895a() {
        return (C26501r) this.f69406c.getValue();
    }

    /* renamed from: d */
    public View mo67902d() {
        View view = this.itemView;
        C7573i.m23582a((Object) view, "itemView");
        return view;
    }

    /* renamed from: e */
    public Map<String, String> mo67903e() {
        return C26742a.m87795a(this);
    }

    /* renamed from: f */
    public Map<String, String> mo67904f() {
        return C26742a.m87796b(this);
    }

    /* renamed from: b */
    public final Context mo67898b() {
        View view = this.itemView;
        C7573i.m23582a((Object) view, "itemView");
        Context context = view.getContext();
        C7573i.m23582a((Object) context, "itemView.context");
        return context;
    }

    /* renamed from: c */
    public final FragmentActivity mo67901c() {
        Activity e = C23487o.m77158e(mo67902d());
        if (e != null) {
            return (FragmentActivity) e;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public final void mo67896a(C26501r rVar) {
        C7573i.m23587b(rVar, "<set-?>");
        this.f69405b = rVar;
    }

    /* renamed from: b */
    public final AbsSearchViewHolder mo67899b(C26501r rVar) {
        if (rVar != null) {
            mo67896a(rVar);
        }
        return this;
    }

    public AbsSearchViewHolder(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
        this.f69406c = C7546e.m23569a(new C26370a(view));
    }

    /* renamed from: a */
    public void mo67897a(Map<String, String> map) {
        C26501r a = mo67895a();
        if (a != null) {
            SearchResultParam searchResultParam = a.f69898b;
            if (searchResultParam != null) {
                searchResultParam.setRankInList(getLayoutPosition());
            }
        }
        Map e = mo67903e();
        if (!(map == null || e == null)) {
            e.putAll(map);
        }
        C26745c.m87802a(mo67895a(), e);
    }

    /* renamed from: b */
    public final void mo67900b(Map<String, String> map) {
        C26501r a = mo67895a();
        if (a != null) {
            SearchResultParam searchResultParam = a.f69898b;
            if (searchResultParam != null) {
                searchResultParam.setRankInList(getLayoutPosition());
            }
        }
        Map e = mo67903e();
        if (!(map == null || e == null)) {
            e.putAll(map);
        }
        C26745c.m87804b(mo67895a(), e);
    }
}
