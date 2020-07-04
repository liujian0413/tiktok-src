package android.arch.persistence.p009a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build.VERSION;
import java.io.File;

/* renamed from: android.arch.persistence.a.c */
public interface C0135c {

    /* renamed from: android.arch.persistence.a.c$a */
    public static abstract class C0136a {

        /* renamed from: a */
        public final int f279a;

        /* renamed from: a */
        public abstract void mo296a(C0134b bVar);

        /* renamed from: a */
        public abstract void mo297a(C0134b bVar, int i, int i2);

        /* renamed from: b */
        public void mo298b(C0134b bVar) {
        }

        public C0136a(int i) {
            this.f279a = i;
        }

        /* renamed from: a */
        private static void m365a(String str) {
            if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
                try {
                    if (VERSION.SDK_INT >= 16) {
                        SQLiteDatabase.deleteDatabase(new File(str));
                    } else {
                        try {
                            new File(str).delete();
                        } catch (Exception unused) {
                        }
                    }
                } catch (Exception unused2) {
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
            if (r0 != null) goto L_0x001d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
            r3 = r0.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
            if (r3.hasNext() != false) goto L_0x0027;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
            m365a((java.lang.String) ((android.util.Pair) r3.next()).second);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
            m365a(r3.mo274f());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0017 */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x003f  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0015 A[ExcHandler: all (r1v0 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r0 
          PHI: (r0v8 java.util.List) = (r0v1 java.util.List), (r0v2 java.util.List), (r0v2 java.util.List) binds: [B:5:0x000f, B:9:0x0017, B:10:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:5:0x000f] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo300c(android.arch.persistence.p009a.C0134b r3) {
            /*
                r2 = this;
                boolean r0 = r3.mo273e()
                if (r0 != 0) goto L_0x000e
                java.lang.String r3 = r3.mo274f()
                m365a(r3)
                return
            L_0x000e:
                r0 = 0
                java.util.List r1 = r3.mo275g()     // Catch:{ SQLiteException -> 0x0017, all -> 0x0015 }
                r0 = r1
                goto L_0x0017
            L_0x0015:
                r1 = move-exception
                goto L_0x001b
            L_0x0017:
                r3.close()     // Catch:{ IOException -> 0x003d, all -> 0x0015 }
                goto L_0x003d
            L_0x001b:
                if (r0 == 0) goto L_0x0035
                java.util.Iterator r3 = r0.iterator()
            L_0x0021:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x003c
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                java.lang.Object r0 = r0.second
                java.lang.String r0 = (java.lang.String) r0
                m365a(r0)
                goto L_0x0021
            L_0x0035:
                java.lang.String r3 = r3.mo274f()
                m365a(r3)
            L_0x003c:
                throw r1
            L_0x003d:
                if (r0 == 0) goto L_0x0058
                java.util.Iterator r3 = r0.iterator()
            L_0x0043:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x0057
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                java.lang.Object r0 = r0.second
                java.lang.String r0 = (java.lang.String) r0
                m365a(r0)
                goto L_0x0043
            L_0x0057:
                return
            L_0x0058:
                java.lang.String r3 = r3.mo274f()
                m365a(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.arch.persistence.p009a.C0135c.C0136a.mo300c(android.arch.persistence.a.b):void");
        }

        /* renamed from: b */
        public void mo299b(C0134b bVar, int i, int i2) {
            StringBuilder sb = new StringBuilder("Can't downgrade database from version ");
            sb.append(i);
            sb.append(" to ");
            sb.append(i2);
            throw new SQLiteException(sb.toString());
        }
    }

    /* renamed from: android.arch.persistence.a.c$b */
    public static class C0137b {

        /* renamed from: a */
        public final Context f280a;

        /* renamed from: b */
        public final String f281b;

        /* renamed from: c */
        public final C0136a f282c;

        /* renamed from: android.arch.persistence.a.c$b$a */
        public static class C0138a {

            /* renamed from: a */
            Context f283a;

            /* renamed from: b */
            String f284b;

            /* renamed from: c */
            C0136a f285c;

            /* renamed from: a */
            public final C0137b mo303a() {
                if (this.f285c == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                } else if (this.f283a != null) {
                    return new C0137b(this.f283a, this.f284b, this.f285c);
                } else {
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
            }

            /* renamed from: a */
            public final C0138a mo301a(C0136a aVar) {
                this.f285c = aVar;
                return this;
            }

            C0138a(Context context) {
                this.f283a = context;
            }

            /* renamed from: a */
            public final C0138a mo302a(String str) {
                this.f284b = str;
                return this;
            }
        }

        /* renamed from: a */
        public static C0138a m371a(Context context) {
            return new C0138a(context);
        }

        C0137b(Context context, String str, C0136a aVar) {
            this.f280a = context;
            this.f281b = str;
            this.f282c = aVar;
        }
    }

    /* renamed from: android.arch.persistence.a.c$c */
    public interface C0139c {
        /* renamed from: a */
        C0135c mo287a(C0137b bVar);
    }

    /* renamed from: a */
    C0134b mo277a();

    /* renamed from: a */
    void mo278a(boolean z);
}
