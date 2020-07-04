package com.bytedance.frameworks.core.apm.p257a;

import android.content.ContentProviderOperation;
import android.content.ContentProviderOperation.Builder;
import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.apm.C6174c;
import com.bytedance.apm.util.C6292i;
import com.bytedance.frameworks.core.apm.C6363c;
import com.bytedance.frameworks.core.apm.C6366d;
import com.bytedance.frameworks.core.apm.MonitorContentProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.bytedance.frameworks.core.apm.a.a */
public abstract class C6350a<T> implements C6366d {

    /* renamed from: a */
    private final Context f18622a = C6174c.m19129a();

    /* renamed from: b */
    private final String f18623b;

    /* renamed from: c */
    private Uri f18624c;

    /* renamed from: d */
    private String f18625d;

    /* renamed from: e */
    private final HashMap<String, Integer> f18626e = new HashMap<>();

    /* renamed from: com.bytedance.frameworks.core.apm.a.a$a */
    public interface C6352a<T> {
        /* renamed from: a */
        T mo15249a(C6353b bVar);
    }

    /* renamed from: com.bytedance.frameworks.core.apm.a.a$b */
    public static class C6353b {

        /* renamed from: a */
        Cursor f18627a;

        /* renamed from: b */
        private final HashMap<String, Integer> f18628b;

        /* renamed from: a */
        public final long mo15250a(String str) {
            try {
                return this.f18627a.getLong(m19714d(str));
            } catch (Throwable unused) {
                return -1;
            }
        }

        /* renamed from: b */
        public final int mo15251b(String str) {
            try {
                return this.f18627a.getInt(m19714d(str));
            } catch (Throwable unused) {
                return -1;
            }
        }

        /* renamed from: c */
        public final String mo15252c(String str) {
            try {
                return this.f18627a.getString(m19714d(str));
            } catch (Throwable unused) {
                return "";
            }
        }

        /* renamed from: d */
        private int m19714d(String str) {
            Integer num = (Integer) this.f18628b.get(str);
            if (num == null) {
                try {
                    num = Integer.valueOf(this.f18627a.getColumnIndex(str));
                } catch (Throwable unused) {
                    num = Integer.valueOf(-1);
                }
                this.f18628b.put(str, num);
            }
            return num.intValue();
        }

        private C6353b(Cursor cursor, HashMap<String, Integer> hashMap) {
            this.f18627a = cursor;
            this.f18628b = hashMap;
        }
    }

    /* renamed from: f */
    private static String mo15260f() {
        return "apm_monitor_t1.db";
    }

    /* renamed from: a */
    public abstract ContentValues mo15239a(T t);

    /* renamed from: c */
    public boolean mo15246c() {
        return true;
    }

    /* renamed from: d */
    public abstract String mo15247d();

    /* renamed from: e */
    public abstract String[] mo15248e();

    /* renamed from: i */
    private long m19698i() {
        return mo15245b(null, null);
    }

    /* renamed from: a */
    public final String mo15240a() {
        return mo15247d();
    }

    /* renamed from: b */
    public final long mo15244b() {
        return m19698i();
    }

    /* renamed from: g */
    private String mo15261g() {
        return C6174c.m19129a().getDatabasePath(mo15260f()).getAbsolutePath();
    }

    /* renamed from: j */
    private String m19699j() {
        if (this.f18625d == null) {
            StringBuilder sb = new StringBuilder("SELECT count(*) FROM ");
            sb.append(mo15247d());
            this.f18625d = sb.toString();
        }
        return this.f18625d;
    }

    protected C6350a() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f18622a.getPackageName());
        sb.append(".apm");
        this.f18623b = sb.toString();
        if (mo15246c()) {
            C6363c.m19780a(mo15261g(), this);
        }
    }

    /* renamed from: h */
    private Uri m19697h() {
        if (this.f18624c == null) {
            StringBuilder sb = new StringBuilder("content://");
            sb.append(this.f18623b);
            sb.append("/");
            sb.append(mo15260f());
            sb.append("/");
            sb.append(mo15247d());
            this.f18624c = Uri.parse(sb.toString());
        }
        return this.f18624c;
    }

    /* renamed from: a */
    private static void m19694a(Cursor cursor) {
        if (cursor != null) {
            try {
                if (!cursor.isClosed()) {
                    cursor.close();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0028, code lost:
        return 1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized <I extends T> long mo15238a(android.content.ContentValues r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = -1
            if (r5 != 0) goto L_0x0007
            monitor-exit(r4)
            return r0
        L_0x0007:
            android.content.Context r2 = com.bytedance.apm.C6174c.m19129a()     // Catch:{ Exception -> 0x002c, all -> 0x0029 }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ Exception -> 0x002c, all -> 0x0029 }
            android.net.Uri r3 = r4.m19697h()     // Catch:{ Exception -> 0x002c, all -> 0x0029 }
            android.net.Uri r5 = r2.insert(r3, r5)     // Catch:{ Exception -> 0x002c, all -> 0x0029 }
            if (r5 != 0) goto L_0x001b
            monitor-exit(r4)
            return r0
        L_0x001b:
            java.lang.String r5 = r5.getLastPathSegment()     // Catch:{ Exception -> 0x0025, all -> 0x0029 }
            long r0 = java.lang.Long.parseLong(r5)     // Catch:{ Exception -> 0x0025, all -> 0x0029 }
            monitor-exit(r4)
            return r0
        L_0x0025:
            r0 = 1
            monitor-exit(r4)
            return r0
        L_0x0029:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x002c:
            monitor-exit(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.core.apm.p257a.C6350a.mo15238a(android.content.ContentValues):long");
    }

    /* renamed from: a */
    public final void mo15242a(long j) {
        mo15237a("timestamp <=?", new String[]{String.valueOf(j)});
    }

    /* renamed from: a */
    public final synchronized void mo15243a(List<ContentValues> list) {
        int i;
        if (!C6292i.m19525a(list)) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2 = i) {
                ArrayList arrayList = new ArrayList(8);
                i = i2;
                for (int i3 = 0; i3 < 50 && i < size; i3++) {
                    Builder newInsert = ContentProviderOperation.newInsert(m19697h());
                    newInsert.withValues((ContentValues) list.get(i));
                    arrayList.add(newInsert.build());
                    i++;
                }
                try {
                    ContentProviderResult[] applyBatch = C6174c.m19129a().getContentResolver().applyBatch(this.f18623b, arrayList);
                    if (C6174c.m19149g()) {
                        for (ContentProviderResult contentProviderResult : applyBatch) {
                            String[] strArr = {"insertBatch ret: ", contentProviderResult.uri.toString()};
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public final int mo15237a(String str, String[] strArr) {
        try {
            return this.f18622a.getContentResolver().delete(m19697h(), str, strArr);
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public final long mo15245b(String str, String[] strArr) {
        Cursor cursor;
        String str2;
        Cursor cursor2 = null;
        long j = -1;
        try {
            Context a = C6174c.m19129a();
            Uri h = m19697h();
            if (str == null) {
                str2 = m19699j();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(m19699j());
                sb.append(" where ");
                sb.append(str);
                str2 = sb.toString();
            }
            cursor = MonitorContentProvider.m19682a(a, h, str2, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToNext()) {
                        j = cursor.getLong(0);
                    }
                } catch (Exception unused) {
                    m19694a(cursor);
                    return -1;
                } catch (Throwable th) {
                    Throwable th2 = th;
                    cursor2 = cursor;
                    th = th2;
                    m19694a(cursor2);
                    throw th;
                }
            }
            m19694a(cursor);
            return j;
        } catch (Exception unused2) {
            cursor = null;
            m19694a(cursor);
            return -1;
        } catch (Throwable th3) {
            th = th3;
            m19694a(cursor2);
            throw th;
        }
    }

    /* renamed from: a */
    public final int mo15236a(ContentValues contentValues, String str, String[] strArr) {
        if (contentValues == null) {
            return -1;
        }
        try {
            return C6174c.m19129a().getContentResolver().update(m19697h(), contentValues, str, strArr);
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public final List<T> mo15241a(String str, String[] strArr, String str2, C6352a<T> aVar) {
        Cursor cursor;
        try {
            cursor = this.f18622a.getContentResolver().query(m19697h(), mo15248e(), str, strArr, str2);
            if (cursor != null) {
                try {
                    if (cursor.getCount() > 0) {
                        LinkedList linkedList = new LinkedList();
                        while (cursor.moveToNext()) {
                            linkedList.add(aVar.mo15249a(new C6353b(cursor, this.f18626e)));
                        }
                        m19694a(cursor);
                        return linkedList;
                    }
                } catch (Throwable th) {
                    th = th;
                    m19694a(cursor);
                    throw th;
                }
            }
            List<T> emptyList = Collections.emptyList();
            m19694a(cursor);
            return emptyList;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            m19694a(cursor);
            throw th;
        }
    }
}
