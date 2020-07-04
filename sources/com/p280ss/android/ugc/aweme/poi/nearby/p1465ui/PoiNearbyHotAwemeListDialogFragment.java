package com.p280ss.android.ugc.aweme.poi.nearby.p1465ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.nearby.ui.PoiNearbyHotAwemeListDialogFragment */
public final class PoiNearbyHotAwemeListDialogFragment extends AmeBaseFragment {

    /* renamed from: e */
    public static final C35133a f91899e = new C35133a(null);

    /* renamed from: f */
    private HashMap f91900f;

    /* renamed from: com.ss.android.ugc.aweme.poi.nearby.ui.PoiNearbyHotAwemeListDialogFragment$a */
    public static final class C35133a {
        private C35133a() {
        }

        public /* synthetic */ C35133a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static PoiNearbyHotAwemeListDialogFragment m113343a(PoiStruct poiStruct, int i, String str) {
            C7573i.m23587b(poiStruct, "poiStruct");
            return new PoiNearbyHotAwemeListDialogFragment();
        }
    }

    /* renamed from: a */
    private void m113342a() {
        if (this.f91900f != null) {
            this.f91900f.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m113342a();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return layoutInflater.inflate(R.layout.ba, viewGroup, false);
    }
}
