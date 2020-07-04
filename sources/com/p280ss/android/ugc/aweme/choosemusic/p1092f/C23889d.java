package com.p280ss.android.ugc.aweme.choosemusic.p1092f;

import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.IAccountService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.music.p1406ab.C33703a;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.f.d */
public final class C23889d {
    /* renamed from: a */
    public static String m78217a(int i) {
        return i == 0 ? "popular_song" : i == 3 ? "song_category" : i == 2 ? "search_result" : "";
    }

    /* renamed from: c */
    public static boolean m78222c() {
        if (C33703a.m108718b() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m78221b() {
        if (((IAccountService) ServiceManager.get().getService(IAccountService.class)).userService().isChildrenMode() || C33703a.m108716a() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m78219a() {
        if (C33703a.m108716a() == 1 || C33703a.m108716a() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static List<MusicModel> m78220b(List<Music> list) {
        ArrayList arrayList = new ArrayList();
        for (Music music : list) {
            if (music != null) {
                MusicModel convertToMusicModel = music.convertToMusicModel();
                convertToMusicModel.setChallengeUserCount(music.getUserCount());
                convertToMusicModel.setChallengeMusic(true);
                convertToMusicModel.setDataType(0);
                arrayList.add(convertToMusicModel);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<MusicModel> m78218a(List<Music> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Music music : list) {
            if (music != null) {
                arrayList.add(music.convertToMusicModel());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static MusicModel m78216a(List<MusicModel> list, String str) {
        if (C6307b.m19566a((Collection<T>) list)) {
            return null;
        }
        for (MusicModel musicModel : list) {
            if (musicModel != null && C6319n.m19594a(musicModel.getMusicId(), str)) {
                return musicModel;
            }
        }
        return null;
    }
}
