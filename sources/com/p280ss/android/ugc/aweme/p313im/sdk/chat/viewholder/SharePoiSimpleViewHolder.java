package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.text.TextUtils;
import android.view.View;
import com.C1642a;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.SharePoiContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31916o;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.SharePoiSimpleViewHolder */
public class SharePoiSimpleViewHolder extends ShareSimpleBaseViewHolder {
    public SharePoiSimpleViewHolder(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public void mo81421a(Message message, Message message2, BaseContent baseContent, int i) {
        super.mo81421a(message, message2, baseContent, i);
        SharePoiContent sharePoiContent = (SharePoiContent) baseContent;
        this.f81372o.setText(sharePoiContent.getTitle());
        this.f81373p.setVisibility(0);
        if (TextUtils.isEmpty(sharePoiContent.getSubtitle())) {
            this.f81373p.setText(C1642a.m8034a(this.itemView.getContext().getResources().getString(R.string.bo5), new Object[]{C31916o.m103674a((long) sharePoiContent.getUserCount())}));
        } else {
            this.f81373p.setText(sharePoiContent.getSubtitle());
        }
        this.f81374q.setText(R.string.bo4);
        C23323e.m76524b(this.f81371n, sharePoiContent.getMapUrl());
        this.f81197e.setTag(50331648, Integer.valueOf(16));
        this.f81197e.setTag(67108864, sharePoiContent.getPoiId());
        this.f81197e.setTag(50331649, this.f81196d);
    }
}
