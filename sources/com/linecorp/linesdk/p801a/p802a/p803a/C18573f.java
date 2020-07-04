package com.linecorp.linesdk.p801a.p802a.p803a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Build.VERSION;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.util.Locale;

/* renamed from: com.linecorp.linesdk.a.a.a.f */
final class C18573f {

    /* renamed from: a */
    private final PackageInfo f50201a;

    /* renamed from: b */
    private final String f50202b;

    /* renamed from: c */
    private String f50203c;

    /* renamed from: a */
    public final String mo48735a() {
        String str;
        String str2;
        if (this.f50203c != null) {
            return this.f50203c;
        }
        if (this.f50201a == null) {
            str = "UNK";
        } else {
            str = this.f50201a.packageName;
        }
        if (this.f50201a == null) {
            str2 = "UNK";
        } else {
            str2 = this.f50201a.versionName;
        }
        Locale locale = Locale.getDefault();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        sb.append(" ChannelSDK/");
        sb.append(this.f50202b);
        sb.append(" (Linux; U; Android ");
        sb.append(VERSION.RELEASE);
        sb.append("; ");
        sb.append(locale.getLanguage());
        sb.append("-");
        sb.append(locale.getCountry());
        sb.append("; ");
        sb.append(Build.MODEL);
        sb.append(" Build/");
        sb.append(Build.ID);
        sb.append(")");
        this.f50203c = sb.toString();
        return this.f50203c;
    }

    /* renamed from: a */
    private static PackageInfo m61000a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
        } catch (NameNotFoundException unused) {
            throw null;
        }
    }

    C18573f(Context context, String str) {
        this.f50201a = m61000a(context);
        this.f50202b = str;
    }
}
