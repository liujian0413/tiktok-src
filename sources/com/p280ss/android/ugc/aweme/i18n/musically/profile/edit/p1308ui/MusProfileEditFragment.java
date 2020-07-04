package com.p280ss.android.ugc.aweme.i18n.musically.profile.edit.p1308ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.p280ss.android.common.p288d.C19282c;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.i18n.musically.profile.edit.p1306a.C30529a;
import com.p280ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.ProfileEditFragment;
import com.p280ss.android.ugc.aweme.profile.presenter.C36046t;
import com.p280ss.android.ugc.aweme.profile.util.C36766w;
import com.p280ss.android.ugc.aweme.utils.C43020co;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.trill.p1763e.C44991a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.i18n.musically.profile.edit.ui.MusProfileEditFragment */
public class MusProfileEditFragment extends ProfileEditFragment implements C30536a, C36046t {

    /* renamed from: e */
    protected boolean f80231e;
    MusAvatarImageView mAvatarVideoImageView;
    ImageView mHeaderImageVideoIcon;
    RelativeLayout mRlAvatarChangeByVideo;

    /* renamed from: r */
    private C30529a f80232r;

    /* renamed from: a */
    public final int mo80262a() {
        return R.layout.aek;
    }

    /* renamed from: a */
    public final void mo61681a(String str) {
    }

    /* renamed from: e */
    public final void mo80186e() {
        this.f95073j = true;
        this.f95076m.mo91867a("");
        this.f95071h.mo91643a(this.f95076m.mo91866a());
        C23323e.m76515a((RemoteImageView) this.mAvatarVideoImageView, "", 0, 0);
        this.mHeaderImageVideoIcon.setImageDrawable(getResources().getDrawable(R.drawable.ae3));
    }

    /* access modifiers changed from: 0000 */
    public void editHeaderImageVideo() {
        String str;
        if (!C43020co.m136535a()) {
            User curUser = C21115b.m71197a().getCurUser();
            if (curUser != null) {
                if (curUser.getAvatarVideoUri() == null) {
                    str = null;
                } else {
                    str = curUser.getAvatarVideoUri().getUri();
                }
                if (TextUtils.isEmpty(str)) {
                    this.f80232r.mo80245a();
                } else {
                    this.f80232r.mo80248a(this.mAvatarVideoImageView);
                }
                C36766w.m118505a("replace_profile_video", "click_video");
            }
        }
    }

    /* renamed from: d */
    public final void mo80264d() {
        int i;
        super.mo80264d();
        if (this.f95075l != null) {
            RelativeLayout relativeLayout = this.mRlAvatarChangeByVideo;
            if (C43122ff.m136768b(this.f95075l)) {
                i = 8;
            } else {
                i = 0;
            }
            relativeLayout.setVisibility(i);
            if (this.mAvatarVideoImageView.getVisibility() == 0) {
                C23323e.m76505a((RemoteImageView) this.mAvatarVideoImageView, this.f95075l.getAvatarVideoUri());
            }
            if (this.f95075l.getAvatarVideoUri() == null || this.f95075l.getAvatarVideoUri().getUrlList() == null || this.f95075l.getAvatarVideoUri().getUrlList().size() == 0) {
                this.mHeaderImageVideoIcon.setImageDrawable(getResources().getDrawable(R.drawable.ae3));
            } else {
                this.mHeaderImageVideoIcon.setImageDrawable(getResources().getDrawable(R.drawable.ae4));
            }
        }
    }

    /* renamed from: a */
    public final void mo80263a(View view) {
        super.mo80263a(view);
        this.f80232r = new C30529a();
        this.f80232r.f94183c = this;
        this.f80232r.mo80246a((Activity) getActivity(), (Fragment) this);
        this.mAvatarVideoImageView.mo60914a(true, false);
    }

    /* renamed from: b */
    public final void mo80181b(AvatarUri avatarUri) {
        if (isViewValid() && getActivity() != null) {
            this.f80232r.mo91617g();
            if (this.f95071h == null || avatarUri == null) {
                C10761a.m31399c((Context) getActivity(), (int) R.string.d0).mo25750a();
            } else {
                this.f95076m.mo91867a(avatarUri.uri);
            }
        }
    }

    /* renamed from: a */
    public final void mo61679a(AvatarUri avatarUri) {
        if (this.f95071h == null || avatarUri == null || C23477d.m77081a((Collection<T>) avatarUri.urlList) || TextUtils.isEmpty((CharSequence) avatarUri.urlList.get(0))) {
            this.f95072i.mo91617g();
            C10761a.m31399c((Context) getActivity(), (int) R.string.d0).mo25750a();
            return;
        }
        this.f95074k = true;
        this.f95073j = true;
        this.f95072i.mo91617g();
        this.f95076m.f94398d = avatarUri.uri;
        C23323e.m76525b(this.mHeaderImage, (String) avatarUri.urlList.get(0), (int) C9738o.m28708b(getContext(), 84.0f), (int) C9738o.m28708b(getContext(), 84.0f));
    }

    /* renamed from: b */
    public final void mo80182b(Exception exc) {
        mo92271i();
        if (isViewValid() && this.f80232r != null) {
            if ((exc instanceof ApiServerException) && ((ApiServerException) exc).getErrorCode() == 20022) {
                C19282c.m63182a(getActivity(), "profile_image_setting", "review_failure");
            }
            C22814a.m75245a(getActivity(), exc, R.string.d0);
            C44991a.m141961a(exc.getMessage(), "avatar");
        }
    }

    /* renamed from: a */
    public final void mo61680a(Exception exc) {
        mo92271i();
        if (isViewValid() && this.f95072i != null) {
            if ((exc instanceof ApiServerException) && ((ApiServerException) exc).getErrorCode() == 20022) {
                C19282c.m63182a(getActivity(), "profile_image_setting", "review_failure");
            }
            C22814a.m75245a(getActivity(), exc, R.string.d0);
        }
    }

    /* renamed from: b */
    public final void mo80183b(String str) {
        if (isViewValid() && getActivity() != null) {
            this.f95073j = true;
            this.f80231e = true;
            this.mAvatarVideoImageView.setVisibility(0);
            try {
                StringBuilder sb = new StringBuilder("file://");
                sb.append(str);
                Uri parse = Uri.parse(sb.toString());
                C13380c.m39172c().mo33181b(parse);
                C23323e.m76515a((RemoteImageView) this.mAvatarVideoImageView, parse.toString(), 0, 0);
                this.mHeaderImageVideoIcon.setImageDrawable(getResources().getDrawable(R.drawable.ae4));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo66086a(User user, int i) {
        super.mo66086a(user, i);
        this.f95074k = true;
        if (i == 112) {
            this.f95075l.setAvatarVideoUri(user.getAvatarVideoUri());
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1000 && i != 1001 && !this.f80232r.mo80249a(i, i2, intent)) {
        }
    }
}
