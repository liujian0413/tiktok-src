package com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.AppImageUri;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarWithBorderView;
import com.p280ss.android.ugc.aweme.base.p308ui.CircleImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.a */
public final class C39630a extends FrameLayout {

    /* renamed from: a */
    private View f103040a;

    /* renamed from: b */
    private View f103041b;

    /* renamed from: c */
    private AvatarWithBorderView f103042c;

    /* renamed from: d */
    private CircleImageView f103043d;

    /* renamed from: e */
    private CircleImageView f103044e;

    /* renamed from: f */
    private DmtTextView f103045f;

    /* renamed from: g */
    private DmtTextView f103046g;

    public final View getGroupBottomLine() {
        return this.f103041b;
    }

    public final View getGroupRightLine() {
        return this.f103040a;
    }

    public final CircleImageView getIvOriginMusicCover() {
        return this.f103044e;
    }

    public final AvatarWithBorderView getMAvatarView() {
        return this.f103042c;
    }

    public final CircleImageView getMMusicCoverView() {
        return this.f103043d;
    }

    public final DmtTextView getTvMusic() {
        return this.f103046g;
    }

    public final DmtTextView getTvName() {
        return this.f103045f;
    }

    /* renamed from: a */
    private final void m126904a() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.b36, this, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(cont…w_fake_feed, this, false)");
        this.f103040a = inflate.findViewById(R.id.at4);
        this.f103041b = inflate.findViewById(R.id.asu);
        this.f103042c = (AvatarWithBorderView) inflate.findViewById(R.id.e8m);
        this.f103043d = (CircleImageView) inflate.findViewById(R.id.c1_);
        this.f103044e = (CircleImageView) inflate.findViewById(R.id.c9e);
        this.f103045f = (DmtTextView) inflate.findViewById(R.id.dyg);
        this.f103046g = (DmtTextView) inflate.findViewById(R.id.dy7);
        AvatarWithBorderView avatarWithBorderView = this.f103042c;
        if (avatarWithBorderView != null) {
            avatarWithBorderView.setBorderColor(R.color.dy);
        }
        View view = this.f103040a;
        if (view != null) {
            view.setVisibility(4);
        }
        addView(inflate);
        m126905b();
    }

    /* renamed from: b */
    private final void m126905b() {
        UrlModel urlModel;
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        C7573i.m23582a((Object) iUserService, "service");
        User currentUser = iUserService.getCurrentUser();
        UrlModel urlModel2 = null;
        if (currentUser != null) {
            urlModel = currentUser.getAvatarThumb();
        } else {
            urlModel = null;
        }
        if (urlModel != null) {
            C23323e.m76506a((RemoteImageView) this.f103042c, currentUser.getAvatarThumb(), (int) C9738o.m28708b(getContext(), 49.0f), (int) C9738o.m28708b(getContext(), 49.0f));
        } else {
            C23323e.m76504a((RemoteImageView) this.f103042c, AppImageUri.m76615a((int) R.drawable.a_j));
        }
        DmtTextView dmtTextView = this.f103045f;
        if (dmtTextView != null) {
            StringBuilder sb = new StringBuilder("@");
            sb.append(m126903a(currentUser));
            dmtTextView.setText(sb.toString());
        }
        RemoteImageView remoteImageView = this.f103044e;
        if (currentUser != null) {
            urlModel2 = currentUser.getAvatarThumb();
        }
        C23323e.m76506a(remoteImageView, urlModel2, 27, 27);
        C23323e.m76503a((RemoteImageView) this.f103043d, (int) R.drawable.a_i);
        if (C6399b.m19947w()) {
            DmtTextView dmtTextView2 = this.f103046g;
            if (dmtTextView2 != null) {
                StringBuilder sb2 = new StringBuilder("@");
                sb2.append(m126903a(currentUser));
                sb2.append(" ");
                Context context = getContext();
                C7573i.m23582a((Object) context, "context");
                sb2.append(context.getResources().getString(R.string.cre));
                dmtTextView2.setText(sb2.toString());
            }
            return;
        }
        DmtTextView dmtTextView3 = this.f103046g;
        if (dmtTextView3 != null) {
            StringBuilder sb3 = new StringBuilder();
            Context context2 = getContext();
            C7573i.m23582a((Object) context2, "context");
            sb3.append(context2.getResources().getString(R.string.cre));
            sb3.append(" - ");
            sb3.append(m126903a(currentUser));
            dmtTextView3.setText(sb3.toString());
        }
    }

    public final void setGroupBottomLine(View view) {
        this.f103041b = view;
    }

    public final void setGroupRightLine(View view) {
        this.f103040a = view;
    }

    public final void setIvOriginMusicCover(CircleImageView circleImageView) {
        this.f103044e = circleImageView;
    }

    public final void setMAvatarView(AvatarWithBorderView avatarWithBorderView) {
        this.f103042c = avatarWithBorderView;
    }

    public final void setMMusicCoverView(CircleImageView circleImageView) {
        this.f103043d = circleImageView;
    }

    public final void setTvMusic(DmtTextView dmtTextView) {
        this.f103046g = dmtTextView;
    }

    public final void setTvName(DmtTextView dmtTextView) {
        this.f103045f = dmtTextView;
    }

    public C39630a(Context context) {
        C7573i.m23587b(context, "context");
        super(context);
        m126904a();
    }

    /* renamed from: a */
    public final void mo98871a(boolean z) {
        int i;
        View view = this.f103040a;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            view.setVisibility(i);
        }
    }

    /* renamed from: b */
    public final void mo98872b(boolean z) {
        int i;
        View view = this.f103041b;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            view.setVisibility(i);
        }
    }

    /* renamed from: a */
    private static String m126903a(User user) {
        CharSequence charSequence;
        String str = null;
        if (C6399b.m19946v()) {
            if (user != null) {
                charSequence = user.getUniqueId();
            } else {
                charSequence = null;
            }
            if (TextUtils.isEmpty(charSequence)) {
                if (user != null) {
                    str = user.getShortId();
                }
            } else if (user != null) {
                str = user.getUniqueId();
            }
        } else if (user != null) {
            str = user.getNickname();
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        if (C6399b.m19944t()) {
            return "tiktok";
        }
        return "抖音";
    }
}
