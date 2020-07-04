package com.p280ss.android.ugc.aweme.friends.recommendlist.repository;

import com.bytedance.jedi.model.p602d.C11789a;
import com.p280ss.android.ugc.aweme.friends.recommendlist.repository.RecommendApi.C30055a;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.a */
public final class C30065a extends C11789a<String, String, String, String> {

    /* renamed from: a */
    private final RecommendApi f79036a = C30055a.m98524a();

    /* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.a$a */
    static final class C30066a<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        final /* synthetic */ String f79037a;

        C30066a(String str) {
            this.f79037a = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String apply(C7581n nVar) {
            C7573i.m23587b(nVar, "it");
            return this.f79037a;
        }
    }

    /* renamed from: a */
    private static String m98526a(String str, String str2) {
        C7573i.m23587b(str, "req");
        C7573i.m23587b(str2, "resp");
        return str2;
    }

    /* renamed from: b */
    private static String m98527b(String str) {
        C7573i.m23587b(str, "req");
        return str;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo29352b(Object obj) {
        return m98527b((String) obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C7492s<String> mo29350a(String str) {
        C7573i.m23587b(str, "req");
        C7492s<String> d = this.f79036a.dislikeRecommend(str).mo19317d((C7327h<? super T, ? extends R>) new C30066a<Object,Object>(str));
        C7573i.m23582a((Object) d, "service.dislikeRecommend(req).map { req }");
        return d;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo29351a(Object obj, Object obj2) {
        return m98526a((String) obj, (String) obj2);
    }
}
