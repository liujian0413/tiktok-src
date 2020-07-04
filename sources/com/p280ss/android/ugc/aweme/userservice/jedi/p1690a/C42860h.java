package com.p280ss.android.ugc.aweme.userservice.jedi.p1690a;

import com.bytedance.jedi.model.p599a.C11750c;
import com.bytedance.jedi.model.p601c.C11783b;
import com.bytedance.jedi.model.p601c.C11785d;
import com.bytedance.jedi.model.p601c.C11786e;
import com.bytedance.jedi.model.p602d.C11790b;
import com.bytedance.jedi.model.p603e.C11801a.C11805b;
import com.bytedance.jedi.model.repository.C11994b;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C7563m;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7496w;

/* renamed from: com.ss.android.ugc.aweme.userservice.jedi.a.h */
public final class C42860h extends C11994b {

    /* renamed from: a */
    private final C42856d f111350a = new C42856d();

    /* renamed from: b */
    private final C42848a f111351b = new C42848a();

    /* renamed from: c */
    private final C42858f f111352c = new C42858f();

    /* renamed from: d */
    private final C42859g f111353d;

    /* renamed from: b */
    public final C7492s<List<Pair<String, User>>> mo104567b() {
        return C11783b.m34514a((C11750c<K, V>) this.f111353d).mo29343a(true, (C11785d<?, ?>[]) new C11785d[0]);
    }

    /* renamed from: a */
    public final C7492s<BaseResponse> mo104566a(String str) {
        C7573i.m23587b(str, "uid");
        return this.f111352c.mo29357c(str);
    }

    /* renamed from: b */
    public final C7492s<C11786e<User>> mo104568b(String str) {
        C7573i.m23587b(str, "userId");
        return C11783b.m34514a((C11750c<K, V>) this.f111353d).mo29342a(str, (C11785d<?, ?>[]) new C11785d[0]);
    }

    public C42860h(C42859g gVar) {
        C7573i.m23587b(gVar, "userCache");
        this.f111353d = gVar;
        mo29602a(C11783b.m34516a((C11790b<K, V, REQ, RESP>) this.f111351b), C11783b.m34514a((C11750c<K, V>) this.f111353d), C11805b.m34557a((C7563m<? super K, ? super V, ? extends K1>) C11806a.f31598a, (C48006q<? super K, ? super V, ? super V1, ? extends V1>) C428611.f111354a));
        mo29602a(C11783b.m34516a((C11790b<K, V, REQ, RESP>) this.f111352c), C11783b.m34514a((C11750c<K, V>) this.f111353d), C11805b.m34557a((C7563m<? super K, ? super V, ? extends K1>) C11806a.f31598a, (C48006q<? super K, ? super V, ? super V1, ? extends V1>) C428622.f111355a));
        mo29602a(C11783b.m34516a((C11790b<K, V, REQ, RESP>) this.f111350a), C11783b.m34514a((C11750c<K, V>) this.f111353d), C11805b.m34557a((C7563m<? super K, ? super V, ? extends K1>) C11806a.f31598a, (C48006q<? super K, ? super V, ? super V1, ? extends V1>) C428633.f111356a));
    }

    /* renamed from: a */
    public final C7319aa<FollowStatus> mo104565a(String str, String str2, int i, int i2, int i3, String str3, int i4) {
        String str4 = str;
        C7573i.m23587b(str, "userId");
        String str5 = str2;
        C7573i.m23587b(str2, "secUserId");
        C42848a aVar = this.f111351b;
        C42849b bVar = new C42849b(str4, str5, i, i2, i3, str3, i4);
        C7319aa<FollowStatus> a = C7319aa.m22929a((C7496w<? extends T>) aVar.mo29357c(bVar));
        C7573i.m23582a((Object) a, "Single.fromObservable(fo…emId, fromPreviousPage)))");
        return a;
    }
}
