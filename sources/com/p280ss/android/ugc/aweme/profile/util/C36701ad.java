package com.p280ss.android.ugc.aweme.profile.util;

import com.bytedance.keva.Keva;
import com.google.gson.C6600e;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.profile.model.NeedPointStruct;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7495v;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.profile.util.ad */
public final class C36701ad {

    /* renamed from: a */
    public static final C36701ad f96346a = new C36701ad();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Keva f96347b = Keva.getRepo("users_points_repo");

    /* renamed from: com.ss.android.ugc.aweme.profile.util.ad$a */
    public interface C36702a {
        /* renamed from: a */
        void mo90486a(boolean z);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.util.ad$b */
    public interface C36703b {
        /* renamed from: a */
        void mo93037a();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.util.ad$c */
    public static final class C36704c extends C6597a<Map<String, Map<Integer, Long>>> {
        C36704c() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.util.ad$d */
    public static final class C36705d extends C6597a<Map<String, Map<Integer, Boolean>>> {
        C36705d() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.util.ad$e */
    static final class C36706e<T> implements C7326g<String> {

        /* renamed from: a */
        final /* synthetic */ int f96348a;

        C36706e(int i) {
            this.f96348a = i;
        }

        /* JADX WARNING: type inference failed for: r0v0 */
        /* JADX WARNING: type inference failed for: r0v1, types: [java.util.Map] */
        /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r0v6, types: [java.util.Map] */
        /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.String] */
        /* JADX WARNING: type inference failed for: r0v8 */
        /* JADX WARNING: type inference failed for: r0v9 */
        /* access modifiers changed from: private */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0
          assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], java.lang.String, java.util.Map]
          uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], java.util.Map, java.lang.Object]
          mth insns count: 25
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 3 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void accept(java.lang.String r4) {
            /*
                r3 = this;
                java.util.Map r4 = com.p280ss.android.ugc.aweme.profile.util.C36701ad.m118359b()
                r0 = 0
                if (r4 == 0) goto L_0x001d
                com.ss.android.ugc.aweme.IAccountUserService r1 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()
                if (r1 == 0) goto L_0x0017
                com.ss.android.ugc.aweme.profile.model.User r1 = r1.getCurUser()
                if (r1 == 0) goto L_0x0017
                java.lang.String r0 = r1.getUid()
            L_0x0017:
                java.lang.Object r0 = r4.get(r0)
                java.util.Map r0 = (java.util.Map) r0
            L_0x001d:
                if (r0 != 0) goto L_0x0020
                return
            L_0x0020:
                int r1 = r3.f96348a
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 0
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                r0.put(r1, r2)
                com.ss.android.ugc.aweme.profile.util.ad r0 = com.p280ss.android.ugc.aweme.profile.util.C36701ad.f96346a
                com.bytedance.keva.Keva r0 = com.p280ss.android.ugc.aweme.profile.util.C36701ad.f96347b
                java.lang.String r1 = "users_points_update_records"
                com.google.gson.e r2 = new com.google.gson.e
                r2.<init>()
                java.lang.String r4 = r2.mo15979b(r4)
                r0.storeString(r1, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.util.C36701ad.C36706e.accept(java.lang.String):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.util.ad$f */
    static final class C36707f<T> implements C7495v<Boolean> {

        /* renamed from: a */
        final /* synthetic */ int f96349a;

        C36707f(int i) {
            this.f96349a = i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0026  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void subscribe(p346io.reactivex.C47870u<java.lang.Boolean> r4) {
            /*
                r3 = this;
                java.lang.String r0 = "emitter"
                kotlin.jvm.internal.C7573i.m23587b(r4, r0)
                java.util.Map r0 = com.p280ss.android.ugc.aweme.profile.util.C36701ad.m118359b()
                r1 = 0
                if (r0 == 0) goto L_0x0033
                com.ss.android.ugc.aweme.IAccountUserService r2 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()
                if (r2 == 0) goto L_0x001d
                com.ss.android.ugc.aweme.profile.model.User r2 = r2.getCurUser()
                if (r2 == 0) goto L_0x001d
                java.lang.String r2 = r2.getUid()
                goto L_0x001e
            L_0x001d:
                r2 = r1
            L_0x001e:
                java.lang.Object r0 = r0.get(r2)
                java.util.Map r0 = (java.util.Map) r0
                if (r0 == 0) goto L_0x0033
                int r1 = r3.f96349a
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.Object r0 = r0.get(r1)
                r1 = r0
                java.lang.Boolean r1 = (java.lang.Boolean) r1
            L_0x0033:
                r0 = 1
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r1, r0)
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r4.mo19239a(r0)
                r4.mo19238a()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.util.C36701ad.C36707f.subscribe(io.reactivex.u):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.util.ad$g */
    static final class C36708g<T> implements C7326g<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C36702a f96350a;

        C36708g(C36702a aVar) {
            this.f96350a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Boolean bool) {
            C36702a aVar = this.f96350a;
            if (aVar != null) {
                aVar.mo90486a(C7573i.m23585a((Object) bool, (Object) Boolean.valueOf(true)));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.util.ad$h */
    static final class C36709h<T> implements C7495v<Boolean> {

        /* renamed from: a */
        final /* synthetic */ String f96351a;

        /* renamed from: b */
        final /* synthetic */ List f96352b;

        C36709h(String str, List list) {
            this.f96351a = str;
            this.f96352b = list;
        }

        public final void subscribe(C47870u<Boolean> uVar) {
            C7573i.m23587b(uVar, "emitter");
            Map a = C36701ad.m118355a();
            if (a == null) {
                a = new HashMap();
            }
            Map b = C36701ad.m118359b();
            if (b == null) {
                b = new HashMap();
            }
            Map map = (Map) a.get(this.f96351a);
            if (map == null) {
                map = new HashMap();
            }
            Map map2 = (Map) b.get(this.f96351a);
            if (map2 == null) {
                map2 = new HashMap();
            }
            for (NeedPointStruct needPointStruct : this.f96352b) {
                if (map.get(Integer.valueOf(needPointStruct.getPointType())) != null) {
                    Object obj = map.get(Integer.valueOf(needPointStruct.getPointType()));
                    if (obj == null) {
                        C7573i.m23580a();
                    }
                    if (((Number) obj).longValue() >= needPointStruct.getTimeStamp()) {
                    }
                }
                map.put(Integer.valueOf(needPointStruct.getPointType()), Long.valueOf(needPointStruct.getTimeStamp()));
                map2.put(Integer.valueOf(needPointStruct.getPointType()), Boolean.valueOf(true));
            }
            a.put(this.f96351a, map);
            b.put(this.f96351a, map2);
            C36701ad.f96347b.storeString("users_points_timestamp_records", new C6600e().mo15979b((Object) a));
            C36701ad.f96347b.storeString("users_points_update_records", new C6600e().mo15979b((Object) b));
            uVar.mo19239a((Object) Boolean.valueOf(true));
            uVar.mo19238a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.util.ad$i */
    static final class C36710i<T> implements C7326g<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C36703b f96353a;

        C36710i(C36703b bVar) {
            this.f96353a = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Boolean bool) {
            C36703b bVar = this.f96353a;
            if (bVar != null) {
                bVar.mo93037a();
            }
        }
    }

    private C36701ad() {
    }

    /* renamed from: a */
    public static Map<String, Map<Integer, Long>> m118355a() {
        try {
            return (Map) new C6600e().mo15975a(f96347b.getString("users_points_timestamp_records", ""), new C36704c().type);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Map<String, Map<Integer, Boolean>> m118359b() {
        try {
            return (Map) new C6600e().mo15975a(f96347b.getString("users_points_update_records", ""), new C36705d().type);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m118356a(int i) {
        C7492s.m23301b("").mo19294a(C7333a.m23044b()).mo19325f((C7326g<? super T>) new C36706e<Object>(i));
    }

    /* renamed from: a */
    public static void m118357a(int i, C36702a aVar) {
        C7492s.m23282a((C7495v<T>) new C36707f<T>(i)).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19325f((C7326g<? super T>) new C36708g<Object>(aVar));
    }

    /* renamed from: a */
    public static void m118358a(List<NeedPointStruct> list, C36703b bVar) {
        boolean z;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            IAccountUserService f = C6861a.m21337f();
            if (f != null) {
                User curUser = f.getCurUser();
                if (curUser != null) {
                    String uid = curUser.getUid();
                    if (uid != null) {
                        C7492s.m23282a((C7495v<T>) new C36709h<T>(uid, list)).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19325f((C7326g<? super T>) new C36710i<Object>(bVar));
                    }
                }
            }
        }
    }
}
