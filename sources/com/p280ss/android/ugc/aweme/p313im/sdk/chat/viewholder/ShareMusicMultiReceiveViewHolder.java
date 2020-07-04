package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import com.C1642a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareMusicContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31916o;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareMusicMultiReceiveViewHolder */
public class ShareMusicMultiReceiveViewHolder extends BaseViewHolder<ShareMusicContent> {

    /* renamed from: m */
    private RemoteImageView f81350m;

    /* renamed from: n */
    private DmtTextView f81351n;

    /* renamed from: o */
    private DmtTextView f81352o;

    /* renamed from: p */
    private RemoteImageView f81353p;

    /* renamed from: q */
    private RemoteImageView f81354q;

    /* renamed from: r */
    private RemoteImageView f81355r;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo81420a() {
        super.mo81420a();
        this.f81197e = this.itemView.findViewById(R.id.a1q);
        this.f81350m = (RemoteImageView) this.itemView.findViewById(R.id.axp);
        this.f81351n = (DmtTextView) this.itemView.findViewById(R.id.dkn);
        this.f81352o = (DmtTextView) this.itemView.findViewById(R.id.a7k);
        this.f81353p = (RemoteImageView) this.itemView.findViewById(R.id.ayo);
        this.f81354q = (RemoteImageView) this.itemView.findViewById(R.id.ayp);
        this.f81355r = (RemoteImageView) this.itemView.findViewById(R.id.ayq);
    }

    /* renamed from: a */
    public final void mo81426a(OnLongClickListener onLongClickListener) {
        this.f81197e.setOnLongClickListener(onLongClickListener);
    }

    /* renamed from: a */
    public void mo81424a(OnClickListener onClickListener) {
        super.mo81424a(onClickListener);
        this.f81197e.setOnClickListener(onClickListener);
    }

    public ShareMusicMultiReceiveViewHolder(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public void mo81421a(Message message, Message message2, ShareMusicContent shareMusicContent, int i) {
        super.mo81421a(message, message2, shareMusicContent, i);
        this.f81351n.setText(shareMusicContent.getMusicName());
        this.f81352o.setVisibility(0);
        this.f81352o.setText(C1642a.m8034a(this.itemView.getContext().getResources().getString(R.string.bn8), new Object[]{C31916o.m103674a((long) shareMusicContent.getUserCount())}));
        C23323e.m76503a(this.f81350m, (int) R.drawable.b5y);
        C23323e.m76524b(this.f81353p, (UrlModel) shareMusicContent.getAwemeCoverList().get(0));
        C23323e.m76524b(this.f81354q, (UrlModel) shareMusicContent.getAwemeCoverList().get(1));
        C23323e.m76524b(this.f81355r, (UrlModel) shareMusicContent.getAwemeCoverList().get(2));
        this.f81197e.setTag(50331648, Integer.valueOf(17));
        this.f81197e.setTag(67108864, this.f81201i);
    }
}
