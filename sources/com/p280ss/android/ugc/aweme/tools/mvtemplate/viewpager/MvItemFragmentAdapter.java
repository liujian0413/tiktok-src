package com.p280ss.android.ugc.aweme.tools.mvtemplate.viewpager;

import android.support.p022v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34976f;
import com.p280ss.android.ugc.playerkit.model.C44919c;
import com.p280ss.android.ugc.playerkit.model.C44920d;
import com.p280ss.android.ugc.playerkit.model.C44921e;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.viewpager.MvItemFragmentAdapter */
public class MvItemFragmentAdapter extends Fragment implements C34976f {
    /* renamed from: a */
    public void mo63043a(C44919c cVar) {
    }

    /* renamed from: a */
    public final void mo63044a(C44920d dVar) {
    }

    /* renamed from: a */
    public void mo63045a(C44921e eVar) {
    }

    /* renamed from: a */
    public void mo63046a(String str) {
    }

    /* renamed from: b */
    public final void mo64944b(float f) {
    }

    /* renamed from: b */
    public final void mo64946b(C44919c cVar) {
    }

    /* renamed from: b */
    public final void mo63047b(String str) {
    }

    /* renamed from: b */
    public final void mo64947b(boolean z) {
    }

    /* renamed from: c */
    public final void mo64949c(String str) {
    }

    /* renamed from: d */
    public final void mo64951d(String str) {
    }

    /* renamed from: e */
    public final void mo64953e(String str) {
    }

    /* renamed from: e_ */
    public final void mo64954e_(boolean z) {
    }

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
