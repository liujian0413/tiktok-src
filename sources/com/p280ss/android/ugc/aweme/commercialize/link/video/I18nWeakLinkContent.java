package com.p280ss.android.ugc.aweme.commercialize.link.video;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.StaticLayout.Builder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.facebook.drawee.generic.C13438a;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.commercialize.model.LinkData;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.video.I18nWeakLinkContent */
public class I18nWeakLinkContent extends LinearLayout implements C24814k {

    /* renamed from: a */
    private RemoteImageView f65320a;

    /* renamed from: b */
    private DmtTextView f65321b;

    /* renamed from: c */
    private DmtTextView f65322c;

    /* renamed from: d */
    private ImageView f65323d;

    /* renamed from: e */
    private C24815l f65324e;

    /* renamed from: f */
    private LinkData f65325f;

    /* renamed from: c */
    public final View mo64859c() {
        return this;
    }

    /* renamed from: d */
    private void m81412d() {
        setOnClickListener(new C24811h(this));
    }

    /* renamed from: b */
    public final void mo64858b() {
        if (this.f65324e != null) {
            this.f65324e.mo64613d();
        }
    }

    /* renamed from: e */
    private void m81413e() {
        setBackgroundResource(R.drawable.o0);
        setOrientation(0);
        setPadding(C23486n.m77122a(5.0d), C23486n.m77122a(5.0d), C23486n.m77122a(5.0d), C23486n.m77122a(5.0d));
    }

    /* renamed from: a */
    public final void mo64855a() {
        if (this.f65324e != null) {
            this.f65324e.mo64610a();
        }
    }

    public void setLinkTagCallBack(C24815l lVar) {
        this.f65324e = lVar;
    }

    public I18nWeakLinkContent(Context context) {
        this(context, null, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo64861a(View view) {
        if (this.f65324e != null) {
            this.f65324e.mo64611b();
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m81410a(CommerceTagLayout commerceTagLayout, C24815l lVar) {
        commerceTagLayout.setVisibility(8);
        commerceTagLayout.setAlpha(1.0f);
        lVar.mo64612c();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        StaticLayout staticLayout;
        String str;
        super.onMeasure(i, i2);
        measureChildren(i, i2);
        int maxWidth = this.f65321b.getMaxWidth();
        this.f65321b.setTextSize(13.0f);
        if (VERSION.SDK_INT >= 23) {
            if (this.f65325f.title == null) {
                str = "";
            } else {
                str = this.f65325f.title;
            }
            staticLayout = Builder.obtain(str, 0, str.length(), this.f65321b.getPaint(), maxWidth).build();
        } else {
            staticLayout = new StaticLayout(this.f65325f.title, this.f65321b.getPaint(), maxWidth, Alignment.ALIGN_NORMAL, this.f65321b.getLineSpacingMultiplier(), this.f65321b.getLineSpacingExtra(), this.f65321b.getIncludeFontPadding());
        }
        if (staticLayout.getLineCount() > 1 && !TextUtils.isEmpty(this.f65325f.label)) {
            LayoutParams layoutParams = (LayoutParams) this.f65320a.getLayoutParams();
            layoutParams.height = C23486n.m77122a(48.0d);
            layoutParams.width = C23486n.m77122a(48.0d);
            this.f65320a.setLayoutParams(layoutParams);
        }
    }

    public I18nWeakLinkContent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.a79, this, true);
        setPadding(C23486n.m77122a(5.0d), C23486n.m77122a(5.0d), C23486n.m77122a(5.0d), C23486n.m77122a(5.0d));
        this.f65320a = (RemoteImageView) findViewById(R.id.bmt);
        this.f65321b = (DmtTextView) findViewById(R.id.bmq);
        this.f65322c = (DmtTextView) findViewById(R.id.bmp);
        this.f65323d = (ImageView) findViewById(R.id.bms);
        m81413e();
        m81412d();
    }

    /* renamed from: a */
    public final void mo64857a(LinkData linkData, C24815l lVar, CommerceTagLayout commerceTagLayout) {
        this.f65324e = lVar;
        if (linkData == null) {
            this.f65321b.setText("");
            return;
        }
        this.f65325f = linkData;
        ((C13438a) this.f65320a.getHierarchy()).mo32902c((int) R.color.a6k);
        UrlModel urlModel = linkData.avatarIcon;
        if (urlModel != null && !C6307b.m19566a((Collection<T>) urlModel.getUrlList())) {
            C23323e.m76524b(this.f65320a, linkData.avatarIcon);
        }
        if (!TextUtils.isEmpty(this.f65325f.label)) {
            this.f65322c.setVisibility(0);
            this.f65322c.setFontType(C10834d.f29337g);
            this.f65322c.setText(this.f65325f.label);
        }
        this.f65321b.setText(this.f65325f.title);
        if (linkData.showCloseTips) {
            this.f65323d.setVisibility(0);
            this.f65323d.setOnClickListener(new C24812i(commerceTagLayout, lVar));
        } else {
            this.f65323d.setVisibility(8);
        }
        this.f65321b.setText(linkData.title);
    }
}
