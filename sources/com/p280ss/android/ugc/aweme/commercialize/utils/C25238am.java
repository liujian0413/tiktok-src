package com.p280ss.android.ugc.aweme.commercialize.utils;

import android.graphics.Bitmap;
import com.bytedance.lighten.core.C12137p;
import com.bytedance.lighten.core.p612c.C12115m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.am */
public final class C25238am implements C12115m {

    /* renamed from: b */
    public static final C25239a f66575b = new C25239a(null);

    /* renamed from: a */
    public final String f66576a;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.am$a */
    public static final class C25239a {
        private C25239a() {
        }

        public /* synthetic */ C25239a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo29803a() {
        new StringBuilder("onCanceled ").append(this.f66576a);
    }

    public C25238am(String str) {
        C7573i.m23587b(str, "url");
        this.f66576a = str;
    }

    /* renamed from: a */
    public final void mo29804a(float f) {
        StringBuilder sb = new StringBuilder("onProgress ");
        sb.append(f);
        sb.append(' ');
        sb.append(this.f66576a);
    }

    /* renamed from: a */
    public final void mo29817a(Throwable th) {
        if (th != null) {
            StringBuilder sb = new StringBuilder("onFailed: loadBitmap, ex=");
            sb.append(th);
            sb.append(' ');
            sb.append(this.f66576a);
        }
    }

    /* renamed from: a */
    public final void mo29816a(Bitmap bitmap) {
        if (bitmap != null) {
            StringBuilder sb = new StringBuilder("onCompleted: loadBitmap, image.width=");
            sb.append(bitmap.getWidth());
            sb.append(", image.height=");
            sb.append(bitmap.getHeight());
            sb.append(", bitmap.config=");
            sb.append(bitmap.getConfig().name());
            StringBuilder sb2 = new StringBuilder("loadBitmap: is loaded=");
            sb2.append(C12137p.m35322a(this.f66576a));
            sb2.append(", path=");
            sb2.append(C12137p.m35323b(this.f66576a));
        }
    }
}
