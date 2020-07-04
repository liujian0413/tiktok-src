package com.p280ss.android.ugc.aweme.policy.notice.p1477b;

import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.policy.notice.api.C35504a;
import com.p280ss.android.ugc.aweme.policy.notice.api.C35506c;
import com.p280ss.android.ugc.aweme.policy.notice.api.PolicyNoticeApi.API;
import com.p280ss.android.ugc.aweme.policy.notice.api.PolicyNoticeApi.C35503a;
import com.p280ss.android.ugc.aweme.policy.notice.p1476a.C35500a;
import com.p280ss.android.ugc.aweme.policy.notice.p1476a.C35501b;
import com.p280ss.android.ugc.aweme.policy.notice.p1476a.C35502c;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.policy.notice.b.a */
public final class C35507a {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f93169a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C35507a.class), "mApi", "getMApi()Lcom/ss/android/ugc/aweme/policy/notice/api/PolicyNoticeApi$API;"))};

    /* renamed from: b */
    private final C7541d f93170b = C7546e.m23569a(C35509b.f93172a);

    /* renamed from: com.ss.android.ugc.aweme.policy.notice.b.a$a */
    static final class C35508a<TTaskResult, TContinuationResult> implements C1591g<C35506c, Object> {

        /* renamed from: a */
        public static final C35508a f93171a = new C35508a();

        C35508a() {
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            return m114668a(hVar);
        }

        /* renamed from: a */
        private static Void m114668a(C1592h<C35506c> hVar) {
            C7573i.m23582a((Object) hVar, "it");
            if (hVar.mo6889d()) {
                C42961az.m136380a(new C35500a());
                return null;
            } else if (hVar.mo6887c()) {
                C42961az.m136380a(new C35500a());
                return null;
            } else if (hVar.mo6882b()) {
                List<C35504a> list = ((C35506c) hVar.mo6890e()).f93168a;
                if (C6307b.m19566a((Collection<T>) list)) {
                    C42961az.m136380a(new C35500a());
                    return null;
                }
                Iterable iterable = list;
                Collection arrayList = new ArrayList();
                for (Object next : iterable) {
                    if (C7573i.m23585a((Object) ((C35504a) next).f93157c, (Object) "pop")) {
                        arrayList.add(next);
                    }
                }
                List list2 = (List) arrayList;
                Collection arrayList2 = new ArrayList();
                for (Object next2 : iterable) {
                    if (C7573i.m23585a((Object) ((C35504a) next2).f93157c, (Object) "float")) {
                        arrayList2.add(next2);
                    }
                }
                List list3 = (List) arrayList2;
                if (!list3.isEmpty()) {
                    if (list2.isEmpty()) {
                        C42961az.m136380a(new C35502c((C35504a) list3.get(0), null, 2, null));
                        return null;
                    }
                    C42961az.m136380a(new C35502c((C35504a) list3.get(0), (C35504a) list2.get(0)));
                    return null;
                } else if (!list2.isEmpty()) {
                    C42961az.m136380a(new C35501b((C35504a) list2.get(0)));
                    return null;
                } else {
                    C42961az.m136380a(new C35500a());
                    return null;
                }
            } else {
                C42961az.m136380a(new C35500a());
                return null;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.policy.notice.b.a$b */
    static final class C35509b extends Lambda implements C7561a<API> {

        /* renamed from: a */
        public static final C35509b f93172a = new C35509b();

        C35509b() {
            super(0);
        }

        /* renamed from: a */
        private static API m114669a() {
            return C35503a.m114664a();
        }

        public final /* synthetic */ Object invoke() {
            return m114669a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.policy.notice.b.a$c */
    static final class C35510c<TTaskResult, TContinuationResult> implements C1591g<BaseResponse, Object> {

        /* renamed from: a */
        public static final C35510c f93173a = new C35510c();

        C35510c() {
        }

        public final /* bridge */ /* synthetic */ Object then(C1592h hVar) {
            return null;
        }
    }

    /* renamed from: b */
    private final API m114665b() {
        return (API) this.f93170b.getValue();
    }

    /* renamed from: a */
    public final void mo90314a() {
        m114665b().getPolicyNotice().mo6876a((C1591g<TResult, TContinuationResult>) C35508a.f93171a, C1592h.f5958b);
    }

    /* renamed from: a */
    public final void mo90315a(String str, String str2, String str3, String str4) {
        m114665b().policyNoticeApprove(str, str2, str3, str4).mo6876a((C1591g<TResult, TContinuationResult>) C35510c.f93173a, C1592h.f5958b);
    }
}
