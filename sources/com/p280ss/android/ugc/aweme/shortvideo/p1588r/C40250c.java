package com.p280ss.android.ugc.aweme.shortvideo.p1588r;

import com.google.common.base.C17427g;
import com.google.common.collect.C17795bu;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.r.c */
public final class C40250c implements C17427g<MusicModel, AVMusic> {
    /* renamed from: b */
    public final /* synthetic */ Object mo44914b(Object obj) {
        return m128598a((MusicModel) obj);
    }

    /* renamed from: a */
    public static ArrayList<AVMusic> m128599a(List<MusicModel> list) {
        return C17795bu.m59144a((Iterable<? extends E>) C17795bu.m59147a(list, (C17427g<? super F, ? extends T>) new C40250c<Object,Object>()));
    }

    /* renamed from: a */
    public static AVMusic m128598a(MusicModel musicModel) {
        AVMusic aVMusic = new AVMusic();
        Music convertToMusic = musicModel.convertToMusic();
        aVMusic.setCommerceMusic(musicModel.isCommerceMusic());
        aVMusic.setOriginalSound(musicModel.isOriginalSound());
        aVMusic.f99664id = convertToMusic.getId();
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
            new C40248a();
            aVMusic.challenge = C40248a.m128593a(convertToMusic.getChallenge());
        }
        aVMusic.strongBeatUrl = convertToMusic.getStrongBeatUrl();
        aVMusic.setLrcUrl(convertToMusic.getLrcUrl());
        aVMusic.setLrcType(convertToMusic.getLrcType());
        aVMusic.setPreviewStartTime(convertToMusic.getPreviewStartTime());
        aVMusic.setPreventDownload(musicModel.isPreventDownload());
        if (musicModel.getMusicWaveBean() != null) {
            aVMusic.setMusicWaveData(musicModel.getMusicWaveBean().getMusicWavePointArray());
        }
        return aVMusic;
    }
}
