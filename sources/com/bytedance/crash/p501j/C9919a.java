package com.bytedance.crash.p501j;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.bytedance.crash.C9895f;
import com.bytedance.crash.p504l.C9972a;
import com.bytedance.crash.p504l.C9999s;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.crash.j.a */
public final class C9919a {

    /* renamed from: a */
    public C9895f f27069a;

    /* renamed from: b */
    private Context f27070b;

    /* renamed from: c */
    public final String mo24527c() {
        try {
            return this.f27069a.mo24479b();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: e */
    public final String mo24529e() {
        try {
            return this.f27069a.mo24481d();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: f */
    public final long mo24530f() {
        try {
            return this.f27069a.mo24480c();
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public final Map<String, Object> mo24525a() {
        Map<String, Object> b = mo24526b();
        if (m29353a(b, "aid") == null) {
            b.put("aid", Integer.valueOf(4444));
        }
        return b;
    }

    /* renamed from: d */
    public final String mo24528d() {
        try {
            return String.valueOf(this.f27069a.mo24478a().get("aid"));
        } catch (Throwable unused) {
            return "4444";
        }
    }

    /* renamed from: b */
    public final Map<String, Object> mo24526b() {
        Throwable th;
        Map<String, Object> map;
        PackageInfo packageInfo;
        Object obj = null;
        try {
            map = this.f27069a.mo24478a();
            th = null;
        } catch (Throwable th2) {
            th = th2;
            map = null;
        }
        if (map == null) {
            map = new HashMap<>(4);
            if (th != null) {
                try {
                    map.put("err_info", C9999s.m29644a(th));
                } catch (Throwable unused) {
                }
            }
        }
        if (m29354a(map)) {
            try {
                packageInfo = this.f27070b.getPackageManager().getPackageInfo(this.f27070b.getPackageName(), PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
                map.put("version_name", packageInfo.versionName);
                map.put("version_code", Integer.valueOf(packageInfo.versionCode));
                StringBuilder sb = new StringBuilder();
                sb.append(this.f27070b.getPackageName());
                sb.append(".BuildConfig");
                String str = (String) Class.forName(sb.toString()).getDeclaredField("VERSION_NAME").get(null);
                if (packageInfo.versionName != null && !packageInfo.versionName.equals(str)) {
                    map.put("dex_err_manifest", "true");
                    map.put("dex_version", str);
                }
            } catch (Throwable unused2) {
                map.put("version_name", C9972a.m29508d(this.f27070b));
                map.put("version_code", Integer.valueOf(C9972a.m29509e(this.f27070b)));
                if (map.get("update_version_code") == null) {
                    map.put("update_version_code", map.get("version_code"));
                }
            }
            if (map.get("update_version_code") == null) {
                if (packageInfo.applicationInfo.metaData != null) {
                    obj = packageInfo.applicationInfo.metaData.get("UPDATE_VERSION_CODE");
                }
                if (obj == null) {
                    obj = map.get("version_code");
                }
                map.put("update_version_code", obj);
            }
        } else {
            try {
                String str2 = this.f27070b.getPackageManager().getPackageInfo(this.f27070b.getPackageName(), PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH).versionName;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f27070b.getPackageName());
                sb2.append(".BuildConfig");
                String str3 = (String) Class.forName(sb2.toString()).getDeclaredField("VERSION_NAME").get(null);
                if (str2 != null && !str2.equals(str3)) {
                    map.put("dex_err_manifest", "true");
                    map.put("dex_version", str3);
                    map.put("manifest_version", str2);
                }
            } catch (Throwable th3) {
                map.put("dex_err_manifest", th3.getMessage());
            }
        }
        return map;
    }

    /* renamed from: a */
    public static boolean m29354a(Map<String, Object> map) {
        if (map == null || map.isEmpty() || ((!map.containsKey("app_version") && !map.containsKey("version_name")) || !map.containsKey("version_code") || !map.containsKey("update_version_code"))) {
            return true;
        }
        return false;
    }

    public C9919a(Context context, C9895f fVar) {
        this.f27070b = context;
        this.f27069a = fVar;
    }

    /* renamed from: a */
    private static String m29353a(Map<String, Object> map, String str) {
        if (map != null) {
            Object obj = map.get(str);
            if (obj != null) {
                return String.valueOf(obj);
            }
        }
        return null;
    }
}
