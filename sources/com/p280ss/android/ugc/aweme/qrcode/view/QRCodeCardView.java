package com.p280ss.android.ugc.aweme.qrcode.view;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.common.references.C13326a;
import com.facebook.datasource.C13346c;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.controller.C13400c;
import com.facebook.drawee.controller.C13401d;
import com.facebook.imagepipeline.p720g.C13645c;
import com.facebook.imagepipeline.p720g.C13648f;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.C23323e.C23328a;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.qrcode.QRCodeParams;
import com.p280ss.android.ugc.aweme.qrcode.model.C37079a;
import com.p280ss.android.ugc.aweme.qrcode.model.C37080b;
import com.p280ss.android.ugc.aweme.qrcode.p1496b.C37022a;
import com.p280ss.android.ugc.aweme.qrcode.p1496b.C37031e;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.qrcode.view.QRCodeCardView */
public abstract class QRCodeCardView extends LinearLayout implements C37022a {

    /* renamed from: a */
    protected C37031e f97136a;

    /* renamed from: b */
    protected RemoteImageView f97137b;

    /* renamed from: c */
    protected C37120a f97138c;

    /* renamed from: d */
    protected QRCodeParams f97139d;

    /* renamed from: e */
    protected boolean f97140e;

    /* renamed from: f */
    public boolean f97141f;

    /* renamed from: g */
    protected C13400c<C13648f> f97142g;

    /* renamed from: com.ss.android.ugc.aweme.qrcode.view.QRCodeCardView$a */
    public interface C37120a {
        /* renamed from: a */
        void mo93545a();

        /* renamed from: b */
        void mo93546b();

        /* renamed from: c */
        void mo93547c();
    }

    public abstract void setData(String str);

    public abstract void setQRCodeCardSubtitleColor(int i);

    public abstract void setQRCodeCardTitleColor(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C37080b mo93581a() {
        return new C37080b();
    }

    public View getQRCodeCardBottom() {
        return findViewById(R.id.cmk);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo93586c() {
        if (this.f97138c != null) {
            this.f97138c.mo93546b();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f97136a.mo86692c();
        this.f97138c = null;
    }

    public void setOnBindQrCodeListener(C37120a aVar) {
        this.f97138c = aVar;
    }

    public void setData(QRCodeParams qRCodeParams) {
        this.f97139d = qRCodeParams;
        setData(qRCodeParams.objectId);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo93548a(Context context) {
        this.f97136a = new C37031e(mo93581a(), this);
        this.f97142g = new C13400c<C13648f>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
                QRCodeCardView.this.f97141f = true;
            }
        };
    }

    /* renamed from: a */
    public static String m119316a(UrlModel urlModel) {
        if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty()) {
            return "";
        }
        return (String) urlModel.getUrlList().get(0);
    }

    /* renamed from: b */
    public final void mo93585b(final C37079a aVar) {
        if (aVar != null) {
            String a = m119316a(aVar.f97032a);
            if (C23323e.m76518a(Uri.parse(a))) {
                this.f97137b.setController(((C13382e) ((C13382e) C13380c.m39166a().mo32713b(Uri.parse(a)).mo32729b(this.f97137b.getController())).mo32743a((C13401d<? super INFO>) this.f97142g)).mo32730f());
                if (!this.f97136a.mo93475a()) {
                    this.f97136a.mo93474a(a);
                }
                if (this.f97138c != null) {
                    this.f97138c.mo93545a();
                }
            } else {
                C23323e.m76502a(aVar.f97032a, (C23328a) new C23328a() {
                    /* renamed from: a */
                    public final void mo60610a(Exception exc) {
                        QRCodeCardView.this.mo93586c();
                    }

                    /* renamed from: a */
                    public final void mo60609a(C13346c<C13326a<C13645c>> cVar) {
                        QRCodeCardView.this.f97137b.setController(((C13382e) ((C13382e) C13380c.m39166a().mo32713b(Uri.parse(QRCodeCardView.m119316a(aVar.f97032a))).mo32729b(QRCodeCardView.this.f97137b.getController())).mo32743a((C13401d<? super INFO>) QRCodeCardView.this.f97142g)).mo32730f());
                        if (QRCodeCardView.this.f97138c != null) {
                            QRCodeCardView.this.f97138c.mo93545a();
                        }
                        QRCodeCardView.this.f97136a.mo93474a(QRCodeCardView.m119316a(aVar.f97032a));
                    }
                });
            }
        }
    }

    public QRCodeCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
