package com.p280ss.android.ugc.aweme.freeflowcard.p1279b;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.base.utils.C6900g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.freeflowcard.b.a */
public class C29972a implements C29974c {

    /* renamed from: a */
    public static volatile String f78778a = "";

    /* renamed from: b */
    public static volatile boolean f78779b;

    /* renamed from: d */
    private static volatile C29972a f78780d;

    /* renamed from: c */
    private List<C29975d> f78781c;

    /* renamed from: b */
    public final boolean mo76170b() {
        return true;
    }

    private C29972a() {
        m98274d();
    }

    /* renamed from: c */
    public final boolean mo76171c() {
        f78779b = true;
        boolean a = mo76168a(false);
        f78779b = false;
        return a;
    }

    /* renamed from: a */
    public static C29972a m98273a() {
        if (f78780d == null) {
            synchronized (C29972a.class) {
                if (f78780d == null) {
                    f78780d = new C29972a();
                }
            }
        }
        return f78780d;
    }

    /* renamed from: d */
    private void m98274d() {
        this.f78781c = new ArrayList();
        this.f78781c.add(C29973b.f78782a);
        this.f78781c.add(C29976e.f78783a);
        this.f78781c.add(C29980g.f78792b);
    }

    /* renamed from: a */
    public final boolean mo76167a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        f78778a = str;
        boolean a = mo76168a(false);
        f78778a = "";
        return a;
    }

    /* renamed from: a */
    public final boolean mo76168a(boolean z) {
        if (!C6900g.m21454b().mo16943d()) {
            return true;
        }
        for (C29975d dVar : this.f78781c) {
            if (dVar.mo76170b()) {
                return dVar.mo76168a(z);
            }
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo76169a(boolean z, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        f78778a = str;
        boolean a = mo76168a(z);
        f78778a = "";
        return a;
    }
}
