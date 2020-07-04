package com.p280ss.android.ugc.effectmanager;

import android.content.res.AssetManager;
import com.p280ss.android.ugc.effectmanager.common.C43723d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.effectmanager.a */
public final class C43679a {

    /* renamed from: a */
    public final AssetManager f113066a;

    /* renamed from: b */
    private final Pattern f113067b;

    /* renamed from: a */
    public final boolean mo105676a(String str) {
        try {
            InputStream b = m138402b(str);
            if (b != null) {
                try {
                    b.close();
                } catch (IOException unused) {
                }
            }
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    /* renamed from: b */
    private InputStream m138402b(String str) throws IOException {
        String a = C43723d.m138564a(str);
        if (this.f113067b == null || !this.f113067b.matcher(a).matches()) {
            return this.f113066a.open(str, 2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" manually excluded by DownloadableModelSupport.exclusionPattern");
        throw new FileNotFoundException(sb.toString());
    }

    public C43679a(AssetManager assetManager, Pattern pattern) {
        this.f113066a = assetManager;
        this.f113067b = pattern;
    }
}
