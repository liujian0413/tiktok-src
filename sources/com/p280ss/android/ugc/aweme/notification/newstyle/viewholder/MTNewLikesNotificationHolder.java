package com.p280ss.android.ugc.aweme.notification.newstyle.viewholder;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.facebook.drawee.generic.C13438a;
import com.p280ss.android.ugc.aweme.C21668ba;
import com.p280ss.android.ugc.aweme.ILegacyService;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageWithVerify;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.SmartRoundImageView;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.p1208a.C27608b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.notice.api.helper.NoticeCommentHelperService;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.DiggNotice;
import com.p280ss.android.ugc.aweme.notification.adapter.LikeNotificationHolder;
import com.p280ss.android.ugc.aweme.notification.newstyle.C34538e;
import com.p280ss.android.ugc.aweme.notification.util.C34626j;
import com.p280ss.android.ugc.aweme.notification.utils.C34636e;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C43012cg;
import com.p280ss.android.ugc.aweme.utils.UserVerify;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewLikesNotificationHolder */
public final class MTNewLikesNotificationHolder extends MTNewBaseNotificationHolder implements OnClickListener {

    /* renamed from: d */
    private final View f90227d;

    /* renamed from: e */
    private final View f90228e;

    /* renamed from: f */
    private final AvatarImageWithVerify f90229f;

    /* renamed from: g */
    private final AvatarImageView f90230g;

    /* renamed from: k */
    private final AvatarImageView f90231k;

    /* renamed from: l */
    private final View f90232l;

    /* renamed from: m */
    private final TextView f90233m;

    /* renamed from: n */
    private final TextView f90234n;

    /* renamed from: o */
    private final SmartRoundImageView f90235o;

    /* renamed from: p */
    private final View f90236p;

    /* renamed from: q */
    private final TextView f90237q;

    /* renamed from: r */
    private DiggNotice f90238r;

    /* renamed from: s */
    private boolean f90239s = true;

    /* renamed from: t */
    private BaseNotice f90240t;

    /* renamed from: u */
    private String f90241u;

    /* renamed from: v */
    private String f90242v;

    /* renamed from: a */
    private final void m111788a(DiggNotice diggNotice) {
        String str;
        if (diggNotice.getDiggType() == 5 || diggNotice.getDiggType() == 6) {
            C34636e.m111895a(this.f89761c, diggNotice.getForwardId(), "message", diggNotice.getCid(), LikeNotificationHolder.m111198a(diggNotice));
            return;
        }
        Aweme aweme = diggNotice.getAweme();
        C7573i.m23582a((Object) aweme, "aweme");
        String aid = aweme.getAid();
        C7573i.m23582a((Object) aid, "aweme.aid");
        DiggNotice diggNotice2 = this.f90238r;
        if (diggNotice2 != null) {
            str = diggNotice2.getCid();
        } else {
            str = null;
        }
        mo87869a(aid, str);
    }

    public MTNewLikesNotificationHolder(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.c7r);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.notification_root)");
        this.f90227d = findViewById;
        View findViewById2 = view.findViewById(R.id.c6v);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.notification_head)");
        this.f90228e = findViewById2;
        View findViewById3 = view.findViewById(R.id.c6w);
        C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.…notification_head_single)");
        this.f90229f = (AvatarImageWithVerify) findViewById3;
        View findViewById4 = view.findViewById(R.id.c6x);
        C7573i.m23582a((Object) findViewById4, "itemView.findViewById(R.….notification_head_user1)");
        this.f90230g = (AvatarImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.c6y);
        C7573i.m23582a((Object) findViewById5, "itemView.findViewById(R.….notification_head_user2)");
        this.f90231k = (AvatarImageView) findViewById5;
        View findViewById6 = view.findViewById(R.id.crx);
        C7573i.m23582a((Object) findViewById6, "itemView.findViewById(R.id.reply_divider)");
        this.f90232l = findViewById6;
        View findViewById7 = view.findViewById(R.id.c7d);
        C7573i.m23582a((Object) findViewById7, "itemView.findViewById(R.id.notification_name)");
        this.f90233m = (TextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.c60);
        C7573i.m23582a((Object) findViewById8, "itemView.findViewById(R.id.notification_content)");
        this.f90234n = (TextView) findViewById8;
        View findViewById9 = view.findViewById(R.id.c61);
        C7573i.m23582a((Object) findViewById9, "itemView.findViewById(R.id.notification_cover)");
        this.f90235o = (SmartRoundImageView) findViewById9;
        View findViewById10 = view.findViewById(R.id.c7o);
        C7573i.m23582a((Object) findViewById10, "itemView.findViewById(R.…fication_reply_container)");
        this.f90236p = findViewById10;
        View findViewById11 = view.findViewById(R.id.c7p);
        C7573i.m23582a((Object) findViewById11, "itemView.findViewById(R.…tification_reply_content)");
        this.f90237q = (TextView) findViewById11;
        C34538e.m111690b(this.f90227d);
        C34626j.m111876a(this.f90228e);
        C34626j.m111876a(this.f90235o);
        OnClickListener onClickListener = this;
        this.f90227d.setOnClickListener(onClickListener);
        this.f90228e.setOnClickListener(onClickListener);
        this.f90229f.setOnClickListener(onClickListener);
        this.f90229f.setRequestImgSize(C43012cg.m136513a(BaseNotice.HASHTAG));
        this.f90235o.setOnClickListener(onClickListener);
        ((C13438a) this.f90235o.getHierarchy()).mo32898b((int) R.color.ee);
        C34538e.m111689a((View) this.f90235o);
    }

    public final void onClick(View view) {
        boolean z;
        Integer num;
        ClickInstrumentation.onClick(view);
        if (!C34591g.m111822a(C6399b.m19921a())) {
            C10761a.m31399c(this.f89761c, (int) R.string.cjs).mo25750a();
            return;
        }
        DiggNotice diggNotice = this.f90238r;
        if (diggNotice != null) {
            mo87668a("click", "like", this.f90240t, this.f90241u, this.f90242v);
            Object service = ServiceManager.get().getService(ILegacyService.class);
            C7573i.m23582a(service, "ServiceManager.get().get…egacyService::class.java)");
            C21668ba ugAllService = ((ILegacyService) service).getUgAllService();
            BaseNotice baseNotice = this.f90240t;
            if (baseNotice == null || baseNotice.timeLineType != 0) {
                z = false;
            } else {
                z = true;
            }
            ugAllService.mo57940b(z);
            if (view != null) {
                num = Integer.valueOf(view.getId());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == R.id.c61) {
                m111788a(diggNotice);
            } else if (num != null && num.intValue() == R.id.c6w) {
                List users = diggNotice.getUsers();
                if (users != null) {
                    User user = (User) C7525m.m23513g(users);
                    if (user != null) {
                        String uid = user.getUid();
                        if (uid != null) {
                            List users2 = diggNotice.getUsers();
                            if (users2 != null) {
                                User user2 = (User) C7525m.m23513g(users2);
                                if (user2 != null) {
                                    String secUid = user2.getSecUid();
                                    if (secUid != null) {
                                        MTNewBaseNotificationHolder.m111761a((MTNewBaseNotificationHolder) this, uid, secUid, this.f90240t, false, (String) null, 24, (Object) null);
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                long j = 0;
                if (num == null || num.intValue() != R.id.c6v) {
                    if (num != null && num.intValue() == R.id.c7r) {
                        if (diggNotice.getDiggType() == 5 || diggNotice.getDiggType() == 6) {
                            C34636e.m111895a(this.f89761c, diggNotice.getForwardId(), "message", diggNotice.getCid(), LikeNotificationHolder.m111198a(diggNotice));
                        } else if (!C34538e.m111693d() || diggNotice.getUsers().size() <= 1 || diggNotice.getDiggType() == 0) {
                            Aweme aweme = diggNotice.getAweme();
                            C7573i.m23582a((Object) aweme, "aweme");
                            String aid = aweme.getAid();
                            C7573i.m23582a((Object) aid, "aweme.aid");
                            mo87869a(aid, diggNotice.getCid());
                        } else {
                            Context context = view.getContext();
                            C7573i.m23582a((Object) context, "v.context");
                            Aweme aweme2 = diggNotice.getAweme();
                            Comment comment = diggNotice.getComment();
                            int diggType = diggNotice.getDiggType();
                            BaseNotice baseNotice2 = this.f90240t;
                            if (baseNotice2 != null) {
                                j = baseNotice2.getLastReadTime();
                            }
                            m111787a(context, aweme2, comment, diggType, j);
                        }
                    }
                } else if (!C34538e.m111693d() || diggNotice.getDiggType() == 0) {
                    List users3 = diggNotice.getUsers();
                    if (users3 != null) {
                        User user3 = (User) C7525m.m23513g(users3);
                        if (user3 != null) {
                            String uid2 = user3.getUid();
                            if (uid2 != null) {
                                List users4 = diggNotice.getUsers();
                                if (users4 != null) {
                                    User user4 = (User) C7525m.m23513g(users4);
                                    if (user4 != null) {
                                        String secUid2 = user4.getSecUid();
                                        if (secUid2 != null) {
                                            MTNewBaseNotificationHolder.m111761a((MTNewBaseNotificationHolder) this, uid2, secUid2, this.f90240t, false, (String) null, 24, (Object) null);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    Context context2 = view.getContext();
                    C7573i.m23582a((Object) context2, "v.context");
                    Aweme aweme3 = diggNotice.getAweme();
                    Comment comment2 = diggNotice.getComment();
                    int diggType2 = diggNotice.getDiggType();
                    BaseNotice baseNotice3 = this.f90240t;
                    if (baseNotice3 != null) {
                        j = baseNotice3.getLastReadTime();
                    }
                    m111787a(context2, aweme3, comment2, diggType2, j);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0019  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m111787a(android.content.Context r14, com.p280ss.android.ugc.aweme.feed.model.Aweme r15, com.p280ss.android.ugc.aweme.comment.model.Comment r16, int r17, long r18) {
        /*
            r13 = this;
            r1 = 0
            r2 = 3
            r7 = r17
            if (r7 != r2) goto L_0x0010
            if (r16 == 0) goto L_0x000e
            java.lang.String r3 = r16.getCid()
        L_0x000c:
            r5 = r3
            goto L_0x0017
        L_0x000e:
            r5 = r1
            goto L_0x0017
        L_0x0010:
            if (r15 == 0) goto L_0x000e
            java.lang.String r3 = r15.getAid()
            goto L_0x000c
        L_0x0017:
            if (r15 == 0) goto L_0x0020
            java.lang.String r3 = r15.getAid()
            r12 = r13
            r4 = r3
            goto L_0x0022
        L_0x0020:
            r12 = r13
            r4 = r1
        L_0x0022:
            boolean r6 = r12.f90239s
            java.lang.String r10 = com.p280ss.android.ugc.aweme.notification.newstyle.model.C34554a.m111727a(r16)
            if (r15 == 0) goto L_0x0034
            com.ss.android.ugc.aweme.feed.model.Video r0 = r15.getVideo()
            if (r0 == 0) goto L_0x0034
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r0.getOriginCover()
        L_0x0034:
            r11 = r1
            r3 = r14
            r7 = r17
            r8 = r18
            com.p280ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity.C34455a.m111439a(r3, r4, r5, r6, r7, r8, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewLikesNotificationHolder.m111787a(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.comment.model.Comment, int, long):void");
    }

    /* renamed from: a */
    public final void mo87875a(BaseNotice baseNotice, boolean z, boolean z2, String str, String str2) {
        String str3;
        C7573i.m23587b(baseNotice, "notice");
        C7573i.m23587b(str2, "enterFrom");
        if (baseNotice.getDiggNotice() != null) {
            this.f90240t = baseNotice;
            this.f90241u = str;
            this.f90242v = str2;
            mo87668a("show", "like", baseNotice, str, str2);
            this.f90239s = z2;
            this.f90238r = baseNotice.getDiggNotice();
            DiggNotice diggNotice = this.f90238r;
            if (diggNotice != null) {
                int size = diggNotice.getUsers().size();
                if (size > 0) {
                    mo87868a(this.f90233m, diggNotice.getUsers(), 1, diggNotice.getMergeCount(), this.f90240t, z2, str, str2);
                    if (size == 1) {
                        this.f90229f.setVisibility(0);
                        this.f90230g.setVisibility(8);
                        this.f90231k.setVisibility(8);
                        UserVerify userVerify = new UserVerify(((User) diggNotice.getUsers().get(0)).getAvatarThumb(), ((User) diggNotice.getUsers().get(0)).getCustomVerify(), ((User) diggNotice.getUsers().get(0)).getEnterpriseVerifyReason(), Integer.valueOf(((User) diggNotice.getUsers().get(0)).getVerificationType()), ((User) diggNotice.getUsers().get(0)).getWeiboVerify());
                        this.f90229f.setUserData(userVerify);
                        this.f90228e.setVisibility(8);
                        this.f90229f.mo60896b();
                    } else {
                        this.f90228e.setVisibility(0);
                        this.f90229f.setVisibility(8);
                        this.f90230g.setVisibility(0);
                        this.f90231k.setVisibility(0);
                        RemoteImageView remoteImageView = this.f90230g;
                        Object obj = diggNotice.getUsers().get(0);
                        C7573i.m23582a(obj, "it.users[0]");
                        C23323e.m76524b(remoteImageView, ((User) obj).getAvatarThumb());
                        RemoteImageView remoteImageView2 = this.f90231k;
                        Object obj2 = diggNotice.getUsers().get(1);
                        C7573i.m23582a(obj2, "it.users[1]");
                        C23323e.m76524b(remoteImageView2, ((User) obj2).getAvatarThumb());
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    int diggType = diggNotice.getDiggType();
                    if (diggType == 3 || diggType == 6) {
                        spannableStringBuilder.append(this.f89761c.getString(R.string.cpc));
                        Comment comment = diggNotice.getComment();
                        if (comment != null) {
                            NoticeCommentHelperService noticeCommentHelperService = (NoticeCommentHelperService) ServiceManager.get().getService(NoticeCommentHelperService.class);
                            if (comment.getUser() != null) {
                                StringBuilder sb = new StringBuilder();
                                User user = comment.getUser();
                                C7573i.m23582a((Object) user, "user");
                                sb.append(C34538e.m111685a(user));
                                sb.append(": ");
                                sb.append(noticeCommentHelperService.getDisplayText(comment, false));
                                str3 = sb.toString();
                            } else {
                                str3 = noticeCommentHelperService.getDisplayText(comment, false);
                            }
                            CharSequence charSequence = str3;
                            if (!TextUtils.isEmpty(charSequence)) {
                                this.f90236p.setVisibility(0);
                                this.f90237q.setText(charSequence);
                                C27608b.m90502a(this.f90237q);
                            } else {
                                this.f90236p.setVisibility(8);
                            }
                        }
                    } else {
                        spannableStringBuilder.append(this.f89761c.getString(R.string.cpd));
                        this.f90236p.setVisibility(8);
                    }
                    mo87667a(spannableStringBuilder, baseNotice);
                    this.f90234n.setText(spannableStringBuilder);
                    Aweme aweme = diggNotice.getAweme();
                    C7573i.m23582a((Object) aweme, "it.aweme");
                    Video video = aweme.getVideo();
                    C7573i.m23582a((Object) video, "it.aweme.video");
                    C12133n.m35299a(C23400r.m76741a(video.getOriginCover())).mo29853b(C43012cg.m136513a(VETransitionFilterParam.TransitionDuration_DEFAULT)).mo29845a("Notice").mo29844a((C12128i) this.f90235o).mo29848a();
                }
            }
        }
    }
}
