package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.view.View;
import android.widget.TextView;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.EPlatformCardContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.p1323e.C31191a;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.EPlatformSpanInterceptNoTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.EPlatformReceiveViewHolder */
public class EPlatformReceiveViewHolder extends BaseViewHolder<EPlatformCardContent> {

    /* renamed from: m */
    boolean f81226m = true;

    /* renamed from: n */
    private TextView f81227n;

    public EPlatformReceiveViewHolder(View view, int i) {
        super(view, i);
        this.f81227n = (TextView) view.findViewById(R.id.c0g);
        this.f81197e = view.findViewById(R.id.a1q);
    }

    /* renamed from: a */
    public void mo81421a(Message message, Message message2, EPlatformCardContent ePlatformCardContent, int i) {
        if (ePlatformCardContent != null) {
            super.mo81421a(message, message2, ePlatformCardContent, i);
            if (this.f81226m) {
                C31191a.m101659a(this.f81227n, ePlatformCardContent.content, ePlatformCardContent.actions, this.f81196d, message.getMsgId(), this.itemView.getContext().getResources().getColor(R.color.w5));
                ((EPlatformSpanInterceptNoTextView) this.f81227n).f83543b = this.itemView.getContext().getResources().getColor(R.color.tp);
            } else {
                C31191a.m101659a(this.f81227n, ePlatformCardContent.content, ePlatformCardContent.actions, this.f81196d, message.getMsgId(), -1);
                ((EPlatformSpanInterceptNoTextView) this.f81227n).f83543b = this.itemView.getContext().getResources().getColor(R.color.tq);
            }
            ((EPlatformSpanInterceptNoTextView) this.f81227n).setContentArea(this.f81197e);
            this.f81197e.setTag(50331648, Integer.valueOf(36));
        }
    }
}
