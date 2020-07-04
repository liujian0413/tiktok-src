package com.p280ss.android.ugc.aweme.tools.music.p1674c;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.google.common.base.C17427g;
import com.google.common.collect.C17795bu;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.common.LogPbBean;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tools.music.c.b */
public final class C42440b implements C17427g<MusicModel, AVMusic> {

    /* renamed from: a */
    public static final C42441a f110336a = new C42441a(null);

    /* renamed from: com.ss.android.ugc.aweme.tools.music.c.b$a */
    public static final class C42441a {
        private C42441a() {
        }

        public /* synthetic */ C42441a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static ArrayList<AVMusic> m134899a(List<? extends MusicModel> list) {
            boolean z;
            Collection collection = list;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return new ArrayList<>();
            }
            ArrayList<AVMusic> a = C17795bu.m59144a((Iterable<? extends E>) C17795bu.m59147a(list, (C17427g<? super F, ? extends T>) new C42440b<Object,Object>()));
            C7573i.m23582a((Object) a, "Lists.newArrayList(Lists…AVMusicTransformation()))");
            return a;
        }

        /* renamed from: a */
        public static MusicModel m134898a(AVMusic aVMusic) {
            C7573i.m23587b(aVMusic, "avMusic");
            MusicModel musicModel = new MusicModel();
            musicModel.setMusicId(aVMusic.getMusicId());
            musicModel.setId(aVMusic.getId());
            musicModel.setAlbum(aVMusic.getAlbum());
            musicModel.setName(aVMusic.getMusicName());
            musicModel.setAlbum(aVMusic.getAlbum());
            if (aVMusic.getCoverMedium() != null) {
                UrlModel coverMedium = aVMusic.getCoverMedium();
                C7573i.m23582a((Object) coverMedium, "avMusic.getCoverMedium()");
                if (!C6307b.m19566a((Collection<T>) coverMedium.getUrlList())) {
                    UrlModel coverMedium2 = aVMusic.getCoverMedium();
                    C7573i.m23582a((Object) coverMedium2, "avMusic.getCoverMedium()");
                    musicModel.setPicPremium((String) coverMedium2.getUrlList().get(0));
                }
            }
            if (aVMusic.getCoverThumb() != null) {
                UrlModel coverThumb = aVMusic.getCoverThumb();
                C7573i.m23582a((Object) coverThumb, "avMusic.getCoverThumb()");
                if (!C6307b.m19566a((Collection<T>) coverThumb.getUrlList())) {
                    UrlModel coverMedium3 = aVMusic.getCoverMedium();
                    C7573i.m23582a((Object) coverMedium3, "avMusic.getCoverMedium()");
                    musicModel.setPicSmall((String) coverMedium3.getUrlList().get(0));
                }
            }
            musicModel.setPath(aVMusic.getPath());
            musicModel.setSinger(aVMusic.getSinger());
            if (aVMusic.getMusicType() == MusicType.ONLINE.ordinal()) {
                UrlModel playUrl = aVMusic.getPlayUrl();
                C7573i.m23582a((Object) playUrl, "avMusic.getPlayUrl()");
                musicModel.setPath((String) playUrl.getUrlList().get(0));
            }
            musicModel.setDuration(aVMusic.duration);
            musicModel.setShootDuration(Integer.valueOf(aVMusic.shootDuration));
            musicModel.setAuditionDuration(Integer.valueOf(aVMusic.auditionDuration));
            if (aVMusic.getMusicType() == MusicType.BAIDU.ordinal()) {
                musicModel.setMusicType(MusicType.BAIDU);
            }
            if (aVMusic.getMusicType() == MusicType.LOCAL.ordinal()) {
                musicModel.setMusicType(MusicType.LOCAL);
            }
            if (aVMusic.getMusicType() == MusicType.ONLINE.ordinal()) {
                musicModel.setMusicType(MusicType.ONLINE);
            }
            musicModel.setOfflineDesc(aVMusic.getOfflineDesc());
            musicModel.setMusicStatus(aVMusic.getMusicStatus());
            musicModel.setStrongBeatUrl(aVMusic.getStrongBeatUrl());
            musicModel.setLrcUrl(aVMusic.getLrcUrl());
            musicModel.setLrcType(aVMusic.getLrcType());
            musicModel.setPreviewStartTime(aVMusic.getPreviewStartTime());
            musicModel.setExtra(aVMusic.extra);
            return musicModel;
        }
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo44914b(Object obj) {
        return m134896a((MusicModel) obj);
    }

    /* renamed from: a */
    public static AVMusic m134896a(MusicModel musicModel) {
        String str;
        String str2 = null;
        if (musicModel == null) {
            return null;
        }
        AVMusic aVMusic = new AVMusic();
        Music convertToMusic = musicModel.convertToMusic();
        C7573i.m23582a((Object) convertToMusic, "music");
        aVMusic.f99664id = convertToMusic.getId();
        aVMusic.setCommerceMusic(convertToMusic.isCommercialMusic());
        aVMusic.setOriginalSound(convertToMusic.isOriginalSound());
        aVMusic.mid = convertToMusic.getMid();
        aVMusic.musicName = convertToMusic.getMusicName();
        aVMusic.album = convertToMusic.getAlbum();
        aVMusic.path = musicModel.getPath();
        aVMusic.audioTrack = convertToMusic.getAudioTrack();
        aVMusic.authorName = convertToMusic.getAuthorName();
        aVMusic.playUrl = convertToMusic.getPlayUrl();
        aVMusic.coverThumb = convertToMusic.getCoverThumb();
        aVMusic.coverMedium = convertToMusic.getCoverMedium();
        aVMusic.coverHd = convertToMusic.getConverHd();
        aVMusic.coverLarge = convertToMusic.getCoverLarge();
        aVMusic.duration = convertToMusic.getDuration();
        aVMusic.shootDuration = convertToMusic.getShootDuration();
        aVMusic.auditionDuration = convertToMusic.getAuditionDuration();
        aVMusic.musicType = musicModel.getMusicType().ordinal();
        aVMusic.offlineDesc = musicModel.getOfflineDesc();
        aVMusic.musicStatus = convertToMusic.getMusicStatus();
        if (convertToMusic.getChallenge() != null) {
            new C42438a();
            aVMusic.challenge = C42438a.m134893a(convertToMusic.getChallenge());
        }
        aVMusic.strongBeatUrl = convertToMusic.getStrongBeatUrl();
        aVMusic.setLrcUrl(convertToMusic.getLrcUrl());
        aVMusic.setLrcType(convertToMusic.getLrcType());
        aVMusic.setPreviewStartTime(convertToMusic.getPreviewStartTime());
        aVMusic.setPreventDownload(musicModel.isPreventDownload());
        if (musicModel.getMusicWaveBean() != null) {
            aVMusic.setMusicWaveData(musicModel.getMusicWaveBean().getMusicWavePointArray());
        }
        aVMusic.setMvThemeMusic(musicModel.isMvThemeMusic());
        LogPbBean logPbBean = new LogPbBean();
        com.p280ss.android.ugc.aweme.feed.model.LogPbBean logPb = musicModel.getLogPb();
        if (logPb != null) {
            str = logPb.getImprId();
        } else {
            str = null;
        }
        logPbBean.setImprId(str);
        aVMusic.setLogPb(logPbBean);
        aVMusic.setComeFromForMod(musicModel.getComeFromForMod());
        aVMusic.setRedirect(musicModel.isRedirect());
        aVMusic.setSearchKeyWords(musicModel.getSearchKeyWords());
        aVMusic.setSongId(musicModel.getSongId());
        aVMusic.extra = musicModel.getExtra();
        if (TextUtils.isEmpty(aVMusic.extra)) {
            Music music = musicModel.getMusic();
            if (music != null) {
                str2 = music.getExtra();
            }
            aVMusic.extra = str2;
        }
        return aVMusic;
    }
}
