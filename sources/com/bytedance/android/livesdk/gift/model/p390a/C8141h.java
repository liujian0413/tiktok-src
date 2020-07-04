package com.bytedance.android.livesdk.gift.model.p390a;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import java.util.Set;

/* renamed from: com.bytedance.android.livesdk.gift.model.a.h */
public final class C8141h extends C8134a<Prop> {
    /* renamed from: c */
    public final boolean mo21262c() {
        return false;
    }

    /* renamed from: a */
    public final int mo21260a() {
        return ((Prop) this.f22206d).diamond;
    }

    /* renamed from: g */
    public final String mo21266g() {
        return ((Prop) this.f22206d).manual;
    }

    /* renamed from: i */
    public final String mo21268i() {
        return ((Prop) this.f22206d).guideUrl;
    }

    /* renamed from: j */
    public final String mo21269j() {
        return ((Prop) this.f22206d).name;
    }

    /* renamed from: l */
    public final String mo21271l() {
        return ((Prop) this.f22206d).description;
    }

    /* renamed from: n */
    public final ImageModel mo21273n() {
        return ((Prop) this.f22206d).labelIcon;
    }

    /* renamed from: o */
    public final ImageModel mo21274o() {
        return ((Prop) this.f22206d).icon;
    }

    /* renamed from: p */
    public final long mo21275p() {
        return ((Prop) this.f22206d).f22201id;
    }

    /* renamed from: q */
    public final ImageModel mo21276q() {
        return ((Prop) this.f22206d).diamondLabel;
    }

    /* renamed from: b */
    public final boolean mo21261b() {
        if (((Prop) this.f22206d).gift == null) {
            return false;
        }
        return ((Prop) this.f22206d).gift.f22236g;
    }

    /* renamed from: k */
    public final int mo21270k() {
        if (((Prop) this.f22206d).gift == null) {
            return super.mo21270k();
        }
        return ((Prop) this.f22206d).gift.f22240k;
    }

    /* renamed from: m */
    public final int mo21272m() {
        if (((Prop) this.f22206d).gift == null) {
            return super.mo21272m();
        }
        return ((Prop) this.f22206d).gift.f22241l;
    }

    /* renamed from: e */
    public final boolean mo21264e() {
        if (((Prop) this.f22206d).gift == null || (((Prop) this.f22206d).gift.f22234e != 1 && ((Prop) this.f22206d).gift.f22234e != 5)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo21265f() {
        if (TextUtils.isEmpty(((Prop) this.f22206d).manual) || ((Set) C8946b.f24351C.mo22117a()).contains(Long.valueOf(((Prop) this.f22206d).f22201id))) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final boolean mo21267h() {
        if (TextUtils.isEmpty(((Prop) this.f22206d).guideUrl) || ((Set) C8946b.f24352D.mo22117a()).contains(String.valueOf(((Prop) this.f22206d).f22201id))) {
            return false;
        }
        return true;
    }

    public C8141h(Prop prop) {
        super(2, prop);
    }
}
