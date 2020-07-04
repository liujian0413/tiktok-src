package com.bytedance.android.livesdk;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.DialogFragment;
import android.support.p022v4.app.Fragment;
import android.view.KeyEvent;
import android.view.View;
import com.bytedance.android.livesdkapi.p458j.C9488a;

public class LiveDialogFragment extends DialogFragment {

    /* renamed from: j */
    public boolean f11448j;

    public void dismiss() {
        dismissAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo11346h() {
        return false;
    }

    public void onDestroyView() {
        this.f11448j = false;
        super.onDestroyView();
    }

    /* renamed from: g */
    public final boolean mo11345g() {
        if (getDialog() == null || !getDialog().isShowing()) {
            return false;
        }
        return true;
    }

    public void onCancel(DialogInterface dialogInterface) {
        if (this.f11448j) {
            dismissAllowingStateLoss();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11448j = false;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C3916b.m13813a().mo11466c();
        super.onDismiss(dialogInterface);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f11448j = true;
        getDialog().setOnKeyListener(new C6129h(this));
    }

    public int show(C0633q qVar, String str) {
        C3916b.m13813a().mo11465b();
        C9488a.m28010a((Object) this, "mDismissed", (Object) Boolean.valueOf(false));
        C9488a.m28010a((Object) this, "mShownByMe", (Object) Boolean.valueOf(true));
        qVar.mo2588a((Fragment) this, str);
        C9488a.m28010a((Object) this, "mViewDestroyed", (Object) Boolean.valueOf(false));
        int d = qVar.mo2606d();
        C9488a.m28010a((Object) this, "mBackStackId", (Object) Integer.valueOf(d));
        return d;
    }

    public void showNow(C0608j jVar, String str) {
        C3916b.m13813a().mo11465b();
        C9488a.m28010a((Object) this, "mDismissed", (Object) Boolean.valueOf(false));
        C9488a.m28010a((Object) this, "mShownByMe", (Object) Boolean.valueOf(true));
        C0633q a = jVar.mo2645a();
        a.mo2588a((Fragment) this, str);
        a.mo2610f();
    }

    public void show(C0608j jVar, String str) {
        C3916b.m13813a().mo11465b();
        C9488a.m28010a((Object) this, "mDismissed", (Object) Boolean.valueOf(false));
        C9488a.m28010a((Object) this, "mShownByMe", (Object) Boolean.valueOf(true));
        C0633q a = jVar.mo2645a();
        a.mo2588a((Fragment) this, str);
        a.mo2606d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo11344a(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (4 != i || 1 != keyEvent.getAction()) {
            return false;
        }
        mo11346h();
        return false;
    }
}
