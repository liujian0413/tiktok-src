package com.p280ss.android.ugc.aweme.services.settings;

import android.app.Application;
import android.content.Context;
import com.google.gson.C6711m;
import com.p280ss.android.ttve.nativePort.TENativeLibsLoader.C20488d;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.port.C35517a;

/* renamed from: com.ss.android.ugc.aweme.services.settings.IAVSettingsService */
public interface IAVSettingsService {
    String SdkV4AuthKey();

    C35517a<Boolean> bubbleGuideShown();

    boolean enableDuetReactVEEditor();

    boolean enableFeedbackLog();

    boolean enableFullScreen();

    boolean enableInstagramSilentShare();

    boolean enableMBlackPanel();

    boolean enablePhotoMovie();

    boolean enablePreUploadByUser();

    boolean enableReact();

    boolean enableSaveUploadVideo();

    boolean enableStatusMode();

    boolean enableStickerDetailsEntrance();

    boolean enableUploadFallback();

    boolean enableUploadSyncIns();

    boolean enableUploadSyncInsStory();

    boolean enableUploadSyncTwitter();

    boolean forceAddVideoHead();

    String freeFLowCardUrl();

    int getEditPageMusicPanelOptimization();

    boolean getEditPagePrompt();

    int getFullScreenPlan();

    C20488d getLibraryLoader(Application application);

    float getRecordBitrate();

    int getRecordQuality();

    String getStatusTabKey();

    boolean isEnableGetThumbsWithEffect();

    boolean isEnableUseVEGetThumbs();

    boolean isEnableVideoEditActivityUploadSpeedProbe();

    boolean isOpenMusicRecordWithSticker();

    boolean isOpenStickerRecordWithMusic();

    boolean needLoginBeforeRecord();

    long progressBarThreshold();

    int recommentMusicByAIPolicy();

    void setDefaultFilterForCamera(int i, int i2);

    void setEnablePreUploadByUser(boolean z);

    boolean shareVideo2GifEditable();

    C35517a<Boolean> showLockNewYearStickerPopupImg();

    C35517a<Boolean> showLockStickerPopupImg();

    boolean showMvThemeRecordMode();

    boolean showStickerCollection();

    void startTestABActivity(Context context);

    void updateABTestModel(C6711m mVar);

    void updateServerSettings(IESSettingsProxy iESSettingsProxy);

    void updateUserSettings(C6711m mVar);

    boolean uploadOptimizeForPie();
}
