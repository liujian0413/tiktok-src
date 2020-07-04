package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.ies.dmt.p262ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C40707a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1611d.C40723e;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1612e.C40750c;
import com.p280ss.android.ugc.aweme.sticker.C41850e;
import com.p280ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.e */
public final class C40781e extends C40769a {

    /* renamed from: i */
    private View f106040i;

    /* renamed from: j */
    private final C40750c f106041j;

    /* renamed from: c */
    public final int mo100902c() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo101013g() {
        this.f106041j.mo100976a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final View mo101012f() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        LinearLayout linearLayout = new LinearLayout(this.f106017f);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        DmtTextView dmtTextView = new DmtTextView(this.f106017f);
        dmtTextView.setTextColor(this.f106017f.getResources().getColor(R.color.a5d));
        dmtTextView.setTextSize(13.0f);
        dmtTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        dmtTextView.setMaxLines(1);
        dmtTextView.setGravity(16);
        dmtTextView.setText(this.f106017f.getString(R.string.dl5));
        TextPaint paint = dmtTextView.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        AutoRTLImageView autoRTLImageView = new AutoRTLImageView(this.f106017f);
        autoRTLImageView.setImageResource(R.drawable.bd2);
        linearLayout.addView(dmtTextView);
        linearLayout.addView(autoRTLImageView);
        return linearLayout;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00bb, code lost:
        if (r4 == null) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x010a, code lost:
        if (r4 == null) goto L_0x010c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x013c  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101011e() {
        /*
            r9 = this;
            com.ss.android.ugc.aweme.sticker.e r0 = r9.f106019h
            r1 = 0
            if (r0 == 0) goto L_0x0008
            java.lang.String r0 = r0.f108853f
            goto L_0x0009
        L_0x0008:
            r0 = r1
        L_0x0009:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x0016
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            r0 = 0
            goto L_0x0017
        L_0x0016:
            r0 = 1
        L_0x0017:
            if (r0 != 0) goto L_0x005d
            android.content.Context r2 = r9.f106017f
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c r0 = r9.f106041j
            com.ss.android.ugc.aweme.poi.model.PoiStruct r0 = r0.f105961e
            java.lang.String r3 = r0.getPoiId()
            com.ss.android.ugc.aweme.sticker.e r0 = r9.f106019h
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = r0.f108853f
            r4 = r0
            goto L_0x002c
        L_0x002b:
            r4 = r1
        L_0x002c:
            com.ss.android.ugc.aweme.sticker.e r0 = r9.f106019h
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = r0.f108854g
            r5 = r0
            goto L_0x0035
        L_0x0034:
            r5 = r1
        L_0x0035:
            com.ss.android.ugc.aweme.sticker.e r0 = r9.f106019h
            if (r0 == 0) goto L_0x0040
            long r6 = r0.f108855h
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            goto L_0x0041
        L_0x0040:
            r0 = r1
        L_0x0041:
            java.lang.String r6 = java.lang.String.valueOf(r0)
            com.ss.android.ugc.aweme.sticker.e r0 = r9.f106019h
            if (r0 == 0) goto L_0x0050
            long r7 = r0.f108856i
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            goto L_0x0051
        L_0x0050:
            r0 = r1
        L_0x0051:
            if (r0 != 0) goto L_0x0056
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0056:
            long r7 = r0.longValue()
            com.p280ss.android.ugc.aweme.commercialize.log.C24932ae.m81788b(r2, r3, r4, r5, r6, r7)
        L_0x005d:
            java.lang.String r0 = "poi_prop_click"
            com.ss.android.ugc.aweme.app.g.d r2 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r3 = "group_id"
            com.ss.android.ugc.aweme.sticker.e r4 = r9.f106019h
            if (r4 == 0) goto L_0x0070
            com.ss.android.ugc.aweme.sticker.d r4 = r4.f108861n
            if (r4 == 0) goto L_0x0070
            java.lang.String r4 = r4.f108844d
            goto L_0x0071
        L_0x0070:
            r4 = r1
        L_0x0071:
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
            java.lang.String r3 = "author_id"
            com.ss.android.ugc.aweme.sticker.e r4 = r9.f106019h
            if (r4 == 0) goto L_0x0082
            com.ss.android.ugc.aweme.sticker.d r4 = r4.f108861n
            if (r4 == 0) goto L_0x0082
            java.lang.String r4 = r4.f108843c
            goto L_0x0083
        L_0x0082:
            r4 = r1
        L_0x0083:
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
            java.lang.String r3 = "log_pb"
            com.ss.android.ugc.aweme.sticker.e r4 = r9.f106019h
            if (r4 == 0) goto L_0x0094
            com.ss.android.ugc.aweme.sticker.d r4 = r4.f108861n
            if (r4 == 0) goto L_0x0094
            java.lang.String r4 = r4.f108845e
            goto L_0x0095
        L_0x0094:
            r4 = r1
        L_0x0095:
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
            java.lang.String r3 = "enter_from"
            com.ss.android.ugc.aweme.sticker.e r4 = r9.f106019h
            if (r4 == 0) goto L_0x00a6
            com.ss.android.ugc.aweme.sticker.d r4 = r4.f108861n
            if (r4 == 0) goto L_0x00a6
            java.lang.String r4 = r4.f108842b
            goto L_0x00a7
        L_0x00a6:
            r4 = r1
        L_0x00a7:
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
            java.lang.String r3 = "prop_id"
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r4 = r9.mo100903d()
            com.ss.android.ugc.aweme.sticker.data.StickerAttrStruct r4 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C40707a.m130167c(r4)
            if (r4 == 0) goto L_0x00bd
            java.lang.String r4 = r4.getPoiStickerId()
            if (r4 != 0) goto L_0x00bf
        L_0x00bd:
            java.lang.String r4 = ""
        L_0x00bf:
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
            java.lang.String r3 = "poi_id"
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c r4 = r9.f106041j
            com.ss.android.ugc.aweme.poi.model.PoiStruct r4 = r4.f105961e
            java.lang.String r4 = r4.getPoiId()
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
            java.lang.String r3 = "poi_type"
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c r4 = r9.f106041j
            com.ss.android.ugc.aweme.poi.model.PoiStruct r4 = r4.f105961e
            long r4 = r4.poiType
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59971a(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r0, r2)
            java.lang.String r0 = "poi_sticker_toast_show"
            com.ss.android.ugc.aweme.app.g.d r2 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r3 = "enter_from"
            com.ss.android.ugc.aweme.sticker.e r4 = r9.f106019h
            if (r4 == 0) goto L_0x00f5
            com.ss.android.ugc.aweme.sticker.d r4 = r4.f108861n
            if (r4 == 0) goto L_0x00f5
            java.lang.String r4 = r4.f108842b
            goto L_0x00f6
        L_0x00f5:
            r4 = r1
        L_0x00f6:
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
            java.lang.String r3 = "prop_id"
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r4 = r9.mo100903d()
            com.ss.android.ugc.aweme.sticker.data.StickerAttrStruct r4 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C40707a.m130167c(r4)
            if (r4 == 0) goto L_0x010c
            java.lang.String r4 = r4.getPoiStickerId()
            if (r4 != 0) goto L_0x010e
        L_0x010c:
            java.lang.String r4 = ""
        L_0x010e:
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
            java.lang.String r3 = "group_id"
            com.ss.android.ugc.aweme.sticker.e r4 = r9.f106019h
            if (r4 == 0) goto L_0x011f
            com.ss.android.ugc.aweme.sticker.d r4 = r4.f108861n
            if (r4 == 0) goto L_0x011f
            java.lang.String r4 = r4.f108844d
            goto L_0x0120
        L_0x011f:
            r4 = r1
        L_0x0120:
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
            java.lang.String r3 = "log_pb"
            com.ss.android.ugc.aweme.sticker.e r4 = r9.f106019h
            if (r4 == 0) goto L_0x0131
            com.ss.android.ugc.aweme.sticker.d r4 = r4.f108861n
            if (r4 == 0) goto L_0x0131
            java.lang.String r4 = r4.f108845e
            goto L_0x0132
        L_0x0131:
            r4 = r1
        L_0x0132:
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
            java.lang.String r3 = "author_id"
            com.ss.android.ugc.aweme.sticker.e r4 = r9.f106019h
            if (r4 == 0) goto L_0x0142
            com.ss.android.ugc.aweme.sticker.d r4 = r4.f108861n
            if (r4 == 0) goto L_0x0142
            java.lang.String r1 = r4.f108843c
        L_0x0142:
            com.ss.android.ugc.aweme.app.g.d r1 = r2.mo59973a(r3, r1)
            java.lang.String r2 = "poi_id"
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c r3 = r9.f106041j
            com.ss.android.ugc.aweme.poi.model.PoiStruct r3 = r3.f105961e
            java.lang.String r3 = r3.getPoiId()
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40781e.mo101011e():void");
    }

    /* renamed from: a */
    public final void mo100893a(C41850e eVar) {
        C7573i.m23587b(eVar, "interactStickerParams");
        super.mo100893a(eVar);
        this.f106041j.mo100893a(eVar);
    }

    /* renamed from: a */
    public final View mo100896a(int i) {
        if (C40707a.m130163a(this.f106017f)) {
            if (this.f106040i == null) {
                this.f106040i = new C40782f(this.f106017f);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                View view = this.f106040i;
                if (view == null) {
                    C7573i.m23580a();
                }
                view.setLayoutParams(layoutParams);
                View view2 = this.f106040i;
                if (view2 != null) {
                    ((C40782f) view2).setPoints(this.f106041j.f105962f);
                    View view3 = this.f106040i;
                    if (view3 == null) {
                        C7573i.m23580a();
                    }
                    view3.postInvalidate();
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.PoiStickerFeedView");
                }
            }
            return this.f106040i;
        }
        if (this.f106040i == null) {
            this.f106040i = new FrameLayout(this.f106017f);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            View view4 = this.f106040i;
            if (view4 != null) {
                view4.setLayoutParams(layoutParams2);
            }
        }
        return this.f106040i;
    }

    /* renamed from: a */
    public final boolean mo100894a(long j, int i, float f, float f2) {
        return this.f106041j.mo100894a(j, i, f, f2);
    }

    public C40781e(int i, Context context, View view, InteractStickerStruct interactStickerStruct, C41850e eVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(view, "contentView");
        C7573i.m23587b(interactStickerStruct, "stickerStruct");
        super(i, context, view, interactStickerStruct, eVar);
        this.f106041j = new C40750c(context, this, interactStickerStruct, eVar);
    }

    /* renamed from: a */
    public final boolean mo100895a(long j, int i, float f, float f2, C40723e eVar) {
        C7573i.m23587b(eVar, "poiPopListener");
        return this.f106041j.mo100895a(j, i, f, f2, eVar);
    }
}
