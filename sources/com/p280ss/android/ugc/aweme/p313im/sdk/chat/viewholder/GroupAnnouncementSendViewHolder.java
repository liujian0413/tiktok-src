package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.GroupAnnouncementContent;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.GroupAnnouncementSendViewHolder */
public final class GroupAnnouncementSendViewHolder extends GroupAnnouncementViewHolder {

    /* renamed from: m */
    private C31050o f81240m;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo81420a() {
        super.mo81420a();
        this.f81195c = (ImageView) mo81425a((int) R.id.dar);
        this.f81240m = new C31050o(this.f81195c);
    }

    /* renamed from: a */
    public final void mo81424a(OnClickListener onClickListener) {
        C7573i.m23587b(onClickListener, "onClickListener");
        super.mo81424a(onClickListener);
        this.f81195c.setOnClickListener(onClickListener);
        this.f81202j.mo82725a(this.f81195c);
    }

    public GroupAnnouncementSendViewHolder(View view, int i) {
        C7573i.m23587b(view, "itemView");
        super(view, i);
    }

    /* renamed from: a */
    public final void mo81421a(Message message, Message message2, GroupAnnouncementContent groupAnnouncementContent, int i) {
        super.mo81421a(message, message2, groupAnnouncementContent, i);
        C31050o oVar = this.f81240m;
        if (oVar == null) {
            C7573i.m23583a("statusIcon");
        }
        oVar.mo81521a(this.f81201i);
    }
}
