package com.airbnb.lottie.p054b;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable.Callback;
import android.view.View;
import com.airbnb.lottie.C1704b;
import com.airbnb.lottie.model.C1820h;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.airbnb.lottie.b.a */
public final class C1705a {

    /* renamed from: a */
    public C1704b f6262a;

    /* renamed from: b */
    public String f6263b = ".ttf";

    /* renamed from: c */
    private final C1820h<String> f6264c = new C1820h<>();

    /* renamed from: d */
    private final Map<C1820h<String>, Typeface> f6265d = new HashMap();

    /* renamed from: e */
    private final Map<String, Typeface> f6266e = new HashMap();

    /* renamed from: f */
    private final AssetManager f6267f;

    /* renamed from: a */
    private Typeface m8240a(String str) {
        Typeface typeface = (Typeface) this.f6266e.get(str);
        if (typeface != null) {
            return typeface;
        }
        StringBuilder sb = new StringBuilder("fonts/");
        sb.append(str);
        sb.append(this.f6263b);
        Typeface createFromAsset = Typeface.createFromAsset(this.f6267f, sb.toString());
        this.f6266e.put(str, createFromAsset);
        return createFromAsset;
    }

    public C1705a(Callback callback, C1704b bVar) {
        this.f6262a = bVar;
        if (!(callback instanceof View)) {
            this.f6267f = null;
        } else {
            this.f6267f = ((View) callback).getContext().getAssets();
        }
    }

    /* renamed from: a */
    private static Typeface m8239a(Typeface typeface, String str) {
        int i;
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        if (contains && contains2) {
            i = 3;
        } else if (contains) {
            i = 2;
        } else if (contains2) {
            i = 1;
        } else {
            i = 0;
        }
        if (typeface.getStyle() == i) {
            return typeface;
        }
        return Typeface.create(typeface, i);
    }

    /* renamed from: a */
    public final Typeface mo7158a(String str, String str2) {
        this.f6264c.mo7318a(str, str2);
        Typeface typeface = (Typeface) this.f6265d.get(this.f6264c);
        if (typeface != null) {
            return typeface;
        }
        Typeface a = m8239a(m8240a(str), str2);
        this.f6265d.put(this.f6264c, a);
        return a;
    }
}
