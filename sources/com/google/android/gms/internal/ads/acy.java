package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.common.C15181e;
import com.google.android.gms.common.util.C15336s;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

public class acy extends ada {
    /* renamed from: a */
    public final boolean mo39200a(Context context, WebSettings webSettings) {
        super.mo39200a(context, webSettings);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
        return true;
    }

    /* renamed from: a */
    public final String mo39195a(Context context) {
        aev a = aev.m45705a();
        if (TextUtils.isEmpty(a.f40117a)) {
            a.f40117a = (String) aet.m45702a(context, new aew(a, C15181e.m44177f(context), context));
        }
        return a.f40117a;
    }

    /* renamed from: b */
    public final void mo39203b(Context context) {
        aev a = aev.m45705a();
        acd.m45438a("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(a.f40117a)) {
            Context f = C15181e.m44177f(context);
            if (f == null) {
                Editor putString = C7285c.m22838a(context, "admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context));
                if (f == null) {
                    putString.apply();
                } else {
                    C15336s.m44609a(context, putString, "admob_user_agent");
                }
            }
            a.f40117a = defaultUserAgent;
        }
        acd.m45438a("User agent is updated.");
    }

    /* renamed from: a */
    public final Drawable mo39192a(Context context, Bitmap bitmap, boolean z, float f) {
        if (!z || f <= 0.0f || f > 25.0f) {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
        try {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
            Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
            RenderScript create = RenderScript.create(context);
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            create2.setRadius(f);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            return new BitmapDrawable(context.getResources(), createBitmap);
        } catch (RuntimeException unused) {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
    }
}
