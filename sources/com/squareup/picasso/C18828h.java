package com.squareup.picasso;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: com.squareup.picasso.h */
final class C18828h implements OnPreDrawListener {

    /* renamed from: a */
    final C18849t f50734a;

    /* renamed from: b */
    final WeakReference<ImageView> f50735b;

    /* renamed from: c */
    C18824e f50736c;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo50026a() {
        this.f50736c = null;
        ImageView imageView = (ImageView) this.f50735b.get();
        if (imageView != null) {
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
        }
    }

    public final boolean onPreDraw() {
        ImageView imageView = (ImageView) this.f50735b.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width <= 0 || height <= 0) {
            return true;
        }
        viewTreeObserver.removeOnPreDrawListener(this);
        this.f50734a.mo50096b().mo50087a(width, height).mo50094a(imageView, this.f50736c);
        return true;
    }

    C18828h(C18849t tVar, ImageView imageView, C18824e eVar) {
        this.f50734a = tVar;
        this.f50735b = new WeakReference<>(imageView);
        this.f50736c = eVar;
        imageView.getViewTreeObserver().addOnPreDrawListener(this);
    }
}
