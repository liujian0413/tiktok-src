package com.bytedance.ies.web.jsbridge2;

import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.ies.web.jsbridge2.C11174p.C11175a;
import com.bytedance.ies.web.jsbridge2.IBridgePermissionConfigurator.C11147a;
import com.bytedance.ies.web.jsbridge2.IBridgePermissionConfigurator.C11147a.C11148a;
import com.bytedance.ies.web.jsbridge2.IBridgePermissionConfigurator.C11149b;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.taobao.android.dexposed.ClassUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.web.jsbridge2.u */
final class C11181u {

    /* renamed from: a */
    public final Handler f30337a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public C11147a f30338b;

    /* renamed from: c */
    public String f30339c;

    /* renamed from: d */
    public Executor f30340d;

    /* renamed from: e */
    public Set<C11188a> f30341e = new CopyOnWriteArraySet();

    /* renamed from: f */
    public volatile boolean f30342f = false;

    /* renamed from: g */
    public volatile boolean f30343g = true;

    /* renamed from: h */
    public volatile boolean f30344h = false;

    /* renamed from: i */
    private List<Pattern> f30345i = new LinkedList();

    /* renamed from: j */
    private Set<String> f30346j = new LinkedHashSet();

    /* renamed from: k */
    private Set<String> f30347k = new LinkedHashSet();

    /* renamed from: l */
    private final Map<String, List<C11190c>> f30348l = new ConcurrentHashMap();

    /* renamed from: m */
    private LruCache<String, C11191d> f30349m;

    /* renamed from: n */
    private IBridgePermissionConfigurator f30350n;

    /* renamed from: o */
    private volatile boolean f30351o = false;

    /* renamed from: com.bytedance.ies.web.jsbridge2.u$a */
    interface C11188a {
        /* renamed from: b */
        void mo27179b();
    }

    /* renamed from: com.bytedance.ies.web.jsbridge2.u$b */
    static class C11189b extends RuntimeException {
        C11189b(String str) {
            super(str);
        }
    }

    /* renamed from: com.bytedance.ies.web.jsbridge2.u$c */
    static final class C11190c {

        /* renamed from: a */
        Pattern f30362a;

        /* renamed from: b */
        PermissionGroup f30363b;

        /* renamed from: c */
        List<String> f30364c;

        /* renamed from: d */
        List<String> f30365d;

        private C11190c() {
        }
    }

    /* renamed from: com.bytedance.ies.web.jsbridge2.u$d */
    static final class C11191d {

        /* renamed from: a */
        PermissionGroup f30366a;

        /* renamed from: b */
        Set<String> f30367b;

        /* renamed from: c */
        Set<String> f30368c;

        private C11191d() {
            this.f30366a = PermissionGroup.PUBLIC;
            this.f30367b = new HashSet();
            this.f30368c = new HashSet();
        }
    }

    C11181u() {
    }

    /* renamed from: a */
    private JSONObject m32738a() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("aid", this.f30350n.mo27141b());
            jSONObject2.put("app_version", this.f30350n.mo27142c());
            jSONObject2.put("os", 0);
            jSONObject2.put("device_id", this.f30350n.mo27143d());
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("channel", "_jsb_auth");
            jSONObject3.put("local_version", 0);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(this.f30350n.mo27144e(), jSONArray);
            jSONObject.put("common", jSONObject2);
            jSONObject.put("deployment", jSONObject4);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo27219a(C11188a aVar) {
        this.f30341e.add(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo27223b(C11188a aVar) {
        this.f30341e.remove(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo27221a(Collection<String> collection) {
        this.f30346j.addAll(collection);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo27224b(Collection<String> collection) {
        this.f30347k.addAll(collection);
    }

    /* renamed from: a */
    public final void mo27218a(final C11175a aVar) {
        this.f30344h = true;
        this.f30350n.mo27140a(this.f30339c, null, "application/json", m32738a().toString().getBytes(), new C11149b() {
            /* renamed from: a */
            public final void mo27150a(Exception exc) {
                new StringBuilder("Fetch configurations failed, url: ").append(C11181u.this.f30339c);
                C11181u.this.f30344h = false;
            }

            /* renamed from: a */
            public final void mo27151a(final String str) {
                new StringBuilder("Fetch configurations succeed, url: ").append(C11181u.this.f30339c);
                C11181u.this.f30344h = false;
                C11181u.this.f30340d.execute(new Runnable() {
                    public final void run() {
                        C11181u.this.mo27220a(str);
                        C11181u.this.f30342f = true;
                        C11181u.this.f30343g = false;
                        C11181u.this.f30338b.mo27148a("com.bytedance.ies.web.jsbridge2.PermissionConfigProvider.permission_config", str);
                        C11181u.this.f30337a.post(new Runnable() {
                            public final void run() {
                                if (aVar != null) {
                                    aVar.mo27207a();
                                }
                                for (C11188a b : C11181u.this.f30341e) {
                                    b.mo27179b();
                                }
                            }
                        });
                    }
                });
            }
        });
    }

    /* renamed from: b */
    private List<C11190c> m32739b(String str) throws C11189b {
        if (this.f30343g && !this.f30344h) {
            this.f30340d.execute(new Runnable() {
                public final void run() {
                    C11181u.this.mo27218a((C11175a) null);
                }
            });
        }
        if (this.f30342f) {
            return (List) this.f30348l.get(str);
        }
        throw new C11189b("Permission config is outdated!");
    }

    /* renamed from: c */
    private static String m32740c(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split("[.]");
        int length = split.length;
        if (length < 2) {
            return null;
        }
        if (length == 2) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(split[length - 2]);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append(split[length - 1]);
        return sb.toString();
    }

    /* renamed from: a */
    private static C11190c m32736a(JSONObject jSONObject) throws JSONException {
        C11190c cVar = new C11190c();
        cVar.f30362a = Pattern.compile(jSONObject.getString("pattern"));
        cVar.f30363b = PermissionGroup.from(jSONObject.getString("group"));
        cVar.f30364c = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("included_methods");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                cVar.f30364c.add(optJSONArray.getString(i));
            }
        }
        cVar.f30365d = new ArrayList();
        JSONArray optJSONArray2 = jSONObject.optJSONArray("excluded_methods");
        if (optJSONArray2 != null) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                cVar.f30365d.add(optJSONArray2.getString(i2));
            }
        }
        return cVar;
    }

    /* renamed from: a */
    public final void mo27220a(String str) {
        this.f30348l.clear();
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("data").getJSONObject("packages").getJSONArray(this.f30350n.mo27144e()).getJSONObject(0);
            String string = jSONObject.getString("channel");
            String string2 = jSONObject.getString("package_type");
            if (TextUtils.equals("_jsb_auth", string)) {
                if (TextUtils.equals("3", string2)) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(C38347c.f99553h);
                    Iterator keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String str2 = (String) keys.next();
                        JSONArray jSONArray = jSONObject2.getJSONArray(str2);
                        LinkedList linkedList = new LinkedList();
                        this.f30348l.put(str2, linkedList);
                        for (int i = 0; i < jSONArray.length(); i++) {
                            linkedList.add(m32736a(jSONArray.getJSONObject(i)));
                        }
                    }
                    return;
                }
            }
            C11165i.m32683a((RuntimeException) new IllegalArgumentException("Channel or ResourceType mismatch?"));
        } catch (JSONException unused) {
            StringBuilder sb = new StringBuilder("Parse configurations failed, url: ");
            sb.append(this.f30339c);
            sb.append(", response: ");
            sb.append(str);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo27217a(IBridgePermissionConfigurator iBridgePermissionConfigurator, final C11175a aVar) {
        if (!this.f30351o) {
            this.f30351o = true;
            this.f30339c = iBridgePermissionConfigurator.mo27139a().url;
            this.f30340d = iBridgePermissionConfigurator.mo27146g();
            this.f30350n = iBridgePermissionConfigurator;
            this.f30338b = iBridgePermissionConfigurator.mo27145f();
            this.f30349m = new LruCache<>(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
            this.f30338b.mo27147a("com.bytedance.ies.web.jsbridge2.PermissionConfigProvider.permission_config", (C11148a) new C11148a() {
                /* renamed from: a */
                public final void mo27149a(final String str) {
                    C11181u.this.f30340d.execute(new Runnable() {
                        public final void run() {
                            C11181u.this.f30342f = !TextUtils.isEmpty(str);
                            if (C11181u.this.f30342f) {
                                C11181u.this.mo27220a(str);
                            }
                            C11181u.this.mo27218a(aVar);
                        }
                    });
                }
            });
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        return false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo27225b(java.lang.String r6, com.bytedance.ies.web.jsbridge2.C11150a r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            android.net.Uri r6 = android.net.Uri.parse(r6)     // Catch:{ all -> 0x0051 }
            java.lang.String r6 = r6.getHost()     // Catch:{ all -> 0x0051 }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0051 }
            r1 = 1
            if (r0 == 0) goto L_0x0012
            monitor-exit(r5)
            return r1
        L_0x0012:
            java.util.Set<java.lang.String> r0 = r5.f30347k     // Catch:{ all -> 0x0051 }
            java.lang.String r7 = r7.getName()     // Catch:{ all -> 0x0051 }
            boolean r7 = r0.contains(r7)     // Catch:{ all -> 0x0051 }
            r0 = 0
            if (r7 == 0) goto L_0x0021
            monitor-exit(r5)
            return r0
        L_0x0021:
            java.util.Set<java.lang.String> r7 = r5.f30346j     // Catch:{ all -> 0x0051 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0051 }
        L_0x0027:
            boolean r2 = r7.hasNext()     // Catch:{ all -> 0x0051 }
            if (r2 == 0) goto L_0x004f
            java.lang.Object r2 = r7.next()     // Catch:{ all -> 0x0051 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0051 }
            boolean r3 = r2.equals(r6)     // Catch:{ all -> 0x0051 }
            if (r3 != 0) goto L_0x004d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0051 }
            java.lang.String r4 = "."
            r3.<init>(r4)     // Catch:{ all -> 0x0051 }
            r3.append(r2)     // Catch:{ all -> 0x0051 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0051 }
            boolean r2 = r6.endsWith(r2)     // Catch:{ all -> 0x0051 }
            if (r2 == 0) goto L_0x0027
        L_0x004d:
            monitor-exit(r5)
            return r0
        L_0x004f:
            monitor-exit(r5)
            return r1
        L_0x0051:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.web.jsbridge2.C11181u.mo27225b(java.lang.String, com.bytedance.ies.web.jsbridge2.a):boolean");
    }

    /* renamed from: a */
    private C11191d m32737a(String str, List<Pattern> list) throws C11189b {
        C11191d dVar = new C11191d();
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String authority = parse.getAuthority();
        String builder = new Builder().scheme(scheme).authority(authority).path(parse.getPath()).toString();
        String c = m32740c(authority);
        if (TextUtils.isEmpty(scheme) || TextUtils.isEmpty(authority) || c == null) {
            dVar.f30366a = PermissionGroup.PUBLIC;
            return dVar;
        }
        for (Pattern matcher : list) {
            if (matcher.matcher(authority).matches()) {
                dVar.f30366a = PermissionGroup.PRIVATE;
                return dVar;
            }
        }
        List<C11190c> b = m32739b(c);
        if (b == null) {
            return dVar;
        }
        for (C11190c cVar : b) {
            if (cVar.f30362a.matcher(builder).matches()) {
                if (cVar.f30363b.compareTo(dVar.f30366a) <= 0) {
                    dVar.f30366a = cVar.f30363b;
                }
                dVar.f30367b.addAll(cVar.f30364c);
                dVar.f30368c.addAll(cVar.f30365d);
            }
        }
        return dVar;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004a, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo27222a(java.lang.String r9, com.bytedance.ies.web.jsbridge2.C11150a r10) throws com.bytedance.ies.web.jsbridge2.C11181u.C11189b {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.f30351o     // Catch:{ all -> 0x009a }
            if (r0 != 0) goto L_0x000b
            boolean r9 = r8.mo27225b(r9, r10)     // Catch:{ all -> 0x009a }
            monitor-exit(r8)
            return r9
        L_0x000b:
            android.net.Uri r0 = android.net.Uri.parse(r9)     // Catch:{ all -> 0x009a }
            java.lang.String r1 = r0.getHost()     // Catch:{ all -> 0x009a }
            r2 = 1
            if (r1 != 0) goto L_0x0018
            monitor-exit(r8)
            return r2
        L_0x0018:
            java.util.Set<java.lang.String> r3 = r8.f30346j     // Catch:{ all -> 0x009a }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x009a }
        L_0x001e:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x009a }
            r5 = 0
            if (r4 == 0) goto L_0x004b
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x009a }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x009a }
            java.lang.String r6 = r0.getHost()     // Catch:{ all -> 0x009a }
            boolean r6 = r6.equals(r4)     // Catch:{ all -> 0x009a }
            if (r6 != 0) goto L_0x0049
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x009a }
            java.lang.String r7 = "."
            r6.<init>(r7)     // Catch:{ all -> 0x009a }
            r6.append(r4)     // Catch:{ all -> 0x009a }
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x009a }
            boolean r4 = r1.endsWith(r4)     // Catch:{ all -> 0x009a }
            if (r4 == 0) goto L_0x001e
        L_0x0049:
            monitor-exit(r8)
            return r5
        L_0x004b:
            java.util.Set<java.lang.String> r0 = r8.f30347k     // Catch:{ all -> 0x009a }
            java.lang.String r1 = r10.getName()     // Catch:{ all -> 0x009a }
            boolean r0 = r0.contains(r1)     // Catch:{ all -> 0x009a }
            if (r0 == 0) goto L_0x0059
            monitor-exit(r8)
            return r5
        L_0x0059:
            android.util.LruCache<java.lang.String, com.bytedance.ies.web.jsbridge2.u$d> r0 = r8.f30349m     // Catch:{ all -> 0x009a }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ all -> 0x009a }
            com.bytedance.ies.web.jsbridge2.u$d r0 = (com.bytedance.ies.web.jsbridge2.C11181u.C11191d) r0     // Catch:{ all -> 0x009a }
            if (r0 != 0) goto L_0x006e
            java.util.List<java.util.regex.Pattern> r0 = r8.f30345i     // Catch:{ all -> 0x009a }
            com.bytedance.ies.web.jsbridge2.u$d r0 = r8.m32737a(r9, r0)     // Catch:{ all -> 0x009a }
            android.util.LruCache<java.lang.String, com.bytedance.ies.web.jsbridge2.u$d> r1 = r8.f30349m     // Catch:{ all -> 0x009a }
            r1.put(r9, r0)     // Catch:{ all -> 0x009a }
        L_0x006e:
            java.util.Set<java.lang.String> r9 = r0.f30368c     // Catch:{ all -> 0x009a }
            java.lang.String r1 = r10.getName()     // Catch:{ all -> 0x009a }
            boolean r9 = r9.contains(r1)     // Catch:{ all -> 0x009a }
            if (r9 == 0) goto L_0x007c
            monitor-exit(r8)
            return r2
        L_0x007c:
            java.util.Set<java.lang.String> r9 = r0.f30367b     // Catch:{ all -> 0x009a }
            java.lang.String r1 = r10.getName()     // Catch:{ all -> 0x009a }
            boolean r9 = r9.contains(r1)     // Catch:{ all -> 0x009a }
            if (r9 == 0) goto L_0x008a
            monitor-exit(r8)
            return r5
        L_0x008a:
            com.bytedance.ies.web.jsbridge2.PermissionGroup r9 = r0.f30366a     // Catch:{ all -> 0x009a }
            com.bytedance.ies.web.jsbridge2.PermissionGroup r10 = r10.getPermissionGroup()     // Catch:{ all -> 0x009a }
            int r9 = r9.compareTo(r10)     // Catch:{ all -> 0x009a }
            if (r9 >= 0) goto L_0x0098
            monitor-exit(r8)
            return r2
        L_0x0098:
            monitor-exit(r8)
            return r5
        L_0x009a:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.web.jsbridge2.C11181u.mo27222a(java.lang.String, com.bytedance.ies.web.jsbridge2.a):boolean");
    }
}
