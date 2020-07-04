package com.p280ss.android.newmedia.redbadge.p894a;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.p280ss.android.newmedia.redbadge.C19953a;
import com.p280ss.android.newmedia.redbadge.RedBadgerException;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.newmedia.redbadge.a.f */
public class C19959f implements C19953a {
    /* renamed from: a */
    public final List<String> mo53458a() {
        return Arrays.asList(new String[]{"com.huawei.android.launcher"});
    }

    /* renamed from: a */
    public final void mo53459a(Context context, ComponentName componentName, int i) throws RedBadgerException {
        if (context != null && componentName != null) {
            if (i < 0) {
                i = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putString("package", context.getPackageName());
            bundle.putString("class", componentName.getClassName());
            bundle.putInt("badgenumber", i);
            try {
                context.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", null, bundle);
            } catch (Throwable th) {
                throw new RedBadgerException(th.getMessage());
            }
        }
    }
}
