package android.support.p022v4.app;

import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.p280ss.android.ugc.aweme.lancet.C32272a;

/* renamed from: android.support.v4.app.ag */
final class C0594ag {
    /* renamed from: a */
    static void m2474a(SupportActivity supportActivity, int i) {
        if (VERSION.SDK_INT != 26) {
            supportActivity.setRequestedOrientation$___twin___(i);
            return;
        }
        TypedArray obtainStyledAttributes = supportActivity.obtainStyledAttributes(new int[]{16842840});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        if (!z) {
            supportActivity.setRequestedOrientation$___twin___(i);
        }
    }

    /* renamed from: a */
    static void m2475a(SupportActivity supportActivity, Bundle bundle) {
        C32272a.m104795a(supportActivity);
        supportActivity.onCreate$___twin___(bundle);
    }
}
