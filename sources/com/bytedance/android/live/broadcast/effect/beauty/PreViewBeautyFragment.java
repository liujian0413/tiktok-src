package com.bytedance.android.live.broadcast.effect.beauty;

import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.android.live.broadcast.effect.beauty.smallitem.LiveSmallItemBeautyFragment.C2600a;
import com.bytedance.android.live.broadcast.effect.p136b.C2589a;
import com.bytedance.android.live.core.p157ui.BaseFragment;
import com.bytedance.android.livesdk.widget.AdjustPercentBar;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

public final class PreViewBeautyFragment extends BaseFragment {

    /* renamed from: a */
    public static final C2591a f8324a = new C2591a(null);

    /* renamed from: b */
    private HashMap f8325b;

    /* renamed from: com.bytedance.android.live.broadcast.effect.beauty.PreViewBeautyFragment$a */
    public static final class C2591a {
        private C2591a() {
        }

        /* renamed from: a */
        public static PreViewBeautyFragment m10656a() {
            return new PreViewBeautyFragment();
        }

        public /* synthetic */ C2591a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    private View m10653a(int i) {
        if (this.f8325b == null) {
            this.f8325b = new HashMap();
        }
        View view = (View) this.f8325b.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f8325b.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: b */
    private void m10655b() {
        if (this.f8325b != null) {
            this.f8325b.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m10655b();
    }

    /* renamed from: a */
    private final void m10654a() {
        getChildFragmentManager().mo2645a().mo2585a((int) R.id.kz, (Fragment) C2600a.m10685a(new C2589a((LinearLayout) m10653a(R.id.cs_), (AdjustPercentBar) m10653a(R.id.d87), R.layout.at0, R.layout.asz))).mo2610f();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        m10654a();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.aqp, viewGroup, false);
    }
}
