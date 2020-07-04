package com.p280ss.android.ugc.aweme.metrics;

import com.p280ss.android.ugc.aweme.metrics.C33259d.C33260a;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.metrics.ak */
public final class C33238ak extends C33270l<C33238ak> {

    /* renamed from: A */
    public static final C33239a f86532A = new C33239a(null);

    /* renamed from: B */
    private String f86533B;

    /* renamed from: C */
    private int f86534C;

    /* renamed from: D */
    private int f86535D;

    /* renamed from: E */
    private String f86536E;

    /* renamed from: F */
    private String f86537F;

    /* renamed from: G */
    private String f86538G;

    /* renamed from: H */
    private String f86539H;

    /* renamed from: I */
    private String f86540I;

    /* renamed from: J */
    private int f86541J;

    /* renamed from: a */
    public String f86542a;

    /* renamed from: b */
    public String f86543b;

    /* renamed from: c */
    public final String f86544c;

    /* renamed from: com.ss.android.ugc.aweme.metrics.ak$a */
    public static final class C33239a {
        private C33239a() {
        }

        public /* synthetic */ C33239a(C7571f fVar) {
            this();
        }
    }

    public C33238ak() {
        this(null, 1, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67592a() {
        mo85248a("rec_uid", this.f86542a, C33260a.f86770a);
        mo85248a("enter_from", this.f86753e, C33260a.f86770a);
        mo85248a("event_type", this.f86543b, C33260a.f86770a);
        mo85248a("req_id", this.f86533B, C33260a.f86770a);
        mo85248a("impr_order", String.valueOf(this.f86534C), C33260a.f86770a);
        mo85248a("feed_order", String.valueOf(this.f86535D), C33260a.f86770a);
        mo85248a("rec_reason", this.f86536E, C33260a.f86770a);
        mo85248a("page_status", this.f86539H, C33260a.f86770a);
        mo85248a("scene_id", this.f86540I, C33260a.f86770a);
        mo85248a("card_type", this.f86538G, C33260a.f86770a);
        if (this.f86541J != -1) {
            mo85245a("sub_order", String.valueOf(this.f86541J));
        }
    }

    /* renamed from: a */
    public final C33238ak mo85093a(int i) {
        this.f86534C = i;
        return this;
    }

    /* renamed from: b */
    public final C33238ak mo85096b(int i) {
        this.f86535D = i;
        return this;
    }

    /* renamed from: f */
    public final C33238ak mo85101f(String str) {
        this.f86538G = str;
        return this;
    }

    /* renamed from: i */
    public final C33238ak mo85103i(String str) {
        this.f86540I = str;
        return this;
    }

    /* renamed from: a */
    public final C33238ak mo85095a(String str) {
        if (str == null) {
            str = "";
        }
        this.f86542a = str;
        return this;
    }

    /* renamed from: b */
    public final C33238ak mo85097b(String str) {
        if (str == null) {
            str = "";
        }
        this.f86753e = str;
        return this;
    }

    /* renamed from: c */
    public final C33238ak mo85098c(String str) {
        if (str == null) {
            str = "";
        }
        this.f86543b = str;
        return this;
    }

    /* renamed from: d */
    public final C33238ak mo85099d(String str) {
        if (str == null) {
            str = "";
        }
        this.f86533B = str;
        return this;
    }

    /* renamed from: e */
    public final C33238ak mo85100e(String str) {
        if (str == null) {
            str = "";
        }
        this.f86536E = str;
        return this;
    }

    /* renamed from: g */
    public final C33238ak mo85102g(String str) {
        if (str == null) {
            str = "";
        }
        this.f86539H = str;
        return this;
    }

    /* renamed from: a */
    public final C33238ak mo85094a(Integer num) {
        int i;
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        this.f86541J = i;
        return this;
    }

    private C33238ak(String str) {
        C7573i.m23587b(str, "event");
        super(str);
        this.f86544c = str;
        this.f86542a = "";
        this.f86543b = "";
        this.f86533B = "";
        this.f86536E = "";
        this.f86537F = "";
        this.f86538G = "";
        this.f86539H = "";
        this.f86540I = "";
        this.f86541J = -1;
        this.f86768t = true;
    }

    public /* synthetic */ C33238ak(String str, int i, C7571f fVar) {
        this("follow_card");
    }
}
