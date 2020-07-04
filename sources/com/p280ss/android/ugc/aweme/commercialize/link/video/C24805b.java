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
import com.facebook.drawee.generic.C13438a;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.commercialize.model.LinkData;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.video.b */
final class C24805b extends LinearLayout implements OnClickListener, C24814k {

    /* renamed from: a */
    private RemoteImageView f65344a;

    /* renamed from: b */
    private DmtTextView f65345b;

    /* renamed from: c */
    private ImageView f65346c;

    /* renamed from: d */
    private C24815l f65347d;

    /* renamed from: c */
    public final View mo64859c() {
        return this;
    }

    /* renamed from: b */
    public final void mo64858b() {
        if (this.f65347d != null) {
            this.f65347d.mo64613d();
        }
    }

    /* renamed from: a */
    public final void mo64855a() {
        if (this.f65347d != null) {
            this.f65347d.mo64610a();
        }
    }

    public final void setLinkTagCallBack(C24815l lVar) {
        this.f65347d = lVar;
    }

    C24805b(Context context) {
        this(context, null);
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (this.f65347d != null) {
            this.f65347d.mo64611b();
        }
    }

    private C24805b(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
    }

    /* renamed from: a */
    static final /* synthetic */ void m81445a(CommerceTagLayout commerceTagLayout, C24815l lVar) {
        commerceTagLayout.setVisibility(8);
        commerceTagLayout.setAlpha(1.0f);
        lVar.mo64612c();
    }

    private C24805b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        LayoutInflater.from(getContext()).inflate(R.layout.a7_, this, true);
        setPadding(C23486n.m77122a(5.0d), C23486n.m77122a(5.0d), C23486n.m77122a(5.0d), C23486n.m77122a(5.0d));
        setBackgroundResource(R.drawable.o0);
        this.f65344a = (RemoteImageView) findViewById(R.id.bmn);
        this.f65345b = (DmtTextView) findViewById(R.id.bmk);
        this.f65346c = (ImageView) findViewById(R.id.bms);
        setOnClickListener(this);
    }

    /* renamed from: a */
    public final void mo64857a(LinkData linkData, C24815l lVar, CommerceTagLayout commerceTagLayout) {
        this.f65347d = lVar;
        if (linkData == null) {
            this.f65344a.setImageResource(17170445);
            this.f65345b.setText("");
            return;
        }
        ((C13438a) this.f65344a.getHierarchy()).mo32902c((int) R.color.a6k);
        UrlModel urlModel = linkData.avatarIcon;
        if (urlModel == null || C6307b.m19566a((Collection<T>) urlModel.getUrlList())) {
            this.f65344a.setImageResource(17170445);
        } else {
            C23323e.m76524b(this.f65344a, linkData.avatarIcon);
        }
        if (linkData.showCloseTips) {
            this.f65346c.setVisibility(0);
        } else {
            this.f65346c.setVisibility(8);
        }
        this.f65346c.setOnClickListener(new C24806c(commerceTagLayout, lVar));
        this.f65345b.setText(linkData.title);
        if (!TextUtils.isEmpty(linkData.label)) {
            DmtTextView dmtTextView = (DmtTextView) findViewById(R.id.di);
            dmtTextView.setVisibility(0);
            dmtTextView.setText(linkData.label);
        }
    }
}
