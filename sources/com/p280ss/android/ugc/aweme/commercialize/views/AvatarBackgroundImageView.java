package com.p280ss.android.ugc.aweme.commercialize.views;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.p022v4.app.Fragment;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.facebook.drawee.generic.C13438a;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.commercialize.log.C24974r;
import com.p280ss.android.ugc.aweme.commercialize.p1127g.C24752a;
import com.p280ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.presenter.C36011ai;
import com.p280ss.android.ugc.aweme.profile.presenter.C36039m;
import com.p280ss.android.ugc.aweme.profile.presenter.C36046t;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.AvatarBackgroundImageView */
public class AvatarBackgroundImageView extends RemoteImageView implements C36039m, C36046t {

    /* renamed from: a */
    private C24752a f66993a;

    /* renamed from: b */
    private C36011ai f66994b;

    /* renamed from: c */
    private Activity f66995c;

    /* renamed from: d */
    private boolean f66996d;

    /* renamed from: a */
    public final void mo66088a(String str, boolean z) {
    }

    /* renamed from: a */
    public final void mo66089a(boolean z) {
    }

    /* renamed from: b */
    public final void mo66090b() {
        setOnClickListener(new C25512b(this));
    }

    /* renamed from: c */
    public final void mo66091c() {
        if (this.f66993a != null) {
            this.f66993a.mo64753c();
        }
        if (this.f66993a != null) {
            this.f66993a.f65202a = null;
        }
    }

    public AvatarBackgroundImageView(Context context) {
        super(context);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo66085a(View view) {
        this.f66993a.mo64747a();
    }

    /* renamed from: a */
    public final void mo61679a(AvatarUri avatarUri) {
        if (this.f66993a != null) {
            this.f66993a.mo64753c();
        }
        if (this.f66994b == null || avatarUri == null) {
            C10761a.m31409e(getContext(), (int) R.string.d81).mo25750a();
            return;
        }
        User curUser = C21115b.m71197a().getCurUser();
        if (!C43122ff.m136784o(curUser)) {
            this.f66994b.mo91642a(avatarUri.uri, 2);
            this.f66996d = true;
            return;
        }
        UrlModel urlModel = new UrlModel();
        urlModel.setUri(avatarUri.uri);
        urlModel.setUrlList(avatarUri.urlList);
        curUser.getCommerceInfo().setHeadImageUrl(urlModel);
        C23323e.m76524b(this, urlModel);
        C10761a.m31383a(getContext(), (int) R.string.d7m).mo25750a();
        C24974r.m21444a("aweme_header_image_upload_error_rate", 0, (JSONObject) null);
    }

    /* renamed from: a */
    public final void mo61680a(Exception exc) {
        if ((!(this.f66995c instanceof AmeActivity) || ((AmeActivity) this.f66995c).isViewValid()) && this.f66993a != null) {
            this.f66993a.mo64753c();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("exception", exc.toString());
            } catch (Exception unused) {
            }
            C24974r.m21444a("aweme_header_image_upload_error_rate", 1, jSONObject);
            C22814a.m75245a(getContext(), exc, R.string.d81);
        }
    }

    /* renamed from: a */
    public final void mo61681a(String str) {
        if (this.f66993a != null) {
            this.f66993a.mo64752b(str);
        }
    }

    public AvatarBackgroundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AvatarBackgroundImageView(Context context, C13438a aVar) {
        super(context, aVar);
    }

    /* renamed from: a */
    public final void mo66086a(User user, int i) {
        if (this.f66996d) {
            C10761a.m31383a(getContext(), (int) R.string.d7m).mo25750a();
            this.f66994b.mo91645a();
        }
        this.f66996d = false;
    }

    /* renamed from: a */
    public final void mo66084a(Activity activity, Fragment fragment) {
        this.f66995c = activity;
        this.f66993a = new C24752a();
        this.f66993a.f65202a = this;
        this.f66993a.mo64748a(activity, fragment);
        this.f66994b = new C36011ai();
        this.f66994b.f94200a = this;
        if (!C21115b.m71197a().hasUpdated()) {
            this.f66994b.mo91645a();
        }
    }

    /* renamed from: a */
    public final void mo66087a(Exception exc, int i) {
        if (this.f66996d) {
            C10761a.m31409e(getContext(), (int) R.string.d81).mo25750a();
            C22814a.m75245a(getContext(), exc, R.string.d80);
        }
        this.f66996d = false;
    }

    /* renamed from: a */
    public final void mo66083a(int i, int i2, Intent intent) {
        if (!this.f66993a.mo64750a(i, i2, intent)) {
        }
    }
}
