package com.bytedance.ies.uikit.base;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.common.utility.collection.C6308d;
import java.util.Iterator;

public abstract class AbsFragment extends Fragment {

    /* renamed from: b */
    protected boolean f18758b;

    /* renamed from: c */
    public boolean f18759c;

    /* renamed from: c_ */
    public boolean f18760c_;

    /* renamed from: d */
    protected boolean f18761d = true;

    /* renamed from: e */
    private C6308d<C11013c> f18762e = new C6308d<>();

    public final boolean af_() {
        return this.f18760c_;
    }

    public boolean isViewValid() {
        return this.f18758b;
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f18758b = false;
    }

    /* renamed from: T_ */
    public final boolean mo15376T_() {
        if (VERSION.SDK_INT < 15) {
            return this.f18761d;
        }
        return this.mUserVisibleHint;
    }

    public void onPause() {
        FragmentInstrumentation.onPause(this);
        super.onPause();
        if (!this.f18762e.mo15145b()) {
            Iterator it = this.f18762e.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f18758b = false;
        this.f18759c = true;
        if (!this.f18762e.mo15145b()) {
            Iterator it = this.f18762e.iterator();
            while (it.hasNext()) {
                C11013c cVar = (C11013c) it.next();
                if (cVar != null) {
                    cVar.bb_();
                }
            }
            this.f18762e.mo15142a();
        }
    }

    public void onResume() {
        FragmentInstrumentation.onResume(this);
        super.onResume();
        this.f18760c_ = true;
        if (!this.f18762e.mo15145b()) {
            Iterator it = this.f18762e.iterator();
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
        this.f18760c_ = false;
        if (!this.f18762e.mo15145b()) {
            Iterator it = this.f18762e.iterator();
            while (it.hasNext()) {
                C11013c cVar = (C11013c) it.next();
                if (cVar != null) {
                    cVar.bc_();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo15377a(C11013c cVar) {
        this.f18762e.mo15143a(cVar);
    }

    /* renamed from: b */
    public final void mo15379b(C11013c cVar) {
        this.f18762e.mo15144b(cVar);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f18760c_ = false;
        this.f18758b = false;
        this.f18759c = false;
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.putBoolean("WORKAROUND_FOR_BUG_19917_KEY", true);
        }
        super.onSaveInstanceState(bundle);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f18758b = true;
    }
}
