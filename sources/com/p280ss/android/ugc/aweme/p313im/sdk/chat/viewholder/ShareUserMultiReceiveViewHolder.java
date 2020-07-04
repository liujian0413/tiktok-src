package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.TextView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareUserContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31915n;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareUserMultiReceiveViewHolder */
public class ShareUserMultiReceiveViewHolder extends BaseViewHolder<ShareUserContent> {

    /* renamed from: m */
    private RemoteImageView f81387m;

    /* renamed from: n */
    private DmtTextView f81388n;

    /* renamed from: o */
    private DmtTextView f81389o;

    /* renamed from: p */
    private RemoteImageView f81390p;

    /* renamed from: q */
    private RemoteImageView f81391q;

    /* renamed from: r */
    private RemoteImageView f81392r;

    /* renamed from: s */
    private TextView f81393s;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo81420a() {
        super.mo81420a();
        this.f81197e = this.itemView.findViewById(R.id.a1q);
        this.f81387m = (RemoteImageView) this.itemView.findViewById(R.id.axp);
        this.f81388n = (DmtTextView) this.itemView.findViewById(R.id.dkn);
        this.f81389o = (DmtTextView) this.itemView.findViewById(R.id.a7k);
        this.f81390p = (RemoteImageView) this.itemView.findViewById(R.id.ayo);
        this.f81391q = (RemoteImageView) this.itemView.findViewById(R.id.ayp);
        this.f81392r = (RemoteImageView) this.itemView.findViewById(R.id.ayq);
        this.f81393s = (TextView) this.itemView.findViewById(R.id.ao1);
    }

    /* renamed from: a */
    public final void mo81426a(OnLongClickListener onLongClickListener) {
        this.f81197e.setOnLongClickListener(onLongClickListener);
    }

    /* renamed from: a */
    public void mo81424a(OnClickListener onClickListener) {
        super.mo81424a(onClickListener);
        this.f81197e.setOnClickListener(onClickListener);
        this.f81393s.setOnClickListener(onClickListener);
    }

    public ShareUserMultiReceiveViewHolder(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public void mo81421a(Message message, Message message2, ShareUserContent shareUserContent, int i) {
        int i2;
        super.mo81421a(message, message2, shareUserContent, i);
        this.f81388n.setText(shareUserContent.getName());
        this.f81389o.setVisibility(0);
        if (C31915n.m103672b()) {
            DmtTextView dmtTextView = this.f81389o;
            StringBuilder sb = new StringBuilder("@");
            sb.append(shareUserContent.getDesc());
            dmtTextView.setText(sb.toString());
        } else {
            DmtTextView dmtTextView2 = this.f81389o;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C6399b.m19921a().getString(R.string.bfu));
            sb2.append(shareUserContent.getDesc());
            dmtTextView2.setText(sb2.toString());
        }
        C23323e.m76524b(this.f81387m, shareUserContent.getAvatar());
        C23323e.m76524b(this.f81390p, (UrlModel) shareUserContent.getAwemeCoverList().get(0));
        C23323e.m76524b(this.f81391q, (UrlModel) shareUserContent.getAwemeCoverList().get(1));
        C23323e.m76524b(this.f81392r, (UrlModel) shareUserContent.getAwemeCoverList().get(2));
        IMUser b = C6961d.m21657a().mo18029b(shareUserContent.getUid());
        if (b == null) {
            i2 = 0;
        } else {
            i2 = b.getFollowStatus();
        }
        if (i2 == 0) {
            this.f81393s.setVisibility(0);
        } else {
            this.f81393s.setVisibility(8);
        }
        this.f81197e.setTag(50331648, Integer.valueOf(21));
        this.f81197e.setTag(67108864, this.f81201i);
        this.f81393s.setTag(50331648, Integer.valueOf(5));
        this.f81393s.setTag(67108864, message);
    }
}
