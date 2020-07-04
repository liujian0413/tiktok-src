package com.p280ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bef.effectsdk.C1942b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.p1059d.p1060a.C23319b;
import com.p280ss.android.ugc.aweme.common.ShareContext;
import com.p280ss.android.ugc.aweme.festival.C29120a;
import com.p280ss.android.ugc.aweme.festival.C29130b;
import com.p280ss.android.ugc.aweme.filter.C29239bb;
import com.p280ss.android.ugc.aweme.framework.services.IPromptService;
import com.p280ss.android.ugc.aweme.framework.services.IVideoLegalCheckerAndToastService;
import com.p280ss.android.ugc.aweme.mediachoose.C33159b;
import com.p280ss.android.ugc.aweme.mediachoose.C33177i;
import com.p280ss.android.ugc.aweme.music.mediachoose.C33794a;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.services.cutvideo.ICutVideoService;
import com.p280ss.android.ugc.aweme.services.draft.IDraftService;
import com.p280ss.android.ugc.aweme.services.effect.IEffectService;
import com.p280ss.android.ugc.aweme.services.photo.IPhotoService;
import com.p280ss.android.ugc.aweme.services.photomovie.IPhotoMovieService;
import com.p280ss.android.ugc.aweme.services.publish.IPublishService;
import com.p280ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.p280ss.android.ugc.aweme.services.sticker.IStickerUtilsService;
import com.p280ss.android.ugc.aweme.services.sticker.IUnLockStickerManagerService;
import com.p280ss.android.ugc.aweme.services.storage.IAVStorageService;
import com.p280ss.android.ugc.aweme.services.story.IStoryRecordService;
import com.p280ss.android.ugc.aweme.services.story.IStorySettingService;
import com.p280ss.android.ugc.aweme.services.superentrance.ISuperEntranceService;
import com.p280ss.android.ugc.aweme.services.video.IAVPublishService;
import com.p280ss.android.ugc.aweme.services.video.IImVideoCompileService;
import com.p280ss.android.ugc.aweme.services.video.IRecordActivityService;
import com.p280ss.android.ugc.aweme.services.video.IVideoCoverService;
import com.p280ss.android.ugc.aweme.services.video.IVideoModelCoverService;
import com.p280ss.android.ugc.aweme.services.video.IVideoRecordEntranceService;
import com.p280ss.android.ugc.aweme.services.videochoose.IVideoChoose;
import com.p280ss.android.ugc.aweme.services.videochoose.IVideoChoose.Callback;
import com.p280ss.android.ugc.aweme.services.videoprocess.IVideoProcessorsService;
import com.p280ss.android.ugc.aweme.services.videoprocess.OnGetVideoCoverCallback;
import com.p280ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.p280ss.android.ugc.aweme.shortvideo.C39319cy;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.shortvideo.p1551c.C38564j;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p280ss.android.ugc.aweme.story.shootvideo.textfont.C42038c;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.services.IAVService */
public interface IAVService {
    public static final int MUSIC_LENGTH_FOR_COPYRIGHT = 15000;
    public static final int STORY_SETTING_ENTER_TYPE_BOTTOM = 2;
    public static final int STORY_SETTING_ENTER_TYPE_RIGHT = 1;
    public static final int STORY_SETTING_THEME_TYPE_BLCAK = 2;
    public static final int STORY_SETTING_THEME_TYPE_WHITE = 1;
    public static final int THEME_TYPE_BLACK = 2;
    public static final int THEME_TYPE_WHITE = 1;

    /* renamed from: com.ss.android.ugc.aweme.services.IAVService$IFetchResourcesListener */
    public interface IFetchResourcesListener {
        void onFailed(Exception exc);

        void onSuccess(String[] strArr);
    }

    /* renamed from: com.ss.android.ugc.aweme.services.IAVService$IPermissionModule */
    public interface IPermissionModule {
        void onSaveInstanceState(Bundle bundle);

        void receivePermissionResult(Intent intent);

        void restoreSavedInstanceState(Bundle bundle);

        void setupByActivity(C39319cy cyVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.services.IAVService$IPermissionSettingItem */
    public interface IPermissionSettingItem {
        View asView();

        DmtTextView getPrivateHint();

        ImageView getPrivateIcon();

        void setPermission(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.services.IAVService$MusicWaveDataListener */
    public interface MusicWaveDataListener {
        void onFinish(Object obj);
    }

    IAVSettingsService avSettingsService();

    String chooseMediaActivityName();

    void clearMusicIdPathList();

    FaceStickerBean convertEffect2FaceStickerBean(Effect effect);

    IVideoChoose convertVideoChoose(Fragment fragment);

    String createMainBusinessContextJson(ShareContext shareContext);

    C38564j createMaxDurationResolver();

    Fragment createMediaChooseFragment(AVChallenge aVChallenge, int i, boolean z, C33794a aVar, C33177i iVar);

    IPermissionModule createPermissionModule(Activity activity, IPermissionSettingItem iPermissionSettingItem, int i);

    IPermissionSettingItem createPermissionSettingItem(Context context);

    IVideoChoose createVideoChooseFragment(Callback callback);

    String[] createWaterMarkImages(int i, int i2, String str, String str2, String str3, boolean z, boolean z2, String str4, boolean z3);

    String detectIsFromEditOrStory(Context context);

    C29120a diamondGameService();

    IDraftService draftService();

    IEffectService effectService();

    int[] extractVideoFileInfo(String str);

    C29130b festivalPublishService();

    void fetchChallengeDetail(String str, String str2, int i, int i2, C23319b<AVChallenge> bVar);

    void fetchResourcesNeededByRequirements(String[] strArr, IFetchResourcesListener iFetchResourcesListener);

    List<String> gatherFilesToBeUploaded(Context context);

    AVMusicWaveBean getAvMusicWaveBean(String str, boolean z, MusicWaveDataListener musicWaveDataListener);

    ICutVideoService getCutVideoService();

    File getDiamondRecordCacheDir();

    String getEffectSDKVersion();

    File getExternalFaceCacheDir();

    String getFilterFaceReshapeDir();

    C29239bb getFilterService();

    IImVideoCompileService getImVideoCompileService();

    File getLrcExternalCacheDir();

    ShareContext getMainBusinessContextShareContext(String str);

    Class<?> getMediaChooseFragmentClass();

    C33159b getMediaChooseService();

    List<MediaModel> getMediaLoaderImages(Context context);

    Object getMusicWaveBean(String str, int i, boolean z, boolean z2, long j, MusicWaveDataListener musicWaveDataListener);

    int getMusicWaveBeanRemainProgress(int i);

    IPublishService getPublishService();

    List<MusicModel> getRecommendLyricMusicList();

    Class<? extends Activity> getRecordPermissionActivity();

    ISDKService getSDKService();

    Class<?> getShortVideoContextClass();

    String getShortVideoContextMainBusinessData(Object obj);

    IStickerUtilsService getStickerUtilsService();

    ISuperEntranceService getSuperEntranceService();

    Map getTrickyMapByActivity(Context context);

    Typeface getTypefaceByFontName(String str);

    boolean getUsingOnline();

    String getVESDKVersion();

    void getVideoCover(String str, int i, OnGetVideoCoverCallback onGetVideoCoverCallback);

    IVideoLegalCheckerAndToastService getVideoLegalCheckerAndToastService(Context context);

    Class<? extends Activity> getVideoPublishActivity();

    IVideoRecordEntranceService getVideoRecordEntranceService();

    void hookVESDKSO();

    void initAIMusicSettings(String str);

    void initASVE();

    void initVideoImportConfig();

    void initVideoRecordConfig();

    boolean isLongVideoPermitted();

    boolean isRecording();

    boolean needLoginBeforeRecord();

    Fragment newVideoChooseFragmentInstance(int i, int i2, int i3, AVChallenge aVChallenge, C33177i iVar);

    void openAVSchemaTestActivity(Context context);

    IPhotoMovieService photoMovieService();

    IPhotoService photoService();

    void prefetchTypeface(Context context);

    IPromptService promptService();

    IPreloadVESo providePreloadVESo();

    C1942b provideResourceFinder();

    IAVPublishService publishService();

    IRecordActivityService recordActivityService();

    Void requestReactDuetSettings(String str, String str2, String str3) throws Exception;

    void setFontTypeList(List<C42038c> list);

    void setLongVideoPermitted(boolean z);

    void setUsingOnline(boolean z);

    IShortVideoConfig shortVideoConfig();

    void startCutMultiVideoActivity(Context context, Intent intent);

    void startCutMultiVideoActivityForResult(Activity activity, Intent intent, int i);

    void startStoryEditActivity(Activity activity, Intent intent);

    void startStorySettingActivity(Activity activity, int i, int i2, int i3, boolean z);

    void startStorySettingActivity(Activity activity, int i, int i2, boolean z, int i3);

    void startStorySettingActivity(Activity activity, int i, int i2, boolean z, boolean z2, boolean z3);

    void startStorySettingActivityForView(Activity activity, int i, int i2, boolean z, int i3, ViewGroup viewGroup);

    void startSuperEntranceRecordActivity(Activity activity, Intent intent);

    void startToolPermissionActivity(Activity activity, Intent intent);

    void startVideoEditActivity(Context context, Intent intent, int i);

    IAVStorageService storageService();

    IStoryRecordService storyRecordService();

    IStorySettingService storySettingService();

    void turnStoryRecordPage(Intent intent);

    IUnLockStickerManagerService unLockStickerManagerService();

    void updateNewPermission();

    IVideo2GifService video2GifService();

    IVideoCoverService videoCoverService();

    IVideoModelCoverService videoModelCoverService();

    IVideoProcessorsService videoProcessorsService();
}
