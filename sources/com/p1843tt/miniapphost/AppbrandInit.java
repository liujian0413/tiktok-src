package com.p1843tt.miniapphost;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import com.p1843tt.miniapphost.appbase.IAppbrandInit;
import com.p1843tt.miniapphost.util.MiniAppProcessUtils;
import com.storage.async.Action;
import com.storage.async.Observable;
import com.storage.async.Schedulers;

/* renamed from: com.tt.miniapphost.AppbrandInit */
public class AppbrandInit {
    private static volatile AppbrandInit appbrandInit;
    public Application mApplicationContext;
    public IAppbrandInit mIAppbrandInit;

    public Application getApplicationContext() {
        return this.mApplicationContext;
    }

    public IAppbrandInit getIAppbrandInit() {
        return this.mIAppbrandInit;
    }

    public static AppbrandInit getInstance() {
        if (appbrandInit == null) {
            synchronized (AppbrandInit.class) {
                if (appbrandInit == null) {
                    appbrandInit = new AppbrandInit();
                }
            }
        }
        return appbrandInit;
    }

    public boolean init() {
        AppBrandLogger.m146384i("AppbrandInit", "appbrand init by callback");
        if (this.mIAppbrandInit == null || this.mApplicationContext == null) {
            return false;
        }
        this.mIAppbrandInit.init(this.mApplicationContext);
        return true;
    }

    public void setApplicationContext(Application application) {
        if (this.mApplicationContext == null) {
            this.mApplicationContext = application;
        }
    }

    public void setIAppbrandInit(IAppbrandInit iAppbrandInit) {
        if (this.mIAppbrandInit == null) {
            this.mIAppbrandInit = iAppbrandInit;
        }
    }

    public void init(Application application, IAppbrandInit iAppbrandInit, int i) {
        if (this.mApplicationContext == null) {
            this.mApplicationContext = application;
        }
        if (this.mIAppbrandInit == null) {
            this.mIAppbrandInit = iAppbrandInit;
        }
        if (MiniAppProcessUtils.isMiniAppProcess(application)) {
            this.mIAppbrandInit.init(this.mApplicationContext);
            return;
        }
        if (MiniAppProcessUtils.isMainProcess(application)) {
            if (MiniAppProcessUtils.checkMiniAppProcessExistInMainProcess(application)) {
                Observable.create((Action) new Action() {
                    public void act() {
                        AppbrandInit.this.mIAppbrandInit.init(AppbrandInit.this.mApplicationContext);
                        AppbrandSupport.inst().preloadEmptyProcess();
                    }
                }).schudleOn(Schedulers.shortIO()).subscribeSimple();
                return;
            }
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                public void run() {
                    Observable.create((Action) new Action() {
                        public void act() {
                            AppbrandInit.this.mIAppbrandInit.init(AppbrandInit.this.mApplicationContext);
                            AppbrandSupport.inst().preloadEmptyProcess();
                        }
                    }).schudleOn(Schedulers.shortIO()).subscribeSimple();
                }
            }, (long) i);
        }
    }
}
