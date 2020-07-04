package com.p280ss.android.ugc.aweme.music.presenter;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.p280ss.android.ugc.aweme.music.api.C33761a;
import com.p280ss.android.ugc.aweme.music.model.AwemeSearchMusicList;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.presenter.a */
public final class C33799a {

    /* renamed from: a */
    public boolean f88178a;

    /* renamed from: b */
    private long f88179b;

    /* renamed from: a */
    public final ArrayList<MusicModel> mo86417a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            AwemeSearchMusicList awemeSearchMusicList = (AwemeSearchMusicList) JSON.parseObject(str, AwemeSearchMusicList.class);
            if (awemeSearchMusicList != null) {
                this.f88179b = (long) awemeSearchMusicList.cursor;
                List<Music> list = awemeSearchMusicList.musicList;
                if (list != null) {
                    ArrayList<MusicModel> arrayList = new ArrayList<>();
                    for (Music convertToMusicModel : list) {
                        MusicModel convertToMusicModel2 = convertToMusicModel.convertToMusicModel();
                        if (convertToMusicModel2 != null) {
                            arrayList.add(convertToMusicModel2);
                        }
                        convertToMusicModel2.setLogPb(awemeSearchMusicList.logPb);
                    }
                    this.f88178a = awemeSearchMusicList.isHasMore();
                    return arrayList;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: a */
    public final String mo86416a(String str, boolean z, String str2, boolean z2) {
        if (!z) {
            try {
                this.f88179b = 0;
            } catch (Exception unused) {
                return null;
            }
        }
        if (z2) {
            return C33761a.m108897b(str, this.f88179b, str2);
        }
        return C33761a.m108896a(str, this.f88179b, str2);
    }
}
