package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.StoryReplyContent;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.StoryReplySendViewHolder */
public final class StoryReplySendViewHolder extends StoryReplyReceiveViewHolder {

    /* renamed from: m */
    private DmtTextView f81409m;

    /* renamed from: n */
    private C31050o f81410n;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo81420a() {
        super.mo81420a();
        View findViewById = this.itemView.findViewById(R.id.e2s);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.tv_story_reply_status)");
        this.f81409m = (DmtTextView) findViewById;
        this.f81195c = (ImageView) this.itemView.findViewById(R.id.dar);
        this.f81410n = new C31050o(this.f81195c);
    }

    /* renamed from: a */
    public final void mo81424a(OnClickListener onClickListener) {
        super.mo81424a(onClickListener);
        this.f81195c.setOnClickListener(onClickListener);
        this.f81202j.mo82725a(this.f81195c);
    }

    public StoryReplySendViewHolder(View view, int i) {
        C7573i.m23587b(view, "itemView");
        super(view, i);
    }

    /* renamed from: a */
    public final void mo81421a(Message message, Message message2, StoryReplyContent storyReplyContent, int i) {
        super.mo81421a(message, message2, storyReplyContent, i);
        if (storyReplyContent == null || TextUtils.isEmpty(storyReplyContent.getStoryReplyText())) {
            DmtTextView dmtTextView = this.f81409m;
            if (dmtTextView == null) {
                C7573i.m23583a("mStoryReplyStatusText");
            }
            dmtTextView.setVisibility(8);
        } else {
            DmtTextView dmtTextView2 = this.f81409m;
            if (dmtTextView2 == null) {
                C7573i.m23583a("mStoryReplyStatusText");
            }
            dmtTextView2.setText(storyReplyContent.getStoryReplyText());
            DmtTextView dmtTextView3 = this.f81409m;
            if (dmtTextView3 == null) {
                C7573i.m23583a("mStoryReplyStatusText");
            }
            dmtTextView3.setVisibility(4);
        }
        C31050o oVar = this.f81410n;
        if (oVar == null) {
            C7573i.m23583a("mStatusIcon");
        }
        oVar.mo81521a(this.f81201i);
    }
}
