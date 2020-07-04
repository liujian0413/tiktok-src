package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso.LoadedFrom;
import com.squareup.picasso.Picasso.Priority;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.squareup.picasso.a */
abstract class C18800a<T> {

    /* renamed from: a */
    public final Picasso f50682a;

    /* renamed from: b */
    public final C18846s f50683b;

    /* renamed from: c */
    final WeakReference<T> f50684c;

    /* renamed from: d */
    final boolean f50685d;

    /* renamed from: e */
    public final int f50686e;

    /* renamed from: f */
    public final int f50687f;

    /* renamed from: g */
    final int f50688g;

    /* renamed from: h */
    final Drawable f50689h;

    /* renamed from: i */
    public final String f50690i;

    /* renamed from: j */
    public final Object f50691j;

    /* renamed from: k */
    public boolean f50692k;

    /* renamed from: l */
    public boolean f50693l;

    /* renamed from: com.squareup.picasso.a$a */
    static class C18801a<M> extends WeakReference<M> {

        /* renamed from: a */
        final C18800a f50694a;

        public C18801a(C18800a aVar, M m, ReferenceQueue<? super M> referenceQueue) {
            super(m, referenceQueue);
            this.f50694a = aVar;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo49994a();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo49995a(Bitmap bitmap, LoadedFrom loadedFrom);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo49996b() {
        this.f50693l = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final Priority mo49998d() {
        return this.f50683b.f50808r;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final T mo49997c() {
        if (this.f50684c == null) {
            return null;
        }
        return this.f50684c.get();
    }

    C18800a(Picasso picasso, T t, C18846s sVar, int i, int i2, int i3, Drawable drawable, String str, Object obj, boolean z) {
        WeakReference<T> weakReference;
        this.f50682a = picasso;
        this.f50683b = sVar;
        if (t == null) {
            weakReference = null;
        } else {
            weakReference = new C18801a<>(this, t, picasso.f50659j);
        }
        this.f50684c = weakReference;
        this.f50686e = i;
        this.f50687f = i2;
        this.f50685d = z;
        this.f50688g = i3;
        this.f50689h = drawable;
        this.f50690i = str;
        if (obj == 0) {
            obj = this;
        }
        this.f50691j = obj;
    }
}
