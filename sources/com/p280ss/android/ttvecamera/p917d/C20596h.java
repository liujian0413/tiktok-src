package com.p280ss.android.ttvecamera.p917d;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest.Builder;
import com.oppo.p804a.C18616b;
import com.p280ss.android.ttvecamera.C20652m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ttvecamera.d.h */
public final class C20596h extends C20590c {

    /* renamed from: c */
    public static final Map<String, String> f55634c = new HashMap<String, String>() {
        {
            put("com.ss.android.ugc.trill", "VdRQAXll2qGqBr3q0pv9fxjKUNSUZE5Au4tXeYAjvegHPG8+QL6PB65CdoZjef9mmWbVU0avYTAujNyKeSbN696+CZwbhwMnT28B8LU0XECzBxuUCrSUIK2DSy8KOLKDgbcseRuqLdEO91Wo70115XKAUOMkMaZosdSVnqhHYP4=");
            put("com.ss.android.ttve.app", "acJhRrV9SGJSFhTPJu53AJUEzAIie4adIn1J3yC+QG5FXX3h/GX7gaeDXRlRMoUa80Jv43LwjuMR47MPdPzldZp6PCPxXNW81maIAc0oebAMT6NgTHf5O8wgkbAZFNilvD70Cjd8YbYfDvSJ5O63V4+VHcNJ/LV3p1id21Z9FLU=");
            put("com.zhiliaoapp.musically", "I1nLPCzgp4J6fBHsdd82IBOcMK+AY67rPqYPuw4WfLYtvifBG+ABEO+Wh3N0t5siZ6dA6ZTdSIBxEZSVZlHRyD7VRaPajn/oghXkdYuDkyzzEexN6BDEXHd+B7aC2yb080U3MSzCDya2wAg6QG2IRYl1TIMlET7EhR9lmQetYdc=");
            put("com.ss.android.ugc.aweme", "V0smG6erGIWwu3z5JaAn4ibfK6iq5uW3qRb+zT6rqgpy8HHYw5TeFOMt2k0cNWuSWv4Rxn1gW+nK5oGMpBwf8nYKppzfrtXQsYgsumcg8yNRVpKZ0WSntuSCCkAtFKcnNx/DoEAjXZuqs5Vzg9VbcOmKwsgsz58eJdXiEMUqoZw=");
        }
    };

    /* renamed from: a */
    public final int mo55727a(CameraCharacteristics cameraCharacteristics, Builder builder, boolean z) {
        return 0;
    }

    public C20596h(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final boolean mo55728a(int i) {
        try {
            C18616b a = C18616b.m61064a();
            String str = ((CameraManager) this.f55629b.getSystemService("camera")).getCameraIdList()[i];
            String b = a.mo48807b((String) f55634c.get(this.f55629b.getPackageName()));
            if (b != null && !b.isEmpty()) {
                String b2 = a.mo48806b();
                if (b2 != null && b2.contains(str)) {
                    String c = a.mo48808c(str);
                    if (c != null && !c.isEmpty()) {
                        JSONObject jSONObject = new JSONObject(c);
                        if (1 == jSONObject.optInt("EIS") || 1 == jSONObject.optInt("OIS-Movie")) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
            C20652m.m68436c("TEOppoCameraProxy", "AntiShake verify cause this exception");
        }
        return false;
    }
}
