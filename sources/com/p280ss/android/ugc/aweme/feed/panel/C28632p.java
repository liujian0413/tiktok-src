package com.p280ss.android.ugc.aweme.feed.panel;

import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.view.View;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.common.component.fragment.C43675a;

/* renamed from: com.ss.android.ugc.aweme.feed.panel.p */
public abstract class C28632p extends C43675a {

    /* renamed from: a */
    private boolean f75449a;

    /* renamed from: b */
    private Unbinder f75450b;

    /* renamed from: bw */
    public final boolean mo73488bw() {
        return this.f75449a;
    }

    /* renamed from: h */
    public boolean mo73300h() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ar */
    public boolean mo73368ar() {
        Fragment ay_ = ay_();
        if (ay_ == null || !ay_.isResumed()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bx */
    public final C0608j mo73489bx() {
        AbsFragment absFragment = (AbsFragment) ay_();
        if (absFragment == null) {
            return null;
        }
        return absFragment.getChildFragmentManager();
    }

    /* access modifiers changed from: protected */
    public final boolean ax_() {
        AbsFragment absFragment = (AbsFragment) ay_();
        if (absFragment == null || !absFragment.af_()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bf */
    public boolean mo73385bf() {
        AbsFragment absFragment = (AbsFragment) ay_();
        if (absFragment == null || !absFragment.isViewValid()) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public void mo67634n() {
        super.mo67634n();
        if (this.f75450b != null) {
            this.f75450b.unbind();
        }
        if (mo73300h()) {
            C42961az.m136383d(this);
        }
    }

    /* renamed from: f */
    public void mo67627f(boolean z) {
        this.f75449a = z;
    }

    /* renamed from: a */
    public void mo67605a(View view, Bundle bundle) {
        super.mo67605a(view, bundle);
        ButterKnife.bind((Object) this, view);
        if (mo73300h()) {
            C42961az.m136382c(this);
        }
    }
}
