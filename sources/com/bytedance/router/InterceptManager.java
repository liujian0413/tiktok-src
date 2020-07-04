package com.bytedance.router;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.router.RouteIntent.Builder;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.router.interceptor.IInterceptorProvider;
import com.bytedance.router.interceptor.RewriteManager;
import java.util.LinkedList;
import java.util.List;

public class InterceptManager {
    private IInterceptorProvider interceptorProvider;
    private volatile boolean mInterceptorProviderIsInited;
    private List<IInterceptor> mInterceptors = new LinkedList();
    private RewriteManager mRewriteManager;

    public RewriteManager getRewriteManager() {
        return this.mRewriteManager;
    }

    public InterceptManager() {
        if (this.mRewriteManager == null) {
            this.mRewriteManager = new RewriteManager();
        }
        this.mInterceptors.add(this.mRewriteManager);
    }

    public void addInterceptorProvider(IInterceptorProvider iInterceptorProvider) {
        if (iInterceptorProvider != null) {
            this.interceptorProvider = iInterceptorProvider;
        }
    }

    public void addInterceptor(IInterceptor iInterceptor) {
        if (iInterceptor != null) {
            synchronized (this) {
                this.mInterceptors.add(iInterceptor);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean whetherIntercept(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        synchronized (this) {
            if (!this.mInterceptorProviderIsInited) {
                if (this.interceptorProvider != null) {
                    this.mInterceptors.addAll(this.interceptorProvider.getInterceptors());
                }
                this.mInterceptorProviderIsInited = true;
            }
            RouteIntent build = new Builder(str).build();
            for (IInterceptor matchInterceptRules : this.mInterceptors) {
                if (matchInterceptRules.matchInterceptRules(build)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean processRouteIntent(Context context, RouteIntent routeIntent) {
        if (routeIntent == null) {
            return true;
        }
        synchronized (this) {
            if (!this.mInterceptorProviderIsInited) {
                if (this.interceptorProvider != null) {
                    this.mInterceptors.addAll(this.interceptorProvider.getInterceptors());
                }
                this.mInterceptorProviderIsInited = true;
            }
            for (IInterceptor iInterceptor : this.mInterceptors) {
                if (iInterceptor.matchInterceptRules(routeIntent) && iInterceptor.onInterceptRoute(context, routeIntent)) {
                    return true;
                }
            }
            return false;
        }
    }
}
