package com.p280ss.android.ugc.aweme.common.p1148ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p022v4.app.DialogFragment;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.common.utility.collection.C6308d;
import com.bytedance.ies.uikit.base.C11013c;
import java.util.Iterator;
import org.greenrobot.eventbus.C7705c;

/* renamed from: com.ss.android.ugc.aweme.common.ui.BaseDialogFragment */
public class BaseDialogFragment extends DialogFragment {

    /* renamed from: a */
    private C6308d<C11013c> f67656a = new C6308d<>();

    /* renamed from: r */
    public boolean f67657r;

    /* renamed from: s */
    protected boolean f67658s;

    /* renamed from: t */
    public boolean f67659t;

    /* renamed from: p */
    public boolean mo66608p() {
        return this.f67658s;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f67658s = false;
        C7705c.m23799a();
    }

    public void onPause() {
        super.onPause();
        if (!this.f67656a.mo15145b()) {
            Iterator it = this.f67656a.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f67658s = false;
        this.f67659t = true;
        if (!this.f67656a.mo15145b()) {
            Iterator it = this.f67656a.iterator();
            while (it.hasNext()) {
                C11013c cVar = (C11013c) it.next();
                if (cVar != null) {
                    cVar.bb_();
                }
            }
            this.f67656a.mo15142a();
        }
    }

    public void onResume() {
        super.onResume();
        this.f67657r = true;
        if (!this.f67656a.mo15145b()) {
            Iterator it = this.f67656a.iterator();
            while (it.hasNext()) {
                C11013c cVar = (C11013c) it.next();
                if (cVar != null) {
                    cVar.mo26596a();
                }
            }
        }
    }

    public void onStop() {
        super.onStop();
        this.f67657r = false;
        if (!this.f67656a.mo15145b()) {
            Iterator it = this.f67656a.iterator();
            while (it.hasNext()) {
                C11013c cVar = (C11013c) it.next();
                if (cVar != null) {
                    cVar.bc_();
                }
            }
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C7705c.m23799a().mo20392b((Object) this);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f67657r = false;
        this.f67658s = false;
        this.f67659t = false;
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.putBoolean("WORKAROUND_FOR_BUG_19917_KEY", true);
        }
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: i */
    public final void mo66607i(final View view) {
        if (view != null) {
            final FragmentActivity activity = getActivity();
            if (activity != null) {
                view.postDelayed(new Runnable() {
                    public final void run() {
                        ((InputMethodManager) activity.getSystemService("input_method")).showSoftInput(view, 1);
                    }
                }, 100);
            }
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        if (this.mFragmentManager != null && isAdded()) {
            try {
                dismiss();
            } catch (IllegalStateException unused) {
                dismissAllowingStateLoss();
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f67658s = true;
    }
}
