package com.p280ss.android.ugc.aweme.friends.p1283c;

import android.net.Uri;
import com.C1642a;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.p254b.C6304f;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.framework.p1276e.C29960a;
import com.p280ss.android.ugc.aweme.friends.invite.SmgSettingsModel;
import com.p280ss.android.ugc.aweme.friends.model.ContactModel;
import com.p280ss.android.ugc.aweme.friends.model.InviteContactFriendsModel;
import com.p280ss.android.ugc.aweme.friends.model.InviteContactFriendsModel.IFetchShareConfigCallback;
import com.p280ss.android.ugc.aweme.friends.model.InviteContactFriendsModel.InviteFriendsCallback;
import com.p280ss.android.ugc.aweme.friends.p1282b.C30036a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.c.c */
public final class C30041c implements IFetchShareConfigCallback {

    /* renamed from: a */
    private final InviteContactFriendsModel f79012a;

    /* renamed from: b */
    private final WeakReference<C30042a> f79013b;

    /* renamed from: c */
    private SmgSettingsModel f79014c;

    /* renamed from: com.ss.android.ugc.aweme.friends.c.c$a */
    public interface C30042a {
        /* renamed from: e */
        void mo76303e();
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.c.c$b */
    public interface C30043b {
        /* renamed from: a */
        void mo76304a(String str);
    }

    public final void onFailed() {
    }

    /* renamed from: a */
    public final void mo76293a() {
        this.f79012a.fetchShareConfig(this);
    }

    /* renamed from: b */
    public final boolean mo76297b() {
        if (this.f79014c == null || !this.f79014c.isShowInviteAll()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo76298c() {
        if (this.f79014c == null || !this.f79014c.isFloatInviteAll()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final int mo76299d() {
        if (this.f79014c == null) {
            return VideoCacheTTnetProxyTimeoutExperiment.DEFAULT;
        }
        return this.f79014c.getLimitInviteAllCount();
    }

    /* renamed from: e */
    public final String mo76300e() {
        String str;
        try {
            str = this.f79014c.getUrl();
        } catch (Exception unused) {
            str = null;
        }
        if (C6319n.m19593a(str)) {
            return "https://m.tiktok.com/invitef/download";
        }
        return str;
    }

    public final void onSuccess(SmgSettingsModel smgSettingsModel) {
        this.f79014c = smgSettingsModel;
        C30042a aVar = (C30042a) this.f79013b.get();
        if (aVar != null) {
            aVar.mo76303e();
        }
    }

    /* renamed from: a */
    public final String mo76292a(String str) {
        try {
            return this.f79014c.getText().replaceFirst("\\%@", str);
        } catch (Exception unused) {
            return C1642a.m8034a(C29960a.m98230a().getString(R.string.agf), new Object[]{str});
        } catch (Throwable unused2) {
            return C29960a.m98230a().getString(R.string.agf);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m98502a(C30043b bVar, String str) {
        if (bVar != null) {
            bVar.mo76304a(str);
        }
    }

    public C30041c(InviteContactFriendsModel inviteContactFriendsModel, C30042a aVar) {
        this.f79012a = inviteContactFriendsModel;
        this.f79013b = new WeakReference<>(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo76296b(String str, C30043b bVar) {
        String str2;
        try {
            str2 = this.f79012a.shortenUrl(str).getUrl();
        } catch (Exception unused) {
            str2 = null;
        }
        if (!C6319n.m19593a(str2)) {
            str = str2;
        }
        C6726a.m20844b(new C30045e(bVar, str));
    }

    /* renamed from: a */
    public final void mo76295a(String str, C30043b bVar) {
        C6304f.submitRunnable(new C30044d(this, str, bVar));
    }

    /* renamed from: a */
    public final void mo76294a(User user, List<ContactModel> list, String str, InviteFriendsCallback inviteFriendsCallback) {
        if (user != null) {
            this.f79012a.inviteFriends(C43122ff.m136777h(user), list, str, inviteFriendsCallback);
        }
    }

    /* renamed from: a */
    public static String m98501a(String str, String str2, String str3, String str4, boolean z) {
        String str5;
        User curUser = C21115b.m71197a().getCurUser();
        if (C6319n.m19593a(str)) {
            return " ";
        }
        int c = C30036a.m98493b().mo76284c();
        if (!z) {
            str5 = "0";
        } else if (c == 1) {
            str5 = "system";
        } else {
            str5 = "manual";
        }
        if (C6319n.m19593a(str2)) {
            str2 = "0";
        }
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter("user_id", C43122ff.m136788s(curUser)).appendQueryParameter("enter_from", str4).appendQueryParameter("invitemode", str3).appendQueryParameter("invitesystem", str5).appendQueryParameter("platform", str2).appendQueryParameter("copytype", "0").build().toString();
        } catch (Exception unused) {
            return str;
        }
    }
}
