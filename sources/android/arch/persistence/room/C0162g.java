package android.arch.persistence.room;

import android.arch.persistence.p009a.C0125a;
import android.arch.persistence.p009a.C0134b;
import android.arch.persistence.p009a.C0135c.C0136a;
import android.arch.persistence.p009a.C0141e;
import android.database.Cursor;

/* renamed from: android.arch.persistence.room.g */
public final class C0162g extends C0136a {

    /* renamed from: b */
    private C0146a f361b;

    /* renamed from: c */
    private final C0163a f362c;

    /* renamed from: d */
    private final String f363d;

    /* renamed from: e */
    private final String f364e;

    /* renamed from: android.arch.persistence.room.g$a */
    public static abstract class C0163a {

        /* renamed from: a */
        public final int f365a;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo357a(C0134b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract void mo358b(C0134b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public abstract void mo359c(C0134b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public abstract void mo360d(C0134b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public abstract void mo361e(C0134b bVar);

        public C0163a(int i) {
            this.f365a = i;
        }
    }

    /* renamed from: f */
    private static void m446f(C0134b bVar) {
        bVar.mo270c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    /* renamed from: e */
    private void m445e(C0134b bVar) {
        m446f(bVar);
        bVar.mo270c(C0161f.m443a(this.f363d));
    }

    /* renamed from: a */
    public final void mo296a(C0134b bVar) {
        m445e(bVar);
        this.f362c.mo358b(bVar);
        this.f362c.mo360d(bVar);
    }

    /* renamed from: b */
    public final void mo298b(C0134b bVar) {
        super.mo298b(bVar);
        m444d(bVar);
        this.f362c.mo359c(bVar);
        this.f361b = null;
    }

    /* renamed from: g */
    private static boolean m447g(C0134b bVar) {
        Cursor b = bVar.mo267b("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = false;
            if (b.moveToFirst() && b.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            b.close();
        }
    }

    /* renamed from: d */
    private void m444d(C0134b bVar) {
        Object obj = null;
        if (m447g(bVar)) {
            Cursor a = bVar.mo265a((C0141e) new C0125a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
            try {
                if (a.moveToFirst()) {
                    obj = a.getString(0);
                }
            } finally {
                a.close();
            }
        }
        if (!this.f363d.equals(obj) && !this.f364e.equals(obj)) {
            throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
        }
    }

    /* renamed from: b */
    public final void mo299b(C0134b bVar, int i, int i2) {
        mo297a(bVar, i, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0071 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo297a(android.arch.persistence.p009a.C0134b r3, int r4, int r5) {
        /*
            r2 = this;
            android.arch.persistence.room.a r0 = r2.f361b
            if (r0 == 0) goto L_0x002c
            android.arch.persistence.room.a r0 = r2.f361b
            android.arch.persistence.room.RoomDatabase$c r0 = r0.f308d
            java.util.List r0 = r0.mo324a(r4, r5)
            if (r0 == 0) goto L_0x002c
            java.util.Iterator r0 = r0.iterator()
        L_0x0012:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0022
            java.lang.Object r1 = r0.next()
            android.arch.persistence.room.a.a r1 = (android.arch.persistence.room.p011a.C0147a) r1
            r1.mo327a(r3)
            goto L_0x0012
        L_0x0022:
            android.arch.persistence.room.g$a r0 = r2.f362c
            r0.mo361e(r3)
            r2.m445e(r3)
            r0 = 1
            goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            if (r0 != 0) goto L_0x0071
            android.arch.persistence.room.a r0 = r2.f361b
            if (r0 == 0) goto L_0x0046
            android.arch.persistence.room.a r0 = r2.f361b
            boolean r0 = r0.mo326a(r4)
            if (r0 != 0) goto L_0x0046
            android.arch.persistence.room.g$a r4 = r2.f362c
            r4.mo357a(r3)
            android.arch.persistence.room.g$a r4 = r2.f362c
            r4.mo358b(r3)
            return
        L_0x0046:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "A migration from "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = " to "
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = " was required but not found. Please provide the necessary Migration path via "
            r0.append(r4)
            java.lang.String r4 = "RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the "
            r0.append(r4)
            java.lang.String r4 = "RoomDatabase.Builder.fallbackToDestructiveMigration* methods."
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.arch.persistence.room.C0162g.mo297a(android.arch.persistence.a.b, int, int):void");
    }

    public C0162g(C0146a aVar, C0163a aVar2, String str, String str2) {
        super(aVar2.f365a);
        this.f361b = aVar;
        this.f362c = aVar2;
        this.f363d = str;
        this.f364e = str2;
    }
}
