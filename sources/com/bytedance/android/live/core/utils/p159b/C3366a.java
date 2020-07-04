package com.bytedance.android.live.core.utils.p159b;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import com.bytedance.android.live.core.utils.p159b.p160a.C3369a;
import com.bytedance.android.live.core.utils.p159b.p160a.C3370b;
import com.bytedance.android.live.core.utils.p159b.p160a.C3371c;
import com.bytedance.android.live.core.utils.p159b.p160a.C3372d;
import com.bytedance.android.live.core.utils.p159b.p160a.C3373e;
import com.bytedance.android.live.core.utils.p159b.p160a.C3374f;
import com.bytedance.android.live.core.utils.p159b.p160a.C3375g;
import com.bytedance.android.live.core.utils.p159b.p160a.C3376h;
import com.p280ss.p1783b.p1784a.C45771a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.live.core.utils.b.a */
public final class C3366a {

    /* renamed from: b */
    static Map<String, C3379c> f10176b = new HashMap<String, C3379c>() {
        {
            put("OPPO", new C3373e());
            put("VIVO", new C3375g());
            put("HISENSE", new C3370b());
            put("HUAWEI", new C3372d());
            put("XIAOMI", new C3376h());
            put("ASUS", new C3369a());
            put("ONEPLUS", new C3374f());
        }
    };

    /* renamed from: c */
    static Map<String, C3379c> f10177c = new HashMap<String, C3379c>() {
        {
            put("HONOR", new C3371c());
        }
    };

    /* renamed from: a */
    public boolean f10178a;

    public C3366a(Context context) {
        boolean z;
        if (m12552b(context) || m12551a(context)) {
            z = true;
        } else {
            z = false;
        }
        this.f10178a = z;
    }

    /* renamed from: a */
    private static boolean m12551a(Context context) {
        boolean z;
        boolean z2;
        try {
            String trim = Build.MANUFACTURER.toUpperCase().trim();
            C3379c cVar = (C3379c) f10176b.get(trim);
            C3379c cVar2 = (C3379c) f10177c.get(Build.BRAND.toUpperCase().trim());
            if (cVar == null || !cVar.mo10281a(context)) {
                z = false;
            } else {
                z = true;
            }
            if (cVar2 == null || cVar == cVar2 || !cVar2.mo10281a(context)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z || z2) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    private static boolean m12552b(Context context) {
        if (!(context instanceof Activity) || VERSION.SDK_INT < 28) {
            return false;
        }
        View decorView = ((Activity) context).getWindow().getDecorView();
        try {
            Object invoke = decorView.getClass().getMethod("getRootWindowInsets", new Class[0]).invoke(decorView, new Object[0]);
            Object invoke2 = invoke.getClass().getDeclaredMethod("getDisplayCutout", new Class[0]).invoke(invoke, new Object[0]);
            List list = (List) invoke2.getClass().getMethod("getBoundingRects", new Class[0]).invoke(invoke2, new Object[0]);
            if (list == null || list.size() <= 0) {
                return false;
            }
            return true;
        } catch (Exception e) {
            C45771a.m143707b("DigHoleCheck", Log.getStackTraceString(e));
            return false;
        }
    }
}
