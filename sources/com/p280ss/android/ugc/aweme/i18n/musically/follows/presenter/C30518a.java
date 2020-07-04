package com.p280ss.android.ugc.aweme.i18n.musically.follows.presenter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.i18n.musically.follows.presenter.a */
final class C30518a extends BaseAdapter<User> {

    /* renamed from: a */
    public C30519a f80199a;

    /* renamed from: b */
    private String f80200b = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();

    /* renamed from: com.ss.android.ugc.aweme.i18n.musically.follows.presenter.a$a */
    interface C30519a {
        /* renamed from: a */
        void mo80227a(int i);

        /* renamed from: b */
        void mo80228b(int i);
    }

    C30518a() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final User mo80226b(int i) {
        if (i < 0) {
            return null;
        }
        List a = mo62312a();
        if (a == null || a.size() <= i) {
            return null;
        }
        return (User) a.get(i);
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        C30525f fVar = new C30525f(viewGroup);
        fVar.f80215a = this.f80199a;
        return fVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo80225a(String str, int i) {
        List a = mo62312a();
        if (a != null && !TextUtils.isEmpty(str)) {
            for (int i2 = 0; i2 < a.size(); i2++) {
                User user = (User) a.get(i2);
                if (str.equals(user.getUid())) {
                    user.setFollowStatus(i);
                    notifyItemChanged(i2);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        String str;
        String str2;
        UrlModel urlModel;
        C30525f fVar = (C30525f) vVar;
        User b = mo80226b(i);
        if (b != null) {
            str = b.getNickname();
        } else {
            str = "";
        }
        fVar.mo80240a(str);
        if (b == null) {
            str2 = "";
        } else if (TextUtils.isEmpty(b.getUniqueId())) {
            str2 = b.getShortId();
        } else {
            str2 = b.getUniqueId();
        }
        fVar.mo80242b(str2);
        if (b != null) {
            urlModel = b.getAvatarThumb();
        } else {
            urlModel = null;
        }
        fVar.mo80239a(urlModel);
        fVar.mo80241a(C43122ff.m136783n(b), C43122ff.m136782m(b));
        if (b == null || C6319n.m19594a(b.getUid(), this.f80200b)) {
            fVar.mo80237a();
        } else {
            fVar.mo80238a(b.getFollowStatus());
        }
    }
}
