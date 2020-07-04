package com.p280ss.android.ugc.aweme.commercialize.link.video;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
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

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.video.m */
final class C24816m extends LinearLayout implements OnClickListener, C24814k {

    /* renamed from: a */
    private RemoteImageView f65362a;

    /* renamed from: b */
    private DmtTextView f65363b;

    /* renamed from: c */
    private View f65364c;

    /* renamed from: d */
    private DmtTextView f65365d;

    /* renamed from: e */
    private ImageView f65366e;

    /* renamed from: f */
    private ImageView f65367f;

    /* renamed from: g */
    private View f65368g;

    /* renamed from: h */
    private C24815l f65369h;

    /* renamed from: c */
    public final View mo64859c() {
        return this;
    }

    /* renamed from: d */
    private boolean m81458d() {
        if (this.f65366e.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private boolean m81459e() {
        if (this.f65365d.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo64858b() {
        if (this.f65369h != null) {
            this.f65369h.mo64613d();
        }
    }

    /* renamed from: a */
    public final void mo64855a() {
        if (this.f65369h != null) {
            this.f65369h.mo64610a();
        }
    }

    public final void setLinkTagCallBack(C24815l lVar) {
        this.f65369h = lVar;
    }

    C24816m(Context context) {
        this(context, null);
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (this.f65369h != null) {
            this.f65369h.mo64611b();
        }
    }

    private C24816m(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
    }

    /* renamed from: a */
    static final /* synthetic */ void m81456a(CommerceTagLayout commerceTagLayout, C24815l lVar) {
        commerceTagLayout.setVisibility(8);
        commerceTagLayout.setAlpha(1.0f);
        lVar.mo64612c();
    }

    private C24816m(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        LayoutInflater.from(getContext()).inflate(R.layout.a81, this, true);
        setPadding(C23486n.m77122a(5.0d), getTopPaddingOffset(), C23486n.m77122a(4.0d), getBottomPaddingOffset());
        setBackgroundResource(R.drawable.o0);
        setGravity(16);
        this.f65362a = (RemoteImageView) findViewById(R.id.bmn);
        this.f65363b = (DmtTextView) findViewById(R.id.bmk);
        this.f65364c = findViewById(R.id.dl);
        this.f65365d = (DmtTextView) findViewById(R.id.di);
        this.f65366e = (ImageView) findViewById(R.id.bms);
        this.f65367f = (ImageView) findViewById(R.id.bbm);
        this.f65368g = findViewById(R.id.cc4);
        setOnClickListener(this);
    }

    /* renamed from: a */
    public final void mo64857a(LinkData linkData, C24815l lVar, CommerceTagLayout commerceTagLayout) {
        this.f65369h = lVar;
        if (linkData == null) {
            this.f65362a.setImageResource(17170445);
            this.f65363b.setText("");
            return;
        }
        ((C13438a) this.f65362a.getHierarchy()).mo32902c((int) R.color.a6k);
        UrlModel urlModel = linkData.avatarIcon;
        if (urlModel == null || C6307b.m19566a((Collection<T>) urlModel.getUrlList())) {
            this.f65362a.setImageResource(17170445);
        } else {
            C23323e.m76524b(this.f65362a, urlModel);
        }
        this.f65363b.setText(linkData.title);
        if (!TextUtils.isEmpty(linkData.label)) {
            this.f65365d.setVisibility(0);
            this.f65365d.setFontType(C10834d.f29337g);
            this.f65365d.setText(linkData.label);
        } else {
            this.f65365d.setVisibility(8);
        }
        if (linkData.showCloseTips) {
            this.f65366e.setVisibility(0);
        } else {
            this.f65366e.setVisibility(8);
        }
        this.f65366e.setOnClickListener(new C24817n(commerceTagLayout, lVar));
        if (m81459e() || m81458d()) {
            this.f65364c.setVisibility(0);
            this.f65367f.setVisibility(8);
            this.f65368g.setVisibility(8);
            if (m81459e() && !m81458d()) {
                setPadding(getPaddingLeft(), getPaddingTop(), C23486n.m77122a(8.0d), getPaddingBottom());
            }
        } else {
            this.f65364c.setVisibility(8);
            this.f65367f.setVisibility(8);
            this.f65368g.setVisibility(0);
        }
    }
}
