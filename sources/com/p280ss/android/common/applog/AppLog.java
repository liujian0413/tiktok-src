package com.p280ss.android.common.applog;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.common.utility.C6302a;
import com.bytedance.common.utility.C6312h;
import com.bytedance.common.utility.C6317k;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.NetworkUtils.NetworkType;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.p254b.C6304f;
import com.bytedance.frameworks.core.encrypt.TTEncryptUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import com.p280ss.android.C6725a;
import com.p280ss.android.common.C6730a;
import com.p280ss.android.common.applog.TrafficGuard.ITrafficWarningCallback;
import com.p280ss.android.common.applog.p286a.C6747c;
import com.p280ss.android.common.p285a.C19263a.C6731a;
import com.p280ss.android.common.p287b.C6755a;
import com.p280ss.android.common.util.C6772a;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.deviceregister.AppProvider;
import com.p280ss.android.deviceregister.C6789d;
import com.p280ss.android.deviceregister.C6789d.C6790a;
import com.p280ss.android.deviceregister.C6793k;
import com.p280ss.android.deviceregister.p289a.C6778a;
import com.p280ss.android.deviceregister.p289a.C6779b;
import com.p280ss.android.deviceregister.p289a.C6780c;
import com.p280ss.android.deviceregister.p289a.C6781d;
import com.p280ss.android.deviceregister.p290b.C6782a;
import com.p280ss.android.deviceregister.p290b.C6782a.C6783a;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.base.utils.C6900g;
import com.p280ss.android.ugc.aweme.lancet.C7109b;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40413c;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread.UncaughtExceptionHandler;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.common.applog.AppLog */
public class AppLog implements ITrafficWarningCallback, C6780c, UncaughtExceptionHandler {
    static final String[] HEADER_KEYS = {"appkey", "udid", "openudid", "sdk_version", "package", "channel", "display_name", "app_version", "version_code", "timezone", "access", "os", "os_version", "os_api", "device_model", "device_brand", "device_manufacturer", "language", "resolution", "display_density", "density_dpi", "mc", "carrier", "mcc_mnc", "clientudid", "install_id", "device_id", "sig_hash", "aid", "push_sdk", "rom", "aliyun_uuid", "release_build", "update_version_code", "manifest_version_code", "cpu_abi", "build_serial", "app_track", "serial_number", "sim_serial_number", "not_request_sender", "rom_version", "region", "tz_name", "tz_offset", "sim_region", "custom", "google_aid", "app_language", "app_region"};
    private static final List<ICrashCallback> mCallbacks = new ArrayList();
    private static volatile boolean mCollectFreeSpace;
    private static final SimpleDateFormat mDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
    private static volatile FreeSpaceCollector mFreeSpaceCollector;
    private static boolean mHasHandledCache;
    private static volatile long mLastGetAppConfigTime;
    public static int mLaunchFrom;
    private static String sAbSDKVersion;
    private static boolean sAliyunPushInclude = true;
    private static boolean sAnonymous;
    private static C6730a sAppContext;
    static int sAppCount = 0;
    static volatile int sAppLogHttpsToHttp = 0;
    private static long sAppStartTime;
    private static WeakReference<ConfigUpdateListener> sConfigUpdateListener = null;
    private static final Bundle sCustomBundle = new Bundle();
    static ICustomInfo sCustomInfo;
    private static long sFetchActiveTime = 0;
    private static GlobalEventCallback sGlobalEventCallback;
    private static Handler sHandler = new Handler(Looper.getMainLooper());
    public static volatile boolean sHasLoadDid = false;
    private static boolean sHasManualInvokeActiveUser = false;
    private static volatile JSONObject sHeaderCopy = null;
    private static String sHostI = "ic.snssdk.com";
    private static String sHostLog = "log.snssdk.com";
    private static String sHostMon = "mon.snssdk.com";
    private static String sHostSrv = "ichannel.snssdk.com";
    private static String sHostTimely = "rtlog.snssdk.com";
    private static boolean sHwPushInclude = true;
    private static volatile boolean sInitGuard;
    private static boolean sInitWithActivity = false;
    private static AppLog sInstance;
    private static final ThreadLocal<Boolean> sIsConfigThread = new ThreadLocal<>();
    private static boolean sIsNotRequestSender = false;
    static String sLastCreateActivityName;
    static String sLastCreateActivityNameAndTime;
    static String sLastResumeActivityName;
    static String sLastResumeActivityNameAndTime;
    private static final Object sLock = new Object();
    private static final Object sLogConfigLock = new Object();
    static ILogEncryptConfig sLogEncryptCfg;
    private static boolean sMiPushInclude = true;
    private static boolean sMyPushInclude = true;
    private static boolean sMzPushInclude = true;
    public static volatile boolean sPendingActiveUser = false;
    private static boolean sReportCrash = true;
    static String sRomInfo = null;
    static final List<ILogSessionHook> sSessionHookList = new ArrayList(2);
    static String sSessionKey = "";
    static volatile boolean sStopped = false;
    static volatile LogRequestTraceCallback sTraceCallback;
    private static boolean sUmengPushInclude = true;
    static AtomicLong sUserId = new AtomicLong();
    private static UrlConfig urlConfig;
    private ANRMonitor mANRMonitor = null;
    ActivityRecord mActivityRecord;
    private long mActivityTime = 0;
    private volatile boolean mAllowOldImageSample = false;
    private String mAllowPushListJsonStr = "";
    private final HashSet<Integer> mAllowPushSet = new HashSet<>();
    private long mBatchEventInterval = 0;
    private final ConcurrentHashMap<String, String> mBlackV1 = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, String> mBlackV3 = new ConcurrentHashMap<>();
    public final Context mContext;
    private int mEnableTrafficGuard = 0;
    private final ConcurrentHashMap<String, String> mEventTimely = new ConcurrentHashMap<>();
    private final JSONObject mFingerprint;
    private HashSet<Integer> mFingerprintSet = new HashSet<>();
    private boolean mForbidReportPhoneDetailInfo;
    private final AtomicLong mGlobalEventIndexMatrix = new AtomicLong();
    private final AtomicLong mGlobalEventIndexMatrixV1 = new AtomicLong();
    private long mGlobalEventIndexSavePoint;
    private boolean mHasSetup = false;
    private boolean mHasTryResendConfig = false;
    public boolean mHasUpdateConfig;
    private final JSONObject mHeader;
    private long mHeartbeatTime = System.currentTimeMillis();
    private int mHttpMonitorPort = 0;
    private HashSet<Integer> mImageErrorCodes = new HashSet<>();
    private List<ImageErrorConfigItem> mImageErrorList = new ArrayList();
    private Map<String, ImageErrorStatusItem> mImageErrorStatusMap = new HashMap();
    private AtomicInteger mImageFailureCount = new AtomicInteger();
    private Map<String, ImageErrorStatusItem> mImageHttpErrorStatusMap = new HashMap();
    private List<SampleRatioItem> mImageRatioList = new ArrayList();
    private AtomicInteger mImageSuccessCount = new AtomicInteger();
    volatile boolean mInitOk;
    private int mLastConfigVersion;
    private volatile boolean mLoadingOnlineConfig = false;
    final LinkedList<LogQueueItem> mLogQueue = new LinkedList<>();
    volatile LogReaper mLogReaper = null;
    private final C6302a mNetWorkMonitor;
    UncaughtExceptionHandler mOriginHandler = null;
    final LinkedList<ActionQueueItem> mQueue = new LinkedList<>();
    private Random mRandom = new Random();
    private LinkedList<ImageSample> mSamples = new LinkedList<>();
    private long mSendFingerprintTime = 0;
    private int mSendLaunchTimely = 1;
    private LogSession mSession;
    public long mSessionInterval = 30000;
    private boolean mSetupOk = false;
    private volatile long mStartWaitSendTimely;
    private final AtomicBoolean mStopFlag = new AtomicBoolean();
    private JSONObject mTimeSync = null;
    private TrafficGuard mTrafficGuard = null;
    private volatile long mTryUpdateConfigTime = 0;
    private volatile long mUpdateConfigTime = 0;
    private int mVersionCode = 1;
    private WifiBssidInfo mWifiBssidInfo;

    /* renamed from: com.ss.android.common.applog.AppLog$ActionQueueItem */
    static class ActionQueueItem {
        public long arg;
        public Object obj;
        public String strArg;
        public final ActionQueueType type;

        public ActionQueueItem(ActionQueueType actionQueueType) {
            this.type = actionQueueType;
        }
    }

    /* renamed from: com.ss.android.common.applog.AppLog$ActionQueueType */
    enum ActionQueueType {
        PAGE_START(0),
        PAGE_END(1),
        EVENT(2),
        IMAGE_SAMPLE(3),
        CONFIG_UPDATE(4),
        API_SAMPLE(5),
        UA_UPDATE(6),
        SAVE_ANR_TAG(7),
        SAVE_DNS_REPORT(8),
        SAVE_MISC_LOG(9),
        DEVICE_ID_UPDATE(10),
        CUSTOMER_HEADER_UPDATE(11),
        UPDATE_GOOGLE_AID(12),
        UPDATE_APP_LANGUAGE_REGION(13);
        
        final int nativeInt;

        private ActionQueueType(int i) {
            this.nativeInt = i;
        }
    }

    /* renamed from: com.ss.android.common.applog.AppLog$ActionReaper */
    class ActionReaper extends Thread implements C6790a {
        private boolean mCheckEnd;

        private void tryPrepareUpdateConfig() {
            C6789d.m21064a((C6790a) this);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(6:13|14|(1:16)(1:17)|18|19|(3:38|21|22)(1:23)) */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
            if (r5.this$0.mQueue.isEmpty() == false) goto L_0x0053;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0060, code lost:
            if (r0 == null) goto L_0x006a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0062, code lost:
            r5.this$0.processItem(r0);
            r5.mCheckEnd = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x006c, code lost:
            if (r5.mCheckEnd == false) goto L_0x0075;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x006e, code lost:
            r5.mCheckEnd = false;
            r5.this$0.checkSessionEnd();
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0043 */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0047 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
                r5.tryPrepareUpdateConfig()
                com.ss.android.common.applog.AppLog r0 = com.p280ss.android.common.applog.AppLog.this
                boolean r0 = r0.setupLogReaper()
                if (r0 != 0) goto L_0x000c
                return
            L_0x000c:
                com.ss.android.common.applog.AppLog r0 = com.p280ss.android.common.applog.AppLog.this
                r0.ensureHeaderCopy()
                com.ss.android.common.applog.AppLog r0 = com.p280ss.android.common.applog.AppLog.this
                r0.checkSessionEnd()
            L_0x0016:
                r0 = 0
                com.ss.android.common.applog.AppLog r1 = com.p280ss.android.common.applog.AppLog.this
                java.util.LinkedList<com.ss.android.common.applog.AppLog$ActionQueueItem> r1 = r1.mQueue
                monitor-enter(r1)
                boolean r2 = com.p280ss.android.common.applog.AppLog.sStopped     // Catch:{ all -> 0x007b }
                if (r2 == 0) goto L_0x0022
                monitor-exit(r1)     // Catch:{ all -> 0x007b }
                return
            L_0x0022:
                com.ss.android.common.applog.AppLog r2 = com.p280ss.android.common.applog.AppLog.this     // Catch:{ all -> 0x007b }
                java.util.LinkedList<com.ss.android.common.applog.AppLog$ActionQueueItem> r2 = r2.mQueue     // Catch:{ all -> 0x007b }
                boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x007b }
                if (r2 == 0) goto L_0x0053
                boolean r2 = r5.mCheckEnd     // Catch:{ InterruptedException -> 0x0043 }
                if (r2 == 0) goto L_0x003c
                com.ss.android.common.applog.AppLog r2 = com.p280ss.android.common.applog.AppLog.this     // Catch:{ InterruptedException -> 0x0043 }
                java.util.LinkedList<com.ss.android.common.applog.AppLog$ActionQueueItem> r2 = r2.mQueue     // Catch:{ InterruptedException -> 0x0043 }
                com.ss.android.common.applog.AppLog r3 = com.p280ss.android.common.applog.AppLog.this     // Catch:{ InterruptedException -> 0x0043 }
                long r3 = r3.mSessionInterval     // Catch:{ InterruptedException -> 0x0043 }
                r2.wait(r3)     // Catch:{ InterruptedException -> 0x0043 }
                goto L_0x0043
            L_0x003c:
                com.ss.android.common.applog.AppLog r2 = com.p280ss.android.common.applog.AppLog.this     // Catch:{ InterruptedException -> 0x0043 }
                java.util.LinkedList<com.ss.android.common.applog.AppLog$ActionQueueItem> r2 = r2.mQueue     // Catch:{ InterruptedException -> 0x0043 }
                r2.wait()     // Catch:{ InterruptedException -> 0x0043 }
            L_0x0043:
                boolean r2 = com.p280ss.android.common.applog.AppLog.sStopped     // Catch:{ all -> 0x007b }
                if (r2 == 0) goto L_0x0049
                monitor-exit(r1)     // Catch:{ all -> 0x007b }
                return
            L_0x0049:
                com.ss.android.common.applog.AppLog r2 = com.p280ss.android.common.applog.AppLog.this     // Catch:{ all -> 0x007b }
                java.util.LinkedList<com.ss.android.common.applog.AppLog$ActionQueueItem> r2 = r2.mQueue     // Catch:{ all -> 0x007b }
                boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x007b }
                if (r2 != 0) goto L_0x005d
            L_0x0053:
                com.ss.android.common.applog.AppLog r0 = com.p280ss.android.common.applog.AppLog.this     // Catch:{ all -> 0x007b }
                java.util.LinkedList<com.ss.android.common.applog.AppLog$ActionQueueItem> r0 = r0.mQueue     // Catch:{ all -> 0x007b }
                java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x007b }
                com.ss.android.common.applog.AppLog$ActionQueueItem r0 = (com.p280ss.android.common.applog.AppLog.ActionQueueItem) r0     // Catch:{ all -> 0x007b }
            L_0x005d:
                monitor-exit(r1)     // Catch:{ all -> 0x007b }
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L_0x006a
                com.ss.android.common.applog.AppLog r3 = com.p280ss.android.common.applog.AppLog.this
                r3.processItem(r0)
                r5.mCheckEnd = r2
                goto L_0x0075
            L_0x006a:
                boolean r0 = r5.mCheckEnd
                if (r0 == 0) goto L_0x0075
                r5.mCheckEnd = r1
                com.ss.android.common.applog.AppLog r0 = com.p280ss.android.common.applog.AppLog.this
                r0.checkSessionEnd()
            L_0x0075:
                com.ss.android.common.applog.AppLog r0 = com.p280ss.android.common.applog.AppLog.this
                r0.tryUpdateConfig(r2, r1)
                goto L_0x0016
            L_0x007b:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x007b }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.applog.AppLog.ActionReaper.run():void");
        }

        public ActionReaper() {
            super("ActionReaper");
        }

        public void onDidLoadLocally(boolean z) {
            AppLog.sHasLoadDid = true;
            if (AppLog.sPendingActiveUser) {
                AppLog.activeUserInvokeInternal(AppLog.this.mContext);
            }
        }

        public void onRemoteConfigUpdate(boolean z, boolean z2) {
            if (AppLog.this.mHasUpdateConfig) {
                AppLog.this.mHasUpdateConfig = false;
                return;
            }
            if (z) {
                AppLog.this.tryUpdateConfig(false, true, z2);
            }
        }

        public void onDeviceRegistrationInfoChanged(String str, String str2) {
            ActionQueueItem actionQueueItem = new ActionQueueItem(ActionQueueType.DEVICE_ID_UPDATE);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("device_id", str);
                jSONObject.put("install_id", str2);
                actionQueueItem.obj = jSONObject;
            } catch (JSONException unused) {
            }
            AppLog.this.enqueue(actionQueueItem);
            AppLog.this.mHasUpdateConfig = true;
        }
    }

    /* renamed from: com.ss.android.common.applog.AppLog$ActivityRecord */
    public static class ActivityRecord {
        public String mActivityClassName;
        public int mHashcode;

        public ActivityRecord() {
        }

        public ActivityRecord(String str, int i) {
            this.mActivityClassName = str;
            this.mHashcode = i;
        }
    }

    /* renamed from: com.ss.android.common.applog.AppLog$ConfigUpdateListener */
    public interface ConfigUpdateListener {
        void onConfigUpdate();

        void onRemoteConfigUpdate(boolean z);
    }

    /* renamed from: com.ss.android.common.applog.AppLog$ConfigUpdateListenerEnhanced */
    public interface ConfigUpdateListenerEnhanced extends ConfigUpdateListener {
        void handleConfigUpdate(JSONObject jSONObject);
    }

    /* renamed from: com.ss.android.common.applog.AppLog$FreeSpaceCollector */
    public interface FreeSpaceCollector {
        JSONObject getFreeSpace();
    }

    /* renamed from: com.ss.android.common.applog.AppLog$ICrashCallback */
    public interface ICrashCallback {
        void callback(String str);
    }

    /* renamed from: com.ss.android.common.applog.AppLog$ICustomInfo */
    public interface ICustomInfo extends C6779b {
        JSONObject getUserDefineInfo();
    }

    /* renamed from: com.ss.android.common.applog.AppLog$ILogEncryptConfig */
    public interface ILogEncryptConfig {
        boolean getEncryptSwitch();

        boolean getEventV3Switch();

        boolean getRecoverySwitch();
    }

    /* renamed from: com.ss.android.common.applog.AppLog$ILogSessionHook */
    public interface ILogSessionHook {
        void onLogSessionBatchEvent(long j, String str, JSONObject jSONObject);

        void onLogSessionStart(long j);

        void onLogSessionTerminate(long j, String str, JSONObject jSONObject);
    }

    /* renamed from: com.ss.android.common.applog.AppLog$ImageErrorConfigItem */
    static class ImageErrorConfigItem {
        final String host;
        final int net_error_interval;
        final int net_report_count;
        final int net_silent_period;
        final int srv_error_interval;
        final int srv_report_count;
        final int srv_silent_period;

        public ImageErrorConfigItem(String str, int i, int i2, int i3, int i4, int i5, int i6) {
            this.host = str;
            this.net_error_interval = i;
            this.net_report_count = i2;
            this.net_silent_period = i3;
            this.srv_error_interval = i4;
            this.srv_report_count = i5;
            this.srv_silent_period = i6;
        }
    }

    /* renamed from: com.ss.android.common.applog.AppLog$ImageErrorStatusItem */
    static class ImageErrorStatusItem {
        int count;
        final String host;
        boolean in_silent;
        long timestamp;

        public ImageErrorStatusItem(String str) {
            this.host = str;
        }
    }

    /* renamed from: com.ss.android.common.applog.AppLog$ImageSample */
    static class ImageSample {
        public final int networktype;
        public final long time;
        public final long timestamp;
        public final String url;

        public ImageSample(String str, int i, long j, long j2) {
            this.url = str;
            this.networktype = i;
            this.time = j;
            this.timestamp = j2;
        }
    }

    /* renamed from: com.ss.android.common.applog.AppLog$ImageStatsThread */
    static class ImageStatsThread extends C6304f {
        final boolean is_sample;
        final String sample_str;
        final int status;

        /* renamed from: tr */
        final Throwable f19225tr;

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0054 */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0065 A[Catch:{ Throwable -> 0x007f }] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0066 A[Catch:{ Throwable -> 0x007f }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r8 = this;
                java.lang.String r0 = r8.sample_str     // Catch:{ Throwable -> 0x007f }
                java.lang.String r1 = "UTF-8"
                byte[] r4 = r0.getBytes(r1)     // Catch:{ Throwable -> 0x007f }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x007f }
                boolean r1 = r8.is_sample     // Catch:{ Throwable -> 0x007f }
                if (r1 == 0) goto L_0x0013
                java.lang.String r1 = com.p280ss.android.common.applog.AppLog.CDN_STATS_URL()     // Catch:{ Throwable -> 0x007f }
                goto L_0x0017
            L_0x0013:
                java.lang.String r1 = com.p280ss.android.common.applog.AppLog.CDN_ERROR_URL()     // Catch:{ Throwable -> 0x007f }
            L_0x0017:
                r0.<init>(r1)     // Catch:{ Throwable -> 0x007f }
                r1 = 1
                com.p280ss.android.common.applog.NetUtil.appendCommonParams(r0, r1)     // Catch:{ Throwable -> 0x007f }
                java.lang.String r3 = r0.toString()     // Catch:{ Throwable -> 0x007f }
                com.bytedance.common.utility.k r2 = com.bytedance.common.utility.C6317k.m19580a()     // Catch:{ Throwable -> 0x007f }
                r5 = 0
                java.lang.String r6 = "text; charset=utf-8"
                r7 = 0
                java.lang.String r0 = r2.mo15155a(r3, r4, r5, r6, r7)     // Catch:{ Throwable -> 0x007f }
                if (r0 == 0) goto L_0x007e
                int r2 = r0.length()     // Catch:{ Throwable -> 0x007f }
                if (r2 != 0) goto L_0x0037
                goto L_0x007e
            L_0x0037:
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Throwable -> 0x007f }
                r2.<init>(r0)     // Catch:{ Throwable -> 0x007f }
                boolean r0 = com.p280ss.android.common.applog.AppLog.isApiSuccess(r2)     // Catch:{ Throwable -> 0x007f }
                if (r0 != 0) goto L_0x0043
                return
            L_0x0043:
                java.lang.String r0 = "poke_dns"
                java.lang.String r0 = r2.optString(r0)     // Catch:{ Throwable -> 0x007f }
                if (r0 == 0) goto L_0x0054
                int r3 = r0.length()     // Catch:{ Throwable -> 0x007f }
                if (r3 <= 0) goto L_0x0054
                java.net.InetAddress.getByName(r0)     // Catch:{ Exception -> 0x0054 }
            L_0x0054:
                int r0 = r8.status     // Catch:{ Throwable -> 0x007f }
                r3 = 0
                if (r0 <= 0) goto L_0x005f
                int r0 = r8.status     // Catch:{ Throwable -> 0x007f }
                r4 = 100
                if (r0 < r4) goto L_0x0067
            L_0x005f:
                int r0 = r8.status     // Catch:{ Throwable -> 0x007f }
                r4 = 300(0x12c, float:4.2E-43)
                if (r0 <= r4) goto L_0x0066
                goto L_0x0067
            L_0x0066:
                r1 = 0
            L_0x0067:
                if (r1 == 0) goto L_0x007d
                java.lang.Throwable r0 = r8.f19225tr     // Catch:{ Throwable -> 0x007f }
                if (r0 == 0) goto L_0x007d
                java.lang.String r0 = "send_error_detail"
                boolean r0 = com.p280ss.android.common.applog.AppLog.optBoolean(r2, r0, r3)     // Catch:{ Throwable -> 0x007f }
                if (r0 == 0) goto L_0x007d
                java.lang.String r0 = r8.sample_str     // Catch:{ Exception -> 0x007d }
                java.lang.Throwable r1 = r8.f19225tr     // Catch:{ Exception -> 0x007d }
                sendErrorDetail(r0, r1)     // Catch:{ Exception -> 0x007d }
                return
            L_0x007d:
                return
            L_0x007e:
                return
            L_0x007f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.applog.AppLog.ImageStatsThread.run():void");
        }

        private static void sendErrorDetail(String str, Throwable th) throws Exception {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            C6497a.m20180a(th, printWriter);
            Throwable cause = th.getCause();
            if (cause != null) {
                C6497a.m20180a(cause, printWriter);
                Throwable cause2 = cause.getCause();
                if (cause2 != null) {
                    C6497a.m20180a(cause2, printWriter);
                }
            }
            String stringWriter2 = stringWriter.toString();
            printWriter.close();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error_info", str);
            jSONObject.put("error_detail", stringWriter2);
            byte[] bytes = jSONObject.toString().getBytes("UTF-8");
            C6317k.m19580a().mo15155a(AppLog.CDN_ERROR_DETAIL_URL(), bytes, true, "text; charset=utf-8", true);
        }

        public ImageStatsThread(int i, String str, boolean z, Throwable th) {
            super("ImageStatsThread");
            this.status = i;
            this.sample_str = str;
            this.is_sample = z;
            this.f19225tr = th;
        }
    }

    /* renamed from: com.ss.android.common.applog.AppLog$LogRequestTraceCallback */
    public interface LogRequestTraceCallback {
        void onEventDiscard(int i);

        void onEventExpired(List<Long> list);

        void onEventInsertResult(boolean z, long j);

        void onLogDataStateChange(String str, String str2, String str3, boolean z, String str4);

        void onLogRequestResult(boolean z, List<Long> list);
    }

    /* renamed from: com.ss.android.common.applog.AppLog$SampleRatioItem */
    static class SampleRatioItem {
        final String pattern;
        final double ratio;

        public SampleRatioItem(String str, double d) {
            this.pattern = str;
            this.ratio = d;
        }
    }

    /* renamed from: com.ss.android.common.applog.AppLog$_lancet */
    class _lancet {
        private _lancet() {
        }

        static String com_ss_android_ugc_aweme_lancet_AppLogLancet_getInstallId() {
            if (!C7109b.f19975c) {
                AwemeApplication a = AwemeApplication.m21341a();
                if (a != null) {
                    return C7285c.m22838a(a, C6778a.m20960a(), 0).getString("install_id", "");
                }
            }
            return AppLog.getInstallId$___twin___();
        }

        static String com_ss_android_ugc_aweme_lancet_AppLogLancet_getServerDeviceId() {
            if (!C7109b.f19975c) {
                AwemeApplication a = AwemeApplication.m21341a();
                if (a != null) {
                    return C7285c.m22838a(a, C6778a.m20960a(), 0).getString("device_id", "");
                }
            }
            return AppLog.getServerDeviceId$___twin___();
        }

        static void com_ss_android_ugc_aweme_lancet_AppLogLancet_onEvent(Context context, String str, String str2, String str3, long j, long j2, boolean z, JSONObject jSONObject) {
            if (!C6399b.m19946v()) {
                if (C7213d.m22500a().mo18720M() && "umeng".equals(str) && str2 != null && C7109b.f19973a.contains(str2)) {
                    return;
                }
                if (C7213d.m22500a().mo18721N() && "event_v3".equalsIgnoreCase(str) && str2 != null && C7109b.f19974b.contains(str2) && jSONObject.has("_staging_flag")) {
                    jSONObject.remove("_staging_flag");
                }
            }
            AppLog.onEvent$___twin___(context, str, str2, str3, j, j2, z, jSONObject);
        }

        static boolean com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailable(Context context) {
            try {
                return C6900g.m21454b().mo16943d();
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* renamed from: com.ss.android.common.applog.AppLog$ApiSample */
    static class ApiSample {
        public final int networktype;
        public final long time;
        public final long timestamp;
        public final String url;

        public ApiSample(String str, int i, long j, long j2) {
            this.url = str;
            this.networktype = i;
            this.time = j;
            this.timestamp = j2;
        }
    }

    public static void checkANRLog() {
    }

    private int ensureRange(int i, int i2, int i3, int i4) {
        return i < i3 ? i2 : i > i4 ? i4 : i;
    }

    public static String getAbSDKVersion() {
        return sAbSDKVersion;
    }

    public static boolean getDebugNetError() {
        return false;
    }

    public static JSONObject getHeaderCopy() {
        return sHeaderCopy;
    }

    public static String getInstallId() {
        return _lancet.com_ss_android_ugc_aweme_lancet_AppLogLancet_getInstallId();
    }

    public static String getRomInfo() {
        return sRomInfo;
    }

    public static String getServerDeviceId() {
        return _lancet.com_ss_android_ugc_aweme_lancet_AppLogLancet_getServerDeviceId();
    }

    public static String getSessionKey() {
        return sSessionKey;
    }

    public static void onEvent(Context context, String str, String str2, String str3, long j, long j2, boolean z, JSONObject jSONObject) {
        _lancet.com_ss_android_ugc_aweme_lancet_AppLogLancet_onEvent(context, str, str2, str3, j, j2, z, jSONObject);
    }

    public static void onNetConfigUpdate(JSONObject jSONObject, boolean z) {
    }

    public static void reportNetError(Throwable th, String str, String str2) {
    }

    public static void tryWaitDeviceInit() {
        C6789d.m21089i();
    }

    public JSONObject getTimeSync() {
        return this.mTimeSync;
    }

    static String ACTIVE_USER_URL() {
        return urlConfig.mAppActiveUrl;
    }

    static String APPLOG_CONFIG_URL() {
        return urlConfig.mApplogSettingsUrl;
    }

    static String APPLOG_CONFIG_URL_FALLBACK_HTTP() {
        return urlConfig.mApplogSettingsFallbackUrl;
    }

    static String APPLOG_TIMELY_URL() {
        return urlConfig.mApplogTimelyUrl;
    }

    public static void addAppCount() {
        sAppCount++;
    }

    public static int getAppId() {
        return C6781d.m20986d();
    }

    public static String getCustomVersion() {
        return C6781d.m20979b();
    }

    private String getUserAgent() {
        return C6781d.m20980b(this.mContext);
    }

    public static void onAppQuit() {
        sFetchActiveTime = 0;
    }

    public static void tryEnableANRMonitor() {
        AppLog appLog = sInstance;
        if (appLog != null) {
            appLog.doEnableANRMonitor();
        }
    }

    /* access modifiers changed from: 0000 */
    public void incImageFailureCount() {
        this.mImageFailureCount.incrementAndGet();
    }

    /* access modifiers changed from: 0000 */
    public void incImageSuccessCount() {
        this.mImageSuccessCount.incrementAndGet();
    }

    public boolean isNewUserMode() {
        return C6789d.m21085e(this.mContext);
    }

    static String APPLOG_URL() {
        if (sAppLogHttpsToHttp == 0) {
            return urlConfig.mApplogURL;
        }
        return urlConfig.mApplogFallbackUrl;
    }

    private long doGetLastActivteTime() {
        if (this.mActivityRecord != null) {
            return System.currentTimeMillis();
        }
        return this.mActivityTime;
    }

    static long genEventIndex() {
        if (sInstance != null) {
            return sInstance.mGlobalEventIndexMatrix.getAndIncrement();
        }
        return -1;
    }

    public static String genSession() {
        return UUID.randomUUID().toString();
    }

    public static String getAllowPushListJsonStr() {
        if (sInstance == null) {
            return "";
        }
        return sInstance.mAllowPushListJsonStr;
    }

    public static String getClientId() {
        if (sInstance != null) {
            return C6789d.m21086f();
        }
        return null;
    }

    static boolean getEventV3Switch() {
        ILogEncryptConfig iLogEncryptConfig = sLogEncryptCfg;
        if (iLogEncryptConfig != null) {
            return iLogEncryptConfig.getEventV3Switch();
        }
        return true;
    }

    public static int getHttpMonitorPort() {
        AppLog appLog = sInstance;
        if (appLog != null) {
            return appLog.mHttpMonitorPort;
        }
        return 0;
    }

    public static String getInstallId$___twin___() {
        if (sInstance != null) {
            return C6789d.m21070b();
        }
        return null;
    }

    public static long getLastActiveTime() {
        AppLog appLog = sInstance;
        if (appLog != null) {
            return appLog.doGetLastActivteTime();
        }
        return 0;
    }

    static boolean getLogEncryptSwitch() {
        ILogEncryptConfig iLogEncryptConfig = sLogEncryptCfg;
        if (iLogEncryptConfig != null) {
            return iLogEncryptConfig.getEncryptSwitch();
        }
        return true;
    }

    static boolean getLogRecoverySwitch() {
        ILogEncryptConfig iLogEncryptConfig = sLogEncryptCfg;
        if (iLogEncryptConfig != null) {
            return iLogEncryptConfig.getRecoverySwitch();
        }
        return true;
    }

    public static String getServerDeviceId$___twin___() {
        if (sInstance != null) {
            return C6789d.m21080d();
        }
        return null;
    }

    public static String getUserId() {
        return String.valueOf(sUserId.get());
    }

    private void loadGlobalEventIndex() {
        this.mGlobalEventIndexMatrix.set(0);
        this.mGlobalEventIndexMatrixV1.set(0);
    }

    public static void onImageFailure() {
        if (!sStopped) {
            AppLog appLog = sInstance;
            if (appLog != null) {
                appLog.incImageFailureCount();
            }
        }
    }

    public static void onImageSuccess() {
        if (!sStopped) {
            AppLog appLog = sInstance;
            if (appLog != null) {
                appLog.incImageSuccessCount();
            }
        }
    }

    static String CDN_ERROR_DETAIL_URL() {
        StringBuilder sb = new StringBuilder("https://");
        sb.append(sHostI);
        sb.append("/cdn_error_detail/");
        return sb.toString();
    }

    static String CDN_ERROR_URL() {
        StringBuilder sb = new StringBuilder("https://");
        sb.append(sHostI);
        sb.append("/cdn_error/");
        return sb.toString();
    }

    static String CDN_STATS_URL() {
        StringBuilder sb = new StringBuilder("https://");
        sb.append(sHostI);
        sb.append("/cdn/");
        return sb.toString();
    }

    static String CRASH_URL() {
        StringBuilder sb = new StringBuilder("https://");
        sb.append(sHostLog);
        sb.append("/service/2/app_log_exception/");
        return sb.toString();
    }

    static String MON_URL() {
        StringBuilder sb = new StringBuilder("https://");
        sb.append(sHostMon);
        sb.append("/monitor/collect/");
        return sb.toString();
    }

    public static String getCurrentSessionId() {
        if (sInstance == null || sInstance.mSession == null) {
            return null;
        }
        return sInstance.mSession.value;
    }

    static boolean isInForeground() {
        AppLog appLog = sInstance;
        if (appLog == null || Looper.myLooper() != Looper.getMainLooper() || appLog.mActivityRecord == null) {
            return false;
        }
        return true;
    }

    private void notifyConfigUpdate() {
        if (sConfigUpdateListener != null) {
            ConfigUpdateListener configUpdateListener = (ConfigUpdateListener) sConfigUpdateListener.get();
            if (configUpdateListener != null) {
                try {
                    configUpdateListener.onConfigUpdate();
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void onQuit() {
        /*
            java.lang.Object r0 = sLock
            monitor-enter(r0)
            boolean r1 = sStopped     // Catch:{ all -> 0x0017 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            return
        L_0x0009:
            r1 = 1
            sStopped = r1     // Catch:{ all -> 0x0017 }
            com.ss.android.common.applog.AppLog r1 = sInstance     // Catch:{ all -> 0x0017 }
            if (r1 == 0) goto L_0x0015
            com.ss.android.common.applog.AppLog r1 = sInstance     // Catch:{ all -> 0x0017 }
            r1.stop()     // Catch:{ all -> 0x0017 }
        L_0x0015:
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            return
        L_0x0017:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.applog.AppLog.onQuit():void");
    }

    static void resetEventIndex() {
        if (sInstance != null) {
            sInstance.mGlobalEventIndexMatrix.set(0);
            sInstance.mGlobalEventIndexMatrixV1.set(0);
        }
    }

    public synchronized void ensureHeaderCopy() {
        try {
            sHeaderCopy = new JSONObject(this.mHeader, HEADER_KEYS);
        } catch (JSONException unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    public void sendHeartbeat() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.mHeartbeatTime > 60000) {
            this.mHeartbeatTime = currentTimeMillis;
            synchronized (this.mLogQueue) {
                this.mLogQueue.notify();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean trySetupLogReaper() {
        synchronized (this.mHeader) {
            if (this.mHasSetup) {
                boolean z = this.mSetupOk;
                return z;
            }
            this.mSetupOk = setupLogReaper();
            this.mHasSetup = true;
            boolean z2 = this.mSetupOk;
            return z2;
        }
    }

    private boolean isBssidAllowUpload() {
        if (this.mFingerprintSet == null || !this.mFingerprintSet.contains(Integer.valueOf(6)) || this.mWifiBssidInfo == null || !this.mWifiBssidInfo.needUploadBssid()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void checkSessionEnd() {
        if (this.mSession != null && !this.mSession.non_page) {
            long currentTimeMillis = System.currentTimeMillis();
            if (!this.mSession.active && currentTimeMillis - this.mSession.pausetime >= this.mSessionInterval) {
                LogSession logSession = this.mSession;
                onSessionEnd();
                this.mSession = null;
                LogQueueSwitchSession logQueueSwitchSession = new LogQueueSwitchSession();
                logQueueSwitchSession.old = logSession;
                enqueue((LogQueueItem) logQueueSwitchSession);
                if (this.mTrafficGuard != null) {
                    this.mTrafficGuard.start();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void doEnableANRMonitor() {
        if (this.mANRMonitor == null && this.mLogReaper != null) {
            this.mANRMonitor = ANRMonitor.getInstance(this.mLogReaper);
            if (Looper.myLooper() == Looper.getMainLooper() && this.mActivityRecord != null) {
                this.mANRMonitor.onActivityResume();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void stop() {
        this.mNetWorkMonitor.mo15137a();
        synchronized (this.mQueue) {
            this.mQueue.clear();
            this.mQueue.notify();
        }
        this.mStopFlag.set(true);
        synchronized (this.mLogQueue) {
            this.mLogQueue.clear();
            this.mLogQueue.notifyAll();
        }
        DBHelper.closeDB();
    }

    /* access modifiers changed from: 0000 */
    public void loadSSIDs() {
        try {
            if (sAppContext != null) {
                this.mVersionCode = sAppContext.mo16344k();
            }
            long currentTimeMillis = System.currentTimeMillis();
            SharedPreferences a = C7285c.m22838a(this.mContext, C6778a.m20960a(), 0);
            this.mLastConfigVersion = a.getInt("app_log_last_config_version", 0);
            if (this.mLastConfigVersion == this.mVersionCode) {
                long j = a.getLong("app_log_last_config_time", 0);
                if (j <= currentTimeMillis) {
                    currentTimeMillis = j;
                }
                this.mUpdateConfigTime = currentTimeMillis;
            }
            try {
                String string = a.getString("allow_push_list", null);
                this.mAllowPushListJsonStr = string;
                if (string != null) {
                    synchronized (sLock) {
                        parseIntSet(this.mAllowPushSet, new JSONArray(string));
                    }
                }
            } catch (Exception unused) {
            }
            this.mAllowOldImageSample = a.getBoolean("allow_old_image_sample", false);
            try {
                String string2 = a.getString("real_time_events", null);
                if (!C6319n.m19593a(string2)) {
                    JSONArray jSONArray = new JSONArray(string2);
                    if (jSONArray.length() > 0) {
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            String string3 = jSONArray.getString(i);
                            if (!C6319n.m19593a(string3)) {
                                this.mEventTimely.put(string3, "timely");
                            }
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
        } catch (Exception unused3) {
        }
    }

    /* access modifiers changed from: 0000 */
    public void onSessionEnd() {
        if (this.mSession != null) {
            LogSession logSession = this.mSession;
            DBHelper instance = DBHelper.getInstance(this.mContext);
            int i = 0;
            int andSet = this.mImageSuccessCount.getAndSet(0);
            int andSet2 = this.mImageFailureCount.getAndSet(0);
            if (logSession != null && logSession.f19228id > 0) {
                if (andSet > 0 || andSet2 > 0) {
                    LogEvent logEvent = new LogEvent();
                    logEvent.category = "image";
                    logEvent.tag = "stats";
                    logEvent.value = (long) andSet;
                    logEvent.ext_value = (long) andSet2;
                    logEvent.timestamp = logSession.pausetime;
                    logEvent.session_id = logSession.f19228id;
                    instance.insertEvent(logEvent);
                }
                if (!this.mAllowOldImageSample) {
                    this.mSamples.clear();
                }
                Iterator it = this.mSamples.iterator();
                while (it.hasNext()) {
                    ImageSample imageSample = (ImageSample) it.next();
                    LogEvent logEvent2 = new LogEvent();
                    logEvent2.category = "image";
                    logEvent2.tag = "sample";
                    logEvent2.label = imageSample.url;
                    logEvent2.value = (long) imageSample.networktype;
                    logEvent2.ext_value = imageSample.time;
                    logEvent2.timestamp = imageSample.timestamp;
                    logEvent2.session_id = logSession.f19228id;
                    instance.insertEvent(logEvent2);
                    i++;
                    if (i >= 5) {
                        break;
                    }
                }
            }
            this.mSamples.clear();
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0091 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean setupLogReaper() {
        /*
            r11 = this;
            boolean r0 = r11.mForbidReportPhoneDetailInfo     // Catch:{ Exception -> 0x0018 }
            com.p280ss.android.deviceregister.C6789d.m21079c(r0)     // Catch:{ Exception -> 0x0018 }
            com.p280ss.android.deviceregister.C6789d.m21063a(r11)     // Catch:{ Exception -> 0x0018 }
            boolean r0 = sAnonymous     // Catch:{ Exception -> 0x0018 }
            com.p280ss.android.deviceregister.C6789d.m21082d(r0)     // Catch:{ Exception -> 0x0018 }
            boolean r0 = sInitWithActivity     // Catch:{ Exception -> 0x0018 }
            com.p280ss.android.deviceregister.C6789d.m21067a(r0)     // Catch:{ Exception -> 0x0018 }
            android.content.Context r0 = r11.mContext     // Catch:{ Exception -> 0x0018 }
            com.p280ss.android.deviceregister.C6789d.m21056a(r0)     // Catch:{ Exception -> 0x0018 }
            goto L_0x001f
        L_0x0018:
            r0 = move-exception
            boolean r1 = com.bytedance.common.utility.C6312h.m19578b()     // Catch:{ Exception -> 0x00c6 }
            if (r1 != 0) goto L_0x00c5
        L_0x001f:
            org.json.JSONObject r0 = r11.mHeader     // Catch:{ Exception -> 0x00c6 }
            android.content.Context r1 = r11.mContext     // Catch:{ Exception -> 0x00c6 }
            boolean r0 = r11.initHeader(r0, r1)     // Catch:{ Exception -> 0x00c6 }
            r11.mInitOk = r0     // Catch:{ Exception -> 0x00c6 }
            android.content.Context r0 = r11.mContext     // Catch:{ Exception -> 0x00c6 }
            com.ss.android.common.applog.DBHelper r0 = com.p280ss.android.common.applog.DBHelper.getInstance(r0)     // Catch:{ Exception -> 0x00c6 }
            r1 = 0
            com.ss.android.common.applog.LogSession r0 = r0.getSession(r1)     // Catch:{ Exception -> 0x00c6 }
            r11.mSession = r0     // Catch:{ Exception -> 0x00c6 }
            com.ss.android.common.applog.LogSession r0 = r11.mSession     // Catch:{ Exception -> 0x00c6 }
            r11.loadStats(r0)     // Catch:{ Exception -> 0x00c6 }
            r11.notifyConfigUpdate()     // Catch:{ Exception -> 0x00c6 }
            com.ss.android.common.applog.LogSession r0 = r11.mSession     // Catch:{ Exception -> 0x00c6 }
            if (r0 == 0) goto L_0x0051
            com.ss.android.common.applog.LogQueueCleanSession r0 = new com.ss.android.common.applog.LogQueueCleanSession     // Catch:{ Exception -> 0x00c6 }
            r0.<init>()     // Catch:{ Exception -> 0x00c6 }
            com.ss.android.common.applog.LogSession r1 = r11.mSession     // Catch:{ Exception -> 0x00c6 }
            long r1 = r1.f19228id     // Catch:{ Exception -> 0x00c6 }
            r0.max_session = r1     // Catch:{ Exception -> 0x00c6 }
            r11.enqueue(r0)     // Catch:{ Exception -> 0x00c6 }
        L_0x0051:
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ Throwable -> 0x0091 }
            r0.<init>()     // Catch:{ Throwable -> 0x0091 }
            android.os.Bundle r1 = sCustomBundle     // Catch:{ Throwable -> 0x0091 }
            monitor-enter(r1)     // Catch:{ Throwable -> 0x0091 }
            android.os.Bundle r2 = sCustomBundle     // Catch:{ all -> 0x008e }
            r0.putAll(r2)     // Catch:{ all -> 0x008e }
            monitor-exit(r1)     // Catch:{ all -> 0x008e }
            int r1 = r0.size()     // Catch:{ Throwable -> 0x0091 }
            if (r1 <= 0) goto L_0x0091
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0091 }
            r1.<init>()     // Catch:{ Throwable -> 0x0091 }
            java.util.Set r2 = r0.keySet()     // Catch:{ Throwable -> 0x0091 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Throwable -> 0x0091 }
        L_0x0072:
            boolean r3 = r2.hasNext()     // Catch:{ Throwable -> 0x0091 }
            if (r3 == 0) goto L_0x0086
            java.lang.Object r3 = r2.next()     // Catch:{ Throwable -> 0x0091 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Throwable -> 0x0091 }
            java.lang.Object r4 = r0.get(r3)     // Catch:{ Throwable -> 0x0091 }
            r1.put(r3, r4)     // Catch:{ Throwable -> 0x0091 }
            goto L_0x0072
        L_0x0086:
            org.json.JSONObject r0 = r11.mHeader     // Catch:{ Throwable -> 0x0091 }
            java.lang.String r2 = "custom"
            r0.put(r2, r1)     // Catch:{ Throwable -> 0x0091 }
            goto L_0x0091
        L_0x008e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x008e }
            throw r0     // Catch:{ Throwable -> 0x0091 }
        L_0x0091:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x00c6 }
            org.json.JSONObject r0 = r11.mHeader     // Catch:{ Exception -> 0x00c6 }
            java.lang.String[] r1 = HEADER_KEYS     // Catch:{ Exception -> 0x00c6 }
            r4.<init>(r0, r1)     // Catch:{ Exception -> 0x00c6 }
            com.ss.android.common.applog.LogReaper r0 = new com.ss.android.common.applog.LogReaper     // Catch:{ Exception -> 0x00c6 }
            android.content.Context r3 = r11.mContext     // Catch:{ Exception -> 0x00c6 }
            java.util.LinkedList<com.ss.android.common.applog.LogQueueItem> r5 = r11.mLogQueue     // Catch:{ Exception -> 0x00c6 }
            java.util.concurrent.atomic.AtomicBoolean r6 = r11.mStopFlag     // Catch:{ Exception -> 0x00c6 }
            java.util.List<com.ss.android.common.applog.AppLog$ILogSessionHook> r7 = sSessionHookList     // Catch:{ Exception -> 0x00c6 }
            com.ss.android.common.applog.LogSession r8 = r11.mSession     // Catch:{ Exception -> 0x00c6 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r9 = r11.mBlackV1     // Catch:{ Exception -> 0x00c6 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r10 = r11.mBlackV3     // Catch:{ Exception -> 0x00c6 }
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x00c6 }
            r11.mLogReaper = r0     // Catch:{ Exception -> 0x00c6 }
            com.ss.android.common.applog.LogReaper r0 = r11.mLogReaper     // Catch:{ Exception -> 0x00c6 }
            long r1 = r11.mBatchEventInterval     // Catch:{ Exception -> 0x00c6 }
            r0.setBatchEventInterval(r1)     // Catch:{ Exception -> 0x00c6 }
            com.ss.android.common.applog.LogReaper r0 = r11.mLogReaper     // Catch:{ Exception -> 0x00c6 }
            int r1 = r11.mSendLaunchTimely     // Catch:{ Exception -> 0x00c6 }
            r0.setSendLaunchTimely(r1)     // Catch:{ Exception -> 0x00c6 }
            com.ss.android.common.applog.LogReaper r0 = r11.mLogReaper     // Catch:{ Exception -> 0x00c6 }
            r0.start()     // Catch:{ Exception -> 0x00c6 }
            r0 = 1
            return r0
        L_0x00c5:
            throw r0     // Catch:{ Exception -> 0x00c6 }
        L_0x00c6:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.applog.AppLog.setupLogReaper():boolean");
    }

    public static void registerCrashHandler(Context context) {
        LogReaper.registerCrashHandler(context);
    }

    public static void registerGlobalEventCallback(GlobalEventCallback globalEventCallback) {
        sGlobalEventCallback = globalEventCallback;
    }

    public static void registerLogRequestCallback(LogRequestTraceCallback logRequestTraceCallback) {
        sTraceCallback = logRequestTraceCallback;
    }

    public static void setAbSDKVersion(String str) {
        sAbSDKVersion = str;
    }

    public static void setAliYunHanlder(IAliYunHandler iAliYunHandler) {
        NetUtil.setAliYunHanlder(iAliYunHandler);
    }

    public static void setAppId(int i) {
        C6789d.m21055a(i);
    }

    public static void setCustomVersion(String str) {
        C6789d.m21078c(str);
    }

    private static void setDeviceRegisterURL(String[] strArr) {
        C6789d.m21068a(strArr);
    }

    public static void setFakePackage(String str) {
        C6781d.m20972a(str);
    }

    public static void setIsNotRequestSender(boolean z) {
        sIsNotRequestSender = z;
    }

    public static void setMyPushIncludeValues(boolean z) {
        sMyPushInclude = z;
    }

    public static void setNeedAntiCheating(boolean z) {
        C6789d.m21075b(z);
    }

    public static void setReleaseBuild(String str) {
        C6781d.m20983b(str);
    }

    public static void setReportCrash(boolean z) {
        sReportCrash = z;
    }

    public static void setSessionHook(ILogSessionHook iLogSessionHook) {
        addSessionHook(iLogSessionHook);
    }

    public static void setSessionKey(String str) {
        sSessionKey = str;
    }

    public static String getSigHash(Context context) {
        return C6789d.m21081d(context);
    }

    public static boolean isBadDeviceId(String str) {
        return NetUtil.isBadId(str);
    }

    private void saveAppTrack(String str) {
        C6789d.m21058a(this.mContext, str);
    }

    public static void setAppContext(C6730a aVar) {
        sAppContext = aVar;
        C6789d.m21061a(aVar);
    }

    public static void setCustomInfo(ICustomInfo iCustomInfo) {
        sCustomInfo = iCustomInfo;
        C6789d.m21062a((C6779b) iCustomInfo);
    }

    public static void tryEnableTrafficGuard(int i) {
        AppLog appLog = sInstance;
        if (appLog != null) {
            appLog.doEnableTrafficGuard(i);
        }
    }

    public void setNewUserMode(boolean z) {
        C6789d.m21059a(this.mContext, z);
    }

    /* access modifiers changed from: 0000 */
    public void updateUserAgentString(String str) {
        C6781d.m20968a(this.mContext, str);
    }

    public static void activeUser(Context context) {
        sHasManualInvokeActiveUser = true;
        activeUserInvokeInternal(context.getApplicationContext());
        C6789d.m21077c(context);
    }

    static String formatDate(long j) {
        return mDateFormat.format(new Date(j));
    }

    public static boolean isApiSuccess(JSONObject jSONObject) {
        return "success".equals(jSONObject.optString("message"));
    }

    public static void removeSessionHook(ILogSessionHook iLogSessionHook) {
        if (iLogSessionHook != null) {
            synchronized (sSessionHookList) {
                sSessionHookList.remove(iLogSessionHook);
            }
        }
    }

    public static void sendANRLog(String str) {
        if (!C6319n.m19593a(str)) {
            try {
                AppLog appLog = sInstance;
                if (appLog != null) {
                    appLog.insertAnrToDB(str);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void setAnonymous(boolean z) {
        if (!sInitGuard) {
            sAnonymous = z;
            return;
        }
        throw new IllegalStateException("please call before init");
    }

    public static void setChannel(String str) {
        if (!sInitGuard) {
            C6789d.m21065a(str);
            return;
        }
        throw new IllegalStateException("setChannel 必须在 init 之前调用");
    }

    public static void setConfigUpdateListener(ConfigUpdateListener configUpdateListener) {
        if (configUpdateListener == null) {
            sConfigUpdateListener = null;
        } else {
            sConfigUpdateListener = new WeakReference<>(configUpdateListener);
        }
    }

    public static void setDBNamme(String str) {
        if (!C6319n.m19593a(str)) {
            DBHelper.setDBName(str);
        }
    }

    public static void setEncryptCountSPName(String str) {
        if (!C6319n.m19593a(str)) {
            NetUtil.setEncryptSPName(str);
        }
    }

    public static void setHostI(String str) {
        if (!TextUtils.isEmpty(str)) {
            sHostI = str;
        }
    }

    public static void setHostLog(String str) {
        if (!TextUtils.isEmpty(str)) {
            sHostLog = str;
        }
    }

    public static void setHostMon(String str) {
        if (!TextUtils.isEmpty(str)) {
            sHostMon = str;
        }
    }

    public static void setLogEncryptConfig(ILogEncryptConfig iLogEncryptConfig) {
        sLogEncryptCfg = iLogEncryptConfig;
        C6782a.m20993a((C6783a) new C6783a() {
            public final boolean getEncryptSwitch() {
                return AppLog.getLogEncryptSwitch();
            }
        });
    }

    public static void setSPName(String str) {
        if (!C6319n.m19593a(str)) {
            C6778a.m20961a(str);
        }
    }

    public static void setUseGoogleAdId(boolean z) {
        if (!sInitGuard) {
            C6789d.m21084e(z);
            return;
        }
        throw new IllegalStateException("setChannel 必须在 init 之前调用");
    }

    public static void setUserId(long j) {
        sUserId.set(j);
        AppLog appLog = sInstance;
        if (appLog != null) {
            appLog.notifyConfigUpdate();
        }
    }

    static void tryReportEventDiscard(final int i) {
        runOnUIThread(new Runnable() {
            public final void run() {
                LogRequestTraceCallback logRequestTraceCallback = AppLog.sTraceCallback;
                if (logRequestTraceCallback != null) {
                    logRequestTraceCallback.onEventDiscard(i);
                }
            }
        });
    }

    static void tryReportLogExpired(final List<Long> list) {
        if (!C6307b.m19566a((Collection<T>) list)) {
            runOnUIThread(new Runnable() {
                public final void run() {
                    LogRequestTraceCallback logRequestTraceCallback = AppLog.sTraceCallback;
                    if (logRequestTraceCallback != null) {
                        logRequestTraceCallback.onEventExpired(list);
                    }
                }
            });
        }
    }

    static void tryReportTerminateLost(final List<String> list) {
        if (!C6307b.m19566a((Collection<T>) list)) {
            runOnUIThread(new Runnable() {
                public final void run() {
                    LogRequestTraceCallback logRequestTraceCallback = AppLog.sTraceCallback;
                    if (logRequestTraceCallback != null) {
                        for (String onLogDataStateChange : list) {
                            LogRequestTraceCallback logRequestTraceCallback2 = logRequestTraceCallback;
                            logRequestTraceCallback2.onLogDataStateChange("terminate", onLogDataStateChange, null, false, "");
                        }
                    }
                }
            });
        }
    }

    public static void addSessionHook(ILogSessionHook iLogSessionHook) {
        if (iLogSessionHook != null) {
            synchronized (sSessionHookList) {
                if (!sSessionHookList.contains(iLogSessionHook)) {
                    sSessionHookList.add(iLogSessionHook);
                }
            }
        }
    }

    private static void appendParamsToEvent(JSONObject jSONObject) {
        if (jSONObject != null && !jSONObject.has("ab_sdk_version") && !TextUtils.isEmpty(sAbSDKVersion)) {
            try {
                jSONObject.put("ab_sdk_version", sAbSDKVersion);
            } catch (JSONException unused) {
            }
        }
    }

    public static int getAllowPushService(int i) {
        AppLog appLog = sInstance;
        synchronized (sLock) {
            if (appLog == null) {
                return 0;
            }
            try {
                if (appLog.mAllowPushSet.contains(Integer.valueOf(i))) {
                    return 1;
                }
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void handleConfigUpdate(JSONObject jSONObject) {
        if (sConfigUpdateListener != null) {
            ConfigUpdateListener configUpdateListener = (ConfigUpdateListener) sConfigUpdateListener.get();
            if (configUpdateListener instanceof ConfigUpdateListenerEnhanced) {
                try {
                    ((ConfigUpdateListenerEnhanced) configUpdateListener).handleConfigUpdate(jSONObject);
                } catch (Exception unused) {
                }
            }
        }
    }

    private void notifyOnEvent(LogEvent logEvent) {
        if (sGlobalEventCallback != null) {
            sGlobalEventCallback.onEvent(logEvent.category, logEvent.tag, logEvent.label, logEvent.value, logEvent.ext_value, logEvent.instant_only, logEvent.ext_json);
        }
    }

    private void notifyRemoteConfigUpdate(boolean z) {
        if (sConfigUpdateListener != null) {
            ConfigUpdateListener configUpdateListener = (ConfigUpdateListener) sConfigUpdateListener.get();
            if (configUpdateListener != null) {
                try {
                    configUpdateListener.onRemoteConfigUpdate(z);
                } catch (Exception unused) {
                }
            }
        }
    }

    public static void onPause(Context context) {
        if (context instanceof Activity) {
            onPause(context, context.getClass().getName(), context.hashCode());
        }
    }

    public static void onResume(Context context) {
        if (context instanceof Activity) {
            onResume(context, context.getClass().getName(), context.hashCode());
        }
        if (!sHasManualInvokeActiveUser) {
            activeUserInvokeInternal(context.getApplicationContext());
        }
    }

    public static String packJsonObject(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return null;
        }
        return packString(jSONObject.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0018, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void registerCrashCallBackHandler(com.p280ss.android.common.applog.AppLog.ICrashCallback r2) {
        /*
            java.util.List<com.ss.android.common.applog.AppLog$ICrashCallback> r0 = mCallbacks
            monitor-enter(r0)
            if (r2 == 0) goto L_0x0017
            java.util.List<com.ss.android.common.applog.AppLog$ICrashCallback> r1 = mCallbacks     // Catch:{ all -> 0x0015 }
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x0015 }
            if (r1 == 0) goto L_0x000e
            goto L_0x0017
        L_0x000e:
            java.util.List<com.ss.android.common.applog.AppLog$ICrashCallback> r1 = mCallbacks     // Catch:{ all -> 0x0015 }
            r1.add(r2)     // Catch:{ all -> 0x0015 }
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            return
        L_0x0015:
            r2 = move-exception
            goto L_0x0019
        L_0x0017:
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            return
        L_0x0019:
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.applog.AppLog.registerCrashCallBackHandler(com.ss.android.common.applog.AppLog$ICrashCallback):void");
    }

    private static void runOnUIThread(Runnable runnable) {
        if (runnable != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.run();
            } else {
                sHandler.post(runnable);
            }
        }
    }

    static void saveDnsReportTime(long j) {
        AppLog appLog = sInstance;
        if (j > 0 && appLog != null) {
            ActionQueueItem actionQueueItem = new ActionQueueItem(ActionQueueType.SAVE_DNS_REPORT);
            actionQueueItem.arg = j;
            appLog.enqueue(actionQueueItem);
        }
    }

    public static void setConfigUpdateListener(ConfigUpdateListenerEnhanced configUpdateListenerEnhanced) {
        if (configUpdateListenerEnhanced == null) {
            sConfigUpdateListener = null;
        } else {
            sConfigUpdateListener = new WeakReference<>(configUpdateListenerEnhanced);
        }
    }

    public static void setGoogleAId(String str) {
        if (!C6319n.m19593a(str)) {
            C6725a.m20836a(str);
            AppLog appLog = sInstance;
            if (appLog != null) {
                ActionQueueItem actionQueueItem = new ActionQueueItem(ActionQueueType.UPDATE_GOOGLE_AID);
                actionQueueItem.obj = str;
                appLog.enqueue(actionQueueItem);
            }
        }
    }

    public static void setHttpMonitorPort(int i) {
        AppLog appLog = sInstance;
        if (appLog != null) {
            synchronized (sLock) {
                if (appLog.mHttpMonitorPort != i) {
                    appLog.mHttpMonitorPort = i;
                    appLog.notifyConfigUpdate();
                }
            }
        }
    }

    static void tryPutEventIndex(JSONObject jSONObject) {
        if (sInstance != null) {
            try {
                jSONObject.put("tea_event_index", sInstance.mGlobalEventIndexMatrix.getAndIncrement());
            } catch (JSONException unused) {
            }
        }
    }

    public static void unRegisterCrashCallBackHandler(ICrashCallback iCrashCallback) {
        synchronized (mCallbacks) {
            if (mCallbacks.contains(iCrashCallback)) {
                mCallbacks.remove(iCrashCallback);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void addCustomerHeader(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            bundle2.putAll(bundle);
            ActionQueueItem actionQueueItem = new ActionQueueItem(ActionQueueType.CUSTOMER_HEADER_UPDATE);
            actionQueueItem.obj = bundle2;
            enqueue(actionQueueItem);
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    public void doEnableTrafficGuard(int i) {
        this.mEnableTrafficGuard = i;
        if (this.mTrafficGuard == null && i > 0) {
            this.mTrafficGuard = new TrafficGuard(this.mContext, this);
        }
    }

    /* access modifiers changed from: 0000 */
    public void doSaveDnsReportTime(long j) {
        Editor edit = C7285c.m22838a(this.mContext, C6778a.m20960a(), 0).edit();
        edit.putLong("dns_report_time", j);
        edit.commit();
    }

    /* access modifiers changed from: 0000 */
    public void handleImageSample(ImageSample imageSample) {
        if (this.mSamples.size() >= 5) {
            this.mSamples.removeFirst();
        }
        this.mSamples.add(imageSample);
    }

    /* access modifiers changed from: 0000 */
    public HashSet<Integer> parseIntSet(JSONArray jSONArray) throws JSONException {
        HashSet<Integer> hashSet = new HashSet<>();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            int i2 = jSONArray.getInt(i);
            if (i2 > 0) {
                hashSet.add(Integer.valueOf(i2));
            }
        }
        return hashSet;
    }

    static String escape4ImageStats(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        if (str.indexOf(92) >= 0) {
            str = str.replace("\\", "\\\\");
        }
        if (str.indexOf(124) >= 0) {
            str = str.replace("|", "\\|");
        }
        if (str.indexOf(94) >= 0) {
            str = str.replace("^", "\\^");
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002b, code lost:
        return sInstance;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p280ss.android.common.applog.AppLog getInstance(android.content.Context r2) {
        /*
            boolean r0 = sInitGuard
            if (r0 != 0) goto L_0x0013
            boolean r0 = com.bytedance.common.utility.C6312h.m19578b()
            if (r0 != 0) goto L_0x000b
            goto L_0x0013
        L_0x000b:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r0 = "getInstance不能在init之前调用"
            r2.<init>(r0)
            throw r2
        L_0x0013:
            java.lang.Object r0 = sLock
            monitor-enter(r0)
            boolean r1 = sStopped     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x001d
            r2 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return r2
        L_0x001d:
            com.ss.android.common.applog.AppLog r1 = sInstance     // Catch:{ all -> 0x002c }
            if (r1 != 0) goto L_0x0028
            com.ss.android.common.applog.AppLog r1 = new com.ss.android.common.applog.AppLog     // Catch:{ all -> 0x002c }
            r1.<init>(r2)     // Catch:{ all -> 0x002c }
            sInstance = r1     // Catch:{ all -> 0x002c }
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            com.ss.android.common.applog.AppLog r2 = sInstance
            return r2
        L_0x002c:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.applog.AppLog.getInstance(android.content.Context):com.ss.android.common.applog.AppLog");
    }

    public static void getSSIDs(Map<String, String> map) {
        AppLog appLog;
        synchronized (sLock) {
            if (!sStopped) {
                appLog = sInstance;
            } else {
                appLog = null;
            }
        }
        if (appLog != null) {
            C6789d.m21066a((Map) map);
            String valueOf = String.valueOf(sUserId.get());
            if (valueOf != null) {
                map.put("user_id", valueOf);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getVersion(android.content.Context r3) {
        /*
            com.ss.android.common.applog.AppLog r0 = sInstance
            if (r0 == 0) goto L_0x0009
            java.lang.String r0 = com.p280ss.android.deviceregister.p289a.C6781d.m20991g()
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            boolean r1 = com.bytedance.common.utility.C6319n.m19593a(r0)
            if (r1 == 0) goto L_0x0022
            if (r3 == 0) goto L_0x0022
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch:{ Exception -> 0x0022 }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ Exception -> 0x0022 }
            r2 = 0
            android.content.pm.PackageInfo r3 = r1.getPackageInfo(r3, r2)     // Catch:{ Exception -> 0x0022 }
            java.lang.String r3 = r3.versionName     // Catch:{ Exception -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r3 = r0
        L_0x0023:
            if (r3 != 0) goto L_0x0027
            java.lang.String r3 = ""
        L_0x0027:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.applog.AppLog.getVersion(android.content.Context):java.lang.String");
    }

    private void handleCallback(JSONObject jSONObject) {
        try {
            ArrayList<ICrashCallback> arrayList = new ArrayList<>();
            synchronized (mCallbacks) {
                arrayList.addAll(mCallbacks);
            }
            for (ICrashCallback iCrashCallback : arrayList) {
                if (iCrashCallback != null) {
                    iCrashCallback.callback(jSONObject.optString("data"));
                }
            }
        } catch (Throwable unused) {
        }
    }

    private void initDataFromSp(Context context) {
        loadSSIDs();
        CustomChannelHandler.inst(context).loadInfoFromSp();
        loadGlobalEventIndex();
        boolean z = false;
        if (C7285c.m22838a(this.mContext, C6778a.m20960a(), 0).getInt("forbid_report_phone_detail_info", 0) > 0) {
            z = true;
        }
        this.mForbidReportPhoneDetailInfo = z;
    }

    public static boolean isValidUDID(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length < 13 || length > 160) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'f') && ((charAt < 'A' || charAt > 'F') && charAt != '-'))) {
                return false;
            }
        }
        return true;
    }

    private void notifySessionStart(long j) {
        if (sSessionHookList != null) {
            synchronized (sSessionHookList) {
                for (ILogSessionHook onLogSessionStart : sSessionHookList) {
                    onLogSessionStart.onLogSessionStart(j);
                }
            }
        }
    }

    public static void onActivityCreate(Context context) {
        if (context instanceof Activity) {
            sLastCreateActivityName = context.getClass().getName();
            StringBuilder sb = new StringBuilder();
            sb.append(sLastCreateActivityName);
            sb.append("(");
            sb.append(String.valueOf(System.currentTimeMillis()));
            sb.append(")");
            sLastCreateActivityNameAndTime = sb.toString();
        }
    }

    public static String packString(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                byte[] bytes = str.getBytes("UTF-8");
                int length = bytes.length;
                for (int i = 0; i < length; i++) {
                    bytes[i] = (byte) (bytes[i] ^ -99);
                }
                return Base64.encodeToString(bytes, 10);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:9|10|(1:12)|13|14|15|16) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x001f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void setAppTrack(org.json.JSONObject r4) {
        /*
            com.ss.android.common.applog.AppLog r0 = sInstance
            if (r0 == 0) goto L_0x0023
            java.lang.Object r1 = sLock
            monitor-enter(r1)
            if (r4 != 0) goto L_0x000d
            monitor-exit(r1)     // Catch:{ all -> 0x000b }
            return
        L_0x000b:
            r4 = move-exception
            goto L_0x0021
        L_0x000d:
            org.json.JSONObject r2 = r0.mHeader     // Catch:{ Throwable -> 0x001f }
            if (r2 == 0) goto L_0x0018
            org.json.JSONObject r2 = r0.mHeader     // Catch:{ Throwable -> 0x001f }
            java.lang.String r3 = "app_track"
            r2.put(r3, r4)     // Catch:{ Throwable -> 0x001f }
        L_0x0018:
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x001f }
            r0.saveAppTrack(r4)     // Catch:{ Throwable -> 0x001f }
        L_0x001f:
            monitor-exit(r1)     // Catch:{ all -> 0x000b }
            return
        L_0x0021:
            monitor-exit(r1)     // Catch:{ all -> 0x000b }
            throw r4
        L_0x0023:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.applog.AppLog.setAppTrack(org.json.JSONObject):void");
    }

    public static void setCustomerHeader(Bundle bundle) {
        if (bundle != null) {
            try {
                if (bundle.size() > 0) {
                    AppLog appLog = sInstance;
                    if (appLog != null) {
                        appLog.addCustomerHeader(bundle);
                    } else {
                        synchronized (sCustomBundle) {
                            sCustomBundle.putAll(bundle);
                        }
                    }
                    C6789d.m21060a(bundle);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void setDefaultUserAgent(String str) {
        AppLog appLog = sInstance;
        if (appLog != null) {
            String userAgent = sInstance.getUserAgent();
            if (!C6319n.m19593a(str) && !str.equals(userAgent)) {
                ActionQueueItem actionQueueItem = new ActionQueueItem(ActionQueueType.UA_UPDATE);
                actionQueueItem.obj = str;
                appLog.enqueue(actionQueueItem);
            }
        }
    }

    private void updateAppLanguageAndRegion(JSONObject jSONObject) {
        boolean z;
        String optString = jSONObject.optString("app_language", null);
        String optString2 = jSONObject.optString("app_region", null);
        if (updateAppLanguage(optString) || updateAppRegion(optString2)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C6789d.m21090j();
        }
    }

    /* access modifiers changed from: 0000 */
    public void enqueue(ActionQueueItem actionQueueItem) {
        if (actionQueueItem != null) {
            synchronized (this.mQueue) {
                if (!sStopped) {
                    if (this.mQueue.size() >= 2000) {
                        this.mQueue.poll();
                    }
                    this.mQueue.add(actionQueueItem);
                    this.mQueue.notify();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void onActivityResume(ActivityRecord activityRecord) {
        if (this.mInitOk && activityRecord != null) {
            long currentTimeMillis = System.currentTimeMillis();
            this.mActivityTime = currentTimeMillis;
            this.mActivityRecord = activityRecord;
            ActionQueueItem actionQueueItem = new ActionQueueItem(ActionQueueType.PAGE_START);
            actionQueueItem.arg = currentTimeMillis;
            enqueue(actionQueueItem);
            if (this.mANRMonitor != null) {
                this.mANRMonitor.onActivityResume();
            }
            if (this.mTrafficGuard != null) {
                this.mTrafficGuard.reset();
            }
        }
    }

    public void onTrafficWarning(TrafficWarningInfo trafficWarningInfo) {
        if (trafficWarningInfo != null) {
            if (!isInForeground()) {
                if (this.mEnableTrafficGuard == 1) {
                    onQuit();
                    Process.killProcess(Process.myPid());
                } else if (this.mEnableTrafficGuard == 2) {
                    onEvent(null, "traffic_warn", trafficWarningInfo.toString());
                }
            }
            if (this.mTrafficGuard != null) {
                this.mTrafficGuard.reset();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean parseImageSampleRatio(JSONObject jSONObject) throws JSONException {
        JSONArray names = jSONObject.names();
        if (names == null) {
            return false;
        }
        int length = names.length();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < length; i++) {
            String string = names.getString(i);
            double d = jSONObject.getDouble(string);
            if (d >= 0.0d && d < 1.0d) {
                arrayList.add(new SampleRatioItem(string, d));
            }
        }
        this.mImageRatioList = arrayList;
        return true;
    }

    public static void onActivityCreate(String str) {
        sLastCreateActivityName = str;
        StringBuilder sb = new StringBuilder();
        sb.append(sLastCreateActivityName);
        sb.append("(");
        sb.append(String.valueOf(System.currentTimeMillis()));
        sb.append(")");
        sLastCreateActivityNameAndTime = sb.toString();
    }

    private boolean updateAppLanguage(String str) {
        if (C6319n.m19593a(str)) {
            return false;
        }
        try {
            if (!str.equals(this.mHeader.optString("app_language", null))) {
                this.mHeader.put("app_language", str);
                if (this.mLogReaper != null) {
                    this.mLogReaper.updateHeader(new JSONObject(this.mHeader, HEADER_KEYS));
                }
                C7285c.m22838a(this.mContext, C6778a.m20960a(), 0).edit().putString("app_language", str).commit();
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private boolean updateAppRegion(String str) {
        if (C6319n.m19593a(str)) {
            return false;
        }
        try {
            if (!str.equals(this.mHeader.optString("app_region", null))) {
                this.mHeader.put("app_region", str);
                if (this.mLogReaper != null) {
                    this.mLogReaper.updateHeader(new JSONObject(this.mHeader, HEADER_KEYS));
                }
                C7285c.m22838a(this.mContext, C6778a.m20960a(), 0).edit().putString("app_region", str).commit();
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private void updateCustomerHeader(Bundle bundle) {
        if (!(bundle == null || bundle.size() <= 0 || this.mLogReaper == null)) {
            try {
                JSONObject optJSONObject = this.mHeader.optJSONObject("custom");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                for (String str : bundle.keySet()) {
                    optJSONObject.put(str, bundle.get(str));
                }
                this.mHeader.put("custom", optJSONObject);
                if (this.mLogReaper != null) {
                    this.mLogReaper.updateHeader(new JSONObject(this.mHeader, HEADER_KEYS));
                }
                ensureHeaderCopy();
            } catch (Throwable unused) {
            }
        }
    }

    private void updateDid(JSONObject jSONObject) {
        if (jSONObject != null) {
            boolean isBadDeviceId = isBadDeviceId(this.mHeader.optString("device_id", null));
            String optString = jSONObject.optString("device_id", null);
            String optString2 = jSONObject.optString("install_id", null);
            if (!C6319n.m19593a(optString)) {
                try {
                    this.mHeader.put("device_id", optString);
                } catch (JSONException unused) {
                }
            }
            if (!C6319n.m19593a(optString2)) {
                try {
                    this.mHeader.put("install_id", optString2);
                } catch (JSONException unused2) {
                }
            }
            if (this.mLogReaper != null) {
                try {
                    this.mLogReaper.updateHeader(new JSONObject(this.mHeader, HEADER_KEYS));
                } catch (JSONException unused3) {
                }
            }
            ensureHeaderCopy();
            tryUpdateConfig(true, true, isBadDeviceId);
        }
    }

    private void updateGoogleAID(String str) {
        if (!C6319n.m19593a(str) && this.mLogReaper != null) {
            try {
                if (!str.equals(this.mHeader.optString("google_aid", null))) {
                    this.mHeader.put("google_aid", str);
                    if (this.mLogReaper != null) {
                        this.mLogReaper.updateHeader(new JSONObject(this.mHeader, HEADER_KEYS));
                    }
                    C7285c.m22838a(this.mContext, C6778a.m20960a(), 0).edit().putString("google_aid", str).commit();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void enqueue(LogQueueItem logQueueItem) {
        if (logQueueItem != null) {
            this.mHeartbeatTime = System.currentTimeMillis();
            synchronized (this.mLogQueue) {
                if (this.mLogQueue.size() >= 2000) {
                    this.mLogQueue.poll();
                }
                this.mLogQueue.add(logQueueItem);
                this.mLogQueue.notify();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void handleEvent(LogEvent logEvent) {
        notifyOnEvent(logEvent);
        boolean z = true;
        tryExtendSession(logEvent.timestamp, true);
        if (this.mSession == null) {
            tryReportEventDiscard(4);
            return;
        }
        if ("event_v3".equalsIgnoreCase(logEvent.category)) {
            logEvent.teaEventIndex = this.mGlobalEventIndexMatrix.getAndIncrement();
        } else {
            logEvent.teaEventIndex = this.mGlobalEventIndexMatrixV1.getAndIncrement();
        }
        logEvent.session_id = this.mSession.f19228id;
        if (!handleEventTimely(logEvent)) {
            long insertEvent = DBHelper.getInstance(this.mContext).insertEvent(logEvent);
            if (insertEvent > 0) {
                logEvent.f19226id = insertEvent;
                sendHeartbeat();
            }
            if (insertEvent <= 0) {
                z = false;
            }
            tryReportEventInsertResult(z, logEvent.teaEventIndex);
        }
    }

    /* access modifiers changed from: 0000 */
    public void onActivityPause(ActivityRecord activityRecord) {
        if (this.mInitOk && activityRecord != null) {
            String str = activityRecord.mActivityClassName;
            long currentTimeMillis = System.currentTimeMillis();
            ActivityRecord activityRecord2 = this.mActivityRecord;
            if (activityRecord2 == null || !(activityRecord2 == null || activityRecord2.mHashcode == activityRecord.mHashcode)) {
                this.mActivityTime = currentTimeMillis - 1010;
            }
            this.mActivityRecord = null;
            int i = (int) ((currentTimeMillis - this.mActivityTime) / 1000);
            if (i <= 0) {
                i = 1;
            }
            this.mActivityTime = currentTimeMillis;
            LogPage logPage = new LogPage();
            logPage.name = str;
            logPage.duration = i;
            ActionQueueItem actionQueueItem = new ActionQueueItem(ActionQueueType.PAGE_END);
            actionQueueItem.obj = logPage;
            actionQueueItem.arg = currentTimeMillis;
            enqueue(actionQueueItem);
            if (this.mANRMonitor != null) {
                this.mANRMonitor.onActivityPause();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void parseImageErrorReport(JSONObject jSONObject) throws JSONException {
        JSONArray names = jSONObject.names();
        int length = names.length();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < length; i++) {
            String string = names.getString(i);
            JSONObject jSONObject2 = jSONObject.getJSONObject(string);
            int ensureRange = ensureRange(jSONObject2.optInt("net_error_interval"), 10, 1, 60);
            int ensureRange2 = ensureRange(jSONObject2.optInt("net_report_count"), 3, 1, 10);
            int ensureRange3 = ensureRange(jSONObject2.optInt("net_silent_period"), 60, 60, 86400);
            int i2 = ensureRange3;
            ImageErrorConfigItem imageErrorConfigItem = r5;
            ImageErrorConfigItem imageErrorConfigItem2 = new ImageErrorConfigItem(string, ensureRange, ensureRange2, i2, ensureRange(jSONObject2.optInt("srv_error_interval"), 10, 1, 60), ensureRange(jSONObject2.optInt("srv_report_count"), 3, 1, 10), ensureRange(jSONObject2.optInt("srv_silent_period"), C34943c.f91128x, 60, 86400));
            arrayList.add(imageErrorConfigItem);
        }
        this.mImageErrorList = arrayList;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x002d */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d A[SYNTHETIC, Splitter:B:8:0x002d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean sendTimelyEvent(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            java.lang.String r1 = "UTF-8"
            byte[] r4 = r9.getBytes(r1)     // Catch:{ Throwable -> 0x0066 }
            java.lang.String r9 = APPLOG_TIMELY_URL()     // Catch:{ Throwable -> 0x0066 }
            android.content.Context r1 = r8.mContext     // Catch:{ Throwable -> 0x0066 }
            java.lang.String r9 = com.p280ss.android.usergrowth.C7304c.m22878a(r1, r9)     // Catch:{ Throwable -> 0x0066 }
            r1 = 1
            java.lang.String r3 = com.p280ss.android.common.applog.NetUtil.addCommonParams(r9, r1)     // Catch:{ Throwable -> 0x0066 }
            java.lang.Object r9 = r4.clone()     // Catch:{ Throwable -> 0x0066 }
            byte[] r9 = (byte[]) r9     // Catch:{ Throwable -> 0x0066 }
            android.content.Context r2 = r8.mContext     // Catch:{ Throwable -> 0x0066 }
            if (r2 == 0) goto L_0x002d
            boolean r2 = getLogEncryptSwitch()     // Catch:{ Throwable -> 0x0066 }
            if (r2 == 0) goto L_0x002d
            android.content.Context r2 = r8.mContext     // Catch:{ RuntimeException -> 0x002d }
            java.lang.String r9 = com.p280ss.android.common.applog.NetUtil.sendEncryptLog(r3, r9, r2, r0)     // Catch:{ RuntimeException -> 0x002d }
            goto L_0x0039
        L_0x002d:
            com.bytedance.common.utility.k r2 = com.bytedance.common.utility.C6317k.m19580a()     // Catch:{ Throwable -> 0x0066 }
            r5 = 1
            java.lang.String r6 = "application/json; charset=utf-8"
            r7 = 0
            java.lang.String r9 = r2.mo15155a(r3, r4, r5, r6, r7)     // Catch:{ Throwable -> 0x0066 }
        L_0x0039:
            if (r9 == 0) goto L_0x0065
            int r2 = r9.length()     // Catch:{ Throwable -> 0x0066 }
            if (r2 != 0) goto L_0x0042
            goto L_0x0065
        L_0x0042:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0066 }
            r2.<init>(r9)     // Catch:{ Throwable -> 0x0066 }
            java.lang.String r9 = "ss_app_log"
            java.lang.String r3 = "magic_tag"
            java.lang.String r3 = r2.optString(r3)     // Catch:{ Throwable -> 0x0066 }
            boolean r9 = r9.equals(r3)     // Catch:{ Throwable -> 0x0066 }
            if (r9 == 0) goto L_0x0064
            java.lang.String r9 = "success"
            java.lang.String r3 = "message"
            java.lang.String r2 = r2.optString(r3)     // Catch:{ Throwable -> 0x0066 }
            boolean r9 = r9.equals(r2)     // Catch:{ Throwable -> 0x0066 }
            if (r9 == 0) goto L_0x0064
            r0 = 1
        L_0x0064:
            return r0
        L_0x0065:
            return r0
        L_0x0066:
            r9 = move-exception
            boolean r1 = r9 instanceof com.bytedance.common.utility.CommonHttpException
            if (r1 == 0) goto L_0x007f
            com.bytedance.common.utility.CommonHttpException r9 = (com.bytedance.common.utility.CommonHttpException) r9
            int r9 = r9.getResponseCode()
            r1 = 500(0x1f4, float:7.0E-43)
            if (r9 < r1) goto L_0x007f
            r1 = 600(0x258, float:8.41E-43)
            if (r9 >= r1) goto L_0x007f
            long r1 = java.lang.System.currentTimeMillis()
            r8.mStartWaitSendTimely = r1
        L_0x007f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.applog.AppLog.sendTimelyEvent(java.lang.String):boolean");
    }

    public static void activeUserInvokeInternal(Context context) {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z2 = !_lancet.com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailable(context);
        long j = currentTimeMillis - sFetchActiveTime;
        if (j < 900000) {
            z = true;
        } else {
            z = false;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sHasLoadDid", sHasLoadDid);
            jSONObject.put("sPendingActiveUser", sPendingActiveUser);
            jSONObject.put("networkNotAvailable", z2);
            jSONObject.put("now", currentTimeMillis);
            jSONObject.put("sFetchActiveTime", sFetchActiveTime);
            jSONObject.put("durationSinceLastLaunchActiveThread", j);
            jSONObject.put("launchActiveThreadTooFrequently", z);
        } catch (JSONException unused) {
        }
        Integer a = C6793k.m21104a().mo16598a(jSONObject);
        if (!sHasLoadDid) {
            synchronized (AppLog.class) {
                if (!sHasLoadDid) {
                    sPendingActiveUser = true;
                    return;
                }
            }
        }
        sPendingActiveUser = false;
        if (!z && !z2) {
            sFetchActiveTime = currentTimeMillis;
            new C6731a(context, ACTIVE_USER_URL(), a).start();
            C6793k.m21104a().mo16611d(a);
        }
    }

    private boolean handleEventTimely(final LogEvent logEvent) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (logEvent != null && !logEvent.mHasTimelySend) {
                if (currentTimeMillis - this.mStartWaitSendTimely >= 900000) {
                    if ("event_v3".equalsIgnoreCase(logEvent.category) && this.mEventTimely != null && this.mEventTimely.size() > 0 && !C6319n.m19593a(logEvent.tag) && this.mEventTimely.containsKey(logEvent.tag) && !C6319n.m19593a(logEvent.ext_json)) {
                        JSONObject jSONObject = new JSONObject(logEvent.ext_json);
                        if (jSONObject.optInt("_event_v3", 0) == 1) {
                            JSONObject jSONObject2 = new JSONObject();
                            JSONObject jSONObject3 = new JSONObject();
                            if (jSONObject.has("nt")) {
                                jSONObject3.put("nt", jSONObject.optInt("nt"));
                            }
                            if (logEvent.user_id > 0) {
                                jSONObject3.put("user_id", logEvent.user_id);
                            }
                            jSONObject.remove("nt");
                            jSONObject.remove("_event_v3");
                            jSONObject3.put("event", logEvent.tag);
                            jSONObject3.put("params", jSONObject);
                            jSONObject3.put("session_id", logEvent.session_id);
                            jSONObject3.put("datetime", formatDate(logEvent.timestamp));
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.put(jSONObject3);
                            jSONObject2.put("event_v3", jSONArray);
                            if (this.mTimeSync != null) {
                                jSONObject2.put("time_sync", this.mTimeSync);
                            }
                            jSONObject2.put("magic_tag", "ss_app_log");
                            jSONObject2.put("header", this.mHeader);
                            jSONObject2.put("_gen_time", System.currentTimeMillis());
                            final String jSONObject4 = jSONObject2.toString();
                            new C6304f() {
                                public void run() {
                                    super.run();
                                    try {
                                        if (!AppLog.this.sendTimelyEvent(jSONObject4)) {
                                            LogEvent logEvent = new LogEvent();
                                            logEvent.category = logEvent.category;
                                            logEvent.tag = logEvent.tag;
                                            logEvent.label = logEvent.label;
                                            logEvent.value = logEvent.value;
                                            logEvent.ext_value = logEvent.ext_value;
                                            logEvent.mHasTimelySend = true;
                                            logEvent.user_id = logEvent.user_id;
                                            logEvent.ext_json = logEvent.ext_json;
                                            logEvent.instant_only = logEvent.instant_only;
                                            logEvent.timestamp = logEvent.timestamp;
                                            ActionQueueItem actionQueueItem = new ActionQueueItem(ActionQueueType.EVENT);
                                            actionQueueItem.obj = logEvent;
                                            AppLog.this.enqueue(actionQueueItem);
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }
                            }.start();
                            return true;
                        }
                    }
                    return false;
                }
            }
            return false;
        } catch (Throwable unused) {
        }
    }

    private void insertAnrToDB(String str) {
        if (!C6319n.m19593a(str)) {
            try {
                LogReaper logReaper = this.mLogReaper;
                if (logReaper != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("data", str);
                    jSONObject.put("is_anr", 1);
                    jSONObject.put("anr_time", System.currentTimeMillis());
                    if (this.mContext != null) {
                        CrashUtil.getMemoryInfo(this.mContext, jSONObject);
                    }
                    jSONObject.put("last_create_activity", sLastCreateActivityName);
                    jSONObject.put("last_resume_activity", sLastResumeActivityName);
                    jSONObject.put("last_create_activity_time", sLastCreateActivityNameAndTime);
                    jSONObject.put("last_resume_activity_time", sLastResumeActivityNameAndTime);
                    jSONObject.put("app_start_time", sAppStartTime);
                    jSONObject.put("app_start_time_readable", new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date(sAppStartTime)));
                    if (sAppContext != null) {
                        jSONObject.put("crash_version", sAppContext.mo16342i());
                        jSONObject.put("crash_version_code", sAppContext.mo16344k());
                        jSONObject.put("crash_update_version_code", sAppContext.mo16340g());
                    }
                    jSONObject.put("alive_activities", C6755a.m20902a());
                    jSONObject.put("running_task_info", C6776h.m20955e(this.mContext));
                    logReaper.insertCrashLog(jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private AppLog(Context context) {
        C6789d.m21073b("2.5.5.8");
        this.mContext = context.getApplicationContext();
        this.mHeader = new JSONObject();
        this.mFingerprint = new JSONObject();
        sAppStartTime = System.currentTimeMillis();
        initDataFromSp(context);
        this.mInitOk = true;
        new ActionReaper().start();
        if (sReportCrash) {
            this.mOriginHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (this.mOriginHandler == this) {
                this.mOriginHandler = null;
            } else {
                Thread.setDefaultUncaughtExceptionHandler(this);
            }
        }
        this.mWifiBssidInfo = new WifiBssidInfo(this.mContext);
        this.mNetWorkMonitor = new C6302a(this.mContext);
    }

    /* access modifiers changed from: 0000 */
    public void loadStats(LogSession logSession) {
        try {
            this.mSamples.clear();
            SharedPreferences a = C7285c.m22838a(this.mContext, C6778a.m20960a(), 0);
            long currentTimeMillis = System.currentTimeMillis();
            this.mSendFingerprintTime = a.getLong("send_fingerprint_time", 0);
            if (this.mSendFingerprintTime >= currentTimeMillis) {
                this.mSendFingerprintTime = currentTimeMillis - 86400000;
            }
            long j = a.getLong("session_interval", 30000);
            if (j >= C40413c.f105051b && j <= 300000) {
                this.mSessionInterval = j;
            }
            this.mBatchEventInterval = a.getLong("batch_event_interval", 0);
            this.mSendLaunchTimely = a.getInt("send_launch_timely", 1);
            try {
                String string = a.getString("image_sampling_ratio", null);
                if (string != null) {
                    parseImageSampleRatio(new JSONObject(string));
                }
            } catch (Exception unused) {
            }
            try {
                String string2 = a.getString("image_error_report", null);
                if (string2 != null) {
                    parseImageErrorReport(new JSONObject(string2));
                }
            } catch (Exception unused2) {
            }
            try {
                String string3 = a.getString("image_error_codes", null);
                if (string3 != null) {
                    this.mImageErrorCodes = parseIntSet(new JSONArray(string3));
                }
            } catch (Exception unused3) {
            }
            try {
                String string4 = a.getString("fingerprint_codes", null);
                if (string4 != null) {
                    this.mFingerprintSet = parseIntSet(new JSONArray(string4));
                }
            } catch (Exception unused4) {
            }
            this.mHttpMonitorPort = a.getInt("http_monitor_port", 0);
            sAppLogHttpsToHttp = a.getInt("switch_applog_https_to_http", 0);
            TTEncryptUtils.f18651a = a.getBoolean("use_new_encrypt", false);
            if (logSession != null) {
                String string5 = a.getString("stats_value", null);
                if (!C6319n.m19593a(string5)) {
                    JSONObject jSONObject = new JSONObject(string5);
                    String optString = jSONObject.optString("session_id", null);
                    if (optString != null) {
                        if (optString.equals(logSession.value)) {
                            int optInt = jSONObject.optInt("cnt_success", 0);
                            int optInt2 = jSONObject.optInt("cnt_failure", 0);
                            if (optInt > 0) {
                                this.mImageSuccessCount.addAndGet(optInt);
                            }
                            if (optInt2 > 0) {
                                this.mImageFailureCount.addAndGet(optInt2);
                            }
                            if (!jSONObject.isNull("samples")) {
                                JSONArray jSONArray = jSONObject.getJSONArray("samples");
                                int length = jSONArray.length();
                                if (length > 5) {
                                    length = 5;
                                }
                                for (int i = 0; i < length; i++) {
                                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                                    String optString2 = jSONObject2.optString("url", null);
                                    int i2 = jSONObject2.getInt("networktype");
                                    long j2 = jSONObject2.getLong("time");
                                    long j3 = jSONObject2.getLong("timestamp");
                                    if (!C6319n.m19593a(optString2)) {
                                        ImageSample imageSample = new ImageSample(optString2, i2, j2, j3);
                                        this.mSamples.add(imageSample);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception unused5) {
        }
    }

    /* access modifiers changed from: 0000 */
    public void processItem(ActionQueueItem actionQueueItem) {
        String str;
        String str2;
        boolean z;
        if (this.mInitOk && !sStopped) {
            boolean z2 = false;
            switch (actionQueueItem.type) {
                case PAGE_START:
                    tryExtendSession(actionQueueItem.arg, false);
                    long j = actionQueueItem.arg;
                    if (this.mSession == null) {
                        str = "";
                    } else {
                        str = this.mSession.value;
                    }
                    C6747c.m20890a(this.mContext).mo16508a(j, str);
                    sendHeartbeat();
                    return;
                case PAGE_END:
                    long j2 = actionQueueItem.arg;
                    if (this.mSession == null) {
                        str2 = "";
                    } else {
                        str2 = this.mSession.value;
                    }
                    C6747c.m20890a(this.mContext).mo16511b(j2, str2);
                    if (actionQueueItem.obj instanceof LogPage) {
                        handlePageEnd((LogPage) actionQueueItem.obj, actionQueueItem.arg);
                    }
                    sendHeartbeat();
                    return;
                case EVENT:
                    if (actionQueueItem.obj instanceof LogEvent) {
                        handleEvent((LogEvent) actionQueueItem.obj);
                        return;
                    }
                    break;
                case IMAGE_SAMPLE:
                    if (actionQueueItem.obj instanceof ImageSample) {
                        handleImageSample((ImageSample) actionQueueItem.obj);
                        return;
                    }
                    break;
                case API_SAMPLE:
                    return;
                case CONFIG_UPDATE:
                    if (actionQueueItem.obj instanceof JSONObject) {
                        try {
                            z = Boolean.valueOf(actionQueueItem.strArg).booleanValue();
                        } catch (Exception unused) {
                            z = false;
                        }
                        JSONObject jSONObject = (JSONObject) actionQueueItem.obj;
                        if (actionQueueItem.arg == 1) {
                            z2 = true;
                        }
                        handleConfigUpdate(jSONObject, z2, z);
                    }
                    notifyRemoteConfigUpdate(true);
                    return;
                case UA_UPDATE:
                    if (actionQueueItem.obj instanceof String) {
                        updateUserAgentString((String) actionQueueItem.obj);
                        return;
                    }
                    break;
                case SAVE_ANR_TAG:
                    return;
                case SAVE_DNS_REPORT:
                    if (actionQueueItem.arg > 0) {
                        doSaveDnsReportTime(actionQueueItem.arg);
                        return;
                    }
                    break;
                case SAVE_MISC_LOG:
                    if (!C6319n.m19593a(actionQueueItem.strArg) && (actionQueueItem.obj instanceof JSONObject)) {
                        doRecordMiscLog(actionQueueItem.strArg, (JSONObject) actionQueueItem.obj);
                        return;
                    }
                case CUSTOMER_HEADER_UPDATE:
                    if (actionQueueItem.obj instanceof Bundle) {
                        updateCustomerHeader((Bundle) actionQueueItem.obj);
                        return;
                    }
                    break;
                case DEVICE_ID_UPDATE:
                    if (actionQueueItem.obj instanceof JSONObject) {
                        updateDid((JSONObject) actionQueueItem.obj);
                        return;
                    }
                    break;
                case UPDATE_GOOGLE_AID:
                    if (actionQueueItem.obj instanceof String) {
                        updateGoogleAID((String) actionQueueItem.obj);
                        return;
                    }
                    break;
                case UPDATE_APP_LANGUAGE_REGION:
                    if (actionQueueItem.obj instanceof JSONObject) {
                        updateAppLanguageAndRegion((JSONObject) actionQueueItem.obj);
                        break;
                    }
                    break;
            }
        }
    }

    public static void appendCommonParams(StringBuilder sb, boolean z) {
        NetUtil.appendCommonParams(sb, z);
    }

    public static void setAccount(Context context, Account account) {
        C6789d.m21057a(context, account);
    }

    public static String addCommonParams(String str, boolean z) {
        return NetUtil.addCommonParams(str, z);
    }

    public static int checkHttpRequestException(Throwable th, String[] strArr) {
        return NetUtil.checkHttpRequestException(th, strArr);
    }

    public static void setCollectFreeSpace(boolean z, FreeSpaceCollector freeSpaceCollector) {
        mCollectFreeSpace = z;
        mFreeSpaceCollector = freeSpaceCollector;
    }

    /* access modifiers changed from: 0000 */
    public void tryUpdateConfig(boolean z, boolean z2) {
        tryUpdateConfig(z, false, z2);
    }

    public static void onEvent(Context context, String str) {
        onEvent(context, "umeng", str, null, 0, 0, false, null);
    }

    static void tryReportEventInsertResult(final boolean z, final long j) {
        runOnUIThread(new Runnable() {
            public final void run() {
                LogRequestTraceCallback logRequestTraceCallback = AppLog.sTraceCallback;
                if (logRequestTraceCallback != null) {
                    logRequestTraceCallback.onEventInsertResult(z, j);
                }
            }
        });
    }

    static void tryReportLogRequest(final boolean z, final List<Long> list) {
        runOnUIThread(new Runnable() {
            public final void run() {
                LogRequestTraceCallback logRequestTraceCallback = AppLog.sTraceCallback;
                if (logRequestTraceCallback != null) {
                    logRequestTraceCallback.onLogRequestResult(z, list);
                }
            }
        });
    }

    public static void clearDidAndIid(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            if (!sInitGuard) {
                C6789d.m21072b(context, str);
            } else if (C6312h.m19578b()) {
                throw new IllegalStateException("clearDidAndIid shouldn't be called after Applog.init();");
            }
        }
    }

    public static void recordMonLog(String str, String str2) {
        AppLog appLog = sInstance;
        if (appLog != null && !C6319n.m19593a(str) && !C6319n.m19593a(str2)) {
            try {
                DBHelper.getInstance(appLog.mContext).insertMonLogEntry(str, str2);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void doRecordMiscLog(String str, JSONObject jSONObject) {
        long j;
        try {
            if (this.mSession != null) {
                j = this.mSession.f19228id;
            } else {
                j = 0;
            }
            if (this.mInitOk && j > 0 && !C6319n.m19593a(str) && jSONObject != null) {
                DBHelper.getInstance(this.mContext).insertMiscLog(j, str, jSONObject.toString());
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    public void parseIntSet(HashSet<Integer> hashSet, JSONArray jSONArray) throws JSONException {
        if (hashSet != null && jSONArray != null) {
            hashSet.clear();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                int i2 = jSONArray.getInt(i);
                if (i2 > 0) {
                    hashSet.add(Integer.valueOf(i2));
                }
            }
        }
    }

    private boolean initHeader(JSONObject jSONObject, Context context) {
        try {
            JSONArray jSONArray = new JSONArray();
            if (sMiPushInclude) {
                jSONArray.put(1);
            }
            if (sMyPushInclude) {
                jSONArray.put(2);
            }
            if (sUmengPushInclude) {
                jSONArray.put(6);
            }
            if (sHwPushInclude) {
                jSONArray.put(7);
            }
            if (sMzPushInclude) {
                jSONArray.put(8);
            }
            if (sAliyunPushInclude) {
                jSONArray.put(9);
            }
            jSONObject.put("push_sdk", jSONArray);
        } catch (Exception unused) {
        }
        return C6781d.m20978a(context, jSONObject);
    }

    public static void setAllowPushService(int i, int i2) {
        AppLog appLog = sInstance;
        if (appLog == null) {
            return;
        }
        if (i2 == 1 || i2 == 0) {
            synchronized (sLock) {
                if ((appLog.mAllowPushSet.contains(Integer.valueOf(i)) && i2 == 0) || (!appLog.mAllowPushSet.contains(Integer.valueOf(i)) && i2 == 1)) {
                    if (i2 == 1) {
                        appLog.mAllowPushSet.add(Integer.valueOf(i));
                    } else {
                        appLog.mAllowPushSet.remove(Integer.valueOf(i));
                    }
                    appLog.notifyConfigUpdate();
                }
            }
        }
    }

    public static void setAppLanguageAndRegion(String str, String str2) {
        if (!C6319n.m19593a(str) || !C6319n.m19593a(str2)) {
            JSONObject jSONObject = new JSONObject();
            if (!C6319n.m19593a(str)) {
                C6725a.m20838b(str);
                try {
                    jSONObject.put("app_language", str);
                } catch (JSONException unused) {
                }
            }
            if (!C6319n.m19593a(str2)) {
                C6725a.m20840c(str2);
                try {
                    jSONObject.put("app_region", str2);
                } catch (JSONException unused2) {
                }
            }
            AppLog appLog = sInstance;
            if (appLog != null) {
                ActionQueueItem actionQueueItem = new ActionQueueItem(ActionQueueType.UPDATE_APP_LANGUAGE_REGION);
                actionQueueItem.obj = jSONObject;
                appLog.enqueue(actionQueueItem);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void handlePageEnd(LogPage logPage, long j) {
        if (this.mSession != null && !this.mSession.non_page) {
            this.mSession.active = false;
            this.mSession.pausetime = j;
            logPage.session_id = this.mSession.f19228id;
            DBHelper.getInstance(this.mContext).insertPage(logPage, j);
            try {
                JSONObject jSONObject = new JSONObject();
                int i = this.mImageSuccessCount.get();
                int i2 = this.mImageFailureCount.get();
                jSONObject.put("session_id", this.mSession.value);
                jSONObject.put("cnt_success", i);
                jSONObject.put("cnt_failure", i2);
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.mSamples.iterator();
                while (it.hasNext()) {
                    ImageSample imageSample = (ImageSample) it.next();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("url", imageSample.url);
                    jSONObject2.put("networktype", imageSample.networktype);
                    jSONObject2.put("time", imageSample.time);
                    jSONObject2.put("timestamp", imageSample.timestamp);
                    jSONArray.put(jSONObject2);
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put("samples", jSONArray);
                }
                Editor edit = C7285c.m22838a(this.mContext, C6778a.m20960a(), 0).edit();
                edit.putString("stats_value", jSONObject.toString());
                edit.commit();
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void tryExtendSession(long j, boolean z) {
        boolean z2;
        DBHelper instance = DBHelper.getInstance(this.mContext);
        if (this.mSession == null || ((!this.mSession.active && j - this.mSession.pausetime >= this.mSessionInterval) || (this.mSession.non_page && !z))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            if (!z) {
                this.mSession.active = true;
                this.mSession.pausetime = j;
            }
            return;
        }
        onSessionEnd();
        LogSession logSession = this.mSession;
        LogSession logSession2 = new LogSession();
        logSession2.value = genSession();
        logSession2.timestamp = j;
        resetEventIndex();
        logSession2.eventIndex = this.mGlobalEventIndexMatrix.getAndIncrement();
        logSession2.pausetime = logSession2.timestamp;
        logSession2.duration = 0;
        logSession2.app_version = C6781d.m20991g();
        logSession2.version_code = C6781d.m20988e();
        logSession2.non_page = z;
        if (!z) {
            logSession2.active = true;
        }
        long insertSession = instance.insertSession(logSession2);
        if (insertSession > 0) {
            logSession2.f19228id = insertSession;
            this.mSession = logSession2;
            notifySessionStart(insertSession);
        } else {
            this.mSession = null;
        }
        if (!(logSession == null && this.mSession == null)) {
            LogQueueSwitchSession logQueueSwitchSession = new LogQueueSwitchSession();
            logQueueSwitchSession.old = logSession;
            if (mLaunchFrom <= 0) {
                mLaunchFrom = 6;
            }
            if (this.mSession != null && !this.mSession.non_page) {
                logQueueSwitchSession.launch_session = this.mSession;
            }
            enqueue((LogQueueItem) logQueueSwitchSession);
        }
    }

    public void uncaughtException(Thread thread, Throwable th) {
        LogReaper logReaper = this.mLogReaper;
        if (!(th == null || logReaper == null)) {
            try {
                JSONObject crashInfo = CrashUtil.getCrashInfo(this.mContext, thread, th);
                crashInfo.put("last_create_activity", sLastCreateActivityName);
                crashInfo.put("last_resume_activity", sLastResumeActivityName);
                crashInfo.put("last_create_activity_time", sLastCreateActivityNameAndTime);
                crashInfo.put("last_resume_activity_time", sLastResumeActivityNameAndTime);
                crashInfo.put("app_start_time", sAppStartTime);
                crashInfo.put("app_start_time_readable", new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date(sAppStartTime)));
                if (sAppContext != null) {
                    crashInfo.put("crash_version", sAppContext.mo16342i());
                    crashInfo.put("crash_version_code", sAppContext.mo16344k());
                    crashInfo.put("crash_update_version_code", sAppContext.mo16340g());
                }
                crashInfo.put("alive_activities", C6755a.m20902a());
                crashInfo.put("running_task_info", C6776h.m20955e(this.mContext));
                if (sCustomInfo != null) {
                    JSONObject userDefineInfo = sCustomInfo.getUserDefineInfo();
                    if (userDefineInfo != null && userDefineInfo.length() > 0) {
                        Iterator keys = userDefineInfo.keys();
                        while (keys.hasNext()) {
                            String str = (String) keys.next();
                            if (!C6319n.m19593a(str)) {
                                crashInfo.put(str, userDefineInfo.opt(str));
                            }
                        }
                    }
                }
                logReaper.insertCrashLog(crashInfo);
                handleCallback(crashInfo);
            } catch (Exception unused) {
            }
        }
        if (!C6776h.m20947b(this.mContext)) {
            try {
                Process.killProcess(Process.myPid());
            } catch (Throwable unused2) {
            }
        } else if (!(this.mOriginHandler == null || this.mOriginHandler == this)) {
            this.mOriginHandler.uncaughtException(thread, th);
        }
    }

    public static void onImageSample(String str, int i, long j) {
        if (!sStopped) {
            AppLog appLog = sInstance;
            if (appLog != null) {
                appLog.doOnImageSample(str, i, j);
            }
        }
    }

    public static void onEvent(Context context, String str, String str2) {
        onEvent(context, "umeng", str, str2, 0, 0, false, null);
    }

    public static void onImageFailure(String str, int i, int i2) {
        if (!sStopped) {
            AppLog appLog = sInstance;
            if (appLog != null && appLog.mAllowOldImageSample) {
                appLog.onEvent("image", "fail", str, (long) i, (long) i2, true, (JSONObject) null);
            }
        }
    }

    public static boolean optBoolean(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject == null || jSONObject.isNull(str)) {
            return z;
        }
        int optInt = jSONObject.optInt(str, -1);
        if (optInt > 0) {
            return true;
        }
        if (optInt == 0) {
            return false;
        }
        return jSONObject.optBoolean(str, z);
    }

    /* access modifiers changed from: 0000 */
    public void doOnImageSample(String str, int i, long j) {
        if (this.mAllowOldImageSample) {
            ImageSample imageSample = new ImageSample(str, i, j, System.currentTimeMillis());
            ActionQueueItem actionQueueItem = new ActionQueueItem(ActionQueueType.IMAGE_SAMPLE);
            actionQueueItem.obj = imageSample;
            enqueue(actionQueueItem);
        }
    }

    public static void init(Context context, boolean z, UrlConfig urlConfig2) {
        if (AppProvider.f19295a == null && context != null) {
            AppProvider.f19295a = context;
        }
        if (urlConfig2 != null) {
            urlConfig = urlConfig2;
            setDeviceRegisterURL(urlConfig2.mDeviceRegisterUrl);
            sInitGuard = true;
            if (context instanceof Activity) {
                sInitWithActivity = true;
            }
            getInstance(context);
            if (!mHasHandledCache) {
                mHasHandledCache = true;
                AppLogCache.getCacheInstance().handleCacheEvent();
            }
            sHasManualInvokeActiveUser = !z;
            return;
        }
        throw new IllegalArgumentException("urlConfig must not be null");
    }

    public static void onPause(Context context, String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            ActivityRecord activityRecord = new ActivityRecord(str, i);
            AppLog instance = getInstance(context);
            if (instance != null) {
                instance.onActivityPause(activityRecord);
            }
            C6789d.m21087g();
        }
    }

    public static void onResume(Context context, String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            sLastResumeActivityName = str;
            StringBuilder sb = new StringBuilder();
            sb.append(sLastResumeActivityName);
            sb.append("(");
            sb.append(String.valueOf(System.currentTimeMillis()));
            sb.append(")");
            sLastResumeActivityNameAndTime = sb.toString();
            ActivityRecord activityRecord = new ActivityRecord(str, i);
            AppLog instance = getInstance(context);
            if (instance != null) {
                instance.onActivityResume(activityRecord);
            }
            C6789d.m21088h();
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|4|5|6|7|8) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0016 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean updateConfig(java.lang.String r3, boolean r4, boolean r5) {
        /*
            r2 = this;
            java.lang.ThreadLocal<java.lang.Boolean> r0 = sIsConfigThread
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.set(r1)
            boolean r3 = r2.doUpdateConfig(r3, r4, r5)
            java.lang.Object r4 = sLogConfigLock
            monitor-enter(r4)
            r5 = 0
            r2.mLoadingOnlineConfig = r5     // Catch:{ all -> 0x0022 }
            java.lang.Object r0 = sLogConfigLock     // Catch:{ Exception -> 0x0016 }
            r0.notifyAll()     // Catch:{ Exception -> 0x0016 }
        L_0x0016:
            monitor-exit(r4)     // Catch:{ all -> 0x0022 }
            java.lang.ThreadLocal<java.lang.Boolean> r4 = sIsConfigThread
            r4.remove()
            if (r3 != 0) goto L_0x0021
            r2.notifyRemoteConfigUpdate(r5)
        L_0x0021:
            return r3
        L_0x0022:
            r3 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0022 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.applog.AppLog.updateConfig(java.lang.String, boolean, boolean):boolean");
    }

    public static void recordMiscLog(Context context, String str, JSONObject jSONObject) {
        if (!sStopped && !C6319n.m19593a(str) && jSONObject != null && jSONObject.length() > 0) {
            AppLog appLog = sInstance;
            if (appLog != null) {
                try {
                    if (C6772a.m20923a().f19271b) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("log_type", str);
                        jSONObject2.put("obj", jSONObject);
                        C6772a.m20923a().mo16563a(jSONObject2);
                    }
                } catch (Exception unused) {
                }
                ActionQueueItem actionQueueItem = new ActionQueueItem(ActionQueueType.SAVE_MISC_LOG);
                actionQueueItem.strArg = str;
                actionQueueItem.obj = jSONObject;
                appLog.enqueue(actionQueueItem);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b4 A[Catch:{ Throwable -> 0x00fd }, LOOP:0: B:7:0x0024->B:45:0x00b4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b9 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean doUpdateConfig(java.lang.String r17, boolean r18, boolean r19) {
        /*
            r16 = this;
            r1 = r16
            r2 = 0
            java.lang.String r0 = "UTF-8"
            r3 = r17
            byte[] r9 = r3.getBytes(r0)     // Catch:{ Throwable -> 0x00fd }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x00fd }
            long r5 = mLastGetAppConfigTime     // Catch:{ Throwable -> 0x00fd }
            r0 = 0
            long r5 = r3 - r5
            r7 = 600000(0x927c0, double:2.964394E-318)
            r10 = 1
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x001e
            r11 = 1
            goto L_0x001f
        L_0x001e:
            r11 = 0
        L_0x001f:
            mLastGetAppConfigTime = r3     // Catch:{ Throwable -> 0x00fd }
            r12 = 0
            r0 = 0
            r13 = 0
        L_0x0024:
            r3 = 2
            if (r13 >= r3) goto L_0x00ba
            java.lang.Object r3 = r9.clone()     // Catch:{ Throwable -> 0x00fd }
            byte[] r3 = (byte[]) r3     // Catch:{ Throwable -> 0x00fd }
            java.lang.String r4 = APPLOG_CONFIG_URL()     // Catch:{ Throwable -> 0x00fd }
            if (r0 == 0) goto L_0x0037
            java.lang.String r4 = APPLOG_CONFIG_URL_FALLBACK_HTTP()     // Catch:{ Throwable -> 0x00fd }
        L_0x0037:
            android.content.Context r5 = r1.mContext     // Catch:{ Throwable -> 0x00fd }
            java.lang.String r4 = com.p280ss.android.usergrowth.C7304c.m22878a(r5, r4)     // Catch:{ Throwable -> 0x00fd }
            java.lang.String r4 = com.p280ss.android.common.applog.NetUtil.addCommonParams(r4, r10)     // Catch:{ Throwable -> 0x00fd }
            java.lang.String r5 = "https://"
            boolean r5 = r4.startsWith(r5)     // Catch:{ Throwable -> 0x00fd }
            if (r5 == 0) goto L_0x004b
            r14 = 1
            goto L_0x004c
        L_0x004b:
            r14 = r0
        L_0x004c:
            android.content.Context r0 = r1.mContext     // Catch:{ Throwable -> 0x00ab }
            if (r0 == 0) goto L_0x0083
            boolean r0 = getLogEncryptSwitch()     // Catch:{ Throwable -> 0x00ab }
            if (r0 == 0) goto L_0x0083
            android.content.Context r0 = r1.mContext     // Catch:{ RuntimeException -> 0x005e }
            java.lang.String r0 = com.p280ss.android.common.applog.NetUtil.sendEncryptLog(r4, r3, r0, r11)     // Catch:{ RuntimeException -> 0x005e }
            goto L_0x00bb
        L_0x005e:
            if (r11 == 0) goto L_0x0073
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00ab }
            r0.<init>()     // Catch:{ Throwable -> 0x00ab }
            r0.append(r4)     // Catch:{ Throwable -> 0x00ab }
            java.lang.String r3 = "&config_retry=b"
            r0.append(r3)     // Catch:{ Throwable -> 0x00ab }
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x00ab }
            r15 = r0
            goto L_0x0074
        L_0x0073:
            r15 = r4
        L_0x0074:
            com.bytedance.common.utility.k r3 = com.bytedance.common.utility.C6317k.m19580a()     // Catch:{ Throwable -> 0x00a8 }
            r6 = 1
            java.lang.String r7 = "application/json; charset=utf-8"
            r8 = 0
            r4 = r15
            r5 = r9
            java.lang.String r0 = r3.mo15155a(r4, r5, r6, r7, r8)     // Catch:{ Throwable -> 0x00a8 }
            goto L_0x00bb
        L_0x0083:
            if (r11 == 0) goto L_0x0098
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00ab }
            r0.<init>()     // Catch:{ Throwable -> 0x00ab }
            r0.append(r4)     // Catch:{ Throwable -> 0x00ab }
            java.lang.String r3 = "&config_retry=b"
            r0.append(r3)     // Catch:{ Throwable -> 0x00ab }
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x00ab }
            r15 = r0
            goto L_0x0099
        L_0x0098:
            r15 = r4
        L_0x0099:
            com.bytedance.common.utility.k r3 = com.bytedance.common.utility.C6317k.m19580a()     // Catch:{ Throwable -> 0x00a8 }
            r6 = 1
            java.lang.String r7 = "application/json; charset=utf-8"
            r8 = 0
            r4 = r15
            r5 = r9
            java.lang.String r0 = r3.mo15155a(r4, r5, r6, r7, r8)     // Catch:{ Throwable -> 0x00a8 }
            goto L_0x00bb
        L_0x00a8:
            r0 = move-exception
            r4 = r15
            goto L_0x00ac
        L_0x00ab:
            r0 = move-exception
        L_0x00ac:
            java.lang.String r3 = "http://"
            boolean r3 = r4.startsWith(r3)     // Catch:{ Throwable -> 0x00fd }
            if (r3 != 0) goto L_0x00b9
            int r13 = r13 + 1
            r0 = r14
            goto L_0x0024
        L_0x00b9:
            throw r0     // Catch:{ Throwable -> 0x00fd }
        L_0x00ba:
            r0 = r12
        L_0x00bb:
            if (r0 == 0) goto L_0x00fc
            int r3 = r0.length()     // Catch:{ Throwable -> 0x00fd }
            if (r3 != 0) goto L_0x00c4
            goto L_0x00fc
        L_0x00c4:
            if (r18 == 0) goto L_0x00cf
            com.ss.android.common.applog.WifiBssidInfo r3 = r1.mWifiBssidInfo     // Catch:{ Throwable -> 0x00fd }
            if (r3 == 0) goto L_0x00cf
            com.ss.android.common.applog.WifiBssidInfo r3 = r1.mWifiBssidInfo     // Catch:{ Throwable -> 0x00fd }
            r3.uploadSuccess()     // Catch:{ Throwable -> 0x00fd }
        L_0x00cf:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Throwable -> 0x00fd }
            r3.<init>(r0)     // Catch:{ Throwable -> 0x00fd }
            java.lang.String r0 = "ss_app_log"
            java.lang.String r4 = "magic_tag"
            java.lang.String r4 = r3.optString(r4)     // Catch:{ Throwable -> 0x00fd }
            boolean r0 = r0.equals(r4)     // Catch:{ Throwable -> 0x00fd }
            if (r0 != 0) goto L_0x00e3
            return r2
        L_0x00e3:
            com.ss.android.common.applog.AppLog$ActionQueueItem r0 = new com.ss.android.common.applog.AppLog$ActionQueueItem     // Catch:{ Throwable -> 0x00fd }
            com.ss.android.common.applog.AppLog$ActionQueueType r4 = com.p280ss.android.common.applog.AppLog.ActionQueueType.CONFIG_UPDATE     // Catch:{ Throwable -> 0x00fd }
            r0.<init>(r4)     // Catch:{ Throwable -> 0x00fd }
            r0.obj = r3     // Catch:{ Throwable -> 0x00fd }
            java.lang.String r3 = java.lang.String.valueOf(r19)     // Catch:{ Throwable -> 0x00fd }
            r0.strArg = r3     // Catch:{ Throwable -> 0x00fd }
            if (r18 == 0) goto L_0x00f8
            r3 = 1
            r0.arg = r3     // Catch:{ Throwable -> 0x00fd }
        L_0x00f8:
            r1.enqueue(r0)     // Catch:{ Throwable -> 0x00fd }
            return r10
        L_0x00fc:
            return r2
        L_0x00fd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.applog.AppLog.doUpdateConfig(java.lang.String, boolean, boolean):boolean");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0146 */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e8 A[Catch:{ Exception -> 0x016c }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ea A[Catch:{ Exception -> 0x016c }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ed A[Catch:{ Exception -> 0x016c }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f6 A[Catch:{ Exception -> 0x0146 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x014a A[Catch:{ Exception -> 0x016c }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x015f A[Catch:{ Exception -> 0x016c }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0168 A[Catch:{ Exception -> 0x016c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void tryUpdateConfig(boolean r21, boolean r22, boolean r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r23
            boolean r2 = r0.mLoadingOnlineConfig
            if (r2 == 0) goto L_0x0009
            return
        L_0x0009:
            org.json.JSONObject r2 = r0.mHeader
            if (r2 != 0) goto L_0x000e
            return
        L_0x000e:
            org.json.JSONObject r2 = r0.mHeader
            java.lang.String r3 = "device_id"
            r4 = 0
            java.lang.String r2 = r2.optString(r3, r4)
            boolean r2 = isBadDeviceId(r2)
            if (r2 == 0) goto L_0x001e
            return
        L_0x001e:
            org.json.JSONObject r2 = r0.mHeader
            java.lang.String r3 = "install_id"
            java.lang.String r2 = r2.optString(r3, r4)
            boolean r2 = com.bytedance.common.utility.C6319n.m19593a(r2)
            if (r2 == 0) goto L_0x002d
            return
        L_0x002d:
            long r2 = java.lang.System.currentTimeMillis()
            r7 = 60000(0xea60, double:2.9644E-319)
            int r9 = r0.mLastConfigVersion
            int r10 = r0.mVersionCode
            r11 = 0
            r12 = 1
            if (r9 != r10) goto L_0x003e
            r9 = 1
            goto L_0x003f
        L_0x003e:
            r9 = 0
        L_0x003f:
            boolean r10 = sInitWithActivity
            r13 = 43200000(0x2932e00, double:2.1343636E-316)
            if (r10 != 0) goto L_0x0053
            long r4 = r0.mActivityTime
            r18 = 0
            int r6 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r6 >= 0) goto L_0x0053
            if (r9 == 0) goto L_0x0053
            r16 = r13
            goto L_0x0056
        L_0x0053:
            r16 = 21600000(0x1499700, double:1.0671818E-316)
        L_0x0056:
            if (r9 == 0) goto L_0x005b
            r7 = 180000(0x2bf20, double:8.8932E-319)
        L_0x005b:
            boolean r4 = r20.isBssidAllowUpload()
            if (r4 != 0) goto L_0x0086
            if (r22 != 0) goto L_0x0075
            long r5 = r0.mUpdateConfigTime
            long r5 = r2 - r5
            int r9 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r9 >= 0) goto L_0x006c
            return
        L_0x006c:
            long r5 = r0.mTryUpdateConfigTime
            long r5 = r2 - r5
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x0086
            return
        L_0x0075:
            long r5 = r0.mTryUpdateConfigTime
            long r9 = r0.mUpdateConfigTime
            int r16 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r16 <= 0) goto L_0x0086
            long r5 = r0.mTryUpdateConfigTime
            long r5 = r2 - r5
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x0086
            return
        L_0x0086:
            android.content.Context r5 = r0.mContext     // Catch:{ Exception -> 0x016c }
            boolean r5 = com.p280ss.android.common.applog.AppLog._lancet.com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailable(r5)     // Catch:{ Exception -> 0x016c }
            if (r5 != 0) goto L_0x008f
            return
        L_0x008f:
            r0.mTryUpdateConfigTime = r2     // Catch:{ Exception -> 0x016c }
            r0.mLoadingOnlineConfig = r12     // Catch:{ Exception -> 0x016c }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x016c }
            org.json.JSONObject r6 = r0.mHeader     // Catch:{ Exception -> 0x016c }
            java.lang.String[] r7 = HEADER_KEYS     // Catch:{ Exception -> 0x016c }
            r5.<init>(r6, r7)     // Catch:{ Exception -> 0x016c }
            android.content.Context r6 = r0.mContext     // Catch:{ Exception -> 0x016c }
            java.lang.String r6 = com.p280ss.android.deviceregister.p289a.C6781d.m20980b(r6)     // Catch:{ Exception -> 0x016c }
            boolean r7 = com.bytedance.common.utility.C6319n.m19593a(r6)     // Catch:{ Exception -> 0x016c }
            if (r7 != 0) goto L_0x00ad
            java.lang.String r7 = "user_agent"
            r5.put(r7, r6)     // Catch:{ Exception -> 0x016c }
        L_0x00ad:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x016c }
            r6.<init>()     // Catch:{ Exception -> 0x016c }
            java.lang.String r7 = "magic_tag"
            java.lang.String r8 = "ss_app_log"
            r6.put(r7, r8)     // Catch:{ Exception -> 0x016c }
            java.lang.String r7 = "header"
            r6.put(r7, r5)     // Catch:{ Exception -> 0x016c }
            java.lang.String r5 = "_gen_time"
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x016c }
            r6.put(r5, r7)     // Catch:{ Exception -> 0x016c }
            long r7 = r0.mSendFingerprintTime     // Catch:{ Exception -> 0x016c }
            r5 = 0
            long r2 = r2 - r7
            int r5 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r5 > 0) goto L_0x00d4
            if (r4 == 0) goto L_0x00d2
            goto L_0x00d4
        L_0x00d2:
            r15 = 0
            goto L_0x00e6
        L_0x00d4:
            android.content.Context r2 = r0.mContext     // Catch:{ Exception -> 0x016c }
            org.json.JSONObject r3 = r0.mFingerprint     // Catch:{ Exception -> 0x016c }
            java.util.HashSet<java.lang.Integer> r4 = r0.mFingerprintSet     // Catch:{ Exception -> 0x016c }
            com.ss.android.common.applog.WifiBssidInfo r5 = r0.mWifiBssidInfo     // Catch:{ Exception -> 0x016c }
            com.p280ss.android.common.applog.SensitiveInfo.tryGetFingerPrint(r2, r3, r4, r5)     // Catch:{ Exception -> 0x016c }
            org.json.JSONObject r2 = r0.mFingerprint     // Catch:{ Exception -> 0x016c }
            java.lang.String r4 = packJsonObject(r2)     // Catch:{ Exception -> 0x016c }
            r15 = r4
        L_0x00e6:
            if (r15 == 0) goto L_0x00ea
            r2 = 1
            goto L_0x00eb
        L_0x00ea:
            r2 = 0
        L_0x00eb:
            if (r15 == 0) goto L_0x00f2
            java.lang.String r3 = "fingerprint"
            r6.put(r3, r15)     // Catch:{ Exception -> 0x016c }
        L_0x00f2:
            boolean r3 = com.p280ss.android.common.applog.CustomChannelHandler.sCanSendAppInstallInfo     // Catch:{ Exception -> 0x0146 }
            if (r3 == 0) goto L_0x0146
            android.content.Context r3 = r0.mContext     // Catch:{ Exception -> 0x0146 }
            com.ss.android.common.applog.CustomChannelHandler r3 = com.p280ss.android.common.applog.CustomChannelHandler.inst(r3)     // Catch:{ Exception -> 0x0146 }
            r3.setIsSendingAppInfo(r11)     // Catch:{ Exception -> 0x0146 }
            android.content.Context r3 = r0.mContext     // Catch:{ Exception -> 0x0146 }
            com.ss.android.common.applog.CustomChannelHandler r3 = com.p280ss.android.common.applog.CustomChannelHandler.inst(r3)     // Catch:{ Exception -> 0x0146 }
            boolean r3 = r3.hasGetApkInstallInfo()     // Catch:{ Exception -> 0x0146 }
            if (r3 != 0) goto L_0x0115
            android.content.Context r3 = r0.mContext     // Catch:{ Exception -> 0x0146 }
            com.ss.android.common.applog.CustomChannelHandler r3 = com.p280ss.android.common.applog.CustomChannelHandler.inst(r3)     // Catch:{ Exception -> 0x0146 }
            r3.getApkInstallInfo()     // Catch:{ Exception -> 0x0146 }
            goto L_0x0146
        L_0x0115:
            android.content.Context r3 = r0.mContext     // Catch:{ Exception -> 0x0146 }
            com.ss.android.common.applog.CustomChannelHandler r3 = com.p280ss.android.common.applog.CustomChannelHandler.inst(r3)     // Catch:{ Exception -> 0x0146 }
            boolean r3 = r3.hasSendAppInfo()     // Catch:{ Exception -> 0x0146 }
            if (r3 == 0) goto L_0x012c
            android.content.Context r3 = r0.mContext     // Catch:{ Exception -> 0x0146 }
            com.ss.android.common.applog.CustomChannelHandler r3 = com.p280ss.android.common.applog.CustomChannelHandler.inst(r3)     // Catch:{ Exception -> 0x0146 }
            org.json.JSONObject r3 = r3.toOnlySystemRecordJson()     // Catch:{ Exception -> 0x0146 }
            goto L_0x013f
        L_0x012c:
            android.content.Context r3 = r0.mContext     // Catch:{ Exception -> 0x0146 }
            com.ss.android.common.applog.CustomChannelHandler r3 = com.p280ss.android.common.applog.CustomChannelHandler.inst(r3)     // Catch:{ Exception -> 0x0146 }
            org.json.JSONObject r3 = r3.toJson()     // Catch:{ Exception -> 0x0146 }
            android.content.Context r4 = r0.mContext     // Catch:{ Exception -> 0x0146 }
            com.ss.android.common.applog.CustomChannelHandler r4 = com.p280ss.android.common.applog.CustomChannelHandler.inst(r4)     // Catch:{ Exception -> 0x0146 }
            r4.setIsSendingAppInfo(r12)     // Catch:{ Exception -> 0x0146 }
        L_0x013f:
            if (r3 == 0) goto L_0x0146
            java.lang.String r4 = "app_install_info"
            r6.put(r4, r3)     // Catch:{ Exception -> 0x0146 }
        L_0x0146:
            boolean r3 = mCollectFreeSpace     // Catch:{ Exception -> 0x016c }
            if (r3 == 0) goto L_0x0159
            com.ss.android.common.applog.AppLog$FreeSpaceCollector r3 = mFreeSpaceCollector     // Catch:{ Exception -> 0x016c }
            if (r3 == 0) goto L_0x0159
            org.json.JSONObject r3 = r3.getFreeSpace()     // Catch:{ Exception -> 0x016c }
            if (r3 == 0) goto L_0x0159
            java.lang.String r4 = "photoinfo"
            r6.put(r4, r3)     // Catch:{ Exception -> 0x016c }
        L_0x0159:
            java.lang.String r3 = r6.toString()     // Catch:{ Exception -> 0x016c }
            if (r21 == 0) goto L_0x0168
            com.ss.android.common.applog.AppLog$8 r4 = new com.ss.android.common.applog.AppLog$8     // Catch:{ Exception -> 0x016c }
            r4.<init>(r3, r2, r1)     // Catch:{ Exception -> 0x016c }
            r4.start()     // Catch:{ Exception -> 0x016c }
            goto L_0x016c
        L_0x0168:
            r0.updateConfig(r3, r2, r1)     // Catch:{ Exception -> 0x016c }
            return
        L_0x016c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.applog.AppLog.tryUpdateConfig(boolean, boolean, boolean):void");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0220 A[Catch:{ Throwable -> 0x0251 }] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00e8 A[Catch:{ Exception -> 0x00f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00f9 A[Catch:{ Exception -> 0x0104 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x010d A[Catch:{ Exception -> 0x0118 }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x012c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleConfigUpdate(org.json.JSONObject r20, boolean r21, boolean r22) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            long r2 = java.lang.System.currentTimeMillis()
            r1.mUpdateConfigTime = r2
            int r2 = r1.mVersionCode
            r1.mLastConfigVersion = r2
            r2 = 1000(0x3e8, double:4.94E-321)
            r4 = 0
            java.lang.String r6 = "server_time"
            long r6 = r0.optLong(r6)     // Catch:{ Exception -> 0x0040 }
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x0040
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ Exception -> 0x0040 }
            r8.<init>()     // Catch:{ Exception -> 0x0040 }
            java.lang.String r9 = "server_time"
            r8.put(r9, r6)     // Catch:{ Exception -> 0x0040 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0040 }
            long r6 = r6 / r2
            java.lang.String r9 = "local_time"
            r8.put(r9, r6)     // Catch:{ Exception -> 0x0040 }
            r1.mTimeSync = r8     // Catch:{ Exception -> 0x0040 }
            com.ss.android.common.applog.LogReaper r6 = r1.mLogReaper     // Catch:{ Exception -> 0x0040 }
            if (r6 == 0) goto L_0x0040
            com.ss.android.common.applog.LogReaper r6 = r1.mLogReaper     // Catch:{ Exception -> 0x0040 }
            org.json.JSONObject r7 = r1.mTimeSync     // Catch:{ Exception -> 0x0040 }
            r6.setTimeSync(r7)     // Catch:{ Exception -> 0x0040 }
        L_0x0040:
            java.lang.String r6 = "config"
            org.json.JSONObject r0 = r0.optJSONObject(r6)
            if (r0 != 0) goto L_0x004d
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
        L_0x004d:
            r6 = r0
            r7 = 0
            java.lang.String r0 = "allow_push_list"
            org.json.JSONArray r0 = r6.optJSONArray(r0)     // Catch:{ Exception -> 0x006a }
            if (r0 == 0) goto L_0x006a
            java.lang.Object r8 = sLock     // Catch:{ Exception -> 0x006a }
            monitor-enter(r8)     // Catch:{ Exception -> 0x006a }
            java.util.HashSet<java.lang.Integer> r9 = r1.mAllowPushSet     // Catch:{ all -> 0x0067 }
            r1.parseIntSet(r9, r0)     // Catch:{ all -> 0x0067 }
            monitor-exit(r8)     // Catch:{ all -> 0x0067 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x006a }
            r1.mAllowPushListJsonStr = r0     // Catch:{ Exception -> 0x006b }
            goto L_0x006b
        L_0x0067:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0067 }
            throw r0     // Catch:{ Exception -> 0x006a }
        L_0x006a:
            r0 = r7
        L_0x006b:
            java.lang.String r8 = "allow_old_image_sample"
            r9 = 0
            boolean r8 = optBoolean(r6, r8, r9)
            boolean r10 = r1.mAllowOldImageSample
            if (r8 == r10) goto L_0x007a
            r1.mAllowOldImageSample = r8
            r8 = 1
            goto L_0x007b
        L_0x007a:
            r8 = 0
        L_0x007b:
            java.lang.String r10 = "session_interval"
            long r12 = r6.optLong(r10, r4)
            r14 = 15
            int r10 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r10 < 0) goto L_0x0099
            r14 = 300(0x12c, double:1.48E-321)
            int r10 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r10 > 0) goto L_0x0099
            long r12 = r12 * r2
            long r14 = r1.mSessionInterval
            int r10 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r10 == 0) goto L_0x0099
            r1.mSessionInterval = r12
            r10 = 1
            goto L_0x009a
        L_0x0099:
            r10 = 0
        L_0x009a:
            java.lang.String r12 = "batch_event_interval"
            long r12 = r6.optLong(r12, r4)
            long r12 = r12 * r2
            long r2 = r1.mBatchEventInterval
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 == 0) goto L_0x00b4
            r1.mBatchEventInterval = r12
            com.ss.android.common.applog.LogReaper r2 = r1.mLogReaper
            if (r2 == 0) goto L_0x00b3
            com.ss.android.common.applog.LogReaper r2 = r1.mLogReaper
            r2.setBatchEventInterval(r12)
        L_0x00b3:
            r10 = 1
        L_0x00b4:
            java.lang.String r2 = "send_launch_timely"
            int r2 = r6.optInt(r2)
            int r3 = r1.mSendLaunchTimely
            if (r2 == r3) goto L_0x00cc
            r1.mSendLaunchTimely = r2
            com.ss.android.common.applog.LogReaper r2 = r1.mLogReaper
            if (r2 == 0) goto L_0x00cb
            com.ss.android.common.applog.LogReaper r2 = r1.mLogReaper
            int r3 = r1.mSendLaunchTimely
            r2.setSendLaunchTimely(r3)
        L_0x00cb:
            r10 = 1
        L_0x00cc:
            java.lang.String r2 = "image_sampling_ratio"
            org.json.JSONObject r2 = r6.optJSONObject(r2)     // Catch:{ Exception -> 0x00df }
            if (r2 == 0) goto L_0x00df
            boolean r3 = r1.parseImageSampleRatio(r2)     // Catch:{ Exception -> 0x00df }
            if (r3 == 0) goto L_0x00df
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00df }
            goto L_0x00e0
        L_0x00df:
            r2 = r7
        L_0x00e0:
            java.lang.String r3 = "image_error_report"
            org.json.JSONObject r3 = r6.optJSONObject(r3)     // Catch:{ Exception -> 0x00f0 }
            if (r3 == 0) goto L_0x00f0
            r1.parseImageErrorReport(r3)     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00f0 }
            goto L_0x00f1
        L_0x00f0:
            r3 = r7
        L_0x00f1:
            java.lang.String r12 = "image_error_codes"
            org.json.JSONArray r12 = r6.optJSONArray(r12)     // Catch:{ Exception -> 0x0104 }
            if (r12 == 0) goto L_0x0104
            java.util.HashSet r13 = r1.parseIntSet(r12)     // Catch:{ Exception -> 0x0104 }
            r1.mImageErrorCodes = r13     // Catch:{ Exception -> 0x0104 }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x0104 }
            goto L_0x0105
        L_0x0104:
            r12 = r7
        L_0x0105:
            java.lang.String r13 = "fingerprint_codes"
            org.json.JSONArray r13 = r6.optJSONArray(r13)     // Catch:{ Exception -> 0x0118 }
            if (r13 == 0) goto L_0x0118
            java.util.HashSet r14 = r1.parseIntSet(r13)     // Catch:{ Exception -> 0x0118 }
            r1.mFingerprintSet = r14     // Catch:{ Exception -> 0x0118 }
            java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x0118 }
            r7 = r13
        L_0x0118:
            r13 = r7
            if (r21 == 0) goto L_0x0123
            long r14 = java.lang.System.currentTimeMillis()
            r1.mSendFingerprintTime = r14
            r7 = 1
            goto L_0x0124
        L_0x0123:
            r7 = 0
        L_0x0124:
            java.lang.String r14 = "http_monitor_port"
            int r14 = r6.optInt(r14)
            if (r14 <= 0) goto L_0x0134
            int r15 = r1.mHttpMonitorPort
            if (r14 == r15) goto L_0x0134
            r1.mHttpMonitorPort = r14
            r14 = 1
            goto L_0x0135
        L_0x0134:
            r14 = 0
        L_0x0135:
            java.lang.String r15 = "switch_applog_https_to_http"
            int r15 = r6.optInt(r15, r9)
            int r4 = sAppLogHttpsToHttp
            if (r15 == r4) goto L_0x0143
            sAppLogHttpsToHttp = r15
            r4 = 1
            goto L_0x0144
        L_0x0143:
            r4 = 0
        L_0x0144:
            java.lang.String r5 = "use_new_encrypt"
            int r5 = r6.optInt(r5, r9)
            if (r5 == 0) goto L_0x014e
            r5 = 1
            goto L_0x014f
        L_0x014e:
            r5 = 0
        L_0x014f:
            boolean r15 = com.bytedance.frameworks.core.encrypt.TTEncryptUtils.f18651a
            if (r5 == r15) goto L_0x0157
            com.bytedance.frameworks.core.encrypt.TTEncryptUtils.f18651a = r5
            r5 = 1
            goto L_0x0158
        L_0x0157:
            r5 = 0
        L_0x0158:
            java.lang.String r15 = "forbid_report_phone_detail_info"
            r11 = -1
            int r11 = r6.optInt(r15, r11)
            android.content.Context r15 = r1.mContext
            r16 = r6
            java.lang.String r6 = com.p280ss.android.deviceregister.p289a.C6778a.m20960a()
            android.content.SharedPreferences r6 = com.p280ss.android.ugc.aweme.p340x.C7285c.m22838a(r15, r6, r9)
            android.content.SharedPreferences$Editor r6 = r6.edit()
            if (r11 < 0) goto L_0x0193
            java.lang.String r15 = "forbid_report_phone_detail_info"
            r6.putInt(r15, r11)
            if (r11 <= 0) goto L_0x017a
            r11 = 1
            goto L_0x017b
        L_0x017a:
            r11 = 0
        L_0x017b:
            r1.mForbidReportPhoneDetailInfo = r11
            boolean r11 = r1.mForbidReportPhoneDetailInfo
            com.p280ss.android.deviceregister.C6789d.m21079c(r11)
            org.json.JSONObject r11 = r1.mHeader
            com.p280ss.android.deviceregister.p289a.C6781d.m20975a(r11)
            r19.ensureHeaderCopy()
            com.ss.android.common.applog.LogReaper r11 = r1.mLogReaper
            if (r11 == 0) goto L_0x0193
            com.ss.android.common.applog.LogReaper r11 = r1.mLogReaper
            r11.filterHeader()
        L_0x0193:
            if (r10 == 0) goto L_0x01af
            java.lang.String r10 = "session_interval"
            r17 = r4
            r18 = r5
            long r4 = r1.mSessionInterval
            r6.putLong(r10, r4)
            java.lang.String r4 = "batch_event_interval"
            long r10 = r1.mBatchEventInterval
            r6.putLong(r4, r10)
            java.lang.String r4 = "send_launch_timely"
            int r5 = r1.mSendLaunchTimely
            r6.putInt(r4, r5)
            goto L_0x01b3
        L_0x01af:
            r17 = r4
            r18 = r5
        L_0x01b3:
            if (r2 == 0) goto L_0x01ba
            java.lang.String r4 = "image_sampling_ratio"
            r6.putString(r4, r2)
        L_0x01ba:
            if (r3 == 0) goto L_0x01c1
            java.lang.String r2 = "image_error_report"
            r6.putString(r2, r3)
        L_0x01c1:
            if (r12 == 0) goto L_0x01c8
            java.lang.String r2 = "image_error_codes"
            r6.putString(r2, r12)
        L_0x01c8:
            if (r13 == 0) goto L_0x01cf
            java.lang.String r2 = "fingerprint_codes"
            r6.putString(r2, r13)
        L_0x01cf:
            if (r0 == 0) goto L_0x01d6
            java.lang.String r2 = "allow_push_list"
            r6.putString(r2, r0)
        L_0x01d6:
            if (r8 == 0) goto L_0x01df
            java.lang.String r0 = "allow_old_image_sample"
            boolean r2 = r1.mAllowOldImageSample
            r6.putBoolean(r0, r2)
        L_0x01df:
            if (r7 == 0) goto L_0x01e8
            java.lang.String r0 = "send_fingerprint_time"
            long r2 = r1.mSendFingerprintTime
            r6.putLong(r0, r2)
        L_0x01e8:
            if (r14 == 0) goto L_0x01f1
            java.lang.String r0 = "http_monitor_port"
            int r2 = r1.mHttpMonitorPort
            r6.putInt(r0, r2)
        L_0x01f1:
            if (r17 == 0) goto L_0x01fa
            java.lang.String r0 = "switch_applog_https_to_http"
            int r2 = sAppLogHttpsToHttp
            r6.putInt(r0, r2)
        L_0x01fa:
            if (r18 == 0) goto L_0x0203
            java.lang.String r0 = "use_new_encrypt"
            boolean r2 = com.bytedance.frameworks.core.encrypt.TTEncryptUtils.f18651a
            r6.putBoolean(r0, r2)
        L_0x0203:
            java.lang.String r0 = "app_log_last_config_time"
            long r2 = r1.mUpdateConfigTime
            r6.putLong(r0, r2)
            java.lang.String r0 = "app_log_last_config_version"
            int r2 = r1.mLastConfigVersion
            r6.putInt(r0, r2)
            java.lang.String r0 = "real_time_events"
            r2 = r16
            org.json.JSONArray r0 = r2.optJSONArray(r0)     // Catch:{ Throwable -> 0x0251 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r3 = r1.mEventTimely     // Catch:{ Throwable -> 0x0251 }
            r3.clear()     // Catch:{ Throwable -> 0x0251 }
            if (r0 == 0) goto L_0x024b
            int r3 = r0.length()     // Catch:{ Throwable -> 0x0251 }
            if (r3 <= 0) goto L_0x024b
            int r3 = r0.length()     // Catch:{ Throwable -> 0x0251 }
            r4 = 0
        L_0x022b:
            if (r4 >= r3) goto L_0x0241
            java.lang.String r5 = r0.getString(r4)     // Catch:{ Throwable -> 0x0251 }
            boolean r7 = com.bytedance.common.utility.C6319n.m19593a(r5)     // Catch:{ Throwable -> 0x0251 }
            if (r7 != 0) goto L_0x023e
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r7 = r1.mEventTimely     // Catch:{ Throwable -> 0x0251 }
            java.lang.String r8 = "timely"
            r7.put(r5, r8)     // Catch:{ Throwable -> 0x0251 }
        L_0x023e:
            int r4 = r4 + 1
            goto L_0x022b
        L_0x0241:
            java.lang.String r3 = "real_time_events"
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x0251 }
            r6.putString(r3, r0)     // Catch:{ Throwable -> 0x0251 }
            goto L_0x0255
        L_0x024b:
            java.lang.String r0 = "real_time_events"
            r6.remove(r0)     // Catch:{ Throwable -> 0x0251 }
            goto L_0x0255
        L_0x0251:
            goto L_0x0255
        L_0x0253:
            r2 = r16
        L_0x0255:
            r6.commit()
            r1.handleConfigUpdate(r2)
            r19.notifyConfigUpdate()
            android.content.Context r0 = r1.mContext
            com.ss.android.common.applog.CustomChannelHandler r0 = com.p280ss.android.common.applog.CustomChannelHandler.inst(r0)
            boolean r0 = r0.isSendingAppInfo()
            if (r0 == 0) goto L_0x0281
            android.content.Context r0 = r1.mContext
            com.ss.android.common.applog.CustomChannelHandler r0 = com.p280ss.android.common.applog.CustomChannelHandler.inst(r0)
            boolean r0 = r0.hasSendAppInfo()
            if (r0 != 0) goto L_0x0281
            android.content.Context r0 = r1.mContext
            com.ss.android.common.applog.CustomChannelHandler r0 = com.p280ss.android.common.applog.CustomChannelHandler.inst(r0)
            r2 = 1
            r0.setHasSendAppInfo(r2)
            goto L_0x0282
        L_0x0281:
            r2 = 1
        L_0x0282:
            if (r22 == 0) goto L_0x029d
            boolean r0 = r1.mHasTryResendConfig
            if (r0 != 0) goto L_0x029d
            long r3 = r1.mSendFingerprintTime
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x029d
            r1.mHasTryResendConfig = r2
            java.util.HashSet<java.lang.Integer> r0 = r1.mFingerprintSet
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x029d
            r1.tryUpdateConfig(r2, r2, r9)
        L_0x029d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.applog.AppLog.handleConfigUpdate(org.json.JSONObject, boolean, boolean):void");
    }

    public static void setPushCustomValues(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        sMiPushInclude = z;
        sUmengPushInclude = z2;
        sHwPushInclude = z3;
        sMzPushInclude = z4;
        sAliyunPushInclude = z5;
    }

    public static void onImageSample(String str, long j, long j2, int i, String str2, Throwable th) {
        if (!sStopped) {
            AppLog appLog = sInstance;
            if (appLog != null) {
                appLog.onImageSample(System.currentTimeMillis(), str, j, j2, i, str2, th);
            }
        }
    }

    public static void onEvent(Context context, String str, String str2, String str3, long j, long j2) {
        onEvent(context, str, str2, str3, j, j2, false, null);
    }

    public void onDeviceRegisterEvent(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        onEvent(context, str, str2, str3, j, j2, false, jSONObject);
    }

    public static void onEvent(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        onEvent(context, str, str2, str3, j, j2, false, jSONObject);
    }

    public static void onEvent(Context context, String str, String str2, String str3, long j, long j2, boolean z) {
        onEvent(context, str, str2, str3, j, j2, z, null);
    }

    /* access modifiers changed from: 0000 */
    public void onEvent(String str, String str2, String str3, long j, long j2, boolean z, JSONObject jSONObject) {
        String str4;
        if (!this.mInitOk) {
            tryReportEventDiscard(3);
            return;
        }
        try {
            if (getLogRecoverySwitch()) {
                if ("event_v3".equalsIgnoreCase(str)) {
                    if (this.mBlackV3 != null && this.mBlackV3.size() > 0 && !C6319n.m19593a(str2) && this.mBlackV3.containsKey(str2)) {
                        tryReportEventDiscard(2);
                        return;
                    }
                } else if (this.mBlackV1 != null && this.mBlackV1.size() > 0) {
                    if (!C6319n.m19593a(str3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str2);
                        sb.append(str3);
                        str4 = sb.toString();
                    } else {
                        str4 = str2;
                    }
                    if (this.mBlackV1.containsKey(str4)) {
                        tryReportEventDiscard(2);
                        return;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        LogEvent logEvent = new LogEvent();
        logEvent.category = str;
        logEvent.tag = str2;
        logEvent.label = str3;
        logEvent.value = j;
        logEvent.ext_value = j2;
        NetworkType networkType = this.mNetWorkMonitor.f18541d;
        if (networkType != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                jSONObject.put("nt", networkType.getValue());
            } catch (Exception unused2) {
            }
        }
        logEvent.user_id = sUserId.get();
        if (jSONObject == null || !jSONObject.has("event_v3_reserved_field_time_stamp")) {
            logEvent.timestamp = System.currentTimeMillis();
        } else {
            try {
                logEvent.timestamp = jSONObject.getLong("event_v3_reserved_field_time_stamp");
            } catch (Throwable unused3) {
                logEvent.timestamp = System.currentTimeMillis();
            }
            jSONObject.remove("event_v3_reserved_field_time_stamp");
        }
        if (jSONObject != null) {
            logEvent.ext_json = jSONObject.toString();
        }
        logEvent.instant_only = z;
        logEvent.mHasTimelySend = false;
        if (C6312h.m19578b()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onEvent ");
            sb2.append(str);
            sb2.append(" ");
            sb2.append(str2);
            sb2.append(" ");
            sb2.append(str3);
            if (!(j == 0 && j2 == 0 && jSONObject == null)) {
                sb2.append(" ");
                sb2.append(j);
            }
            if (!(j2 == 0 && jSONObject == null)) {
                sb2.append(" ");
                sb2.append(j2);
            }
            if (jSONObject != null) {
                sb2.append(" ");
                sb2.append(jSONObject);
            }
        }
        try {
            if (C6772a.m20923a().f19271b) {
                JSONObject jSONObject2 = new JSONObject();
                if (jSONObject != null) {
                    Iterator keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String str5 = (String) keys.next();
                        jSONObject2.put(str5, jSONObject.get(str5));
                    }
                }
                jSONObject2.put("category", str);
                jSONObject2.put("tag", str2);
                if (!C6319n.m19593a(str3)) {
                    jSONObject2.put("label", str3);
                }
                if (j != 0) {
                    jSONObject2.put("value", j);
                }
                if (j2 != 0) {
                    jSONObject2.put("ext_value", j2);
                }
                C6772a.m20923a().mo16563a(jSONObject2);
            }
        } catch (Exception unused4) {
        }
        ActionQueueItem actionQueueItem = new ActionQueueItem(ActionQueueType.EVENT);
        actionQueueItem.obj = logEvent;
        enqueue(actionQueueItem);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x015d, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x015e, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x015f, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0160, code lost:
        r6 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0089, code lost:
        if (r0 <= 0) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008d, code lost:
        if (r0 >= 100) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008f, code lost:
        r14 = r1.mImageErrorCodes;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0091, code lost:
        if (r14 == null) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009b, code lost:
        if (r14.contains(java.lang.Integer.valueOf(r24)) == false) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x009d, code lost:
        r14 = r1.mImageErrorStatusMap;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009f, code lost:
        monitor-enter(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r15 = (com.p280ss.android.common.applog.AppLog.ImageErrorStatusItem) r1.mImageErrorStatusMap.get(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a8, code lost:
        if (r15 != null) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00aa, code lost:
        r15 = new com.p280ss.android.common.applog.AppLog.ImageErrorStatusItem(r4);
        r1.mImageErrorStatusMap.put(r4, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b6, code lost:
        if (r15.in_silent == false) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c2, code lost:
        if ((r11 - r15.timestamp) < ((long) r13.net_silent_period)) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00c4, code lost:
        r15.count = 0;
        r15.in_silent = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00cb, code lost:
        if (r15.in_silent != false) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00cd, code lost:
        r15.timestamp = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00d8, code lost:
        if ((r11 - r15.timestamp) <= ((long) r13.net_error_interval)) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00da, code lost:
        r15.count = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e4, code lost:
        if (r15.count >= Integer.MAX_VALUE) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00e6, code lost:
        r15.count++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00ef, code lost:
        if (r15.count < r13.net_report_count) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00f1, code lost:
        r15.in_silent = true;
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00f6, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00f7, code lost:
        monitor-exit(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00ff, code lost:
        if (r0 <= 300) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0101, code lost:
        r6 = r1.mImageHttpErrorStatusMap;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0103, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        r7 = (com.p280ss.android.common.applog.AppLog.ImageErrorStatusItem) r1.mImageHttpErrorStatusMap.get(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x010c, code lost:
        if (r7 != null) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x010e, code lost:
        r7 = new com.p280ss.android.common.applog.AppLog.ImageErrorStatusItem(r4);
        r1.mImageHttpErrorStatusMap.put(r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x011a, code lost:
        if (r7.in_silent == false) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0126, code lost:
        if ((r11 - r7.timestamp) < ((long) r13.srv_silent_period)) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0128, code lost:
        r7.count = 0;
        r7.in_silent = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x012f, code lost:
        if (r7.in_silent != false) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0131, code lost:
        r7.timestamp = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x013c, code lost:
        if ((r11 - r7.timestamp) <= ((long) r13.srv_error_interval)) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x013e, code lost:
        r7.count = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0148, code lost:
        if (r7.count >= Integer.MAX_VALUE) goto L_0x014f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x014a, code lost:
        r7.count++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0153, code lost:
        if (r7.count < r13.srv_report_count) goto L_0x015b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0155, code lost:
        r7.in_silent = true;
        r4 = true;
        r7 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x015b, code lost:
        r4 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01b8 A[Catch:{ Throwable -> 0x0255 }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01c3 A[SYNTHETIC, Splitter:B:122:0x01c3] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01e1 A[Catch:{ Throwable -> 0x0255 }] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01ef A[Catch:{ Throwable -> 0x0255 }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0201 A[Catch:{ Throwable -> 0x0255 }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0212 A[Catch:{ Throwable -> 0x0255 }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0217 A[Catch:{ Throwable -> 0x0255 }] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x021f A[Catch:{ Throwable -> 0x0255 }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x023f A[Catch:{ Throwable -> 0x0255 }] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x024a A[Catch:{ Throwable -> 0x0255 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0071 A[Catch:{ Throwable -> 0x0255 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onImageSample(long r17, java.lang.String r19, long r20, long r22, int r24, java.lang.String r25, java.lang.Throwable r26) {
        /*
            r16 = this;
            r1 = r16
            r0 = r24
            r3 = r26
            if (r19 == 0) goto L_0x0256
            int r4 = r19.length()
            if (r4 != 0) goto L_0x0010
            goto L_0x0256
        L_0x0010:
            java.net.URI r4 = java.net.URI.create(r19)     // Catch:{ Throwable -> 0x0255 }
            java.lang.String r4 = r4.getHost()     // Catch:{ Throwable -> 0x0255 }
            if (r4 == 0) goto L_0x0254
            int r5 = r4.length()     // Catch:{ Throwable -> 0x0255 }
            if (r5 != 0) goto L_0x0022
            goto L_0x0254
        L_0x0022:
            android.content.Context r5 = r1.mContext     // Catch:{ Throwable -> 0x0255 }
            com.bytedance.common.utility.NetworkUtils$NetworkType r5 = com.bytedance.common.utility.NetworkUtils.m19550d(r5)     // Catch:{ Throwable -> 0x0255 }
            r6 = 11
            if (r0 != r6) goto L_0x0031
            com.bytedance.common.utility.NetworkUtils$NetworkType r6 = com.bytedance.common.utility.NetworkUtils.NetworkType.NONE     // Catch:{ Throwable -> 0x0255 }
            if (r5 != r6) goto L_0x0031
            return
        L_0x0031:
            java.util.List<com.ss.android.common.applog.AppLog$SampleRatioItem> r6 = r1.mImageRatioList     // Catch:{ Throwable -> 0x0255 }
            if (r6 == 0) goto L_0x0054
            if (r5 == 0) goto L_0x0054
            com.bytedance.common.utility.NetworkUtils$NetworkType r8 = com.bytedance.common.utility.NetworkUtils.NetworkType.NONE     // Catch:{ Throwable -> 0x0255 }
            if (r5 == r8) goto L_0x0054
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Throwable -> 0x0255 }
        L_0x003f:
            boolean r8 = r6.hasNext()     // Catch:{ Throwable -> 0x0255 }
            if (r8 == 0) goto L_0x0054
            java.lang.Object r8 = r6.next()     // Catch:{ Throwable -> 0x0255 }
            com.ss.android.common.applog.AppLog$SampleRatioItem r8 = (com.p280ss.android.common.applog.AppLog.SampleRatioItem) r8     // Catch:{ Throwable -> 0x0255 }
            java.lang.String r9 = r8.pattern     // Catch:{ Throwable -> 0x0255 }
            boolean r9 = r9.equals(r4)     // Catch:{ Throwable -> 0x0255 }
            if (r9 == 0) goto L_0x003f
            goto L_0x0055
        L_0x0054:
            r8 = 0
        L_0x0055:
            if (r8 == 0) goto L_0x0065
            double r10 = r8.ratio     // Catch:{ Throwable -> 0x0255 }
            java.util.Random r8 = r1.mRandom     // Catch:{ Throwable -> 0x0255 }
            double r12 = r8.nextDouble()     // Catch:{ Throwable -> 0x0255 }
            int r8 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r8 > 0) goto L_0x0065
            r8 = 1
            goto L_0x0066
        L_0x0065:
            r8 = 0
        L_0x0066:
            java.util.List<com.ss.android.common.applog.AppLog$ImageErrorConfigItem> r10 = r1.mImageErrorList     // Catch:{ Throwable -> 0x0255 }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0255 }
            r13 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 / r13
            if (r10 == 0) goto L_0x0165
            java.util.Iterator r10 = r10.iterator()     // Catch:{ Throwable -> 0x0255 }
        L_0x0075:
            boolean r13 = r10.hasNext()     // Catch:{ Throwable -> 0x0255 }
            if (r13 == 0) goto L_0x0165
            java.lang.Object r13 = r10.next()     // Catch:{ Throwable -> 0x0255 }
            com.ss.android.common.applog.AppLog$ImageErrorConfigItem r13 = (com.p280ss.android.common.applog.AppLog.ImageErrorConfigItem) r13     // Catch:{ Throwable -> 0x0255 }
            java.lang.String r14 = r13.host     // Catch:{ Throwable -> 0x0255 }
            boolean r14 = r14.equals(r4)     // Catch:{ Throwable -> 0x0255 }
            if (r14 == 0) goto L_0x0075
            if (r0 <= 0) goto L_0x00fd
            r14 = 100
            if (r0 >= r14) goto L_0x00fd
            java.util.HashSet<java.lang.Integer> r14 = r1.mImageErrorCodes     // Catch:{ Throwable -> 0x0255 }
            if (r14 == 0) goto L_0x0165
            java.lang.Integer r15 = java.lang.Integer.valueOf(r24)     // Catch:{ Throwable -> 0x0255 }
            boolean r14 = r14.contains(r15)     // Catch:{ Throwable -> 0x0255 }
            if (r14 == 0) goto L_0x0165
            java.util.Map<java.lang.String, com.ss.android.common.applog.AppLog$ImageErrorStatusItem> r14 = r1.mImageErrorStatusMap     // Catch:{ Throwable -> 0x0255 }
            monitor-enter(r14)     // Catch:{ Throwable -> 0x0255 }
            java.util.Map<java.lang.String, com.ss.android.common.applog.AppLog$ImageErrorStatusItem> r15 = r1.mImageErrorStatusMap     // Catch:{ all -> 0x00fa }
            java.lang.Object r15 = r15.get(r4)     // Catch:{ all -> 0x00fa }
            com.ss.android.common.applog.AppLog$ImageErrorStatusItem r15 = (com.p280ss.android.common.applog.AppLog.ImageErrorStatusItem) r15     // Catch:{ all -> 0x00fa }
            if (r15 != 0) goto L_0x00b4
            com.ss.android.common.applog.AppLog$ImageErrorStatusItem r15 = new com.ss.android.common.applog.AppLog$ImageErrorStatusItem     // Catch:{ all -> 0x00fa }
            r15.<init>(r4)     // Catch:{ all -> 0x00fa }
            java.util.Map<java.lang.String, com.ss.android.common.applog.AppLog$ImageErrorStatusItem> r7 = r1.mImageErrorStatusMap     // Catch:{ all -> 0x00fa }
            r7.put(r4, r15)     // Catch:{ all -> 0x00fa }
        L_0x00b4:
            boolean r4 = r15.in_silent     // Catch:{ all -> 0x00fa }
            if (r4 == 0) goto L_0x00c9
            long r9 = r15.timestamp     // Catch:{ all -> 0x00fa }
            r4 = 0
            long r9 = r11 - r9
            int r4 = r13.net_silent_period     // Catch:{ all -> 0x00fa }
            long r6 = (long) r4     // Catch:{ all -> 0x00fa }
            int r4 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x00c9
            r4 = 0
            r15.count = r4     // Catch:{ all -> 0x00fa }
            r15.in_silent = r4     // Catch:{ all -> 0x00fa }
        L_0x00c9:
            boolean r4 = r15.in_silent     // Catch:{ all -> 0x00fa }
            if (r4 != 0) goto L_0x00f6
            r15.timestamp = r11     // Catch:{ all -> 0x00fa }
            long r6 = r15.timestamp     // Catch:{ all -> 0x00fa }
            r4 = 0
            long r11 = r11 - r6
            int r4 = r13.net_error_interval     // Catch:{ all -> 0x00fa }
            long r6 = (long) r4     // Catch:{ all -> 0x00fa }
            int r4 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x00de
            r4 = 1
            r15.count = r4     // Catch:{ all -> 0x00fa }
            goto L_0x00eb
        L_0x00de:
            r4 = 1
            int r6 = r15.count     // Catch:{ all -> 0x00fa }
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r6 >= r7) goto L_0x00eb
            int r6 = r15.count     // Catch:{ all -> 0x00fa }
            int r6 = r6 + r4
            r15.count = r6     // Catch:{ all -> 0x00fa }
        L_0x00eb:
            int r4 = r15.count     // Catch:{ all -> 0x00fa }
            int r6 = r13.net_report_count     // Catch:{ all -> 0x00fa }
            if (r4 < r6) goto L_0x00f6
            r4 = 1
            r15.in_silent = r4     // Catch:{ all -> 0x00fa }
            r6 = 1
            goto L_0x00f7
        L_0x00f6:
            r6 = 0
        L_0x00f7:
            monitor-exit(r14)     // Catch:{ all -> 0x00fa }
            goto L_0x0166
        L_0x00fa:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x00fa }
            throw r0     // Catch:{ Throwable -> 0x0255 }
        L_0x00fd:
            r6 = 300(0x12c, float:4.2E-43)
            if (r0 <= r6) goto L_0x0165
            java.util.Map<java.lang.String, com.ss.android.common.applog.AppLog$ImageErrorStatusItem> r6 = r1.mImageHttpErrorStatusMap     // Catch:{ Throwable -> 0x0255 }
            monitor-enter(r6)     // Catch:{ Throwable -> 0x0255 }
            java.util.Map<java.lang.String, com.ss.android.common.applog.AppLog$ImageErrorStatusItem> r7 = r1.mImageHttpErrorStatusMap     // Catch:{ all -> 0x0162 }
            java.lang.Object r7 = r7.get(r4)     // Catch:{ all -> 0x0162 }
            com.ss.android.common.applog.AppLog$ImageErrorStatusItem r7 = (com.p280ss.android.common.applog.AppLog.ImageErrorStatusItem) r7     // Catch:{ all -> 0x0162 }
            if (r7 != 0) goto L_0x0118
            com.ss.android.common.applog.AppLog$ImageErrorStatusItem r7 = new com.ss.android.common.applog.AppLog$ImageErrorStatusItem     // Catch:{ all -> 0x0162 }
            r7.<init>(r4)     // Catch:{ all -> 0x0162 }
            java.util.Map<java.lang.String, com.ss.android.common.applog.AppLog$ImageErrorStatusItem> r9 = r1.mImageHttpErrorStatusMap     // Catch:{ all -> 0x0162 }
            r9.put(r4, r7)     // Catch:{ all -> 0x0162 }
        L_0x0118:
            boolean r4 = r7.in_silent     // Catch:{ all -> 0x0162 }
            if (r4 == 0) goto L_0x012d
            long r9 = r7.timestamp     // Catch:{ all -> 0x0162 }
            r4 = 0
            long r9 = r11 - r9
            int r4 = r13.srv_silent_period     // Catch:{ all -> 0x0162 }
            long r14 = (long) r4     // Catch:{ all -> 0x0162 }
            int r4 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r4 < 0) goto L_0x012d
            r4 = 0
            r7.count = r4     // Catch:{ all -> 0x0162 }
            r7.in_silent = r4     // Catch:{ all -> 0x0162 }
        L_0x012d:
            boolean r4 = r7.in_silent     // Catch:{ all -> 0x0162 }
            if (r4 != 0) goto L_0x015d
            r7.timestamp = r11     // Catch:{ all -> 0x0162 }
            long r9 = r7.timestamp     // Catch:{ all -> 0x0162 }
            r4 = 0
            long r11 = r11 - r9
            int r4 = r13.srv_error_interval     // Catch:{ all -> 0x0162 }
            long r9 = (long) r4     // Catch:{ all -> 0x0162 }
            int r4 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r4 <= 0) goto L_0x0142
            r4 = 1
            r7.count = r4     // Catch:{ all -> 0x0162 }
            goto L_0x014f
        L_0x0142:
            r4 = 1
            int r9 = r7.count     // Catch:{ all -> 0x0162 }
            r10 = 2147483647(0x7fffffff, float:NaN)
            if (r9 >= r10) goto L_0x014f
            int r9 = r7.count     // Catch:{ all -> 0x0162 }
            int r9 = r9 + r4
            r7.count = r9     // Catch:{ all -> 0x0162 }
        L_0x014f:
            int r4 = r7.count     // Catch:{ all -> 0x0162 }
            int r9 = r13.srv_report_count     // Catch:{ all -> 0x0162 }
            if (r4 < r9) goto L_0x015b
            r4 = 1
            r7.in_silent = r4     // Catch:{ all -> 0x0162 }
            r4 = 1
            r7 = 1
            goto L_0x015f
        L_0x015b:
            r4 = 1
            goto L_0x015e
        L_0x015d:
            r4 = 0
        L_0x015e:
            r7 = 0
        L_0x015f:
            monitor-exit(r6)     // Catch:{ all -> 0x0162 }
            r6 = r4
            goto L_0x0167
        L_0x0162:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0162 }
            throw r0     // Catch:{ Throwable -> 0x0255 }
        L_0x0165:
            r6 = 0
        L_0x0166:
            r7 = 0
        L_0x0167:
            if (r8 != 0) goto L_0x016c
            if (r6 != 0) goto L_0x016c
            return
        L_0x016c:
            if (r5 == 0) goto L_0x0173
            com.bytedance.common.utility.NetworkUtils$NetworkType r4 = com.bytedance.common.utility.NetworkUtils.NetworkType.NONE     // Catch:{ Throwable -> 0x0255 }
            if (r5 != r4) goto L_0x0173
            return
        L_0x0173:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0255 }
            r4.<init>()     // Catch:{ Throwable -> 0x0255 }
            r9 = r17
            r4.append(r9)     // Catch:{ Throwable -> 0x0255 }
            java.lang.String r9 = "|"
            r4.append(r9)     // Catch:{ Throwable -> 0x0255 }
            java.lang.String r2 = escape4ImageStats(r19)     // Catch:{ Throwable -> 0x0255 }
            r4.append(r2)     // Catch:{ Throwable -> 0x0255 }
            java.lang.String r2 = "|"
            r4.append(r2)     // Catch:{ Throwable -> 0x0255 }
            r9 = r22
            r4.append(r9)     // Catch:{ Throwable -> 0x0255 }
            java.lang.String r2 = "|"
            r4.append(r2)     // Catch:{ Throwable -> 0x0255 }
            r9 = r20
            r4.append(r9)     // Catch:{ Throwable -> 0x0255 }
            java.lang.String r2 = "|"
            r4.append(r2)     // Catch:{ Throwable -> 0x0255 }
            r4.append(r0)     // Catch:{ Throwable -> 0x0255 }
            java.lang.String r2 = "|"
            r4.append(r2)     // Catch:{ Throwable -> 0x0255 }
            int r2 = r5.getValue()     // Catch:{ Throwable -> 0x0255 }
            r4.append(r2)     // Catch:{ Throwable -> 0x0255 }
            java.lang.String r2 = "|"
            r4.append(r2)     // Catch:{ Throwable -> 0x0255 }
            if (r25 == 0) goto L_0x01bf
            java.lang.String r2 = escape4ImageStats(r25)     // Catch:{ Throwable -> 0x0255 }
            r4.append(r2)     // Catch:{ Throwable -> 0x0255 }
        L_0x01bf:
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 == r2) goto L_0x0201
            android.content.Context r2 = r1.mContext     // Catch:{ Throwable -> 0x01d8 }
            java.lang.String r5 = "phone"
            java.lang.Object r2 = r2.getSystemService(r5)     // Catch:{ Throwable -> 0x01d8 }
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2     // Catch:{ Throwable -> 0x01d8 }
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2     // Catch:{ Throwable -> 0x01d8 }
            java.lang.String r5 = r2.getNetworkOperatorName()     // Catch:{ Throwable -> 0x01d8 }
            java.lang.String r2 = r2.getNetworkOperator()     // Catch:{ Throwable -> 0x01d9 }
            goto L_0x01da
        L_0x01d8:
            r5 = 0
        L_0x01d9:
            r2 = 0
        L_0x01da:
            java.lang.String r9 = "^"
            r4.append(r9)     // Catch:{ Throwable -> 0x0255 }
            if (r5 == 0) goto L_0x01e8
            java.lang.String r5 = escape4ImageStats(r5)     // Catch:{ Throwable -> 0x0255 }
            r4.append(r5)     // Catch:{ Throwable -> 0x0255 }
        L_0x01e8:
            java.lang.String r5 = "^"
            r4.append(r5)     // Catch:{ Throwable -> 0x0255 }
            if (r2 == 0) goto L_0x01f6
            java.lang.String r2 = escape4ImageStats(r2)     // Catch:{ Throwable -> 0x0255 }
            r4.append(r2)     // Catch:{ Throwable -> 0x0255 }
        L_0x01f6:
            java.lang.String r2 = "^0"
            r4.append(r2)     // Catch:{ Throwable -> 0x0255 }
            java.lang.String r2 = "^0"
            r4.append(r2)     // Catch:{ Throwable -> 0x0255 }
            goto L_0x0206
        L_0x0201:
            java.lang.String r2 = "^^^^"
            r4.append(r2)     // Catch:{ Throwable -> 0x0255 }
        L_0x0206:
            java.lang.String r2 = "^o1^"
            r4.append(r2)     // Catch:{ Throwable -> 0x0255 }
            r4.append(r7)     // Catch:{ Throwable -> 0x0255 }
            com.ss.android.common.applog.AppLog r2 = sInstance     // Catch:{ Throwable -> 0x0255 }
            if (r2 == 0) goto L_0x0217
            java.lang.String r7 = com.p280ss.android.deviceregister.C6789d.m21080d()     // Catch:{ Throwable -> 0x0255 }
            goto L_0x0218
        L_0x0217:
            r7 = 0
        L_0x0218:
            java.lang.String r2 = "^"
            r4.append(r2)     // Catch:{ Throwable -> 0x0255 }
            if (r7 == 0) goto L_0x0222
            r4.append(r7)     // Catch:{ Throwable -> 0x0255 }
        L_0x0222:
            if (r6 == 0) goto L_0x0239
            r2 = 4
            if (r0 != r2) goto L_0x0239
            if (r3 == 0) goto L_0x0239
            java.lang.String r2 = "^"
            r4.append(r2)     // Catch:{ Throwable -> 0x0255 }
            java.lang.Class r2 = r26.getClass()     // Catch:{ Throwable -> 0x0255 }
            java.lang.String r2 = r2.getSimpleName()     // Catch:{ Throwable -> 0x0255 }
            r4.append(r2)     // Catch:{ Throwable -> 0x0255 }
        L_0x0239:
            java.lang.String r2 = r4.toString()     // Catch:{ Throwable -> 0x0255 }
            if (r8 == 0) goto L_0x0248
            com.ss.android.common.applog.AppLog$ImageStatsThread r4 = new com.ss.android.common.applog.AppLog$ImageStatsThread     // Catch:{ Throwable -> 0x0255 }
            r5 = 1
            r4.<init>(r0, r2, r5, r3)     // Catch:{ Throwable -> 0x0255 }
            r4.start()     // Catch:{ Throwable -> 0x0255 }
        L_0x0248:
            if (r6 == 0) goto L_0x0253
            com.ss.android.common.applog.AppLog$ImageStatsThread r4 = new com.ss.android.common.applog.AppLog$ImageStatsThread     // Catch:{ Throwable -> 0x0255 }
            r5 = 0
            r4.<init>(r0, r2, r5, r3)     // Catch:{ Throwable -> 0x0255 }
            r4.start()     // Catch:{ Throwable -> 0x0255 }
        L_0x0253:
            return
        L_0x0254:
            return
        L_0x0255:
            return
        L_0x0256:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.applog.AppLog.onImageSample(long, java.lang.String, long, long, int, java.lang.String, java.lang.Throwable):void");
    }

    public static void onEvent$___twin___(Context context, String str, String str2, String str3, long j, long j2, boolean z, JSONObject jSONObject) {
        appendParamsToEvent(jSONObject);
        AppLog appLog = sInstance;
        if (appLog == null) {
            AppLogCache.getCacheInstance().cacheEvent(str, str2, str3, j, j2, z, jSONObject);
        } else if (C6319n.m19593a(str) || C6319n.m19593a(str2)) {
            tryReportEventDiscard(0);
        } else {
            if (appLog != null) {
                appLog.onEvent(str, str2, str3, j, j2, z, jSONObject);
            }
        }
    }
}
