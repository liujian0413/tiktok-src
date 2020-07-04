package com.p280ss.android.ugc.aweme.detail.p1167ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.detail.ui.PoiRankDetailPageFragment */
public final class PoiRankDetailPageFragment extends DetailPageFragment {

    /* renamed from: m */
    private HashMap f69081m;

    /* renamed from: p */
    private void m86175p() {
        if (this.f69081m != null) {
            this.f69081m.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m86175p();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.py, viewGroup, false);
    }
}
