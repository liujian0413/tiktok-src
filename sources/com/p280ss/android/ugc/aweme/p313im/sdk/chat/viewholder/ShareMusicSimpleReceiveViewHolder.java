package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import com.C1642a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareMusicContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31916o;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31932z;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareMusicSimpleReceiveViewHolder */
public class ShareMusicSimpleReceiveViewHolder extends BaseViewHolder<ShareMusicContent> {

    /* renamed from: m */
    private RemoteImageView f81357m;

    /* renamed from: n */
    private DmtTextView f81358n;

    /* renamed from: o */
    private DmtTextView f81359o;

    /* renamed from: p */
    private DmtTextView f81360p;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo81420a() {
        super.mo81420a();
        this.f81197e = this.itemView.findViewById(R.id.a1q);
        this.f81357m = (RemoteImageView) this.itemView.findViewById(R.id.axp);
        this.f81358n = (DmtTextView) this.itemView.findViewById(R.id.dkn);
        this.f81359o = (DmtTextView) this.itemView.findViewById(R.id.a7k);
        this.f81360p = (DmtTextView) this.itemView.findViewById(R.id.dga);
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

    public ShareMusicSimpleReceiveViewHolder(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public void mo81421a(Message message, Message message2, ShareMusicContent shareMusicContent, int i) {
        super.mo81421a(message, message2, shareMusicContent, i);
        this.f81358n.setText(shareMusicContent.getMusicName());
        this.f81359o.setVisibility(0);
        this.f81359o.setText(C1642a.m8034a(this.itemView.getContext().getResources().getString(R.string.bn8), new Object[]{C31916o.m103674a((long) shareMusicContent.getUserCount())}));
        this.f81360p.setText(R.string.bn7);
        C31932z.m103703a(this.f81357m, shareMusicContent.getCoverThumb(), (int) R.drawable.b5z, (int) R.drawable.b6k);
        this.f81197e.setTag(50331648, Integer.valueOf(17));
        this.f81197e.setTag(67108864, this.f81201i);
    }
}
