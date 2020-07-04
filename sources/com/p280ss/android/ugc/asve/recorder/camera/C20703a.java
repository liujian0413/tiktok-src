package com.p280ss.android.ugc.asve.recorder.camera;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.p280ss.android.medialib.camera.C19667g;
import com.p280ss.android.ugc.asve.recorder.camera.p925c.C20727j;
import com.p280ss.android.vesdk.C45323k;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.recorder.camera.a */
public final class C20703a {

    /* renamed from: a */
    public static final C20703a f55921a = new C20703a();

    private C20703a() {
    }

    /* renamed from: b */
    private static boolean m68742b(Context context, int i, boolean z) {
        C7573i.m23587b(context, "context");
        if (!z) {
            return C19667g.m64795a(context, i);
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("device_support_wide_angle", false);
        C45323k.m143236a(context, C20732f.m68909b(i), bundle);
        return bundle.getBoolean("device_support_wide_angle");
    }

    /* renamed from: a */
    public static final int m68740a(Context context, int i, boolean z) {
        C7573i.m23587b(context, "context");
        if (i == -1) {
            i = C20727j.m68899a(Build.MODEL);
        }
        switch (i) {
            case 1:
                if (m68742b(context, 3, z)) {
                    return 1;
                }
                if (m68742b(context, 4, z)) {
                    return 3;
                }
                return 0;
            case 2:
                return 2;
            case 3:
                if (m68742b(context, 4, z)) {
                    return 3;
                }
                return 0;
            case 4:
                if (m68742b(context, 2, z)) {
                    return 4;
                }
                return 0;
            case 5:
                if (m68742b(context, 6, z)) {
                    return 5;
                }
                return 0;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public static final boolean m68741a(Context context, int i, int i2, boolean z) {
        C7573i.m23587b(context, "context");
        if (!z) {
            return C19667g.m64796a(context, 5, 0);
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("support_anti_shake", null);
        C45323k.m143236a(context, C20732f.m68909b(5), bundle);
        Map map = (Map) bundle.getSerializable("support_anti_shake");
        if (map != null) {
            Boolean bool = (Boolean) map.get(Integer.valueOf(0));
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return false;
    }
}
