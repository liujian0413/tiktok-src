package com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1013a.C22587a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1014b.C22595a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.TimeLockCheckFragment */
public abstract class TimeLockCheckFragment extends AbsTimeLockFragment implements C22595a {

    /* renamed from: h */
    private DmtStatusView f60217h;

    /* renamed from: i */
    private C22587a f60218i;

    /* renamed from: j */
    private HashMap f60219j;

    /* renamed from: d */
    public abstract void mo59330d();

    /* renamed from: e */
    public void mo59331e() {
        if (this.f60219j != null) {
            this.f60219j.clear();
        }
    }

    /* renamed from: f */
    public final void mo59247f() {
        m74794i();
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo59331e();
    }

    /* renamed from: g */
    public void mo59248g() {
        m74794i();
        mo59330d();
    }

    /* renamed from: i */
    private final void m74794i() {
        if (isViewValid()) {
            DmtStatusView dmtStatusView = this.f60217h;
            if (dmtStatusView != null) {
                dmtStatusView.mo25939d();
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C22587a aVar = this.f60218i;
        if (aVar != null) {
            aVar.mo59231b();
        }
    }

    /* renamed from: j */
    private final void m74795j() {
        this.f60218i = new C22587a();
        C22587a aVar = this.f60218i;
        if (aVar != null) {
            aVar.mo59229a((C22595a) this);
        }
    }

    /* renamed from: c */
    public final void mo59335c(String str) {
        if (!TextUtils.isEmpty(str)) {
            DmtStatusView dmtStatusView = this.f60217h;
            if (dmtStatusView != null) {
                dmtStatusView.mo25942f();
            }
            C22587a aVar = this.f60218i;
            if (aVar != null) {
                if (str == null) {
                    str = "";
                }
                aVar.mo59230a(str);
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        this.f60217h = (DmtStatusView) view.findViewById(R.id.dav);
        DmtStatusView dmtStatusView = this.f60217h;
        if (dmtStatusView != null) {
            dmtStatusView.setBuilder(C10803a.m31631a((Context) getActivity()));
        }
        m74795j();
    }
}
