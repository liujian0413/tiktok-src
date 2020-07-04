package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.view.View;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.CommandShareContent;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.CommandShareSendViewHolder */
public class CommandShareSendViewHolder extends CommandShareViewHolder {
    public CommandShareSendViewHolder(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public final void mo81421a(Message message, Message message2, CommandShareContent commandShareContent, int i) {
        super.mo81421a(message, message2, commandShareContent, i);
        this.f81218m.setText(R.string.bi5);
    }
}
