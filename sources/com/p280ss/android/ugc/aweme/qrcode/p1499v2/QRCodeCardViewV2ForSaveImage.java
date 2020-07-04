package com.p280ss.android.ugc.aweme.qrcode.p1499v2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.qrcode.QRCodeParams;
import com.p280ss.android.ugc.aweme.qrcode.model.C37079a;
import com.p280ss.android.ugc.aweme.qrcode.view.QRCodeCardView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.qrcode.v2.QRCodeCardViewV2ForSaveImage */
public class QRCodeCardViewV2ForSaveImage extends QRCodeCardView {

    /* renamed from: h */
    private Context f97070h;

    /* renamed from: i */
    private DmtTextView f97071i;

    /* renamed from: j */
    private DmtTextView f97072j;

    /* renamed from: k */
    private DmtTextView f97073k;

    /* renamed from: l */
    private View f97074l;

    /* renamed from: m */
    private ImageView f97075m;

    /* renamed from: n */
    private ImageView f97076n;

    public void setData(String str) {
    }

    public void setQRCodeCardSubtitleColor(int i) {
    }

    public void setQRCodeCardTitleColor(int i) {
    }

    /* renamed from: a */
    public final void mo93457a(C37079a aVar) {
        mo93585b(aVar);
    }

    public QRCodeCardViewV2ForSaveImage(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo93458a(Exception exc) {
        C22814a.m75244a(this.f97070h, (Throwable) exc);
        mo93586c();
    }

    public void setData(QRCodeParams qRCodeParams) {
        super.setData(qRCodeParams);
        this.f97136a.mo93473a(qRCodeParams.type, qRCodeParams.objectId);
        this.f97071i.setText(C37109b.m119307a(this.f97070h, qRCodeParams));
        this.f97072j.setText(C37109b.m119308b(this.f97070h, qRCodeParams));
        this.f97073k.setText(C37109b.m119310d(this.f97070h, qRCodeParams));
        this.f97076n.setImageResource(C37109b.m119306a(qRCodeParams));
    }

    public void setParams(QRCodeParams qRCodeParams) {
        this.f97139d = qRCodeParams;
        this.f97071i.setText(C37109b.m119307a(this.f97070h, qRCodeParams));
        this.f97072j.setText(C37109b.m119308b(this.f97070h, qRCodeParams));
        this.f97073k.setText(C37109b.m119310d(this.f97070h, qRCodeParams));
        this.f97076n.setImageResource(C37109b.m119306a(qRCodeParams));
    }

    /* renamed from: a */
    public final void mo93548a(Context context) {
        super.mo93548a(context);
        this.f97070h = context;
        LayoutInflater.from(context).inflate(R.layout.b41, this, true);
        this.f97074l = findViewById(R.id.cmh);
        this.f97076n = (ImageView) findViewById(R.id.tb);
        this.f97137b = (RemoteImageView) findViewById(R.id.cmg);
        this.f97071i = (DmtTextView) findViewById(R.id.title);
        this.f97072j = (DmtTextView) findViewById(R.id.a7e);
        this.f97073k = (DmtTextView) findViewById(R.id.clj);
        this.f97075m = (ImageView) findViewById(R.id.bvs);
        if (!C6399b.m19944t()) {
            this.f97075m.setImageResource(R.drawable.b8f);
        }
    }

    public QRCodeCardViewV2ForSaveImage(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public QRCodeCardViewV2ForSaveImage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo93548a(context);
    }
}
