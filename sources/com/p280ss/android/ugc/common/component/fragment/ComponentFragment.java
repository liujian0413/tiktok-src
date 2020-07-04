package com.p280ss.android.ugc.common.component.fragment;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.uikit.base.AbsFragment;

/* renamed from: com.ss.android.ugc.common.component.fragment.ComponentFragment */
public abstract class ComponentFragment extends AbsFragment {

    /* renamed from: e */
    private SparseArray<C43676b> f20372e;

    /* renamed from: C */
    public abstract SparseArray<C43676b> mo16932C();

    public void onDestroy() {
        for (int i = 0; i < this.f20372e.size(); i++) {
            ((C43676b) this.f20372e.valueAt(i)).mo73371au();
        }
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        for (int i = 0; i < this.f20372e.size(); i++) {
            ((C43676b) this.f20372e.valueAt(i)).mo67633m();
        }
    }

    public void onResume() {
        super.onResume();
        for (int i = 0; i < this.f20372e.size(); i++) {
            ((C43676b) this.f20372e.valueAt(i)).mo67632l();
        }
    }

    public void onStart() {
        super.onStart();
        for (int i = 0; i < this.f20372e.size(); i++) {
            ((C43676b) this.f20372e.valueAt(i)).mo73372av();
        }
    }

    public void onStop() {
        super.onStop();
        for (int i = 0; i < this.f20372e.size(); i++) {
            ((C43676b) this.f20372e.valueAt(i)).mo73305aw();
        }
    }

    public void onDetach() {
        for (int i = 0; i < this.f20372e.size(); i++) {
            ((C43676b) this.f20372e.valueAt(i)).mo73339aA();
        }
        if (this.f20372e != null) {
            this.f20372e.clear();
            this.f20372e = null;
        }
        super.onDetach();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        for (int i = 0; i < this.f20372e.size(); i++) {
            this.f20372e.valueAt(i);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        for (int i = 0; i < this.f20372e.size(); i++) {
            ((C43676b) this.f20372e.valueAt(i)).mo73490a(bundle);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        for (int i = 0; i < this.f20372e.size(); i++) {
            this.f20372e.valueAt(i);
        }
    }

    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        for (int i = 0; i < this.f20372e.size(); i++) {
            this.f20372e.valueAt(i);
        }
    }

    public void onAttach(Activity activity) {
        this.f20372e = mo16932C();
        for (int i = 0; i < this.f20372e.size(); i++) {
            ((C43676b) this.f20372e.valueAt(i)).mo73325a(activity, this);
        }
        super.onAttach(activity);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}
