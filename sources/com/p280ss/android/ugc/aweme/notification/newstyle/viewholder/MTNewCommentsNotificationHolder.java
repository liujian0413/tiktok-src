package com.p280ss.android.ugc.aweme.notification.newstyle.viewholder;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.drawee.generic.C13438a;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageWithVerify;
import com.p280ss.android.ugc.aweme.base.p308ui.SmartRoundImageView;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice;
import com.p280ss.android.ugc.aweme.notification.newstyle.C34538e;
import com.p280ss.android.ugc.aweme.notification.p1436e.C34439a;
import com.p280ss.android.ugc.aweme.notification.util.C34626j;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.utils.C43012cg;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewCommentsNotificationHolder */
public final class MTNewCommentsNotificationHolder extends MTNewBaseNotificationHolder implements OnClickListener {

    /* renamed from: d */
    public static final C34575a f90197d = new C34575a(null);

    /* renamed from: e */
    private final View f90198e;

    /* renamed from: f */
    private final AvatarImageWithVerify f90199f;

    /* renamed from: g */
    private final TextView f90200g;

    /* renamed from: k */
    private final TextView f90201k;

    /* renamed from: l */
    private final View f90202l;

    /* renamed from: m */
    private final View f90203m;

    /* renamed from: n */
    private final TextView f90204n;

    /* renamed from: o */
    private final SmartRoundImageView f90205o;

    /* renamed from: p */
    private CommentNotice f90206p;

    /* renamed from: q */
    private BaseNotice f90207q;

    /* renamed from: r */
    private String f90208r;

    /* renamed from: s */
    private String f90209s;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewCommentsNotificationHolder$a */
    public static final class C34575a {
        private C34575a() {
        }

        public /* synthetic */ C34575a(C7571f fVar) {
            this();
        }
    }

    public MTNewCommentsNotificationHolder(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.c7r);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.notification_root)");
        this.f90198e = findViewById;
        View findViewById2 = view.findViewById(R.id.c6v);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.notification_head)");
        this.f90199f = (AvatarImageWithVerify) findViewById2;
        View findViewById3 = view.findViewById(R.id.c7d);
        C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.notification_name)");
        this.f90200g = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.c60);
        C7573i.m23582a((Object) findViewById4, "itemView.findViewById(R.id.notification_content)");
        this.f90201k = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.c7o);
        C7573i.m23582a((Object) findViewById5, "itemView.findViewById(R.…fication_reply_container)");
        this.f90202l = findViewById5;
        View findViewById6 = view.findViewById(R.id.crx);
        C7573i.m23582a((Object) findViewById6, "itemView.findViewById(R.id.reply_divider)");
        this.f90203m = findViewById6;
        View findViewById7 = view.findViewById(R.id.c7p);
        C7573i.m23582a((Object) findViewById7, "itemView.findViewById(R.…tification_reply_content)");
        this.f90204n = (TextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.c61);
        C7573i.m23582a((Object) findViewById8, "itemView.findViewById(R.id.notification_cover)");
        this.f90205o = (SmartRoundImageView) findViewById8;
        C34538e.m111690b(this.f90198e);
        C34626j.m111876a(this.f90199f);
        C34626j.m111876a(this.f90205o);
        C34538e.m111689a((View) this.f90205o);
        OnClickListener onClickListener = this;
        this.f90205o.setOnClickListener(onClickListener);
        this.f90198e.setOnClickListener(onClickListener);
        this.f90199f.setOnClickListener(onClickListener);
        this.f90199f.setRequestImgSize(C43012cg.m136513a(BaseNotice.HASHTAG));
        ((C13438a) this.f90205o.getHierarchy()).mo32898b((int) R.color.ee);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0070  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m111780b(android.text.SpannableStringBuilder r8) {
        /*
            r7 = this;
            java.lang.String r0 = "contentBuilder"
            kotlin.jvm.internal.C7573i.m23587b(r8, r0)
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r0 = r7.f90206p
            r1 = 0
            if (r0 == 0) goto L_0x00d0
            int r2 = r0.getCommentType()
            r3 = 5
            r4 = 2131825277(0x7f11127d, float:1.9283406E38)
            if (r2 == r3) goto L_0x00c4
            r3 = 7
            r5 = 1
            r6 = 58
            if (r2 == r3) goto L_0x00a6
            r3 = 14
            if (r2 == r3) goto L_0x009a
            switch(r2) {
                case 0: goto L_0x00c4;
                case 1: goto L_0x00c4;
                default: goto L_0x0021;
            }
        L_0x0021:
            r3 = 2131825280(0x7f111280, float:1.9283412E38)
            switch(r2) {
                case 9: goto L_0x007c;
                case 10: goto L_0x007c;
                case 11: goto L_0x009a;
                case 12: goto L_0x0034;
                default: goto L_0x0027;
            }
        L_0x0027:
            android.content.Context r0 = r7.f89761c
            java.lang.String r0 = r0.getString(r3)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r8.append(r0)
            goto L_0x00c3
        L_0x0034:
            com.ss.android.ugc.aweme.comment.model.Comment r2 = r0.getReplyComment()
            r4 = 0
            if (r2 == 0) goto L_0x0046
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.getUser()
            if (r2 == 0) goto L_0x0046
            java.lang.String r2 = r2.getUid()
            goto L_0x0047
        L_0x0046:
            r2 = r4
        L_0x0047:
            if (r2 == 0) goto L_0x0070
            android.content.Context r2 = r7.f89761c
            r3 = 2131826225(0x7f111631, float:1.9285328E38)
            java.lang.Object[] r6 = new java.lang.Object[r5]
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r0.getReplyComment()
            if (r0 == 0) goto L_0x0060
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getUser()
            if (r0 == 0) goto L_0x0060
            java.lang.String r4 = r0.getUid()
        L_0x0060:
            java.lang.String r0 = java.lang.String.valueOf(r4)
            r6[r1] = r0
            java.lang.String r0 = r2.getString(r3, r6)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r8.append(r0)
            goto L_0x00c3
        L_0x0070:
            android.content.Context r0 = r7.f89761c
            java.lang.String r0 = r0.getString(r3)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r8.append(r0)
            goto L_0x00c3
        L_0x007c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.Context r1 = r7.f89761c
            r2 = 2131823276(0x7f110aac, float:1.9279347E38)
            java.lang.String r1 = r1.getString(r2)
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r8.append(r0)
            goto L_0x00c3
        L_0x009a:
            android.content.Context r0 = r7.f89761c
            java.lang.String r0 = r0.getString(r4)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r8.append(r0)
            goto L_0x00c3
        L_0x00a6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.Context r1 = r7.f89761c
            r2 = 2131821888(0x7f110540, float:1.9276532E38)
            java.lang.String r1 = r1.getString(r2)
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r8.append(r0)
        L_0x00c3:
            return r5
        L_0x00c4:
            android.content.Context r0 = r7.f89761c
            java.lang.String r0 = r0.getString(r4)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r8.append(r0)
            return r1
        L_0x00d0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewCommentsNotificationHolder.m111780b(android.text.SpannableStringBuilder):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0051, code lost:
        if (r0 == null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0067, code lost:
        if (r0 != null) goto L_0x006c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m111779a(android.text.SpannableStringBuilder r14) {
        /*
            r13 = this;
            java.lang.String r0 = "contentBuilder"
            kotlin.jvm.internal.C7573i.m23587b(r14, r0)
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r0 = r13.f90206p
            if (r0 == 0) goto L_0x014d
            com.ss.android.ugc.aweme.comment.model.Comment r1 = r0.getReplyComment()
            if (r1 == 0) goto L_0x014c
            android.view.View r2 = r13.f90202l
            r3 = 0
            r2.setVisibility(r3)
            int r2 = r0.getCommentType()
            r4 = 12
            if (r2 != r4) goto L_0x00ed
            com.ss.android.ugc.aweme.framework.services.ServiceManager r2 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IUserService> r4 = com.p280ss.android.ugc.aweme.framework.services.IUserService.class
            java.lang.Object r2 = r2.getService(r4)
            java.lang.String r4 = "ServiceManager.get().get…IUserService::class.java)"
            kotlin.jvm.internal.C7573i.m23582a(r2, r4)
            com.ss.android.ugc.aweme.framework.services.IUserService r2 = (com.p280ss.android.ugc.aweme.framework.services.IUserService) r2
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.getCurrentUser()
            android.widget.TextView r4 = r13.f90204n
            if (r2 == 0) goto L_0x005d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r2 = com.p280ss.android.ugc.aweme.notification.newstyle.C34538e.m111685a(r2)
            r5.append(r2)
            java.lang.String r2 = ": "
            r5.append(r2)
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r0.getLevel1Comment()
            if (r0 == 0) goto L_0x0053
            java.lang.String r0 = r0.getText()
            if (r0 != 0) goto L_0x0055
        L_0x0053:
            java.lang.String r0 = ""
        L_0x0055:
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            goto L_0x006c
        L_0x005d:
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r0.getLevel1Comment()
            if (r0 == 0) goto L_0x006a
            java.lang.String r0 = r0.getText()
            if (r0 == 0) goto L_0x006a
            goto L_0x006c
        L_0x006a:
            java.lang.String r0 = ""
        L_0x006c:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r4.setText(r0)
            com.ss.android.ugc.aweme.profile.model.User r0 = r1.getUser()
            if (r0 == 0) goto L_0x0132
            com.ss.android.ugc.aweme.profile.model.User r0 = r1.getUser()
            java.lang.String r2 = "user"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            java.lang.String r0 = r0.getUid()
            if (r0 == 0) goto L_0x008a
            int r3 = r0.length()
        L_0x008a:
            com.ss.android.ugc.aweme.profile.model.User r0 = r1.getUser()
            java.lang.String r2 = "user"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            java.lang.String r0 = r0.getUid()
            r2 = -1
            if (r0 == 0) goto L_0x00b9
            r4 = r14
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            com.ss.android.ugc.aweme.profile.model.User r0 = r1.getUser()
            java.lang.String r5 = "user"
            kotlin.jvm.internal.C7573i.m23582a(r0, r5)
            java.lang.String r5 = r0.getUid()
            java.lang.String r0 = "user.uid"
            kotlin.jvm.internal.C7573i.m23582a(r5, r0)
            r6 = 0
            r7 = 0
            r8 = 4
            r9 = 0
            int r0 = kotlin.text.C7634n.m23730a(r4, r5, r6, r7, r8, r9)
            r7 = r0
            goto L_0x00ba
        L_0x00b9:
            r7 = -1
        L_0x00ba:
            if (r7 == r2) goto L_0x0132
            com.ss.android.ugc.aweme.profile.model.User r0 = r1.getUser()
            java.lang.String r2 = "user"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            java.lang.String r0 = com.p280ss.android.ugc.aweme.notification.newstyle.C34538e.m111685a(r0)
            int r3 = r3 + r7
            r2 = r0
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r14.replace(r7, r3, r2)
            android.widget.TextView r5 = r13.f90201k
            int r0 = r0.length()
            int r8 = r7 + r0
            com.ss.android.ugc.aweme.profile.model.User r9 = r1.getUser()
            java.lang.String r0 = "user"
            kotlin.jvm.internal.C7573i.m23582a(r9, r0)
            com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r10 = r13.f90207q
            java.lang.String r11 = r13.f90208r
            java.lang.String r12 = r13.f90209s
            r4 = r13
            r6 = r14
            r4.mo87866a(r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0132
        L_0x00ed:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r14 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.notice.api.helper.NoticeCommentHelperService> r0 = com.p280ss.android.ugc.aweme.notice.api.helper.NoticeCommentHelperService.class
            java.lang.Object r14 = r14.getService(r0)
            com.ss.android.ugc.aweme.notice.api.helper.NoticeCommentHelperService r14 = (com.p280ss.android.ugc.aweme.notice.api.helper.NoticeCommentHelperService) r14
            android.widget.TextView r0 = r13.f90204n
            com.ss.android.ugc.aweme.profile.model.User r2 = r1.getUser()
            if (r2 == 0) goto L_0x0129
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.ss.android.ugc.aweme.profile.model.User r4 = r1.getUser()
            java.lang.String r5 = "user"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            java.lang.String r4 = com.p280ss.android.ugc.aweme.notification.newstyle.C34538e.m111685a(r4)
            r2.append(r4)
            java.lang.String r4 = ": "
            r2.append(r4)
            java.lang.String r14 = r14.getDisplayText(r1, r3)
            r2.append(r14)
            java.lang.String r14 = r2.toString()
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            goto L_0x012f
        L_0x0129:
            java.lang.String r14 = r14.getDisplayText(r1, r3)
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
        L_0x012f:
            r0.setText(r14)
        L_0x0132:
            android.widget.TextView r14 = r13.f90204n
            java.lang.CharSequence r14 = r14.getText()
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 != 0) goto L_0x0144
            android.widget.TextView r14 = r13.f90204n
            com.p280ss.android.ugc.aweme.emoji.smallemoji.p1208a.C27608b.m90502a(r14)
            goto L_0x014c
        L_0x0144:
            android.view.View r14 = r13.f90202l
            r0 = 8
            r14.setVisibility(r0)
            goto L_0x014d
        L_0x014c:
            return
        L_0x014d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewCommentsNotificationHolder.m111779a(android.text.SpannableStringBuilder):void");
    }

    public final void onClick(View view) {
        int i;
        CommentNotice commentNotice;
        int i2;
        ClickInstrumentation.onClick(view);
        if (!C34588d.m111819a(C6399b.m19921a())) {
            C10761a.m31399c(this.f89761c, (int) R.string.cjs).mo25750a();
            return;
        }
        CommentNotice commentNotice2 = this.f90206p;
        if (commentNotice2 != null) {
            String str = "click";
            String str2 = "comment";
            BaseNotice baseNotice = this.f90207q;
            if (baseNotice != null) {
                i = baseNotice.clientOrder;
            } else {
                i = -1;
            }
            BaseNotice baseNotice2 = this.f90207q;
            BaseNotice baseNotice3 = this.f90207q;
            Integer num = null;
            if (baseNotice3 != null) {
                commentNotice = baseNotice3.getCommentNotice();
            } else {
                commentNotice = null;
            }
            mo87648a(str, str2, i, baseNotice2, true, m111129a(commentNotice), this.f90209s, this.f90208r);
            if (view != null) {
                num = Integer.valueOf(view.getId());
            }
            if (num != null && num.intValue() == R.id.c6v) {
                Comment comment = commentNotice2.getComment();
                C7573i.m23582a((Object) comment, "it.comment");
                User user = comment.getUser();
                C7573i.m23582a((Object) user, "it.comment.user");
                String uid = user.getUid();
                C7573i.m23582a((Object) uid, "it.comment.user.uid");
                Comment comment2 = commentNotice2.getComment();
                C7573i.m23582a((Object) comment2, "it.comment");
                User user2 = comment2.getUser();
                C7573i.m23582a((Object) user2, "it.comment.user");
                String secUid = user2.getSecUid();
                C7573i.m23582a((Object) secUid, "it.comment.user.secUid");
                MTNewBaseNotificationHolder.m111761a((MTNewBaseNotificationHolder) this, uid, secUid, this.f90207q, false, (String) null, 24, (Object) null);
            } else {
                if ((num != null && num.intValue() == R.id.c7r) || (num != null && num.intValue() == R.id.c61)) {
                    if (m111135a(commentNotice2.getCommentType())) {
                        Context context = view.getContext();
                        C7573i.m23582a((Object) context, "v.context");
                        String forwardId = commentNotice2.getForwardId();
                        C7573i.m23582a((Object) forwardId, "it.forwardId");
                        String str3 = "message";
                        Comment comment3 = commentNotice2.getComment();
                        C7573i.m23582a((Object) comment3, "it.comment");
                        String cid = comment3.getCid();
                        C7573i.m23582a((Object) cid, "it.comment.cid");
                        Aweme aweme = commentNotice2.getAweme();
                        if (aweme != null) {
                            i2 = aweme.getEnterpriseType();
                        } else {
                            i2 = 0;
                        }
                        m111778a(context, forwardId, str3, cid, i2);
                    } else {
                        Aweme aweme2 = commentNotice2.getAweme();
                        C7573i.m23582a((Object) aweme2, "it.aweme");
                        String aid = aweme2.getAid();
                        C7573i.m23582a((Object) aid, "it.aweme.aid");
                        Comment comment4 = commentNotice2.getComment();
                        C7573i.m23582a((Object) comment4, "it.comment");
                        mo87869a(aid, comment4.getCid());
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0118  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87872a(com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r10, boolean r11, java.lang.String r12, java.lang.String r13) {
        /*
            r9 = this;
            java.lang.String r11 = "notice"
            kotlin.jvm.internal.C7573i.m23587b(r10, r11)
            java.lang.String r11 = "enterFrom"
            kotlin.jvm.internal.C7573i.m23587b(r13, r11)
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r11 = r10.getCommentNotice()
            if (r11 == 0) goto L_0x0147
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r11 = r10.getCommentNotice()
            java.lang.String r0 = "notice.commentNotice"
            kotlin.jvm.internal.C7573i.m23582a(r11, r0)
            com.ss.android.ugc.aweme.comment.model.Comment r11 = r11.getComment()
            if (r11 != 0) goto L_0x0021
            goto L_0x0147
        L_0x0021:
            r9.f90208r = r12
            r9.f90207q = r10
            r9.f90209s = r13
            java.lang.String r1 = "show"
            java.lang.String r2 = "comment"
            int r3 = r10.clientOrder
            r5 = 1
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r11 = r10.getCommentNotice()
            java.lang.String r6 = m111129a(r11)
            r0 = r9
            r4 = r10
            r7 = r13
            r8 = r12
            r0.mo87648a(r1, r2, r3, r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r11 = r10.getCommentNotice()
            r9.f90206p = r11
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r11 = r9.f90206p
            if (r11 == 0) goto L_0x0146
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r11.getComment()
            java.lang.String r1 = "it.comment"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getUser()
            com.ss.android.ugc.aweme.utils.UserVerify r7 = new com.ss.android.ugc.aweme.utils.UserVerify
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r0.getAvatarThumb()
            java.lang.String r3 = r0.getCustomVerify()
            java.lang.String r4 = r0.getEnterpriseVerifyReason()
            int r1 = r0.getVerificationType()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            java.lang.String r6 = r0.getWeiboVerify()
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify r0 = r9.f90199f
            r0.setUserData(r7)
            com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify r0 = r9.f90199f
            r0.mo60896b()
            android.widget.TextView r2 = r9.f90200g
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r11.getComment()
            java.lang.String r1 = "it.comment"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.profile.model.User r3 = r0.getUser()
            java.lang.String r0 = "it.comment.user"
            kotlin.jvm.internal.C7573i.m23582a(r3, r0)
            com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r4 = r9.f90207q
            r1 = r9
            r5 = r12
            r6 = r13
            r1.mo87867a(r2, r3, r4, r5, r6)
            com.ss.android.ugc.aweme.feed.model.Aweme r12 = r11.getAweme()
            if (r12 == 0) goto L_0x00e6
            com.ss.android.ugc.aweme.feed.model.Aweme r12 = r11.getAweme()
            java.lang.String r13 = "it.aweme"
            kotlin.jvm.internal.C7573i.m23582a(r12, r13)
            com.ss.android.ugc.aweme.feed.model.Video r12 = r12.getVideo()
            if (r12 == 0) goto L_0x00e6
            com.ss.android.ugc.aweme.feed.model.Aweme r12 = r11.getAweme()
            java.lang.String r13 = "it.aweme"
            kotlin.jvm.internal.C7573i.m23582a(r12, r13)
            com.ss.android.ugc.aweme.feed.model.Video r12 = r12.getVideo()
            java.lang.String r13 = "it.aweme.video"
            kotlin.jvm.internal.C7573i.m23582a(r12, r13)
            com.ss.android.ugc.aweme.base.model.UrlModel r12 = r12.getOriginCover()
            com.bytedance.lighten.core.a.a r12 = com.p280ss.android.ugc.aweme.base.C23400r.m76741a(r12)
            com.bytedance.lighten.core.r r12 = com.bytedance.lighten.core.C12133n.m35299a(r12)
            r13 = 500(0x1f4, float:7.0E-43)
            int[] r13 = com.p280ss.android.ugc.aweme.utils.C43012cg.m136513a(r13)
            com.bytedance.lighten.core.r r12 = r12.mo29853b(r13)
            java.lang.String r13 = "Notice"
            com.bytedance.lighten.core.r r12 = r12.mo29845a(r13)
            com.ss.android.ugc.aweme.base.ui.SmartRoundImageView r13 = r9.f90205o
            com.bytedance.lighten.core.i r13 = (com.bytedance.lighten.core.C12128i) r13
            com.bytedance.lighten.core.r r12 = r12.mo29844a(r13)
            r12.mo29848a()
        L_0x00e6:
            android.text.SpannableStringBuilder r12 = new android.text.SpannableStringBuilder
            r12.<init>()
            boolean r13 = r9.m111780b(r12)
            if (r13 == 0) goto L_0x00f5
            r9.m111779a(r12)     // Catch:{ Exception -> 0x00f5 }
            goto L_0x00fc
        L_0x00f5:
            android.view.View r13 = r9.f90202l
            r0 = 8
            r13.setVisibility(r0)
        L_0x00fc:
            java.lang.String r13 = " "
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            r12.append(r13)
            com.ss.android.ugc.aweme.comment.model.Comment r13 = r11.getComment()
            java.lang.String r0 = "it.comment"
            kotlin.jvm.internal.C7573i.m23582a(r13, r0)
            java.lang.String r13 = r13.getText()
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 != 0) goto L_0x012a
            com.ss.android.ugc.aweme.comment.model.Comment r11 = r11.getComment()
            java.lang.String r13 = "it.comment"
            kotlin.jvm.internal.C7573i.m23582a(r11, r13)
            java.lang.String r11 = r11.getText()
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            r12.append(r11)
        L_0x012a:
            android.widget.TextView r11 = r9.f90201k
            r13 = 7
            android.content.Context r0 = r9.f89761c
            int r0 = com.bytedance.common.utility.C9738o.m28691a(r0)
            android.content.Context r1 = r9.f89761c
            r2 = 1125384192(0x43140000, float:148.0)
            float r1 = com.bytedance.common.utility.C9738o.m28708b(r1, r2)
            int r1 = (int) r1
            int r0 = r0 - r1
            com.p280ss.android.ugc.aweme.notification.newstyle.viewholder.C34586c.m111818a(r11, r12, r10, r13, r0)
            android.widget.TextView r10 = r9.f90201k
            com.p280ss.android.ugc.aweme.emoji.smallemoji.p1208a.C27608b.m90502a(r10)
            return
        L_0x0146:
            return
        L_0x0147:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewCommentsNotificationHolder.mo87872a(com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice, boolean, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    private static void m111778a(Context context, String str, String str2, String str3, int i) {
        if (C34439a.f89873b.isFollowFeedEnterFullScreenDetail()) {
            C7195s a = C7195s.m22438a();
            if (context != null) {
                Activity activity = (Activity) context;
                StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
                sb.append(str);
                a.mo18679a(activity, C7203u.m22460a(sb.toString()).mo18693a("profile_enterprise_type", i).mo18694a("cid", str3).mo18694a("refer", str2).mo18694a("video_from", "from_launch_forward").mo18695a());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
        C7195s a2 = C7195s.m22438a();
        if (context != null) {
            Activity activity2 = (Activity) context;
            StringBuilder sb2 = new StringBuilder("aweme://aweme/detail/");
            sb2.append(str);
            a2.mo18679a(activity2, C7203u.m22460a(sb2.toString()).mo18694a("refer", str2).mo18694a("cid", str3).mo18695a());
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
    }
}
