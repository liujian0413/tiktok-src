package com.p280ss.android.ugc.aweme.anchor;

import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType;
import java.util.HashMap;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.anchor.AnchorBaseFragment */
public class AnchorBaseFragment extends Fragment {

    /* renamed from: b */
    public static AnchorBusinessType f59954b = AnchorBusinessType.NO_TYPE;

    /* renamed from: c */
    public static final C22505a f59955c = new C22505a(null);

    /* renamed from: a */
    public C22543d f59956a;

    /* renamed from: d */
    private HashMap f59957d;

    /* renamed from: com.ss.android.ugc.aweme.anchor.AnchorBaseFragment$a */
    public static final class C22505a {
        private C22505a() {
        }

        /* renamed from: a */
        public static AnchorBusinessType m74423a() {
            return AnchorBaseFragment.f59954b;
        }

        public /* synthetic */ C22505a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m74424a(AnchorBusinessType anchorBusinessType) {
            C7573i.m23587b(anchorBusinessType, "<set-?>");
            AnchorBaseFragment.f59954b = anchorBusinessType;
        }
    }

    /* renamed from: a */
    public View mo59096a(int i) {
        if (this.f59957d == null) {
            this.f59957d = new HashMap();
        }
        View view = (View) this.f59957d.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f59957d.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: b */
    public void mo59097b() {
        if (this.f59957d != null) {
            this.f59957d.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo59097b();
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

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (getActivity() != null) {
            FragmentActivity activity = getActivity();
            if (!(activity instanceof C22543d)) {
                activity = null;
            }
            this.f59956a = (C22543d) activity;
        }
    }
}
