package com.p280ss.android.ugc.aweme.challenge.p1086ui;

import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.challenge.C23685d;
import com.p280ss.android.ugc.aweme.challenge.adapter.DetailAwemeViewHolder;
import com.p280ss.android.ugc.aweme.challenge.p1084c.C23671a;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.DetailAwemeListFragment.C23743b;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.DetailAwemeListFragment.DetailAwemeListProvider;
import com.p280ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailViewModel.C23812a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailAwemeListProvider */
public final class ChallengeDetailAwemeListProvider implements DetailAwemeListProvider {
    private WeakReference<FragmentActivity> activity;

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailAwemeListProvider$a */
    public static final class C23710a extends C25674b<C23671a> {
        C23710a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a6, code lost:
            if (((com.p280ss.android.ugc.aweme.challenge.p1084c.C23671a) r3).isNewDataEmpty() == false) goto L_0x00aa;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo56977b() {
            /*
                r5 = this;
                com.ss.android.ugc.aweme.common.a r0 = r5.f67571b
                if (r0 == 0) goto L_0x00ae
                com.ss.android.ugc.aweme.common.e r0 = r5.f67572c
                if (r0 != 0) goto L_0x000a
                goto L_0x00ae
            L_0x000a:
                com.ss.android.ugc.aweme.common.a r0 = r5.f67571b
                java.lang.String r1 = "mModel"
                kotlin.jvm.internal.C7573i.m23582a(r0, r1)
                com.ss.android.ugc.aweme.challenge.c.a r0 = (com.p280ss.android.ugc.aweme.challenge.p1084c.C23671a) r0
                int r0 = r0.mListQueryType
                r1 = 4
                r2 = 1
                if (r0 == r1) goto L_0x0079
                switch(r0) {
                    case 1: goto L_0x0040;
                    case 2: goto L_0x001d;
                    default: goto L_0x001c;
                }
            L_0x001c:
                goto L_0x003f
            L_0x001d:
                com.ss.android.ugc.aweme.common.e r0 = r5.f67572c
                com.ss.android.ugc.aweme.common.e.c r0 = (com.p280ss.android.ugc.aweme.common.p1144e.C25675c) r0
                com.ss.android.ugc.aweme.common.a r1 = r5.f67571b
                java.lang.String r3 = "mModel"
                kotlin.jvm.internal.C7573i.m23582a(r1, r3)
                com.ss.android.ugc.aweme.challenge.c.a r1 = (com.p280ss.android.ugc.aweme.challenge.p1084c.C23671a) r1
                java.util.List r1 = r1.mo61599a()
                com.ss.android.ugc.aweme.common.a r3 = r5.f67571b
                java.lang.String r4 = "mModel"
                kotlin.jvm.internal.C7573i.m23582a(r3, r4)
                com.ss.android.ugc.aweme.challenge.c.a r3 = (com.p280ss.android.ugc.aweme.challenge.p1084c.C23671a) r3
                boolean r3 = r3.isNewDataEmpty()
                r2 = r2 ^ r3
                r0.mo59110c(r1, r2)
            L_0x003f:
                return
            L_0x0040:
                com.ss.android.ugc.aweme.common.a r0 = r5.f67571b
                java.lang.String r1 = "mModel"
                kotlin.jvm.internal.C7573i.m23582a(r0, r1)
                com.ss.android.ugc.aweme.challenge.c.a r0 = (com.p280ss.android.ugc.aweme.challenge.p1084c.C23671a) r0
                boolean r0 = r0.isDataEmpty()
                if (r0 == 0) goto L_0x0057
                com.ss.android.ugc.aweme.common.e r0 = r5.f67572c
                com.ss.android.ugc.aweme.common.e.c r0 = (com.p280ss.android.ugc.aweme.common.p1144e.C25675c) r0
                r0.ae_()
                return
            L_0x0057:
                com.ss.android.ugc.aweme.common.e r0 = r5.f67572c
                com.ss.android.ugc.aweme.common.e.c r0 = (com.p280ss.android.ugc.aweme.common.p1144e.C25675c) r0
                com.ss.android.ugc.aweme.common.a r1 = r5.f67571b
                java.lang.String r2 = "mModel"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)
                com.ss.android.ugc.aweme.challenge.c.a r1 = (com.p280ss.android.ugc.aweme.challenge.p1084c.C23671a) r1
                java.util.List r1 = r1.mo61599a()
                com.ss.android.ugc.aweme.common.a r2 = r5.f67571b
                java.lang.String r3 = "mModel"
                kotlin.jvm.internal.C7573i.m23582a(r2, r3)
                com.ss.android.ugc.aweme.challenge.c.a r2 = (com.p280ss.android.ugc.aweme.challenge.p1084c.C23671a) r2
                boolean r2 = r2.isHasMore()
                r0.mo59099a(r1, r2)
                return
            L_0x0079:
                com.ss.android.ugc.aweme.common.e r0 = r5.f67572c
                com.ss.android.ugc.aweme.common.e.c r0 = (com.p280ss.android.ugc.aweme.common.p1144e.C25675c) r0
                com.ss.android.ugc.aweme.common.a r1 = r5.f67571b
                java.lang.String r3 = "mModel"
                kotlin.jvm.internal.C7573i.m23582a(r1, r3)
                com.ss.android.ugc.aweme.challenge.c.a r1 = (com.p280ss.android.ugc.aweme.challenge.p1084c.C23671a) r1
                java.util.List r1 = r1.mo61599a()
                com.ss.android.ugc.aweme.common.a r3 = r5.f67571b
                java.lang.String r4 = "mModel"
                kotlin.jvm.internal.C7573i.m23582a(r3, r4)
                com.ss.android.ugc.aweme.challenge.c.a r3 = (com.p280ss.android.ugc.aweme.challenge.p1084c.C23671a) r3
                boolean r3 = r3.isHasMore()
                if (r3 == 0) goto L_0x00a9
                com.ss.android.ugc.aweme.common.a r3 = r5.f67571b
                java.lang.String r4 = "mModel"
                kotlin.jvm.internal.C7573i.m23582a(r3, r4)
                com.ss.android.ugc.aweme.challenge.c.a r3 = (com.p280ss.android.ugc.aweme.challenge.p1084c.C23671a) r3
                boolean r3 = r3.isNewDataEmpty()
                if (r3 != 0) goto L_0x00a9
                goto L_0x00aa
            L_0x00a9:
                r2 = 0
            L_0x00aa:
                r0.mo59108b(r1, r2)
                return
            L_0x00ae:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.challenge.p1086ui.ChallengeDetailAwemeListProvider.C23710a.mo56977b():void");
        }
    }

    public final WeakReference<FragmentActivity> getActivity() {
        return this.activity;
    }

    public final boolean sendCustomRequest(C25674b<? extends C25673a<?, ?>> bVar, int i) {
        return false;
    }

    public final void setActivity(WeakReference<FragmentActivity> weakReference) {
        this.activity = weakReference;
    }

    public final C25674b<? extends C25673a<?, ?>> getPresenter(int i, FragmentActivity fragmentActivity) {
        return getChallengePresenter(i, fragmentActivity);
    }

    private final C25674b<C23671a> getChallengePresenter(int i, FragmentActivity fragmentActivity) {
        C23671a aVar;
        if (fragmentActivity == null) {
            aVar = new C23671a();
        } else {
            aVar = C23812a.m78027a(fragmentActivity).mo61860a(i);
        }
        C23710a aVar2 = new C23710a();
        aVar2.mo66536a(aVar);
        return aVar2;
    }

    public final C23743b getJumpToVideoParam(C23743b bVar, Aweme aweme) {
        C7573i.m23587b(bVar, "param");
        C7573i.m23587b(aweme, "aweme");
        C6907h.m21524a("feed_enter", (Map) new C22984d().mo59973a("enter_from", "challenge").mo59973a("group_id", aweme.getAid()).mo59973a("tag_id", bVar.f62615d).mo59973a("rank_index", String.valueOf(bVar.f62617f)).mo59973a("process_id", bVar.f62616e).f60753a);
        bVar.f62612a = "from_challenge";
        bVar.f62613b = "challenge_id";
        return bVar;
    }

    public final DetailAwemeViewHolder onCreateDetailAwemeViewHolder(View view, String str, C23685d dVar) {
        return new ChallengeDetailAwemeViewHolder(view, str, dVar);
    }
}
