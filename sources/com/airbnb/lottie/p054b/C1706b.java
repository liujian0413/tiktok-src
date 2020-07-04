package com.airbnb.lottie.p054b;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.Drawable.Callback;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.airbnb.lottie.C1707c;
import com.airbnb.lottie.C1780i;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.airbnb.lottie.b.b */
public final class C1706b {

    /* renamed from: b */
    private static final Object f6268b = new Object();

    /* renamed from: a */
    public C1707c f6269a;

    /* renamed from: c */
    private final Context f6270c;

    /* renamed from: d */
    private String f6271d;

    /* renamed from: e */
    private final Map<String, C1780i> f6272e;

    /* renamed from: a */
    public final void mo7160a() {
        synchronized (f6268b) {
            for (Entry value : this.f6272e.entrySet()) {
                C1780i iVar = (C1780i) value.getValue();
                Bitmap bitmap = iVar.f6399f;
                if (bitmap != null) {
                    bitmap.recycle();
                    iVar.f6399f = null;
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo7161a(Context context) {
        if ((context != null || this.f6270c != null) && !this.f6270c.equals(context)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final Bitmap mo7159a(String str) {
        C1780i iVar = (C1780i) this.f6272e.get(str);
        if (iVar == null) {
            return null;
        }
        Bitmap bitmap = iVar.f6399f;
        if (bitmap != null) {
            return bitmap;
        }
        if (this.f6269a != null) {
            Bitmap a = this.f6269a.mo7162a(iVar);
            if (a != null) {
                m8242a(str, a);
            }
            return a;
        }
        String str2 = iVar.f6397d;
        Options options = new Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (!str2.startsWith("data:") || str2.indexOf("base64,") <= 0) {
            try {
                if (!TextUtils.isEmpty(this.f6271d)) {
                    AssetManager assets = this.f6270c.getAssets();
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f6271d);
                    sb.append(str2);
                    return m8242a(str, BitmapFactory.decodeStream(assets.open(sb.toString()), null, options));
                }
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            } catch (IOException unused) {
                return null;
            }
        } else {
            try {
                byte[] decode = Base64.decode(str2.substring(str2.indexOf(44) + 1), 0);
                return m8242a(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
            } catch (IllegalArgumentException unused2) {
                return null;
            }
        }
    }

    /* renamed from: a */
    private Bitmap m8242a(String str, Bitmap bitmap) {
        synchronized (f6268b) {
            ((C1780i) this.f6272e.get(str)).f6399f = bitmap;
        }
        return bitmap;
    }

    public C1706b(Callback callback, String str, C1707c cVar, Map<String, C1780i> map) {
        this.f6271d = str;
        if (!TextUtils.isEmpty(str) && this.f6271d.charAt(this.f6271d.length() - 1) != '/') {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f6271d);
            sb.append('/');
            this.f6271d = sb.toString();
        }
        if (!(callback instanceof View)) {
            this.f6272e = new HashMap();
            this.f6270c = null;
            return;
        }
        this.f6270c = ((View) callback).getContext();
        this.f6272e = map;
        this.f6269a = cVar;
    }
}
