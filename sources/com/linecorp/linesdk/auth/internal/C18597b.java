package com.linecorp.linesdk.auth.internal;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.taobao.android.dexposed.ClassUtils;
import java.util.StringTokenizer;

/* renamed from: com.linecorp.linesdk.auth.internal.b */
final class C18597b {

    /* renamed from: a */
    final int f50265a;

    /* renamed from: b */
    final int f50266b;

    /* renamed from: c */
    final int f50267c;

    public final int hashCode() {
        return (((this.f50265a * 31) + this.f50266b) * 31) + this.f50267c;
    }

    /* renamed from: a */
    public static C18597b m61029a(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo("jp.naver.line.android", PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH).versionName;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(str, ClassUtils.PACKAGE_SEPARATOR);
            try {
                return new C18597b(Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()));
            } catch (NullPointerException | NumberFormatException unused) {
                return null;
            }
        } catch (NameNotFoundException unused2) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C18597b bVar = (C18597b) obj;
        if (this.f50265a == bVar.f50265a && this.f50266b == bVar.f50266b && this.f50267c == bVar.f50267c) {
            return true;
        }
        return false;
    }

    public C18597b(int i, int i2, int i3) {
        this.f50265a = i;
        this.f50266b = i2;
        this.f50267c = i3;
    }
}
