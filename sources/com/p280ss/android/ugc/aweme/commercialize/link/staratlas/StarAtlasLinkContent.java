package com.p280ss.android.ugc.aweme.commercialize.link.staratlas;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.facebook.drawee.generic.C13438a;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.commercialize.link.video.C24804a;
import com.p280ss.android.ugc.aweme.feed.model.StarAtlasLink;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.staratlas.StarAtlasLinkContent */
public final class StarAtlasLinkContent extends LinearLayout implements OnClickListener {

    /* renamed from: a */
    private final RemoteImageView f65307a;

    /* renamed from: b */
    private final DmtTextView f65308b;

    /* renamed from: c */
    private C24804a f65309c;

    /* renamed from: b */
    public final View mo64841b() {
        return this;
    }

    /* renamed from: a */
    public final void mo64839a() {
        C24804a aVar = this.f65309c;
        if (aVar != null) {
            aVar.mo64610a();
        }
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C7573i.m23587b(view, "v");
        C24804a aVar = this.f65309c;
        if (aVar != null) {
            aVar.mo64611b();
        }
    }

    /* renamed from: a */
    public final void mo64840a(StarAtlasLink starAtlasLink, C24804a aVar) {
        C7573i.m23587b(aVar, "commerceTagCallBack");
        this.f65309c = aVar;
        if (starAtlasLink == null) {
            this.f65307a.setImageResource(R.drawable.bk5);
            this.f65308b.setText("");
            return;
        }
        ((C13438a) this.f65307a.getHierarchy()).mo32902c((int) R.color.a6k);
        C23323e.m76524b(this.f65307a, starAtlasLink.getAvatarIcon());
        ((C13438a) this.f65307a.getHierarchy()).mo32898b((int) R.drawable.bk5);
        this.f65308b.setText(starAtlasLink.getTitle());
    }

    public StarAtlasLinkContent(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        LayoutInflater.from(getContext()).inflate(R.layout.a81, this, true);
        setPadding(C23486n.m77122a(5.0d), getTopPaddingOffset(), C23486n.m77122a(4.0d), getBottomPaddingOffset());
        setBackgroundResource(R.drawable.o0);
        setGravity(16);
        View findViewById = findViewById(R.id.bmn);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.link_icon)");
        this.f65307a = (RemoteImageView) findViewById;
        View findViewById2 = findViewById(R.id.bmk);
        C7573i.m23582a((Object) findViewById2, "findViewById(R.id.link_desc)");
        this.f65308b = (DmtTextView) findViewById2;
        setOnClickListener(this);
    }

    public /* synthetic */ StarAtlasLinkContent(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        this(context, null, 0);
    }
}
