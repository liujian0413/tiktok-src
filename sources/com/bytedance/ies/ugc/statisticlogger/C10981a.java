package com.bytedance.ies.ugc.statisticlogger;

import android.text.TextUtils;
import com.C1642a;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.deviceregister.C6789d.C6790a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import p346io.reactivex.p348d.C7328l;
import p346io.reactivex.p354j.C47844a;
import p346io.reactivex.p354j.C7486b;
import p346io.reactivex.p354j.C7489f;

/* renamed from: com.bytedance.ies.ugc.statisticlogger.a */
public final class C10981a {

    /* renamed from: a */
    public static final C10981a f29700a = new C10981a();

    /* renamed from: b */
    private static final C7489f<String> f29701b;

    /* renamed from: c */
    private static final C7489f<String> f29702c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C7489f<Boolean> f29703d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C7489f<Boolean> f29704e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7489f<Irrelevant> f29705f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C10982a f29706g = new C10982a();

    /* renamed from: com.bytedance.ies.ugc.statisticlogger.a$a */
    public static final class C10982a implements C6790a {
        C10982a() {
        }

        public final void onDidLoadLocally(boolean z) {
            C10981a.f29703d.onNext(Boolean.valueOf(z));
        }

        public final void onRemoteConfigUpdate(boolean z, boolean z2) {
            C10981a.f29704e.onNext(Boolean.valueOf(z));
        }

        public final void onDeviceRegistrationInfoChanged(String str, String str2) {
            C7573i.m23582a((Object) C1642a.m8034a("onDeviceIdChanged,did:%s,installId:%s", Arrays.copyOf(new Object[]{str, str2}, 2)), "java.lang.String.format(format, *args)");
            C10981a.f29700a.mo26539g();
            C10981a.f29705f.onNext(Irrelevant.INSTANCE);
        }
    }

    /* renamed from: com.bytedance.ies.ugc.statisticlogger.a$b */
    static final class C10983b<T> implements C7328l<String> {

        /* renamed from: a */
        public static final C10983b f29707a = new C10983b();

        C10983b() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo9283a(Object obj) {
            return m32178a((String) obj);
        }

        /* renamed from: a */
        private static boolean m32178a(String str) {
            C7573i.m23587b(str, "it");
            if (!TextUtils.isEmpty(str)) {
                return true;
            }
            return false;
        }
    }

    private C10981a() {
    }

    /* renamed from: a */
    public static int m32167a() {
        return AppLog.getHttpMonitorPort();
    }

    /* renamed from: b */
    public static String m32170b() {
        return AppLog.getInstallId();
    }

    /* renamed from: c */
    public static String m32172c() {
        return AppLog.getClientId();
    }

    /* renamed from: d */
    public static String m32174d() {
        String serverDeviceId = AppLog.getServerDeviceId();
        if (serverDeviceId == null) {
            return "";
        }
        return serverDeviceId;
    }

    /* renamed from: e */
    public static Map<String, String> m32175e() {
        Map<String, String> hashMap = new HashMap<>();
        AppLog.getSSIDs(hashMap);
        return hashMap;
    }

    /* renamed from: f */
    public static C7492s<String> m32176f() {
        C7492s<String> a = f29701b.mo19330i().mo19314d().mo19291a((C7328l<? super T>) C10983b.f29707a);
        C7573i.m23582a((Object) a, "sourceDeviceIdSubject.sh…ils.isEmpty(it)\n        }");
        return a;
    }

    /* renamed from: g */
    public final void mo26539g() {
        String d = m32174d();
        if (d != null) {
            f29701b.onNext(d);
        }
        String b = m32170b();
        if (b != null) {
            f29702c.onNext(b);
        }
    }

    static {
        C7489f<String> n = C47844a.m148742a().mo19260n();
        C7573i.m23582a((Object) n, "BehaviorSubject.create<String>().toSerialized()");
        f29701b = n;
        C7489f<String> n2 = C47844a.m148742a().mo19260n();
        C7573i.m23582a((Object) n2, "BehaviorSubject.create<String>().toSerialized()");
        f29702c = n2;
        C7489f<Boolean> n3 = C7486b.m23223a().mo19260n();
        C7573i.m23582a((Object) n3, "PublishSubject.create<Boolean>().toSerialized()");
        f29703d = n3;
        C7489f<Boolean> n4 = C7486b.m23223a().mo19260n();
        C7573i.m23582a((Object) n4, "PublishSubject.create<Boolean>().toSerialized()");
        f29704e = n4;
        C7489f<Irrelevant> n5 = C7486b.m23223a().mo19260n();
        C7573i.m23582a((Object) n5, "PublishSubject.create<Irrelevant>().toSerialized()");
        f29705f = n5;
    }
}
