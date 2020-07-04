package com.p280ss.android.ugc.aweme.notification.newstyle.viewholder;

import android.support.constraint.ConstraintLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageWithVerify;
import com.p280ss.android.ugc.aweme.experiment.C27688b;
import com.p280ss.android.ugc.aweme.follow.widet.C29548a;
import com.p280ss.android.ugc.aweme.follow.widet.C29548a.C29556e;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.notification.newstyle.C34538e;
import com.p280ss.android.ugc.aweme.notification.newstyle.adapter.LikeListAdapter;
import com.p280ss.android.ugc.aweme.notification.util.C34615d;
import com.p280ss.android.ugc.aweme.notification.view.NotificationFollowUserBtn;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C43126fg;
import com.p280ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.viewholder.LikeListHolder */
public final class LikeListHolder extends MTNewBaseNotificationHolder implements OnClickListener {

    /* renamed from: d */
    static final /* synthetic */ C7595j[] f90166d = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(LikeListHolder.class), "mRoot", "getMRoot()Landroid/support/constraint/ConstraintLayout;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(LikeListHolder.class), "mAiHead", "getMAiHead()Lcom/ss/android/ugc/aweme/base/ui/AvatarImageWithVerify;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(LikeListHolder.class), "mTvName", "getMTvName()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(LikeListHolder.class), "mTvContent", "getMTvContent()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(LikeListHolder.class), "mFollow", "getMFollow()Lcom/ss/android/ugc/aweme/notification/view/NotificationFollowUserBtn;"))};

    /* renamed from: e */
    public final String f90167e;

    /* renamed from: f */
    private final C7541d f90168f;

    /* renamed from: g */
    private final C7541d f90169g;

    /* renamed from: k */
    private final C7541d f90170k;

    /* renamed from: l */
    private final C7541d f90171l;

    /* renamed from: m */
    private final C7541d f90172m;

    /* renamed from: n */
    private final ConcurrentHashMap<String, Boolean> f90173n = new ConcurrentHashMap<>();

    /* renamed from: o */
    private C29548a f90174o;

    /* renamed from: p */
    private User f90175p;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.viewholder.LikeListHolder$a */
    static final class C34565a extends Lambda implements C7561a<AvatarImageWithVerify> {

        /* renamed from: a */
        final /* synthetic */ View f90177a;

        C34565a(View view) {
            this.f90177a = view;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public AvatarImageWithVerify invoke() {
            return (AvatarImageWithVerify) this.f90177a.findViewById(R.id.c6v);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.viewholder.LikeListHolder$b */
    static final class C34566b extends Lambda implements C7561a<NotificationFollowUserBtn> {

        /* renamed from: a */
        final /* synthetic */ View f90178a;

        C34566b(View view) {
            this.f90178a = view;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public NotificationFollowUserBtn invoke() {
            return (NotificationFollowUserBtn) this.f90178a.findViewById(R.id.c6n);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.viewholder.LikeListHolder$c */
    static final class C34567c extends Lambda implements C7561a<ConstraintLayout> {

        /* renamed from: a */
        final /* synthetic */ View f90179a;

        C34567c(View view) {
            this.f90179a = view;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ConstraintLayout invoke() {
            return (ConstraintLayout) this.f90179a.findViewById(R.id.c7r);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.viewholder.LikeListHolder$d */
    static final class C34568d extends Lambda implements C7561a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ View f90180a;

        C34568d(View view) {
            this.f90180a = view;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtTextView invoke() {
            return (DmtTextView) this.f90180a.findViewById(R.id.c60);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.viewholder.LikeListHolder$e */
    static final class C34569e extends Lambda implements C7561a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ View f90181a;

        C34569e(View view) {
            this.f90181a = view;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtTextView invoke() {
            return (DmtTextView) this.f90181a.findViewById(R.id.c7d);
        }
    }

    /* renamed from: d */
    private final ConstraintLayout m111742d() {
        return (ConstraintLayout) this.f90168f.getValue();
    }

    /* renamed from: e */
    private final AvatarImageWithVerify m111743e() {
        return (AvatarImageWithVerify) this.f90169g.getValue();
    }

    /* renamed from: f */
    private final DmtTextView m111744f() {
        return (DmtTextView) this.f90170k.getValue();
    }

    /* renamed from: g */
    private final DmtTextView m111745g() {
        return (DmtTextView) this.f90171l.getValue();
    }

    /* renamed from: h */
    private final NotificationFollowUserBtn m111746h() {
        return (NotificationFollowUserBtn) this.f90172m.getValue();
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C7573i.m23587b(view, "v");
        if (!C34585b.m111816a(C6399b.m19921a())) {
            C10761a.m31399c(this.f89761c, (int) R.string.cjs).mo25750a();
            return;
        }
        User user = this.f90175p;
        if (user != null) {
            int id = view.getId();
            if (id == R.id.c6n || id == R.id.q7) {
                C29548a aVar = this.f90174o;
                if (aVar != null) {
                    aVar.mo75559a(user.getUid(), user.getSecUid(), user.getFollowStatus(), user.getFollowerStatus());
                }
            } else {
                if (id == R.id.c7r) {
                    String uid = user.getUid();
                    C7573i.m23582a((Object) uid, "uid");
                    String secUid = user.getSecUid();
                    C7573i.m23582a((Object) secUid, "secUid");
                    MTNewBaseNotificationHolder.m111761a((MTNewBaseNotificationHolder) this, uid, secUid, (BaseNotice) null, false, this.f90167e, 12, (Object) null);
                    LikeListAdapter.f89996e.mo87814a(getAdapterPosition());
                }
            }
        }
    }

    public LikeListHolder(View view) {
        String str;
        C7573i.m23587b(view, "itemView");
        super(view);
        this.f90168f = C7546e.m23569a(new C34567c(view));
        this.f90169g = C7546e.m23569a(new C34565a(view));
        this.f90170k = C7546e.m23569a(new C34569e(view));
        this.f90171l = C7546e.m23569a(new C34568d(view));
        this.f90172m = C7546e.m23569a(new C34566b(view));
        if (C27688b.m90837a()) {
            str = "notification_page";
        } else {
            str = "message_like";
        }
        this.f90167e = str;
        ConstraintLayout d = m111742d();
        C7573i.m23582a((Object) d, "mRoot");
        C34538e.m111690b(d);
        C34615d.m111861a((View) m111746h());
        OnClickListener onClickListener = this;
        m111742d().setOnClickListener(onClickListener);
        m111746h().setOnClickListener(onClickListener);
        this.f90174o = new C29548a(m111746h(), new C29556e(this) {

            /* renamed from: a */
            final /* synthetic */ LikeListHolder f90176a;

            /* renamed from: a */
            public final String mo68099a() {
                return this.f90176a.f90167e;
            }

            {
                this.f90176a = r1;
            }

            /* renamed from: a */
            public final void mo67853a(int i, User user) {
                String str;
                super.mo67853a(i, user);
                if (user != null) {
                    if (i == 0) {
                        str = "follow_cancel";
                    } else {
                        str = "follow";
                    }
                    ((LogHelper) ServiceManager.get().getService(LogHelper.class)).logFollowUserEvent(str, this.f90176a.f90167e, user.getUid());
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo87865a(User user) {
        String str;
        C7573i.m23587b(user, "user");
        this.f90175p = user;
        DmtTextView f = m111744f();
        C7573i.m23582a((Object) f, "mTvName");
        f.setText(user.getNickname());
        DmtTextView g = m111745g();
        C7573i.m23582a((Object) g, "mTvContent");
        StringBuilder sb = new StringBuilder("@");
        if (TextUtils.isEmpty(user.getUniqueId())) {
            str = user.getShortId();
        } else {
            str = user.getUniqueId();
        }
        sb.append(str);
        g.setText(sb.toString());
        UserVerify userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getWeiboVerify());
        m111743e().setUserData(userVerify);
        m111746h().setFollowStatus(user.getFollowStatus());
        C29548a aVar = this.f90174o;
        if (aVar != null) {
            aVar.mo75558a(user);
        }
        if (C6399b.m19944t()) {
            m111743e().mo60896b();
            C43126fg.m136801a(this.f89761c, user.getCustomVerify(), user.getEnterpriseVerifyReason(), m111744f());
        }
    }
}
