package com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel;

import android.text.TextUtils;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.f */
public final class C29853f {

    /* renamed from: a */
    public List<IMUser> f78426a = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.f$a */
    static final class C29854a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C29853f f78427a;

        C29854a(C29853f fVar) {
            this.f78427a = fVar;
        }

        public final /* synthetic */ Object call() {
            m97632a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97632a() {
            C29853f fVar = this.f78427a;
            IIMService g = C30553b.m99810g();
            C7573i.m23582a((Object) g, "IM.get()");
            List<IMUser> allFollowIMUsers = g.getAllFollowIMUsers();
            C7573i.m23582a((Object) allFollowIMUsers, "IM.get().allFollowIMUsers");
            fVar.f78426a = allFollowIMUsers;
        }
    }

    /* renamed from: a */
    public final void mo75833a() {
        C1592h.m7853a((Callable<TResult>) new C29854a<TResult>(this));
    }

    /* renamed from: a */
    public final List<IMUser> mo75832a(String str) {
        C7573i.m23587b(str, "keyWord");
        if (TextUtils.isEmpty(str)) {
            return new ArrayList<>();
        }
        List<IMUser> searchFollowIMUser = C30553b.m99810g().searchFollowIMUser(this.f78426a, str);
        C7573i.m23582a((Object) searchFollowIMUser, "IM.get().searchFollowIMUser(mIMUserList, keyWord)");
        return searchFollowIMUser;
    }
}
