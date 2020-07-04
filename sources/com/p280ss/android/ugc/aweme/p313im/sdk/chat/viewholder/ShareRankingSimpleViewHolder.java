package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.view.View;
import com.C1642a;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareRankingListContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareRankingSimpleViewHolder */
public class ShareRankingSimpleViewHolder extends ShareSimpleBaseViewHolder {
    public ShareRankingSimpleViewHolder(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public void mo81421a(Message message, Message message2, BaseContent baseContent, int i) {
        super.mo81421a(message, message2, baseContent, i);
        ShareRankingListContent shareRankingListContent = (ShareRankingListContent) baseContent;
        int type = shareRankingListContent.getType();
        if (type != 2301) {
            switch (type) {
                case 1801:
                    this.f81372o.setText(R.string.bq4);
                    C23323e.m76503a(this.f81371n, (int) R.drawable.bj9);
                    break;
                case 1802:
                    this.f81372o.setText(R.string.bq3);
                    C23323e.m76503a(this.f81371n, (int) R.drawable.bj8);
                    break;
                case 1803:
                    this.f81372o.setText(R.string.bq2);
                    C23323e.m76503a(this.f81371n, (int) R.drawable.bj7);
                    break;
            }
        } else {
            this.f81372o.setText(R.string.bq1);
            C23323e.m76503a(this.f81371n, (int) R.drawable.bj6);
        }
        this.f81373p.setVisibility(0);
        this.f81373p.setText(C1642a.m8034a(this.itemView.getContext().getResources().getString(R.string.bo7), new Object[]{shareRankingListContent.getLastUpdateTime()}));
        this.f81374q.setText(R.string.bo6);
        this.f81197e.setTag(50331648, Integer.valueOf(15));
        C31858ad.m103406a();
        C31858ad.m103414a(shareRankingListContent, this.f81196d, this.f81201i.getConversationId(), false);
    }
}
