package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.C14873l;
import com.google.android.gms.ads.formats.C14750b;
import com.google.android.gms.ads.formats.C14750b.C14751a;
import com.google.android.gms.ads.mediation.C14899i;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.pw */
public final class C15964pw implements C14899i {

    /* renamed from: a */
    private final Date f44860a;

    /* renamed from: b */
    private final int f44861b;

    /* renamed from: c */
    private final Set<String> f44862c;

    /* renamed from: d */
    private final boolean f44863d;

    /* renamed from: e */
    private final Location f44864e;

    /* renamed from: f */
    private final int f44865f;

    /* renamed from: g */
    private final zzafl f44866g;

    /* renamed from: h */
    private final List<String> f44867h = new ArrayList();

    /* renamed from: i */
    private final boolean f44868i;

    /* renamed from: j */
    private final Map<String, Boolean> f44869j = new HashMap();

    /* renamed from: k */
    private final int f44870k;

    /* renamed from: l */
    private final String f44871l;

    public C15964pw(Date date, int i, Set<String> set, Location location, boolean z, int i2, zzafl zzafl, List<String> list, boolean z2, int i3, String str) {
        this.f44860a = date;
        this.f44861b = i;
        this.f44862c = set;
        this.f44864e = location;
        this.f44863d = z;
        this.f44865f = i2;
        this.f44866g = zzafl;
        this.f44868i = z2;
        this.f44870k = i3;
        this.f44871l = str;
        String str2 = "custom:";
        if (list != null) {
            for (String str3 : list) {
                if (str3.startsWith(str2)) {
                    String[] split = str3.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            this.f44869j.put(split[1], Boolean.valueOf(true));
                        } else if ("false".equals(split[2])) {
                            this.f44869j.put(split[1], Boolean.valueOf(false));
                        }
                    }
                } else {
                    this.f44867h.add(str3);
                }
            }
        }
    }

    /* renamed from: a */
    public final Date mo37899a() {
        return this.f44860a;
    }

    /* renamed from: b */
    public final int mo37900b() {
        return this.f44861b;
    }

    /* renamed from: c */
    public final Set<String> mo37901c() {
        return this.f44862c;
    }

    /* renamed from: d */
    public final Location mo37902d() {
        return this.f44864e;
    }

    /* renamed from: f */
    public final boolean mo37904f() {
        return this.f44863d;
    }

    /* renamed from: e */
    public final int mo37903e() {
        return this.f44865f;
    }

    /* renamed from: h */
    public final C14750b mo37936h() {
        if (this.f44866g == null) {
            return null;
        }
        C14751a b = new C14751a().mo37506a(this.f44866g.f45507b).mo37504a(this.f44866g.f45508c).mo37509b(this.f44866g.f45509d);
        if (this.f44866g.f45506a >= 2) {
            b.mo37510c(this.f44866g.f45510e);
        }
        if (this.f44866g.f45506a >= 3 && this.f44866g.f45511f != null) {
            b.mo37505a(new C14873l(this.f44866g.f45511f));
        }
        return b.mo37507a();
    }

    /* renamed from: i */
    public final boolean mo37937i() {
        return this.f44867h != null && (this.f44867h.contains("2") || this.f44867h.contains("6"));
    }

    /* renamed from: j */
    public final boolean mo37938j() {
        return this.f44867h != null && this.f44867h.contains("6");
    }

    /* renamed from: k */
    public final boolean mo37939k() {
        return this.f44867h != null && (this.f44867h.contains("1") || this.f44867h.contains("6"));
    }

    /* renamed from: l */
    public final boolean mo37940l() {
        return this.f44867h != null && this.f44867h.contains("3");
    }

    /* renamed from: m */
    public final Map<String, Boolean> mo37941m() {
        return this.f44869j;
    }

    /* renamed from: g */
    public final boolean mo37905g() {
        return this.f44868i;
    }
}
