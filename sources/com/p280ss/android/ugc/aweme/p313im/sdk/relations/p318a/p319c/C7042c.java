package com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p319c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.common.net.C25710e;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p320b.C31733b;
import com.p280ss.android.ugc.aweme.p313im.sdk.storage.p1348b.C31850a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31857ac;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7076p;
import com.p280ss.android.ugc.aweme.p313im.service.C7103h;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7595j;
import org.greenrobot.eventbus.C7709l;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7495v;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.c.c */
public final class C7042c {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f19841a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C7042c.class), "disposable", "getDisposable()Lio/reactivex/disposables/CompositeDisposable;"))};

    /* renamed from: b */
    public static final C7042c f19842b = new C7042c();

    /* renamed from: c */
    private static final int f19843c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static volatile int f19844d = -1;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static volatile int f19845e;

    /* renamed from: f */
    private static volatile int f19846f;

    /* renamed from: g */
    private static volatile boolean f19847g;

    /* renamed from: h */
    private static final C7541d f19848h = C7546e.m23569a(C7043a.f19851a);

    /* renamed from: i */
    private static final C7047e f19849i = new C7047e(Looper.getMainLooper());

    /* renamed from: j */
    private static long f19850j;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.c.c$a */
    static final class C7043a extends Lambda implements C7561a<C47562b> {

        /* renamed from: a */
        public static final C7043a f19851a = new C7043a();

        C7043a() {
            super(0);
        }

        /* renamed from: a */
        private static C47562b m21920a() {
            return new C47562b();
        }

        public final /* synthetic */ Object invoke() {
            return m21920a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.c.c$b */
    static final class C7044b<T> implements C7495v<T> {

        /* renamed from: a */
        final /* synthetic */ int f19852a;

        /* renamed from: b */
        final /* synthetic */ boolean f19853b;

        C7044b(int i, boolean z) {
            this.f19852a = i;
            this.f19853b = z;
        }

        public final void subscribe(C47870u<C7581n> uVar) {
            C7573i.m23587b(uVar, "it");
            C7042c.f19842b.mo18251a(this.f19852a, this.f19853b);
            uVar.mo19239a((Object) C7581n.f20898a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.c.c$c */
    static final class C7045c<T> implements C7326g<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C7562b f19854a;

        C7045c(C7562b bVar) {
            this.f19854a = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C7581n nVar) {
            C6921a.m21555a("RelationFetchManager, fetchInternalAsync success");
            C7562b bVar = this.f19854a;
            if (bVar != null) {
                bVar.invoke(Boolean.valueOf(true));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.c.c$d */
    static final class C7046d<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C7562b f19855a;

        C7046d(C7562b bVar) {
            this.f19855a = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            C6921a.m21559a(th);
            C7562b bVar = this.f19855a;
            if (bVar != null) {
                bVar.invoke(Boolean.valueOf(false));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.c.c$e */
    public static final class C7047e extends Handler {
        C7047e(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            removeMessages(102);
            StringBuilder sb = new StringBuilder("RelationFetchManager, MSG_FETCH_RETRY: lastRetryReason=");
            sb.append(C7042c.f19844d);
            sb.append(", retryTimes=");
            sb.append(C7042c.f19845e);
            C6921a.m21555a(sb.toString());
            if (C7042c.f19844d > 0 && C7042c.f19845e < 30) {
                C7042c cVar = C7042c.f19842b;
                C7042c.f19845e = C7042c.f19845e + 1;
                C7042c cVar2 = C7042c.f19842b;
                cVar2.mo18252a(C7042c.f19844d, true, null);
            }
        }
    }

    private C7042c() {
    }

    /* renamed from: a */
    private final C47562b m21897a() {
        return (C47562b) f19848h.getValue();
    }

    /* renamed from: a */
    private final void m21907a(boolean z) {
        synchronized (this) {
            f19847g = z;
        }
    }

    /* renamed from: a */
    public final void mo18252a(int i, boolean z, C7562b<? super Boolean, C7581n> bVar) {
        StringBuilder sb = new StringBuilder("RelationFetchManager, fetchInternalAsync: reason=");
        sb.append(i);
        sb.append(", retry=");
        sb.append(z);
        C6921a.m21555a(sb.toString());
        if (m21914b()) {
            StringBuilder sb2 = new StringBuilder("RelationFetchManager, fetchInternalAsync false(Fetching): reason=");
            sb2.append(i);
            sb2.append(", retry=");
            sb2.append(z);
            C6921a.m21555a(sb2.toString());
            if (bVar != null) {
                bVar.invoke(Boolean.valueOf(true));
            }
        } else if (!C7074e.m22066a()) {
            StringBuilder sb3 = new StringBuilder("RelationFetchManager, fetchInternalAsync false(Not login): reason=");
            sb3.append(i);
            sb3.append(", retry=");
            sb3.append(z);
            C6921a.m21555a(sb3.toString());
            if (bVar != null) {
                bVar.invoke(Boolean.valueOf(false));
            }
        } else if (!m21916c()) {
            StringBuilder sb4 = new StringBuilder("RelationFetchManager, fetchInternalAsync false(Network unavailable): reason=");
            sb4.append(i);
            sb4.append(", retry=");
            sb4.append(z);
            C6921a.m21555a(sb4.toString());
            if (bVar != null) {
                bVar.invoke(Boolean.valueOf(false));
            }
            m21912b(i, true);
        } else {
            C7321c a = C7492s.m23282a((C7495v<T>) new C7044b<T>(i, z)).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C7045c<Object>(bVar), (C7326g<? super Throwable>) new C7046d<Object>(bVar));
            m21897a().mo119660a();
            m21897a().mo119661a(a);
        }
    }

    /* renamed from: a */
    public final void mo18251a(int i, boolean z) {
        StringBuilder sb = new StringBuilder("RelationFetchManager, fetchInternalAsync: reason=");
        sb.append(i);
        sb.append(", retry=");
        sb.append(z);
        C6921a.m21555a(sb.toString());
        if (m21914b()) {
            StringBuilder sb2 = new StringBuilder("RelationFetchManager, fetchInternalAsync false(Fetching): reason=");
            sb2.append(i);
            sb2.append(", retry=");
            sb2.append(z);
            C6921a.m21555a(sb2.toString());
        } else if (!C7074e.m22066a()) {
            StringBuilder sb3 = new StringBuilder("RelationFetchManager, fetchInternalAsync false(Not login): reason=");
            sb3.append(i);
            sb3.append(", retry=");
            sb3.append(z);
            C6921a.m21555a(sb3.toString());
        } else if (!m21916c()) {
            StringBuilder sb4 = new StringBuilder("RelationFetchManager, fetchInternalAsync false(Network unavailable): reason=");
            sb4.append(i);
            sb4.append(", retry=");
            sb4.append(z);
            C6921a.m21555a(sb4.toString());
            m21912b(i, true);
        } else {
            m21907a(true);
            m21913b(z);
            if (i == 2 || i == 3 || i == 5) {
                C6921a.m21555a("RelationFetchManager, fetchInternalAsync clear DB");
                C31850a.m103357a();
                C31850a.m103371j();
                C7076p.m22077a().mo18317f(-1);
            }
            C31678b.f82895d.mo82459a(i, z);
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            f19850j = System.currentTimeMillis();
            m21903a(i, false, arrayList, arrayList2);
            try {
                m21901a(i, arrayList);
            } catch (Throwable th) {
                m21911b(i, th);
                C6921a.m21559a(th);
            }
            C7573i.m23582a((Object) C31850a.m103357a(), "IMUserDao.inst()");
            if (C31850a.m103372k()) {
                m21899a(5, i, arrayList2);
            } else {
                C7076p.m22077a().mo18317f(System.currentTimeMillis());
            }
            m21907a(false);
        }
    }

    /* renamed from: a */
    private static boolean m21908a(IMUser iMUser, IMUser iMUser2) {
        if (TextUtils.equals(iMUser.getDisplayName(), iMUser.getDisplayName()) && iMUser.getAvatarThumb() != null && ((iMUser2.getAvatarThumb() == null || !(!C7573i.m23585a((Object) iMUser.getAvatarThumb(), (Object) iMUser2.getAvatarThumb()))) && !TextUtils.isEmpty(iMUser.getSortWeight()) && !TextUtils.isEmpty(iMUser.getInitialLetter()) && !TextUtils.isEmpty(iMUser.getRemarkPinyin()) && !TextUtils.isEmpty(iMUser.getRemarkInitial()) && !TextUtils.isEmpty(iMUser.getNickNamePinyin()) && !TextUtils.isEmpty(iMUser.getNickNameInitial()) && iMUser.getFollowStatus() == iMUser2.getFollowStatus())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m21904a(C31678b bVar) {
        C7573i.m23587b(bVar, "loadInfo");
        Map linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("error", Integer.valueOf(1));
        linkedHashMap.put("error_stack", bVar.toString());
        StringBuilder sb = new StringBuilder("RelationFetchManager monitorToManyLoadError: ");
        sb.append(linkedHashMap);
        C6921a.m21555a(sb.toString());
        C7074e.m22070b("spotlight_relation_load_error", linkedHashMap);
    }

    /* renamed from: b */
    private final boolean m21914b() {
        boolean z;
        synchronized (this) {
            z = f19847g;
        }
        return z;
    }

    /* renamed from: c */
    private static boolean m21916c() {
        return C31680d.m102904a(C6399b.m19921a());
    }

    static {
        int i;
        if (C6399b.m19944t()) {
            i = C34943c.f91127w;
        } else {
            i = 100;
        }
        f19843c = i;
    }

    /* renamed from: b */
    public static final void m21910b(int i) {
        m21902a(i, null);
    }

    /* renamed from: b */
    private static void m21913b(boolean z) {
        f19844d = -1;
        f19846f = 0;
        if (!z) {
            f19845e = 0;
        }
        f19849i.removeMessages(102);
    }

    /* renamed from: a */
    public static final void m21898a(int i) {
        int c = m21915c(i);
        StringBuilder sb = new StringBuilder("RelationFetchManager, fetchSync: reason=");
        sb.append(i);
        sb.append(", realReason=");
        sb.append(c);
        C6921a.m21555a(sb.toString());
        C7042c cVar = f19842b;
        if (!f19842b.m21917d(c)) {
            cVar = null;
        }
        if (cVar != null) {
            cVar.mo18251a(c, false);
        }
    }

    @C7709l
    public final void onEvent(C25710e eVar) {
        StringBuilder sb = new StringBuilder("RelationFetchManager, onNetworkChangeEvent: lastRetryReason=");
        sb.append(f19844d);
        C6921a.m21555a(sb.toString());
        if (f19844d > 0 && m21916c()) {
            m21912b(f19844d, false);
        }
    }

    /* renamed from: c */
    private static int m21915c(int i) {
        C6956a a = C6956a.m21632a();
        C7573i.m23582a((Object) a, "AwemeImManager.instance()");
        C7103h f = a.mo18009f();
        C7573i.m23582a((Object) f, "AwemeImManager.instance().proxy");
        String currentLocaleLanguage = f.getCurrentLocaleLanguage();
        String b = C31857ac.m103403b();
        if (TextUtils.equals(currentLocaleLanguage, b)) {
            return i;
        }
        C6956a a2 = C6956a.m21632a();
        C7573i.m23582a((Object) a2, "AwemeImManager.instance()");
        C7103h f2 = a2.mo18009f();
        C7573i.m23582a((Object) f2, "AwemeImManager.instance().proxy");
        f2.setCurrentLocaleLanguage(b);
        C31733b.m103058a().mo82526a(C31857ac.m103402a());
        return 5;
    }

    /* renamed from: d */
    private final boolean m21917d(int i) {
        if (m21914b()) {
            StringBuilder sb = new StringBuilder("RelationFetchManager, checkFetchByReason false(Fetching): reason=");
            sb.append(i);
            C6921a.m21555a(sb.toString());
            return false;
        } else if (!C7074e.m22066a()) {
            StringBuilder sb2 = new StringBuilder("RelationFetchManager, checkFetchByReason false(Not login): reason=");
            sb2.append(i);
            C6921a.m21555a(sb2.toString());
            return false;
        } else {
            C7573i.m23582a((Object) C31850a.m103357a(), "IMUserDao.inst()");
            if (C31850a.m103372k()) {
                StringBuilder sb3 = new StringBuilder("RelationFetchManager, checkFetchByReason true(DB empty): reason=");
                sb3.append(i);
                C6921a.m21555a(sb3.toString());
                C7076p.m22077a().mo18317f(-1);
                return true;
            } else if (i == 2) {
                StringBuilder sb4 = new StringBuilder("RelationFetchManager, checkFetchByReason true(Account update): reason=");
                sb4.append(i);
                C6921a.m21555a(sb4.toString());
                return true;
            } else if (i == 5) {
                StringBuilder sb5 = new StringBuilder("RelationFetchManager, checkFetchByReason true(Language update): reason=");
                sb5.append(i);
                C6921a.m21555a(sb5.toString());
                return true;
            } else if (i == 3) {
                StringBuilder sb6 = new StringBuilder("RelationFetchManager, checkFetchByReason true(DB empty): reason=");
                sb6.append(i);
                C6921a.m21555a(sb6.toString());
                return true;
            } else if (i == 4) {
                StringBuilder sb7 = new StringBuilder("RelationFetchManager, checkFetchByReason true(DB count not match): reason=");
                sb7.append(i);
                C6921a.m21555a(sb7.toString());
                return true;
            } else if (C7076p.m22077a().mo18336t()) {
                StringBuilder sb8 = new StringBuilder("RelationFetchManager, checkFetchByReason true(Time limit reach): reason=");
                sb8.append(i);
                C6921a.m21555a(sb8.toString());
                return true;
            } else {
                StringBuilder sb9 = new StringBuilder("RelationFetchManager, checkFetchByReason false(Time limit not reach): reason=");
                sb9.append(i);
                C6921a.m21555a(sb9.toString());
                return false;
            }
        }
    }

    /* renamed from: b */
    private static void m21911b(int i, Throwable th) {
        Map linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("error", Integer.valueOf(4));
        String str = "error_stack";
        String message = th.getMessage();
        if (message == null) {
            message = "null stack message";
        }
        linkedHashMap.put(str, message);
        linkedHashMap.put("reason", Integer.valueOf(i));
        StringBuilder sb = new StringBuilder("RelationFetchManager monitorDbException: ");
        sb.append(linkedHashMap);
        C6921a.m21555a(sb.toString());
        C7074e.m22070b("spotlight_relation_load_error", linkedHashMap);
    }

    /* renamed from: a */
    private static void m21900a(int i, Throwable th) {
        Map linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("error", Integer.valueOf(3));
        String str = "error_stack";
        String message = th.getMessage();
        if (message == null) {
            message = "null stack message";
        }
        linkedHashMap.put(str, message);
        linkedHashMap.put("reason", Integer.valueOf(i));
        StringBuilder sb = new StringBuilder("RelationFetchManager monitorLoadException: ");
        sb.append(linkedHashMap);
        C6921a.m21555a(sb.toString());
        C7074e.m22070b("spotlight_relation_load_error", linkedHashMap);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m21912b(int i, boolean z) {
        long j;
        StringBuilder sb = new StringBuilder("RelationFetchManager, retryFetch: reason=");
        sb.append(i);
        sb.append(", delay=");
        sb.append(z);
        sb.append(", retryTimes=");
        sb.append(f19845e);
        C6921a.m21555a(sb.toString());
        if (f19845e < 30) {
            f19844d = i;
            C7047e eVar = f19849i;
            if (z) {
                j = 10000;
            } else {
                j = 0;
            }
            eVar.sendEmptyMessageDelayed(102, j);
        }
    }

    /* renamed from: a */
    private final void m21901a(int i, List<IMUser> list) {
        StringBuilder sb = new StringBuilder("RelationFetchManager, doUpdateDatabase: reason=");
        sb.append(i);
        sb.append(", fetchResult=");
        sb.append(list.size());
        C6921a.m21555a(sb.toString());
        Collection collection = list;
        if (collection.isEmpty()) {
            C6921a.m21555a("RelationFetchManager, doUpdateDatabase: fetchResult empty");
        } else if (i == 2 || i == 3 || i == 5) {
            C6921a.m21555a("RelationFetchManager, doUpdateDatabase: insertOrReplaceIMUser");
            C31850a.m103357a().mo82682a(list);
        } else {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            List n = C31850a.m103357a().mo82687n();
            HashMap hashMap = new HashMap(list.size());
            int size = collection.size();
            for (int i2 = 0; i2 < size; i2++) {
                Map map = hashMap;
                String uid = ((IMUser) list.get(i2)).getUid();
                C7573i.m23582a((Object) uid, "fetchResult[i].uid");
                map.put(uid, Integer.valueOf(i2));
            }
            C7573i.m23582a((Object) n, "oldUsers");
            int size2 = n.size();
            for (int i3 = 0; i3 < size2; i3++) {
                IMUser iMUser = (IMUser) n.get(i3);
                C7573i.m23582a((Object) iMUser, "oldUser");
                Integer num = (Integer) hashMap.get(iMUser.getUid());
                if (num != null) {
                    IMUser iMUser2 = (IMUser) list.get(num.intValue());
                    if (m21908a(iMUser, iMUser2)) {
                        arrayList.add(iMUser2);
                    } else {
                        arrayList2.add(iMUser2);
                    }
                    hashMap.remove(iMUser2.getUid());
                } else {
                    arrayList3.add(iMUser);
                }
            }
            for (Entry value : hashMap.entrySet()) {
                Object value2 = value.getValue();
                C7573i.m23582a(value2, "entry.value");
                IMUser iMUser3 = (IMUser) list.get(((Number) value2).intValue());
                C31850a.m103357a();
                C31850a.m103361b(iMUser3);
                arrayList.add(iMUser3);
            }
            Collection collection2 = arrayList3;
            int size3 = collection2.size();
            for (int i4 = 0; i4 < size3; i4++) {
                Object obj = arrayList3.get(i4);
                C7573i.m23582a(obj, "delete[i]");
                ((IMUser) obj).setFollowStatus(0);
            }
            StringBuilder sb2 = new StringBuilder("RelationFetchManager, doUpdateDatabase: delete=");
            sb2.append(arrayList3.size());
            sb2.append(", insertOrReplace=");
            sb2.append(arrayList.size());
            sb2.append(", update=");
            sb2.append(arrayList2.size());
            C6921a.m21555a(sb2.toString());
            arrayList2.addAll(collection2);
            C31850a.m103357a().mo82682a((List<IMUser>) arrayList);
            C31850a.m103357a();
            C31850a.m103362b((List<IMUser>) arrayList2);
        }
    }

    /* renamed from: a */
    private static void m21902a(int i, C7562b<? super Boolean, C7581n> bVar) {
        int c = m21915c(i);
        StringBuilder sb = new StringBuilder("RelationFetchManager, fetchAsync: reason=");
        sb.append(i);
        sb.append(", realReason=");
        sb.append(c);
        C6921a.m21555a(sb.toString());
        if (f19842b.m21917d(c)) {
            f19842b.mo18252a(c, false, null);
        }
    }

    /* renamed from: a */
    private static void m21899a(int i, int i2, List<C31677a> list) {
        String str = "empty";
        String str2 = "empty";
        if (list.size() >= 2) {
            C31677a aVar = (C31677a) list.get(list.size() - 2);
            StringBuilder sb = new StringBuilder("[");
            sb.append(aVar.f82892a);
            sb.append(", ");
            sb.append(aVar.f82893b);
            sb.append(", ");
            sb.append(aVar.f82894c);
            sb.append(']');
            String sb2 = sb.toString();
            C31677a aVar2 = (C31677a) list.get(list.size() - 1);
            StringBuilder sb3 = new StringBuilder("[");
            sb3.append(aVar2.f82892a);
            sb3.append(", ");
            sb3.append(aVar2.f82893b);
            sb3.append(", ");
            sb3.append(aVar2.f82894c);
            sb3.append(']');
            String str3 = sb2;
            str2 = sb3.toString();
            str = str3;
        }
        int i3 = 0;
        for (C31677a aVar3 : list) {
            i3 += aVar3.f82893b;
        }
        Map linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("error", Integer.valueOf(i));
        StringBuilder sb4 = new StringBuilder("{");
        sb4.append(str);
        sb4.append(", ");
        sb4.append(str2);
        sb4.append('}');
        linkedHashMap.put("error_stack", sb4.toString());
        linkedHashMap.put("reason", Integer.valueOf(i2));
        linkedHashMap.put("data_size", Integer.valueOf(i3));
        StringBuilder sb5 = new StringBuilder("RelationFetchManager monitorLoadError: ");
        sb5.append(linkedHashMap);
        C6921a.m21555a(sb5.toString());
        C7074e.m22070b("spotlight_relation_load_error", linkedHashMap);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00da A[EDGE_INSN: B:51:0x00da->B:42:0x00da ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m21903a(int r11, boolean r12, java.util.List<com.p280ss.android.ugc.aweme.p313im.service.model.IMUser> r13, java.util.List<com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p319c.C31677a> r14) {
        /*
            r10 = this;
            r0 = 1
        L_0x0001:
            r1 = 2
            if (r12 == 0) goto L_0x0029
            int r12 = f19846f
            int r2 = f19843c
            if (r12 <= r2) goto L_0x0029
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "RelationFetchManager, doRealFetch too many loadMore: reason="
            r12.<init>(r13)
            r12.append(r11)
            java.lang.String r13 = ", loadMoreTimes="
            r12.append(r13)
            int r13 = f19846f
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21555a(r12)
            m21899a(r1, r11, r14)
            return
        L_0x0029:
            r12 = 0
            r2 = 0
            com.ss.android.ugc.aweme.im.sdk.utils.ImApi r3 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7077s.m22142a()     // Catch:{ Throwable -> 0x00db }
            r4 = 500(0x1f4, float:7.0E-43)
            r5 = 1
            long r6 = f19850j     // Catch:{ Throwable -> 0x00db }
            r8 = 0
            com.google.common.util.concurrent.l r3 = r3.getSpotlightRelation(r4, r5, r6, r8)     // Catch:{ Throwable -> 0x00db }
            java.lang.Object r3 = r3.get()     // Catch:{ Throwable -> 0x00db }
            com.ss.android.ugc.aweme.im.sdk.relations.model.RelationResponse r3 = (com.p280ss.android.ugc.aweme.p313im.sdk.relations.model.RelationResponse) r3     // Catch:{ Throwable -> 0x00db }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "RelationFetchManager, doRealFetch: followings="
            r1.<init>(r4)
            if (r3 == 0) goto L_0x0058
            java.util.List r4 = r3.getFollowings()
            if (r4 == 0) goto L_0x0058
            int r4 = r4.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0059
        L_0x0058:
            r4 = r2
        L_0x0059:
            r1.append(r4)
            java.lang.String r4 = ", maxTime="
            r1.append(r4)
            if (r3 == 0) goto L_0x006c
            long r4 = r3.getMaxTime()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            goto L_0x006d
        L_0x006c:
            r4 = r2
        L_0x006d:
            r1.append(r4)
            java.lang.String r4 = ", minTime="
            r1.append(r4)
            if (r3 == 0) goto L_0x0080
            long r4 = r3.getMinTime()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            goto L_0x0081
        L_0x0080:
            r4 = r2
        L_0x0081:
            r1.append(r4)
            java.lang.String r4 = ", hasMore="
            r1.append(r4)
            if (r3 == 0) goto L_0x0094
            int r4 = r3.getHasMore()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0095
        L_0x0094:
            r4 = r2
        L_0x0095:
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21555a(r1)
            if (r3 == 0) goto L_0x00da
            long r4 = r3.getMinTime()
            f19850j = r4
            com.ss.android.ugc.aweme.im.sdk.relations.a.c.a r1 = new com.ss.android.ugc.aweme.im.sdk.relations.a.c.a
            long r4 = f19850j
            java.util.List r6 = r3.getFollowings()
            if (r6 == 0) goto L_0x00b5
            int r12 = r6.size()
        L_0x00b5:
            com.ss.android.ugc.aweme.base.api.BaseResponse$ServerTimeExtra r6 = r3.extra
            if (r6 == 0) goto L_0x00bb
            java.lang.String r2 = r6.logid
        L_0x00bb:
            r1.<init>(r4, r12, r2)
            r14.add(r1)
            java.util.List r12 = r3.getFollowings()
            if (r12 == 0) goto L_0x00cc
            java.util.Collection r12 = (java.util.Collection) r12
            r13.addAll(r12)
        L_0x00cc:
            int r12 = r3.getHasMore()
            if (r12 != r0) goto L_0x00da
            int r12 = f19846f
            int r12 = r12 + r0
            f19846f = r12
            r12 = 1
            goto L_0x0001
        L_0x00da:
            return
        L_0x00db:
            r14 = move-exception
            int r13 = r13.size()
            r0 = 300(0x12c, float:4.2E-43)
            if (r13 >= r0) goto L_0x00e7
            m21912b(r11, true)
        L_0x00e7:
            m21900a(r11, r14)
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21559a(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p319c.C7042c.m21903a(int, boolean, java.util.List, java.util.List):void");
    }
}
