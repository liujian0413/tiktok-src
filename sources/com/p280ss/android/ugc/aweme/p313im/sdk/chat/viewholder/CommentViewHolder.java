package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.C6425b;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.C30987r;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.C30987r.C30991b;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.C30987r.C30991b.C30992a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.CommentContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31891bc;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.EnableEndEllipsizeTextView;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.CommentViewHolder */
public class CommentViewHolder extends BaseViewHolder<CommentContent> {

    /* renamed from: m */
    protected EnableEndEllipsizeTextView f81222m;

    /* renamed from: n */
    protected C30991b f81223n;

    /* renamed from: o */
    private RemoteImageView f81224o;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo81423b() {
        super.mo81423b();
    }

    /* renamed from: f */
    private void m100925f() {
        if (this.f81223n == null) {
            this.f81223n = new C30991b(C6399b.m19921a().getResources().getColor(R.color.u3));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo81420a() {
        super.mo81420a();
        this.f81224o = (RemoteImageView) this.itemView.findViewById(R.id.cbm);
        this.f81222m = (EnableEndEllipsizeTextView) this.itemView.findViewById(R.id.dkn);
        this.f81197e = this.itemView.findViewById(R.id.a1q);
    }

    public CommentViewHolder(View view, int i) {
        super(view, i);
        m100925f();
    }

    /* renamed from: a */
    public final void mo81433a(IMUser iMUser, Message message, int i) {
        IMUser iMUser2;
        super.mo81433a(iMUser, message, i);
        Resources resources = C6399b.m19921a().getResources();
        if (C7074e.m22068a(String.valueOf(message.getSender()))) {
            iMUser2 = C6961d.m21657a().mo18029b(String.valueOf(C6425b.m20074a(message.getConversationId())));
        } else {
            User c = C7074e.m22071c();
            if (c == null) {
                c = new User();
            }
            iMUser2 = IMUser.fromUser(c);
        }
        if (iMUser2 == null) {
            iMUser2 = new IMUser();
        }
        String nickName = iMUser2.getNickName();
        if (nickName == null) {
            nickName = "";
        } else if (nickName.length() > 4) {
            StringBuilder sb = new StringBuilder();
            sb.append(nickName.substring(0, 4));
            sb.append("...");
            nickName = sb.toString();
        }
        this.f81223n.f81146a = iMUser2.getUid();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(resources.getString(R.string.bgt));
        sb2.append(nickName);
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(resources.getString(R.string.bn3, new Object[]{sb3}));
        sb4.append(((CommentContent) this.f81198f).getComment());
        C30987r.m100848a(this.f81222m, sb4.toString(), sb3, this.f81223n, new C30992a() {
            /* renamed from: a */
            public final void mo81381a() {
                C7195s a = C7195s.m22438a();
                Activity activity = (Activity) CommentViewHolder.this.itemView.getContext();
                StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
                sb.append(((CommentContent) CommentViewHolder.this.f81198f).getAwemeId());
                a.mo18679a(activity, C7203u.m22460a(sb.toString()).mo18694a("refer", "chat").mo18694a("video_from", "from_chat").mo18694a("cid", ((CommentContent) CommentViewHolder.this.f81198f).getCommentId()).mo18695a());
            }

            /* renamed from: b */
            public final void mo81383b(View view) {
                CommentViewHolder.this.f81197e.performLongClick();
            }

            /* renamed from: a */
            public final void mo81382a(View view) {
                C31891bc.m103605a(CommentViewHolder.this.f81223n.f81146a);
            }
        });
    }

    /* renamed from: a */
    public void mo81421a(Message message, Message message2, CommentContent commentContent, int i) {
        super.mo81421a(message, message2, commentContent, i);
        C23323e.m76524b(this.f81224o, commentContent.getCoverUrl());
        this.f81197e.setTag(50331648, Integer.valueOf(14));
    }
}
