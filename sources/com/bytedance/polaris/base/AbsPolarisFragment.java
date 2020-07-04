package com.bytedance.polaris.base;

import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.view.View;
import com.bytedance.polaris.depend.C12428i;

public abstract class AbsPolarisFragment extends Fragment implements C12375a {

    /* renamed from: a */
    protected boolean f32823a;

    /* renamed from: b */
    protected boolean f32824b;

    /* renamed from: c */
    protected boolean f32825c;

    /* renamed from: p_ */
    public final boolean mo30201p_() {
        return this.f32823a;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f32824b = false;
    }

    public void onPause() {
        super.onPause();
        this.f32823a = false;
    }

    public void onResume() {
        super.onResume();
        this.f32823a = true;
    }

    public void onStop() {
        super.onStop();
        this.f32823a = false;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f32824b = false;
        this.f32825c = true;
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f32823a = false;
        this.f32824b = false;
        this.f32825c = false;
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.putBoolean("WORKAROUND_FOR_BUG_19917_KEY", true);
        }
        super.onSaveInstanceState(bundle);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f32824b = true;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C12428i.m36159i();
        getActivity();
    }
}
