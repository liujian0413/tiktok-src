package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.C1642a;
import com.squareup.picasso.Picasso.LoadedFrom;

/* renamed from: com.squareup.picasso.z */
final class C18858z extends C18800a<C18857y> {
    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo49994a() {
        if (((C18857y) mo49997c()) != null && this.f50688g != 0) {
            this.f50682a.f50653d.getResources().getDrawable(this.f50688g);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo49995a(Bitmap bitmap, LoadedFrom loadedFrom) {
        if (bitmap != null) {
            C18857y yVar = (C18857y) mo49997c();
            if (yVar != null) {
                yVar.mo50115a(bitmap, loadedFrom);
                if (bitmap.isRecycled()) {
                    throw new IllegalStateException("Target callback must not recycle bitmap!");
                }
                return;
            }
            return;
        }
        throw new AssertionError(C1642a.m8034a("Attempted to complete action with no result!\n%s", new Object[]{this}));
    }

    C18858z(Picasso picasso, C18857y yVar, C18846s sVar, int i, int i2, Drawable drawable, String str, Object obj, int i3) {
        super(picasso, yVar, sVar, i, i2, i3, drawable, str, obj, false);
    }
}
