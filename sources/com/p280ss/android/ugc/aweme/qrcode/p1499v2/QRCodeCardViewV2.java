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

/* renamed from: com.ss.android.ugc.aweme.qrcode.v2.QRCodeCardViewV2 */
public class QRCodeCardViewV2 extends QRCodeCardView {

    /* renamed from: h */
    private Context f97062h;

    /* renamed from: i */
    private DmtTextView f97063i;

    /* renamed from: j */
    private DmtTextView f97064j;

    /* renamed from: k */
    private DmtTextView f97065k;

    /* renamed from: l */
    private View f97066l;

    /* renamed from: m */
    private ImageView f97067m;

    /* renamed from: n */
    private ImageView f97068n;

    /* renamed from: o */
    private C37079a f97069o;

    public C37079a getQrCodeInfo() {
        return this.f97069o;
    }

    public void setData(String str) {
    }

    public void setQRCodeCardSubtitleColor(int i) {
    }

    public void setQRCodeCardTitleColor(int i) {
    }

    public QRCodeCardViewV2(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo93457a(C37079a aVar) {
        this.f97069o = aVar;
        mo93585b(aVar);
    }

    /* renamed from: a */
    public void mo93458a(Exception exc) {
        C22814a.m75244a(this.f97062h, (Throwable) exc);
        mo93586c();
    }

    public void setData(QRCodeParams qRCodeParams) {
        super.setData(qRCodeParams);
        this.f97136a.mo93473a(qRCodeParams.type, qRCodeParams.objectId);
        this.f97063i.setText(C37109b.m119307a(this.f97062h, qRCodeParams));
        this.f97064j.setText(C37109b.m119308b(this.f97062h, qRCodeParams));
        this.f97065k.setText(C37109b.m119309c(this.f97062h, qRCodeParams));
        this.f97068n.setImageResource(C37109b.m119306a(qRCodeParams));
    }

    /* renamed from: a */
    public final void mo93548a(Context context) {
        super.mo93548a(context);
        this.f97062h = context;
        LayoutInflater.from(context).inflate(R.layout.b40, this, true);
        this.f97066l = findViewById(R.id.cmh);
        this.f97068n = (ImageView) findViewById(R.id.tb);
        this.f97137b = (RemoteImageView) findViewById(R.id.cmg);
        this.f97063i = (DmtTextView) findViewById(R.id.title);
        this.f97064j = (DmtTextView) findViewById(R.id.a7e);
        this.f97065k = (DmtTextView) findViewById(R.id.clj);
        this.f97067m = (ImageView) findViewById(R.id.bvs);
        if (!C6399b.m19944t()) {
            this.f97067m.setImageResource(R.drawable.b8o);
        }
    }

    public QRCodeCardViewV2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public QRCodeCardViewV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo93548a(context);
    }
}
