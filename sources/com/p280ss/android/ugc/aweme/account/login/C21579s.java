package com.p280ss.android.ugc.aweme.account.login;

import bolts.C1592h;
import com.google.gson.C18373n;
import com.google.gson.C6600e;
import com.google.gson.C6609h;
import com.google.gson.C6709k;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.C21677bj;
import com.p280ss.android.ugc.aweme.account.login.model.AccountPassLoginMethod;
import com.p280ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.p280ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.p280ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.p280ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.p1877a.C47886a;
import kotlin.sequences.C7605h;

/* renamed from: com.ss.android.ugc.aweme.account.login.s */
public final class C21579s {

    /* renamed from: a */
    public static final C21579s f57935a = new C21579s();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static boolean f57936b = C7163a.m22363a();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static List<BaseLoginMethod> f57937c = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static volatile boolean f57938d;

    /* renamed from: com.ss.android.ugc.aweme.account.login.s$a */
    static final class C21580a extends Lambda implements C7562b<BaseLoginMethod, C7581n> {

        /* renamed from: a */
        final /* synthetic */ List f57939a;

        C21580a(List list) {
            this.f57939a = list;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            mo57762a((BaseLoginMethod) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        public final void mo57762a(BaseLoginMethod baseLoginMethod) {
            C7573i.m23587b(baseLoginMethod, "newMethod");
            if (C21579s.m72311a(baseLoginMethod)) {
                this.f57939a.add(baseLoginMethod);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.s$b */
    static final class C21581b<V> implements Callable<TResult> {

        /* renamed from: a */
        public static final C21581b f57940a = new C21581b();

        /* renamed from: com.ss.android.ugc.aweme.account.login.s$b$a */
        public static final class C21582a<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                return C47886a.m148819a(((BaseLoginMethod) t2).getExpires(), ((BaseLoginMethod) t).getExpires());
            }
        }

        C21581b() {
        }

        public final /* synthetic */ Object call() {
            m72321a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private static void m72321a() {
            C21579s sVar = C21579s.f57935a;
            C21579s.f57937c = C7605h.m23665i(C7605h.m23650a(C7605h.m23652a(C7525m.m23526p(C21579s.f57937c), (Comparator<? super T>) new C21582a<Object>()), 5));
            ((C21639w) C21677bj.m72555a(C21671bd.m72532b(), C21639w.class)).mo57856a(new C6600e().mo15979b((Object) C21579s.f57937c));
            if (C21579s.f57936b) {
                Iterator it = C21579s.f57937c.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.s$c */
    static final class C21583c<V> implements Callable<List<? extends BaseLoginMethod>> {

        /* renamed from: a */
        public static final C21583c f57941a = new C21583c();

        C21583c() {
        }

        /* renamed from: a */
        private static List<BaseLoginMethod> m72322a() {
            return C21579s.f57937c;
        }

        public final /* synthetic */ Object call() {
            return m72322a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.s$d */
    static final class C21584d<V> implements Callable<List<? extends BaseLoginMethod>> {

        /* renamed from: a */
        public static final C21584d f57942a = new C21584d();

        C21584d() {
        }

        public final /* synthetic */ Object call() {
            return m72323a();
        }

        /* renamed from: a */
        private static List<BaseLoginMethod> m72323a() {
            if (C21579s.f57938d) {
                return C21579s.f57937c;
            }
            C21579s.f57937c = C21579s.m72312b();
            C21579s.f57935a.mo57761d();
            C21579s.f57938d = true;
            return C21579s.f57937c;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.s$e */
    static final class C21585e extends Lambda implements C7562b<BaseLoginMethod, Boolean> {

        /* renamed from: a */
        final /* synthetic */ BaseLoginMethod f57943a;

        C21585e(BaseLoginMethod baseLoginMethod) {
            this.f57943a = baseLoginMethod;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m72324a((BaseLoginMethod) obj));
        }

        /* renamed from: a */
        private boolean m72324a(BaseLoginMethod baseLoginMethod) {
            C7573i.m23587b(baseLoginMethod, "it");
            return C7573i.m23585a((Object) baseLoginMethod.getUid(), (Object) this.f57943a.getUid());
        }
    }

    private C21579s() {
    }

    /* renamed from: f */
    private static void m72318f() {
        C1592h.m7853a((Callable<TResult>) C21581b.f57940a);
    }

    /* renamed from: a */
    public static final C1592h<List<BaseLoginMethod>> m72304a() {
        if (f57938d) {
            C1592h<List<BaseLoginMethod>> a = C1592h.m7853a((Callable<TResult>) C21583c.f57941a);
            C7573i.m23582a((Object) a, "Task.callInBackground(Ca…@Callable loginMethods })");
            return a;
        }
        C1592h<List<BaseLoginMethod>> a2 = C1592h.m7853a((Callable<TResult>) C21584d.f57942a);
        C7573i.m23582a((Object) a2, "Task.callInBackground(Ca…ethods\n                })");
        return a2;
    }

    /* renamed from: e */
    private static boolean m72317e() {
        return ((C21639w) C21677bj.m72555a(C21671bd.m72532b(), C21639w.class)).mo57859b(true);
    }

    /* renamed from: d */
    public final void mo57761d() {
        boolean z;
        boolean z2;
        Iterable iterable = f57937c;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((BaseLoginMethod) it.next()).isExpired()) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        if (z) {
            Iterable iterable2 = f57937c;
            Collection arrayList = new ArrayList();
            for (Object next : iterable2) {
                BaseLoginMethod baseLoginMethod = (BaseLoginMethod) next;
                if (!baseLoginMethod.isExpired() || baseLoginMethod.getLoginMethodName() == LoginMethodName.DEFAULT) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(next);
                }
            }
            f57937c = C7525m.m23509d((Collection<? extends T>) (List) arrayList);
            m72318f();
        }
    }

    /* renamed from: b */
    public static List<BaseLoginMethod> m72312b() {
        List<BaseLoginMethod> arrayList = new ArrayList<>();
        C21580a aVar = new C21580a(arrayList);
        C6600e eVar = new C6600e();
        C6709k a = new C18373n().mo47346a(((C21639w) C21677bj.m72555a(C21671bd.m72532b(), C21639w.class)).mo57858b("[]"));
        if (a != null) {
            for (C6709k kVar : (C6609h) a) {
                C7573i.m23582a((Object) kVar, "it");
                C6709k b = kVar.mo16136m().mo16149b("loginMethodName");
                C7573i.m23582a((Object) b, "it.asJsonObject[\"loginMethodName\"]");
                String c = b.mo15998c();
                if (C7573i.m23585a((Object) c, (Object) LoginMethodName.EMAIL_PASS.name()) || C7573i.m23585a((Object) c, (Object) LoginMethodName.USER_NAME_PASS.name())) {
                    Object a2 = eVar.mo15970a(kVar, AccountPassLoginMethod.class);
                    C7573i.m23582a(a2, "gson.fromJson(it, Accoun…sLoginMethod::class.java)");
                    aVar.mo57762a((BaseLoginMethod) a2);
                } else if (C7573i.m23585a((Object) c, (Object) LoginMethodName.PHONE_NUMBER_PASS.name()) || C7573i.m23585a((Object) c, (Object) LoginMethodName.PHONE_SMS.name())) {
                    Object a3 = eVar.mo15970a(kVar, PhoneLoginMethod.class);
                    C7573i.m23582a(a3, "gson.fromJson(it, PhoneLoginMethod::class.java)");
                    aVar.mo57762a((BaseLoginMethod) a3);
                } else if (C7573i.m23585a((Object) c, (Object) LoginMethodName.THIRD_PARTY.name())) {
                    Object a4 = eVar.mo15970a(kVar, TPLoginMethod.class);
                    C7573i.m23582a(a4, "gson.fromJson(it, TPLoginMethod::class.java)");
                    aVar.mo57762a((BaseLoginMethod) a4);
                } else if (C7573i.m23585a((Object) c, (Object) LoginMethodName.DEFAULT.name())) {
                    Object a5 = eVar.mo15970a(kVar, BaseLoginMethod.class);
                    C7573i.m23582a(a5, "gson.fromJson(it, BaseLoginMethod::class.java)");
                    aVar.mo57762a((BaseLoginMethod) a5);
                }
            }
            return arrayList;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.google.gson.JsonArray");
    }

    /* renamed from: c */
    public static final BaseLoginMethod m72315c() {
        Object obj;
        BaseLoginMethod baseLoginMethod;
        if (!m72317e()) {
            BaseLoginMethod baseLoginMethod2 = new BaseLoginMethod(null, null, null, null, 15, null);
            return baseLoginMethod2;
        }
        f57935a.mo57761d();
        if (f57936b) {
            Iterator it = f57937c.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        Iterator it2 = f57937c.iterator();
        if (!it2.hasNext()) {
            obj = null;
        } else {
            obj = it2.next();
            if (it2.hasNext()) {
                Comparable expires = ((BaseLoginMethod) obj).getExpires();
                do {
                    Object next = it2.next();
                    Comparable expires2 = ((BaseLoginMethod) next).getExpires();
                    if (expires.compareTo(expires2) < 0) {
                        obj = next;
                        expires = expires2;
                    }
                } while (it2.hasNext());
            }
        }
        BaseLoginMethod baseLoginMethod3 = (BaseLoginMethod) obj;
        if (baseLoginMethod3 == null) {
            baseLoginMethod = new BaseLoginMethod(null, null, null, null, 15, null);
        } else {
            baseLoginMethod = baseLoginMethod3;
        }
        return baseLoginMethod;
    }

    /* renamed from: b */
    public static final void m72313b(BaseLoginMethod baseLoginMethod) {
        C7573i.m23587b(baseLoginMethod, "baseLoginMethod");
        C7525m.m23480a(f57937c, (C7562b<? super T, Boolean>) new C21585e<Object,Boolean>(baseLoginMethod));
        f57937c.add(baseLoginMethod);
        m72318f();
    }

    /* renamed from: a */
    public static boolean m72311a(BaseLoginMethod baseLoginMethod) {
        if (!(baseLoginMethod instanceof PhoneLoginMethod)) {
            baseLoginMethod = null;
        }
        PhoneLoginMethod phoneLoginMethod = (PhoneLoginMethod) baseLoginMethod;
        if (phoneLoginMethod != null && phoneLoginMethod.getPhoneNumber().getNationalNumber() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final void m72309a(User user) {
        C7573i.m23587b(user, "user");
        Iterable iterable = f57937c;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            if (C7573i.m23585a((Object) ((BaseLoginMethod) next).getUid(), (Object) user.getUid())) {
                arrayList.add(next);
            }
        }
        for (BaseLoginMethod updateUserInfo : (List) arrayList) {
            updateUserInfo.updateUserInfo(user);
        }
        m72318f();
    }

    /* renamed from: a */
    public static final BaseLoginMethod m72305a(LoginMethodName loginMethodName) {
        Object obj;
        BaseLoginMethod baseLoginMethod;
        boolean z;
        C7573i.m23587b(loginMethodName, "methodName");
        if (!m72317e()) {
            BaseLoginMethod baseLoginMethod2 = new BaseLoginMethod(null, null, null, null, 15, null);
            return baseLoginMethod2;
        }
        f57935a.mo57761d();
        Iterable iterable = f57937c;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            if (((BaseLoginMethod) next).getLoginMethodName() != loginMethodName) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        Iterator it = ((List) arrayList).iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            obj = it.next();
            if (it.hasNext()) {
                Comparable expires = ((BaseLoginMethod) obj).getExpires();
                do {
                    Object next2 = it.next();
                    Comparable expires2 = ((BaseLoginMethod) next2).getExpires();
                    if (expires.compareTo(expires2) < 0) {
                        obj = next2;
                        expires = expires2;
                    }
                } while (it.hasNext());
            }
        }
        BaseLoginMethod baseLoginMethod3 = (BaseLoginMethod) obj;
        if (baseLoginMethod3 == null) {
            baseLoginMethod = new BaseLoginMethod(null, null, null, null, 15, null);
        } else {
            baseLoginMethod = baseLoginMethod3;
        }
        return baseLoginMethod;
    }

    /* renamed from: a */
    public static final void m72310a(String str, long j) {
        Object obj;
        C7573i.m23587b(str, "userId");
        List arrayList = new ArrayList();
        for (BaseLoginMethod baseLoginMethod : f57937c) {
            if (C7573i.m23585a((Object) baseLoginMethod.getUid(), (Object) str)) {
                arrayList.add(baseLoginMethod);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            obj = it.next();
            if (it.hasNext()) {
                Comparable expires = ((BaseLoginMethod) obj).getExpires();
                do {
                    Object next = it.next();
                    Comparable expires2 = ((BaseLoginMethod) next).getExpires();
                    if (expires.compareTo(expires2) < 0) {
                        obj = next;
                        expires = expires2;
                    }
                } while (it.hasNext());
            }
        }
        BaseLoginMethod baseLoginMethod2 = (BaseLoginMethod) obj;
        if (baseLoginMethod2 != null) {
            baseLoginMethod2.setExpires(new Date(j + 2592000000L));
        }
    }
}
