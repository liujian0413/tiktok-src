package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareWebContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31863ai;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareWebReceiveViewHolder */
public class ShareWebReceiveViewHolder extends ShareSimpleBaseViewHolder {
    public ShareWebReceiveViewHolder(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public void mo81421a(Message message, Message message2, BaseContent baseContent, int i) {
        super.mo81421a(message, message2, baseContent, i);
        ShareWebContent shareWebContent = (ShareWebContent) baseContent;
        this.f81372o.setText(shareWebContent.getTitle());
        this.f81373p.setVisibility(0);
        if (shareWebContent.getDesc() == null || shareWebContent.getDesc().trim().length() <= 0) {
            this.f81373p.setVisibility(8);
        } else {
            this.f81373p.setText(shareWebContent.getDesc());
            this.f81373p.setVisibility(0);
        }
        this.f81374q.setText(R.string.bro);
        if (!TextUtils.isEmpty(shareWebContent.getImage())) {
            C23323e.m76514a(this.f81371n, shareWebContent.getImage());
        } else {
            C23323e.m76503a(this.f81371n, (int) R.drawable.bjb);
        }
        this.f81197e.setTag(50331648, Integer.valueOf(22));
        this.f81197e.setTag(50331649, Boolean.valueOf(C31863ai.m103531a(message, (BaseContent) shareWebContent)));
        this.f81197e.setTag(50331650, this.f81196d);
        this.f81197e.setTag(50331651, Long.valueOf(message.getMsgId()));
    }
}
