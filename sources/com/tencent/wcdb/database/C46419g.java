package com.tencent.wcdb.database;

import java.util.ArrayList;
import java.util.Locale;

/* renamed from: com.tencent.wcdb.database.g */
public final class C46419g {

    /* renamed from: a */
    public final String f119575a;

    /* renamed from: b */
    public final String f119576b;

    /* renamed from: c */
    public String f119577c;

    /* renamed from: d */
    public int f119578d;

    /* renamed from: e */
    public int f119579e;

    /* renamed from: f */
    public Locale f119580f;

    /* renamed from: g */
    public boolean f119581g;

    /* renamed from: h */
    public boolean f119582h;

    /* renamed from: i */
    public int f119583i;

    /* renamed from: j */
    public boolean f119584j;

    /* renamed from: k */
    public boolean f119585k;

    /* renamed from: l */
    public final ArrayList<SQLiteCustomFunction> f119586l = new ArrayList<>();

    /* renamed from: a */
    public final boolean mo115499a() {
        return this.f119575a.equalsIgnoreCase(":memory:");
    }

    public C46419g(C46419g gVar) {
        if (gVar != null) {
            this.f119575a = gVar.f119575a;
            this.f119576b = gVar.f119576b;
            mo115498a(gVar);
            return;
        }
        throw new IllegalArgumentException("other must not be null.");
    }

    /* renamed from: a */
    public final void mo115498a(C46419g gVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("other must not be null.");
        } else if (this.f119575a.equals(gVar.f119575a)) {
            this.f119578d = gVar.f119578d;
            this.f119579e = gVar.f119579e;
            this.f119580f = gVar.f119580f;
            this.f119581g = gVar.f119581g;
            this.f119582h = gVar.f119582h;
            this.f119584j = gVar.f119584j;
            this.f119585k = gVar.f119585k;
            this.f119583i = gVar.f119583i;
            this.f119577c = gVar.f119577c;
            this.f119586l.clear();
            this.f119586l.addAll(gVar.f119586l);
        } else {
            throw new IllegalArgumentException("other configuration must refer to the same database.");
        }
    }

    public C46419g(String str, int i) {
        String str2;
        if (str != null) {
            this.f119575a = str;
            this.f119576b = str;
            this.f119578d = i;
            this.f119583i = 2;
            this.f119579e = 25;
            this.f119580f = Locale.getDefault();
            if ((i & 256) != 0) {
                str2 = "vfslog";
            } else {
                str2 = null;
            }
            this.f119577c = str2;
            return;
        }
        throw new IllegalArgumentException("path must not be null.");
    }
}
