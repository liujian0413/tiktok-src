package com.p280ss.android.ugc.aweme.commercialize.link.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.drawee.generic.C13438a;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.commercialize.model.LinkData;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.video.I18nStrongLinkContent */
public class I18nStrongLinkContent extends RelativeLayout implements C24814k {

    /* renamed from: a */
    private RemoteImageView f65317a;

    /* renamed from: b */
    private ImageView f65318b;

    /* renamed from: c */
    private C24815l f65319c;

    /* renamed from: c */
    public final View mo64859c() {
        return this;
    }

    /* renamed from: b */
    public final void mo64858b() {
        if (this.f65319c != null) {
            this.f65319c.mo64613d();
        }
    }

    /* renamed from: a */
    public final void mo64855a() {
        if (this.f65319c != null) {
            this.f65319c.mo64610a();
        }
    }

    public void setLinkTagCallBack(C24815l lVar) {
        this.f65319c = lVar;
    }

    public I18nStrongLinkContent(Context context) {
        this(context, null, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo64856a(View view) {
        if (this.f65319c != null) {
            this.f65319c.mo64611b();
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m81403a(CommerceTagLayout commerceTagLayout, C24815l lVar) {
        commerceTagLayout.setVisibility(8);
        commerceTagLayout.setAlpha(1.0f);
        lVar.mo64612c();
    }

    public I18nStrongLinkContent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.a78, this, true);
        this.f65317a = (RemoteImageView) findViewById(R.id.bmr);
        this.f65318b = (ImageView) findViewById(R.id.bms);
        setBackgroundResource(R.drawable.o1);
        this.f65317a.setOnClickListener(new C24808e(this));
    }

    /* renamed from: a */
    public final void mo64857a(LinkData linkData, C24815l lVar, CommerceTagLayout commerceTagLayout) {
        this.f65319c = lVar;
        ((C13438a) this.f65317a.getHierarchy()).mo32902c((int) R.color.a6k);
        if (linkData.getImageList() == null || linkData.getImageList().size() <= 0) {
            commerceTagLayout.setVisibility(8);
            return;
        }
        UrlModel urlModel = (UrlModel) linkData.getImageList().get(0);
        C23323e.m76524b(this.f65317a, urlModel);
        setLayoutParams(new LayoutParams(C23486n.m77122a((double) (urlModel.getWidth() / 2)), C23486n.m77122a((double) (urlModel.getHeight() / 2))));
        if (linkData.showCloseTips) {
            this.f65318b.setVisibility(0);
            this.f65318b.setOnClickListener(new C24809f(commerceTagLayout, lVar));
            return;
        }
        this.f65318b.setVisibility(8);
    }
}
