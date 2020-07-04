package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.CommandShareContent;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.CommandShareViewHolder */
public class CommandShareViewHolder extends BaseViewHolder<CommandShareContent> {

    /* renamed from: m */
    TextView f81218m;

    /* renamed from: n */
    private RemoteImageView f81219n;

    /* renamed from: o */
    private TextView f81220o;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo81423b() {
        super.mo81423b();
        this.f81202j.mo82725a(this.f81197e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo81420a() {
        super.mo81420a();
        this.f81219n = (RemoteImageView) this.itemView.findViewById(R.id.cbm);
        this.f81218m = (TextView) this.itemView.findViewById(R.id.dkn);
        this.f81220o = (TextView) this.itemView.findViewById(R.id.a7k);
        this.f81197e = this.itemView.findViewById(R.id.a1q);
    }

    public CommandShareViewHolder(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public void mo81421a(Message message, Message message2, CommandShareContent commandShareContent, int i) {
        super.mo81421a(message, message2, commandShareContent, i);
        C23323e.m76524b(this.f81219n, commandShareContent.getCoverUrl());
        this.f81218m.setText(R.string.bi4);
        if (TextUtils.isEmpty(commandShareContent.getTitle())) {
            this.f81220o.setText(C6399b.m19921a().getString(R.string.bhw, new Object[]{commandShareContent.getAuthorName()}));
        } else {
            this.f81220o.setText(commandShareContent.getTitle());
        }
        this.f81197e.setTag(50331648, Integer.valueOf(12));
        this.f81197e.setTag(67108864, commandShareContent.getItemId());
    }
}
