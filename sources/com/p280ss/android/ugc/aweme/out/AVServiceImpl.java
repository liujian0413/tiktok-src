package com.p280ss.android.ugc.aweme.out;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import bolts.C1591g;
import bolts.C1592h;
import com.bef.effectsdk.C1942b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.ads.AdError;
import com.google.common.base.C17457s;
import com.google.common.base.C17458t;
import com.p280ss.android.ugc.aweme.base.p1059d.p1060a.C23319b;
import com.p280ss.android.ugc.aweme.common.ShareContext;
import com.p280ss.android.ugc.aweme.detail.api.C26047a;
import com.p280ss.android.ugc.aweme.festival.C29120a;
import com.p280ss.android.ugc.aweme.festival.C29130b;
import com.p280ss.android.ugc.aweme.filter.C29239bb;
import com.p280ss.android.ugc.aweme.filter.C29337v;
import com.p280ss.android.ugc.aweme.framework.services.IPromptService;
import com.p280ss.android.ugc.aweme.framework.services.IVideoLegalCheckerAndToastService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.i18n.musically.cut.MusVideoChooseFragment;
import com.p280ss.android.ugc.aweme.mediachoose.C33159b;
import com.p280ss.android.ugc.aweme.mediachoose.C33160c;
import com.p280ss.android.ugc.aweme.mediachoose.C33177i;
import com.p280ss.android.ugc.aweme.mediachoose.ChooseMediaActivity;
import com.p280ss.android.ugc.aweme.mediachoose.VideoChooseFragment;
import com.p280ss.android.ugc.aweme.mediachoose.p1390a.C33150a;
import com.p280ss.android.ugc.aweme.music.mediachoose.C33794a;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.p994af.C22472b;
import com.p280ss.android.ugc.aweme.photo.C34753g;
import com.p280ss.android.ugc.aweme.photo.local.MediaChooseFragment;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.port.p1479in.IAVStoryProxyService;
import com.p280ss.android.ugc.aweme.services.AVPublishServiceImpl;
import com.p280ss.android.ugc.aweme.services.AVSettingsServiceImpl;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.IAVService.IFetchResourcesListener;
import com.p280ss.android.ugc.aweme.services.IAVService.IPermissionModule;
import com.p280ss.android.ugc.aweme.services.IAVService.IPermissionSettingItem;
import com.p280ss.android.ugc.aweme.services.IAVService.MusicWaveDataListener;
import com.p280ss.android.ugc.aweme.services.IPreloadVESo;
import com.p280ss.android.ugc.aweme.services.ISDKService;
import com.p280ss.android.ugc.aweme.services.IShortVideoConfig;
import com.p280ss.android.ugc.aweme.services.IVideo2GifService;
import com.p280ss.android.ugc.aweme.services.PhotoService;
import com.p280ss.android.ugc.aweme.services.SDKServiceImpl;
import com.p280ss.android.ugc.aweme.services.StorySettingServiceImpl;
import com.p280ss.android.ugc.aweme.services.config.ShortVideoConfigImpl;
import com.p280ss.android.ugc.aweme.services.cutvideo.CutVideoService;
import com.p280ss.android.ugc.aweme.services.cutvideo.ICutVideoService;
import com.p280ss.android.ugc.aweme.services.draft.IDraftService;
import com.p280ss.android.ugc.aweme.services.effect.EffectService;
import com.p280ss.android.ugc.aweme.services.effect.IEffectService;
import com.p280ss.android.ugc.aweme.services.photo.IPhotoService;
import com.p280ss.android.ugc.aweme.services.photomovie.IPhotoMovieService;
import com.p280ss.android.ugc.aweme.services.photomovie.PhotoMovieService;
import com.p280ss.android.ugc.aweme.services.publish.IPublishService;
import com.p280ss.android.ugc.aweme.services.publish.PublishServiceImpl;
import com.p280ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.p280ss.android.ugc.aweme.services.sticker.IStickerUtilsService;
import com.p280ss.android.ugc.aweme.services.sticker.IUnLockStickerManagerService;
import com.p280ss.android.ugc.aweme.services.sticker.StickerUtilsServiceImpl;
import com.p280ss.android.ugc.aweme.services.sticker.UnLockStickerManagerServiceImpl;
import com.p280ss.android.ugc.aweme.services.storage.IAVStorageService;
import com.p280ss.android.ugc.aweme.services.storage.StorageServiceImpl;
import com.p280ss.android.ugc.aweme.services.story.IStoryRecordService;
import com.p280ss.android.ugc.aweme.services.story.IStorySettingService;
import com.p280ss.android.ugc.aweme.services.superentrance.ISuperEntranceService;
import com.p280ss.android.ugc.aweme.services.video.IAVPublishService;
import com.p280ss.android.ugc.aweme.services.video.IImVideoCompileService;
import com.p280ss.android.ugc.aweme.services.video.IRecordActivityService;
import com.p280ss.android.ugc.aweme.services.video.IVideoCoverService;
import com.p280ss.android.ugc.aweme.services.video.IVideoModelCoverService;
import com.p280ss.android.ugc.aweme.services.video.IVideoRecordEntranceService;
import com.p280ss.android.ugc.aweme.services.video.ImVideoCompileService;
import com.p280ss.android.ugc.aweme.services.video.VideoCoverServiceImpl;
import com.p280ss.android.ugc.aweme.services.video.VideoModelCoverServiceImpl;
import com.p280ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl;
import com.p280ss.android.ugc.aweme.services.videochoose.IVideoChoose;
import com.p280ss.android.ugc.aweme.services.videochoose.IVideoChoose.Callback;
import com.p280ss.android.ugc.aweme.services.videoprocess.IVideoProcessorsService;
import com.p280ss.android.ugc.aweme.services.videoprocess.OnGetVideoCoverCallback;
import com.p280ss.android.ugc.aweme.servicimpl.C37519w;
import com.p280ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.p280ss.android.ugc.aweme.shortvideo.C39319cy;
import com.p280ss.android.ugc.aweme.shortvideo.C39320cz;
import com.p280ss.android.ugc.aweme.shortvideo.C39379ea;
import com.p280ss.android.ugc.aweme.shortvideo.C39811er;
import com.p280ss.android.ugc.aweme.shortvideo.C39967gn;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity;
import com.p280ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity.C38648a;
import com.p280ss.android.ugc.aweme.shortvideo.cut.gif.C38769h;
import com.p280ss.android.ugc.aweme.shortvideo.cutmusic.C39312e;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39781r;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.MainBusinessContext;
import com.p280ss.android.ugc.aweme.shortvideo.festival.p1572a.C39867a;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.shortvideo.p1551c.C38562h;
import com.p280ss.android.ugc.aweme.shortvideo.p1551c.C38564j;
import com.p280ss.android.ugc.aweme.shortvideo.p1551c.C38565k;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41253ah;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.PermissionSettingItem;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoPublishActivity;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordPermissionActivity;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40374af;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40376ag;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1602d.C40536c;
import com.p280ss.android.ugc.aweme.shortvideo.videoprocess.C41638b;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p280ss.android.ugc.aweme.story.shootvideo.textfont.C42038c;
import com.p280ss.android.ugc.aweme.story.shootvideo.textfont.C42039d;
import com.p280ss.android.ugc.aweme.tools.C42136ac;
import com.p280ss.android.ugc.aweme.tools.debug.AVSchemaTestActivity;
import com.p280ss.android.ugc.aweme.tools.draft.p1669d.C42287b;
import com.p280ss.android.ugc.aweme.tools.policysecurity.C42577a;
import com.p280ss.android.ugc.aweme.utils.C43128fi;
import com.p280ss.android.ugc.aweme.watermark.C43404d.C43405a;
import com.p280ss.android.ugc.aweme.watermark.C43406e;
import com.p280ss.android.ugc.effectmanager.C43681b;
import com.p280ss.android.ugc.effectmanager.C43845j;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.vesdk.VEUtils;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import dmt.p1861av.video.C47440an;
import dmt.p1861av.video.superentrance.C47512f;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.out.AVServiceImpl */
public class AVServiceImpl implements IAVService {
    private IAVPublishService avPublishService;
    private IAVSettingsService avSettingsService;
    private ICutVideoService cutVideoService;
    private C29120a diamondGameService;
    private IDraftService draftService;
    private IEffectService effectService;
    private C29130b festivalPublishService;
    private C29239bb filterService = new C34717g();
    private C33159b mediaChooseService;
    private IPhotoMovieService photoMovieService;
    private IPhotoService photoService;
    private IPreloadVESo preloadVESo;
    private IPublishService publishService;
    private ISDKService sdkService;
    private IShortVideoConfig shortVideoConfig;
    private IStickerUtilsService stickerUtilsService;
    private IAVStorageService storageService;
    private final C17457s<IAVStoryProxyService> storyProxyServiceSupplier = C17458t.m58015a(C34712b.f90509a);
    private C17457s<IStoryRecordService> storyRecordServiceSupplier = C17458t.m58015a(C34711a.f90508a);
    private ISuperEntranceService superEntranceService;
    private IUnLockStickerManagerService unLockStickerManagerService;
    private IVideo2GifService video2GifService;
    private IVideoCoverService videoCoverService;
    private IVideoProcessorsService videoProcessorsService;

    static {
        C43128fi.m136807a();
    }

    public void clearMusicIdPathList() {
        C40374af.m129113a();
    }

    public String getEffectSDKVersion() {
        return "6.0.0_rel_15_douyin_MT_202001141700_1611d1aa7c";
    }

    public C29239bb getFilterService() {
        return this.filterService;
    }

    public Class<?> getMediaChooseFragmentClass() {
        return MediaChooseFragment.class;
    }

    public int getMusicWaveBeanRemainProgress(int i) {
        return 99;
    }

    public Class<? extends Activity> getRecordPermissionActivity() {
        return VideoRecordPermissionActivity.class;
    }

    public Class<?> getShortVideoContextClass() {
        return ShortVideoContext.class;
    }

    public Class<? extends Activity> getVideoPublishActivity() {
        return VideoPublishActivity.class;
    }

    public void updateNewPermission() {
        C38562h.m123244a();
    }

    public String chooseMediaActivityName() {
        return ChooseMediaActivity.class.getName();
    }

    public C38564j createMaxDurationResolver() {
        return new C38565k();
    }

    public File getDiamondRecordCacheDir() {
        return new File(C39811er.f103471g);
    }

    public File getExternalFaceCacheDir() {
        return C40536c.m129605a();
    }

    public String getFilterFaceReshapeDir() {
        return C29337v.m96215a();
    }

    public IImVideoCompileService getImVideoCompileService() {
        return ImVideoCompileService.getInstance();
    }

    public File getLrcExternalCacheDir() {
        return C35563c.f93246i.mo103863b();
    }

    public List<MusicModel> getRecommendLyricMusicList() {
        return C35563c.f93246i.mo103851a();
    }

    public boolean getUsingOnline() {
        return C42136ac.m134102a();
    }

    public IVideoRecordEntranceService getVideoRecordEntranceService() {
        return VideoRecordEntranceServiceImpl.getINSTANCE();
    }

    public void hookVESDKSO() {
        C43128fi.f111749a.mo104764b();
    }

    public void initVideoImportConfig() {
        C35563c.f93255r.invalidate();
    }

    public void initVideoRecordConfig() {
        C35563c.f93254q.invalidate();
    }

    public boolean isLongVideoPermitted() {
        return C38562h.m123246b();
    }

    public boolean needLoginBeforeRecord() {
        return C39379ea.m125809a();
    }

    public IPromptService promptService() {
        return new C39781r();
    }

    public IRecordActivityService recordActivityService() {
        return C34720i.m112042a();
    }

    public IStorySettingService storySettingService() {
        return StorySettingServiceImpl.getINSTANCE();
    }

    public IVideoModelCoverService videoModelCoverService() {
        return VideoModelCoverServiceImpl.getINSTANCE();
    }

    static final /* synthetic */ IStoryRecordService lambda$new$0$AVServiceImpl() {
        return (IStoryRecordService) ServiceManager.get().getService(IStoryRecordService.class);
    }

    static final /* synthetic */ IAVStoryProxyService lambda$new$1$AVServiceImpl() {
        return (IAVStoryProxyService) ServiceManager.get().getService(IAVStoryProxyService.class);
    }

    public IAVSettingsService avSettingsService() {
        if (this.avSettingsService == null) {
            this.avSettingsService = new AVSettingsServiceImpl();
        }
        return this.avSettingsService;
    }

    public C29120a diamondGameService() {
        if (this.diamondGameService == null) {
            this.diamondGameService = new C39867a();
        }
        return this.diamondGameService;
    }

    public IDraftService draftService() {
        if (this.draftService == null) {
            this.draftService = new C42287b();
        }
        return this.draftService;
    }

    public IEffectService effectService() {
        if (this.effectService == null) {
            this.effectService = new EffectService();
        }
        return this.effectService;
    }

    public C29130b festivalPublishService() {
        if (this.festivalPublishService == null) {
            this.festivalPublishService = new C37519w();
        }
        return this.festivalPublishService;
    }

    public ICutVideoService getCutVideoService() {
        if (this.cutVideoService == null) {
            this.cutVideoService = new CutVideoService();
        }
        return this.cutVideoService;
    }

    public C33159b getMediaChooseService() {
        if (this.mediaChooseService == null) {
            this.mediaChooseService = new C33150a();
        }
        return this.mediaChooseService;
    }

    public IPublishService getPublishService() {
        if (this.publishService == null) {
            this.publishService = new PublishServiceImpl();
        }
        return this.publishService;
    }

    public ISDKService getSDKService() {
        if (this.sdkService == null) {
            this.sdkService = new SDKServiceImpl();
        }
        return this.sdkService;
    }

    public IStickerUtilsService getStickerUtilsService() {
        if (this.stickerUtilsService == null) {
            this.stickerUtilsService = new StickerUtilsServiceImpl();
        }
        return this.stickerUtilsService;
    }

    public ISuperEntranceService getSuperEntranceService() {
        if (this.superEntranceService == null) {
            this.superEntranceService = new C47512f();
        }
        return this.superEntranceService;
    }

    public String getVESDKVersion() {
        if (C6399b.m19944t()) {
            return "6.0.0.96-mt";
        }
        return "6.0.0.96";
    }

    public void initASVE() {
        new C39967gn();
        C35563c.m114829a(C39967gn.m127849a());
    }

    public boolean isRecording() {
        if (!C35563c.m114832a() || C41253ah.m131872a()) {
            return false;
        }
        return true;
    }

    public IPhotoMovieService photoMovieService() {
        if (this.photoMovieService == null) {
            this.photoMovieService = new PhotoMovieService();
        }
        return this.photoMovieService;
    }

    public IPhotoService photoService() {
        if (this.photoService == null) {
            this.photoService = new PhotoService();
        }
        return this.photoService;
    }

    public IPreloadVESo providePreloadVESo() {
        if (this.preloadVESo == null) {
            this.preloadVESo = new C34719h();
        }
        return this.preloadVESo;
    }

    public C1942b provideResourceFinder() {
        C35563c.m114838e();
        return C43681b.m138407b().mo105682f();
    }

    public IAVPublishService publishService() {
        if (this.avPublishService == null) {
            this.avPublishService = new AVPublishServiceImpl();
        }
        return this.avPublishService;
    }

    public IShortVideoConfig shortVideoConfig() {
        if (this.shortVideoConfig == null) {
            this.shortVideoConfig = new ShortVideoConfigImpl();
        }
        return this.shortVideoConfig;
    }

    public IAVStorageService storageService() {
        if (this.storageService == null) {
            this.storageService = new StorageServiceImpl();
        }
        return this.storageService;
    }

    public IStoryRecordService storyRecordService() {
        return (IStoryRecordService) this.storyRecordServiceSupplier.mo44946a();
    }

    public IUnLockStickerManagerService unLockStickerManagerService() {
        if (this.unLockStickerManagerService == null) {
            this.unLockStickerManagerService = new UnLockStickerManagerServiceImpl();
        }
        return this.unLockStickerManagerService;
    }

    public IVideo2GifService video2GifService() {
        if (this.video2GifService == null) {
            this.video2GifService = new C38769h();
        }
        return this.video2GifService;
    }

    public IVideoCoverService videoCoverService() {
        if (this.videoCoverService == null) {
            this.videoCoverService = new VideoCoverServiceImpl();
        }
        return this.videoCoverService;
    }

    public IVideoProcessorsService videoProcessorsService() {
        if (this.videoProcessorsService == null) {
            this.videoProcessorsService = new C41638b();
        }
        return this.videoProcessorsService;
    }

    public void setLongVideoPermitted(boolean z) {
        C38562h.m123245a(z);
    }

    public void setUsingOnline(boolean z) {
        C42136ac.m134101a(z);
    }

    public void turnStoryRecordPage(Intent intent) {
        C22472b.m74354a(intent);
    }

    public FaceStickerBean convertEffect2FaceStickerBean(Effect effect) {
        return C40376ag.m129117a(effect);
    }

    public IVideoChoose createVideoChooseFragment(Callback callback) {
        MusVideoChooseFragment a = MusVideoChooseFragment.m99634a();
        a.f80175e = callback;
        return a;
    }

    public int[] extractVideoFileInfo(String str) {
        return C47440an.m148109a(str);
    }

    public List<MediaModel> getMediaLoaderImages(Context context) {
        return C34753g.m112121a(context);
    }

    public String getShortVideoContextMainBusinessData(Object obj) {
        return ((ShortVideoContext) obj).f99754ao;
    }

    public IVideoLegalCheckerAndToastService getVideoLegalCheckerAndToastService(Context context) {
        return new C33160c(context);
    }

    public void initAIMusicSettings(String str) {
        C35563c.f93246i.mo103865c(str);
    }

    public void prefetchTypeface(Context context) {
        C42039d.m133620a().mo103222a(context);
    }

    public void setFontTypeList(List<C42038c> list) {
        C42039d.m133620a().mo103224a(list);
    }

    public IVideoChoose convertVideoChoose(Fragment fragment) {
        if (fragment instanceof MusVideoChooseFragment) {
            return (MusVideoChooseFragment) fragment;
        }
        return null;
    }

    public IPermissionSettingItem createPermissionSettingItem(Context context) {
        final PermissionSettingItem permissionSettingItem = new PermissionSettingItem(context, null);
        return new IPermissionSettingItem() {
            public final View asView() {
                return permissionSettingItem;
            }

            public final DmtTextView getPrivateHint() {
                return (DmtTextView) permissionSettingItem.findViewById(R.id.cjx);
            }

            public final ImageView getPrivateIcon() {
                return (ImageView) permissionSettingItem.findViewById(R.id.ck0);
            }

            public final void setPermission(int i) {
                permissionSettingItem.setPermission(i);
            }
        };
    }

    public List<String> gatherFilesToBeUploaded(Context context) {
        return Arrays.asList(C42577a.m135296a(context));
    }

    public Typeface getTypefaceByFontName(String str) {
        return C42039d.m133620a().mo103231c(str);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ AVMusicWaveBean lambda$getAvMusicWaveBean$4$AVServiceImpl(String str) throws Exception {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return getMusicWaveBean(str);
    }

    public String createMainBusinessContextJson(ShareContext shareContext) {
        MainBusinessContext mainBusinessContext = new MainBusinessContext();
        mainBusinessContext.setShareContext(shareContext);
        return C35563c.f93220B.getRetrofitFactoryGson().mo15979b((Object) mainBusinessContext);
    }

    public String detectIsFromEditOrStory(Context context) {
        IAVStoryProxyService iAVStoryProxyService = (IAVStoryProxyService) this.storyProxyServiceSupplier.mo44946a();
        if (iAVStoryProxyService != null) {
            return iAVStoryProxyService.detectIsFromEditOrStory(context);
        }
        if (context instanceof VEVideoPublishEditActivity) {
            return "video_edit_page";
        }
        return null;
    }

    public ShareContext getMainBusinessContextShareContext(String str) {
        MainBusinessContext mainBusinessContext = (MainBusinessContext) C35563c.f93220B.getRetrofitFactoryGson().mo15974a(str, MainBusinessContext.class);
        if (mainBusinessContext == null) {
            return null;
        }
        return mainBusinessContext.getShareContext();
    }

    public Map getTrickyMapByActivity(Context context) {
        IAVStoryProxyService iAVStoryProxyService = (IAVStoryProxyService) this.storyProxyServiceSupplier.mo44946a();
        if (iAVStoryProxyService != null) {
            return iAVStoryProxyService.getTrickyMapByActivity(context);
        }
        if (context instanceof VEVideoPublishEditActivity) {
            return ((VEVideoPublishEditActivity) context).mo98083f();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Object lambda$getMusicWaveBean$2$AVServiceImpl(String str) throws Exception {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return C35563c.f93224F.mo70086a().mo103849a(getMusicWaveBean(str));
    }

    public void openAVSchemaTestActivity(Context context) {
        Intent intent = new Intent(context, AVSchemaTestActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    private AVMusicWaveBean getMusicWaveBean(String str) {
        int i;
        int b = C35563c.f93246i.mo103862b(str);
        if (b < 0 || b > 90000) {
            return null;
        }
        if (b > 0) {
            i = C39312e.m125623a().mo97874a(b, true);
        } else {
            i = AdError.SERVER_ERROR_CODE;
        }
        if (i <= 0) {
            i = AdError.SERVER_ERROR_CODE;
        }
        return C39312e.m125620a(VEUtils.getMusicWaveData(str, 0, i));
    }

    public void startCutMultiVideoActivity(Context context, Intent intent) {
        VECutVideoActivity.f100410b.mo96676a(context, intent);
    }

    public void fetchResourcesNeededByRequirements(String[] strArr, final IFetchResourcesListener iFetchResourcesListener) {
        C35563c.m114838e();
        C43681b.m138407b().mo105677a(strArr, (C43845j) new C43845j() {
            /* renamed from: a */
            public final void mo70700a(Exception exc) {
                if (iFetchResourcesListener != null) {
                    iFetchResourcesListener.onFailed(exc);
                }
            }

            /* renamed from: a */
            public final void mo70701a(String[] strArr) {
                if (iFetchResourcesListener != null) {
                    iFetchResourcesListener.onSuccess(strArr);
                }
            }
        });
    }

    public void startStoryEditActivity(Activity activity, Intent intent) {
        IAVStoryProxyService iAVStoryProxyService = (IAVStoryProxyService) this.storyProxyServiceSupplier.mo44946a();
        if (iAVStoryProxyService != null) {
            iAVStoryProxyService.startStoryEditActivity(activity, intent);
        }
    }

    static final /* synthetic */ Object lambda$getAvMusicWaveBean$5$AVServiceImpl(MusicWaveDataListener musicWaveDataListener, C1592h hVar) throws Exception {
        if (musicWaveDataListener != null) {
            if (hVar == null) {
                musicWaveDataListener.onFinish(null);
            } else {
                musicWaveDataListener.onFinish(hVar.mo6890e());
            }
        }
        return null;
    }

    static final /* synthetic */ Object lambda$getMusicWaveBean$3$AVServiceImpl(MusicWaveDataListener musicWaveDataListener, C1592h hVar) throws Exception {
        if (musicWaveDataListener != null) {
            if (hVar == null) {
                musicWaveDataListener.onFinish(null);
            } else {
                musicWaveDataListener.onFinish(hVar.mo6890e());
            }
        }
        return null;
    }

    public void startSuperEntranceRecordActivity(Activity activity, Intent intent) {
        ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoRecordEntranceService().startSuperEntranceRecordActivity(activity, intent);
    }

    public void startToolPermissionActivity(Activity activity, Intent intent) {
        ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoRecordEntranceService().startToolPermissionActivity(activity, intent);
    }

    public void startCutMultiVideoActivityForResult(Activity activity, Intent intent, int i) {
        C38648a.m123460a(activity, intent, i);
    }

    public void startVideoEditActivity(Context context, Intent intent, int i) {
        VEVideoPublishEditActivity.m125843a(context, intent, i);
    }

    public void getVideoCover(String str, int i, OnGetVideoCoverCallback onGetVideoCoverCallback) {
        videoCoverService().getVideoCoverByCallback(str, i, onGetVideoCoverCallback);
    }

    public Void requestReactDuetSettings(String str, String str2, String str3) throws Exception {
        return C26047a.m85570a(str, str2, str3);
    }

    public IPermissionModule createPermissionModule(Activity activity, IPermissionSettingItem iPermissionSettingItem, int i) {
        final C39320cz czVar = new C39320cz(activity, (PermissionSettingItem) iPermissionSettingItem.asView(), i);
        return new IPermissionModule() {
            public final void onSaveInstanceState(Bundle bundle) {
                czVar.mo97883a(bundle);
            }

            public final void receivePermissionResult(Intent intent) {
                czVar.mo97882a(intent);
            }

            public final void restoreSavedInstanceState(Bundle bundle) {
                czVar.mo97886b(bundle);
            }

            public final void setupByActivity(C39319cy cyVar) {
                czVar.mo97887b(cyVar);
            }
        };
    }

    public AVMusicWaveBean getAvMusicWaveBean(String str, boolean z, MusicWaveDataListener musicWaveDataListener) {
        if (!z) {
            C1592h.m7853a((Callable<TResult>) new C34715e<TResult>(this, str)).mo6876a((C1591g<TResult, TContinuationResult>) new C34716f<TResult,TContinuationResult>(musicWaveDataListener), C1592h.f5958b);
            return null;
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            return getMusicWaveBean(str);
        }
    }

    public Fragment createMediaChooseFragment(AVChallenge aVChallenge, int i, boolean z, C33794a aVar, C33177i iVar) {
        return MediaChooseFragment.m112153a(aVChallenge, i, z, aVar, iVar);
    }

    public Fragment newVideoChooseFragmentInstance(int i, int i2, int i3, AVChallenge aVChallenge, C33177i iVar) {
        return VideoChooseFragment.m106935a(i, i2, i3, aVChallenge, iVar);
    }

    public void fetchChallengeDetail(String str, String str2, int i, int i2, C23319b<AVChallenge> bVar) {
        C35563c.f93241d.mo83166a(str, str2, i, i2, bVar);
    }

    public void startStorySettingActivity(Activity activity, int i, int i2, int i3, boolean z) {
        IAVStoryProxyService iAVStoryProxyService = (IAVStoryProxyService) this.storyProxyServiceSupplier.mo44946a();
        if (iAVStoryProxyService != null) {
            iAVStoryProxyService.startStorySettingActivity(activity, i, i2, i3, z);
        }
    }

    public void startStorySettingActivity(Activity activity, int i, int i2, boolean z, int i3) {
        IAVStoryProxyService iAVStoryProxyService = (IAVStoryProxyService) this.storyProxyServiceSupplier.mo44946a();
        if (iAVStoryProxyService != null) {
            iAVStoryProxyService.startStorySettingActivity(activity, i, i2, z, i3);
        }
    }

    public void startStorySettingActivityForView(Activity activity, int i, int i2, boolean z, int i3, ViewGroup viewGroup) {
        IAVStoryProxyService iAVStoryProxyService = (IAVStoryProxyService) this.storyProxyServiceSupplier.mo44946a();
        if (iAVStoryProxyService != null) {
            iAVStoryProxyService.startStorySettingActivityForView(activity, i, i2, z, i3, viewGroup);
        }
    }

    public Object getMusicWaveBean(String str, int i, boolean z, boolean z2, long j, MusicWaveDataListener musicWaveDataListener) {
        if (!z) {
            C1592h.m7853a((Callable<TResult>) new C34713c<TResult>(this, str)).mo6876a((C1591g<TResult, TContinuationResult>) new C34714d<TResult,TContinuationResult>(musicWaveDataListener), C1592h.f5958b);
            return null;
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            return C35563c.f93224F.mo70086a().mo103849a(getMusicWaveBean(str));
        }
    }

    public void startStorySettingActivity(Activity activity, int i, int i2, boolean z, boolean z2, boolean z3) {
        IAVStoryProxyService iAVStoryProxyService = (IAVStoryProxyService) this.storyProxyServiceSupplier.mo44946a();
        if (iAVStoryProxyService != null) {
            iAVStoryProxyService.startStorySettingActivity(activity, i, i2, z, z2, z3);
        }
    }

    public String[] createWaterMarkImages(int i, int i2, String str, String str2, String str3, boolean z, boolean z2, String str4, boolean z3) {
        return C43406e.m137744a(i, i2, str, str2, str3, z, z2, z3, new C43405a().mo105313a(str4).mo105314a());
    }
}
