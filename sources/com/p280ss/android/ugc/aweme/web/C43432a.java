package com.p280ss.android.ugc.aweme.web;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.p280ss.android.ugc.aweme.web.p1703a.C43433a;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* renamed from: com.ss.android.ugc.aweme.web.a */
public final class C43432a extends C43433a {

    /* renamed from: a */
    private String f112500a;

    /* renamed from: a */
    public final String mo105370a() {
        return null;
    }

    /* renamed from: b */
    public final InputStream mo105371b(String str) {
        return null;
    }

    public C43432a(String str) {
        this.f112500a = str;
    }

    /* renamed from: a */
    public final WebResourceResponse mo53904a(String str) {
        try {
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter("ad_landing_channel");
            if (!TextUtils.isEmpty(queryParameter)) {
                if (!queryParameter.contains("/")) {
                    String path = parse.getPath();
                    if (path == null) {
                        return null;
                    }
                    if (path.endsWith("/")) {
                        path = path.substring(0, path.length() - 1);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f112500a);
                    sb.append("/");
                    sb.append(queryParameter);
                    sb.append(path);
                    File file = new File(sb.toString());
                    if (!file.exists()) {
                        return null;
                    }
                    try {
                        return m137827a(m137829c(path), "", new BufferedInputStream(new FileInputStream(file)));
                    } catch (FileNotFoundException unused) {
                        return null;
                    } catch (Exception unused2) {
                        return null;
                    }
                }
            }
            return null;
        } catch (UnsupportedOperationException unused3) {
            return null;
        } catch (Exception unused4) {
            return null;
        }
    }
}
