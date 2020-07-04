package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.view.View;
import com.C1642a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareChallengeContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31916o;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareChallengeViewHolder */
public class ShareChallengeViewHolder extends BaseViewHolder<ShareChallengeContent> {

    /* renamed from: m */
    private RemoteImageView f81319m;

    /* renamed from: n */
    private DmtTextView f81320n;

    /* renamed from: o */
    private DmtTextView f81321o;

    /* renamed from: p */
    private RemoteImageView f81322p;

    /* renamed from: q */
    private RemoteImageView f81323q;

    /* renamed from: r */
    private RemoteImageView f81324r;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo81420a() {
        super.mo81420a();
        this.f81197e = this.itemView.findViewById(R.id.a1q);
        this.f81319m = (RemoteImageView) this.itemView.findViewById(R.id.axp);
        this.f81320n = (DmtTextView) this.itemView.findViewById(R.id.dkn);
        this.f81321o = (DmtTextView) this.itemView.findViewById(R.id.a7k);
        this.f81322p = (RemoteImageView) this.itemView.findViewById(R.id.ayo);
        this.f81323q = (RemoteImageView) this.itemView.findViewById(R.id.ayp);
        this.f81324r = (RemoteImageView) this.itemView.findViewById(R.id.ayq);
        this.f81319m.setImageResource(R.drawable.b5_);
    }

    public ShareChallengeViewHolder(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public void mo81421a(Message message, Message message2, ShareChallengeContent shareChallengeContent, int i) {
        super.mo81421a(message, message2, shareChallengeContent, i);
        this.f81320n.setText(shareChallengeContent.getTitle());
        this.f81321o.setVisibility(0);
        this.f81321o.setText(C1642a.m8034a(this.itemView.getContext().getResources().getString(R.string.bhm), new Object[]{C31916o.m103674a(shareChallengeContent.getUserCount())}));
        C23323e.m76524b(this.f81322p, (UrlModel) shareChallengeContent.getCoverUrl().get(0));
        C23323e.m76524b(this.f81323q, (UrlModel) shareChallengeContent.getCoverUrl().get(1));
        C23323e.m76524b(this.f81324r, (UrlModel) shareChallengeContent.getCoverUrl().get(2));
        this.f81197e.setTag(50331648, Integer.valueOf(18));
        this.f81197e.setTag(67108864, shareChallengeContent.getChallengeId());
        this.f81197e.setTag(50331649, Boolean.valueOf(shareChallengeContent.isCommerce()));
    }
}
