package com.p280ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ImageView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.favorites.p1210a.C27705i;
import com.p280ss.android.ugc.aweme.feed.C28290d;
import com.p280ss.android.ugc.aweme.feed.model.NearbyCities.CityBean;
import com.p280ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import com.p280ss.android.ugc.aweme.location.C32630h;
import com.p280ss.android.ugc.aweme.poi.LocationBundle;
import com.p280ss.android.ugc.aweme.poi.model.PoiAddress;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.PoiItemViewHolder */
public class PoiItemViewHolder {

    /* renamed from: a */
    LocationBundle f69555a;

    /* renamed from: b */
    private Context f69556b;
    ViewGroup mPoiCouponContainer;
    DmtTextView mPoiCouponDesc;
    DmtTextView mPoiDistance;
    SmartImageView mPoiImg;
    ImageView mPoiImgPlaceHolder;
    DmtTextView mPoiName;
    DmtTextView mPoiOption;
    DmtTextView mPoiPerPrice;
    DmtTextView mPoiRankDesc;
    DmtTextView mPoiSpuOverDate;
    DmtTextView mPoiType;
    View mSecondCutLine;
    View spaceView;

    /* renamed from: a */
    private void m86903a() {
        this.mPoiPerPrice.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public final void onGlobalLayout() {
                int i;
                Layout layout = PoiItemViewHolder.this.mPoiPerPrice.getLayout();
                if (layout != null) {
                    int ellipsisCount = layout.getEllipsisCount(PoiItemViewHolder.this.mPoiPerPrice.getLineCount() - 1);
                    DmtTextView dmtTextView = PoiItemViewHolder.this.mPoiPerPrice;
                    if (ellipsisCount > 0) {
                        i = 8;
                    } else {
                        i = 0;
                    }
                    dmtTextView.setVisibility(i);
                    PoiItemViewHolder.this.mPoiPerPrice.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            }
        });
    }

    /* renamed from: a */
    private static SimplePoiInfoStruct m86902a(C27705i iVar) {
        SimplePoiInfoStruct simplePoiInfoStruct = iVar.f73041i;
        if (simplePoiInfoStruct == null) {
            return null;
        }
        if (!C6307b.m19566a((Collection<T>) iVar.f73042j)) {
            simplePoiInfoStruct.setCover((UrlModel) iVar.f73042j.get(0));
        }
        simplePoiInfoStruct.setPoiSpuStatusDesc(iVar.f73038f);
        if (iVar.f73033a == 2) {
            simplePoiInfoStruct.setPoiSpuOverDate(1);
        }
        simplePoiInfoStruct.setPoiName(iVar.mo71163a());
        return simplePoiInfoStruct;
    }

    /* renamed from: a */
    private static boolean m86904a(PoiAddress poiAddress) {
        if (!C32630h.m105697f()) {
            return false;
        }
        CityBean c = C28290d.m93042c();
        if (c == null) {
            return false;
        }
        if (!TextUtils.isEmpty(poiAddress.cityCode) && TextUtils.equals(poiAddress.cityCode, c.code)) {
            return true;
        }
        if (TextUtils.isEmpty(poiAddress.city) || TextUtils.isEmpty(c.name)) {
            return false;
        }
        if (poiAddress.city.contains(c.name) || c.name.contains(poiAddress.city)) {
            return true;
        }
        return false;
    }

    public PoiItemViewHolder(View view, LocationBundle locationBundle) {
        this.f69556b = view.getContext();
        this.f69555a = locationBundle;
        ButterKnife.bind((Object) this, view);
    }

    /* renamed from: a */
    public final void mo67994a(int i, C27705i iVar) {
        mo67995a(-1, m86902a(iVar));
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0280  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo67995a(int r12, com.p280ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct r13) {
        /*
            r11 = this;
            if (r13 != 0) goto L_0x0003
            return
        L_0x0003:
            r0 = 0
            r1 = 8
            if (r12 != 0) goto L_0x000e
            android.view.View r12 = r11.spaceView
            r12.setVisibility(r0)
            goto L_0x0013
        L_0x000e:
            android.view.View r12 = r11.spaceView
            r12.setVisibility(r1)
        L_0x0013:
            com.ss.android.ugc.aweme.base.model.UrlModel r12 = r13.getCover()
            if (r12 == 0) goto L_0x0051
            com.ss.android.ugc.aweme.base.model.UrlModel r12 = r13.getCover()
            java.util.List r12 = r12.getUrlList()
            boolean r12 = com.bytedance.common.utility.collection.C6307b.m19566a(r12)
            if (r12 == 0) goto L_0x0028
            goto L_0x0051
        L_0x0028:
            com.ss.android.ugc.aweme.base.model.UrlModel r12 = r13.getCover()
            com.bytedance.lighten.core.a.a r12 = com.p280ss.android.ugc.aweme.base.C23400r.m76741a(r12)
            com.bytedance.lighten.core.r r12 = com.bytedance.lighten.core.C12133n.m35299a(r12)
            r2 = 288(0x120, float:4.04E-43)
            r3 = 192(0xc0, float:2.69E-43)
            com.bytedance.lighten.core.r r12 = r12.mo29836a(r2, r3)
            java.lang.String r2 = "PoiItemViewHolder"
            com.bytedance.lighten.core.r r12 = r12.mo29845a(r2)
            com.bytedance.lighten.loader.SmartImageView r2 = r11.mPoiImg
            com.bytedance.lighten.core.r r12 = r12.mo29844a(r2)
            r12.mo29848a()
            android.widget.ImageView r12 = r11.mPoiImgPlaceHolder
            r12.setVisibility(r1)
            goto L_0x005e
        L_0x0051:
            com.bytedance.lighten.loader.SmartImageView r12 = r11.mPoiImg
            r2 = 2131100846(0x7f0604ae, float:1.7814085E38)
            r12.setImageResource(r2)
            android.widget.ImageView r12 = r11.mPoiImgPlaceHolder
            r12.setVisibility(r0)
        L_0x005e:
            boolean r12 = r13.isPoiSpuOverDate()
            if (r12 == 0) goto L_0x007b
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.mPoiSpuOverDate
            r12.setVisibility(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.mPoiSpuOverDate
            java.lang.String r2 = r13.getPoiSpuStatusDesc()
            r12.setText(r2)
            com.bytedance.lighten.loader.SmartImageView r12 = r11.mPoiImg
            r2 = 1051595899(0x3eae147b, float:0.34)
            r12.setAlpha(r2)
            goto L_0x0087
        L_0x007b:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.mPoiSpuOverDate
            r12.setVisibility(r1)
            com.bytedance.lighten.loader.SmartImageView r12 = r11.mPoiImg
            r2 = 1065353216(0x3f800000, float:1.0)
            r12.setAlpha(r2)
        L_0x0087:
            java.lang.String r12 = r13.getPoiName()
            boolean r2 = android.text.TextUtils.isEmpty(r12)
            if (r2 != 0) goto L_0x00a0
            android.content.Context r2 = r11.f69556b
            java.util.List r3 = r13.getPositionInName()
            android.text.SpannableString r12 = com.p280ss.android.ugc.aweme.base.utils.C23472a.m77059a(r2, r12, r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r11.mPoiName
            r2.setText(r12)
        L_0x00a0:
            java.lang.String r12 = r13.getPoiRankDesc()
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 == 0) goto L_0x00ce
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.mPoiRankDesc
            r12.setVisibility(r1)
            java.lang.String r12 = r13.getOptionName()
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x00c8
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.mPoiOption
            java.lang.String r2 = r13.getOptionName()
            r12.setText(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.mPoiOption
            r12.setVisibility(r0)
            goto L_0x00e6
        L_0x00c8:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.mPoiOption
            r12.setVisibility(r1)
            goto L_0x00e6
        L_0x00ce:
            android.view.View r12 = r11.mSecondCutLine
            r12.setVisibility(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.mPoiOption
            r12.setVisibility(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.mPoiRankDesc
            r12.setVisibility(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.mPoiRankDesc
            java.lang.String r2 = r13.getPoiRankDesc()
            r12.setText(r2)
        L_0x00e6:
            double r2 = r13.getCost()
            int r12 = (int) r2
            if (r12 != 0) goto L_0x00f3
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.mPoiPerPrice
            r12.setVisibility(r1)
            goto L_0x012b
        L_0x00f3:
            android.content.Context r2 = r11.f69556b
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131825566(0x7f11139e, float:1.9283992E38)
            java.lang.String r2 = r2.getString(r3)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r12 = java.lang.String.valueOf(r12)
            r3[r0] = r12
            java.lang.String r12 = com.C1642a.m8034a(r2, r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r11.mPoiPerPrice
            r2.setText(r12)
            r11.m86903a()
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.mPoiOption
            int r12 = r12.getVisibility()
            if (r12 != 0) goto L_0x012b
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.mPoiPerPrice
            int r12 = r12.getVisibility()
            if (r12 != 0) goto L_0x012b
            android.view.View r12 = r11.mSecondCutLine
            r12.setVisibility(r0)
            goto L_0x0130
        L_0x012b:
            android.view.View r12 = r11.mSecondCutLine
            r12.setVisibility(r1)
        L_0x0130:
            com.ss.android.ugc.aweme.poi.model.PoiAddress r12 = r13.getPoiAddress()
            if (r12 == 0) goto L_0x0160
            com.ss.android.ugc.aweme.poi.model.PoiAddress r12 = r13.getPoiAddress()
            boolean r12 = m86904a(r12)
            if (r12 != 0) goto L_0x0160
            java.lang.String r12 = r13.getCity()
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 == 0) goto L_0x0151
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.mPoiDistance
            r12.setVisibility(r1)
            goto L_0x01d0
        L_0x0151:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.mPoiDistance
            java.lang.String r2 = r13.getCity()
            r12.setText(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.mPoiDistance
            r12.setVisibility(r0)
            goto L_0x01d0
        L_0x0160:
            com.ss.android.ugc.aweme.poi.LocationBundle r12 = r11.f69555a
            if (r12 == 0) goto L_0x01b2
            com.ss.android.ugc.aweme.poi.LocationBundle r12 = r11.f69555a
            boolean r12 = r12.isValid()
            if (r12 == 0) goto L_0x01b2
            java.lang.String r12 = r13.getLatitude()
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x01b2
            java.lang.String r12 = r13.getLongitude()
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 == 0) goto L_0x0181
            goto L_0x01b2
        L_0x0181:
            com.ss.android.ugc.aweme.poi.LocationBundle r12 = r11.f69555a
            double r3 = r12.latitude
            com.ss.android.ugc.aweme.poi.LocationBundle r12 = r11.f69555a
            double r5 = r12.longitude
            java.lang.String r12 = r13.getLatitude()
            java.lang.Double r12 = java.lang.Double.valueOf(r12)
            double r7 = r12.doubleValue()
            java.lang.String r12 = r13.getLongitude()
            java.lang.Double r12 = java.lang.Double.valueOf(r12)
            double r9 = r12.doubleValue()
            android.content.Context r2 = r11.f69556b
            java.lang.String r12 = com.p280ss.android.ugc.aweme.poi.utils.C35442b.m114473c(r2, r3, r5, r7, r9)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r11.mPoiDistance
            r2.setText(r12)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.mPoiDistance
            r12.setVisibility(r0)
            goto L_0x01d0
        L_0x01b2:
            java.lang.String r12 = r13.getCity()
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 == 0) goto L_0x01c2
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.mPoiDistance
            r12.setVisibility(r1)
            goto L_0x01d0
        L_0x01c2:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.mPoiDistance
            java.lang.String r2 = r13.getCity()
            r12.setText(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.mPoiDistance
            r12.setVisibility(r0)
        L_0x01d0:
            java.lang.String r12 = r13.getBusinessAreaName()
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x01f3
            android.content.Context r12 = r11.f69556b
            java.lang.String r2 = r13.getBusinessAreaName()
            java.util.List r3 = r13.getPositionInAddress()
            android.text.SpannableString r12 = com.p280ss.android.ugc.aweme.base.utils.C23472a.m77059a(r12, r2, r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r11.mPoiType
            r2.setText(r12)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.mPoiType
            r12.setVisibility(r0)
            goto L_0x01f8
        L_0x01f3:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.mPoiType
            r12.setVisibility(r1)
        L_0x01f8:
            java.lang.String r12 = r13.getPoiVoucher()
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x0208
            r13.getVoucherReleaseAreas()
            com.p280ss.android.ugc.aweme.feed.C28290d.m93043d()
        L_0x0208:
            android.view.ViewGroup r12 = r11.mPoiCouponContainer
            r12.setVisibility(r1)
            boolean r12 = r13.isPoiSpuOverDate()
            if (r12 == 0) goto L_0x0280
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.mPoiName
            android.content.Context r13 = r11.f69556b
            android.content.res.Resources r13 = r13.getResources()
            r0 = 2131099690(0x7f06002a, float:1.781174E38)
            int r13 = r13.getColor(r0)
            r12.setTextColor(r13)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.mPoiPerPrice
            android.content.Context r13 = r11.f69556b
            android.content.res.Resources r13 = r13.getResources()
            int r13 = r13.getColor(r0)
            r12.setTextColor(r13)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.mPoiRankDesc
            android.content.Context r13 = r11.f69556b
            android.content.res.Resources r13 = r13.getResources()
            int r13 = r13.getColor(r0)
            r12.setTextColor(r13)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.mPoiOption
            android.content.Context r13 = r11.f69556b
            android.content.res.Resources r13 = r13.getResources()
            int r13 = r13.getColor(r0)
            r12.setTextColor(r13)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.mPoiType
            android.content.Context r13 = r11.f69556b
            android.content.res.Resources r13 = r13.getResources()
            int r13 = r13.getColor(r0)
            r12.setTextColor(r13)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.mPoiDistance
            android.content.Context r13 = r11.f69556b
            android.content.res.Resources r13 = r13.getResources()
            int r13 = r13.getColor(r0)
            r12.setTextColor(r13)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.mPoiCouponDesc
            android.content.Context r13 = r11.f69556b
            android.content.res.Resources r13 = r13.getResources()
            int r13 = r13.getColor(r0)
            r12.setTextColor(r13)
            return
        L_0x0280:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.mPoiName
            android.content.Context r13 = r11.f69556b
            android.content.res.Resources r13 = r13.getResources()
            r0 = 2131101080(0x7f060598, float:1.781456E38)
            int r13 = r13.getColor(r0)
            r12.setTextColor(r13)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.mPoiPerPrice
            android.content.Context r13 = r11.f69556b
            android.content.res.Resources r13 = r13.getResources()
            r0 = 2131101084(0x7f06059c, float:1.7814568E38)
            int r13 = r13.getColor(r0)
            r12.setTextColor(r13)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.mPoiRankDesc
            android.content.Context r13 = r11.f69556b
            android.content.res.Resources r13 = r13.getResources()
            int r13 = r13.getColor(r0)
            r12.setTextColor(r13)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.mPoiOption
            android.content.Context r13 = r11.f69556b
            android.content.res.Resources r13 = r13.getResources()
            int r13 = r13.getColor(r0)
            r12.setTextColor(r13)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.mPoiType
            android.content.Context r13 = r11.f69556b
            android.content.res.Resources r13 = r13.getResources()
            int r13 = r13.getColor(r0)
            r12.setTextColor(r13)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.mPoiDistance
            android.content.Context r13 = r11.f69556b
            android.content.res.Resources r13 = r13.getResources()
            int r13 = r13.getColor(r0)
            r12.setTextColor(r13)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.mPoiCouponDesc
            android.content.Context r13 = r11.f69556b
            android.content.res.Resources r13 = r13.getResources()
            int r13 = r13.getColor(r0)
            r12.setTextColor(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.adapter.PoiItemViewHolder.mo67995a(int, com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct):void");
    }
}
