package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.view.View;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseRedEnvelopeContent;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.BaseRedEnvelopeHolder */
public abstract class BaseRedEnvelopeHolder<CONTENT extends BaseRedEnvelopeContent> extends BaseViewHolder<CONTENT> {

    /* renamed from: m */
    private RemoteImageView f81187m;

    /* renamed from: n */
    private DmtTextView f81188n;

    /* renamed from: o */
    private DmtTextView f81189o;

    /* renamed from: p */
    private DmtTextView f81190p;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo81423b() {
        super.mo81423b();
        this.f81202j.mo82725a(this.f81197e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo81420a() {
        super.mo81420a();
        this.f81197e = this.itemView.findViewById(R.id.a1q);
        this.f81187m = (RemoteImageView) this.itemView.findViewById(R.id.axp);
        this.f81188n = (DmtTextView) this.itemView.findViewById(R.id.dkn);
        this.f81189o = (DmtTextView) this.itemView.findViewById(R.id.a7k);
        this.f81190p = (DmtTextView) this.itemView.findViewById(R.id.dga);
    }

    public BaseRedEnvelopeHolder(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public void mo81421a(Message message, Message message2, CONTENT content, int i) {
        super.mo81421a(message, message2, content, i);
        this.f81188n.setText(content.getRedEnvelopeTitle());
        this.f81189o.setVisibility(0);
        this.f81189o.setMaxLines(Integer.MAX_VALUE);
        this.f81189o.setText(R.string.bsn);
        this.f81190p.setText(R.string.brq);
        C23323e.m76503a(this.f81187m, (int) R.drawable.b5q);
        this.f81197e.setTag(50331648, Integer.valueOf(30));
        this.f81197e.setTag(67108864, this.f81201i);
    }
}
