package com.p280ss.android.ugc.aweme.favorites.viewmodel;

import com.bytedance.jedi.arch.ext.list.C11583n;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p280ss.android.ugc.aweme.favorites.api.ProfileCollectionJediApi.C27736a;
import com.p280ss.android.ugc.aweme.favorites.p1210a.C27707j;
import com.p280ss.android.ugc.aweme.profile.C35735b;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7496w;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.ProfileCollectionViewModel$$special$$inlined$NonPayloadSingleListMiddleware$1 */
public final class C27853xebca41fb extends Lambda implements C7562b<ProfileCollectionState, C7492s<Pair<? extends List<? extends C27707j>, ? extends C11583n>>> {
    final /* synthetic */ ProfileCollectionViewModel this$0;

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.ProfileCollectionViewModel$$special$$inlined$NonPayloadSingleListMiddleware$1$a */
    static final class C27855a<T> implements C7326g<List<? extends C27707j>> {

        /* renamed from: a */
        final /* synthetic */ C27853xebca41fb f73429a;

        C27855a(C27853xebca41fb profileCollectionViewModel$$special$$inlined$NonPayloadSingleListMiddleware$1) {
            this.f73429a = profileCollectionViewModel$$special$$inlined$NonPayloadSingleListMiddleware$1;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(final List<C27707j> list) {
            this.f73429a.this$0.mo29038c(new C7562b<ProfileCollectionState, ProfileCollectionState>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public ProfileCollectionState invoke(ProfileCollectionState profileCollectionState) {
                    C7573i.m23587b(profileCollectionState, "$receiver");
                    ListState profileCollectionItemStructListState = profileCollectionState.getProfileCollectionItemStructListState();
                    List list = list;
                    C7573i.m23582a((Object) list, "it");
                    return ProfileCollectionState.copy$default(profileCollectionState, null, ListState.copy$default(profileCollectionItemStructListState, null, list, null, null, null, 29, null), 1, null);
                }
            });
        }
    }

    public C27853xebca41fb(ProfileCollectionViewModel profileCollectionViewModel) {
        this.this$0 = profileCollectionViewModel;
        super(1);
    }

    public final C7492s<Pair<List<C27707j>, C11583n>> invoke(ProfileCollectionState profileCollectionState) {
        C7573i.m23587b(profileCollectionState, "state");
        C7319aa b = C7319aa.m22929a((C7496w<? extends T>) C27736a.m90938a().getProfileCollection().mo19317d((C7327h<? super T, ? extends R>) new C27862d<Object,Object>(C35735b.m115463a((C7562b<? super T, ? extends R>) C27848a.f73421a))).mo19316d((C7326g<? super T>) new C27855a<Object>(this))).mo19135b(C7333a.m23044b());
        C7573i.m23582a((Object) b, "Single.fromObservable<Li…scribeOn(Schedulers.io())");
        C7492s<Pair<List<C27707j>, C11583n>> d = b.mo19136b().mo19317d((C7327h<? super T, ? extends R>) C278541.f73428a);
        C7573i.m23582a((Object) d, "actualRefresh(state).toO…able().map { it to null }");
        return d;
    }
}
