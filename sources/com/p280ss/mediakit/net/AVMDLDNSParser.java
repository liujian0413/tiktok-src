package com.p280ss.mediakit.net;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.C1642a;
import com.p280ss.mediakit.medialoader.AVMDLLog;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.mediakit.net.AVMDLDNSParser */
public class AVMDLDNSParser {
    public static int mGlobalBackType = 2;
    public static int mGlobalBackUpDelayedTime = 0;
    public static int mGlobalDefaultExpiredTime = 60;
    public static int mGlobalMainType;
    private static AVMDLDNSParser mInstance;
    private Handler mHandler;
    private Lock mLock = new ReentrantLock();
    private Map<String, AVMDLHostProcessor> mProcessors = new HashMap();
    private int mRefCount;
    private int mState;
    private HandlerThread mThread = new HandlerThread("AVMDLDNSParser");
    private int mTimeOut = 5;
    private int mType;

    public void release() {
    }

    public static AVMDLDNSParser getInstance() {
        if (mInstance == null) {
            synchronized (AVMDLDNSParser.class) {
                if (mInstance == null) {
                    mInstance = new AVMDLDNSParser();
                }
            }
        }
        return mInstance;
    }

    public AVMDLDNSParser() {
        this.mThread.start();
        this.mHandler = new Handler(this.mThread.getLooper()) {
            public void handleMessage(Message message) {
                AVMDLDNSInfo aVMDLDNSInfo;
                if (message.obj != null) {
                    aVMDLDNSInfo = (AVMDLDNSInfo) message.obj;
                } else {
                    aVMDLDNSInfo = null;
                }
                AVMDLLog.m143965d("AVMDLDNSParser", C1642a.m8034a("----receive msg what:%d info:%s", new Object[]{Integer.valueOf(message.what), aVMDLDNSInfo}));
                switch (message.what) {
                    case 1:
                        AVMDLDNSParser.this.processParseMsg(message.what, aVMDLDNSInfo);
                        break;
                    case 2:
                        AVMDLDNSParser.this.proccessFailMsg(message.what, aVMDLDNSInfo);
                        break;
                    case 3:
                        AVMDLDNSParser.this.proccessSucMsg(message.what, aVMDLDNSInfo);
                        break;
                }
                AVMDLLog.m143965d("AVMDLDNSParser", C1642a.m8034a("****end proc msg what:%d info:%s", new Object[]{Integer.valueOf(message.what), aVMDLDNSInfo}));
            }
        };
    }

    public void addHost(String str, AVMDLDNSParserListener aVMDLDNSParserListener) {
        addListenerInternal(str, aVMDLDNSParserListener);
    }

    public void removeHost(String str, AVMDLDNSParserListener aVMDLDNSParserListener) {
        removeListenerInternal(str, aVMDLDNSParserListener);
    }

    public void postParseHostMsg(String str, int i) {
        AVMDLDNSInfo aVMDLDNSInfo = new AVMDLDNSInfo(i, str, null, 0, null);
        Message message = new Message();
        message.what = 0;
        message.obj = aVMDLDNSInfo;
        this.mHandler.sendMessage(message);
    }

    public static void setIntValue(int i, int i2) {
        AVMDLLog.m143965d("AVMDLDNSParser", C1642a.m8034a("****set value:%d for key:%d", new Object[]{Integer.valueOf(i2), Integer.valueOf(i)}));
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
    private void removeListenerInternal(String str, AVMDLDNSParserListener aVMDLDNSParserListener) {
        if (!TextUtils.isEmpty(str) && aVMDLDNSParserListener != null) {
            AVMDLLog.m143965d("AVMDLDNSParser", C1642a.m8034a("---remove listener:%s for host:%s", new Object[]{aVMDLDNSParserListener, str}));
            this.mLock.lock();
            try {
                AVMDLHostProcessor aVMDLHostProcessor = (AVMDLHostProcessor) this.mProcessors.get(str);
                AVMDLLog.m143965d("AVMDLDNSParser", C1642a.m8034a("get processor:%s", new Object[]{aVMDLHostProcessor}));
                if (aVMDLHostProcessor != null) {
                    AVMDLLog.m143965d("AVMDLDNSParser", C1642a.m8034a("remove listener", new Object[0]));
                    aVMDLHostProcessor.mListeners.remove(aVMDLDNSParserListener);
                }
                if (aVMDLHostProcessor != null && aVMDLHostProcessor.mListeners.size() == 0) {
                    AVMDLLog.m143965d("AVMDLDNSParser", C1642a.m8034a("listeners empty for processors", new Object[0]));
                }
                this.mLock.unlock();
                AVMDLLog.m143965d("AVMDLDNSParser", C1642a.m8034a("****end remove listener", new Object[0]));
            } catch (Throwable th) {
                this.mLock.unlock();
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    private void addListenerInternal(String str, AVMDLDNSParserListener aVMDLDNSParserListener) {
        boolean z;
        if (!TextUtils.isEmpty(str)) {
            AVMDLLog.m143965d("AVMDLDNSParser", C1642a.m8034a("---add listener:%s for host:%s", new Object[]{aVMDLDNSParserListener, str}));
            this.mLock.lock();
            try {
                AVMDLHostProcessor aVMDLHostProcessor = (AVMDLHostProcessor) this.mProcessors.get(str);
                AVMDLLog.m143965d("AVMDLDNSParser", C1642a.m8034a("get processor:%s", new Object[]{aVMDLHostProcessor}));
                if (aVMDLHostProcessor == null) {
                    aVMDLHostProcessor = new AVMDLHostProcessor(str, this.mHandler, mGlobalMainType, mGlobalBackType, mGlobalBackUpDelayedTime);
                    AVMDLLog.m143965d("AVMDLDNSParser", C1642a.m8034a("create processor:%s", new Object[]{aVMDLHostProcessor}));
                    z = true;
                } else {
                    z = false;
                }
                if (aVMDLDNSParserListener != null && !aVMDLHostProcessor.mListeners.containsKey(aVMDLDNSParserListener)) {
                    AVMDLLog.m143965d("AVMDLDNSParser", C1642a.m8034a("add listener", new Object[0]));
                    aVMDLHostProcessor.mListeners.put(aVMDLDNSParserListener, Integer.valueOf(1));
                }
                this.mProcessors.put(str, aVMDLHostProcessor);
                if (z) {
                    AVMDLLog.m143965d("AVMDLDNSParser", C1642a.m8034a("new processor implement parse", new Object[0]));
                    AVMDLDNSInfo aVMDLDNSInfo = new AVMDLDNSInfo(mGlobalMainType, str, null, 0, null);
                    aVMDLHostProcessor.processMsg(0, aVMDLDNSInfo);
                }
                this.mLock.unlock();
                AVMDLLog.m143965d("AVMDLDNSParser", C1642a.m8034a("****end add listener", new Object[0]));
            } catch (Throwable th) {
                this.mLock.unlock();
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public void proccessFailMsg(int i, AVMDLDNSInfo aVMDLDNSInfo) {
        AVMDLDNSInfo aVMDLDNSInfo2 = aVMDLDNSInfo;
        if (aVMDLDNSInfo2 == null || aVMDLDNSInfo2.mHost == null) {
            AVMDLLog.m143965d("AVMDLDNSParser", C1642a.m8034a("proc fail msg  fail, info or host is null", new Object[0]));
            return;
        }
        AVMDLLog.m143965d("AVMDLDNSParser", C1642a.m8034a("----proc fail msg what:%d host:%s", new Object[]{Integer.valueOf(i), aVMDLDNSInfo2.mHost}));
        this.mLock.lock();
        try {
            AVMDLHostProcessor aVMDLHostProcessor = (AVMDLHostProcessor) this.mProcessors.get(aVMDLDNSInfo2.mHost);
            AVMDLLog.m143965d("AVMDLDNSParser", C1642a.m8034a("get processor:%s host:%s", new Object[]{aVMDLHostProcessor, aVMDLDNSInfo2.mHost}));
            if (aVMDLHostProcessor != null && aVMDLHostProcessor.isValidSourceId(aVMDLDNSInfo2.mId)) {
                aVMDLHostProcessor.processResult(i, aVMDLDNSInfo2);
                if (aVMDLHostProcessor.isEnd()) {
                    AVMDLLog.m143965d("AVMDLDNSParser", C1642a.m8034a("processor end, notify result", new Object[0]));
                    for (AVMDLDNSParserListener aVMDLDNSParserListener : aVMDLHostProcessor.mListeners.keySet()) {
                        if (aVMDLDNSParserListener != null) {
                            AVMDLLog.m143965d("AVMDLDNSParser", C1642a.m8034a("listener:%s oncompletion fail", new Object[]{aVMDLDNSParserListener}));
                            aVMDLDNSParserListener.onCompletion(0, aVMDLDNSInfo2.mHost, null, 0, null);
                        }
                    }
                    aVMDLHostProcessor.mListeners.clear();
                    this.mProcessors.remove(aVMDLDNSInfo2.mHost);
                } else {
                    AVMDLLog.m143965d("AVMDLDNSParser", C1642a.m8034a("processor is not end", new Object[0]));
                }
            }
            this.mLock.unlock();
            AVMDLLog.m143965d("AVMDLDNSParser", C1642a.m8034a("****end proc fail msg what", new Object[0]));
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public void proccessSucMsg(int i, AVMDLDNSInfo aVMDLDNSInfo) {
        if (aVMDLDNSInfo == null || aVMDLDNSInfo.mHost == null) {
            AVMDLLog.m143965d("AVMDLDNSParser", C1642a.m8034a("proc suc msg  fail, info or host is null", new Object[0]));
            return;
        }
        AVMDLLog.m143965d("AVMDLDNSParser", C1642a.m8034a("----proc suc msg what:%d host:%s", new Object[]{Integer.valueOf(i), aVMDLDNSInfo.mHost}));
        this.mLock.lock();
        try {
            AVMDLHostProcessor aVMDLHostProcessor = (AVMDLHostProcessor) this.mProcessors.get(aVMDLDNSInfo.mHost);
            AVMDLLog.m143965d("AVMDLDNSParser", C1642a.m8034a("get processor:%s host:%s", new Object[]{aVMDLHostProcessor, aVMDLDNSInfo.mHost}));
            if (!(aVMDLHostProcessor == null || aVMDLHostProcessor.mListeners == null)) {
                for (AVMDLDNSParserListener aVMDLDNSParserListener : aVMDLHostProcessor.mListeners.keySet()) {
                    if (aVMDLDNSParserListener != null) {
                        AVMDLLog.m143965d("AVMDLDNSParser", C1642a.m8034a("listener:%s oncompletion suc", new Object[]{aVMDLDNSParserListener}));
                        aVMDLDNSParserListener.onCompletion(0, aVMDLDNSInfo.mHost, aVMDLDNSInfo.mIpList, aVMDLDNSInfo.mExpiredTime, null);
                    }
                }
                aVMDLHostProcessor.mListeners.clear();
                this.mProcessors.remove(aVMDLDNSInfo.mHost);
                AVMDLLog.m143965d("AVMDLDNSParser", C1642a.m8034a("remove all listeners and remove host", new Object[0]));
            }
            this.mLock.unlock();
            AVMDLLog.m143965d("AVMDLDNSParser", C1642a.m8034a("****end proc suc msg", new Object[0]));
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public void processParseMsg(int i, AVMDLDNSInfo aVMDLDNSInfo) {
        if (aVMDLDNSInfo == null || aVMDLDNSInfo.mHost == null) {
            AVMDLLog.m143965d("AVMDLDNSParser", C1642a.m8034a("proc parser msg  fail, info or host is null", new Object[0]));
            return;
        }
        AVMDLLog.m143965d("AVMDLDNSParser", C1642a.m8034a("----proc parser msg what:%d host:%s", new Object[]{Integer.valueOf(i), aVMDLDNSInfo.mHost}));
        this.mLock.lock();
        try {
            AVMDLHostProcessor aVMDLHostProcessor = (AVMDLHostProcessor) this.mProcessors.get(aVMDLDNSInfo.mHost);
            if (aVMDLHostProcessor != null) {
                AVMDLLog.m143965d("AVMDLDNSParser", C1642a.m8034a("----get processor:%s host:%s", new Object[]{aVMDLHostProcessor, aVMDLDNSInfo.mHost}));
                aVMDLHostProcessor.processMsg(i, aVMDLDNSInfo);
            } else {
                AVMDLLog.m143965d("AVMDLDNSParser", C1642a.m8034a("****get processor null for host:%s", new Object[]{aVMDLDNSInfo.mHost}));
            }
            this.mLock.unlock();
            AVMDLLog.m143965d("AVMDLDNSParser", C1642a.m8034a("****end proc parser msg", new Object[0]));
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
    }
}
