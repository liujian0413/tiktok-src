package com.bytedance.scene;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import com.bytedance.scene.utlity.C12700j;

/* renamed from: com.bytedance.scene.g */
public final class C12600g extends Fragment {

    /* renamed from: a */
    public C12601a f33434a;

    /* renamed from: b */
    public C12641m f33435b;

    /* renamed from: com.bytedance.scene.g$a */
    public interface C12601a {
        /* renamed from: a */
        void mo30892a();
    }

    public final void onDestroyView() {
        super.onDestroyView();
        if (this.f33435b != null) {
            this.f33435b.mo31039e();
        }
    }

    public final void onDetach() {
        super.onDetach();
        if (this.f33434a != null) {
            this.f33434a.mo30892a();
        }
    }

    public final void onPause() {
        super.onPause();
        if (this.f33435b != null) {
            this.f33435b.mo31037c();
        }
    }

    public final void onResume() {
        super.onResume();
        if (this.f33435b != null) {
            this.f33435b.mo31036b();
        }
    }

    public final void onStart() {
        super.onStart();
        if (this.f33435b != null) {
            this.f33435b.mo31033a();
        }
    }

    public final void onStop() {
        super.onStop();
        if (this.f33435b != null) {
            this.f33435b.mo31038d();
        }
    }

    /* renamed from: a */
    private void m36519a() {
        FragmentManager fragmentManager = getActivity().getFragmentManager();
        C12700j.m36910a(fragmentManager, fragmentManager.beginTransaction().remove(this), false);
    }

    /* renamed from: a */
    public static C12600g m36518a(boolean z) {
        return new C12600g();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(false);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f33435b != null) {
            this.f33435b.mo31035a(bundle);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.f33435b != null) {
            this.f33435b.mo31034a(getActivity(), bundle);
        } else {
            m36519a();
        }
    }
}
