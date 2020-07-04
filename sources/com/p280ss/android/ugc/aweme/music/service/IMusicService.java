package com.p280ss.android.ugc.aweme.music.service;

import android.app.ProgressDialog;
import android.content.Context;
import android.widget.TextView;
import bolts.C1592h;
import com.google.gson.C6709k;
import com.p280ss.android.ugc.aweme.music.C33672a;
import com.p280ss.android.ugc.aweme.music.C33788d;
import com.p280ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.music.p1410ui.C33951d;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.SuggestMusicList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.service.IMusicService */
public interface IMusicService {
    void attachPartnerTag(TextView textView, Music music, boolean z);

    boolean checkValidMusic(MusicModel musicModel, Context context, boolean z);

    boolean checkValidMusic(MusicModel musicModel, Context context, boolean z, boolean z2);

    void downloadMusic(MusicModel musicModel, C33788d dVar);

    Music fetchMusicById(String str, int i);

    void fetchMusicDetail(Context context, String str, int i, ProgressDialog progressDialog, C33830a aVar);

    String formatVideoDuration(int i);

    boolean getIsUseMusicPartnersNewStyle();

    List<String> getMusicCoverUrl(String str);

    int getMusicDownloadStrategy();

    long getMusicDuration(String str);

    String getRhythmMusicFilePath(String str);

    void initMusicDownloadStrategy(int i);

    void initService();

    boolean isUseDownloader();

    void mobMusicDownloadFail(String str, String str2, String str3, String str4);

    void mobMusicDownloadStart(String str, String str2, String str3);

    void mobMusicDownloadSuccess(String str, String str2, String str3, long j, long j2);

    void monitorMusicDownload(String str, long j, String str2, int i);

    C33672a provideMusicDownloadPlayHelper(C33951d dVar);

    C1592h<List<MusicModel>> refreshHotMusicList();

    C1592h<SuggestMusicList> refreshSuggestList(String str, String str2);

    C1592h<SuggestMusicList> refreshSuggestList(String str, String str2, String str3);

    C1592h<SuggestMusicList> refreshSuggestLyricList(String str, String str2);

    void updateMusicAbTestModel(C6709k kVar);

    C1592h<CollectedMusicList> userCollectedMusicList(int i, int i2);
}
