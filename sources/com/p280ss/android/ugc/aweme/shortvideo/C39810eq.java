package com.p280ss.android.ugc.aweme.shortvideo;

import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40413c;
import com.p280ss.android.ugc.aweme.sticker.C41851f;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.eq */
public final class C39810eq extends C39811er {

    /* renamed from: a */
    public static final String f103465a = C41851f.m133117a().getPath();

    /* renamed from: b */
    public static final String f103466b;

    /* renamed from: c */
    public static final String f103467c;

    /* renamed from: a */
    public static long m127460a() {
        long c = C35574k.m114859a().mo70091f().mo93344c(Property.VideoDurationLimitMillisecond);
        if (c < 1000 || c >= C40413c.f105051b) {
            return 1000;
        }
        return c;
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(f103468d);
        sb.append("music-effect/");
        f103466b = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f103468d);
        sb2.append("face_track.model");
        f103467c = sb2.toString();
    }

    /* renamed from: b */
    public static String m127462b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(f103486v);
        sb.append(m127467e(str));
        return sb.toString();
    }

    /* renamed from: a */
    public static String m127461a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(f103468d);
        sb.append(m127467e(str));
        return sb.toString();
    }
}
