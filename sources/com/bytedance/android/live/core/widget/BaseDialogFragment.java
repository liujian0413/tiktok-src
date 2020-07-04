package com.bytedance.android.live.core.widget;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.DialogFragment;
import android.support.p022v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.View;
import com.bytedance.android.live.BaseDialogFragmentV2;
import com.bytedance.common.utility.collection.C6308d;
import java.util.Iterator;

public class BaseDialogFragment extends BaseDialogFragmentV2 {

    /* renamed from: a */
    public boolean f10224a;

    /* renamed from: b */
    public boolean f10225b;

    /* renamed from: c */
    public boolean f10226c;

    /* renamed from: d */
    public OnDismissListener f10227d;

    /* renamed from: e */
    private C6308d<Object> f10228e = new C6308d<>();

    public void onDestroyView() {
        super.onDestroyView();
        this.f10225b = false;
    }

    public void onPause() {
        super.onPause();
        if (!this.f10228e.mo15145b()) {
            Iterator it = this.f10228e.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public void onResume() {
        super.onResume();
        this.f10224a = true;
        if (!this.f10228e.mo15145b()) {
            Iterator it = this.f10228e.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public void onStop() {
        super.onStop();
        this.f10224a = false;
        if (!this.f10228e.mo15145b()) {
            Iterator it = this.f10228e.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f10225b = false;
        this.f10226c = true;
        if (!this.f10228e.mo15145b()) {
            Iterator it = this.f10228e.iterator();
            while (it.hasNext()) {
                it.next();
            }
            this.f10228e.mo15142a();
        }
    }

    /* renamed from: a */
    public final boolean mo10323a() {
        if (getDialog() == null || !getDialog().isShowing()) {
            return false;
        }
        return true;
    }

    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        try {
            dismiss();
        } catch (IllegalStateException unused) {
            dismissAllowingStateLoss();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10224a = false;
        this.f10225b = false;
        this.f10226c = false;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f10227d != null) {
            this.f10227d.onDismiss(dialogInterface);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.putBoolean("WORKAROUND_FOR_BUG_19917_KEY", true);
        }
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: a */
    public static void m12686a(FragmentActivity fragmentActivity, DialogFragment dialogFragment) {
        m12687a(fragmentActivity, dialogFragment, dialogFragment.getClass().getCanonicalName());
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f10225b = true;
        getDialog().setOnKeyListener(new C3418a(this));
    }

    /* renamed from: a */
    public static void m12688a(C0608j jVar, BaseDialogFragment baseDialogFragment) {
        if (jVar != null && baseDialogFragment != null) {
            baseDialogFragment.show(jVar, baseDialogFragment.getClass().getCanonicalName());
        }
    }

    /* renamed from: a */
    public static void m12687a(FragmentActivity fragmentActivity, DialogFragment dialogFragment, String str) {
        if (fragmentActivity != null && dialogFragment != null) {
            dialogFragment.show(fragmentActivity.getSupportFragmentManager(), str);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo10324a(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return (4 != i || 1 == keyEvent.getAction()) ? false : false;
    }
}
