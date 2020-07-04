package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.Message;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.generic.RoundingParams;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareUserContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31915n;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareUserSimpleReceiveViewHolder */
public class ShareUserSimpleReceiveViewHolder extends BaseViewHolder<ShareUserContent> {

    /* renamed from: m */
    private RemoteImageView f81395m;

    /* renamed from: n */
    private DmtTextView f81396n;

    /* renamed from: o */
    private DmtTextView f81397o;

    /* renamed from: p */
    private DmtTextView f81398p;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo81420a() {
        super.mo81420a();
        this.f81197e = this.itemView.findViewById(R.id.a1q);
        this.f81395m = (RemoteImageView) this.itemView.findViewById(R.id.axp);
        this.f81396n = (DmtTextView) this.itemView.findViewById(R.id.dkn);
        this.f81397o = (DmtTextView) this.itemView.findViewById(R.id.a7k);
        this.f81398p = (DmtTextView) this.itemView.findViewById(R.id.dga);
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

    public ShareUserSimpleReceiveViewHolder(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public void mo81421a(Message message, Message message2, ShareUserContent shareUserContent, int i) {
        super.mo81421a(message, message2, shareUserContent, i);
        this.f81396n.setText(shareUserContent.getName());
        this.f81397o.setVisibility(0);
        if (C31915n.m103672b()) {
            DmtTextView dmtTextView = this.f81397o;
            StringBuilder sb = new StringBuilder("@");
            sb.append(shareUserContent.getDesc());
            dmtTextView.setText(sb.toString());
        } else {
            DmtTextView dmtTextView2 = this.f81397o;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C6399b.m19921a().getString(R.string.bfu));
            sb2.append(shareUserContent.getDesc());
            dmtTextView2.setText(sb2.toString());
        }
        this.f81398p.setText(R.string.bri);
        RoundingParams roundingParams = ((C13438a) this.f81395m.getHierarchy()).f35619a;
        roundingParams.mo32884a(true);
        ((C13438a) this.f81395m.getHierarchy()).mo32897a(roundingParams);
        C23323e.m76524b(this.f81395m, shareUserContent.getAvatar());
        this.f81197e.setTag(50331648, Integer.valueOf(21));
        this.f81197e.setTag(67108864, this.f81201i);
    }
}
