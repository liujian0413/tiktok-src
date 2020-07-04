package com.p280ss.android.ugc.aweme.feed.p1234j;

import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.setting.serverpush.C37703a.C37704a;
import com.p280ss.android.ugc.aweme.setting.serverpush.model.C37723b;
import com.p280ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.j.q */
public final class C28501q implements C37704a {
    /* renamed from: a */
    public final void mo59220a(Exception exc) {
        C7573i.m23587b(exc, "e");
    }

    /* renamed from: a */
    public final void mo59219a(C37723b bVar) {
        C7573i.m23587b(bVar, "settings");
        if (bVar.f98257O != null) {
            String str = "";
            int size = bVar.f98257O.size();
            for (int i = 0; i < size; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                Object obj = bVar.f98257O.get(i);
                C7573i.m23582a(obj, "settings.selectedContentLanguage[i]");
                sb.append(((ContentLanguage) obj).getLanguageCode());
                sb.append(",");
                str = sb.toString();
            }
            SharePrefCache inst = SharePrefCache.inst();
            C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
            C22903bl userAddLanguages = inst.getUserAddLanguages();
            C7573i.m23582a((Object) userAddLanguages, "SharePrefCache.inst().userAddLanguages");
            userAddLanguages.mo59871a(str);
        }
    }
}
