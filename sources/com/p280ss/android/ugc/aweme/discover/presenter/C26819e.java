package com.p280ss.android.ugc.aweme.discover.presenter;

import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23084b;
import com.p280ss.android.ugc.aweme.discover.api.SuggestWordsApi;
import com.p280ss.android.ugc.aweme.discover.api.p1174a.C26569b;
import com.p280ss.android.ugc.aweme.discover.helper.C26654b;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.discover.presenter.e */
public final class C26819e {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f70768a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C26819e.class), "enableGuessWordPreload", "getEnableGuessWordPreload()Z"))};

    /* renamed from: b */
    public static final C26819e f70769b = new C26819e();

    /* renamed from: c */
    private static C23084b<C26820a> f70770c = new C23084b<>();

    /* renamed from: d */
    private static final C7541d f70771d = C7546e.m23569a(C26821b.f70774a);

    /* renamed from: com.ss.android.ugc.aweme.discover.presenter.e$a */
    public static final class C26820a {

        /* renamed from: a */
        public final int f70772a;

        /* renamed from: b */
        public final String f70773b;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C26820a) {
                    C26820a aVar = (C26820a) obj;
                    if (!(this.f70772a == aVar.f70772a) || !C7573i.m23585a((Object) this.f70773b, (Object) aVar.f70773b)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.f70772a) * 31;
            String str = this.f70773b;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Result(code=");
            sb.append(this.f70772a);
            sb.append(", data=");
            sb.append(this.f70773b);
            sb.append(")");
            return sb.toString();
        }

        public C26820a(int i, String str) {
            this.f70772a = i;
            this.f70773b = str;
        }

        public /* synthetic */ C26820a(int i, String str, int i2, C7571f fVar) {
            this(0, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.presenter.e$b */
    static final class C26821b extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        public static final C26821b f70774a = new C26821b();

        C26821b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(m88105a());
        }

        /* renamed from: a */
        private static boolean m88105a() {
            if (!C6384b.m19835a().mo15292a(SearchIntermediateDataPreload.class, true, "rn_search_transfer_preload_data", C6384b.m19835a().mo15295d().rn_search_transfer_preload_data, true) || !C26654b.m87576d()) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.presenter.e$c */
    static final class C26822c<TTaskResult, TContinuationResult> implements C1591g<String, Object> {

        /* renamed from: a */
        public static final C26822c f70775a = new C26822c();

        C26822c() {
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            return m88106a(hVar);
        }

        /* renamed from: a */
        private static Void m88106a(C1592h<String> hVar) {
            C7573i.m23582a((Object) hVar, "task");
            int i = 0;
            if (hVar.mo6889d()) {
                C26819e.m88101a().setValue(new C26820a(0, null, 2, null));
            } else {
                String str = (String) hVar.mo6890e();
                C23084b a = C26819e.m88101a();
                if (str != null) {
                    i = 1;
                }
                a.setValue(new C26820a(i, str));
            }
            return null;
        }
    }

    private C26819e() {
    }

    /* renamed from: a */
    public static C23084b<C26820a> m88101a() {
        return f70770c;
    }

    /* renamed from: b */
    public final boolean mo69480b() {
        return ((Boolean) f70771d.getValue()).booleanValue();
    }

    /* renamed from: c */
    public final void mo69481c() {
        if (mo69480b()) {
            f70770c = new C23084b<>();
        }
    }

    /* renamed from: a */
    public final void mo69479a(String str) {
        String str2;
        if (mo69480b()) {
            if (C6399b.m19944t()) {
                str2 = "30000";
            } else {
                str2 = "10005";
            }
            ((SuggestWordsApi) C26569b.f70092b.create(SuggestWordsApi.class)).getSuggestWordsWithRawString(str2, str, "").mo6876a((C1591g<TResult, TContinuationResult>) C26822c.f70775a, C1592h.f5958b);
        }
    }
}
