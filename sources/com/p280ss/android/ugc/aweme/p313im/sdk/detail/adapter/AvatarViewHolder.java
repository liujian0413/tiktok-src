package com.p280ss.android.ugc.aweme.p313im.sdk.detail.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.p263im.core.model.Member;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.p313im.sdk.BaseViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.group.model.C30753a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.group.model.IMMember;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C31090n;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6959c;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31878ax.C31882a;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;
import org.greenrobot.eventbus.C7705c;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.adapter.AvatarViewHolder */
public class AvatarViewHolder extends BaseViewHolder<C30753a> {

    /* renamed from: b */
    protected TextView f81802b;

    /* renamed from: c */
    public IMMember f81803c;

    /* renamed from: d */
    private RemoteImageView f81804d;

    /* renamed from: e */
    private String f81805e;

    /* renamed from: f */
    private C31882a f81806f;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.adapter.AvatarViewHolder$a */
    static final class C31184a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AvatarViewHolder f81807a;

        C31184a(AvatarViewHolder avatarViewHolder) {
            this.f81807a = avatarViewHolder;
        }

        public final void onClick(View view) {
            IMUser iMUser;
            ClickInstrumentation.onClick(view);
            IMMember iMMember = this.f81807a.f81803c;
            IMUser iMUser2 = null;
            if (iMMember != null) {
                iMUser = iMMember.getUser();
            } else {
                iMUser = null;
            }
            if (iMUser != null) {
                View view2 = this.f81807a.itemView;
                C7573i.m23582a((Object) view2, "itemView");
                Context context = view2.getContext();
                C7573i.m23582a((Object) context, "itemView.context");
                IMMember iMMember2 = this.f81807a.f81803c;
                if (iMMember2 != null) {
                    iMUser2 = iMMember2.getUser();
                }
                if (iMUser2 == null) {
                    C7573i.m23580a();
                }
                C6959c.m21652a(context, (IMContact) iMUser2, "group_setting");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final TextView mo81663e() {
        TextView textView = this.f81802b;
        if (textView == null) {
            C7573i.m23583a("mNameView");
        }
        return textView;
    }

    /* renamed from: h */
    private final void m101635h() {
        RemoteImageView remoteImageView = this.f81804d;
        if (remoteImageView == null) {
            C7573i.m23583a("mAvatarView");
        }
        remoteImageView.setOnClickListener(new C31184a(this));
    }

    /* renamed from: f */
    public final void mo81664f() {
        if (!TextUtils.isEmpty(this.f81805e) && !C7705c.m23799a().mo20392b((Object) this)) {
            C7705c.m23799a().mo20389a((Object) this);
        }
    }

    /* renamed from: g */
    public final void mo81665g() {
        if (C7705c.m23799a().mo20392b((Object) this)) {
            C7705c.m23799a().mo20393c((Object) this);
        }
    }

    /* renamed from: b */
    public void mo80310b() {
        super.mo80310b();
        View findViewById = this.itemView.findViewById(R.id.ba9);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.iv_member_avatar)");
        this.f81804d = (RemoteImageView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.dxq);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.tv_member_name)");
        this.f81802b = (TextView) findViewById2;
    }

    /* renamed from: c */
    public final void mo80311c() {
        C31882a n = C31882a.m103579n();
        C7573i.m23582a((Object) n, "TouchAnimationUtils.AlphaAnimTouchHandle.obtain()");
        this.f81806f = n;
        C31882a aVar = this.f81806f;
        if (aVar == null) {
            C7573i.m23583a("mAlphaAnimTouchHandle");
        }
        View[] viewArr = new View[1];
        RemoteImageView remoteImageView = this.f81804d;
        if (remoteImageView == null) {
            C7573i.m23583a("mAvatarView");
        }
        viewArr[0] = remoteImageView;
        aVar.mo82725a(viewArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0026  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m101634a(com.p280ss.android.ugc.aweme.p313im.sdk.chat.group.model.IMMember r4) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r3.f81804d
            if (r0 != 0) goto L_0x0009
            java.lang.String r1 = "mAvatarView"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0009:
            r1 = 0
            if (r4 == 0) goto L_0x0017
            com.ss.android.ugc.aweme.im.service.model.IMUser r2 = r4.getUser()
            if (r2 == 0) goto L_0x0017
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r2.getDisplayAvatar()
            goto L_0x0018
        L_0x0017:
            r2 = r1
        L_0x0018:
            com.p280ss.android.ugc.aweme.base.C23323e.m76524b(r0, r2)
            android.widget.TextView r0 = r3.f81802b
            if (r0 != 0) goto L_0x0024
            java.lang.String r2 = "mNameView"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x0024:
            if (r4 == 0) goto L_0x002a
            java.lang.String r1 = r4.getMemberDisplayName()
        L_0x002a:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.detail.adapter.AvatarViewHolder.m101634a(com.ss.android.ugc.aweme.im.sdk.chat.group.model.IMMember):void");
    }

    @C7709l
    public final void onUserUpdate(C31090n nVar) {
        C7573i.m23587b(nVar, "event");
        if (TextUtils.equals(this.f81805e, nVar.f81584a)) {
            IMUser b = C6961d.m21657a().mo18029b(nVar.f81584a);
            if (b != null) {
                IMMember iMMember = this.f81803c;
                if (iMMember != null) {
                    IMUser user = iMMember.getUser();
                    if (user != null) {
                        user.copy(b);
                    }
                }
                m101634a(this.f81803c);
            }
        }
    }

    public AvatarViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        super(viewGroup, i);
    }

    /* renamed from: a */
    public void mo80309a(C30753a aVar, int i) {
        Long l;
        super.mo80309a(aVar, i);
        if (aVar instanceof IMMember) {
            IMMember iMMember = (IMMember) aVar;
            this.f81803c = iMMember;
            RemoteImageView remoteImageView = this.f81804d;
            if (remoteImageView == null) {
                C7573i.m23583a("mAvatarView");
            }
            C23323e.m76503a(remoteImageView, (int) R.drawable.a_j);
            if (iMMember.getUser() == null) {
                Member member = iMMember.getMember();
                if (member != null) {
                    l = Long.valueOf(member.getUid());
                } else {
                    l = null;
                }
                String valueOf = String.valueOf(l);
                IMUser a = C6961d.m21657a().mo18022a(valueOf, false);
                if (a != null) {
                    iMMember.setUser(a);
                } else {
                    this.f81805e = valueOf;
                }
            }
            m101634a(iMMember);
            m101635h();
        }
    }
}
