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

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.video.WeakLinkContent */
public class WeakLinkContent extends LinearLayout implements C24814k {

    /* renamed from: a */
    private RemoteImageView f65337a;

    /* renamed from: b */
    private DmtTextView f65338b;

    /* renamed from: c */
    private DmtTextView f65339c;

    /* renamed from: d */
    private ImageView f65340d;

    /* renamed from: e */
    private View f65341e;

    /* renamed from: f */
    private C24815l f65342f;

    /* renamed from: g */
    private LinkData f65343g;

    /* renamed from: c */
    public final View mo64859c() {
        return this;
    }

    /* renamed from: d */
    private void m81435d() {
        setOnClickListener(new C24822s(this));
    }

    /* renamed from: b */
    public final void mo64858b() {
        if (this.f65342f != null) {
            this.f65342f.mo64613d();
        }
    }

    /* renamed from: e */
    private void m81436e() {
        setBackgroundResource(R.drawable.o0);
        setOrientation(0);
        setGravity(16);
        setPadding(C23486n.m77122a(5.0d), 0, C23486n.m77122a(5.0d), 0);
    }

    /* renamed from: a */
    public final void mo64855a() {
        if (this.f65342f != null) {
            this.f65342f.mo64610a();
        }
    }

    public void setLinkTagCallBack(C24815l lVar) {
        this.f65342f = lVar;
    }

    public WeakLinkContent(Context context) {
        this(context, null, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo64867a(View view) {
        if (this.f65342f != null) {
            this.f65342f.mo64611b();
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m81433a(CommerceTagLayout commerceTagLayout, C24815l lVar) {
        commerceTagLayout.setVisibility(8);
        commerceTagLayout.setAlpha(1.0f);
        lVar.mo64612c();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        StaticLayout staticLayout;
        super.onMeasure(i, i2);
        LayoutParams layoutParams = (LayoutParams) this.f65338b.getLayoutParams();
        int maxWidth = this.f65338b.getMaxWidth();
        this.f65338b.setTextSize(12.0f);
        if (VERSION.SDK_INT >= 23) {
            staticLayout = Builder.obtain(this.f65343g.title, 0, this.f65343g.title.length(), this.f65338b.getPaint(), maxWidth).build();
        } else {
            staticLayout = new StaticLayout(this.f65343g.title, this.f65338b.getPaint(), maxWidth, Alignment.ALIGN_NORMAL, this.f65338b.getLineSpacingMultiplier(), this.f65338b.getLineSpacingExtra(), this.f65338b.getIncludeFontPadding());
        }
        if (staticLayout.getLineCount() > 1) {
            this.f65338b.setTextSize(12.0f);
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginEnd(C23486n.m77122a(8.0d));
            }
            layoutParams.rightMargin = C23486n.m77122a(8.0d);
        } else {
            this.f65338b.setTextSize(13.0f);
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginEnd(C23486n.m77122a(5.0d));
            }
            layoutParams.rightMargin = C23486n.m77122a(5.0d);
        }
        this.f65338b.setLayoutParams(layoutParams);
    }

    public WeakLinkContent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.a80, this, true);
        this.f65337a = (RemoteImageView) findViewById(R.id.bmt);
        this.f65338b = (DmtTextView) findViewById(R.id.bmq);
        this.f65339c = (DmtTextView) findViewById(R.id.bmp);
        this.f65340d = (ImageView) findViewById(R.id.bms);
        this.f65341e = findViewById(R.id.bmu);
        m81436e();
        m81435d();
    }

    /* renamed from: a */
    public final void mo64857a(LinkData linkData, C24815l lVar, CommerceTagLayout commerceTagLayout) {
        this.f65342f = lVar;
        if (linkData == null) {
            this.f65338b.setText("");
            return;
        }
        this.f65343g = linkData;
        ((C13438a) this.f65337a.getHierarchy()).mo32902c((int) R.color.a6k);
        UrlModel urlModel = linkData.avatarIcon;
        if (urlModel != null && !C6307b.m19566a((Collection<T>) urlModel.getUrlList())) {
            C23323e.m76524b(this.f65337a, linkData.avatarIcon);
        }
        if (!TextUtils.isEmpty(this.f65343g.label)) {
            this.f65339c.setVisibility(0);
            this.f65339c.setFontType(C10834d.f29337g);
            this.f65339c.setText(this.f65343g.label);
        }
        this.f65338b.setText(this.f65343g.title);
        if (TextUtils.isEmpty(this.f65343g.label) && !linkData.showCloseTips) {
            this.f65341e.setVisibility(8);
        }
        if (linkData.showCloseTips) {
            this.f65340d.setVisibility(0);
            this.f65340d.setOnClickListener(new C24823t(commerceTagLayout, lVar));
        } else {
            this.f65340d.setVisibility(8);
        }
        this.f65338b.setText(linkData.title);
    }
}
