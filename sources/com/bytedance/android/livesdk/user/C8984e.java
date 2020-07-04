package com.bytedance.android.livesdk.user;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.live.base.model.user.C2379k;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import java.util.HashMap;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7329e;
import p346io.reactivex.C7492s;

/* renamed from: com.bytedance.android.livesdk.user.e */
public interface C8984e {
    /* renamed from: a */
    IUser mo22165a();

    /* renamed from: a */
    C7319aa<User> mo22166a(HashMap<String, String> hashMap);

    /* renamed from: a */
    C7492s<IUser> mo22167a(Context context, C8987h hVar);

    /* renamed from: a */
    C7492s<FollowPair> mo22168a(C8976b bVar);

    /* renamed from: a */
    C7492s<FollowPair> mo22169a(C8980d dVar);

    /* renamed from: a */
    C7492s<FollowPair> mo22170a(C8991j jVar);

    /* renamed from: a */
    C7492s<FollowPair> mo22171a(C8994k kVar);

    /* renamed from: a */
    String mo22172a(long j);

    /* renamed from: a */
    void mo22173a(int i);

    /* renamed from: a */
    void mo22174a(IUser iUser);

    /* renamed from: a */
    void mo22175a(FollowPair followPair);

    /* renamed from: a */
    void mo22176a(String str, OnClickListener onClickListener, Context context, String str2, String str3, long j, boolean z);

    /* renamed from: a */
    void mo22177a(boolean z);

    /* renamed from: a */
    boolean mo22178a(LiveInteractFunction liveInteractFunction);

    /* renamed from: b */
    long mo22179b();

    /* renamed from: b */
    C7319aa<User> mo22180b(long j);

    /* renamed from: c */
    C7492s<IUser> mo22181c(long j);

    /* renamed from: c */
    boolean mo22182c();

    /* renamed from: d */
    C7329e<C2379k> mo22183d();

    /* renamed from: d */
    C7492s<FollowPair> mo22184d(long j);

    /* renamed from: e */
    C7319aa<IUser> mo22185e();

    /* renamed from: f */
    C7492s<IUser> mo22186f();

    /* renamed from: g */
    C7492s<FollowPair> mo22187g();
}
