package com.p280ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.metrics.C33259d.C33260a;
import com.p280ss.android.ugc.aweme.p1003am.C22494d;

/* renamed from: com.ss.android.ugc.aweme.metrics.ao */
public final class C33243ao extends C33259d {

    /* renamed from: A */
    private String f86570A;

    /* renamed from: B */
    private String f86571B;

    /* renamed from: C */
    private String f86572C;

    /* renamed from: D */
    private boolean f86573D;

    /* renamed from: E */
    private String f86574E;

    /* renamed from: F */
    private String f86575F;

    /* renamed from: G */
    private String f86576G;

    /* renamed from: a */
    private String f86577a;

    /* renamed from: b */
    private String f86578b;

    /* renamed from: c */
    private String f86579c;

    /* renamed from: v */
    private String f86580v;

    /* renamed from: w */
    private String f86581w;

    /* renamed from: x */
    private String f86582x;

    /* renamed from: y */
    private String f86583y;

    /* renamed from: z */
    private int f86584z;

    public C33243ao() {
        super("shoot");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67592a() {
        mo85248a("shoot_way", this.f86577a, C33260a.f86770a);
        if (!TextUtils.isEmpty(this.f86578b)) {
            mo85248a("music_id", this.f86578b, C33260a.f86771b);
        }
        if (!TextUtils.isEmpty(this.f86581w)) {
            mo85248a("group_id", this.f86581w, C33260a.f86771b);
        }
        if (!TextUtils.isEmpty(this.f86580v)) {
            mo85248a("poi_id", this.f86580v, C33260a.f86771b);
        }
        if (!TextUtils.isEmpty(this.f86579c)) {
            mo85248a("tag_id", this.f86579c, C33260a.f86771b);
        }
        if (!TextUtils.isEmpty(this.f86570A)) {
            mo85248a("sticker_id", this.f86570A, C33260a.f86771b);
        }
        mo85248a("content_type", this.f86582x, C33260a.f86770a);
        mo85248a("content_cnt", String.valueOf(this.f86584z), C33260a.f86770a);
        mo85248a("creation_id", this.f86571B, C33260a.f86770a);
        mo85248a("content_source", this.f86583y, C33260a.f86770a);
        if (this.f86573D) {
            mo85248a("log_pb", this.f86572C, C33260a.f86770a);
        }
        if (C22494d.m74385a().mo59063a(this.f86581w)) {
            mo85248a("previous_page", "push", C33260a.f86770a);
        }
        if (!TextUtils.isEmpty(this.f86574E)) {
            mo85245a("coupon_code", this.f86574E);
        }
        if (!TextUtils.isEmpty(this.f86575F)) {
            mo85245a("supplier_id", this.f86575F);
        }
        if (!TextUtils.isEmpty(this.f86576G)) {
            mo85245a("order_id", this.f86576G);
        }
        mo85253f();
        C6903bc.m21496o().mo88917b("shoot", "");
    }

    /* renamed from: a */
    public final C33243ao mo85114a(int i) {
        this.f86584z = i;
        return this;
    }

    /* renamed from: b */
    public final C33243ao mo85117b(String str) {
        this.f86580v = str;
        return this;
    }

    /* renamed from: c */
    public final C33243ao mo85118c(String str) {
        this.f86582x = str;
        return this;
    }

    /* renamed from: d */
    public final C33243ao mo85119d(String str) {
        this.f86583y = str;
        return this;
    }

    /* renamed from: e */
    public final C33243ao mo85120e(String str) {
        this.f86571B = str;
        return this;
    }

    /* renamed from: f */
    public final C33243ao mo85121f(String str) {
        this.f86572C = str;
        return this;
    }

    /* renamed from: a */
    public final C33243ao mo85115a(String str) {
        this.f86577a = str;
        return this;
    }

    /* renamed from: a */
    public final C33243ao mo85116a(boolean z) {
        this.f86573D = true;
        return this;
    }
}
