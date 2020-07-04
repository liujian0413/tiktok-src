package com.p280ss.android.ugc.aweme.filter;

import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.utils.C43136fo;
import java.io.File;
import java.io.IOException;

/* renamed from: com.ss.android.ugc.aweme.filter.br */
public final class C29262br {

    /* renamed from: a */
    private static final String f77200a = new File(C35563c.f93238a.getFilesDir(), "filter").getAbsolutePath();

    /* renamed from: b */
    private static final String f77201b = new File(f77200a, "share").getAbsolutePath();

    /* renamed from: a */
    public static String m95996a() {
        StringBuilder sb = new StringBuilder();
        sb.append(f77201b);
        sb.append(File.separator);
        return sb.toString();
    }

    static {
        File file = new File(f77201b);
        if (file.exists()) {
            file.mkdirs();
        }
        m95997b();
        C35563c.f93230L.mo93338a(Property.EffectResourceVersion, 3);
    }

    /* renamed from: b */
    private static boolean m95997b() {
        if (C35563c.f93230L.mo93343b(Property.EffectResourceVersion) == 3 && C35563c.f93230L.mo93342a(Property.EffectShareCopied)) {
            return true;
        }
        try {
            C43136fo.m136828a(C35563c.f93238a.getAssets().open("share.zip"), f77201b);
            C35563c.f93230L.mo93341a(Property.EffectShareCopied, true);
        } catch (IOException unused) {
        }
        return false;
    }
}
