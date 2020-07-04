package com.p280ss.android.ugc.aweme.poi.p1462b;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.poi.model.PoiDetail;
import com.p280ss.android.ugc.aweme.poi.model.PoiMicroAppLink;
import com.p280ss.android.ugc.aweme.poi.utils.C35454m;
import com.p280ss.android.ugc.aweme.poi.utils.C35460p;
import com.p280ss.android.ugc.aweme.poi.widget.TextAppendViewLayout;
import com.p280ss.android.ugc.aweme.utils.C42939as;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.b.b */
public final class C35067b {

    /* renamed from: a */
    public final Context f91714a;

    /* renamed from: b */
    public PoiDetail f91715b;

    /* renamed from: c */
    private LinearLayout f91716c;

    /* renamed from: d */
    private DmtTextView f91717d;

    /* renamed from: com.ss.android.ugc.aweme.poi.b.b$a */
    public static final class C35068a extends C42939as {

        /* renamed from: a */
        final /* synthetic */ C35067b f91718a;

        /* renamed from: b */
        final /* synthetic */ PoiMicroAppLink f91719b;

        /* renamed from: a */
        public final void mo70606a(View view) {
            C7573i.m23587b(view, "v");
            String contentUrl = this.f91719b.getContentUrl();
            if (!TextUtils.isEmpty(contentUrl)) {
                C35460p.m114546a(this.f91718a.f91714a, contentUrl, "poi_page");
                this.f91718a.mo88882a("mini_g_city_click");
            }
        }

        C35068a(C35067b bVar, PoiMicroAppLink poiMicroAppLink) {
            this.f91718a = bVar;
            this.f91719b = poiMicroAppLink;
        }
    }

    /* renamed from: a */
    public final void mo88881a() {
        PoiMicroAppLink cityWindow = this.f91715b.getCityWindow();
        if (cityWindow != null) {
            this.f91716c.setVisibility(0);
            this.f91717d.setText(cityWindow.getContent());
            mo88882a("mini_g_city_show");
            this.f91716c.setOnClickListener(new C35068a(this, cityWindow));
        }
    }

    /* renamed from: a */
    public final void mo88882a(String str) {
        C35454m.m114526a(this.f91715b, str, new C22984d().mo59973a("enter_from", "poi_page").mo59973a("poi_id", this.f91715b.getPoiId()));
    }

    public C35067b(PoiDetail poiDetail, TextAppendViewLayout textAppendViewLayout) {
        C7573i.m23587b(poiDetail, "poiDetail");
        C7573i.m23587b(textAppendViewLayout, "newLineLayout");
        this.f91715b = poiDetail;
        LinearLayout linearLayout = (LinearLayout) textAppendViewLayout.mo90237a(R.id.w5);
        C7573i.m23582a((Object) linearLayout, "newLineLayout.city_window_layout");
        this.f91716c = linearLayout;
        DmtTextView dmtTextView = (DmtTextView) textAppendViewLayout.mo90237a(R.id.w6);
        C7573i.m23582a((Object) dmtTextView, "newLineLayout.city_window_name");
        this.f91717d = dmtTextView;
        Context context = textAppendViewLayout.getContext();
        C7573i.m23582a((Object) context, "newLineLayout.context");
        this.f91714a = context;
    }
}
