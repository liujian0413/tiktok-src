package com.p280ss.android.ugc.aweme.comment;

import android.arch.lifecycle.C0052o;

/* renamed from: com.ss.android.ugc.aweme.comment.p */
public final class C24198p {

    /* renamed from: a */
    public final C0052o<Boolean> f63862a = new C0052o<>();

    /* renamed from: b */
    private int f63863b;

    public C24198p() {
        this.f63862a.setValue(Boolean.valueOf(false));
    }

    /* renamed from: a */
    public final void mo62820a() {
        this.f63863b++;
        if (this.f63863b == 1) {
            this.f63862a.setValue(Boolean.valueOf(true));
        }
    }

    /* renamed from: b */
    public final void mo62821b() {
        this.f63863b--;
        if (this.f63863b <= 0) {
            this.f63862a.setValue(Boolean.valueOf(false));
        }
    }
}
