package com.p280ss.android.ugc.aweme.comment.p1103ui;

import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.af */
final /* synthetic */ class C24307af implements Runnable {

    /* renamed from: a */
    private final KeyboardDialogFragment f64199a;

    /* renamed from: b */
    private final View f64200b;

    /* renamed from: c */
    private final int[] f64201c;

    /* renamed from: d */
    private final int[] f64202d;

    C24307af(KeyboardDialogFragment keyboardDialogFragment, View view, int[] iArr, int[] iArr2) {
        this.f64199a = keyboardDialogFragment;
        this.f64200b = view;
        this.f64201c = iArr;
        this.f64202d = iArr2;
    }

    public final void run() {
        this.f64199a.mo63150a(this.f64200b, this.f64201c, this.f64202d);
    }
}
