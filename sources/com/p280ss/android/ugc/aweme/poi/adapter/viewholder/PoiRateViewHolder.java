package com.p280ss.android.ugc.aweme.poi.adapter.viewholder;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiRateViewHolder */
public final class PoiRateViewHolder extends C1293v {
    public PoiRateViewHolder(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x01eb, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo88831a(com.p280ss.android.ugc.aweme.poi.bean.C35070b r8, com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle r9) {
        /*
            r7 = this;
            java.lang.String r9 = "poiRate"
            kotlin.jvm.internal.C7573i.m23587b(r8, r9)
            com.ss.android.ugc.aweme.poi.rate.api.b r8 = r8.f91722a
            if (r8 == 0) goto L_0x01ec
            int r9 = r8.f92197c
            r0 = 2131300483(0x7f091083, float:1.8218997E38)
            r1 = 2131300484(0x7f091084, float:1.8218999E38)
            r2 = 1
            r3 = 0
            r4 = 8
            switch(r9) {
                case 1: goto L_0x00c1;
                case 2: goto L_0x0044;
                default: goto L_0x0018;
            }
        L_0x0018:
            android.view.View r8 = r7.itemView
            java.lang.String r9 = "itemView"
            kotlin.jvm.internal.C7573i.m23582a(r8, r9)
            android.view.View r8 = r8.findViewById(r1)
            android.widget.RelativeLayout r8 = (android.widget.RelativeLayout) r8
            java.lang.String r9 = "itemView.poiRateHeader"
            kotlin.jvm.internal.C7573i.m23582a(r8, r9)
            r8.setVisibility(r4)
            android.view.View r8 = r7.itemView
            java.lang.String r9 = "itemView"
            kotlin.jvm.internal.C7573i.m23582a(r8, r9)
            android.view.View r8 = r8.findViewById(r0)
            android.widget.RelativeLayout r8 = (android.widget.RelativeLayout) r8
            java.lang.String r9 = "itemView.poiRateContent"
            kotlin.jvm.internal.C7573i.m23582a(r8, r9)
            r8.setVisibility(r4)
            goto L_0x01eb
        L_0x0044:
            android.view.View r9 = r7.itemView
            java.lang.String r5 = "itemView"
            kotlin.jvm.internal.C7573i.m23582a(r9, r5)
            android.view.View r9 = r9.findViewById(r1)
            android.widget.RelativeLayout r9 = (android.widget.RelativeLayout) r9
            java.lang.String r1 = "itemView.poiRateHeader"
            kotlin.jvm.internal.C7573i.m23582a(r9, r1)
            r9.setVisibility(r3)
            android.view.View r9 = r7.itemView
            java.lang.String r1 = "itemView"
            kotlin.jvm.internal.C7573i.m23582a(r9, r1)
            android.view.View r9 = r9.findViewById(r0)
            android.widget.RelativeLayout r9 = (android.widget.RelativeLayout) r9
            java.lang.String r0 = "itemView.poiRateContent"
            kotlin.jvm.internal.C7573i.m23582a(r9, r0)
            r9.setVisibility(r4)
            int r8 = r8.f92196b
            android.view.View r9 = r7.itemView
            java.lang.String r0 = "itemView"
            kotlin.jvm.internal.C7573i.m23582a(r9, r0)
            r0 = 2131297369(0x7f090459, float:1.821268E38)
            android.view.View r9 = r9.findViewById(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r9 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r9
            java.lang.String r0 = "itemView.count"
            kotlin.jvm.internal.C7573i.m23582a(r9, r0)
            android.view.View r0 = r7.itemView
            java.lang.String r1 = "itemView"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "itemView.context"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131825642(0x7f1113ea, float:1.9284146E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = "itemView.context.resourc….string.poi_rate_novideo)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r1[r3] = r8
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r1, r2)
            java.lang.String r8 = com.C1642a.m8034a(r0, r8)
            java.lang.String r0 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.C7573i.m23582a(r8, r0)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r9.setText(r8)
            goto L_0x01ec
        L_0x00c1:
            android.view.View r9 = r7.itemView
            java.lang.String r5 = "itemView"
            kotlin.jvm.internal.C7573i.m23582a(r9, r5)
            android.view.View r9 = r9.findViewById(r1)
            android.widget.RelativeLayout r9 = (android.widget.RelativeLayout) r9
            java.lang.String r1 = "itemView.poiRateHeader"
            kotlin.jvm.internal.C7573i.m23582a(r9, r1)
            r9.setVisibility(r4)
            android.view.View r9 = r7.itemView
            java.lang.String r1 = "itemView"
            kotlin.jvm.internal.C7573i.m23582a(r9, r1)
            android.view.View r9 = r9.findViewById(r0)
            android.widget.RelativeLayout r9 = (android.widget.RelativeLayout) r9
            java.lang.String r0 = "itemView.poiRateContent"
            kotlin.jvm.internal.C7573i.m23582a(r9, r0)
            r9.setVisibility(r3)
            com.ss.android.ugc.aweme.poi.rate.api.c r8 = r8.f92195a
            if (r8 == 0) goto L_0x01ec
            android.view.View r9 = r7.itemView
            java.lang.String r0 = "itemView"
            kotlin.jvm.internal.C7573i.m23582a(r9, r0)
            r0 = 2131296592(0x7f090150, float:1.8211105E38)
            android.view.View r9 = r9.findViewById(r0)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r9 = (com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView) r9
            com.ss.android.ugc.aweme.profile.model.User r0 = r8.f92201d
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getAvatarThumb()
            com.p280ss.android.ugc.aweme.base.C23323e.m76524b(r9, r0)
            android.view.View r9 = r7.itemView
            java.lang.String r0 = "itemView"
            kotlin.jvm.internal.C7573i.m23582a(r9, r0)
            r0 = 2131303038(0x7f091a7e, float:1.822418E38)
            android.view.View r9 = r9.findViewById(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r9 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r9
            java.lang.String r0 = "itemView.userName"
            kotlin.jvm.internal.C7573i.m23582a(r9, r0)
            android.view.View r0 = r7.itemView
            java.lang.String r1 = "itemView"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "itemView.context"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131823114(0x7f110a0a, float:1.9279019E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = "itemView.context.resourc…ring(R.string.feed_title)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.ss.android.ugc.aweme.profile.model.User r5 = r8.f92201d
            java.lang.String r5 = r5.getNickname()
            r1[r3] = r5
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.lang.String r0 = com.C1642a.m8034a(r0, r1)
            java.lang.String r1 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.setText(r0)
            android.view.View r9 = r7.itemView
            java.lang.String r0 = "itemView"
            kotlin.jvm.internal.C7573i.m23582a(r9, r0)
            r0 = 2131301731(0x7f091563, float:1.8221528E38)
            android.view.View r9 = r9.findViewById(r0)
            com.ss.android.ugc.aweme.poi.widget.RatingBar r9 = (com.p280ss.android.ugc.aweme.poi.widget.RatingBar) r9
            java.lang.String r0 = r8.f92199b
            float r0 = java.lang.Float.parseFloat(r0)
            r9.setStar(r0)
            android.view.View r9 = r7.itemView
            java.lang.String r0 = "itemView"
            kotlin.jvm.internal.C7573i.m23582a(r9, r0)
            r0 = 2131297477(0x7f0904c5, float:1.82129E38)
            android.view.View r9 = r9.findViewById(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r9 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r9
            java.lang.String r0 = "itemView.dateText"
            kotlin.jvm.internal.C7573i.m23582a(r9, r0)
            long r0 = r8.f92200c
            r5 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r5
            java.lang.String r0 = com.p280ss.android.ugc.aweme.poi.utils.C35462r.m114551a(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.setText(r0)
            com.ss.android.ugc.aweme.poi.rate.a.a r8 = r8.f92203f
            if (r8 == 0) goto L_0x01ec
            java.lang.String r9 = r8.f92175b
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            r0 = 2131301708(0x7f09154c, float:1.8221482E38)
            if (r9 == 0) goto L_0x01bd
            android.view.View r8 = r7.itemView
            java.lang.String r9 = "itemView"
            kotlin.jvm.internal.C7573i.m23582a(r8, r9)
            android.view.View r8 = r8.findViewById(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r8
            java.lang.String r9 = "itemView.spuName"
            kotlin.jvm.internal.C7573i.m23582a(r8, r9)
            r8.setVisibility(r4)
            goto L_0x01ec
        L_0x01bd:
            android.view.View r9 = r7.itemView
            java.lang.String r1 = "itemView"
            kotlin.jvm.internal.C7573i.m23582a(r9, r1)
            android.view.View r9 = r9.findViewById(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r9 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r9
            java.lang.String r1 = "itemView.spuName"
            kotlin.jvm.internal.C7573i.m23582a(r9, r1)
            r9.setVisibility(r3)
            android.view.View r9 = r7.itemView
            java.lang.String r1 = "itemView"
            kotlin.jvm.internal.C7573i.m23582a(r9, r1)
            android.view.View r9 = r9.findViewById(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r9 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r9
            java.lang.String r0 = "itemView.spuName"
            kotlin.jvm.internal.C7573i.m23582a(r9, r0)
            java.lang.String r8 = r8.f92175b
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r9.setText(r8)
        L_0x01eb:
            return
        L_0x01ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.poi.adapter.viewholder.PoiRateViewHolder.mo88831a(com.ss.android.ugc.aweme.poi.bean.b, com.ss.android.ugc.aweme.poi.PoiSimpleBundle):void");
    }
}
