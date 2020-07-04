package com.p280ss.android.ugc.aweme.app.fabric;

import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0608j.C0609a;
import android.support.p022v4.app.Fragment;
import android.view.View;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;

/* renamed from: com.ss.android.ugc.aweme.app.fabric.FabricFragmentLifecycleCallbacks */
public class FabricFragmentLifecycleCallbacks extends C0609a {
    public void onFragmentPaused(C0608j jVar, Fragment fragment) {
        StringBuilder sb = new StringBuilder("onFragmentPaused() called with:  Fragment = [");
        sb.append(fragment.getClass().getName());
        sb.append("]");
        C6921a.m21555a(sb.toString());
    }

    public void onFragmentResumed(C0608j jVar, Fragment fragment) {
        StringBuilder sb = new StringBuilder("onFragmentResumed() called with: Fragment = [");
        sb.append(fragment.getClass().getName());
        sb.append("]");
        C6921a.m21555a(sb.toString());
    }

    public void onFragmentStarted(C0608j jVar, Fragment fragment) {
        StringBuilder sb = new StringBuilder("onFragmentStarted() called with: Fragment = [");
        sb.append(fragment.getClass().getName());
        sb.append("]");
        C6921a.m21555a(sb.toString());
    }

    public void onFragmentCreated(C0608j jVar, Fragment fragment, Bundle bundle) {
        StringBuilder sb = new StringBuilder("onFragmentCreated() called with: Fragment = [");
        sb.append(fragment.getClass().getName());
        sb.append("]");
        C6921a.m21555a(sb.toString());
    }

    public void onFragmentViewCreated(C0608j jVar, Fragment fragment, View view, Bundle bundle) {
        StringBuilder sb = new StringBuilder("onFragmentViewCreated() called with: Fragment = [");
        sb.append(fragment.getClass().getName());
        sb.append("]");
        C6921a.m21555a(sb.toString());
        try {
            long a = C22976a.m75588a(view.getContext().getApplicationContext());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(fragment.getClass().getName());
            sb2.append("   freeMem :");
            sb2.append((a / 1024) / 1024);
            C6921a.m21555a(sb2.toString());
        } catch (Exception unused) {
        }
    }
}
