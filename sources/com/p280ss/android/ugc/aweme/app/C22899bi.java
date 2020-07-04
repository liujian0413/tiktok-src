package com.p280ss.android.ugc.aweme.app;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.app.bi */
public final class C22899bi extends C23019q {

    /* renamed from: b */
    private static final String[] f60617b = {"https://www.tiktok.com/@.*/video/(\\w+)/?", "https://www.tiktok.com/@.*/live/(\\w+)/?", "https://www.tiktok.com/@(\\w+)/?", "https://www.tiktok.com/tag/(\\w+)/?", "https://www.tiktok.com/music/.*-(\\w+)/?", "https://www.tiktok.com/sticker/.*-(\\w+)/?"};

    public C22899bi(Context context) {
        super(context);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Uri mo59864a(Uri uri) {
        return m75358b(uri);
    }

    /* renamed from: b */
    private Uri m75358b(Uri uri) {
        if (uri == null || !TextUtils.equals("www.tiktok.com", uri.getHost())) {
            return null;
        }
        String uri2 = uri.toString();
        String str = "";
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= f60617b.length) {
                break;
            }
            Matcher matcher = Pattern.compile(f60617b[i2]).matcher(uri2);
            if (matcher.find()) {
                str = matcher.group(1);
                i = i2;
                break;
            }
            i2++;
        }
        return mo59993a(null, i, str);
    }
}
