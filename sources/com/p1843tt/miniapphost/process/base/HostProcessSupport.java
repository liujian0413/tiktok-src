package com.p1843tt.miniapphost.process.base;

import android.os.IBinder;

/* renamed from: com.tt.miniapphost.process.base.HostProcessSupport */
public class HostProcessSupport implements IHostProcessService {
    private static volatile HostProcessSupport instance;
    private IHostProcessService impl;

    private HostProcessSupport() {
    }

    public IBinder getHostProcessCrossProcessCallBinder() {
        if (getImpl() != null) {
            return this.impl.getHostProcessCrossProcessCallBinder();
        }
        return null;
    }

    private IHostProcessService getImpl() {
        if (this.impl == null) {
            try {
                Object newInstance = Class.forName("com.tt.miniapp.AppbrandHostProcessImpl").newInstance();
                if (newInstance instanceof IHostProcessService) {
                    this.impl = (IHostProcessService) newInstance;
                }
            } catch (Throwable unused) {
            }
        }
        return this.impl;
    }

    public static HostProcessSupport inst() {
        if (instance == null) {
            synchronized (HostProcessSupport.class) {
                if (instance == null) {
                    instance = new HostProcessSupport();
                }
            }
        }
        return instance;
    }
}
