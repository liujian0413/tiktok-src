package com.google.gson;

import com.google.gson.internal.C6619a;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.C6649j;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.p277b.C6597a;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.gson.f */
public final class C6607f {

    /* renamed from: a */
    private Excluder f18932a = Excluder.f18949a;

    /* renamed from: b */
    private LongSerializationPolicy f18933b = LongSerializationPolicy.DEFAULT;

    /* renamed from: c */
    private C6599d f18934c = FieldNamingPolicy.IDENTITY;

    /* renamed from: d */
    private final Map<Type, C6608g<?>> f18935d = new HashMap();

    /* renamed from: e */
    private final List<C6717s> f18936e = new ArrayList();

    /* renamed from: f */
    private final List<C6717s> f18937f = new ArrayList();

    /* renamed from: g */
    private boolean f18938g = false;

    /* renamed from: h */
    private String f18939h;

    /* renamed from: i */
    private int f18940i = 2;

    /* renamed from: j */
    private int f18941j = 2;

    /* renamed from: k */
    private boolean f18942k = false;

    /* renamed from: l */
    private boolean f18943l = false;

    /* renamed from: m */
    private boolean f18944m = true;

    /* renamed from: n */
    private boolean f18945n = false;

    /* renamed from: o */
    private boolean f18946o = false;

    /* renamed from: p */
    private boolean f18947p = false;

    /* renamed from: b */
    public final C6607f mo15988b() {
        this.f18938g = true;
        return this;
    }

    /* renamed from: c */
    public final C6607f mo15989c() {
        this.f18945n = true;
        return this;
    }

    /* renamed from: d */
    public final C6607f mo15990d() {
        this.f18947p = true;
        return this;
    }

    /* renamed from: e */
    public final C6607f mo15991e() {
        this.f18944m = false;
        return this;
    }

    /* renamed from: a */
    public final C6607f mo15983a() {
        this.f18932a = this.f18932a.mo16008a();
        return this;
    }

    /* renamed from: f */
    public final C6600e mo15992f() {
        ArrayList arrayList = r1;
        ArrayList arrayList2 = new ArrayList(this.f18936e.size() + this.f18937f.size() + 3);
        arrayList2.addAll(this.f18936e);
        Collections.reverse(arrayList2);
        ArrayList arrayList3 = new ArrayList(this.f18937f);
        Collections.reverse(arrayList3);
        arrayList2.addAll(arrayList3);
        m20485a(this.f18939h, this.f18940i, this.f18941j, arrayList2);
        C6600e eVar = new C6600e(this.f18932a, this.f18934c, this.f18935d, this.f18938g, this.f18942k, this.f18946o, this.f18944m, this.f18945n, this.f18947p, this.f18943l, this.f18933b, this.f18939h, this.f18940i, this.f18941j, this.f18936e, this.f18937f, arrayList);
        return eVar;
    }

    /* renamed from: a */
    public final C6607f mo15984a(FieldNamingPolicy fieldNamingPolicy) {
        this.f18934c = fieldNamingPolicy;
        return this;
    }

    /* renamed from: a */
    public final C6607f mo15985a(C6717s sVar) {
        this.f18936e.add(sVar);
        return this;
    }

    /* renamed from: a */
    public final C6607f mo15987a(C6596b... bVarArr) {
        for (int i = 0; i <= 0; i++) {
            this.f18932a = this.f18932a.mo16009a(bVarArr[0], true, true);
        }
        return this;
    }

    /* renamed from: a */
    public final C6607f mo15986a(Type type, Object obj) {
        boolean z;
        boolean z2 = obj instanceof C6714q;
        if (z2 || (obj instanceof C6708j) || (obj instanceof C6608g) || (obj instanceof C6715r)) {
            z = true;
        } else {
            z = false;
        }
        C6619a.m20528a(z);
        if (obj instanceof C6608g) {
            this.f18935d.put(type, (C6608g) obj);
        }
        if (z2 || (obj instanceof C6708j)) {
            this.f18936e.add(TreeTypeAdapter.m20577a(C6597a.get(type), obj));
        }
        if (obj instanceof C6715r) {
            this.f18936e.add(C6649j.m20630a(C6597a.get(type), (C6715r) obj));
        }
        return this;
    }

    /* renamed from: a */
    private static void m20485a(String str, int i, int i2, List<C6717s> list) {
        C6590a aVar;
        C6590a aVar2;
        C6590a aVar3;
        if (str != null && !"".equals(str.trim())) {
            C6590a aVar4 = new C6590a(Date.class, str);
            aVar = new C6590a(Timestamp.class, str);
            aVar3 = new C6590a(java.sql.Date.class, str);
            aVar2 = aVar4;
        } else if (i != 2 && i2 != 2) {
            aVar2 = new C6590a(Date.class, i, i2);
            C6590a aVar5 = new C6590a(Timestamp.class, i, i2);
            C6590a aVar6 = new C6590a(java.sql.Date.class, i, i2);
            aVar = aVar5;
            aVar3 = aVar6;
        } else {
            return;
        }
        list.add(C6649j.m20631a(Date.class, (C6715r<TT>) aVar2));
        list.add(C6649j.m20631a(Timestamp.class, (C6715r<TT>) aVar));
        list.add(C6649j.m20631a(java.sql.Date.class, (C6715r<TT>) aVar3));
    }
}
