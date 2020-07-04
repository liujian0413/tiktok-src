package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.ads.C14745e;
import com.google.android.gms.ads.R$styleable;

@C6505uv
public final class zzzc {

    /* renamed from: a */
    public final String f45808a;

    /* renamed from: b */
    private final C14745e[] f45809b;

    /* renamed from: a */
    private static C14745e[] m53268a(String str) {
        int i;
        int i2;
        String[] split = str.split("\\s*,\\s*");
        C14745e[] eVarArr = new C14745e[split.length];
        for (int i3 = 0; i3 < split.length; i3++) {
            String trim = split[i3].trim();
            if (trim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] split2 = trim.split("[xX]");
                split2[0] = split2[0].trim();
                split2[1] = split2[1].trim();
                try {
                    if ("FULL_WIDTH".equals(split2[0])) {
                        i = -1;
                    } else {
                        i = Integer.parseInt(split2[0]);
                    }
                    if ("AUTO_HEIGHT".equals(split2[1])) {
                        i2 = -2;
                    } else {
                        i2 = Integer.parseInt(split2[1]);
                    }
                    eVarArr[i3] = new C14745e(i, i2);
                } catch (NumberFormatException unused) {
                    String str2 = "Could not parse XML attribute \"adSize\": ";
                    String valueOf = String.valueOf(trim);
                    throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                }
            } else if ("BANNER".equals(trim)) {
                eVarArr[i3] = C14745e.f38096a;
            } else if ("LARGE_BANNER".equals(trim)) {
                eVarArr[i3] = C14745e.f38098c;
            } else if ("FULL_BANNER".equals(trim)) {
                eVarArr[i3] = C14745e.f38097b;
            } else if ("LEADERBOARD".equals(trim)) {
                eVarArr[i3] = C14745e.f38099d;
            } else if ("MEDIUM_RECTANGLE".equals(trim)) {
                eVarArr[i3] = C14745e.f38100e;
            } else if ("SMART_BANNER".equals(trim)) {
                eVarArr[i3] = C14745e.f38102g;
            } else if ("WIDE_SKYSCRAPER".equals(trim)) {
                eVarArr[i3] = C14745e.f38101f;
            } else if ("FLUID".equals(trim)) {
                eVarArr[i3] = C14745e.f38103h;
            } else if ("ICON".equals(trim)) {
                eVarArr[i3] = C14745e.f38104i;
            } else {
                String str3 = "Could not parse XML attribute \"adSize\": ";
                String valueOf2 = String.valueOf(trim);
                throw new IllegalArgumentException(valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3));
            }
        }
        if (eVarArr.length != 0) {
            return eVarArr;
        }
        String str4 = "Could not parse XML attribute \"adSize\": ";
        String valueOf3 = String.valueOf(str);
        throw new IllegalArgumentException(valueOf3.length() != 0 ? str4.concat(valueOf3) : new String(str4));
    }

    public zzzc(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R$styleable.AdsAttrs);
        String string = obtainAttributes.getString(0);
        String string2 = obtainAttributes.getString(1);
        boolean z = !TextUtils.isEmpty(string);
        boolean isEmpty = true ^ TextUtils.isEmpty(string2);
        if (z && !isEmpty) {
            this.f45809b = m53268a(string);
        } else if (!z && isEmpty) {
            this.f45809b = m53268a(string2);
        } else if (z) {
            throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
        } else {
            throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
        }
        this.f45808a = obtainAttributes.getString(2);
        if (TextUtils.isEmpty(this.f45808a)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    /* renamed from: a */
    public final C14745e[] mo42402a(boolean z) {
        if (z || this.f45809b.length == 1) {
            return this.f45809b;
        }
        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }
}
