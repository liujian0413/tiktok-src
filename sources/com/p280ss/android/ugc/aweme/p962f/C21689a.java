package com.p280ss.android.ugc.aweme.p962f;

import android.content.Context;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.f.a */
public final class C21689a {

    /* renamed from: a */
    public static boolean f58097a;

    /* renamed from: a */
    public static boolean m72593a() {
        boolean z = f58097a;
        f58097a = false;
        if (!z || !C21704d.m72621a()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m72594a(Aweme aweme) {
        if (aweme.getAuthor() == null || !C21115b.m71197a().getCurUserId().equals(aweme.getAuthorUid()) || !C21704d.m72621a() || ((C7213d.m22500a().mo18719L() != 30 && C7213d.m22500a().mo18719L() != 40) || aweme.getStatus() == null || aweme.getStatus().getPrivateStatus() != 1)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m72592a(Context context, final C21701b bVar) {
        if (!C21704d.m72621a()) {
            bVar.mo57968a(false);
            return;
        }
        int L = C7213d.m22500a().mo18719L();
        if (L == 10) {
            bVar.mo57968a(false);
        } else if (L == 30) {
            C21704d.m72618a(context, R.string.sr, new Runnable() {
                public final void run() {
                    bVar.mo57968a(true);
                    C21689a.f58097a = true;
                }
            });
        } else if (L != 40) {
            switch (L) {
                case 20:
                    SharePrefCache.inst().setIsFirstPublishAweme(false);
                    C21704d.m72618a(context, R.string.sr, new Runnable() {
                        public final void run() {
                            bVar.mo57968a(false);
                        }
                    });
                    return;
                case 21:
                    if (SharePrefCache.inst().getIsFirstPublishAweme()) {
                        SharePrefCache.inst().setIsFirstPublishAweme(false);
                        C21704d.m72618a(context, R.string.sr, new Runnable() {
                            public final void run() {
                                bVar.mo57968a(false);
                            }
                        });
                        return;
                    }
                    bVar.mo57968a(false);
                    return;
                default:
                    if (SharePrefCache.inst().getIsFirstPublishAweme()) {
                        SharePrefCache.inst().setIsFirstPublishAweme(false);
                        C21704d.m72618a(context, R.string.sr, new Runnable() {
                            public final void run() {
                                bVar.mo57968a(false);
                            }
                        });
                        return;
                    }
                    bVar.mo57968a(false);
                    return;
            }
        } else {
            C21704d.m72618a(context, R.string.sr, new Runnable() {
                public final void run() {
                    bVar.mo57967a();
                }
            });
        }
    }
}
