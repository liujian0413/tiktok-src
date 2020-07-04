package com.bytedance.android.live.broadcast.effect.beauty;

import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.broadcast.effect.C2624k;
import com.bytedance.android.live.broadcast.effect.LiveFilterFragment;
import com.bytedance.android.live.broadcast.effect.adapter.LiveFilterAdapter.C2585a;
import com.bytedance.android.live.broadcast.effect.adapter.LiveFilterListItemDecoration;
import com.bytedance.android.live.broadcast.effect.p136b.C2590b;
import com.bytedance.android.live.core.p157ui.BaseFragment;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

public final class PreViewFilterFragment extends BaseFragment {

    /* renamed from: b */
    public static final C2592a f8326b = new C2592a(null);

    /* renamed from: a */
    public C2585a f8327a;

    /* renamed from: c */
    private HashMap f8328c;

    /* renamed from: com.bytedance.android.live.broadcast.effect.beauty.PreViewFilterFragment$a */
    public static final class C2592a {
        private C2592a() {
        }

        public /* synthetic */ C2592a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static PreViewFilterFragment m10659a(C2585a aVar) {
            C7573i.m23587b(aVar, "onItemClickListener");
            PreViewFilterFragment preViewFilterFragment = new PreViewFilterFragment();
            preViewFilterFragment.f8327a = aVar;
            return preViewFilterFragment;
        }
    }

    /* renamed from: b */
    private void m10658b() {
        if (this.f8328c != null) {
            this.f8328c.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m10658b();
    }

    /* renamed from: a */
    private final void m10657a() {
        C2585a aVar = this.f8327a;
        C2624k a = C2624k.m10736a();
        C7573i.m23582a((Object) a, "LiveFilterManager.inst()");
        getChildFragmentManager().mo2645a().mo2585a((int) R.id.ake, (Fragment) LiveFilterFragment.m10597a(aVar, a.f8419b, new C2590b(R.layout.at1, new LiveFilterListItemDecoration()))).mo2610f();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        m10657a();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.aqq, viewGroup, false);
    }
}
