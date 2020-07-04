package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.common.internal.C15230c;
import com.google.android.gms.internal.base.zak;

/* renamed from: com.google.android.gms.common.images.a */
public abstract class C15190a {

    /* renamed from: a */
    final C15191b f39307a;

    /* renamed from: b */
    protected int f39308b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo38493a(Drawable drawable, boolean z, boolean z2, boolean z3);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo38491a(Context context, Bitmap bitmap, boolean z) {
        C15230c.m44251a((Object) bitmap);
        mo38493a(new BitmapDrawable(context.getResources(), bitmap), false, false, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo38492a(Context context, zak zak, boolean z) {
        Drawable drawable;
        if (this.f39308b != 0) {
            drawable = context.getResources().getDrawable(this.f39308b);
        } else {
            drawable = null;
        }
        mo38493a(drawable, false, false, false);
    }
}
