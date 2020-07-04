package com.p280ss.mediakit.net;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.mediakit.net.IPCache */
public class IPCache {
    private static IPCache mInstance = null;
    private static String mNetExtraInfo = null;
    private static int mNetType = -1;
    private Lock lock = new ReentrantLock();
    private ConcurrentHashMap<String, AVMDLDNSInfo> mDNSRecord = new ConcurrentHashMap<>();

    public String getCurNetExtraInfo() {
        return mNetExtraInfo;
    }

    public int getCurNetType() {
        return mNetType;
    }

    private IPCache() {
    }

    public static IPCache getInstance() {
        if (mInstance == null) {
            synchronized (IPCache.class) {
                if (mInstance == null) {
                    mInstance = new IPCache();
                }
            }
        }
        return mInstance;
    }

    public void clear() {
        this.lock.lock();
        try {
            if (this.mDNSRecord != null) {
                this.mDNSRecord.clear();
            }
        } finally {
            this.lock.unlock();
        }
    }

    public int getRecordSize() {
        int i;
        this.lock.lock();
        try {
            if (this.mDNSRecord != null) {
                i = this.mDNSRecord.size();
            } else {
                i = -1;
            }
            return i;
        } finally {
            this.lock.unlock();
        }
    }

    public void setCurNetExtraInfo(String str) {
        mNetExtraInfo = str;
    }

    public void setCurNetType(int i) {
        mNetType = i;
    }

    public AVMDLDNSInfo get(String str) {
        AVMDLDNSInfo aVMDLDNSInfo;
        this.lock.lock();
        try {
            if (this.mDNSRecord != null) {
                aVMDLDNSInfo = (AVMDLDNSInfo) this.mDNSRecord.get(str);
            } else {
                aVMDLDNSInfo = null;
            }
            return aVMDLDNSInfo;
        } finally {
            this.lock.unlock();
        }
    }

    public void put(String str, AVMDLDNSInfo aVMDLDNSInfo) {
        this.lock.lock();
        try {
            if (this.mDNSRecord != null) {
                this.mDNSRecord.put(str, aVMDLDNSInfo);
            }
        } finally {
            this.lock.unlock();
        }
    }
}
