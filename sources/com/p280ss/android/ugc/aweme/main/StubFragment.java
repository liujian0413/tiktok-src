package com.p280ss.android.ugc.aweme.main;

import android.support.p022v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.main.StubFragment */
public class StubFragment extends Fragment {
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public void onPause() {
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public void onResume() {
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }
}
