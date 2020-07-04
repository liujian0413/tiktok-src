package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.support.p022v4.util.ArrayMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.ew */
public final class C16514ew implements C16519fa {

    /* renamed from: a */
    static final Map<Uri, C16514ew> f46288a = new ArrayMap();

    /* renamed from: g */
    private static final String[] f46289g = {"key", "value"};

    /* renamed from: b */
    private final ContentResolver f46290b;

    /* renamed from: c */
    private final Uri f46291c;

    /* renamed from: d */
    private final Object f46292d = new Object();

    /* renamed from: e */
    private volatile Map<String, String> f46293e;

    /* renamed from: f */
    private final List<Object> f46294f = new ArrayList();

    private C16514ew(ContentResolver contentResolver, Uri uri) {
        this.f46290b = contentResolver;
        this.f46291c = uri;
        this.f46290b.registerContentObserver(uri, false, new C16516ey(this, null));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0018 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.measurement.C16514ew m53825a(android.content.ContentResolver r3, android.net.Uri r4) {
        /*
            java.lang.Class<com.google.android.gms.internal.measurement.ew> r0 = com.google.android.gms.internal.measurement.C16514ew.class
            monitor-enter(r0)
            java.util.Map<android.net.Uri, com.google.android.gms.internal.measurement.ew> r1 = f46288a     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x001a }
            com.google.android.gms.internal.measurement.ew r1 = (com.google.android.gms.internal.measurement.C16514ew) r1     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0018
            com.google.android.gms.internal.measurement.ew r2 = new com.google.android.gms.internal.measurement.ew     // Catch:{ SecurityException -> 0x0018 }
            r2.<init>(r3, r4)     // Catch:{ SecurityException -> 0x0018 }
            java.util.Map<android.net.Uri, com.google.android.gms.internal.measurement.ew> r3 = f46288a     // Catch:{ SecurityException -> 0x0017 }
            r3.put(r4, r2)     // Catch:{ SecurityException -> 0x0017 }
        L_0x0017:
            r1 = r2
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r1
        L_0x001a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16514ew.m53825a(android.content.ContentResolver, android.net.Uri):com.google.android.gms.internal.measurement.ew");
    }

    /* renamed from: a */
    public final Map<String, String> mo42708a() {
        Map<String, String> map = this.f46293e;
        if (map == null) {
            synchronized (this.f46292d) {
                map = this.f46293e;
                if (map == null) {
                    map = m53826d();
                    this.f46293e = map;
                }
            }
        }
        if (map != null) {
            return map;
        }
        return Collections.emptyMap();
    }

    /* renamed from: b */
    public final void mo42709b() {
        synchronized (this.f46292d) {
            this.f46293e = null;
            C16526fh.m53854a();
        }
        synchronized (this) {
            Iterator it = this.f46294f.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* renamed from: d */
    private final Map<String, String> m53826d() {
        try {
            return (Map) C16520fb.m53840a(new C16515ex(this));
        } catch (SQLiteException | SecurityException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo42707a(String str) {
        return (String) mo42708a().get(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ Map mo42710c() {
        Map map;
        Cursor query = this.f46290b.query(this.f46291c, f46289g, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                map = new ArrayMap(count);
            } else {
                map = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                map.put(query.getString(0), query.getString(1));
            }
            query.close();
            return map;
        } finally {
            query.close();
        }
    }
}
