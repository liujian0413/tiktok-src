package android.arch.persistence.room;

import android.arch.p005a.p006a.C0002a;
import android.arch.p005a.p007b.C0009b;
import android.arch.persistence.p009a.C0134b;
import android.arch.persistence.p009a.C0142f;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.support.p022v4.util.ArrayMap;
import android.support.p022v4.util.C0888a;
import com.p280ss.android.ugc.aweme.policy.Policy;
import java.util.Arrays;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: android.arch.persistence.room.d */
public final class C0156d {

    /* renamed from: j */
    private static final String[] f338j = {"UPDATE", Policy.ACTION_DELETE, "INSERT"};

    /* renamed from: a */
    ArrayMap<String, Integer> f339a;

    /* renamed from: b */
    long[] f340b;

    /* renamed from: c */
    public Object[] f341c = new Object[1];

    /* renamed from: d */
    public long f342d;

    /* renamed from: e */
    public final RoomDatabase f343e;

    /* renamed from: f */
    AtomicBoolean f344f;

    /* renamed from: g */
    public volatile C0142f f345g;

    /* renamed from: h */
    final C0009b<Object, C0159b> f346h;

    /* renamed from: i */
    Runnable f347i;

    /* renamed from: k */
    private String[] f348k;

    /* renamed from: l */
    private volatile boolean f349l;

    /* renamed from: m */
    private C0158a f350m;

    /* renamed from: android.arch.persistence.room.d$a */
    static class C0158a {

        /* renamed from: a */
        final long[] f352a;

        /* renamed from: b */
        final boolean[] f353b;

        /* renamed from: c */
        final int[] f354c;

        /* renamed from: d */
        boolean f355d;

        /* renamed from: e */
        boolean f356e;

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo355b() {
            synchronized (this) {
                this.f356e = false;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int[] mo354a() {
            boolean z;
            synchronized (this) {
                if (this.f355d) {
                    if (!this.f356e) {
                        int length = this.f352a.length;
                        int i = 0;
                        while (true) {
                            int i2 = 1;
                            if (i < length) {
                                if (this.f352a[i] > 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z != this.f353b[i]) {
                                    int[] iArr = this.f354c;
                                    if (!z) {
                                        i2 = 2;
                                    }
                                    iArr[i] = i2;
                                } else {
                                    this.f354c[i] = 0;
                                }
                                this.f353b[i] = z;
                                i++;
                            } else {
                                this.f356e = true;
                                this.f355d = false;
                                int[] iArr2 = this.f354c;
                                return iArr2;
                            }
                        }
                    }
                }
                return null;
            }
        }

        C0158a(int i) {
            this.f352a = new long[i];
            this.f353b = new boolean[i];
            this.f354c = new int[i];
            Arrays.fill(this.f352a, 0);
            Arrays.fill(this.f353b, false);
        }
    }

    /* renamed from: android.arch.persistence.room.d$b */
    static class C0159b {

        /* renamed from: a */
        final int[] f357a;

        /* renamed from: b */
        private final String[] f358b;

        /* renamed from: c */
        private final long[] f359c;

        /* renamed from: d */
        private final Set<String> f360d;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo356a(long[] jArr) {
            int length = this.f357a.length;
            Set set = null;
            for (int i = 0; i < length; i++) {
                long j = jArr[this.f357a[i]];
                if (this.f359c[i] < j) {
                    this.f359c[i] = j;
                    if (length == 1) {
                        set = this.f360d;
                    } else {
                        if (set == null) {
                            set = new C0888a(length);
                        }
                        set.add(this.f358b[i]);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo351b() {
        if (this.f344f.compareAndSet(false, true)) {
            C0002a.m4a().mo15a(this.f347i);
        }
    }

    /* renamed from: a */
    public final boolean mo350a() {
        if (!this.f343e.mo311b()) {
            return false;
        }
        if (!this.f349l) {
            this.f343e.f287b.mo277a();
        }
        if (!this.f349l) {
            return false;
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo349a(C0134b bVar) {
        synchronized (this) {
            if (!this.f349l) {
                bVar.mo266a();
                try {
                    bVar.mo270c("PRAGMA temp_store = MEMORY;");
                    bVar.mo270c("PRAGMA recursive_triggers='ON';");
                    bVar.mo270c("CREATE TEMP TABLE room_table_modification_log(version INTEGER PRIMARY KEY AUTOINCREMENT, table_id INTEGER)");
                    bVar.mo269c();
                    bVar.mo268b();
                    mo352b(bVar);
                    this.f345g = bVar.mo264a("DELETE FROM room_table_modification_log WHERE version NOT IN( SELECT MAX(version) FROM room_table_modification_log GROUP BY table_id)");
                    this.f349l = true;
                } catch (Throwable th) {
                    bVar.mo268b();
                    throw th;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo352b(C0134b bVar) {
        if (!bVar.mo272d()) {
            while (true) {
                try {
                    ReentrantLock reentrantLock = this.f343e.f291f;
                    reentrantLock.lock();
                    try {
                        int[] a = this.f350m.mo354a();
                        if (a == null) {
                            reentrantLock.unlock();
                            return;
                        }
                        int length = a.length;
                        bVar.mo266a();
                        for (int i = 0; i < length; i++) {
                            switch (a[i]) {
                                case 1:
                                    m431b(bVar, i);
                                    break;
                                case 2:
                                    m429a(bVar, i);
                                    break;
                            }
                        }
                        bVar.mo269c();
                        bVar.mo268b();
                        this.f350m.mo355b();
                        reentrantLock.unlock();
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                } catch (SQLiteException | IllegalStateException unused) {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private void m429a(C0134b bVar, int i) {
        String[] strArr;
        String str = this.f348k[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f338j) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            m430a(sb, str, str2);
            bVar.mo270c(sb.toString());
        }
    }

    public C0156d(RoomDatabase roomDatabase, String... strArr) {
        this.f344f = new AtomicBoolean(false);
        this.f349l = false;
        this.f346h = new C0009b<>();
        this.f347i = new Runnable() {
            /* renamed from: a */
            private boolean m436a() {
                Cursor a = C0156d.this.f343e.mo307a("SELECT * FROM room_table_modification_log WHERE version  > ? ORDER BY version ASC;", C0156d.this.f341c);
                boolean z = false;
                while (a.moveToNext()) {
                    try {
                        long j = a.getLong(0);
                        C0156d.this.f340b[a.getInt(1)] = j;
                        C0156d.this.f342d = j;
                        z = true;
                    } finally {
                        a.close();
                    }
                }
                return z;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:32:0x0072, code lost:
                r3 = r1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:36:0x0079, code lost:
                r1 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:37:0x007a, code lost:
                r0.unlock();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:38:0x007d, code lost:
                throw r1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:39:0x007e, code lost:
                r3 = false;
             */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Removed duplicated region for block: B:36:0x0079 A[ExcHandler: all (r1v5 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0007] */
            /* JADX WARNING: Removed duplicated region for block: B:44:0x0084  */
            /* JADX WARNING: Removed duplicated region for block: B:56:0x00b0 A[RETURN] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r6 = this;
                    android.arch.persistence.room.d r0 = android.arch.persistence.room.C0156d.this
                    android.arch.persistence.room.RoomDatabase r0 = r0.f343e
                    java.util.concurrent.locks.ReentrantLock r0 = r0.f291f
                    r1 = 0
                    r0.lock()     // Catch:{ SQLiteException | IllegalStateException -> 0x007e, all -> 0x0079 }
                    android.arch.persistence.room.d r2 = android.arch.persistence.room.C0156d.this     // Catch:{ SQLiteException | IllegalStateException -> 0x007e, all -> 0x0079 }
                    boolean r2 = r2.mo350a()     // Catch:{ SQLiteException | IllegalStateException -> 0x007e, all -> 0x0079 }
                    if (r2 != 0) goto L_0x0016
                    r0.unlock()
                    return
                L_0x0016:
                    android.arch.persistence.room.d r2 = android.arch.persistence.room.C0156d.this     // Catch:{ SQLiteException | IllegalStateException -> 0x007e, all -> 0x0079 }
                    java.util.concurrent.atomic.AtomicBoolean r2 = r2.f344f     // Catch:{ SQLiteException | IllegalStateException -> 0x007e, all -> 0x0079 }
                    r3 = 1
                    boolean r2 = r2.compareAndSet(r3, r1)     // Catch:{ SQLiteException | IllegalStateException -> 0x007e, all -> 0x0079 }
                    if (r2 != 0) goto L_0x0025
                    r0.unlock()
                    return
                L_0x0025:
                    android.arch.persistence.room.d r2 = android.arch.persistence.room.C0156d.this     // Catch:{ SQLiteException | IllegalStateException -> 0x007e, all -> 0x0079 }
                    android.arch.persistence.room.RoomDatabase r2 = r2.f343e     // Catch:{ SQLiteException | IllegalStateException -> 0x007e, all -> 0x0079 }
                    boolean r2 = r2.mo316g()     // Catch:{ SQLiteException | IllegalStateException -> 0x007e, all -> 0x0079 }
                    if (r2 == 0) goto L_0x0033
                    r0.unlock()
                    return
                L_0x0033:
                    android.arch.persistence.room.d r2 = android.arch.persistence.room.C0156d.this     // Catch:{ SQLiteException | IllegalStateException -> 0x007e, all -> 0x0079 }
                    android.arch.persistence.a.f r2 = r2.f345g     // Catch:{ SQLiteException | IllegalStateException -> 0x007e, all -> 0x0079 }
                    r2.mo294a()     // Catch:{ SQLiteException | IllegalStateException -> 0x007e, all -> 0x0079 }
                    android.arch.persistence.room.d r2 = android.arch.persistence.room.C0156d.this     // Catch:{ SQLiteException | IllegalStateException -> 0x007e, all -> 0x0079 }
                    java.lang.Object[] r2 = r2.f341c     // Catch:{ SQLiteException | IllegalStateException -> 0x007e, all -> 0x0079 }
                    android.arch.persistence.room.d r3 = android.arch.persistence.room.C0156d.this     // Catch:{ SQLiteException | IllegalStateException -> 0x007e, all -> 0x0079 }
                    long r3 = r3.f342d     // Catch:{ SQLiteException | IllegalStateException -> 0x007e, all -> 0x0079 }
                    java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteException | IllegalStateException -> 0x007e, all -> 0x0079 }
                    r2[r1] = r3     // Catch:{ SQLiteException | IllegalStateException -> 0x007e, all -> 0x0079 }
                    android.arch.persistence.room.d r2 = android.arch.persistence.room.C0156d.this     // Catch:{ SQLiteException | IllegalStateException -> 0x007e, all -> 0x0079 }
                    android.arch.persistence.room.RoomDatabase r2 = r2.f343e     // Catch:{ SQLiteException | IllegalStateException -> 0x007e, all -> 0x0079 }
                    boolean r2 = r2.f289d     // Catch:{ SQLiteException | IllegalStateException -> 0x007e, all -> 0x0079 }
                    if (r2 == 0) goto L_0x0074
                    android.arch.persistence.room.d r2 = android.arch.persistence.room.C0156d.this     // Catch:{ SQLiteException | IllegalStateException -> 0x007e, all -> 0x0079 }
                    android.arch.persistence.room.RoomDatabase r2 = r2.f343e     // Catch:{ SQLiteException | IllegalStateException -> 0x007e, all -> 0x0079 }
                    android.arch.persistence.a.c r2 = r2.f287b     // Catch:{ SQLiteException | IllegalStateException -> 0x007e, all -> 0x0079 }
                    android.arch.persistence.a.b r2 = r2.mo277a()     // Catch:{ SQLiteException | IllegalStateException -> 0x007e, all -> 0x0079 }
                    r2.mo266a()     // Catch:{ all -> 0x006d }
                    boolean r3 = r6.m436a()     // Catch:{ all -> 0x006d }
                    r2.mo269c()     // Catch:{ all -> 0x0068 }
                    r2.mo268b()     // Catch:{ SQLiteException | IllegalStateException -> 0x007f, all -> 0x0079 }
                    goto L_0x007f
                L_0x0068:
                    r1 = move-exception
                    r5 = r3
                    r3 = r1
                    r1 = r5
                    goto L_0x006e
                L_0x006d:
                    r3 = move-exception
                L_0x006e:
                    r2.mo268b()     // Catch:{ SQLiteException | IllegalStateException -> 0x0072, all -> 0x0079 }
                    throw r3     // Catch:{ SQLiteException | IllegalStateException -> 0x0072, all -> 0x0079 }
                L_0x0072:
                    r3 = r1
                    goto L_0x007f
                L_0x0074:
                    boolean r3 = r6.m436a()     // Catch:{ SQLiteException | IllegalStateException -> 0x007e, all -> 0x0079 }
                    goto L_0x007f
                L_0x0079:
                    r1 = move-exception
                    r0.unlock()
                    throw r1
                L_0x007e:
                    r3 = 0
                L_0x007f:
                    r0.unlock()
                    if (r3 == 0) goto L_0x00b0
                    android.arch.persistence.room.d r0 = android.arch.persistence.room.C0156d.this
                    android.arch.a.b.b<java.lang.Object, android.arch.persistence.room.d$b> r0 = r0.f346h
                    monitor-enter(r0)
                    android.arch.persistence.room.d r1 = android.arch.persistence.room.C0156d.this     // Catch:{ all -> 0x00ad }
                    android.arch.a.b.b<java.lang.Object, android.arch.persistence.room.d$b> r1 = r1.f346h     // Catch:{ all -> 0x00ad }
                    java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00ad }
                L_0x0091:
                    boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00ad }
                    if (r2 == 0) goto L_0x00ab
                    java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00ad }
                    java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x00ad }
                    java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x00ad }
                    android.arch.persistence.room.d$b r2 = (android.arch.persistence.room.C0156d.C0159b) r2     // Catch:{ all -> 0x00ad }
                    android.arch.persistence.room.d r3 = android.arch.persistence.room.C0156d.this     // Catch:{ all -> 0x00ad }
                    long[] r3 = r3.f340b     // Catch:{ all -> 0x00ad }
                    r2.mo356a(r3)     // Catch:{ all -> 0x00ad }
                    goto L_0x0091
                L_0x00ab:
                    monitor-exit(r0)     // Catch:{ all -> 0x00ad }
                    return
                L_0x00ad:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x00ad }
                    throw r1
                L_0x00b0:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: android.arch.persistence.room.C0156d.C01571.run():void");
            }
        };
        this.f343e = roomDatabase;
        this.f350m = new C0158a(strArr.length);
        this.f339a = new ArrayMap<>();
        int length = strArr.length;
        this.f348k = new String[length];
        for (int i = 0; i < length; i++) {
            String lowerCase = strArr[i].toLowerCase(Locale.US);
            this.f339a.put(lowerCase, Integer.valueOf(i));
            this.f348k[i] = lowerCase;
        }
        this.f340b = new long[strArr.length];
        Arrays.fill(this.f340b, 0);
    }

    /* renamed from: b */
    private void m431b(C0134b bVar, int i) {
        String[] strArr;
        String str = this.f348k[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f338j) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            m430a(sb, str, str2);
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN INSERT OR REPLACE INTO room_table_modification_log");
            sb.append(" VALUES(null, ");
            sb.append(i);
            sb.append("); END");
            bVar.mo270c(sb.toString());
        }
    }

    /* renamed from: a */
    private static void m430a(StringBuilder sb, String str, String str2) {
        sb.append("`room_table_modification_trigger_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("`");
    }
}
