package com.p280ss.android.ugc.aweme.challenge.data;

import android.arch.persistence.room.C0160e;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.p854d.C19294c;
import com.p280ss.android.ugc.aweme.challenge.model.ChallengeList;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.challenge.data.d */
public class C23693d {

    /* renamed from: a */
    private static final String f62449a = "d";

    /* renamed from: b */
    private static C19294c<LocalHashTagDataBase> f62450b = new C19294c<LocalHashTagDataBase>() {
        /* renamed from: a */
        public final /* synthetic */ Object mo29755a() {
            return m77665c();
        }

        /* renamed from: c */
        private static LocalHashTagDataBase m77665c() {
            return (LocalHashTagDataBase) C0160e.m441a(C6399b.m19921a(), LocalHashTagDataBase.class, "localHashTag.db").mo318a().mo322c();
        }
    };

    /* renamed from: b */
    private static List<C23692c> m77664b() {
        try {
            LocalHashTagDataBase localHashTagDataBase = (LocalHashTagDataBase) f62450b.mo51193b();
            if (localHashTagDataBase != null) {
                return localHashTagDataBase.mo61616h().mo61617a();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: a */
    public static ChallengeList m77662a() {
        ChallengeList challengeList = new ChallengeList();
        ArrayList arrayList = new ArrayList();
        List<C23692c> b = m77664b();
        if (b != null) {
            for (C23692c cVar : b) {
                Challenge challenge = new Challenge();
                challenge.setChallengeName(cVar.f62447a);
                arrayList.add(challenge);
            }
        }
        challengeList.items = arrayList;
        return challengeList;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0012 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m77663a(com.p280ss.android.ugc.aweme.challenge.data.C23692c r2) {
        /*
            com.ss.android.d.c<com.ss.android.ugc.aweme.challenge.data.LocalHashTagDataBase> r0 = f62450b     // Catch:{ Exception -> 0x0022 }
            java.lang.Object r0 = r0.mo51193b()     // Catch:{ Exception -> 0x0022 }
            com.ss.android.ugc.aweme.challenge.data.LocalHashTagDataBase r0 = (com.p280ss.android.ugc.aweme.challenge.data.LocalHashTagDataBase) r0     // Catch:{ Exception -> 0x0022 }
            if (r0 == 0) goto L_0x0021
            com.ss.android.ugc.aweme.challenge.data.a r0 = r0.mo61616h()     // Catch:{ Exception -> 0x0022 }
            r0.mo61619a(r2)     // Catch:{ SQLiteConstraintException -> 0x0012 }
            goto L_0x0015
        L_0x0012:
            r0.mo61621b(r2)     // Catch:{ Exception -> 0x0022 }
        L_0x0015:
            int r2 = r0.mo61620b()     // Catch:{ Exception -> 0x0022 }
            r1 = 20
            if (r2 <= r1) goto L_0x0021
            int r2 = r2 - r1
            r0.mo61618a(r2)     // Catch:{ Exception -> 0x0022 }
        L_0x0021:
            return
        L_0x0022:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.challenge.data.C23693d.m77663a(com.ss.android.ugc.aweme.challenge.data.c):void");
    }
}
