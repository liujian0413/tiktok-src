package com.p280ss.android.ugc.aweme.poi.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.uikit.viewpager.AbsPagerAdapter;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.loader.SmartImageView;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.model.feed.PoiClassRankBannerStruct;
import com.p280ss.android.ugc.aweme.poi.service.IPoiService;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.PoiRankBannerPagerAdapter */
public class PoiRankBannerPagerAdapter extends AbsPagerAdapter {

    /* renamed from: e */
    public static int f91425e;

    /* renamed from: f */
    public static int f91426f;

    /* renamed from: d */
    public PoiSimpleBundle f91427d;

    /* renamed from: g */
    private List<PoiClassRankBannerStruct> f91428g;

    /* renamed from: h */
    private int f91429h;

    /* renamed from: i */
    private String f91430i;

    /* renamed from: j */
    private String f91431j;

    /* renamed from: com.ss.android.ugc.aweme.poi.adapter.PoiRankBannerPagerAdapter$a */
    static class C35009a {

        /* renamed from: a */
        View f91432a;

        /* renamed from: b */
        Context f91433b;

        /* renamed from: c */
        int f91434c;

        /* renamed from: d */
        SmartImageView f91435d;

        /* renamed from: e */
        DmtTextView f91436e;

        /* renamed from: f */
        DmtTextView f91437f;

        /* renamed from: g */
        View f91438g;

        /* renamed from: h */
        View f91439h;

        /* renamed from: i */
        String f91440i;

        /* renamed from: j */
        PoiSimpleBundle f91441j;

        /* renamed from: k */
        String f91442k;

        /* renamed from: a */
        public final void mo88771a(PoiClassRankBannerStruct poiClassRankBannerStruct, int i) {
            C12133n.m35299a(C23400r.m76741a(poiClassRankBannerStruct.getBannerUrl())).mo29836a(PoiRankBannerPagerAdapter.f91425e, PoiRankBannerPagerAdapter.f91426f).mo29844a((C12128i) this.f91435d).mo29845a("PoiRankBannerPagerAdapter").mo29848a();
            if (TextUtils.isEmpty(poiClassRankBannerStruct.getSchema())) {
                this.f91436e.setVisibility(0);
                this.f91436e.setText(poiClassRankBannerStruct.getDescription());
                this.f91438g.setVisibility(0);
                this.f91439h.setVisibility(0);
            } else {
                this.f91436e.setVisibility(8);
                this.f91436e.setText("");
                this.f91438g.setVisibility(8);
                this.f91439h.setVisibility(8);
                if (!TextUtils.isEmpty(poiClassRankBannerStruct.getTag())) {
                    this.f91437f.setText(poiClassRankBannerStruct.getTag());
                    this.f91437f.setVisibility(0);
                    this.f91432a.setOnClickListener(new C35015d(this, poiClassRankBannerStruct, i));
                }
            }
            this.f91437f.setVisibility(8);
            this.f91432a.setOnClickListener(new C35015d(this, poiClassRankBannerStruct, i));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo88772a(PoiClassRankBannerStruct poiClassRankBannerStruct, int i, View view) {
            ((IPoiService) ServiceManager.get().getService(IPoiService.class)).performPoiBannerItemClick(this.f91441j, this.f91440i, this.f91434c, this.f91442k, this.f91433b, poiClassRankBannerStruct, i);
        }

        C35009a(View view, int i, String str, String str2, PoiSimpleBundle poiSimpleBundle) {
            this.f91432a = view;
            this.f91434c = i;
            this.f91440i = str2;
            this.f91441j = poiSimpleBundle;
            this.f91442k = str;
            this.f91433b = view.getContext();
            this.f91435d = (SmartImageView) view.findViewById(R.id.aud);
            this.f91436e = (DmtTextView) view.findViewById(R.id.au9);
            this.f91438g = view.findViewById(R.id.bl8);
            this.f91439h = view.findViewById(R.id.ctb);
            this.f91437f = (DmtTextView) view.findViewById(R.id.aui);
        }
    }

    public int getCount() {
        if (this.f91428g == null) {
            return 0;
        }
        return this.f91428g.size();
    }

    public PoiRankBannerPagerAdapter(Context context, LayoutInflater layoutInflater) {
        super(context, layoutInflater);
        if (f91425e == 0) {
            int a = C9738o.m28691a(context);
            f91425e = a;
            double d = (double) a;
            Double.isNaN(d);
            f91426f = (int) (d / 4.787d);
        }
    }

    /* renamed from: a */
    public final View mo26999a(int i, View view, ViewGroup viewGroup) {
        C35009a aVar;
        if (view == null) {
            view = this.f30119b.inflate(R.layout.a0p, viewGroup, false);
            aVar = new C35009a(view, this.f91429h, this.f91430i, this.f91431j, this.f91427d);
            view.setTag(aVar);
        } else {
            aVar = (C35009a) view.getTag();
        }
        if (getCount() > 0) {
            aVar.mo88771a((PoiClassRankBannerStruct) this.f91428g.get(i), i);
        }
        return view;
    }

    /* renamed from: a */
    public final void mo88770a(List<PoiClassRankBannerStruct> list, int i, String str, int i2) {
        this.f91429h = 0;
        this.f91430i = str;
        this.f91428g = list;
        this.f91431j = "poi_page";
        notifyDataSetChanged();
    }
}
