package com.p280ss.android.ugc.aweme.shortvideo.p1588r;

import com.google.common.base.C17427g;
import com.p280ss.android.ugc.aweme.discover.model.NationalTask;
import com.p280ss.android.ugc.aweme.miniapp.anchor.C33336b;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.shortvideo.AVNationalTask;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.r.d */
public final class C40251d implements C17427g<NationalTask, AVNationalTask> {
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo44914b(Object obj) {
        return m128602b((NationalTask) obj);
    }

    /* renamed from: a */
    public static AVNationalTask m128601a(NationalTask nationalTask) {
        if (nationalTask == null) {
            return null;
        }
        new C40251d();
        return m128602b(nationalTask);
    }

    /* renamed from: b */
    private static AVNationalTask m128602b(NationalTask nationalTask) {
        AVNationalTask aVNationalTask = new AVNationalTask();
        aVNationalTask.setId(nationalTask.f70741id);
        aVNationalTask.setChallengeNames(nationalTask.challengeNames);
        ArrayList arrayList = new ArrayList();
        if (nationalTask.connectMusic != null) {
            for (int i = 0; i < nationalTask.connectMusic.size(); i++) {
                arrayList.add(((Music) nationalTask.connectMusic.get(i)).convertToMusicModel());
            }
        }
        aVNationalTask.setAnchor(C33336b.m107780a(nationalTask.anchor));
        aVNationalTask.setConnectMusic(C40250c.m128599a((List<MusicModel>) arrayList));
        aVNationalTask.setStickerIds(nationalTask.stickerIds);
        aVNationalTask.setMvIds(nationalTask.mvIds);
        return aVNationalTask;
    }
}
