package android.support.p022v4.app;

import android.app.Dialog;
import android.os.Looper;
import android.view.WindowManager.BadTokenException;
import com.p280ss.android.ugc.aweme.p331m.C7163a;

/* renamed from: android.support.v4.app.g */
final class C0605g {
    /* renamed from: a */
    static void m2533a(Dialog dialog) {
        if (!C7163a.m22363a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            dialog.dismiss();
            return;
        }
        throw new IllegalStateException("debug check! this method should be called from main thread!");
    }

    /* renamed from: a */
    static void m2534a(DialogFragment dialogFragment) {
        try {
            dialogFragment.onStart$___twin___();
        } catch (BadTokenException unused) {
        }
    }
}
