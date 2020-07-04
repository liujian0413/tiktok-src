package com.p280ss.android.ugc.aweme.commercialize.link.video;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.drawee.generic.C13438a;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.commercialize.model.LinkData;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.video.StrongLinkContent */
public class StrongLinkContent extends RelativeLayout implements C24814k {

    /* renamed from: a */
    private RemoteImageView f65332a;

    /* renamed from: b */
    private TextView f65333b;

    /* renamed from: c */
    private ImageView f65334c;

    /* renamed from: d */
    private View f65335d;

    /* renamed from: e */
    private C24815l f65336e;

    /* renamed from: c */
    public final View mo64859c() {
        return this;
    }

    /* renamed from: b */
    public final void mo64858b() {
        if (this.f65336e != null) {
            this.f65336e.mo64613d();
        }
    }

    /* renamed from: a */
    public final void mo64855a() {
        if (this.f65336e != null) {
            this.f65336e.mo64610a();
        }
    }

    public void setLinkTagCallBack(C24815l lVar) {
        this.f65336e = lVar;
    }

    public StrongLinkContent(Context context) {
        this(context, null, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo64866a(View view) {
        if (this.f65336e != null) {
            this.f65336e.mo64611b();
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m81426a(CommerceTagLayout commerceTagLayout, C24815l lVar) {
        commerceTagLayout.setVisibility(8);
        commerceTagLayout.setAlpha(1.0f);
        lVar.mo64612c();
    }

    public StrongLinkContent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.a7z, this, true);
        this.f65332a = (RemoteImageView) findViewById(R.id.bmr);
        this.f65333b = (TextView) findViewById(R.id.bmq);
        this.f65334c = (ImageView) findViewById(R.id.bms);
        this.f65335d = findViewById(R.id.bmu);
        setBackgroundResource(R.drawable.o1);
        this.f65332a.setOnClickListener(new C24819p(this));
    }

    /* renamed from: a */
    public final void mo64857a(LinkData linkData, C24815l lVar, CommerceTagLayout commerceTagLayout) {
        this.f65336e = lVar;
        ((C13438a) this.f65332a.getHierarchy()).mo32902c((int) R.color.a6k);
        if (linkData.getImageList() == null || linkData.getImageList().size() <= 0) {
            commerceTagLayout.setVisibility(8);
            return;
        }
        UrlModel urlModel = (UrlModel) linkData.getImageList().get(0);
        C23323e.m76524b(this.f65332a, urlModel);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mt);
        setLayoutParams(new LayoutParams((int) ((((float) dimensionPixelOffset) / ((float) urlModel.getHeight())) * ((float) urlModel.getWidth())), dimensionPixelOffset));
        if (!TextUtils.isEmpty(linkData.label)) {
            this.f65333b.setVisibility(0);
            this.f65333b.setText(linkData.label);
        }
        if (linkData.showCloseTips) {
            this.f65334c.setVisibility(0);
            this.f65334c.setOnClickListener(new C24820q(commerceTagLayout, lVar));
            return;
        }
        this.f65334c.setVisibility(8);
        this.f65335d.setVisibility(8);
    }
}
