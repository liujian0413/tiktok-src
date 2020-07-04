package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.facebook.drawee.generic.C13438a;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.CircleImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25386z;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.poi.widget.C35481c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C40707a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1611d.C40723e;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1611d.C40724f;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1612e.C40749b;
import com.p280ss.android.ugc.aweme.sticker.C41850e;
import com.p280ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.b */
public final class C40776b extends C40769a {

    /* renamed from: k */
    public static final C40778a f106028k = new C40778a(null);

    /* renamed from: i */
    public Handler f106029i;

    /* renamed from: j */
    public Runnable f106030j;

    /* renamed from: l */
    private View f106031l;

    /* renamed from: m */
    private final C40749b f106032m;

    /* renamed from: n */
    private final C40724f f106033n;

    /* renamed from: o */
    private final BusinessExtraData f106034o;

    /* renamed from: p */
    private final Aweme f106035p;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.b$a */
    public static final class C40778a {
        private C40778a() {
        }

        public /* synthetic */ C40778a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: c */
    public final int mo100902c() {
        return 2;
    }

    /* renamed from: a */
    public final void mo100897a() {
        super.mo100897a();
        Handler handler = this.f106029i;
        if (handler != null) {
            handler.post(this.f106030j);
        }
    }

    /* renamed from: b */
    public final void mo100898b() {
        super.mo100898b();
        Handler handler = this.f106029i;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: h */
    public final void mo101017h() {
        C40779c cVar = (C40779c) this.f106031l;
        if (cVar != null) {
            cVar.setPoints(m130326i());
        }
        View view = this.f106031l;
        if (view != null) {
            view.postInvalidate();
        }
    }

    /* renamed from: i */
    private final List<float[]> m130326i() {
        long j;
        C40724f fVar = this.f106033n;
        if (fVar != null) {
            j = fVar.mo71677ai();
        } else {
            j = 0;
        }
        List<NormalTrackTimeStamp> a = C40707a.m130161a(j, this.f106015d);
        if (a == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (a != null) {
            for (NormalTrackTimeStamp normalTrackTimeStamp : a) {
                if (normalTrackTimeStamp != null) {
                    RectF a2 = this.f106032m.mo100973a(normalTrackTimeStamp);
                    float[] fArr = {a2.left, a2.top, a2.right, a2.top, a2.left, a2.bottom, a2.right, a2.bottom};
                    Matrix matrix = new Matrix();
                    matrix.postRotate(normalTrackTimeStamp.getRotation(), ((fArr[2] - fArr[0]) / 2.0f) + fArr[0], ((fArr[5] - fArr[3]) / 2.0f) + fArr[3]);
                    matrix.mapPoints(fArr);
                    arrayList.add(fArr);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101011e() {
        /*
            r5 = this;
            java.lang.String r0 = "function_prop_click"
            com.ss.android.ugc.aweme.app.g.d r1 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r2 = "prop_id"
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r3 = r5.f106034o
            r4 = 0
            if (r3 == 0) goto L_0x0012
            java.lang.String r3 = r3.getStickerId()
            goto L_0x0013
        L_0x0012:
            r3 = r4
        L_0x0013:
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.lang.String r2 = "enter_from"
            com.ss.android.ugc.aweme.sticker.e r3 = r5.f106019h
            if (r3 == 0) goto L_0x0024
            com.ss.android.ugc.aweme.sticker.d r3 = r3.f108861n
            if (r3 == 0) goto L_0x0024
            java.lang.String r3 = r3.f108842b
            goto L_0x0025
        L_0x0024:
            r3 = r4
        L_0x0025:
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.lang.String r2 = "log_pb"
            com.ss.android.ugc.aweme.sticker.e r3 = r5.f106019h
            if (r3 == 0) goto L_0x0036
            com.ss.android.ugc.aweme.sticker.d r3 = r3.f108861n
            if (r3 == 0) goto L_0x0036
            java.lang.String r3 = r3.f108845e
            goto L_0x0037
        L_0x0036:
            r3 = r4
        L_0x0037:
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.lang.String r2 = "author_id"
            com.ss.android.ugc.aweme.sticker.e r3 = r5.f106019h
            if (r3 == 0) goto L_0x0048
            com.ss.android.ugc.aweme.sticker.d r3 = r3.f108861n
            if (r3 == 0) goto L_0x0048
            java.lang.String r3 = r3.f108843c
            goto L_0x0049
        L_0x0048:
            r3 = r4
        L_0x0049:
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.lang.String r2 = "group_id"
            com.ss.android.ugc.aweme.sticker.e r3 = r5.f106019h
            if (r3 == 0) goto L_0x005a
            com.ss.android.ugc.aweme.sticker.d r3 = r3.f108861n
            if (r3 == 0) goto L_0x005a
            java.lang.String r3 = r3.f108844d
            goto L_0x005b
        L_0x005a:
            r3 = r4
        L_0x005b:
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.lang.String r2 = "enter_method"
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r3 = r5.f106034o
            if (r3 == 0) goto L_0x006a
            java.lang.String r3 = r3.getSchemaUrlWebFirst()
            goto L_0x006b
        L_0x006a:
            r3 = r4
        L_0x006b:
            java.lang.String r3 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C40707a.m130159a(r3)
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.lang.String r2 = "url"
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r3 = r5.f106034o
            if (r3 == 0) goto L_0x007d
            java.lang.String r4 = r3.getSchemaUrlWebFirst()
        L_0x007d:
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r4)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r0, r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.f106035p
            if (r0 == 0) goto L_0x0099
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.f106035p
            boolean r0 = r0.isAd()
            if (r0 == 0) goto L_0x0099
            android.content.Context r0 = r5.f106017f
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.f106035p
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82097aJ(r0, r1)
        L_0x0099:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40776b.mo101011e():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final View mo101012f() {
        String str;
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        LinearLayout linearLayout = new LinearLayout(this.f106017f);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        CircleImageView circleImageView = new CircleImageView(this.f106017f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) C9738o.m28708b(this.f106017f, 32.0f), (int) C9738o.m28708b(this.f106017f, 32.0f));
        layoutParams2.setMargins(0, 0, (int) C9738o.m28708b(this.f106017f, 8.0f), 0);
        circleImageView.setLayoutParams(layoutParams2);
        ((C13438a) circleImageView.getHierarchy()).mo32898b((int) R.drawable.b6y);
        ((C13438a) circleImageView.getHierarchy()).mo32902c((int) R.drawable.b6y);
        RemoteImageView remoteImageView = circleImageView;
        BusinessExtraData businessExtraData = this.f106034o;
        String str2 = null;
        if (businessExtraData != null) {
            str = businessExtraData.getPopIcon();
        } else {
            str = null;
        }
        C23323e.m76514a(remoteImageView, str);
        DmtTextView dmtTextView = new DmtTextView(this.f106017f);
        dmtTextView.setTextColor(this.f106017f.getResources().getColor(R.color.az3));
        dmtTextView.setTextSize(13.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2);
        layoutParams3.weight = 1.0f;
        layoutParams3.topMargin = (int) C9738o.m28708b(this.f106017f, 1.0f);
        dmtTextView.setLayoutParams(layoutParams3);
        dmtTextView.setMaxLines(1);
        dmtTextView.setGravity(16);
        BusinessExtraData businessExtraData2 = this.f106034o;
        if (businessExtraData2 != null) {
            str2 = businessExtraData2.getPopText();
        }
        dmtTextView.setText(str2);
        TextPaint paint = dmtTextView.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        dmtTextView.setEllipsize(TruncateAt.END);
        AutoRTLImageView autoRTLImageView = new AutoRTLImageView(this.f106017f);
        autoRTLImageView.setImageResource(R.drawable.bd2);
        linearLayout.addView(circleImageView);
        linearLayout.addView(dmtTextView);
        linearLayout.addView(autoRTLImageView);
        return linearLayout;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x012b  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101013g() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r0 = r6.f106034o
            r1 = 0
            if (r0 == 0) goto L_0x000a
            java.lang.String r0 = r0.getStickerId()
            goto L_0x000b
        L_0x000a:
            r0 = r1
        L_0x000b:
            boolean r0 = com.p280ss.android.ugc.aweme.commercialize.utils.C25386z.m83539a(r0)
            if (r0 == 0) goto L_0x001f
            com.ss.android.ugc.aweme.commercialize.utils.z r0 = com.p280ss.android.ugc.aweme.commercialize.utils.C25386z.f66807a
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r1 = r6.f106034o
            com.ss.android.ugc.aweme.sticker.e r2 = r6.f106019h
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r6.f106035p
            android.content.Context r4 = r6.f106017f
            r0.mo65947a(r1, r2, r3, r4)
            return
        L_0x001f:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r0 = r6.f106034o
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = r0.getSchemaUrlOpenFirst()
            goto L_0x0029
        L_0x0028:
            r0 = r1
        L_0x0029:
            r2 = r0
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x00d9
            com.ss.android.ugc.aweme.miniapp_api.services.b r2 = com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b.m22380b()
            java.lang.String r3 = "MiniAppServiceProxy.inst()"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService r2 = r2.mo18647a()
            boolean r3 = com.p280ss.android.ugc.aweme.miniapp_api.C33447f.m108191d(r0)
            if (r3 == 0) goto L_0x0065
            com.ss.android.ugc.aweme.miniapp_api.model.params.b$a r3 = new com.ss.android.ugc.aweme.miniapp_api.model.params.b$a
            r3.<init>()
            com.ss.android.ugc.aweme.sticker.e r4 = r6.f106019h
            if (r4 == 0) goto L_0x0055
            com.ss.android.ugc.aweme.sticker.d r4 = r4.f108861n
            if (r4 == 0) goto L_0x0055
            java.lang.String r4 = r4.f108842b
            goto L_0x0056
        L_0x0055:
            r4 = r1
        L_0x0056:
            com.ss.android.ugc.aweme.miniapp_api.model.params.b$a r3 = r3.mo85791b(r4)
            com.ss.android.ugc.aweme.miniapp_api.model.params.b r3 = r3.mo85790a()
            android.content.Context r4 = r6.f106017f
            r2.openMiniApp(r4, r0, r3)
            goto L_0x00d9
        L_0x0065:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r2 = r6.f106034o
            if (r2 == 0) goto L_0x006e
            java.lang.String r2 = r2.getClickableOpenUrl()
            goto L_0x006f
        L_0x006e:
            r2 = r1
        L_0x006f:
            boolean r2 = com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23764b.m77913a(r2)
            r3 = 0
            if (r2 == 0) goto L_0x0086
            android.content.Context r2 = r6.f106017f
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r4 = r6.f106034o
            if (r4 == 0) goto L_0x0081
            java.lang.String r4 = r4.getClickableOpenUrl()
            goto L_0x0082
        L_0x0081:
            r4 = r1
        L_0x0082:
            boolean r3 = com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.m83463a(r2, r4, r3)
        L_0x0086:
            if (r3 != 0) goto L_0x00b8
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r2 = r6.f106034o
            if (r2 == 0) goto L_0x0091
            java.lang.String r2 = r2.getClickableWebUrl()
            goto L_0x0092
        L_0x0091:
            r2 = r1
        L_0x0092:
            boolean r2 = com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23764b.m77913a(r2)
            if (r2 == 0) goto L_0x00b8
            android.content.Context r0 = r6.f106017f
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r2 = r6.f106034o
            if (r2 == 0) goto L_0x00a3
            java.lang.String r2 = r2.getClickableWebUrl()
            goto L_0x00a4
        L_0x00a3:
            r2 = r1
        L_0x00a4:
            java.lang.String r3 = "commerce_sticker_view"
            java.lang.String r2 = m130325a(r2, r3)
            com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.m83459a(r0, r2, r1)
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r0 = r6.f106034o
            if (r0 == 0) goto L_0x00b6
            java.lang.String r0 = r0.getClickableWebUrl()
            goto L_0x00d9
        L_0x00b6:
            r0 = r1
            goto L_0x00d9
        L_0x00b8:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r2 = r6.f106034o
            if (r2 == 0) goto L_0x00c1
            java.lang.String r2 = r2.getInteractionUrl()
            goto L_0x00c2
        L_0x00c1:
            r2 = r1
        L_0x00c2:
            boolean r2 = kotlin.jvm.internal.C7573i.m23585a(r0, r2)
            if (r2 == 0) goto L_0x00d9
            com.ss.android.ugc.aweme.router.s r2 = com.p280ss.android.ugc.aweme.router.C7195s.m22438a()
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r3 = r6.f106034o
            if (r3 == 0) goto L_0x00d5
            java.lang.String r3 = r3.getInteractionUrl()
            goto L_0x00d6
        L_0x00d5:
            r3 = r1
        L_0x00d6:
            r2.mo18682a(r3)
        L_0x00d9:
            java.lang.String r2 = "function_prop_label_click"
            com.ss.android.ugc.aweme.app.g.d r3 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r4 = "prop_id"
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r5 = r6.f106034o
            if (r5 == 0) goto L_0x00ea
            java.lang.String r5 = r5.getStickerId()
            goto L_0x00eb
        L_0x00ea:
            r5 = r1
        L_0x00eb:
            com.ss.android.ugc.aweme.app.g.d r3 = r3.mo59973a(r4, r5)
            java.lang.String r4 = "enter_from"
            com.ss.android.ugc.aweme.sticker.e r5 = r6.f106019h
            if (r5 == 0) goto L_0x00fc
            com.ss.android.ugc.aweme.sticker.d r5 = r5.f108861n
            if (r5 == 0) goto L_0x00fc
            java.lang.String r5 = r5.f108842b
            goto L_0x00fd
        L_0x00fc:
            r5 = r1
        L_0x00fd:
            com.ss.android.ugc.aweme.app.g.d r3 = r3.mo59973a(r4, r5)
            java.lang.String r4 = "log_pb"
            com.ss.android.ugc.aweme.sticker.e r5 = r6.f106019h
            if (r5 == 0) goto L_0x010e
            com.ss.android.ugc.aweme.sticker.d r5 = r5.f108861n
            if (r5 == 0) goto L_0x010e
            java.lang.String r5 = r5.f108845e
            goto L_0x010f
        L_0x010e:
            r5 = r1
        L_0x010f:
            com.ss.android.ugc.aweme.app.g.d r3 = r3.mo59973a(r4, r5)
            java.lang.String r4 = "author_id"
            com.ss.android.ugc.aweme.sticker.e r5 = r6.f106019h
            if (r5 == 0) goto L_0x0120
            com.ss.android.ugc.aweme.sticker.d r5 = r5.f108861n
            if (r5 == 0) goto L_0x0120
            java.lang.String r5 = r5.f108843c
            goto L_0x0121
        L_0x0120:
            r5 = r1
        L_0x0121:
            com.ss.android.ugc.aweme.app.g.d r3 = r3.mo59973a(r4, r5)
            java.lang.String r4 = "group_id"
            com.ss.android.ugc.aweme.sticker.e r5 = r6.f106019h
            if (r5 == 0) goto L_0x0131
            com.ss.android.ugc.aweme.sticker.d r5 = r5.f108861n
            if (r5 == 0) goto L_0x0131
            java.lang.String r1 = r5.f108844d
        L_0x0131:
            com.ss.android.ugc.aweme.app.g.d r1 = r3.mo59973a(r4, r1)
            java.lang.String r3 = "enter_method"
            java.lang.String r4 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C40707a.m130159a(r0)
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r3, r4)
            java.lang.String r3 = "url"
            com.ss.android.ugc.aweme.app.g.d r0 = r1.mo59973a(r3, r0)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r2, r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f106035p
            if (r0 == 0) goto L_0x015f
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f106035p
            boolean r0 = r0.isAd()
            if (r0 == 0) goto L_0x015f
            android.content.Context r0 = r6.f106017f
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r6.f106035p
            java.lang.String r2 = "sticker"
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82204e(r0, r1, r2)
        L_0x015f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40776b.mo101013g():void");
    }

    /* renamed from: a */
    public final void mo101009a(C35481c cVar) {
        C7573i.m23587b(cVar, "popWindow");
        cVar.mo90250a((int) C9738o.m28708b(this.f106017f, 57.9f));
    }

    /* renamed from: b */
    public final void mo100899b(int i) {
        super.mo100899b(i);
        Handler handler = this.f106029i;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        C25386z.f66807a.mo65948b(this.f106017f, this.f106034o);
    }

    /* renamed from: a */
    public final View mo100896a(int i) {
        if (C40707a.m130163a(this.f106017f)) {
            if (this.f106031l == null) {
                this.f106031l = new C40779c(this.f106017f);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                View view = this.f106031l;
                if (view != null) {
                    view.setLayoutParams(layoutParams);
                }
            }
            return this.f106031l;
        }
        if (this.f106031l == null) {
            this.f106031l = new FrameLayout(this.f106017f);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            View view2 = this.f106031l;
            if (view2 != null) {
                view2.setLayoutParams(layoutParams2);
            }
        }
        return this.f106031l;
    }

    /* renamed from: a */
    public final void mo100893a(C41850e eVar) {
        C7573i.m23587b(eVar, "interactStickerParams");
        super.mo100893a(eVar);
        this.f106032m.mo100893a(eVar);
    }

    /* renamed from: a */
    private static String m130325a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            return Uri.parse(str).buildUpon().appendQueryParameter("commerce_enter_from", str2).build().toString();
        }
        return str;
    }

    /* renamed from: a */
    public final boolean mo100894a(long j, int i, float f, float f2) {
        return this.f106032m.mo100894a(j, i, f, f2);
    }

    /* renamed from: a */
    public final boolean mo100895a(long j, int i, float f, float f2, C40723e eVar) {
        C7573i.m23587b(eVar, "poiPopListener");
        return this.f106032m.mo100895a(j, i, f, f2, eVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C40776b(int r8, android.content.Context r9, android.view.View r10, com.p280ss.android.ugc.aweme.sticker.data.InteractStickerStruct r11, com.p280ss.android.ugc.aweme.sticker.C41850e r12, com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1611d.C40724f r13, com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r14, com.p280ss.android.ugc.aweme.feed.model.Aweme r15) {
        /*
            r7 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C7573i.m23587b(r9, r0)
            java.lang.String r0 = "contentView"
            kotlin.jvm.internal.C7573i.m23587b(r10, r0)
            java.lang.String r0 = "stickerStruct"
            kotlin.jvm.internal.C7573i.m23587b(r11, r0)
            r7.<init>(r8, r9, r10, r11, r12)
            r7.f106033n = r13
            r7.f106034o = r14
            r7.f106035p = r15
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.b r8 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.b
            r3 = r7
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a r3 = (com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40769a) r3
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r6 = r7.f106034o
            r1 = r8
            r2 = r9
            r4 = r11
            r5 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r7.f106032m = r8
            boolean r8 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C40707a.m130163a(r9)
            if (r8 == 0) goto L_0x0047
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.b$1 r8 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.b$1
            r8.<init>(r7)
            java.lang.Runnable r8 = (java.lang.Runnable) r8
            r7.f106030j = r8
            android.os.Handler r8 = new android.os.Handler
            r8.<init>()
            r7.f106029i = r8
            android.os.Handler r8 = r7.f106029i
            if (r8 == 0) goto L_0x0047
            java.lang.Runnable r10 = r7.f106030j
            r8.post(r10)
        L_0x0047:
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.f106035p
            if (r8 == 0) goto L_0x0058
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.f106035p
            boolean r8 = r8.isAd()
            if (r8 == 0) goto L_0x0058
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.f106035p
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82096aI(r9, r8)
        L_0x0058:
            java.lang.String r8 = "function_prop_show"
            com.ss.android.ugc.aweme.app.g.d r10 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r11 = "prop_id"
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r13 = r7.f106034o
            r14 = 0
            if (r13 == 0) goto L_0x006a
            java.lang.String r13 = r13.getStickerId()
            goto L_0x006b
        L_0x006a:
            r13 = r14
        L_0x006b:
            com.ss.android.ugc.aweme.app.g.d r10 = r10.mo59973a(r11, r13)
            java.lang.String r11 = "enter_from"
            if (r12 == 0) goto L_0x007a
            com.ss.android.ugc.aweme.sticker.d r13 = r12.f108861n
            if (r13 == 0) goto L_0x007a
            java.lang.String r13 = r13.f108842b
            goto L_0x007b
        L_0x007a:
            r13 = r14
        L_0x007b:
            com.ss.android.ugc.aweme.app.g.d r10 = r10.mo59973a(r11, r13)
            java.lang.String r11 = "log_pb"
            if (r12 == 0) goto L_0x008a
            com.ss.android.ugc.aweme.sticker.d r13 = r12.f108861n
            if (r13 == 0) goto L_0x008a
            java.lang.String r13 = r13.f108845e
            goto L_0x008b
        L_0x008a:
            r13 = r14
        L_0x008b:
            com.ss.android.ugc.aweme.app.g.d r10 = r10.mo59973a(r11, r13)
            java.lang.String r11 = "author_id"
            if (r12 == 0) goto L_0x009a
            com.ss.android.ugc.aweme.sticker.d r13 = r12.f108861n
            if (r13 == 0) goto L_0x009a
            java.lang.String r13 = r13.f108843c
            goto L_0x009b
        L_0x009a:
            r13 = r14
        L_0x009b:
            com.ss.android.ugc.aweme.app.g.d r10 = r10.mo59973a(r11, r13)
            java.lang.String r11 = "group_id"
            if (r12 == 0) goto L_0x00aa
            com.ss.android.ugc.aweme.sticker.d r12 = r12.f108861n
            if (r12 == 0) goto L_0x00aa
            java.lang.String r12 = r12.f108844d
            goto L_0x00ab
        L_0x00aa:
            r12 = r14
        L_0x00ab:
            com.ss.android.ugc.aweme.app.g.d r10 = r10.mo59973a(r11, r12)
            java.lang.String r11 = "enter_method"
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r12 = r7.f106034o
            if (r12 == 0) goto L_0x00ba
            java.lang.String r12 = r12.getSchemaUrlWebFirst()
            goto L_0x00bb
        L_0x00ba:
            r12 = r14
        L_0x00bb:
            java.lang.String r12 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C40707a.m130159a(r12)
            com.ss.android.ugc.aweme.app.g.d r10 = r10.mo59973a(r11, r12)
            java.lang.String r11 = "url"
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r12 = r7.f106034o
            if (r12 == 0) goto L_0x00cd
            java.lang.String r14 = r12.getSchemaUrlWebFirst()
        L_0x00cd:
            com.ss.android.ugc.aweme.app.g.d r10 = r10.mo59973a(r11, r14)
            java.util.Map<java.lang.String, java.lang.String> r10 = r10.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r8, r10)
            com.ss.android.ugc.aweme.commercialize.utils.z r8 = com.p280ss.android.ugc.aweme.commercialize.utils.C25386z.f66807a
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r10 = r7.f106034o
            r8.mo65946a(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40776b.<init>(int, android.content.Context, android.view.View, com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct, com.ss.android.ugc.aweme.sticker.e, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.f, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }
}
