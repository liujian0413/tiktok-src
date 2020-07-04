package com.p280ss.android.ugc.aweme.filter;

import android.content.Context;
import com.p280ss.android.ugc.aweme.filter.p1246e.C29288a;
import com.p280ss.android.ugc.aweme.filter.p1246e.C29289b;
import com.p280ss.android.ugc.aweme.filter.p1246e.C29290c;
import com.p280ss.android.ugc.aweme.filter.p1246e.C29291d;
import com.p280ss.android.ugc.aweme.filter.p1247f.C29294b;
import com.p280ss.android.ugc.aweme.filter.p1247f.C29294b.C29295a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.p1551c.C38555b;
import com.p280ss.android.ugc.aweme.shortvideo.p1551c.C38561g;
import com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39369c;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41525ah;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.filter.u */
public final class C29332u implements C29288a {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f77328a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C29332u.class), "filterConfig", "getFilterConfig()Lcom/ss/android/ugc/aweme/filter/services/IFilterConfig;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C29332u.class), "filterDataService", "getFilterDataService()Lcom/ss/android/ugc/aweme/filter/services/IFilterDataService;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C29332u.class), "filterManager", "getFilterManager()Lcom/ss/android/ugc/aweme/filter/services/IFilterManager;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C29332u.class), "filterSource", "getFilterSource()Lcom/ss/android/ugc/aweme/filter/source/IFilterSource;"))};

    /* renamed from: b */
    private final C7541d f77329b = C7546e.m23569a(C29333a.f77333a);

    /* renamed from: c */
    private final C7541d f77330c = C7546e.m23569a(C29334b.f77334a);

    /* renamed from: d */
    private final C7541d f77331d = C7546e.m23569a(C29335c.f77335a);

    /* renamed from: e */
    private final C7541d f77332e = C7546e.m23569a(C29336d.f77336a);

    /* renamed from: com.ss.android.ugc.aweme.filter.u$a */
    static final class C29333a extends Lambda implements C7561a<C29338w> {

        /* renamed from: a */
        public static final C29333a f77333a = new C29333a();

        C29333a() {
            super(0);
        }

        /* renamed from: a */
        private static C29338w m96211a() {
            return new C29338w();
        }

        public final /* synthetic */ Object invoke() {
            return m96211a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.u$b */
    static final class C29334b extends Lambda implements C7561a<C29339x> {

        /* renamed from: a */
        public static final C29334b f77334a = new C29334b();

        C29334b() {
            super(0);
        }

        /* renamed from: a */
        private static C29339x m96212a() {
            return new C29339x();
        }

        public final /* synthetic */ Object invoke() {
            return m96212a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.u$c */
    static final class C29335c extends Lambda implements C7561a<FilterManager> {

        /* renamed from: a */
        public static final C29335c f77335a = new C29335c();

        C29335c() {
            super(0);
        }

        /* renamed from: a */
        private static FilterManager m96213a() {
            return FilterManager.m95700a();
        }

        public final /* synthetic */ Object invoke() {
            return m96213a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.u$d */
    static final class C29336d extends Lambda implements C7561a<C29218ar> {

        /* renamed from: a */
        public static final C29336d f77336a = new C29336d();

        C29336d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m96214a();
        }

        /* renamed from: a */
        private static C29218ar m96214a() {
            C29218ar arVar = new C29218ar();
            arVar.mo74822a((C29295a) FilterManager.m95700a());
            return arVar;
        }
    }

    /* renamed from: a */
    public final C29289b mo74948a() {
        return (C29289b) this.f77329b.getValue();
    }

    /* renamed from: b */
    public final C29290c mo74949b() {
        return (C29290c) this.f77330c.getValue();
    }

    /* renamed from: c */
    public final C29291d mo74950c() {
        return (C29291d) this.f77331d.getValue();
    }

    /* renamed from: d */
    public final C29294b mo74951d() {
        return (C29294b) this.f77332e.getValue();
    }

    /* renamed from: e */
    public final void mo74952e() {
        C41525ah.m132266a();
    }

    /* renamed from: g */
    public final void mo74954g() {
        C38555b a = C38561g.m123243a();
        C35563c.f93230L.mo93348g(a.mo96545b());
        C35563c.f93230L.mo93348g(a.mo96543a());
    }

    /* renamed from: f */
    public final C29229ay mo74953f() {
        if (C35563c.f93231M.mo93305a(Property.EnableFilterIntensityJust)) {
            return new C29292f(new EffectFilterAdapter(new C39369c(mo74950c().mo74723f())));
        }
        return new C29292f(new EffectPhotoEditFilterAdapter(new C39369c(mo74950c().mo74723f())));
    }

    /* renamed from: a */
    public final C29244bf mo74947a(Context context) {
        C7573i.m23587b(context, "context");
        return new C29261bq(new PhotoEditFilterAdapter(context));
    }
}
