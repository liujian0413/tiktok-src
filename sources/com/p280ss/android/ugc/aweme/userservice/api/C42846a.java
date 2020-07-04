package com.p280ss.android.ugc.aweme.userservice.api;

import com.bytedance.jedi.model.p599a.C11750c;
import com.bytedance.jedi.model.p601c.C11786e;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23084b;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.User;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7492s;

/* renamed from: com.ss.android.ugc.aweme.userservice.api.a */
public interface C42846a {
    /* renamed from: a */
    C11750c<String, User> mo104552a();

    /* renamed from: a */
    FollowStatus mo104553a(String str, String str2, int i, int i2, int i3, String str3, int i4, String str4) throws Exception;

    /* renamed from: a */
    C7319aa<FollowStatus> mo104554a(String str, String str2, int i, int i2, int i3, String str3, int i4);

    /* renamed from: a */
    C7492s<C11786e<User>> mo104555a(String str);

    /* renamed from: b */
    C23084b<FollowStatus> mo104556b();

    /* renamed from: b */
    C7492s<BaseResponse> mo104557b(String str);
}
