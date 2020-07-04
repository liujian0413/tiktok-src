package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.GroupInviteSendViewHolder */
public final class GroupInviteSendViewHolder extends GroupInviteViewHolder {

    /* renamed from: m */
    static final /* synthetic */ C7595j[] f81243m = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupInviteSendViewHolder.class), "statusIcon", "getStatusIcon()Lcom/ss/android/ugc/aweme/im/sdk/chat/viewholder/StatusIcon;"))};

    /* renamed from: r */
    private final C7541d f81244r = C7546e.m23569a(new C31013a(this));

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.GroupInviteSendViewHolder$a */
    static final class C31013a extends Lambda implements C7561a<C31050o> {

        /* renamed from: a */
        final /* synthetic */ GroupInviteSendViewHolder f81245a;

        C31013a(GroupInviteSendViewHolder groupInviteSendViewHolder) {
            this.f81245a = groupInviteSendViewHolder;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C31050o invoke() {
            return new C31050o(this.f81245a.f81195c);
        }
    }

    /* renamed from: f */
    private final C31050o m100963f() {
        return (C31050o) this.f81244r.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo81420a() {
        super.mo81420a();
        this.f81195c = (ImageView) this.itemView.findViewById(R.id.dar);
    }

    /* renamed from: a */
    public final void mo81424a(OnClickListener onClickListener) {
        super.mo81424a(onClickListener);
        this.f81195c.setOnClickListener(onClickListener);
        this.f81202j.mo82725a(this.f81195c);
    }

    public GroupInviteSendViewHolder(View view, int i) {
        C7573i.m23587b(view, "itemView");
        super(view, i);
    }

    /* renamed from: a */
    public final void mo81421a(Message message, Message message2, BaseContent baseContent, int i) {
        super.mo81421a(message, message2, baseContent, i);
        m100963f().mo81521a(this.f81201i);
    }
}
