package com.p1843tt.miniapphost;

import com.p1843tt.miniapphost.entity.AppLaunchInfo;
import com.p1843tt.miniapphost.recent.DataChangeListener;
import com.p1843tt.miniapphost.recent.IRecentAppsManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tt.miniapphost.RecentAppsManager */
public class RecentAppsManager implements IRecentAppsManager {
    private static volatile RecentAppsManager instance;
    private IRecentAppsManager recentAppsImpl;

    /* renamed from: com.tt.miniapphost.RecentAppsManager$OnAppDeleteListener */
    public interface OnAppDeleteListener {
        void onFail(String str);

        void onSuccess();
    }

    /* renamed from: com.tt.miniapphost.RecentAppsManager$OnDataGetListener */
    public interface OnDataGetListener {
        void onFail(boolean z);

        void onSuccess(List<AppLaunchInfo> list, boolean z);
    }

    private RecentAppsManager() {
    }

    public static RecentAppsManager inst() {
        if (instance == null) {
            synchronized (RecentAppsManager.class) {
                if (instance == null) {
                    instance = new RecentAppsManager();
                }
            }
        }
        return instance;
    }

    public IRecentAppsManager getImpl() {
        if (this.recentAppsImpl == null) {
            try {
                this.recentAppsImpl = (IRecentAppsManager) Class.forName("com.tt.miniapp.manager.SynHistoryManager").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception e) {
                AppBrandLogger.m146383e("RecentAppsManager", e);
            }
        }
        return this.recentAppsImpl;
    }

    public void addDataChangeListener(DataChangeListener dataChangeListener) {
        if (getImpl() != null) {
            this.recentAppsImpl.addDataChangeListener(dataChangeListener);
        }
    }

    public boolean removeDataChangeListener(DataChangeListener dataChangeListener) {
        if (getImpl() != null) {
            return this.recentAppsImpl.removeDataChangeListener(dataChangeListener);
        }
        return false;
    }

    public List<AppLaunchInfo> getRecentAppList(OnDataGetListener onDataGetListener) {
        if (getImpl() != null) {
            return this.recentAppsImpl.getRecentAppList(onDataGetListener);
        }
        return new ArrayList();
    }

    public void deleteRecentApp(String str, OnAppDeleteListener onAppDeleteListener) {
        if (getImpl() != null) {
            this.recentAppsImpl.deleteRecentApp(str, onAppDeleteListener);
        }
    }
}
