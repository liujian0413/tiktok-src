package com.p280ss.android.ugc.aweme.friends.p1283c;

import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.friends.model.SummonFriendItem;
import com.p280ss.android.ugc.aweme.friends.model.SummonFriendRecentModel;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.c.f */
public final class C30046f extends C25652b<SummonFriendRecentModel, C25675c> {

    /* renamed from: a */
    List<SummonFriendItem> f79020a;

    public C30046f() {
        mo66536a(new SummonFriendRecentModel());
    }

    /* renamed from: a */
    public final void mo76307a(final boolean z) {
        C6726a.m20842a(new Runnable() {
            public final void run() {
                if (z) {
                    C30046f.this.f79020a = ((SummonFriendRecentModel) C30046f.this.mo66539h()).refreshData();
                } else {
                    C30046f.this.f79020a = ((SummonFriendRecentModel) C30046f.this.mo66539h()).loadMore();
                }
                C6726a.m20844b(new Runnable() {
                    public final void run() {
                        if (z) {
                            ((C25675c) C30046f.this.f67572c).mo59099a(C30046f.this.f79020a, ((SummonFriendRecentModel) C30046f.this.mo66539h()).isHasMore());
                        } else {
                            ((C25675c) C30046f.this.f67572c).mo59108b(C30046f.this.f79020a, ((SummonFriendRecentModel) C30046f.this.mo66539h()).isHasMore());
                        }
                    }
                });
            }
        });
    }
}
