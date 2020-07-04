package com.bytedance.apm.agent.p464v2.instrumentation;

import android.support.p022v4.app.Fragment;
import com.bytedance.apm.agent.helper.PageShowCallback;

/* renamed from: com.bytedance.apm.agent.v2.instrumentation.FragmentShowAgent */
public class FragmentShowAgent {
    private static final String TAG = "FragmentShowAgent";

    public static void onPause(Fragment fragment) {
        if (fragment.mUserVisibleHint && !fragment.mHidden) {
            PageShowCallback.onPageShowHideAction(fragment, false);
        }
    }

    public static void onResume(Fragment fragment) {
        if (fragment.mUserVisibleHint && !fragment.mHidden) {
            PageShowCallback.onPageShowHideAction(fragment, true);
        }
    }

    public static void onHiddenChanged(Fragment fragment, boolean z) {
        PageShowCallback.onPageShowHideAction(fragment, !z);
    }

    public static void setUserVisibleHint(Fragment fragment, boolean z) {
        if (fragment.isResumed() && !fragment.mHidden) {
            PageShowCallback.onPageShowHideAction(fragment, z);
        }
    }
}
