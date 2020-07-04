package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzpn.zza;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class bnh {

    /* renamed from: c */
    private static final bpg f42729c = new bni();

    /* renamed from: d */
    private static final Pattern f42730d = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f42731a = -1;

    /* renamed from: b */
    public int f42732b = -1;

    /* renamed from: a */
    public final boolean mo41021a(zzpn zzpn) {
        for (int i = 0; i < zzpn.mo42370a(); i++) {
            zza a = zzpn.mo42371a(i);
            if (a instanceof zzpr) {
                zzpr zzpr = (zzpr) a;
                if (m49450a(zzpr.f45750a, zzpr.f45751b)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private final boolean m49450a(String str, String str2) {
        if (!"iTunSMPB".equals(str)) {
            return false;
        }
        Matcher matcher = f42730d.matcher(str2);
        if (matcher.find()) {
            try {
                int parseInt = Integer.parseInt(matcher.group(1), 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f42731a = parseInt;
                    this.f42732b = parseInt2;
                    return true;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo41020a() {
        return (this.f42731a == -1 || this.f42732b == -1) ? false : true;
    }
}
