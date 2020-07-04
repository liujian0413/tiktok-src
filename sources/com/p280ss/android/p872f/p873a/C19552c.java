package com.p280ss.android.p872f.p873a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;

/* renamed from: com.ss.android.f.a.c */
final class C19552c implements C19550a {

    /* renamed from: a */
    private static final String f52877a = "c";

    /* renamed from: b */
    private Context f52878b;

    /* renamed from: c */
    private String f52879c;

    /* renamed from: d */
    private String f52880d;

    /* renamed from: e */
    private String f52881e;

    /* renamed from: f */
    private boolean f52882f;

    /* renamed from: b */
    private boolean m64423b(String str) {
        boolean z = false;
        if (this.f52878b == null || TextUtils.isEmpty(str)) {
            return false;
        }
        String c = m64424c(str);
        if (!TextUtils.isEmpty(c)) {
            try {
                if (this.f52878b.getPackageManager().getPackageInfo(c, 16777216) != null) {
                    z = true;
                }
            } catch (Exception unused) {
            }
        }
        return z;
    }

    /* renamed from: d */
    private int m64425d(String str) {
        if (this.f52878b == null || TextUtils.isEmpty(str) || !m64423b(str)) {
            return -1;
        }
        try {
            ApplicationInfo a = C19553d.m64427a(this.f52878b.getPackageManager(), m64424c(str), PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
            if (!(a == null || a.metaData == null)) {
                return a.metaData.getInt("TTPLATFORM_SDK_VERSION", 1);
            }
        } catch (NameNotFoundException unused) {
        }
        return -1;
    }

    /* renamed from: c */
    private static String m64424c(String str) {
        if (str == null) {
            return null;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1772520566) {
            if (hashCode != -1035863501) {
                if (hashCode == 93227207 && str.equals("aweme")) {
                    c = 2;
                }
            } else if (str.equals("live_stream")) {
                c = 1;
            }
        } else if (str.equals("news_article")) {
            c = 0;
        }
        switch (c) {
            case 0:
                return "com.ss.android.article.news";
            case 1:
                return "com.ss.android.ugc.live";
            case 2:
                return "com.ss.android.ugc.aweme";
            default:
                return null;
        }
    }

    /* renamed from: a */
    public final boolean mo51692a(String str) {
        if (this.f52882f) {
            throw new IllegalStateException("handleIntent fail, TTApiImpl has been detached");
        } else if (this.f52878b == null || TextUtils.isEmpty(str) || !m64423b(str)) {
            return false;
        } else {
            String c = m64424c(str);
            if (TextUtils.isEmpty(c)) {
                return false;
            }
            Intent intent = new Intent();
            StringBuilder sb = new StringBuilder();
            sb.append(c);
            sb.append(".ttplatformapi.TtAuthorizeActivity");
            intent.setComponent(new ComponentName(c, sb.toString()));
            ActivityInfo resolveActivityInfo = intent.resolveActivityInfo(this.f52878b.getPackageManager(), 65536);
            int d = m64425d(str);
            if (resolveActivityInfo == null || !resolveActivityInfo.exported || d <= 0 || d <= 1) {
                return false;
            }
            return true;
        }
    }

    C19552c(Context context) {
        if (context != null) {
            this.f52878b = context;
            try {
                ApplicationInfo a = C19553d.m64427a(this.f52878b.getPackageManager(), this.f52878b.getPackageName(), PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
                if (a != null) {
                    this.f52879c = a.metaData.getString("TTOPEN_SDK_CLIENT_KEY");
                    this.f52880d = a.metaData.getString("TTOPEN_SDK_DOUYIN_CLIENT_KEY");
                    this.f52881e = a.metaData.getString("TTOPEN_SDK_NEWSARTICLE_CLIENT_KEY");
                }
            } catch (NameNotFoundException unused) {
            }
            if (TextUtils.isEmpty(this.f52879c) && TextUtils.isEmpty(this.f52880d) && TextUtils.isEmpty(this.f52881e)) {
                StringBuilder sb = new StringBuilder();
                sb.append(f52877a);
                sb.append(" clientKey is null");
                throw new IllegalArgumentException(sb.toString());
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f52877a);
        sb2.append(" context is null");
        throw new IllegalArgumentException(sb2.toString());
    }
}
