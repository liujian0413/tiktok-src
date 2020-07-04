package com.p280ss.android.ugc.aweme.framework.services;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.framework.services.ConfigLoader */
class ConfigLoader {
    private static final Map<String, List<CacheItem>> CLASSES = Collections.synchronizedMap(new LinkedHashMap());
    private static final String[] DIRS = {"services/", "services/AwemeLive/", "services/AwemeIM/", "services/AwemeReactNative/", "services/AwemePush/", "services/AwemeShare/", "services/AwemeMain/", "services/AwemePlugin/", "services/SdkDebugger/", "services/AwemeMusic/", "services/AwemeVideo/", "services/AwemeFramework/", "services/AwemeCommerce/"};

    /* renamed from: com.ss.android.ugc.aweme.framework.services.ConfigLoader$CacheItem */
    static class CacheItem {
        public Object cacheService;
        public final String className;
        public final boolean persistence;

        public static CacheItem fromConfig(String str) {
            if (str == null || "".equals(str)) {
                return null;
            }
            String[] split = str.split(":");
            boolean z = false;
            String str2 = split[0];
            if (split.length > 1) {
                z = Boolean.parseBoolean(split[1]);
            }
            return new CacheItem(str2, z);
        }

        public CacheItem(String str, boolean z) {
            this.className = str;
            this.persistence = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.framework.services.ConfigLoader$ConfigIterator */
    static class ConfigIterator<T> implements Iterator<T> {
        private Class mClass;
        private ClassLoader mClassLoader;
        private List<CacheItem> mClasses;
        private int mIndex;

        public boolean hasNext() {
            if (this.mClasses == null || this.mIndex >= this.mClasses.size()) {
                return false;
            }
            return true;
        }

        public T next() {
            CacheItem cacheItem = (CacheItem) this.mClasses.get(this.mIndex);
            this.mIndex++;
            synchronized (cacheItem) {
                if (cacheItem.persistence && cacheItem.cacheService != null) {
                    T t = cacheItem.cacheService;
                    return t;
                } else if (!cacheItem.persistence) {
                    return newService(cacheItem);
                } else {
                    cacheItem.cacheService = newService(cacheItem);
                    T t2 = cacheItem.cacheService;
                    return t2;
                }
            }
        }

        private T newService(CacheItem cacheItem) {
            try {
                Class cls = Class.forName(cacheItem.className, false, this.mClassLoader);
                if (this.mClass.isAssignableFrom(cls)) {
                    try {
                        Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
                        declaredConstructor.setAccessible(true);
                        return declaredConstructor.newInstance(new Object[0]);
                    } catch (InstantiationException e) {
                        throw new RuntimeException(e);
                    } catch (IllegalAccessException e2) {
                        throw new RuntimeException(e2);
                    } catch (NoSuchMethodException e3) {
                        throw new RuntimeException(e3);
                    } catch (InvocationTargetException e4) {
                        throw new RuntimeException(e4);
                    }
                } else {
                    StringBuilder sb = new StringBuilder("source: ");
                    sb.append(cls.getName());
                    sb.append(", dest: ");
                    sb.append(this.mClass.getName());
                    throw new RuntimeException(new ClassCastException(sb.toString()));
                }
            } catch (ClassNotFoundException e5) {
                throw new RuntimeException(e5);
            }
        }

        public ConfigIterator(List<CacheItem> list, Class<T> cls, ClassLoader classLoader) {
            this.mClassLoader = classLoader;
            this.mClass = cls;
            this.mClasses = list;
        }
    }

    ConfigLoader() {
    }

    static {
        addCache("com.ss.android.ugc.aweme.net.INetReleaseInterceptor", "com.ss.android.ugc.aweme.net.interceptor.NetWorkSpeedInterceptor");
        addCache("com.ss.android.ugc.aweme.comment.IGifEmojiService", "com.ss.android.ugc.aweme.comment.GifEmojiServiceImpl");
        addCache("com.ss.android.ugc.aweme.profile.IProfileService", "com.ss.android.ugc.aweme.profile.ProfileServiceImpl");
        addCache("com.ss.android.ugc.aweme.homepage.api.tmp.HomeTmpBusinessService", "com.ss.android.ugc.aweme.main.homepageImpl.HomeTmpBusinessServiceImpl:true");
        addCache("com.ss.android.ugc.aweme.services.IBusinessComponentService", "com.ss.android.ugc.aweme.services.BusinessComponentServiceImpl:true");
        addCache("com.ss.android.ugc.aweme.services.IPrivacySettingService", "com.ss.android.ugc.aweme.shortvideo.service.PrivacySettingService:true");
        addCache("com.ss.android.ugc.aweme.feed.IFeedLogger", "com.ss.android.ugc.trill.start.FeedLogger");
        addCache("com.ss.android.ugc.aweme.feed.api.IFeedModuleService", "com.ss.android.ugc.aweme.feed.api.FeedModuleServiceImpl:true");
        addCache("com.bytedance.ies.ugc.aweme.network.IRetrofitFactory", "com.bytedance.ies.ugc.aweme.network.RetrofitFactory:true");
        addCache("com.ss.android.ugc.aweme.im.service.IIMService", "com.ss.android.ugc.aweme.im.sdk.providedservices.IMService:true");
        addCache("com.ss.android.ugc.aweme.shortvideo.ShortVideoPublishService$Factory", "com.ss.android.ugc.aweme.shortvideo.PublishServiceFactoryImpl:true");
        addCache("com.ss.android.ugc.awemepushapi.IPushApi", "com.ss.android.ugc.awemepushlib.interaction.PushService");
        addCache("com.ss.android.ugc.aweme.services.antispam.IAntiSpamService", "com.ss.android.ugc.aweme.services.AntiSpamService:true");
        addCache("com.ss.android.ugc.aweme.net.InterceptorProvider", "com.ss.android.ugc.aweme.utils.InterceptorHolder:true");
        addCache("com.ss.android.ugc.aweme.bullet.api.IBulletService", "com.ss.android.ugc.aweme.bullet.impl.BulletService");
        addCache("com.ss.android.ugc.aweme.framework.services.IUserService", "com.ss.android.ugc.aweme.services.UserService:true");
        addCache("com.ss.android.ugc.aweme.services.IAVInitializer", "com.ss.android.ugc.aweme.dmt_integration.AVInitializerImpl:true");
        addCache("com.ss.android.ugc.aweme.main.experiment.IHomepageExperimentService", "com.ss.android.ugc.aweme.homepage.experiment.HomepageExperimentServiceImpl");
        addCache("com.ss.android.ugc.gamora.integration.IIntegrationService", "com.ss.android.ugc.aweme.servicimpl.IntegrationServiceImpl:true");
        addCache("com.ss.android.ugc.aweme.feed.cache.IFeedApi", "com.ss.android.ugc.aweme.feed.FeedApiService");
        addCache("com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService", "com.ss.android.ugc.aweme.commercialize.LegacyCommercializeServiceImpl:true");
        addCache("com.ss.android.ugc.aweme.web.IAmeJsMessageHandlerService", "com.ss.android.ugc.aweme.web.AmeJsMessageHandlerServiceImpl");
        addCache("com.ss.android.ugc.aweme.framework.services.IFollowService", "com.ss.android.ugc.aweme.services.FollowService:true");
        addCache("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.IMediaChosenResultProcessFactory", "com.ss.android.ugc.aweme.shortvideo.MediaChosenResultProcessFactory:true");
        addCache("com.ss.android.ugc.aweme.tools.AVApi", "com.ss.android.ugc.aweme.shortvideo.AVApiImpl");
        addCache("com.ss.android.ugc.aweme.language.I18nManagerService", "com.ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl");
        addCache("com.ss.android.ugc.aweme.music.service.IMusicService", "com.ss.android.ugc.aweme.component.music.MusicService:true");
        addCache("com.ss.android.ugc.aweme.story.api.ILiveService", "com.ss.android.ugc.aweme.live.WatchLiveService:true");
        addCache("com.ss.android.ugc.aweme.notice.api.services.NoticeBridgeService", "com.ss.android.ugc.aweme.i18n.NoticeBridgeServiceImpl");
        addCache("com.ss.android.ugc.aweme.ILegacyService", "com.ss.android.ugc.aweme.LegacyServiceImpl:true");
        addCache("com.ss.android.ugc.aweme.port.in.IFestivalService", "com.ss.android.ugc.aweme.shortvideo.festival.FestivalService");
        addCache("com.ss.android.ugc.aweme.challenge.service.IChallengeDetailProvider", "com.ss.android.ugc.aweme.challenge.ChallengeDetailProvicer:true");
        addCache("com.ss.android.ugc.aweme.framework.services.IReportService", "com.ss.android.ugc.aweme.services.ReportService:true");
        addCache("com.ss.android.ugc.aweme.sdk.IWalletMainProxy", "com.ss.android.ugc.aweme.wallet.WalletMainProxy:true");
        addCache("com.ss.android.ugc.aweme.music.service.IMusicDetailService", "com.ss.android.ugc.aweme.music.service.MusicDetailService:true");
        addCache("com.ss.android.ugc.aweme.feed.service.IFeedComponentService", "com.ss.android.ugc.aweme.feed.service.FeedComponentServiceImpl:true");
        addCache("com.ss.android.ugc.aweme.framework.services.IRetrofitService", "com.ss.android.ugc.aweme.services.RetrofitService:true");
        addCache("com.ss.android.ugc.aweme.utils.GsonProvider", "com.ss.android.ugc.aweme.utils.GsonHolder:true");
        addCache("com.ss.android.ugc.aweme.im.sdk.providedservices.IImplService", "com.ss.android.ugc.aweme.im.sdk.providedservices.ImplService:true");
        addCache("com.ss.android.ugc.aweme.commercialize.feed.IFeedTypeService", "com.ss.android.ugc.aweme.commercialize.feed.FeedTypeServiceImpl:true");
        addCache("com.ss.android.ugc.aweme.services.IAVServiceProxy", "com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl:true");
        addCache("com.ss.android.ugc.aweme.music.service.ISearchMusicDepentService", "com.ss.android.ugc.aweme.discover.adapter.music.SearchMusicDepentServiceImpl");
        addCache("com.ss.android.ugc.aweme.sdk.IWalletService", "com.ss.android.ugc.aweme.sdk.WalletService:true");
        addCache("com.ss.android.ugc.aweme.search.ISearchHandler", "com.ss.android.ugc.aweme.discover.SearchHandlerImpl");
        addCache("com.ss.android.ugc.aweme.ad.services.IAdService", "com.ss.android.ugc.aweme.ad.AdServiceImpl");
        addCache("com.ss.android.ugc.aweme.draft.model.DraftUpdateService", "com.ss.android.ugc.aweme.shortvideo.DraftUpdateServiceImpl:true");
        addCache("com.ss.android.ugc.aweme.sdk.IIapWalletProxy", "com.ss.android.ugc.aweme.sdk.IapWalletProxy:true");
        addCache("com.ss.android.ugc.aweme.share.ILiveShareService", "com.ss.android.ugc.aweme.feed.share.command.LiveShareServiceImpl:true");
        addCache("com.ss.android.ugc.aweme.services.IMainService", "com.ss.android.ugc.aweme.services.MainServiceImpl");
        addCache("com.ss.android.ugc.aweme.crossplatform.platform.rn.service.IReactService", "com.ss.android.ugc.aweme.crossplatform.platform.rn.service.ReactService:true");
        addCache("com.ss.android.ugc.aweme.services.IAVService", "com.ss.android.ugc.aweme.out.AVServiceImpl:true");
        addCache("com.ss.android.ugc.aweme.port.in.IRecordingStateService", "com.ss.android.ugc.aweme.shortvideo.RecordingStateServiceImpl:true");
        addCache("com.ss.android.ugc.aweme.poi.IPOIService", "com.ss.android.ugc.aweme.poi.services.POIService:true");
        addCache("com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService", "com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl:true");
        addCache("com.ss.android.ugc.aweme.reponsitory.IFollowerRelationRepository", "com.ss.android.ugc.aweme.following.repository.FollowerRelationRepoServiceImpl");
        addCache("com.ss.android.ugc.aweme.bridgeservice.IBridgeService", "com.ss.android.ugc.aweme.i18n.BridgeService");
        addCache("com.ss.android.ugc.aweme.services.watermark.IWaterMarkService", "com.ss.android.ugc.aweme.watermark.WaterMarkServiceImpl:true");
        addCache("com.ss.android.ugc.aweme.IAccountService", "com.ss.android.ugc.aweme.AccountService:true");
        addCache("com.ss.android.ugc.aweme.privacychecker.api.PrivacyCheckerService", "com.ss.android.ugc.aweme.privacychecker.impl.fake.PrivacyCheckerServiceImpl:true");
        addCache("com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService", "com.ss.android.ugc.aweme.profile.service.ProfileDependentComponentImpl");
        addCache("com.ss.android.ugc.aweme.sticker.IStickerViewService", "com.ss.android.ugc.aweme.shortvideo.sticker.impl.StickerViewServiceImpl:true");
        addCache("com.ss.android.ugc.aweme.framework.services.IMedialibConfigService", "com.ss.android.ugc.aweme.out.MedialibConfigService:true");
        addCache("com.ss.android.ugc.aweme.IAgeGateService", "com.ss.android.ugc.aweme.account.AgeGateService:true");
        addCache("com.ss.android.ugc.aweme.net.IReleaseInterceptor", "com.ss.android.ugc.aweme.net.interceptor.DevicesNullInterceptor\ncom.ss.android.ugc.aweme.net.interceptor.ApiOkInterceptor");
        addCache("com.ss.android.ugc.aweme.services.UserRepoService", "com.ss.android.ugc.aweme.user.repository.UserRepoServiceImpl");
        addCache("com.ss.android.ugc.aweme.search.ISearchService", "com.ss.android.ugc.aweme.search.SearchServiceImpl");
        addCache("com.ss.android.ugc.aweme.base.ImageUserService", "com.ss.android.ugc.aweme.services.ImageUserServiceImpl");
        addCache("com.ss.android.ugc.aweme.secapi.ISecApi", "com.ss.android.ugc.aweme.sec.SecApiImpl:true");
        addCache("com.ss.android.ugc.aweme.notification.bridgeservice.INoticeBridgeService", "com.ss.android.ugc.aweme.notification.bridgeservice.I18nNoticeBridgeService");
    }

    private static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static <T> Iterator<T> iterator(Class<T> cls) {
        ClassLoader classLoader = cls.getClassLoader();
        return new ConfigIterator(loadClasses(cls, classLoader), cls, classLoader);
    }

    private static List<CacheItem> parseSafely(URL url) {
        int i = 0;
        while (i < 3) {
            try {
                return parse(url);
            } catch (ConcurrentModificationException e) {
                if (i < 2) {
                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException unused) {
                    }
                    i++;
                } else {
                    throw e;
                }
            }
        }
        return new LinkedList();
    }

    private static List<CacheItem> parse(URL url) {
        InputStream inputStream;
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        LinkedList linkedList = new LinkedList();
        BufferedReader bufferedReader2 = null;
        try {
            inputStream = url.openStream();
            try {
                inputStreamReader = new InputStreamReader(inputStream);
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                } catch (IOException unused) {
                    closeQuietly(bufferedReader2);
                    closeQuietly(inputStreamReader);
                    closeQuietly(inputStream);
                    return linkedList;
                } catch (Throwable th) {
                    th = th;
                    closeQuietly(bufferedReader2);
                    closeQuietly(inputStreamReader);
                    closeQuietly(inputStream);
                    throw th;
                }
                try {
                    for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                        CacheItem fromConfig = CacheItem.fromConfig(readLine);
                        if (fromConfig != null) {
                            linkedList.add(fromConfig);
                        }
                    }
                    closeQuietly(bufferedReader);
                } catch (IOException unused2) {
                    bufferedReader2 = bufferedReader;
                    closeQuietly(bufferedReader2);
                    closeQuietly(inputStreamReader);
                    closeQuietly(inputStream);
                    return linkedList;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader2 = bufferedReader;
                    closeQuietly(bufferedReader2);
                    closeQuietly(inputStreamReader);
                    closeQuietly(inputStream);
                    throw th;
                }
            } catch (IOException unused3) {
                inputStreamReader = null;
                closeQuietly(bufferedReader2);
                closeQuietly(inputStreamReader);
                closeQuietly(inputStream);
                return linkedList;
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader = null;
                closeQuietly(bufferedReader2);
                closeQuietly(inputStreamReader);
                closeQuietly(inputStream);
                throw th;
            }
        } catch (IOException unused4) {
            inputStream = null;
            inputStreamReader = null;
            closeQuietly(bufferedReader2);
            closeQuietly(inputStreamReader);
            closeQuietly(inputStream);
            return linkedList;
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
            inputStreamReader = null;
            closeQuietly(bufferedReader2);
            closeQuietly(inputStreamReader);
            closeQuietly(inputStream);
            throw th;
        }
        closeQuietly(inputStreamReader);
        closeQuietly(inputStream);
        return linkedList;
    }

    private static void addCache(String str, String str2) {
        String[] split = str2.split("\n");
        ArrayList arrayList = new ArrayList();
        for (String fromConfig : split) {
            arrayList.add(CacheItem.fromConfig(fromConfig));
        }
        CLASSES.put(str, arrayList);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        r4 = getUrls(r6, r7, r1[r3]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (r4 == null) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r4.hasMoreElements() == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        r0.addAll(parseSafely((java.net.URL) r4.nextElement()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        r7 = CLASSES;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        if (CLASSES.containsKey(r6) != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        CLASSES.put(r6.getName(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        r0 = (java.util.List) CLASSES.get(r6.getName());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0060, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0061, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        r0 = new java.util.LinkedList<>();
        r1 = DIRS;
        r2 = r1.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r3 >= r2) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <T> java.util.List<com.p280ss.android.ugc.aweme.framework.services.ConfigLoader.CacheItem> loadClasses(java.lang.Class<T> r6, java.lang.ClassLoader r7) {
        /*
            java.util.Map<java.lang.String, java.util.List<com.ss.android.ugc.aweme.framework.services.ConfigLoader$CacheItem>> r0 = CLASSES
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.util.List<com.ss.android.ugc.aweme.framework.services.ConfigLoader$CacheItem>> r1 = CLASSES     // Catch:{ all -> 0x0065 }
            java.lang.String r2 = r6.getName()     // Catch:{ all -> 0x0065 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x0065 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0065 }
            if (r1 == 0) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x0065 }
            return r1
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x0065 }
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.lang.String[] r1 = DIRS
            int r2 = r1.length
            r3 = 0
        L_0x001d:
            if (r3 >= r2) goto L_0x003e
            r4 = r1[r3]
            java.util.Enumeration r4 = getUrls(r6, r7, r4)
        L_0x0025:
            if (r4 == 0) goto L_0x003b
            boolean r5 = r4.hasMoreElements()
            if (r5 == 0) goto L_0x003b
            java.lang.Object r5 = r4.nextElement()
            java.net.URL r5 = (java.net.URL) r5
            java.util.List r5 = parseSafely(r5)
            r0.addAll(r5)
            goto L_0x0025
        L_0x003b:
            int r3 = r3 + 1
            goto L_0x001d
        L_0x003e:
            java.util.Map<java.lang.String, java.util.List<com.ss.android.ugc.aweme.framework.services.ConfigLoader$CacheItem>> r7 = CLASSES
            monitor-enter(r7)
            java.util.Map<java.lang.String, java.util.List<com.ss.android.ugc.aweme.framework.services.ConfigLoader$CacheItem>> r1 = CLASSES     // Catch:{ all -> 0x0062 }
            boolean r1 = r1.containsKey(r6)     // Catch:{ all -> 0x0062 }
            if (r1 != 0) goto L_0x0053
            java.util.Map<java.lang.String, java.util.List<com.ss.android.ugc.aweme.framework.services.ConfigLoader$CacheItem>> r1 = CLASSES     // Catch:{ all -> 0x0062 }
            java.lang.String r6 = r6.getName()     // Catch:{ all -> 0x0062 }
            r1.put(r6, r0)     // Catch:{ all -> 0x0062 }
            goto L_0x0060
        L_0x0053:
            java.util.Map<java.lang.String, java.util.List<com.ss.android.ugc.aweme.framework.services.ConfigLoader$CacheItem>> r0 = CLASSES     // Catch:{ all -> 0x0062 }
            java.lang.String r6 = r6.getName()     // Catch:{ all -> 0x0062 }
            java.lang.Object r6 = r0.get(r6)     // Catch:{ all -> 0x0062 }
            r0 = r6
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0062 }
        L_0x0060:
            monitor-exit(r7)     // Catch:{ all -> 0x0062 }
            return r0
        L_0x0062:
            r6 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0062 }
            throw r6
        L_0x0065:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0065 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.framework.services.ConfigLoader.loadClasses(java.lang.Class, java.lang.ClassLoader):java.util.List");
    }

    private static Enumeration<URL> getUrls(Class cls, ClassLoader classLoader, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(cls.getName());
        String sb2 = sb.toString();
        if (classLoader == null) {
            try {
                return ClassLoader.getSystemResources(sb2);
            } catch (IOException unused) {
                return null;
            }
        } else {
            try {
                return classLoader.getResources(sb2);
            } catch (IOException unused2) {
                return null;
            }
        }
    }
}
