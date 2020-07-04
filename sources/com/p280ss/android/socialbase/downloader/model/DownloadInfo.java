package com.p280ss.android.socialbase.downloader.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.p280ss.android.socialbase.downloader.constants.AsyncHandleStatus;
import com.p280ss.android.socialbase.downloader.constants.ByteInvalidRetryStatus;
import com.p280ss.android.socialbase.downloader.constants.C20195c;
import com.p280ss.android.socialbase.downloader.constants.EnqueueType;
import com.p280ss.android.socialbase.downloader.constants.Md5CheckStatus;
import com.p280ss.android.socialbase.downloader.constants.RetryDelayStatus;
import com.p280ss.android.socialbase.downloader.depend.C20207aa;
import com.p280ss.android.socialbase.downloader.downloader.C20269b;
import com.p280ss.android.socialbase.downloader.downloader.C20285j;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.p904b.C20190a;
import com.p280ss.android.socialbase.downloader.utils.C20359e;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.socialbase.downloader.model.DownloadInfo */
public class DownloadInfo implements Parcelable {
    public static final Creator<DownloadInfo> CREATOR = new Creator<DownloadInfo>() {
        /* renamed from: a */
        private static DownloadInfo[] m67412a(int i) {
            return new DownloadInfo[i];
        }

        /* renamed from: a */
        private static DownloadInfo m67411a(Parcel parcel) {
            return new DownloadInfo(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m67411a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m67412a(i);
        }
    };
    private boolean addListenerToSameTask;
    private AsyncHandleStatus asyncHandleStatus;
    private boolean autoResumed;
    private int backUpUrlRetryCount;
    private boolean backUpUrlUsed;
    private List<String> backUpUrls;
    private String backUpUrlsStr;
    private int bindValueCount;
    private ByteInvalidRetryStatus byteInvalidRetryStatus;
    private int chunkCount;
    private boolean chunkDowngradeRetryUsed;
    private int curBackUpUrlIndex;
    private AtomicLong curBytes;
    private int curRetryTime;
    private JSONObject dbJsonData;
    private String dbJsonDataString;
    private long downloadTime;
    private String eTag;
    private EnqueueType enqueueType;
    private StringBuffer errorBytesLog;
    private String extra;
    private List<HttpHeader> extraHeaders;
    private BaseException failedException;
    private List<String> forbiddenBackupUrls;
    private boolean force;
    private boolean forceIgnoreRecommendSize;
    private boolean headConnectionAvailable;
    private String headConnectionException;
    private int httpStatusCode;
    private String httpStatusMessage;
    private boolean httpsToHttpRetryUsed;

    /* renamed from: id */
    private int f54941id;
    private boolean ignoreDataVerify;
    private boolean isFirstDownload;
    private boolean isFirstSuccess;
    private boolean isForbiddenRetryed;
    private volatile boolean isSaveTempFile;
    private AtomicLong lastNotifyProgressTime;
    private int maxBytes;
    private int maxProgressCount;
    private String md5;
    private String mimeType;
    private int minProgressTimeMsInterval;
    private String name;
    private boolean needChunkDowngradeRetry;
    private boolean needDefaultHttpServiceBackUp;
    private boolean needHttpsToHttpRetry;
    private boolean needIndependentProcess;
    private boolean needPostProgress;
    private boolean needRetryDelay;
    private boolean needReuseChunkRunnable;
    private boolean needReuseFirstConnection;
    private String networkQuality;
    private boolean newSaveTempFileEnable;
    private int notificationVisibility;
    private boolean onlyWifi;
    private String[] outIp;
    private int[] outSize;
    private String packageName;
    private long realDownloadTime;
    private long realStartDownloadTime;
    private int retryCount;
    private RetryDelayStatus retryDelayStatus;
    private String retryDelayTimeArray;
    private int retryScheduleMinutes;
    private String savePath;
    private boolean showNotification;
    private boolean showNotificationForAutoResumed;
    private boolean showNotificationForNetworkResumed;
    private JSONObject spData;
    private long startDownloadTime;
    private AtomicInteger status;
    private volatile List<C20207aa> tempFileSaveCompleteCallbacks;
    private String tempPath;
    private String title;
    private long totalBytes;
    private String url;

    /* renamed from: com.ss.android.socialbase.downloader.model.DownloadInfo$a */
    public static class C20335a {

        /* renamed from: A */
        public String f54942A;

        /* renamed from: B */
        public boolean f54943B;

        /* renamed from: C */
        public String f54944C;

        /* renamed from: D */
        public boolean f54945D;

        /* renamed from: E */
        public boolean f54946E;

        /* renamed from: F */
        public EnqueueType f54947F = EnqueueType.ENQUEUE_NONE;

        /* renamed from: G */
        public boolean f54948G;

        /* renamed from: H */
        public boolean f54949H;

        /* renamed from: I */
        public boolean f54950I;

        /* renamed from: J */
        public int f54951J;

        /* renamed from: K */
        public boolean f54952K = true;

        /* renamed from: L */
        public boolean f54953L;

        /* renamed from: a */
        public String f54954a;

        /* renamed from: b */
        public String f54955b;

        /* renamed from: c */
        public String f54956c;

        /* renamed from: d */
        public String f54957d;

        /* renamed from: e */
        public String f54958e;

        /* renamed from: f */
        public boolean f54959f;

        /* renamed from: g */
        public String f54960g;

        /* renamed from: h */
        public List<HttpHeader> f54961h;

        /* renamed from: i */
        public int f54962i;

        /* renamed from: j */
        public String[] f54963j;

        /* renamed from: k */
        public int[] f54964k;

        /* renamed from: l */
        public int f54965l;

        /* renamed from: m */
        public int f54966m;

        /* renamed from: n */
        public boolean f54967n;

        /* renamed from: o */
        public boolean f54968o = true;

        /* renamed from: p */
        public int f54969p;

        /* renamed from: q */
        public int f54970q;

        /* renamed from: r */
        public List<String> f54971r;

        /* renamed from: s */
        public boolean f54972s;

        /* renamed from: t */
        public String f54973t;

        /* renamed from: u */
        public boolean f54974u;

        /* renamed from: v */
        public boolean f54975v;

        /* renamed from: w */
        public boolean f54976w;

        /* renamed from: x */
        public boolean f54977x;

        /* renamed from: y */
        public boolean f54978y;

        /* renamed from: z */
        public String f54979z;

        public C20335a() {
        }

        /* renamed from: a */
        public final DownloadInfo mo54758a() {
            return new DownloadInfo(this);
        }

        /* renamed from: a */
        public final C20335a mo54751a(int i) {
            this.f54962i = i;
            return this;
        }

        /* renamed from: b */
        public final C20335a mo54759b(int i) {
            this.f54965l = i;
            return this;
        }

        /* renamed from: c */
        public final C20335a mo54763c(int i) {
            this.f54966m = i;
            return this;
        }

        /* renamed from: d */
        public final C20335a mo54766d(int i) {
            this.f54969p = i;
            return this;
        }

        /* renamed from: e */
        public final C20335a mo54769e(int i) {
            this.f54970q = i;
            return this;
        }

        /* renamed from: f */
        public final C20335a mo54772f(int i) {
            this.f54951J = i;
            return this;
        }

        /* renamed from: g */
        public final C20335a mo54775g(String str) {
            this.f54973t = str;
            return this;
        }

        /* renamed from: h */
        public final C20335a mo54777h(String str) {
            this.f54979z = str;
            return this;
        }

        /* renamed from: i */
        public final C20335a mo54779i(String str) {
            this.f54942A = str;
            return this;
        }

        /* renamed from: j */
        public final C20335a mo54781j(String str) {
            this.f54944C = str;
            return this;
        }

        /* renamed from: k */
        public final C20335a mo54783k(boolean z) {
            this.f54945D = z;
            return this;
        }

        /* renamed from: l */
        public final C20335a mo54784l(boolean z) {
            this.f54946E = z;
            return this;
        }

        /* renamed from: m */
        public final C20335a mo54785m(boolean z) {
            this.f54948G = z;
            return this;
        }

        /* renamed from: n */
        public final C20335a mo54786n(boolean z) {
            this.f54949H = z;
            return this;
        }

        /* renamed from: o */
        public final C20335a mo54787o(boolean z) {
            this.f54950I = z;
            return this;
        }

        /* renamed from: p */
        public final C20335a mo54788p(boolean z) {
            this.f54952K = z;
            return this;
        }

        /* renamed from: q */
        public final C20335a mo54789q(boolean z) {
            this.f54953L = z;
            return this;
        }

        /* renamed from: a */
        public final C20335a mo54752a(EnqueueType enqueueType) {
            this.f54947F = enqueueType;
            return this;
        }

        /* renamed from: b */
        public final C20335a mo54760b(String str) {
            this.f54955b = str;
            return this;
        }

        /* renamed from: c */
        public final C20335a mo54764c(String str) {
            this.f54956c = str;
            return this;
        }

        /* renamed from: d */
        public final C20335a mo54767d(String str) {
            this.f54957d = str;
            return this;
        }

        /* renamed from: e */
        public final C20335a mo54770e(String str) {
            this.f54958e = str;
            return this;
        }

        /* renamed from: f */
        public final C20335a mo54773f(String str) {
            this.f54960g = str;
            return this;
        }

        /* renamed from: g */
        public final C20335a mo54776g(boolean z) {
            this.f54976w = z;
            return this;
        }

        /* renamed from: h */
        public final C20335a mo54778h(boolean z) {
            this.f54977x = z;
            return this;
        }

        /* renamed from: i */
        public final C20335a mo54780i(boolean z) {
            this.f54978y = z;
            return this;
        }

        /* renamed from: j */
        public final C20335a mo54782j(boolean z) {
            this.f54943B = z;
            return this;
        }

        /* renamed from: a */
        public final C20335a mo54753a(String str) {
            this.f54954a = str;
            return this;
        }

        /* renamed from: b */
        public final C20335a mo54761b(List<String> list) {
            this.f54971r = list;
            return this;
        }

        /* renamed from: c */
        public final C20335a mo54765c(boolean z) {
            this.f54968o = z;
            return this;
        }

        /* renamed from: d */
        public final C20335a mo54768d(boolean z) {
            this.f54974u = z;
            return this;
        }

        /* renamed from: e */
        public final C20335a mo54771e(boolean z) {
            this.f54972s = z;
            return this;
        }

        /* renamed from: f */
        public final C20335a mo54774f(boolean z) {
            this.f54975v = z;
            return this;
        }

        public C20335a(String str) {
            this.f54956c = str;
        }

        /* renamed from: a */
        public final C20335a mo54754a(List<HttpHeader> list) {
            this.f54961h = list;
            return this;
        }

        /* renamed from: b */
        public final C20335a mo54762b(boolean z) {
            this.f54967n = z;
            return this;
        }

        /* renamed from: a */
        public final C20335a mo54755a(boolean z) {
            this.f54959f = z;
            return this;
        }

        /* renamed from: a */
        public final C20335a mo54756a(int[] iArr) {
            this.f54964k = iArr;
            return this;
        }

        /* renamed from: a */
        public final C20335a mo54757a(String[] strArr) {
            this.f54963j = strArr;
            return this;
        }
    }

    public int describeContents() {
        return 0;
    }

    public AsyncHandleStatus getAsyncHandleStatus() {
        return this.asyncHandleStatus;
    }

    public int getBackUpUrlRetryCount() {
        return this.backUpUrlRetryCount;
    }

    public List<String> getBackUpUrls() {
        return this.backUpUrls;
    }

    public int getBindValueCount() {
        return this.bindValueCount;
    }

    public ByteInvalidRetryStatus getByteInvalidRetryStatus() {
        return this.byteInvalidRetryStatus;
    }

    public int getChunkCount() {
        return this.chunkCount;
    }

    public int getCurBackUpUrlIndex() {
        return this.curBackUpUrlIndex;
    }

    public int getCurRetryTime() {
        return this.curRetryTime;
    }

    public long getDownloadTime() {
        return this.downloadTime;
    }

    public EnqueueType getEnqueueType() {
        return this.enqueueType;
    }

    public String getExtra() {
        return this.extra;
    }

    public List<HttpHeader> getExtraHeaders() {
        return this.extraHeaders;
    }

    public BaseException getFailedException() {
        return this.failedException;
    }

    public List<String> getForbiddenBackupUrls() {
        return this.forbiddenBackupUrls;
    }

    public String getHeadConnectionException() {
        return this.headConnectionException;
    }

    public int getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public String getHttpStatusMessage() {
        return this.httpStatusMessage;
    }

    public boolean getIsFirstDownload() {
        return this.isFirstDownload;
    }

    public int getMaxBytes() {
        return this.maxBytes;
    }

    public int getMaxProgressCount() {
        return this.maxProgressCount;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public String getName() {
        return this.name;
    }

    public String getNetworkQuality() {
        return this.networkQuality;
    }

    public int getNotificationVisibility() {
        return this.notificationVisibility;
    }

    public String[] getOutIp() {
        return this.outIp;
    }

    public int[] getOutSize() {
        return this.outSize;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public long getRealDownloadTime() {
        return this.realDownloadTime;
    }

    public int getRetryCount() {
        return this.retryCount;
    }

    public RetryDelayStatus getRetryDelayStatus() {
        return this.retryDelayStatus;
    }

    public String getRetryDelayTimeArray() {
        return this.retryDelayTimeArray;
    }

    public int getRetryScheduleMinutes() {
        return this.retryScheduleMinutes;
    }

    public String getSavePath() {
        return this.savePath;
    }

    public long getTotalBytes() {
        return this.totalBytes;
    }

    public String getUrl() {
        return this.url;
    }

    public String geteTag() {
        return this.eTag;
    }

    public boolean isAddListenerToSameTask() {
        return this.addListenerToSameTask;
    }

    public boolean isAutoResumed() {
        return this.autoResumed;
    }

    public boolean isBackUpUrlUsed() {
        return this.backUpUrlUsed;
    }

    public boolean isChunkDowngradeRetryUsed() {
        return this.chunkDowngradeRetryUsed;
    }

    public boolean isFirstSuccess() {
        return this.isFirstSuccess;
    }

    public boolean isForbiddenRetryed() {
        return this.isForbiddenRetryed;
    }

    public boolean isForce() {
        return this.force;
    }

    public boolean isForceIgnoreRecommendSize() {
        return this.forceIgnoreRecommendSize;
    }

    public boolean isHeadConnectionAvailable() {
        return this.headConnectionAvailable;
    }

    public boolean isHttpsToHttpRetryUsed() {
        return this.httpsToHttpRetryUsed;
    }

    public boolean isIgnoreDataVerify() {
        return this.ignoreDataVerify;
    }

    public boolean isNeedChunkDowngradeRetry() {
        return this.needChunkDowngradeRetry;
    }

    public boolean isNeedDefaultHttpServiceBackUp() {
        return this.needDefaultHttpServiceBackUp;
    }

    public boolean isNeedHttpsToHttpRetry() {
        return this.needHttpsToHttpRetry;
    }

    public boolean isNeedIndependentProcess() {
        return this.needIndependentProcess;
    }

    public boolean isNeedPostProgress() {
        return this.needPostProgress;
    }

    public boolean isNeedRetryDelay() {
        return this.needRetryDelay;
    }

    public boolean isNeedReuseChunkRunnable() {
        return this.needReuseChunkRunnable;
    }

    public boolean isNeedReuseFirstConnection() {
        return this.needReuseFirstConnection;
    }

    public boolean isNewSaveTempFileEnable() {
        return this.newSaveTempFileEnable;
    }

    public boolean isOnlyWifi() {
        return this.onlyWifi;
    }

    public boolean isShowNotification() {
        return this.showNotification;
    }

    public boolean isShowNotificationForAutoResumed() {
        return this.showNotificationForAutoResumed;
    }

    public boolean isShowNotificationForNetworkResumed() {
        return this.showNotificationForNetworkResumed;
    }

    public void setForbiddenRetryed() {
        this.isForbiddenRetryed = true;
    }

    public String getTempName() {
        return C20359e.m67573b(this.name);
    }

    public boolean isChunked() {
        return C20359e.m67560a(this.totalBytes);
    }

    public boolean isDownloaded() {
        return C20359e.m67581b(this);
    }

    public synchronized boolean isSaveTempFile() {
        return this.isSaveTempFile;
    }

    public void resetRealStartDownloadTime() {
        this.realStartDownloadTime = 0;
    }

    public Md5CheckStatus checkMd5Valid() {
        return C20359e.m67572b(getSavePath(), getName(), this.md5);
    }

    public long getCurBytes() {
        if (this.curBytes != null) {
            return this.curBytes.get();
        }
        return 0;
    }

    public int getFailedResumeCount() {
        ensureSpData();
        return this.spData.optInt("failed_resume_count", 0);
    }

    public int getFailedResumeMaxCount() {
        ensureSpData();
        return this.spData.optInt("failed_resume_max_count", -1);
    }

    public long getFailedResumeMaxInterval() {
        ensureSpData();
        return this.spData.optLong("failed_resume_max_time_interval", 259200000);
    }

    public long getFailedResumeMinInterval() {
        ensureSpData();
        return this.spData.optLong("failed_resume_min_interval", -1);
    }

    public int getId() {
        if (this.f54941id == 0) {
            this.f54941id = C20269b.m66719a(this);
        }
        return this.f54941id;
    }

    public long getLastDownloadTime() {
        ensureDBJsonData();
        return this.dbJsonData.optLong("dbjson_last_start_download_time", 0);
    }

    public long getLastFailedResumeTime() {
        ensureSpData();
        return this.spData.optLong("last_failed_resume_time", 0);
    }

    public long getLastUninstallResumeTime() {
        ensureSpData();
        return this.spData.optLong("last_uninstall_resume_time", 0);
    }

    public int getMinProgressTimeMsInterval() {
        int i = this.minProgressTimeMsInterval;
        if (i < 1000) {
            return 1000;
        }
        return i;
    }

    public int getRealStatus() {
        if (this.status != null) {
            return this.status.get();
        }
        return 0;
    }

    public String getTargetFilePath() {
        return C20359e.m67574b(this.savePath, this.name);
    }

    public String getTempFilePath() {
        return C20359e.m67543a(this.savePath, this.tempPath, this.name);
    }

    public String getTempPath() {
        return C20359e.m67589c(this.savePath, this.tempPath);
    }

    public String getTitle() {
        if (TextUtils.isEmpty(this.title)) {
            return this.name;
        }
        return this.title;
    }

    public int getUninstallResumeCount() {
        ensureSpData();
        return this.spData.optInt("uninstall_resume_count", 0);
    }

    public int getUninstallResumeMaxCount() {
        ensureSpData();
        return this.spData.optInt("uninstall_resume_max_count", -1);
    }

    public long getUninstallResumeMaxTimeInterval() {
        ensureSpData();
        return this.spData.optLong("uninstall_resume_max_time_interval", 259200000);
    }

    public long getUninstallResumeMinInterval() {
        ensureSpData();
        return this.spData.optLong("uninstall_resume_min_interval", -1);
    }

    public boolean isBreakpointAvailable() {
        if (!isFileDataValid()) {
            return false;
        }
        return isChunkBreakpointAvailable();
    }

    public boolean isDownloadOverStatus() {
        return C20195c.m66505a(getStatus());
    }

    public boolean isDownloadingStatus() {
        return C20195c.m66506b(getStatus());
    }

    public boolean isFailedResumeNeedWaitWifi() {
        ensureSpData();
        return this.spData.optBoolean("failed_resume_need_wait_wifi", false);
    }

    public boolean isFailedResumeNeedWifi() {
        ensureSpData();
        return this.spData.optBoolean("failed_resume_need_wifi", true);
    }

    public boolean isNewTask() {
        if (getStatus() == 0) {
            return true;
        }
        return false;
    }

    public void setLastNotifyProgressTime() {
        this.lastNotifyProgressTime.set(SystemClock.uptimeMillis());
    }

    public void updateRealStartDownloadTime() {
        if (this.realStartDownloadTime == 0) {
            this.realStartDownloadTime = SystemClock.uptimeMillis();
        }
    }

    public void updateStartDownloadTime() {
        this.startDownloadTime = SystemClock.uptimeMillis();
        putAuxiliaryJSONObjectField("dbjson_last_start_download_time", System.currentTimeMillis());
    }

    private void ensureDBJsonData() {
        if (this.dbJsonData == null) {
            try {
                this.dbJsonData = new JSONObject(this.dbJsonDataString);
            } catch (Exception unused) {
                this.dbJsonData = new JSONObject();
            }
        }
    }

    public boolean canNotifyProgress() {
        long j = this.lastNotifyProgressTime.get();
        if (j == 0 || SystemClock.uptimeMillis() - j > 20) {
            return true;
        }
        return false;
    }

    public boolean canReStartAsyncTask() {
        if (getStatus() == -3 || this.asyncHandleStatus != AsyncHandleStatus.ASYNC_HANDLE_WAITING) {
            return false;
        }
        return true;
    }

    public boolean canReplaceHttpForRetry() {
        if (TextUtils.isEmpty(this.url) || !this.url.startsWith(WebKitApi.SCHEME_HTTPS) || !this.needHttpsToHttpRetry || this.httpsToHttpRetryUsed) {
            return false;
        }
        return true;
    }

    public boolean canShowNotification() {
        if ((this.autoResumed || !this.showNotification) && (!this.autoResumed || (!this.showNotificationForAutoResumed && !this.showNotificationForNetworkResumed))) {
            return false;
        }
        return true;
    }

    public boolean canStartRetryDelayTask() {
        if (!this.needRetryDelay || getStatus() == -3 || this.retryDelayStatus != RetryDelayStatus.DELAY_RETRY_WAITING) {
            return false;
        }
        return true;
    }

    public int getCurRetryTimeInTotal() {
        int i = this.curRetryTime;
        if (!this.backUpUrlUsed) {
            return i;
        }
        int i2 = i + this.retryCount;
        if (this.curBackUpUrlIndex > 0) {
            return i2 + (this.curBackUpUrlIndex * this.backUpUrlRetryCount);
        }
        return i2;
    }

    public String getErrorBytesLog() {
        if (this.errorBytesLog == null || this.errorBytesLog.length() == 0) {
            return "";
        }
        return this.errorBytesLog.toString();
    }

    public int getStatus() {
        if (this.status == null) {
            return 0;
        }
        int i = this.status.get();
        if (i == -5) {
            i = -2;
        }
        return i;
    }

    public int getTotalRetryCount() {
        int i = this.retryCount;
        if (this.backUpUrls == null || this.backUpUrls.isEmpty()) {
            return i;
        }
        return i + (this.backUpUrlRetryCount * this.backUpUrls.size());
    }

    public boolean isDownloadWithWifiValid() {
        if (!isOnlyWifi() || C20359e.m67562a(C20269b.m66765x())) {
            return true;
        }
        return false;
    }

    public boolean isEntityInvalid() {
        if (TextUtils.isEmpty(this.url) || TextUtils.isEmpty(this.name) || TextUtils.isEmpty(this.savePath)) {
            return true;
        }
        return false;
    }

    public boolean isWaitingWifiStatus() {
        if (this.failedException == null || this.failedException.getErrorCode() != 1013) {
            return false;
        }
        return true;
    }

    public void reset() {
        setCurBytes(0, true);
        this.totalBytes = 0;
        this.chunkCount = 1;
        this.downloadTime = 0;
        this.realStartDownloadTime = 0;
        this.realDownloadTime = 0;
    }

    public void updateDownloadTime() {
        if (this.startDownloadTime != 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - this.startDownloadTime;
            if (this.downloadTime < 0) {
                this.downloadTime = 0;
            }
            if (uptimeMillis > 0) {
                this.downloadTime = uptimeMillis;
            }
        }
    }

    public DownloadInfo() {
        this.retryDelayStatus = RetryDelayStatus.DELAY_RETRY_NONE;
        this.asyncHandleStatus = AsyncHandleStatus.ASYNC_HANDLE_NONE;
        this.chunkCount = 1;
        this.isFirstDownload = true;
        this.isFirstSuccess = true;
        this.byteInvalidRetryStatus = ByteInvalidRetryStatus.BYTE_INVALID_RETRY_STATUS_NONE;
        this.enqueueType = EnqueueType.ENQUEUE_NONE;
        this.lastNotifyProgressTime = new AtomicLong(0);
        this.newSaveTempFileEnable = true;
    }

    private void ensureSpData() {
        if (this.spData == null) {
            Context x = C20269b.m66765x();
            if (x != null) {
                String string = C7285c.m22838a(x, "sp_download_info", 0).getString(Long.toString((long) getId()), "");
                if (!TextUtils.isEmpty(string)) {
                    try {
                        this.spData = new JSONObject(string);
                    } catch (JSONException unused) {
                    }
                }
            }
            if (this.spData == null) {
                this.spData = new JSONObject();
            }
        }
    }

    public boolean canSkipStatusHandler() {
        int status2 = getStatus();
        if (status2 == 7 || this.retryDelayStatus == RetryDelayStatus.DELAY_RETRY_WAITING || status2 == 8 || this.asyncHandleStatus == AsyncHandleStatus.ASYNC_HANDLE_WAITING || this.asyncHandleStatus == AsyncHandleStatus.ASYNC_HANDLE_RESTART || this.byteInvalidRetryStatus == ByteInvalidRetryStatus.BYTE_INVALID_RETRY_STATUS_RESTART) {
            return true;
        }
        return false;
    }

    public void changeSkipStatus() {
        int status2 = getStatus();
        if (status2 == 7 || this.retryDelayStatus == RetryDelayStatus.DELAY_RETRY_WAITING) {
            setRetryDelayStatus(RetryDelayStatus.DELAY_RETRY_DOWNLOADING);
        }
        if (status2 == 8 || this.asyncHandleStatus == AsyncHandleStatus.ASYNC_HANDLE_WAITING || this.asyncHandleStatus == AsyncHandleStatus.ASYNC_HANDLE_RESTART) {
            setAsyncHandleStatus(AsyncHandleStatus.ASYNC_HANDLE_DOWNLOADING);
        }
        if (this.byteInvalidRetryStatus == ByteInvalidRetryStatus.BYTE_INVALID_RETRY_STATUS_RESTART) {
            setByteInvalidRetryStatus(ByteInvalidRetryStatus.BYTE_INVALID_RETRY_STATUS_DOWNLOADING);
        }
    }

    public void clearSpData() {
        Context x = C20269b.m66765x();
        if (x != null) {
            try {
                C7285c.m22838a(x, "sp_download_info", 0).edit().remove(Integer.toString(getId())).apply();
            } catch (Throwable unused) {
            }
        }
    }

    public String getBackUpUrl() {
        String str = "";
        if (!this.backUpUrlUsed || this.backUpUrls == null || this.backUpUrls.size() <= 0 || this.curBackUpUrlIndex < 0 || this.curBackUpUrlIndex >= this.backUpUrls.size()) {
            return str;
        }
        String str2 = (String) this.backUpUrls.get(this.curBackUpUrlIndex);
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        return str;
    }

    public int getDownloadProcess() {
        if (this.totalBytes <= 0) {
            return 0;
        }
        if (getCurBytes() > this.totalBytes) {
            return 100;
        }
        return (int) ((getCurBytes() * 100) / this.totalBytes);
    }

    public boolean hasNextBackupUrl() {
        if (this.backUpUrls == null || this.backUpUrls.size() <= 0 || (this.backUpUrlUsed && (this.curBackUpUrlIndex < 0 || this.curBackUpUrlIndex >= this.backUpUrls.size() - 1))) {
            return false;
        }
        return true;
    }

    public boolean isCanResumeFromBreakPointStatus() {
        int status2 = getStatus();
        if (status2 == 4 || status2 == 3 || status2 == -1 || status2 == 5 || status2 == 8 || ((status2 == 1 || status2 == 2) && getCurBytes() > 0)) {
            return true;
        }
        return false;
    }

    public boolean isFileDataExists() {
        if (isEntityInvalid()) {
            return false;
        }
        File file = new File(getTempPath(), getTempName());
        boolean exists = file.exists();
        boolean isDirectory = file.isDirectory();
        if (!exists || isDirectory) {
            return false;
        }
        return true;
    }

    public boolean isFirstDownload() {
        if (this.isFirstDownload && !TextUtils.isEmpty(getTempPath()) && !TextUtils.isEmpty(getTempName()) && !new File(getTempPath(), getTempName()).exists()) {
            return true;
        }
        return false;
    }

    public void updateSpData() {
        if (this.spData != null) {
            Context x = C20269b.m66765x();
            if (x != null) {
                C7285c.m22838a(x, "sp_download_info", 0).edit().putString(Integer.toString(getId()), this.spData.toString()).apply();
            }
        }
    }

    private String getBackUpUrlsStr() {
        if (this.backUpUrlsStr == null && this.backUpUrls != null && !this.backUpUrls.isEmpty()) {
            try {
                JSONArray jSONArray = new JSONArray();
                for (String str : this.backUpUrls) {
                    if (!TextUtils.isEmpty(str)) {
                        jSONArray.put(str);
                    }
                }
                this.backUpUrlsStr = jSONArray.toString();
            } catch (Exception unused) {
            }
        }
        if (this.backUpUrlsStr == null) {
            this.backUpUrlsStr = "";
        }
        return this.backUpUrlsStr;
    }

    public String getConnectionUrl() {
        String str = this.url;
        if (getStatus() == 8 && this.forbiddenBackupUrls != null && !this.forbiddenBackupUrls.isEmpty() && !this.backUpUrlUsed) {
            return (String) this.forbiddenBackupUrls.get(0);
        }
        if (this.backUpUrlUsed && this.backUpUrls != null && this.backUpUrls.size() > 0 && this.curBackUpUrlIndex >= 0 && this.curBackUpUrlIndex < this.backUpUrls.size()) {
            String str2 = (String) this.backUpUrls.get(this.curBackUpUrlIndex);
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
            return str;
        } else if (TextUtils.isEmpty(this.url) || !this.url.startsWith(WebKitApi.SCHEME_HTTPS) || !this.needHttpsToHttpRetry || !this.httpsToHttpRetryUsed) {
            return str;
        } else {
            return this.url.replaceFirst(WebKitApi.SCHEME_HTTPS, WebKitApi.SCHEME_HTTP);
        }
    }

    public boolean isChunkBreakpointAvailable() {
        if (this.chunkCount > 1) {
            C20285j m = C20269b.m66754m();
            if (m != null) {
                List<DownloadChunk> c = m.mo54060c(getId());
                if (c == null || c.size() != this.chunkCount) {
                    return false;
                }
                long j = 0;
                for (DownloadChunk downloadChunk : c) {
                    if (downloadChunk != null) {
                        j += downloadChunk.mo54554l();
                    }
                }
                if (j != getCurBytes()) {
                    setCurBytes(j);
                }
            }
        }
        return true;
    }

    public boolean isFileDataValid() {
        if (isEntityInvalid()) {
            return false;
        }
        File file = new File(getTempPath(), getTempName());
        boolean exists = file.exists();
        boolean isDirectory = file.isDirectory();
        if (!exists || isDirectory) {
            return false;
        }
        long length = file.length();
        long curBytes2 = getCurBytes();
        if (length <= 0 || curBytes2 <= 0 || this.totalBytes <= 0 || this.chunkCount <= 0 || length < curBytes2 || length > this.totalBytes || curBytes2 >= this.totalBytes) {
            return false;
        }
        return true;
    }

    public boolean trySwitchToNextBackupUrl() {
        if (this.backUpUrlUsed) {
            this.curBackUpUrlIndex++;
        }
        if (this.backUpUrls == null || this.backUpUrls.size() == 0 || this.curBackUpUrlIndex < 0) {
            return false;
        }
        while (this.curBackUpUrlIndex < this.backUpUrls.size()) {
            if (!TextUtils.isEmpty((String) this.backUpUrls.get(this.curBackUpUrlIndex))) {
                this.backUpUrlUsed = true;
                return true;
            }
            this.curBackUpUrlIndex++;
        }
        return false;
    }

    public ContentValues toContentValues() {
        String str;
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", Integer.valueOf(this.f54941id));
        contentValues.put("url", this.url);
        contentValues.put("savePath", this.savePath);
        contentValues.put("tempPath", this.tempPath);
        contentValues.put("name", this.name);
        contentValues.put("chunkCount", Integer.valueOf(this.chunkCount));
        contentValues.put("status", Integer.valueOf(getStatus()));
        contentValues.put("curBytes", Long.valueOf(getCurBytes()));
        contentValues.put("totalBytes", Long.valueOf(this.totalBytes));
        contentValues.put("eTag", this.eTag);
        contentValues.put("onlyWifi", Integer.valueOf(this.onlyWifi ? 1 : 0));
        contentValues.put("force", Integer.valueOf(this.force ? 1 : 0));
        contentValues.put("retryCount", Integer.valueOf(this.retryCount));
        contentValues.put("extra", this.extra);
        contentValues.put("mimeType", this.mimeType);
        contentValues.put("title", this.title);
        contentValues.put("notificationEnable", Integer.valueOf(this.showNotification ? 1 : 0));
        contentValues.put("notificationVisibility", Integer.valueOf(this.notificationVisibility));
        contentValues.put("isFirstDownload", Integer.valueOf(this.isFirstDownload ? 1 : 0));
        contentValues.put("isFirstSuccess", Integer.valueOf(this.isFirstSuccess ? 1 : 0));
        contentValues.put("needHttpsToHttpRetry", Integer.valueOf(this.needHttpsToHttpRetry ? 1 : 0));
        contentValues.put("downloadTime", Long.valueOf(this.downloadTime));
        contentValues.put("packageName", this.packageName);
        contentValues.put("md5", this.md5);
        contentValues.put("retryDelay", Integer.valueOf(this.needRetryDelay ? 1 : 0));
        contentValues.put("curRetryTime", Integer.valueOf(this.curRetryTime));
        contentValues.put("retryDelayStatus", Integer.valueOf(this.retryDelayStatus.ordinal()));
        contentValues.put("defaultHttpServiceBackUp", Integer.valueOf(this.needDefaultHttpServiceBackUp ? 1 : 0));
        contentValues.put("chunkRunnableReuse", Integer.valueOf(this.needReuseChunkRunnable ? 1 : 0));
        contentValues.put("retryDelayTimeArray", this.retryDelayTimeArray);
        contentValues.put("chunkDowngradeRetry", Integer.valueOf(this.needChunkDowngradeRetry ? 1 : 0));
        contentValues.put("backUpUrlsStr", getBackUpUrlsStr());
        contentValues.put("backUpUrlRetryCount", Integer.valueOf(this.backUpUrlRetryCount));
        contentValues.put("realDownloadTime", Long.valueOf(this.realDownloadTime));
        contentValues.put("retryScheduleMinutes", Integer.valueOf(this.retryScheduleMinutes));
        contentValues.put("independentProcess", Integer.valueOf(this.needIndependentProcess ? 1 : 0));
        String str2 = "auxiliaryJsonobjectString";
        if (this.dbJsonData == null) {
            str = this.dbJsonDataString;
        } else {
            str = this.dbJsonData.toString();
        }
        contentValues.put(str2, str);
        return contentValues;
    }

    public void setAsyncHandleStatus(AsyncHandleStatus asyncHandleStatus2) {
        this.asyncHandleStatus = asyncHandleStatus2;
    }

    public void setAutoResumed(boolean z) {
        this.autoResumed = z;
    }

    public void setByteInvalidRetryStatus(ByteInvalidRetryStatus byteInvalidRetryStatus2) {
        this.byteInvalidRetryStatus = byteInvalidRetryStatus2;
    }

    public void setChunkCount(int i) {
        this.chunkCount = i;
    }

    public void setChunkDowngradeRetryUsed(boolean z) {
        this.chunkDowngradeRetryUsed = z;
    }

    public void setFailedException(BaseException baseException) {
        this.failedException = baseException;
    }

    public void setFirstDownload(boolean z) {
        this.isFirstDownload = z;
    }

    public void setFirstSuccess(boolean z) {
        this.isFirstSuccess = z;
    }

    public void setForceIgnoreRecommendSize(boolean z) {
        this.forceIgnoreRecommendSize = z;
    }

    public void setHeadConnectionException(String str) {
        this.headConnectionException = str;
    }

    public void setHttpStatusCode(int i) {
        this.httpStatusCode = i;
    }

    public void setHttpStatusMessage(String str) {
        this.httpStatusMessage = str;
    }

    public void setHttpsToHttpRetryUsed(boolean z) {
        this.httpsToHttpRetryUsed = z;
    }

    public void setId(int i) {
        this.f54941id = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNetworkQuality(String str) {
        this.networkQuality = str;
    }

    public void setNotificationVisibility(int i) {
        this.notificationVisibility = i;
    }

    public void setOnlyWifi(boolean z) {
        this.onlyWifi = z;
    }

    public void setRetryDelayStatus(RetryDelayStatus retryDelayStatus2) {
        this.retryDelayStatus = retryDelayStatus2;
    }

    public void setRetryScheduleMinutes(int i) {
        this.retryScheduleMinutes = i;
    }

    public void setShowNotification(boolean z) {
        this.showNotification = z;
    }

    public void setShowNotificationForAutoResumed(boolean z) {
        this.showNotificationForAutoResumed = z;
    }

    public void setShowNotificationForNetworkResumed(boolean z) {
        this.showNotificationForNetworkResumed = z;
    }

    public void setTotalBytes(long j) {
        this.totalBytes = j;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void seteTag(String str) {
        this.eTag = str;
    }

    public void increaseCurBytes(long j) {
        this.curBytes.addAndGet(j);
    }

    public synchronized void setIsSaveTempFile(boolean z) {
        this.isSaveTempFile = z;
    }

    public void setDownloadTime(long j) {
        if (j >= 0) {
            this.downloadTime = j;
        }
    }

    public void setFailedResumeCount(int i) {
        ensureSpData();
        try {
            this.spData.put("failed_resume_count", i);
        } catch (Exception unused) {
        }
    }

    public void setFailedResumeMaxCount(int i) {
        ensureSpData();
        try {
            this.spData.put("failed_resume_max_count", i);
        } catch (Exception unused) {
        }
    }

    public void setFailedResumeMaxInterval(long j) {
        ensureSpData();
        try {
            this.spData.put("failed_resume_max_time_interval", j);
        } catch (Exception unused) {
        }
    }

    public void setFailedResumeMinInterval(long j) {
        ensureSpData();
        try {
            this.spData.put("failed_resume_min_interval", j);
        } catch (Exception unused) {
        }
    }

    public void setFailedResumeNeedWaitWifi(boolean z) {
        ensureSpData();
        try {
            this.spData.put("failed_resume_need_wait_wifi", z);
        } catch (Exception unused) {
        }
    }

    public void setFailedResumeNeedWifi(boolean z) {
        ensureSpData();
        try {
            this.spData.put("failed_resume_need_wifi", z);
        } catch (Exception unused) {
        }
    }

    public void setLastFailedResumeTime(long j) {
        ensureSpData();
        try {
            this.spData.put("last_failed_resume_time", j);
        } catch (Exception unused) {
        }
    }

    public void setLastUninstallResumeTime(long j) {
        ensureSpData();
        try {
            this.spData.put("last_uninstall_resume_time", j);
        } catch (Exception unused) {
        }
    }

    public void setUninstallResumeCount(int i) {
        ensureSpData();
        try {
            this.spData.put("uninstall_resume_count", i);
        } catch (Exception unused) {
        }
    }

    public void setUninstallResumeMaxCount(int i) {
        ensureSpData();
        try {
            this.spData.put("uninstall_resume_max_count", i);
        } catch (Exception unused) {
        }
    }

    public void setUninstallResumeMaxTimeInterval(long j) {
        ensureSpData();
        try {
            this.spData.put("uninstall_resume_max_time_interval", j);
        } catch (Exception unused) {
        }
    }

    public void setUninstallResumeMinInterval(long j) {
        ensureSpData();
        try {
            this.spData.put("uninstall_resume_min_interval", j);
        } catch (Exception unused) {
        }
    }

    private void convertEnqueueType(int i) {
        if (i == EnqueueType.ENQUEUE_HEAD.ordinal()) {
            this.enqueueType = EnqueueType.ENQUEUE_HEAD;
        } else if (i == EnqueueType.ENQUEUE_TAIL.ordinal()) {
            this.enqueueType = EnqueueType.ENQUEUE_TAIL;
        } else {
            this.enqueueType = EnqueueType.ENQUEUE_NONE;
        }
    }

    public long getMinByteIntervalForPostToMainThread(long j) {
        int i = this.maxProgressCount;
        if (i <= 0) {
            i = 100;
        }
        long j2 = j / ((long) (i + 1));
        if (j2 <= 0) {
            return 1048576;
        }
        return j2;
    }

    public void resetDataForEtagEndure(String str) {
        setCurBytes(0, true);
        setTotalBytes(0);
        seteTag(str);
        setChunkCount(1);
        this.downloadTime = 0;
        this.realStartDownloadTime = 0;
        this.realDownloadTime = 0;
    }

    public void setCurBytes(long j) {
        if (this.curBytes != null) {
            this.curBytes.set(j);
        } else {
            this.curBytes = new AtomicLong(j);
        }
    }

    public void setStatus(int i) {
        if (this.status != null) {
            this.status.set(i);
        } else {
            this.status = new AtomicInteger(i);
        }
    }

    public void updateCurRetryTime(int i) {
        int i2;
        if (this.backUpUrlUsed) {
            i2 = this.backUpUrlRetryCount;
        } else {
            i2 = this.retryCount;
        }
        this.curRetryTime = i2 - i;
        if (this.curRetryTime < 0) {
            this.curRetryTime = 0;
        }
    }

    private void convertRetryDelayStatus(int i) {
        if (i == RetryDelayStatus.DELAY_RETRY_WAITING.ordinal()) {
            this.retryDelayStatus = RetryDelayStatus.DELAY_RETRY_WAITING;
        } else if (i == RetryDelayStatus.DELAY_RETRY_DOWNLOADING.ordinal()) {
            this.retryDelayStatus = RetryDelayStatus.DELAY_RETRY_DOWNLOADING;
        } else if (i == RetryDelayStatus.DELAY_RETRY_DOWNLOADED.ordinal()) {
            this.retryDelayStatus = RetryDelayStatus.DELAY_RETRY_DOWNLOADED;
        } else {
            this.retryDelayStatus = RetryDelayStatus.DELAY_RETRY_NONE;
        }
    }

    private void mergeAuxiliaryJSONObject(JSONObject jSONObject) {
        if (jSONObject != null) {
            ensureDBJsonData();
            try {
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str = (String) keys.next();
                    Object opt = jSONObject.opt(str);
                    if (!this.dbJsonData.has(str) && opt != null) {
                        this.dbJsonData.put(str, opt);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=boolean, code=int, for r3v0, types: [int, boolean] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void refreshBackupUrls(int r3) {
        /*
            r2 = this;
            java.util.List<java.lang.String> r0 = r2.forbiddenBackupUrls
            if (r0 == 0) goto L_0x0038
            java.util.List<java.lang.String> r0 = r2.forbiddenBackupUrls
            int r0 = r0.size()
            if (r0 <= r3) goto L_0x0038
            java.util.List<java.lang.String> r0 = r2.backUpUrls
            if (r0 != 0) goto L_0x0018
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.backUpUrls = r0
            goto L_0x001d
        L_0x0018:
            java.util.List<java.lang.String> r0 = r2.backUpUrls
            r0.clear()
        L_0x001d:
            r0 = 0
            r2.backUpUrlUsed = r0
            r2.curBackUpUrlIndex = r0
        L_0x0022:
            java.util.List<java.lang.String> r0 = r2.forbiddenBackupUrls
            int r0 = r0.size()
            if (r3 >= r0) goto L_0x0038
            java.util.List<java.lang.String> r0 = r2.backUpUrls
            java.util.List<java.lang.String> r1 = r2.forbiddenBackupUrls
            java.lang.Object r1 = r1.get(r3)
            r0.add(r1)
            int r3 = r3 + 1
            goto L_0x0022
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.model.DownloadInfo.refreshBackupUrls(boolean):void");
    }

    private void setBackUpUrlsStr(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.backUpUrlsStr = str;
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        String optString = jSONArray.optString(i);
                        if (!TextUtils.isEmpty(optString)) {
                            arrayList.add(optString);
                        }
                    }
                    this.backUpUrls = arrayList;
                }
            } catch (Exception unused) {
            }
        }
    }

    public boolean equalsTask(DownloadInfo downloadInfo) {
        if (downloadInfo == null || this.url == null || !this.url.equals(downloadInfo.getUrl()) || this.savePath == null || !this.savePath.equals(downloadInfo.getSavePath())) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void registerTempFileSaveCallback(com.p280ss.android.socialbase.downloader.depend.C20207aa r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r5 != 0) goto L_0x0005
            monitor-exit(r4)
            return
        L_0x0005:
            java.util.List<com.ss.android.socialbase.downloader.depend.aa> r0 = r4.tempFileSaveCompleteCallbacks     // Catch:{ Throwable -> 0x0021 }
            if (r0 != 0) goto L_0x0010
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Throwable -> 0x0021 }
            r0.<init>()     // Catch:{ Throwable -> 0x0021 }
            r4.tempFileSaveCompleteCallbacks = r0     // Catch:{ Throwable -> 0x0021 }
        L_0x0010:
            java.util.List<com.ss.android.socialbase.downloader.depend.aa> r0 = r4.tempFileSaveCompleteCallbacks     // Catch:{ Throwable -> 0x0021 }
            boolean r0 = r0.contains(r5)     // Catch:{ Throwable -> 0x0021 }
            if (r0 != 0) goto L_0x001d
            java.util.List<com.ss.android.socialbase.downloader.depend.aa> r0 = r4.tempFileSaveCompleteCallbacks     // Catch:{ Throwable -> 0x0021 }
            r0.add(r5)     // Catch:{ Throwable -> 0x0021 }
        L_0x001d:
            monitor-exit(r4)
            return
        L_0x001f:
            r5 = move-exception
            goto L_0x0034
        L_0x0021:
            r0 = move-exception
            com.ss.android.socialbase.downloader.exception.BaseException r1 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ all -> 0x001f }
            r2 = 1038(0x40e, float:1.455E-42)
            java.lang.String r3 = "registerTempFileSaveCallback"
            java.lang.String r0 = com.p280ss.android.socialbase.downloader.utils.C20359e.m67575b(r0, r3)     // Catch:{ all -> 0x001f }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x001f }
            r5.mo54130a(r1)     // Catch:{ all -> 0x001f }
            monitor-exit(r4)
            return
        L_0x0034:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.model.DownloadInfo.registerTempFileSaveCallback(com.ss.android.socialbase.downloader.depend.aa):void");
    }

    public void updateRealDownloadTime(boolean z) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.realStartDownloadTime <= 0) {
            if (z) {
                this.realStartDownloadTime = uptimeMillis;
            }
            return;
        }
        long j = uptimeMillis - this.realStartDownloadTime;
        if (z) {
            this.realStartDownloadTime = uptimeMillis;
        } else {
            this.realStartDownloadTime = 0;
        }
        if (j > 0) {
            if (this.realDownloadTime < 0) {
                this.realDownloadTime = 0;
            }
            this.realDownloadTime += j;
        }
    }

    protected DownloadInfo(Parcel parcel) {
        this.retryDelayStatus = RetryDelayStatus.DELAY_RETRY_NONE;
        this.asyncHandleStatus = AsyncHandleStatus.ASYNC_HANDLE_NONE;
        this.chunkCount = 1;
        this.isFirstDownload = true;
        this.isFirstSuccess = true;
        this.byteInvalidRetryStatus = ByteInvalidRetryStatus.BYTE_INVALID_RETRY_STATUS_NONE;
        this.enqueueType = EnqueueType.ENQUEUE_NONE;
        this.lastNotifyProgressTime = new AtomicLong(0);
        this.newSaveTempFileEnable = true;
        readFromParcel(parcel);
    }

    private DownloadInfo(C20335a aVar) {
        this.retryDelayStatus = RetryDelayStatus.DELAY_RETRY_NONE;
        this.asyncHandleStatus = AsyncHandleStatus.ASYNC_HANDLE_NONE;
        this.chunkCount = 1;
        this.isFirstDownload = true;
        this.isFirstSuccess = true;
        this.byteInvalidRetryStatus = ByteInvalidRetryStatus.BYTE_INVALID_RETRY_STATUS_NONE;
        this.enqueueType = EnqueueType.ENQUEUE_NONE;
        this.lastNotifyProgressTime = new AtomicLong(0);
        this.newSaveTempFileEnable = true;
        if (aVar != null) {
            this.name = aVar.f54954a;
            this.title = aVar.f54955b;
            this.url = aVar.f54956c;
            this.savePath = aVar.f54957d;
            this.tempPath = aVar.f54958e;
            this.status = new AtomicInteger(0);
            this.curBytes = new AtomicLong(0);
            this.extra = aVar.f54960g;
            this.onlyWifi = aVar.f54959f;
            this.extraHeaders = aVar.f54961h;
            this.maxBytes = aVar.f54962i;
            this.retryCount = aVar.f54965l;
            this.backUpUrlRetryCount = aVar.f54966m;
            this.force = aVar.f54967n;
            this.outIp = aVar.f54963j;
            this.outSize = aVar.f54964k;
            this.needPostProgress = aVar.f54968o;
            this.maxProgressCount = aVar.f54969p;
            this.minProgressTimeMsInterval = aVar.f54970q;
            this.backUpUrls = aVar.f54971r;
            this.showNotification = aVar.f54972s;
            this.mimeType = aVar.f54973t;
            this.needHttpsToHttpRetry = aVar.f54974u;
            this.needRetryDelay = aVar.f54943B;
            this.retryDelayTimeArray = aVar.f54944C;
            this.autoResumed = aVar.f54975v;
            this.showNotificationForAutoResumed = aVar.f54976w;
            this.needDefaultHttpServiceBackUp = aVar.f54977x;
            this.needReuseChunkRunnable = aVar.f54978y;
            this.packageName = aVar.f54979z;
            this.md5 = aVar.f54942A;
            this.needReuseFirstConnection = aVar.f54945D;
            this.needIndependentProcess = aVar.f54946E;
            this.enqueueType = aVar.f54947F;
            this.headConnectionAvailable = aVar.f54948G;
            this.ignoreDataVerify = aVar.f54949H;
            this.newSaveTempFileEnable = aVar.f54952K;
            this.addListenerToSameTask = aVar.f54953L;
            this.needChunkDowngradeRetry = aVar.f54950I;
            this.retryScheduleMinutes = aVar.f54951J;
        }
    }

    public DownloadInfo(Cursor cursor) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        this.retryDelayStatus = RetryDelayStatus.DELAY_RETRY_NONE;
        this.asyncHandleStatus = AsyncHandleStatus.ASYNC_HANDLE_NONE;
        boolean z11 = true;
        this.chunkCount = 1;
        this.isFirstDownload = true;
        this.isFirstSuccess = true;
        this.byteInvalidRetryStatus = ByteInvalidRetryStatus.BYTE_INVALID_RETRY_STATUS_NONE;
        this.enqueueType = EnqueueType.ENQUEUE_NONE;
        this.lastNotifyProgressTime = new AtomicLong(0);
        this.newSaveTempFileEnable = true;
        if (cursor != null) {
            try {
                int columnIndex = cursor.getColumnIndex("_id");
                if (columnIndex != -1) {
                    this.f54941id = cursor.getInt(columnIndex);
                }
                int columnIndex2 = cursor.getColumnIndex("name");
                if (columnIndex2 != -1) {
                    this.name = cursor.getString(columnIndex2);
                }
                int columnIndex3 = cursor.getColumnIndex("title");
                if (columnIndex3 != -1) {
                    this.title = cursor.getString(columnIndex3);
                }
                int columnIndex4 = cursor.getColumnIndex("url");
                if (columnIndex4 != -1) {
                    this.url = cursor.getString(columnIndex4);
                }
                int columnIndex5 = cursor.getColumnIndex("savePath");
                if (columnIndex5 != -1) {
                    this.savePath = cursor.getString(columnIndex5);
                }
                int columnIndex6 = cursor.getColumnIndex("tempPath");
                if (columnIndex6 != -1) {
                    this.tempPath = cursor.getString(columnIndex6);
                }
                int columnIndex7 = cursor.getColumnIndex("chunkCount");
                if (columnIndex7 != -1) {
                    this.chunkCount = cursor.getInt(columnIndex7);
                }
                int columnIndex8 = cursor.getColumnIndex("status");
                if (columnIndex8 != -1) {
                    this.status = new AtomicInteger(cursor.getInt(columnIndex8));
                } else {
                    this.status = new AtomicInteger(0);
                }
                int columnIndex9 = cursor.getColumnIndex("curBytes");
                if (columnIndex9 != -1) {
                    this.curBytes = new AtomicLong(cursor.getLong(columnIndex9));
                } else {
                    this.curBytes = new AtomicLong(0);
                }
                int columnIndex10 = cursor.getColumnIndex("totalBytes");
                if (columnIndex10 != -1) {
                    this.totalBytes = cursor.getLong(columnIndex10);
                }
                int columnIndex11 = cursor.getColumnIndex("eTag");
                if (columnIndex11 != -1) {
                    this.eTag = cursor.getString(columnIndex11);
                }
                int columnIndex12 = cursor.getColumnIndex("onlyWifi");
                if (columnIndex12 != -1) {
                    if (cursor.getInt(columnIndex12) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.onlyWifi = z10;
                }
                int columnIndex13 = cursor.getColumnIndex("force");
                if (columnIndex13 != -1) {
                    if (cursor.getInt(columnIndex13) != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    this.force = z9;
                }
                int columnIndex14 = cursor.getColumnIndex("retryCount");
                if (columnIndex14 != -1) {
                    this.retryCount = cursor.getInt(columnIndex14);
                }
                int columnIndex15 = cursor.getColumnIndex("extra");
                if (columnIndex15 != -1) {
                    this.extra = cursor.getString(columnIndex15);
                }
                int columnIndex16 = cursor.getColumnIndex("mimeType");
                if (columnIndex16 != -1) {
                    this.mimeType = cursor.getString(columnIndex16);
                }
                int columnIndex17 = cursor.getColumnIndex("notificationEnable");
                if (columnIndex17 != -1) {
                    if (cursor.getInt(columnIndex17) != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    this.showNotification = z8;
                }
                int columnIndex18 = cursor.getColumnIndex("notificationVisibility");
                if (columnIndex18 != -1) {
                    this.notificationVisibility = cursor.getInt(columnIndex18);
                }
                int columnIndex19 = cursor.getColumnIndex("isFirstDownload");
                if (columnIndex19 != -1) {
                    if (cursor.getInt(columnIndex19) == 1) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    this.isFirstDownload = z7;
                }
                int columnIndex20 = cursor.getColumnIndex("isFirstSuccess");
                if (columnIndex20 != -1) {
                    if (cursor.getInt(columnIndex20) == 1) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    this.isFirstSuccess = z6;
                }
                int columnIndex21 = cursor.getColumnIndex("needHttpsToHttpRetry");
                if (columnIndex21 != -1) {
                    if (cursor.getInt(columnIndex21) == 1) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    this.needHttpsToHttpRetry = z5;
                }
                int columnIndex22 = cursor.getColumnIndex("downloadTime");
                if (columnIndex22 != -1) {
                    this.downloadTime = cursor.getLong(columnIndex22);
                }
                int columnIndex23 = cursor.getColumnIndex("packageName");
                if (columnIndex23 != -1) {
                    this.packageName = cursor.getString(columnIndex23);
                }
                int columnIndex24 = cursor.getColumnIndex("md5");
                if (columnIndex24 != -1) {
                    this.md5 = cursor.getString(columnIndex24);
                }
                int columnIndex25 = cursor.getColumnIndex("retryDelay");
                if (columnIndex25 != -1) {
                    if (cursor.getInt(columnIndex25) == 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    this.needRetryDelay = z4;
                }
                int columnIndex26 = cursor.getColumnIndex("curRetryTime");
                if (columnIndex26 != -1) {
                    this.curRetryTime = cursor.getInt(columnIndex26);
                }
                int columnIndex27 = cursor.getColumnIndex("retryDelayStatus");
                if (columnIndex27 != -1) {
                    int i = cursor.getInt(columnIndex27);
                    if (i == RetryDelayStatus.DELAY_RETRY_WAITING.ordinal()) {
                        this.retryDelayStatus = RetryDelayStatus.DELAY_RETRY_WAITING;
                    } else if (i == RetryDelayStatus.DELAY_RETRY_DOWNLOADING.ordinal()) {
                        this.retryDelayStatus = RetryDelayStatus.DELAY_RETRY_DOWNLOADING;
                    } else if (i == RetryDelayStatus.DELAY_RETRY_DOWNLOADED.ordinal()) {
                        this.retryDelayStatus = RetryDelayStatus.DELAY_RETRY_DOWNLOADED;
                    } else {
                        this.retryDelayStatus = RetryDelayStatus.DELAY_RETRY_NONE;
                    }
                }
                int columnIndex28 = cursor.getColumnIndex("defaultHttpServiceBackUp");
                if (columnIndex28 != -1) {
                    if (cursor.getInt(columnIndex28) == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    this.needDefaultHttpServiceBackUp = z3;
                }
                int columnIndex29 = cursor.getColumnIndex("chunkRunnableReuse");
                if (columnIndex29 != -1) {
                    if (cursor.getInt(columnIndex29) == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.needReuseChunkRunnable = z2;
                }
                int columnIndex30 = cursor.getColumnIndex("retryDelayTimeArray");
                if (columnIndex30 != -1) {
                    this.retryDelayTimeArray = cursor.getString(columnIndex30);
                }
                int columnIndex31 = cursor.getColumnIndex("chunkDowngradeRetry");
                if (columnIndex31 != -1) {
                    if (cursor.getInt(columnIndex31) == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.needChunkDowngradeRetry = z;
                }
                int columnIndex32 = cursor.getColumnIndex("backUpUrlsStr");
                if (columnIndex32 != -1) {
                    setBackUpUrlsStr(cursor.getString(columnIndex32));
                }
                int columnIndex33 = cursor.getColumnIndex("backUpUrlRetryCount");
                if (columnIndex33 != -1) {
                    this.backUpUrlRetryCount = cursor.getInt(columnIndex33);
                }
                int columnIndex34 = cursor.getColumnIndex("realDownloadTime");
                if (columnIndex34 != -1) {
                    this.realDownloadTime = cursor.getLong(columnIndex34);
                }
                int columnIndex35 = cursor.getColumnIndex("retryScheduleMinutes");
                if (columnIndex35 != -1) {
                    this.retryScheduleMinutes = cursor.getInt(columnIndex35);
                }
                int columnIndex36 = cursor.getColumnIndex("independentProcess");
                if (columnIndex36 != -1) {
                    if (cursor.getInt(columnIndex36) != 1) {
                        z11 = false;
                    }
                    this.needIndependentProcess = z11;
                }
                int columnIndex37 = cursor.getColumnIndex("auxiliaryJsonobjectString");
                if (columnIndex37 != -1) {
                    this.dbJsonDataString = cursor.getString(columnIndex37);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void bindValue(SQLiteStatement sQLiteStatement) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        long j;
        long j2;
        String str6;
        String str7;
        String str8;
        long j3;
        long j4;
        long j5;
        long j6;
        String str9;
        String str10;
        long j7;
        long j8;
        long j9;
        String str11;
        long j10;
        String str12;
        if (sQLiteStatement != null) {
            this.bindValueCount = 0;
            sQLiteStatement.clearBindings();
            int i = this.bindValueCount + 1;
            this.bindValueCount = i;
            sQLiteStatement.bindLong(i, (long) this.f54941id);
            int i2 = this.bindValueCount + 1;
            this.bindValueCount = i2;
            if (this.url == null) {
                str = "";
            } else {
                str = this.url;
            }
            sQLiteStatement.bindString(i2, str);
            int i3 = this.bindValueCount + 1;
            this.bindValueCount = i3;
            if (this.savePath == null) {
                str2 = "";
            } else {
                str2 = this.savePath;
            }
            sQLiteStatement.bindString(i3, str2);
            int i4 = this.bindValueCount + 1;
            this.bindValueCount = i4;
            if (this.tempPath == null) {
                str3 = "";
            } else {
                str3 = this.tempPath;
            }
            sQLiteStatement.bindString(i4, str3);
            int i5 = this.bindValueCount + 1;
            this.bindValueCount = i5;
            if (this.name == null) {
                str4 = "";
            } else {
                str4 = this.name;
            }
            sQLiteStatement.bindString(i5, str4);
            int i6 = this.bindValueCount + 1;
            this.bindValueCount = i6;
            sQLiteStatement.bindLong(i6, (long) this.chunkCount);
            int i7 = this.bindValueCount + 1;
            this.bindValueCount = i7;
            sQLiteStatement.bindLong(i7, (long) getStatus());
            int i8 = this.bindValueCount + 1;
            this.bindValueCount = i8;
            sQLiteStatement.bindLong(i8, getCurBytes());
            int i9 = this.bindValueCount + 1;
            this.bindValueCount = i9;
            sQLiteStatement.bindLong(i9, this.totalBytes);
            int i10 = this.bindValueCount + 1;
            this.bindValueCount = i10;
            if (this.eTag == null) {
                str5 = "";
            } else {
                str5 = this.eTag;
            }
            sQLiteStatement.bindString(i10, str5);
            int i11 = this.bindValueCount + 1;
            this.bindValueCount = i11;
            long j11 = 0;
            if (this.onlyWifi) {
                j = 1;
            } else {
                j = 0;
            }
            sQLiteStatement.bindLong(i11, j);
            int i12 = this.bindValueCount + 1;
            this.bindValueCount = i12;
            if (this.force) {
                j2 = 1;
            } else {
                j2 = 0;
            }
            sQLiteStatement.bindLong(i12, j2);
            int i13 = this.bindValueCount + 1;
            this.bindValueCount = i13;
            sQLiteStatement.bindLong(i13, (long) this.retryCount);
            int i14 = this.bindValueCount + 1;
            this.bindValueCount = i14;
            if (this.extra == null) {
                str6 = "";
            } else {
                str6 = this.extra;
            }
            sQLiteStatement.bindString(i14, str6);
            int i15 = this.bindValueCount + 1;
            this.bindValueCount = i15;
            if (this.mimeType == null) {
                str7 = "";
            } else {
                str7 = this.mimeType;
            }
            sQLiteStatement.bindString(i15, str7);
            int i16 = this.bindValueCount + 1;
            this.bindValueCount = i16;
            if (this.title == null) {
                str8 = "";
            } else {
                str8 = this.title;
            }
            sQLiteStatement.bindString(i16, str8);
            int i17 = this.bindValueCount + 1;
            this.bindValueCount = i17;
            if (this.showNotification) {
                j3 = 1;
            } else {
                j3 = 0;
            }
            sQLiteStatement.bindLong(i17, j3);
            int i18 = this.bindValueCount + 1;
            this.bindValueCount = i18;
            sQLiteStatement.bindLong(i18, (long) this.notificationVisibility);
            int i19 = this.bindValueCount + 1;
            this.bindValueCount = i19;
            if (this.isFirstDownload) {
                j4 = 1;
            } else {
                j4 = 0;
            }
            sQLiteStatement.bindLong(i19, j4);
            int i20 = this.bindValueCount + 1;
            this.bindValueCount = i20;
            if (this.isFirstSuccess) {
                j5 = 1;
            } else {
                j5 = 0;
            }
            sQLiteStatement.bindLong(i20, j5);
            int i21 = this.bindValueCount + 1;
            this.bindValueCount = i21;
            if (this.needHttpsToHttpRetry) {
                j6 = 1;
            } else {
                j6 = 0;
            }
            sQLiteStatement.bindLong(i21, j6);
            int i22 = this.bindValueCount + 1;
            this.bindValueCount = i22;
            sQLiteStatement.bindLong(i22, this.downloadTime);
            int i23 = this.bindValueCount + 1;
            this.bindValueCount = i23;
            if (this.packageName == null) {
                str9 = "";
            } else {
                str9 = this.packageName;
            }
            sQLiteStatement.bindString(i23, str9);
            int i24 = this.bindValueCount + 1;
            this.bindValueCount = i24;
            if (this.md5 == null) {
                str10 = "";
            } else {
                str10 = this.md5;
            }
            sQLiteStatement.bindString(i24, str10);
            int i25 = this.bindValueCount + 1;
            this.bindValueCount = i25;
            if (this.needRetryDelay) {
                j7 = 1;
            } else {
                j7 = 0;
            }
            sQLiteStatement.bindLong(i25, j7);
            int i26 = this.bindValueCount + 1;
            this.bindValueCount = i26;
            sQLiteStatement.bindLong(i26, (long) this.curRetryTime);
            int i27 = this.bindValueCount + 1;
            this.bindValueCount = i27;
            sQLiteStatement.bindLong(i27, (long) this.retryDelayStatus.ordinal());
            int i28 = this.bindValueCount + 1;
            this.bindValueCount = i28;
            if (this.needDefaultHttpServiceBackUp) {
                j8 = 1;
            } else {
                j8 = 0;
            }
            sQLiteStatement.bindLong(i28, j8);
            int i29 = this.bindValueCount + 1;
            this.bindValueCount = i29;
            if (this.needReuseChunkRunnable) {
                j9 = 1;
            } else {
                j9 = 0;
            }
            sQLiteStatement.bindLong(i29, j9);
            int i30 = this.bindValueCount + 1;
            this.bindValueCount = i30;
            if (this.retryDelayTimeArray == null) {
                str11 = "";
            } else {
                str11 = this.retryDelayTimeArray;
            }
            sQLiteStatement.bindString(i30, str11);
            int i31 = this.bindValueCount + 1;
            this.bindValueCount = i31;
            if (this.needChunkDowngradeRetry) {
                j10 = 1;
            } else {
                j10 = 0;
            }
            sQLiteStatement.bindLong(i31, j10);
            int i32 = this.bindValueCount + 1;
            this.bindValueCount = i32;
            sQLiteStatement.bindString(i32, getBackUpUrlsStr());
            int i33 = this.bindValueCount + 1;
            this.bindValueCount = i33;
            sQLiteStatement.bindLong(i33, (long) this.backUpUrlRetryCount);
            int i34 = this.bindValueCount + 1;
            this.bindValueCount = i34;
            sQLiteStatement.bindLong(i34, this.realDownloadTime);
            int i35 = this.bindValueCount + 1;
            this.bindValueCount = i35;
            sQLiteStatement.bindLong(i35, (long) this.retryScheduleMinutes);
            int i36 = this.bindValueCount + 1;
            this.bindValueCount = i36;
            if (this.needIndependentProcess) {
                j11 = 1;
            }
            sQLiteStatement.bindLong(i36, j11);
            int i37 = this.bindValueCount + 1;
            this.bindValueCount = i37;
            if (this.dbJsonData == null) {
                str12 = this.dbJsonDataString;
            } else {
                str12 = this.dbJsonData.toString();
            }
            sQLiteStatement.bindString(i37, str12);
        }
    }

    public void readFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        this.f54941id = parcel.readInt();
        this.name = parcel.readString();
        this.title = parcel.readString();
        this.url = parcel.readString();
        this.savePath = parcel.readString();
        this.tempPath = parcel.readString();
        boolean z23 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.onlyWifi = z;
        this.extra = parcel.readString();
        this.extraHeaders = parcel.createTypedArrayList(HttpHeader.CREATOR);
        this.maxBytes = parcel.readInt();
        this.outIp = parcel.createStringArray();
        this.outSize = parcel.createIntArray();
        this.retryCount = parcel.readInt();
        this.backUpUrlRetryCount = parcel.readInt();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.force = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.needPostProgress = z3;
        this.maxProgressCount = parcel.readInt();
        this.minProgressTimeMsInterval = parcel.readInt();
        this.backUpUrls = parcel.createStringArrayList();
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.showNotification = z4;
        this.mimeType = parcel.readString();
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.needHttpsToHttpRetry = z5;
        this.packageName = parcel.readString();
        this.md5 = parcel.readString();
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.needRetryDelay = z6;
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.needDefaultHttpServiceBackUp = z7;
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.needReuseChunkRunnable = z8;
        this.retryDelayTimeArray = parcel.readString();
        this.eTag = parcel.readString();
        this.curRetryTime = parcel.readInt();
        convertRetryDelayStatus(parcel.readInt());
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.needReuseFirstConnection = z9;
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.forceIgnoreRecommendSize = z10;
        this.networkQuality = parcel.readString();
        this.curBackUpUrlIndex = parcel.readInt();
        this.notificationVisibility = parcel.readInt();
        this.chunkCount = parcel.readInt();
        setCurBytes(parcel.readLong());
        this.totalBytes = parcel.readLong();
        setStatus(parcel.readInt());
        this.downloadTime = parcel.readLong();
        this.realDownloadTime = parcel.readLong();
        if (parcel.readByte() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.backUpUrlUsed = z11;
        if (parcel.readByte() != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.httpsToHttpRetryUsed = z12;
        try {
            if (this.errorBytesLog == null) {
                this.errorBytesLog = new StringBuffer(parcel.readString());
            } else {
                this.errorBytesLog.delete(0, this.errorBytesLog.length()).append(parcel.readString());
            }
        } catch (Exception unused) {
        }
        if (parcel.readByte() != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.autoResumed = z13;
        if (parcel.readByte() != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.showNotificationForAutoResumed = z14;
        if (parcel.readByte() != 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.showNotificationForNetworkResumed = z15;
        this.forbiddenBackupUrls = parcel.createStringArrayList();
        if (parcel.readByte() != 0) {
            z16 = true;
        } else {
            z16 = false;
        }
        this.needIndependentProcess = z16;
        convertEnqueueType(parcel.readInt());
        if (parcel.readByte() != 0) {
            z17 = true;
        } else {
            z17 = false;
        }
        this.headConnectionAvailable = z17;
        this.httpStatusCode = parcel.readInt();
        this.httpStatusMessage = parcel.readString();
        if (parcel.readByte() != 0) {
            z18 = true;
        } else {
            z18 = false;
        }
        this.isSaveTempFile = z18;
        if (parcel.readByte() != 0) {
            z19 = true;
        } else {
            z19 = false;
        }
        this.isForbiddenRetryed = z19;
        if (parcel.readByte() != 0) {
            z20 = true;
        } else {
            z20 = false;
        }
        this.newSaveTempFileEnable = z20;
        if (parcel.readByte() != 0) {
            z21 = true;
        } else {
            z21 = false;
        }
        this.addListenerToSameTask = z21;
        if (parcel.readByte() != 0) {
            z22 = true;
        } else {
            z22 = false;
        }
        this.needChunkDowngradeRetry = z22;
        if (parcel.readByte() == 0) {
            z23 = false;
        }
        this.chunkDowngradeRetryUsed = z23;
        this.failedException = (BaseException) parcel.readParcelable(BaseException.class.getClassLoader());
        this.retryScheduleMinutes = parcel.readInt();
        this.dbJsonDataString = parcel.readString();
    }

    public void setForbiddenBackupUrls(List<String> list, boolean z) {
        this.forbiddenBackupUrls = list;
        refreshBackupUrls(z);
    }

    private void putAuxiliaryJSONObjectField(String str, long j) {
        ensureDBJsonData();
        try {
            this.dbJsonData.put(str, j);
        } catch (Exception unused) {
        }
    }

    public void setCurBytes(long j, boolean z) {
        if (z) {
            setCurBytes(j);
            return;
        }
        if (j > getCurBytes()) {
            setCurBytes(j);
        }
    }

    public void copyFromCacheData(DownloadInfo downloadInfo, boolean z) {
        if (downloadInfo != null) {
            setChunkCount(downloadInfo.getChunkCount());
            setTotalBytes(downloadInfo.getTotalBytes());
            setCurBytes(downloadInfo.getCurBytes(), true);
            this.realDownloadTime = downloadInfo.realDownloadTime;
            if (downloadInfo.canSkipStatusHandler() || canSkipStatusHandler()) {
                this.curRetryTime = downloadInfo.getCurRetryTime();
            } else {
                this.curRetryTime = 0;
                this.isForbiddenRetryed = false;
                this.backUpUrlUsed = false;
                this.curBackUpUrlIndex = 0;
                this.httpsToHttpRetryUsed = false;
            }
            seteTag(downloadInfo.geteTag());
            if (z) {
                setStatus(downloadInfo.getStatus());
            }
            this.isFirstDownload = downloadInfo.getIsFirstDownload();
            this.isFirstSuccess = downloadInfo.isFirstSuccess();
            this.retryDelayStatus = downloadInfo.getRetryDelayStatus();
            mergeAuxiliaryJSONObject(downloadInfo.dbJsonData);
        }
    }

    public synchronized void handleTempSaveCallback(boolean z, BaseException baseException) {
        this.isSaveTempFile = false;
        if (this.tempFileSaveCompleteCallbacks != null) {
            StringBuilder sb = new StringBuilder("handleTempSaveCallback isSuccess ");
            sb.append(z);
            sb.append(" callback size:");
            sb.append(this.tempFileSaveCompleteCallbacks.size());
            for (C20207aa aaVar : this.tempFileSaveCompleteCallbacks) {
                if (aaVar != null) {
                    if (z) {
                        aaVar.mo54129a();
                    } else {
                        aaVar.mo54130a(baseException);
                    }
                }
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeInt(this.f54941id);
        parcel.writeString(this.name);
        parcel.writeString(this.title);
        parcel.writeString(this.url);
        parcel.writeString(this.savePath);
        parcel.writeString(this.tempPath);
        parcel.writeByte(this.onlyWifi ? (byte) 1 : 0);
        parcel.writeString(this.extra);
        parcel.writeTypedList(this.extraHeaders);
        parcel.writeInt(this.maxBytes);
        parcel.writeStringArray(this.outIp);
        parcel.writeIntArray(this.outSize);
        parcel.writeInt(this.retryCount);
        parcel.writeInt(this.backUpUrlRetryCount);
        parcel.writeByte(this.force ? (byte) 1 : 0);
        parcel.writeByte(this.needPostProgress ? (byte) 1 : 0);
        parcel.writeInt(this.maxProgressCount);
        parcel.writeInt(this.minProgressTimeMsInterval);
        parcel.writeStringList(this.backUpUrls);
        parcel.writeByte(this.showNotification ? (byte) 1 : 0);
        parcel.writeString(this.mimeType);
        parcel.writeByte(this.needHttpsToHttpRetry ? (byte) 1 : 0);
        parcel.writeString(this.packageName);
        parcel.writeString(this.md5);
        parcel.writeByte(this.needRetryDelay ? (byte) 1 : 0);
        parcel.writeByte(this.needDefaultHttpServiceBackUp ? (byte) 1 : 0);
        parcel.writeByte(this.needReuseChunkRunnable ? (byte) 1 : 0);
        parcel.writeString(this.retryDelayTimeArray);
        parcel.writeString(this.eTag);
        parcel.writeInt(this.curRetryTime);
        parcel.writeInt(this.retryDelayStatus.ordinal());
        parcel.writeByte(this.needReuseFirstConnection ? (byte) 1 : 0);
        parcel.writeByte(this.forceIgnoreRecommendSize ? (byte) 1 : 0);
        parcel.writeString(this.networkQuality);
        parcel.writeInt(this.curBackUpUrlIndex);
        parcel.writeInt(this.notificationVisibility);
        parcel.writeInt(this.chunkCount);
        parcel.writeLong(getCurBytes());
        parcel.writeLong(this.totalBytes);
        parcel.writeInt(getRealStatus());
        parcel.writeLong(this.downloadTime);
        parcel.writeLong(this.realDownloadTime);
        parcel.writeByte(this.backUpUrlUsed ? (byte) 1 : 0);
        parcel.writeByte(this.httpsToHttpRetryUsed ? (byte) 1 : 0);
        String str2 = "";
        if (this.errorBytesLog != null) {
            str2 = this.errorBytesLog.toString();
        }
        parcel.writeString(str2);
        parcel.writeByte(this.autoResumed ? (byte) 1 : 0);
        parcel.writeByte(this.showNotificationForAutoResumed ? (byte) 1 : 0);
        parcel.writeByte(this.showNotificationForNetworkResumed ? (byte) 1 : 0);
        parcel.writeStringList(this.forbiddenBackupUrls);
        parcel.writeByte(this.needIndependentProcess ? (byte) 1 : 0);
        parcel.writeInt(this.enqueueType.ordinal());
        parcel.writeByte(this.headConnectionAvailable ? (byte) 1 : 0);
        parcel.writeInt(this.httpStatusCode);
        parcel.writeString(this.httpStatusMessage);
        parcel.writeByte(this.isSaveTempFile ? (byte) 1 : 0);
        parcel.writeByte(this.isForbiddenRetryed ? (byte) 1 : 0);
        parcel.writeByte(this.newSaveTempFileEnable ? (byte) 1 : 0);
        parcel.writeByte(this.addListenerToSameTask ? (byte) 1 : 0);
        parcel.writeByte(this.needChunkDowngradeRetry ? (byte) 1 : 0);
        parcel.writeByte(this.chunkDowngradeRetryUsed ? (byte) 1 : 0);
        parcel.writeParcelable(this.failedException, i);
        parcel.writeInt(this.retryScheduleMinutes);
        if (this.dbJsonData == null) {
            str = this.dbJsonDataString;
        } else {
            str = this.dbJsonData.toString();
        }
        parcel.writeString(str);
    }

    public void addErrorBytesLog(long j, int i, String str) {
        try {
            if (C20190a.m66501a()) {
                if (this.errorBytesLog == null) {
                    this.errorBytesLog = new StringBuffer();
                }
                if (this.errorBytesLog.length() != 0) {
                    this.errorBytesLog.append(",");
                }
                StringBuffer stringBuffer = this.errorBytesLog;
                stringBuffer.append("[type:");
                stringBuffer.append(i);
                stringBuffer.append(",bytes:");
                stringBuffer.append(j);
                stringBuffer.append(",method:");
                stringBuffer.append(str);
                stringBuffer.append("]");
            }
        } catch (Exception unused) {
        }
    }
}
