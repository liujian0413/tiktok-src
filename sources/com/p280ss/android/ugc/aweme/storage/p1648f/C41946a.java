package com.p280ss.android.ugc.aweme.storage.p1648f;

import com.google.common.base.C17427g;
import com.google.common.collect.C18054w;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.storage.p1647e.C41943f;
import com.p280ss.android.ugc.aweme.storage.p1648f.p1650b.C41952a;
import com.p280ss.android.ugc.aweme.storage.p1648f.p1650b.C41954b;
import com.p280ss.android.ugc.aweme.storage.p1648f.p1650b.C41955c;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import kotlin.text.Regex;

/* renamed from: com.ss.android.ugc.aweme.storage.f.a */
public final class C41946a implements C41943f {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f109009a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C41946a.class), "settingsWhiteList", "getSettingsWhiteList()Ljava/util/Set;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C41946a.class), "tempWhiteListProvider", "getTempWhiteListProvider()Lcom/ss/android/ugc/aweme/storage/whitelist/provider/TempWhiteListProvider;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C41946a.class), "persistedWhiteListProvider", "getPersistedWhiteListProvider()Lcom/ss/android/ugc/aweme/storage/whitelist/provider/PersistedWhiteListProvider;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C41946a.class), "draftWhiteListProvider", "getDraftWhiteListProvider()Lcom/ss/android/ugc/aweme/storage/whitelist/provider/DraftWhiteListProvider;"))};

    /* renamed from: b */
    private final C7541d f109010b = C7546e.m23569a(C41949c.f109016a);

    /* renamed from: c */
    private final C7541d f109011c = C7546e.m23570a(new C41955c());

    /* renamed from: d */
    private final C7541d f109012d = C7546e.m23570a(new C41954b());

    /* renamed from: e */
    private final C7541d f109013e = C7546e.m23570a(new C41952a());

    /* renamed from: com.ss.android.ugc.aweme.storage.f.a$a */
    static final class C41947a<F, T> implements C17427g<F, T> {

        /* renamed from: a */
        public static final C41947a f109014a = new C41947a();

        C41947a() {
        }

        /* renamed from: b */
        public final /* synthetic */ Object mo44914b(Object obj) {
            return m133408a((String) obj);
        }

        /* renamed from: a */
        private static String m133408a(String str) {
            if (str == null) {
                return null;
            }
            return new Regex("/data/user/0/").replaceFirst(str, "/data/data/");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.storage.f.a$b */
    static final class C41948b<F, T> implements C17427g<F, T> {

        /* renamed from: a */
        public static final C41948b f109015a = new C41948b();

        C41948b() {
        }

        /* renamed from: b */
        public final /* synthetic */ Object mo44914b(Object obj) {
            return m133410a((String) obj);
        }

        /* renamed from: a */
        private static String m133410a(String str) {
            if (str == null) {
                return null;
            }
            return new Regex("/data/data/").replaceFirst(str, "/data/user/0/");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.storage.f.a$c */
    static final class C41949c extends Lambda implements C7561a<Set<? extends String>> {

        /* renamed from: a */
        public static final C41949c f109016a = new C41949c();

        C41949c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m133412a();
        }

        /* renamed from: a */
        private static Set<String> m133412a() {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            List cacheCleanDefaultWhiteList = a.getCacheCleanDefaultWhiteList();
            C7573i.m23582a((Object) cacheCleanDefaultWhiteList, "SettingsReader.get().cacheCleanDefaultWhiteList");
            return C7525m.m23520j((Iterable<? extends T>) cacheCleanDefaultWhiteList);
        }
    }

    /* renamed from: c */
    private final Set<String> m133402c() {
        return (Set) this.f109010b.getValue();
    }

    /* renamed from: d */
    private final C41955c m133403d() {
        return (C41955c) this.f109011c.getValue();
    }

    /* renamed from: e */
    private final C41954b m133404e() {
        return (C41954b) this.f109012d.getValue();
    }

    /* renamed from: f */
    private final C41952a m133405f() {
        return (C41952a) this.f109013e.getValue();
    }

    /* renamed from: b */
    public final Set<String> mo102970b() {
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(m133402c());
        return linkedHashSet;
    }

    /* renamed from: a */
    public final Set<String> mo102969a() {
        Set linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(m133403d().mo102972a());
        m133404e();
        linkedHashSet.addAll(C41954b.m133421a());
        m133405f();
        linkedHashSet.addAll(C41952a.m133420a());
        Collection collection = linkedHashSet;
        Collection a = C18054w.m59708a(collection, (C17427g<? super F, T>) C41948b.f109015a);
        Collection a2 = C18054w.m59708a(collection, (C17427g<? super F, T>) C41947a.f109014a);
        Set<String> linkedHashSet2 = new LinkedHashSet<>();
        linkedHashSet2.addAll(collection);
        C7573i.m23582a((Object) a, "dataUser0WhiteList");
        linkedHashSet2.addAll(a);
        C7573i.m23582a((Object) a2, "dataDataWhiteList");
        linkedHashSet2.addAll(a2);
        return linkedHashSet2;
    }
}
