package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.view.View;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareSimpleBaseViewHolder */
public class ShareSimpleBaseViewHolder extends BaseViewHolder<BaseContent> {

    /* renamed from: n */
    RemoteImageView f81371n;

    /* renamed from: o */
    DmtTextView f81372o;

    /* renamed from: p */
    DmtTextView f81373p;

    /* renamed from: q */
    DmtTextView f81374q;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo81420a() {
        super.mo81420a();
        this.f81197e = this.itemView.findViewById(R.id.a1q);
        this.f81371n = (RemoteImageView) this.itemView.findViewById(R.id.axp);
        this.f81372o = (DmtTextView) this.itemView.findViewById(R.id.dkn);
        this.f81373p = (DmtTextView) this.itemView.findViewById(R.id.a7k);
        this.f81374q = (DmtTextView) this.itemView.findViewById(R.id.dga);
    }

    public ShareSimpleBaseViewHolder(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public void mo81421a(Message message, Message message2, BaseContent baseContent, int i) {
        super.mo81421a(message, message2, baseContent, i);
    }
}
