package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.view.View;
import com.C1642a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareChallengeContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31916o;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareChallengeSimpleViewHolder */
public class ShareChallengeSimpleViewHolder extends BaseViewHolder<ShareChallengeContent> {

    /* renamed from: m */
    private RemoteImageView f81315m;

    /* renamed from: n */
    private DmtTextView f81316n;

    /* renamed from: o */
    private DmtTextView f81317o;

    /* renamed from: p */
    private DmtTextView f81318p;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo81420a() {
        super.mo81420a();
        this.f81197e = this.itemView.findViewById(R.id.a1q);
        this.f81315m = (RemoteImageView) this.itemView.findViewById(R.id.axp);
        this.f81316n = (DmtTextView) this.itemView.findViewById(R.id.dkn);
        this.f81317o = (DmtTextView) this.itemView.findViewById(R.id.a7k);
        this.f81318p = (DmtTextView) this.itemView.findViewById(R.id.dga);
        this.f81315m.setImageResource(R.drawable.b5x);
    }

    public ShareChallengeSimpleViewHolder(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public void mo81421a(Message message, Message message2, ShareChallengeContent shareChallengeContent, int i) {
        super.mo81421a(message, message2, shareChallengeContent, i);
        this.f81316n.setText(shareChallengeContent.getTitle());
        this.f81317o.setVisibility(0);
        this.f81317o.setText(C1642a.m8034a(this.itemView.getContext().getResources().getString(R.string.bhm), new Object[]{C31916o.m103674a(shareChallengeContent.getUserCount())}));
        this.f81318p.setText(R.string.bhl);
        this.f81197e.setTag(50331648, Integer.valueOf(18));
        this.f81197e.setTag(67108864, shareChallengeContent.getChallengeId());
        this.f81197e.setTag(50331649, Boolean.valueOf(shareChallengeContent.isCommerce()));
    }
}
