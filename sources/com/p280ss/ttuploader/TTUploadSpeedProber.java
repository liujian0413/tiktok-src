package com.p280ss.ttuploader;

import android.content.Context;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

/* renamed from: com.ss.ttuploader.TTUploadSpeedProber */
public class TTUploadSpeedProber implements TTVideoUploaderListener {
    private Context mContext;
    private long mEndTime;
    private long mEndTime1;
    private String mFilePath;
    private InputStream mInputStream;
    AtomicBoolean mIsEnd;
    public TTUploadSpeedProberListener mListener;
    private final ReadLock mReadLock;
    private final ReentrantReadWriteLock mReadWritedLock = new ReentrantReadWriteLock();
    private long mStartTime;
    private long mStartTime1;
    private int mTestSize;
    private Timer mTimer;
    public TTVideoUploader mUploader;
    public final WriteLock mWriteLock;

    public String getStringFromExtern(int i) {
        return null;
    }

    public void onLog(int i, int i2, String str) {
    }

    public int videoUploadCheckNetState(int i, int i2) {
        return 1;
    }

    public void close() {
        this.mWriteLock.lock();
        try {
            if (this.mUploader != null) {
                this.mUploader.close();
                this.mUploader = null;
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void setListener(TTUploadSpeedProberListener tTUploadSpeedProberListener) {
        if (tTUploadSpeedProberListener != null) {
            this.mListener = tTUploadSpeedProberListener;
        }
    }

    private String getFilePath(Context context) {
        try {
            String absolutePath = context.getApplicationContext().getFilesDir().getAbsolutePath();
            if (absolutePath == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(absolutePath);
            sb.append(File.separator);
            sb.append("speedprober");
            String sb2 = sb.toString();
            File file = new File(sb2);
            if (!file.exists()) {
                file.mkdirs();
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append(File.separator);
            sb3.append("speedprober.test");
            return sb3.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean initFile(int i) {
        try {
            File file = new File(this.mFilePath);
            if (!file.exists()) {
                file.createNewFile();
            } else {
                file.delete();
                file.createNewFile();
            }
            byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
            for (int i2 = 0; i2 < 1024; i2++) {
                bArr[i2] = 97;
            }
            String str = new String(bArr);
            FileWriter fileWriter = new FileWriter(file, true);
            int i3 = (i / PreloadTask.BYTE_UNIT_NUMBER) + 1;
            for (int i4 = 0; i4 <= i3; i4++) {
                fileWriter.write(str);
            }
            fileWriter.close();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public TTUploadSpeedProber(Context context, int i) throws Exception {
        if (context != null) {
            this.mFilePath = getFilePath(context);
            if (this.mFilePath == null) {
                throw new Exception("get file path null");
            } else if (initFile(i)) {
                this.mTestSize = i;
                this.mContext = context;
                try {
                    this.mUploader = new TTVideoUploader();
                    this.mUploader.setPathName(this.mFilePath);
                    this.mUploader.setListener(this);
                    this.mUploader.setTestSpeed(true);
                    this.mReadLock = this.mReadWritedLock.readLock();
                    this.mWriteLock = this.mReadWritedLock.writeLock();
                    this.mStartTime = 0;
                    this.mEndTime = 0;
                    this.mStartTime1 = 0;
                    this.mEndTime1 = 0;
                    this.mTimer = new Timer();
                    this.mIsEnd = new AtomicBoolean(false);
                } catch (Throwable th) {
                    StringBuilder sb = new StringBuilder("TTUploadSpeedProber create image uploader fail");
                    sb.append(th.toString());
                    throw new Exception(sb.toString());
                }
            } else {
                throw new Exception("init file fail");
            }
        } else {
            throw new Exception("context is null create TTUploadSpeedProber fail");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNotify(int r4, long r5, com.p280ss.ttuploader.TTVideoInfo r7) {
        /*
            r3 = this;
            r0 = 1
            if (r4 != 0) goto L_0x0039
            long r4 = java.lang.System.currentTimeMillis()
            r3.mEndTime = r4
            com.ss.ttuploader.TTUploadSpeedProberListener r4 = r3.mListener
            if (r4 == 0) goto L_0x005d
            java.util.concurrent.atomic.AtomicBoolean r4 = r3.mIsEnd
            r4.set(r0)
            r4 = 0
            if (r7 == 0) goto L_0x0017
            org.json.JSONObject r4 = r7.mLog
        L_0x0017:
            r5 = 0
            if (r4 == 0) goto L_0x002d
            java.lang.String r6 = "speedinfo"
            org.json.JSONObject r4 = r4.getJSONObject(r6)     // Catch:{ Exception -> 0x002d }
            java.lang.String r6 = "0"
            org.json.JSONObject r4 = r4.getJSONObject(r6)     // Catch:{ Exception -> 0x002d }
            java.lang.String r6 = "avspeed"
            int r4 = r4.getInt(r6)     // Catch:{ Exception -> 0x002d }
            goto L_0x002e
        L_0x002d:
            r4 = 0
        L_0x002e:
            com.ss.ttuploader.TTUploadSpeedProberListener r6 = r3.mListener
            if (r4 <= 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r5 = 1
        L_0x0034:
            long r0 = (long) r4
            r6.onNotify(r5, r0)
            return
        L_0x0039:
            if (r4 != r0) goto L_0x0048
            r0 = 2
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x005d
            long r4 = java.lang.System.currentTimeMillis()
            r3.mStartTime1 = r4
            return
        L_0x0048:
            r7 = 2
            if (r4 != r7) goto L_0x005d
            java.util.concurrent.atomic.AtomicBoolean r4 = r3.mIsEnd
            r4.set(r0)
            r1 = 0
            r3.mEndTime = r1
            com.ss.ttuploader.TTUploadSpeedProberListener r4 = r3.mListener
            if (r4 == 0) goto L_0x005d
            com.ss.ttuploader.TTUploadSpeedProberListener r4 = r3.mListener
            r4.onNotify(r0, r5)
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttuploader.TTUploadSpeedProber.onNotify(int, long, com.ss.ttuploader.TTVideoInfo):void");
    }

    public void start(String str, String str2, String str3, long j) {
        this.mWriteLock.lock();
        try {
            if (this.mStartTime == 0) {
                this.mStartTime = System.currentTimeMillis();
                this.mUploader.setVideoUploadDomain(str);
                this.mUploader.setAuthorization(str2);
                this.mUploader.setUserKey(str3);
                this.mUploader.setSocketNum(1);
                this.mUploader.setSliceSize(524288);
                this.mUploader.setSliceTimeout(10);
                this.mUploader.setFileRetryCount(0);
                this.mUploader.setSliceReTryCount(0);
                this.mUploader.start();
                this.mTimer.schedule(new TimerTask() {
                    public void run() {
                        TTUploadSpeedProber.this.mWriteLock.lock();
                        try {
                            if (!TTUploadSpeedProber.this.mIsEnd.get() && TTUploadSpeedProber.this.mUploader != null) {
                                TTUploadSpeedProber.this.mUploader.close();
                                TTUploadSpeedProber.this.mUploader = null;
                                if (TTUploadSpeedProber.this.mListener != null) {
                                    TTUploadSpeedProber.this.mListener.onNotify(2, 0);
                                }
                            }
                        } finally {
                            TTUploadSpeedProber.this.mWriteLock.unlock();
                        }
                    }
                }, j);
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }
}
