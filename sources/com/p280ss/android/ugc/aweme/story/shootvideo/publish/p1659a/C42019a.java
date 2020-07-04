package com.p280ss.android.ugc.aweme.story.shootvideo.publish.p1659a;

import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.setting.serverpush.C37703a.C37704a;
import com.p280ss.android.ugc.aweme.setting.serverpush.model.C37723b;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.publish.a.a */
public final class C42019a {
    /* renamed from: a */
    public static C37704a m133571a() {
        return new C37704a() {
            /* renamed from: a */
            public final void mo59220a(Exception exc) {
            }

            /* renamed from: a */
            public final void mo59219a(C37723b bVar) {
                boolean z;
                if (bVar != null) {
                    SharePrefCache.inst().getStorySettingViewPermission().mo59871a(Integer.valueOf(bVar.f98285u));
                    SharePrefCache.inst().getStorySettingReplyPermission().mo59871a(Integer.valueOf(bVar.f98286v));
                    C22903bl storySettingSyncDuoshan = SharePrefCache.inst().getStorySettingSyncDuoshan();
                    boolean z2 = false;
                    if (bVar.f98282r == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    storySettingSyncDuoshan.mo59871a(Boolean.valueOf(z));
                    C22903bl storySettingDoudouPhoto = SharePrefCache.inst().getStorySettingDoudouPhoto();
                    if (bVar.f98283s == 0) {
                        z2 = true;
                    }
                    storySettingDoudouPhoto.mo59871a(Boolean.valueOf(z2));
                    SharePrefCache.inst().getStorySettingSyncToast().mo59871a(Integer.valueOf(bVar.f98284t));
                }
            }
        };
    }
}
