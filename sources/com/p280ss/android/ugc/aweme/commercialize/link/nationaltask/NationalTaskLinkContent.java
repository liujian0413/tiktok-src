package com.p280ss.android.ugc.aweme.commercialize.link.nationaltask;

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
import com.p280ss.android.ugc.aweme.feed.model.NationalTaskLink;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.nationaltask.NationalTaskLinkContent */
public final class NationalTaskLinkContent extends LinearLayout implements OnClickListener {

    /* renamed from: a */
    private final RemoteImageView f65303a;

    /* renamed from: b */
    private final DmtTextView f65304b;

    /* renamed from: c */
    private C24804a f65305c;

    /* renamed from: b */
    public final View mo64834b() {
        return this;
    }

    /* renamed from: a */
    public final void mo64832a() {
        C24804a aVar = this.f65305c;
        if (aVar != null) {
            aVar.mo64610a();
        }
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C7573i.m23587b(view, "v");
        C24804a aVar = this.f65305c;
        if (aVar != null) {
            aVar.mo64611b();
        }
    }

    /* renamed from: a */
    public final void mo64833a(NationalTaskLink nationalTaskLink, C24804a aVar) {
        C7573i.m23587b(aVar, "commerceTagCallBack");
        this.f65305c = aVar;
        if (nationalTaskLink == null) {
            this.f65303a.setImageResource(R.drawable.bk5);
            this.f65304b.setText("");
            return;
        }
        ((C13438a) this.f65303a.getHierarchy()).mo32902c((int) R.color.a6k);
        C23323e.m76524b(this.f65303a, nationalTaskLink.getAvatarIcon());
        ((C13438a) this.f65303a.getHierarchy()).mo32898b((int) R.drawable.bk5);
        this.f65304b.setText(nationalTaskLink.getTitle());
    }

    public NationalTaskLinkContent(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        LayoutInflater.from(getContext()).inflate(R.layout.a81, this, true);
        setPadding(C23486n.m77122a(5.0d), getTopPaddingOffset(), C23486n.m77122a(4.0d), getBottomPaddingOffset());
        setBackgroundResource(R.drawable.o0);
        setGravity(16);
        View findViewById = findViewById(R.id.bmn);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.link_icon)");
        this.f65303a = (RemoteImageView) findViewById;
        View findViewById2 = findViewById(R.id.bmk);
        C7573i.m23582a((Object) findViewById2, "findViewById(R.id.link_desc)");
        this.f65304b = (DmtTextView) findViewById2;
        setOnClickListener(this);
    }

    public /* synthetic */ NationalTaskLinkContent(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        this(context, null, 0);
    }
}
