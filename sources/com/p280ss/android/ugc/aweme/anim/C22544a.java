package com.p280ss.android.ugc.aweme.anim;

import android.content.Context;
import android.util.LruCache;
import com.facebook.keyframes.model.C14052j;
import com.p280ss.android.p281a.p282a.p283a.C6726a;

/* renamed from: com.ss.android.ugc.aweme.anim.a */
public class C22544a {

    /* renamed from: a */
    public static final String f60062a = "a";

    /* renamed from: b */
    public LruCache<String, C14052j> f60063b;

    /* renamed from: com.ss.android.ugc.aweme.anim.a$a */
    static class C22548a {

        /* renamed from: a */
        public static C22544a f60072a = new C22544a();
    }

    /* renamed from: a */
    public static C22544a m74540a() {
        return C22548a.f60072a;
    }

    private C22544a() {
        this.f60063b = new LruCache<String, C14052j>(5242880) {
            /* access modifiers changed from: protected */
            public final /* synthetic */ int sizeOf(Object obj, Object obj2) {
                return m74544a((String) obj, (C14052j) obj2);
            }

            /* renamed from: a */
            private static int m74544a(String str, C14052j jVar) {
                if (jVar == null || jVar.f37120e == null || jVar.f37120e.length <= 0) {
                    return 1;
                }
                float f = 1.0f;
                for (float f2 : jVar.f37120e) {
                    f += f2;
                }
                return (int) f;
            }
        };
    }

    /* renamed from: a */
    public static C14052j m74539a(Context context, String str) {
        return m74542b(context, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0025 A[SYNTHETIC, Splitter:B:19:0x0025] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x002d A[SYNTHETIC, Splitter:B:26:0x002d] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.facebook.keyframes.model.C14052j m74542b(android.content.Context r1, java.lang.String r2) {
        /*
            r0 = 0
            if (r1 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ IOException -> 0x001e, all -> 0x001c }
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch:{ IOException -> 0x001e, all -> 0x001c }
            java.io.InputStream r1 = r1.open(r2)     // Catch:{ IOException -> 0x001e, all -> 0x001c }
            com.facebook.keyframes.model.j r2 = com.facebook.keyframes.p732a.C14004l.m41344a(r1)     // Catch:{ IOException -> 0x001a }
            if (r1 == 0) goto L_0x0019
            r1.close()     // Catch:{ IOException -> 0x0019 }
        L_0x0019:
            return r2
        L_0x001a:
            r2 = move-exception
            goto L_0x0020
        L_0x001c:
            r2 = move-exception
            goto L_0x002b
        L_0x001e:
            r2 = move-exception
            r1 = r0
        L_0x0020:
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21559a(r2)     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x0028
            r1.close()     // Catch:{ IOException -> 0x0028 }
        L_0x0028:
            return r0
        L_0x0029:
            r2 = move-exception
            r0 = r1
        L_0x002b:
            if (r0 == 0) goto L_0x0030
            r0.close()     // Catch:{ IOException -> 0x0030 }
        L_0x0030:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.anim.C22544a.m74542b(android.content.Context, java.lang.String):com.facebook.keyframes.model.j");
    }

    /* renamed from: a */
    public final void mo59153a(Context context, String str, C22549b bVar) {
        m74541a(context, str, bVar, true);
    }

    /* renamed from: a */
    private void m74541a(Context context, String str, C22549b bVar, boolean z) {
        if (str != null) {
            C14052j jVar = (C14052j) this.f60063b.get(str);
            if (jVar != null) {
                bVar.mo59157a(jVar, str);
                return;
            }
            final String str2 = str;
            final Context context2 = context;
            final C22549b bVar2 = bVar;
            C225462 r0 = new Runnable(true) {
                public final void run() {
                    final C14052j a = C22544a.m74539a(context2, str2);
                    if (a != null) {
                        if (true) {
                            C22544a.this.f60063b.put(str2, a);
                        }
                        C6726a.m20844b(new Runnable() {
                            public final void run() {
                                bVar2.mo59157a(a, str2);
                            }
                        });
                    }
                }
            };
            C6726a.m20842a(r0);
        }
    }
}
