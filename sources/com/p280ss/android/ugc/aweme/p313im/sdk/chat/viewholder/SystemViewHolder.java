package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.view.View;
import android.widget.TextView;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.C30987r;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.SystemContent;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.SystemViewHolder */
public class SystemViewHolder extends BaseViewHolder<SystemContent> {

    /* renamed from: m */
    private TextView f81416m;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo81420a() {
        super.mo81420a();
        this.f81416m = (TextView) mo81425a((int) R.id.c0g);
    }

    public SystemViewHolder(View view, int i) {
        super(view, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo81421a(Message message, Message message2, SystemContent systemContent, int i) {
        super.mo81421a(message, message2, systemContent, i);
        C30987r.m100847a(systemContent, this.f81416m, this.f81196d);
    }
}
