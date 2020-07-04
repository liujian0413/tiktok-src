package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.C1642a;
import com.squareup.picasso.Picasso.LoadedFrom;

/* renamed from: com.squareup.picasso.k */
final class C18835k extends C18800a<ImageView> {

    /* renamed from: m */
    C18824e f50757m;

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo49996b() {
        super.mo49996b();
        if (this.f50757m != null) {
            this.f50757m = null;
        }
    }

    /* renamed from: a */
    public final void mo49994a() {
        ImageView imageView = (ImageView) this.f50684c.get();
        if (imageView != null) {
            if (this.f50688g != 0) {
                imageView.setImageResource(this.f50688g);
            } else if (this.f50689h != null) {
                imageView.setImageDrawable(this.f50689h);
            }
            if (this.f50757m != null) {
                this.f50757m.mo50024b();
            }
        }
    }

    /* renamed from: a */
    public final void mo49995a(Bitmap bitmap, LoadedFrom loadedFrom) {
        if (bitmap != null) {
            ImageView imageView = (ImageView) this.f50684c.get();
            if (imageView != null) {
                Bitmap bitmap2 = bitmap;
                LoadedFrom loadedFrom2 = loadedFrom;
                C18843q.m61540a(imageView, this.f50682a.f50653d, bitmap2, loadedFrom2, this.f50685d, this.f50682a.f50661l);
                if (this.f50757m != null) {
                    this.f50757m.mo50023a();
                }
                return;
            }
            return;
        }
        throw new AssertionError(C1642a.m8034a("Attempted to complete action with no result!\n%s", new Object[]{this}));
    }

    C18835k(Picasso picasso, ImageView imageView, C18846s sVar, int i, int i2, int i3, Drawable drawable, String str, Object obj, C18824e eVar, boolean z) {
        super(picasso, imageView, sVar, i, i2, i3, drawable, str, obj, z);
        this.f50757m = eVar;
    }
}
