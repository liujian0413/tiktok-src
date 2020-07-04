package com.p280ss.android.ugc.aweme.web;

import android.arch.lifecycle.C0043i;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.p022v4.util.C0905l;
import com.p280ss.android.ugc.aweme.web.IJsCallback;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.ss.android.ugc.aweme.web.BaseJsNativeCallback */
public abstract class BaseJsNativeCallback<CALLBACK extends IJsCallback> extends BaseLifeCycleObserver {

    /* renamed from: a */
    public CALLBACK f112494a;

    /* renamed from: b */
    public ResultReceiver f112495b;

    /* renamed from: c */
    private C0905l<Method> f112496c;

    /* renamed from: d */
    private C0043i f112497d;

    /* renamed from: com.ss.android.ugc.aweme.web.BaseJsNativeCallback$1 */
    class C434311 extends ResultReceiver {

        /* renamed from: a */
        final /* synthetic */ BaseJsNativeCallback f112498a;

        /* access modifiers changed from: protected */
        public void onReceiveResult(int i, Bundle bundle) {
            this.f112498a.mo105358a(i, bundle);
        }
    }

    /* renamed from: a */
    private void m137821a() {
        if (this.f112496c == null) {
            Method[] methods = this.f112494a.getClass().getMethods();
            this.f112496c = new C0905l<>();
            for (Method method : methods) {
                C7282f fVar = (C7282f) method.getAnnotation(C7282f.class);
                if (fVar != null) {
                    this.f112496c.mo3437b(fVar.mo19011a(), method);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void onDestroy(C0043i iVar) {
        super.onDestroy(iVar);
        this.f112495b = null;
        this.f112497d.getLifecycle().mo56b(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo105358a(int i, Bundle bundle) {
        m137821a();
        try {
            Method method = (Method) this.f112496c.mo3433a(i);
            if (method != null) {
                method.invoke(this.f112494a, new Object[]{bundle});
            }
        } catch (IllegalAccessException unused) {
        } catch (InvocationTargetException unused2) {
        }
    }
}
