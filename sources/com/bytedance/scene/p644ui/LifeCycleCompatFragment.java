package com.bytedance.scene.p644ui;

import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import com.bytedance.scene.C12641m;

/* renamed from: com.bytedance.scene.ui.LifeCycleCompatFragment */
public class LifeCycleCompatFragment extends Fragment {

    /* renamed from: a */
    public C12641m f33657a;

    /* renamed from: a */
    private void m36867a() {
        C12684a.m36877a(this.mFragmentManager.mo2645a().mo2587a((Fragment) this), false);
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f33657a != null) {
            this.f33657a.mo31039e();
        }
    }

    public void onPause() {
        super.onPause();
        if (this.f33657a != null) {
            this.f33657a.mo31037c();
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f33657a != null) {
            this.f33657a.mo31036b();
        }
    }

    public void onStart() {
        super.onStart();
        if (this.f33657a != null) {
            this.f33657a.mo31033a();
        }
    }

    public void onStop() {
        super.onStop();
        if (this.f33657a != null) {
            this.f33657a.mo31038d();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mRetainInstance = false;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f33657a != null) {
            this.f33657a.mo31035a(bundle);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.f33657a != null) {
            this.f33657a.mo31034a(getActivity(), bundle);
        } else {
            m36867a();
        }
    }
}
