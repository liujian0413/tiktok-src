package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareMiniAppContent;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareMiniAppViewHolder */
public class ShareMiniAppViewHolder extends ShareSimpleBaseViewHolder {
    public ShareMiniAppViewHolder(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public void mo81421a(Message message, Message message2, BaseContent baseContent, int i) {
        int i2;
        super.mo81421a(message, message2, baseContent, i);
        ShareMiniAppContent shareMiniAppContent = (ShareMiniAppContent) baseContent;
        this.f81372o.setMaxLines(1);
        this.f81372o.setText(shareMiniAppContent.getAppName());
        this.f81373p.setVisibility(0);
        this.f81373p.setMaxLines(2);
        this.f81373p.setText(shareMiniAppContent.getTitle());
        if (shareMiniAppContent.isGame()) {
            this.f81374q.setText(R.string.bmz);
        } else {
            this.f81374q.setText(R.string.bmx);
        }
        if (!TextUtils.isEmpty(shareMiniAppContent.getImageUrl())) {
            C23323e.m76514a(this.f81371n, shareMiniAppContent.getImageUrl());
        } else {
            RemoteImageView remoteImageView = this.f81371n;
            if (shareMiniAppContent.isGame()) {
                i2 = R.drawable.bj5;
            } else {
                i2 = R.drawable.bj4;
            }
            C23323e.m76503a(remoteImageView, i2);
        }
        this.f81197e.setTag(50331648, Integer.valueOf(20));
    }
}
