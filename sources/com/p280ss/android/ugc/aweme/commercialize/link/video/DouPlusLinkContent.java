package com.p280ss.android.ugc.aweme.commercialize.link.video;

import android.content.Context;
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
import com.p280ss.android.ugc.aweme.commercialize.model.DouPlusLinkData;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.video.DouPlusLinkContent */
public final class DouPlusLinkContent extends LinearLayout implements OnClickListener {

    /* renamed from: a */
    private RemoteImageView f65312a;

    /* renamed from: b */
    private DmtTextView f65313b;

    /* renamed from: c */
    private ImageView f65314c;

    /* renamed from: d */
    private C24804a f65315d;

    /* renamed from: a */
    public final View mo64850a() {
        return this;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C7573i.m23587b(view, "v");
        if (this.f65315d != null) {
            C24804a aVar = this.f65315d;
            if (aVar == null) {
                C7573i.m23580a();
            }
            aVar.mo64611b();
        }
    }

    /* renamed from: a */
    public final void mo64851a(DouPlusLinkData douPlusLinkData, C24804a aVar) {
        C7573i.m23587b(aVar, "commerceTagCallBack");
        this.f65315d = aVar;
        if (douPlusLinkData == null) {
            this.f65312a.setImageResource(17170445);
            this.f65313b.setText("");
            return;
        }
        ((C13438a) this.f65312a.getHierarchy()).mo32902c((int) R.color.a6k);
        UrlModel urlModel = douPlusLinkData.avatarIcon;
        if (urlModel == null || C6307b.m19566a((Collection<T>) urlModel.getUrlList())) {
            this.f65312a.setImageResource(17170445);
        } else {
            C23323e.m76524b(this.f65312a, douPlusLinkData.avatarIcon);
        }
        this.f65314c.setVisibility(8);
        this.f65313b.setText(douPlusLinkData.title);
    }

    public DouPlusLinkContent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.a81, this, true);
        setPadding(C23486n.m77122a(5.0d), getTopPaddingOffset(), C23486n.m77122a(5.0d), getBottomPaddingOffset());
        setBackgroundResource(R.drawable.o0);
        setGravity(16);
        View findViewById = findViewById(R.id.bmn);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.link_icon)");
        this.f65312a = (RemoteImageView) findViewById;
        View findViewById2 = findViewById(R.id.bmk);
        C7573i.m23582a((Object) findViewById2, "findViewById(R.id.link_desc)");
        this.f65313b = (DmtTextView) findViewById2;
        View findViewById3 = findViewById(R.id.bms);
        C7573i.m23582a((Object) findViewById3, "findViewById(R.id.link_naming_close)");
        this.f65314c = (ImageView) findViewById3;
        setOnClickListener(this);
    }

    public /* synthetic */ DouPlusLinkContent(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        this(context, null, 0);
    }
}
