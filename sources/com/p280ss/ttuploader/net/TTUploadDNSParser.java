package com.p280ss.ttuploader.net;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.C1642a;
import com.p280ss.ttuploader.TTUploadLog;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.ttuploader.net.TTUploadDNSParser */
public class TTUploadDNSParser {
    public static int mGlobalBackType = 2;
    public static int mGlobalBackUpDelayedTime = 0;
    public static int mGlobalDefaultExpiredTime = 60;
    public static int mGlobalMainType;
    private static TTUploadDNSParser mInstance;
    private Handler mHandler;
    private Lock mLock = new ReentrantLock();
    private Map<String, TTUploadHostProcessor> mProcessors = new HashMap();
    private int mRefCount;
    private int mState;
    private HandlerThread mThread = new HandlerThread("TTUploadDNSParser");
    private int mTimeOut = 5;
    private int mType;

    public void release() {
    }

    public static TTUploadDNSParser getInstance() {
        if (mInstance == null) {
            synchronized (TTUploadDNSParser.class) {
                if (mInstance == null) {
                    mInstance = new TTUploadDNSParser();
                }
            }
        }
        return mInstance;
    }

    public TTUploadDNSParser() {
        this.mThread.start();
        this.mHandler = new Handler(this.mThread.getLooper()) {
            public void handleMessage(Message message) {
                TTUploadDNSInfo tTUploadDNSInfo;
                if (message.obj != null) {
                    tTUploadDNSInfo = (TTUploadDNSInfo) message.obj;
                } else {
                    tTUploadDNSInfo = null;
                }
                TTUploadLog.m144200d("TTUploadDNSParser", C1642a.m8034a("----receive msg what:%d info:%s", new Object[]{Integer.valueOf(message.what), tTUploadDNSInfo}));
                switch (message.what) {
                    case 1:
                        TTUploadDNSParser.this.processParseMsg(message.what, tTUploadDNSInfo);
                        break;
                    case 2:
                        TTUploadDNSParser.this.proccessFailMsg(message.what, tTUploadDNSInfo);
                        break;
                    case 3:
                        TTUploadDNSParser.this.proccessSucMsg(message.what, tTUploadDNSInfo);
                        break;
                }
                TTUploadLog.m144200d("TTUploadDNSParser", C1642a.m8034a("****end proc msg what:%d info:%s", new Object[]{Integer.valueOf(message.what), tTUploadDNSInfo}));
            }
        };
    }

    public void addHost(String str, TTUploadDNSParserListener tTUploadDNSParserListener) {
        addListenerInternal(str, tTUploadDNSParserListener);
    }

    public void removeHost(String str, TTUploadDNSParserListener tTUploadDNSParserListener) {
        removeListenerInternal(str, tTUploadDNSParserListener);
    }

    public void postParseHostMsg(String str, int i) {
        TTUploadDNSInfo tTUploadDNSInfo = new TTUploadDNSInfo(i, str, null, 0, null);
        Message message = new Message();
        message.what = 0;
        message.obj = tTUploadDNSInfo;
        this.mHandler.sendMessage(message);
    }

    public static void setIntValue(int i, int i2) {
        TTUploadLog.m144200d("TTUploadDNSParser", C1642a.m8034a("****set value:%d for key:%d", new Object[]{Integer.valueOf(i2), Integer.valueOf(i)}));
        switch (i) {
            case 0:
                mGlobalMainType = i2;
                return;
            case 1:
                mGlobalBackType = i2;
                return;
            case 2:
                mGlobalDefaultExpiredTime = i2;
                return;
            case 3:
                mGlobalBackUpDelayedTime = i2;
                break;
        }
    }

    /* JADX INFO: finally extract failed */
    private void addListenerInternal(String str, TTUploadDNSParserListener tTUploadDNSParserListener) {
        boolean z;
        if (!TextUtils.isEmpty(str)) {
            TTUploadLog.m144200d("TTUploadDNSParser", C1642a.m8034a("---add listener:%s for host:%s", new Object[]{tTUploadDNSParserListener, str}));
            this.mLock.lock();
            try {
                TTUploadHostProcessor tTUploadHostProcessor = (TTUploadHostProcessor) this.mProcessors.get(str);
                TTUploadLog.m144200d("TTUploadDNSParser", C1642a.m8034a("get processor:%s", new Object[]{tTUploadHostProcessor}));
                if (tTUploadHostProcessor == null) {
                    tTUploadHostProcessor = new TTUploadHostProcessor(str, this.mHandler, mGlobalMainType, mGlobalBackType, mGlobalBackUpDelayedTime);
                    TTUploadLog.m144200d("TTUploadDNSParser", C1642a.m8034a("create processor:%s", new Object[]{tTUploadHostProcessor}));
                    z = true;
                } else {
                    z = false;
                }
                if (tTUploadDNSParserListener != null && !tTUploadHostProcessor.mListeners.containsKey(tTUploadDNSParserListener)) {
                    TTUploadLog.m144200d("TTUploadDNSParser", C1642a.m8034a("add listener", new Object[0]));
                    tTUploadHostProcessor.mListeners.put(tTUploadDNSParserListener, Integer.valueOf(1));
                }
                this.mProcessors.put(str, tTUploadHostProcessor);
                if (z) {
                    TTUploadLog.m144200d("TTUploadDNSParser", C1642a.m8034a("new processor implement parse", new Object[0]));
                    TTUploadDNSInfo tTUploadDNSInfo = new TTUploadDNSInfo(mGlobalMainType, str, null, 0, null);
                    tTUploadHostProcessor.processMsg(0, tTUploadDNSInfo);
                }
                this.mLock.unlock();
                TTUploadLog.m144200d("TTUploadDNSParser", C1642a.m8034a("****end add listener", new Object[0]));
            } catch (Throwable th) {
                this.mLock.unlock();
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    private void removeListenerInternal(String str, TTUploadDNSParserListener tTUploadDNSParserListener) {
        if (!TextUtils.isEmpty(str) && tTUploadDNSParserListener != null) {
            TTUploadLog.m144200d("TTUploadDNSParser", C1642a.m8034a("---remove listener:%s for host:%s", new Object[]{tTUploadDNSParserListener, str}));
            this.mLock.lock();
            try {
                TTUploadHostProcessor tTUploadHostProcessor = (TTUploadHostProcessor) this.mProcessors.get(str);
                TTUploadLog.m144200d("TTUploadDNSParser", C1642a.m8034a("get processor:%s", new Object[]{tTUploadHostProcessor}));
                if (tTUploadHostProcessor != null) {
                    TTUploadLog.m144200d("TTUploadDNSParser", C1642a.m8034a("remove listener", new Object[0]));
                    tTUploadHostProcessor.mListeners.remove(tTUploadDNSParserListener);
                }
                if (tTUploadHostProcessor != null && tTUploadHostProcessor.mListeners.size() == 0) {
                    TTUploadLog.m144200d("TTUploadDNSParser", C1642a.m8034a("listeners empty remove host from processors", new Object[0]));
                    this.mProcessors.remove(str);
                }
                this.mLock.unlock();
                TTUploadLog.m144200d("TTUploadDNSParser", C1642a.m8034a("****end remove listener", new Object[0]));
            } catch (Throwable th) {
                this.mLock.unlock();
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public void proccessFailMsg(int i, TTUploadDNSInfo tTUploadDNSInfo) {
        TTUploadDNSInfo tTUploadDNSInfo2 = tTUploadDNSInfo;
        if (tTUploadDNSInfo2 == null || tTUploadDNSInfo2.mHost == null) {
            TTUploadLog.m144200d("TTUploadDNSParser", C1642a.m8034a("proc fail msg  fail, info or host is null", new Object[0]));
            return;
        }
        TTUploadLog.m144200d("TTUploadDNSParser", C1642a.m8034a("----proc fail msg what:%d host:%s", new Object[]{Integer.valueOf(i), tTUploadDNSInfo2.mHost}));
        this.mLock.lock();
        try {
            TTUploadHostProcessor tTUploadHostProcessor = (TTUploadHostProcessor) this.mProcessors.get(tTUploadDNSInfo2.mHost);
            TTUploadLog.m144200d("TTUploadDNSParser", C1642a.m8034a("get processor:%s host:%s", new Object[]{tTUploadHostProcessor, tTUploadDNSInfo2.mHost}));
            if (tTUploadHostProcessor != null && tTUploadHostProcessor.isValidSourceId(tTUploadDNSInfo2.mId)) {
                tTUploadHostProcessor.processResult(i, tTUploadDNSInfo2);
                if (tTUploadHostProcessor.isEnd()) {
                    TTUploadLog.m144200d("TTUploadDNSParser", C1642a.m8034a("processor end, notify result", new Object[0]));
                    for (TTUploadDNSParserListener tTUploadDNSParserListener : tTUploadHostProcessor.mListeners.keySet()) {
                        if (tTUploadDNSParserListener != null) {
                            TTUploadLog.m144200d("TTUploadDNSParser", C1642a.m8034a("listener:%s oncompletion fail", new Object[]{tTUploadDNSParserListener}));
                            tTUploadDNSParserListener.onCompletion(0, tTUploadDNSInfo2.mHost, null, 0, null);
                        }
                    }
                    tTUploadHostProcessor.mListeners.clear();
                    this.mProcessors.remove(tTUploadDNSInfo2.mHost);
                } else {
                    TTUploadLog.m144200d("TTUploadDNSParser", C1642a.m8034a("processor is not end", new Object[0]));
                }
            }
            this.mLock.unlock();
            TTUploadLog.m144200d("TTUploadDNSParser", C1642a.m8034a("****end proc fail msg what", new Object[0]));
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public void proccessSucMsg(int i, TTUploadDNSInfo tTUploadDNSInfo) {
        if (tTUploadDNSInfo == null || tTUploadDNSInfo.mHost == null) {
            TTUploadLog.m144200d("TTUploadDNSParser", C1642a.m8034a("proc suc msg  fail, info or host is null", new Object[0]));
            return;
        }
        TTUploadLog.m144200d("TTUploadDNSParser", C1642a.m8034a("----proc suc msg what:%d host:%s", new Object[]{Integer.valueOf(i), tTUploadDNSInfo.mHost}));
        this.mLock.lock();
        try {
            TTUploadHostProcessor tTUploadHostProcessor = (TTUploadHostProcessor) this.mProcessors.get(tTUploadDNSInfo.mHost);
            TTUploadLog.m144200d("TTUploadDNSParser", C1642a.m8034a("get processor:%s host:%s", new Object[]{tTUploadHostProcessor, tTUploadDNSInfo.mHost}));
            if (!(tTUploadHostProcessor == null || tTUploadHostProcessor.mListeners == null)) {
                for (TTUploadDNSParserListener tTUploadDNSParserListener : tTUploadHostProcessor.mListeners.keySet()) {
                    if (tTUploadDNSParserListener != null) {
                        TTUploadLog.m144200d("TTUploadDNSParser", C1642a.m8034a("listener:%s oncompletion suc", new Object[]{tTUploadDNSParserListener}));
                        tTUploadDNSParserListener.onCompletion(0, tTUploadDNSInfo.mHost, tTUploadDNSInfo.mIpList, tTUploadDNSInfo.mExpiredTime, null);
                    }
                }
                tTUploadHostProcessor.mListeners.clear();
                this.mProcessors.remove(tTUploadDNSInfo.mHost);
                TTUploadLog.m144200d("TTUploadDNSParser", C1642a.m8034a("remove all listeners and remove host", new Object[0]));
            }
            this.mLock.unlock();
            TTUploadLog.m144200d("TTUploadDNSParser", C1642a.m8034a("****end proc suc msg", new Object[0]));
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public void processParseMsg(int i, TTUploadDNSInfo tTUploadDNSInfo) {
        if (tTUploadDNSInfo == null || tTUploadDNSInfo.mHost == null) {
            TTUploadLog.m144200d("TTUploadDNSParser", C1642a.m8034a("proc parser msg  fail, info or host is null", new Object[0]));
            return;
        }
        TTUploadLog.m144200d("TTUploadDNSParser", C1642a.m8034a("----proc parser msg what:%d host:%s", new Object[]{Integer.valueOf(i), tTUploadDNSInfo.mHost}));
        this.mLock.lock();
        try {
            TTUploadHostProcessor tTUploadHostProcessor = (TTUploadHostProcessor) this.mProcessors.get(tTUploadDNSInfo.mHost);
            if (tTUploadHostProcessor != null) {
                TTUploadLog.m144200d("TTUploadDNSParser", C1642a.m8034a("----get processor:%s host:%s", new Object[]{tTUploadHostProcessor, tTUploadDNSInfo.mHost}));
                tTUploadHostProcessor.processMsg(i, tTUploadDNSInfo);
            } else {
                TTUploadLog.m144200d("TTUploadDNSParser", C1642a.m8034a("****get processor null for host:%s", new Object[]{tTUploadDNSInfo.mHost}));
            }
            this.mLock.unlock();
            TTUploadLog.m144200d("TTUploadDNSParser", C1642a.m8034a("****end proc parser msg", new Object[0]));
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
    }
}
