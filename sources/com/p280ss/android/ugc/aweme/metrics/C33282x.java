package com.p280ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.metrics.C33259d.C33260a;

/* renamed from: com.ss.android.ugc.aweme.metrics.x */
public final class C33282x extends C33259d {

    /* renamed from: a */
    private String f86897a;

    /* renamed from: b */
    private String f86898b;

    /* renamed from: c */
    private String f86899c;

    /* renamed from: v */
    private String f86900v;

    /* renamed from: w */
    private String f86901w;

    /* renamed from: x */
    private String f86902x;

    public C33282x() {
        super("launch_log");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67592a() {
        mo85248a("launch_method", this.f86897a, C33260a.f86770a);
        mo85248a("push_id", this.f86898b, C33260a.f86770a);
        mo85248a("enter_to", this.f86899c, C33260a.f86770a);
        mo85248a("red_badge_number", this.f86900v, C33260a.f86770a);
        mo85248a("is_cold_launch", this.f86901w, C33260a.f86770a);
        if (!TextUtils.isEmpty(this.f86902x)) {
            mo85248a("launch_from", this.f86902x, C33260a.f86770a);
        }
    }

    /* renamed from: a */
    public final C33282x mo85366a(String str) {
        this.f86897a = str;
        return this;
    }

    /* renamed from: b */
    public final C33282x mo85367b(String str) {
        this.f86898b = str;
        return this;
    }

    /* renamed from: c */
    public final C33282x mo85368c(String str) {
        this.f86899c = str;
        return this;
    }

    /* renamed from: d */
    public final C33282x mo85369d(String str) {
        this.f86900v = str;
        return this;
    }

    /* renamed from: e */
    public final C33282x mo85370e(String str) {
        this.f86901w = str;
        return this;
    }

    /* renamed from: f */
    public final C33282x mo85371f(String str) {
        this.f86902x = str;
        return this;
    }
}
