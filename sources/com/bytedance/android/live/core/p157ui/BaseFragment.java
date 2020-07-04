package com.bytedance.android.live.core.p157ui;

import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.view.View;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.bytedance.android.live.core.ui.BaseFragment */
public class BaseFragment extends Fragment {

    /* renamed from: a */
    private final C47562b f10101a = new C47562b();

    /* renamed from: n */
    public boolean f10102n;

    /* renamed from: o */
    protected boolean f10103o;

    /* renamed from: p */
    public boolean f10104p;

    /* renamed from: l */
    public boolean mo8989l() {
        return this.f10103o;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f10103o = false;
    }

    public void onPause() {
        super.onPause();
        this.f10102n = false;
    }

    public void onResume() {
        super.onResume();
        this.f10102n = true;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f10103o = false;
        this.f10104p = true;
        this.f10101a.mo119660a();
    }

    /* renamed from: a */
    public final void mo10241a(C7321c cVar) {
        this.f10101a.mo119661a(cVar);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10102n = false;
        this.f10103o = false;
        this.f10104p = false;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f10103o = true;
    }
}
