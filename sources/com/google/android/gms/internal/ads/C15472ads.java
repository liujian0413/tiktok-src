package com.google.android.gms.internal.ads;

import android.app.AlertDialog.Builder;
import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.ads */
final class C15472ads implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f40069a;

    /* renamed from: b */
    private final /* synthetic */ String f40070b;

    /* renamed from: c */
    private final /* synthetic */ boolean f40071c;

    /* renamed from: d */
    private final /* synthetic */ boolean f40072d;

    C15472ads(adr adr, Context context, String str, boolean z, boolean z2) {
        this.f40069a = context;
        this.f40070b = str;
        this.f40071c = z;
        this.f40072d = z2;
    }

    public final void run() {
        Builder builder = new Builder(this.f40069a);
        builder.setMessage(this.f40070b);
        if (this.f40071c) {
            builder.setTitle("Error");
        } else {
            builder.setTitle("Info");
        }
        if (this.f40072d) {
            builder.setNeutralButton("Dismiss", null);
        } else {
            builder.setPositiveButton("Learn More", new adt(this));
            builder.setNegativeButton("Dismiss", null);
        }
        builder.create().show();
    }
}
