package com.bytedance.android.livesdk.gift.model.p390a;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import java.util.Set;

/* renamed from: com.bytedance.android.livesdk.gift.model.a.f */
public class C8139f extends C8134a<C8149d> {
    /* renamed from: a */
    public int mo21260a() {
        return ((C8149d) this.f22206d).f22235f;
    }

    /* renamed from: b */
    public final boolean mo21261b() {
        return ((C8149d) this.f22206d).f22236g;
    }

    /* renamed from: c */
    public final boolean mo21262c() {
        return ((C8149d) this.f22206d).f22238i;
    }

    /* renamed from: g */
    public final String mo21266g() {
        return ((C8149d) this.f22206d).f22248s;
    }

    /* renamed from: i */
    public final String mo21268i() {
        return ((C8149d) this.f22206d).f22249t;
    }

    /* renamed from: j */
    public final String mo21269j() {
        return ((C8149d) this.f22206d).f22230a;
    }

    /* renamed from: k */
    public final int mo21270k() {
        return ((C8149d) this.f22206d).f22240k;
    }

    /* renamed from: l */
    public final String mo21271l() {
        return ((C8149d) this.f22206d).f22232c;
    }

    /* renamed from: m */
    public final int mo21272m() {
        return ((C8149d) this.f22206d).f22241l;
    }

    /* renamed from: n */
    public final ImageModel mo21273n() {
        return ((C8149d) this.f22206d).f22244o;
    }

    /* renamed from: o */
    public final ImageModel mo21274o() {
        return ((C8149d) this.f22206d).f22231b;
    }

    /* renamed from: p */
    public final long mo21275p() {
        return ((C8149d) this.f22206d).f22233d;
    }

    /* renamed from: r */
    public final C8149d mo21277r() {
        return (C8149d) this.f22206d;
    }

    /* renamed from: d */
    public final boolean mo21263d() {
        if (((C8149d) this.f22206d).f22234e != 10 || ((C8149d) this.f22206d).f22251v <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo21264e() {
        if (((C8149d) this.f22206d).f22234e == 1 || ((C8149d) this.f22206d).f22234e == 5 || ((C8149d) this.f22206d).f22234e == 10) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo21265f() {
        if (TextUtils.isEmpty(((C8149d) this.f22206d).f22248s) || ((Set) C8946b.f24351C.mo22117a()).contains(Long.valueOf(((C8149d) this.f22206d).f22233d))) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final boolean mo21267h() {
        if (TextUtils.isEmpty(((C8149d) this.f22206d).f22249t) || ((Set) C8946b.f24352D.mo22117a()).contains(String.valueOf(((C8149d) this.f22206d).f22233d))) {
            return false;
        }
        return true;
    }

    public C8139f(C8149d dVar) {
        super(1, dVar);
    }

    C8139f(int i, C8149d dVar) {
        super(i, dVar);
    }
}
