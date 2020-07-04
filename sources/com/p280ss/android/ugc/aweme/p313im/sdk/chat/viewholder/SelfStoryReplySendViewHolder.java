package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.SelfStoryReplyContent;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.SelfStoryReplySendViewHolder */
public final class SelfStoryReplySendViewHolder extends SelfStoryReplyReceiveViewHolder {

    /* renamed from: r */
    public final DmtTextView f81262r;

    /* renamed from: s */
    public final ImageView f81263s;

    /* renamed from: t */
    public final C31050o f81264t = new C31050o(this.f81263s);

    /* renamed from: a */
    public final void mo81424a(OnClickListener onClickListener) {
        super.mo81424a(onClickListener);
        this.f81263s.setOnClickListener(onClickListener);
        this.f81202j.mo82725a(this.f81263s);
    }

    public SelfStoryReplySendViewHolder(View view, int i) {
        C7573i.m23587b(view, "itemView");
        super(view, i);
        this.f81262r = (DmtTextView) view.findViewById(R.id.e2s);
        this.f81263s = (ImageView) view.findViewById(R.id.dar);
    }

    /* renamed from: a */
    public final void mo81421a(Message message, Message message2, SelfStoryReplyContent selfStoryReplyContent, int i) {
        super.mo81421a(message, message2, selfStoryReplyContent, i);
        this.f81255m.setText(R.string.bqn);
        if (selfStoryReplyContent != null) {
            if (TextUtils.isEmpty(selfStoryReplyContent.getStoryReplyText())) {
                DmtTextView dmtTextView = this.f81262r;
                C7573i.m23582a((Object) dmtTextView, "mStoryReplyStatusText");
                dmtTextView.setVisibility(8);
            } else {
                DmtTextView dmtTextView2 = this.f81262r;
                C7573i.m23582a((Object) dmtTextView2, "mStoryReplyStatusText");
                dmtTextView2.setText(selfStoryReplyContent.getStoryReplyText());
                DmtTextView dmtTextView3 = this.f81262r;
                C7573i.m23582a((Object) dmtTextView3, "mStoryReplyStatusText");
                dmtTextView3.setVisibility(4);
            }
        }
        this.f81264t.mo81521a(this.f81201i);
    }
}
