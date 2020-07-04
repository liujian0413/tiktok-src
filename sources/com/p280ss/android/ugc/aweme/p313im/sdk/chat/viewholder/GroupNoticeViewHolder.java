package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.C30987r;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.GroupNoticeContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31863ai;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31913m;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.GroupNoticeViewHolder */
public final class GroupNoticeViewHolder extends BaseViewHolder<GroupNoticeContent> {
    public GroupNoticeViewHolder(View view, int i) {
        C7573i.m23587b(view, "itemView");
        super(view, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo81421a(Message message, Message message2, GroupNoticeContent groupNoticeContent, int i) {
        boolean z;
        C7573i.m23587b(message, "msg");
        super.mo81421a(message, message2, groupNoticeContent, i);
        if (groupNoticeContent != null) {
            Message message3 = this.f81201i;
            C7573i.m23582a((Object) message3, "currentMessage");
            Map ext = message3.getExt();
            if (ext != null) {
                z = ext.containsKey("group_notice_show");
            } else {
                z = false;
            }
            groupNoticeContent.setHasShow(z);
            String noticeText = groupNoticeContent.getNoticeText();
            if (groupNoticeContent.getType() != 100121) {
                View view = this.itemView;
                C7573i.m23582a((Object) view, "itemView");
                C30987r.m100844a(view.getContext(), this.f81194b, noticeText, null, groupNoticeContent, groupNoticeContent.getType(), null);
            } else {
                View view2 = this.itemView;
                C7573i.m23582a((Object) view2, "itemView");
                Context context = view2.getContext();
                TextView textView = this.f81194b;
                String string = C6399b.m19921a().getResources().getString(R.string.bl8);
                int type = groupNoticeContent.getType();
                Message message4 = this.f81201i;
                C7573i.m23582a((Object) message4, "currentMessage");
                C30987r.m100844a(context, textView, noticeText, string, groupNoticeContent, type, message4.getConversationId());
            }
            if (!groupNoticeContent.getHasShow()) {
                Message message5 = this.f81201i;
                C7573i.m23582a((Object) message5, "currentMessage");
                Map ext2 = message5.getExt();
                if (ext2 == null) {
                    ext2 = new HashMap();
                }
                ext2.put("group_notice_show", "show");
                Message message6 = this.f81201i;
                C7573i.m23582a((Object) message6, "currentMessage");
                message6.setExt(ext2);
                Message message7 = this.f81201i;
                C7573i.m23582a((Object) message7, "currentMessage");
                message7.setContent(C31913m.m103668a(groupNoticeContent));
                C31863ai.m103529a(this.f81201i);
            }
        }
    }
}
