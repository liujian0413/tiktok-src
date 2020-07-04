package com.facebook.react.modules.image;

import android.net.Uri;
import android.util.SparseArray;
import com.facebook.common.p685b.C13275a;
import com.facebook.common.references.C13326a;
import com.facebook.datasource.C13345b;
import com.facebook.datasource.C13346c;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.imagepipeline.p717d.C13606i;
import com.facebook.imagepipeline.p720g.C13645c;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "ImageLoader")
public class ImageLoaderModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    private final Object mCallerContext;
    private final Object mEnqueuedRequestMonitor;
    private final SparseArray<C13346c<Void>> mEnqueuedRequests;

    public String getName() {
        return "ImageLoader";
    }

    public void onHostPause() {
    }

    public void onHostResume() {
    }

    public void onHostDestroy() {
        synchronized (this.mEnqueuedRequestMonitor) {
            int size = this.mEnqueuedRequests.size();
            for (int i = 0; i < size; i++) {
                C13346c cVar = (C13346c) this.mEnqueuedRequests.valueAt(i);
                if (cVar != null) {
                    cVar.mo32644g();
                }
            }
            this.mEnqueuedRequests.clear();
        }
    }

    @ReactMethod
    public void abortRequest(int i) {
        C13346c removeRequest = removeRequest(i);
        if (removeRequest != null) {
            removeRequest.mo32644g();
        }
    }

    public ImageLoaderModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mEnqueuedRequestMonitor = new Object();
        this.mEnqueuedRequests = new SparseArray<>();
        this.mCallerContext = this;
    }

    public C13346c<Void> removeRequest(int i) {
        C13346c<Void> cVar;
        synchronized (this.mEnqueuedRequestMonitor) {
            cVar = (C13346c) this.mEnqueuedRequests.get(i);
            this.mEnqueuedRequests.remove(i);
        }
        return cVar;
    }

    private void registerRequest(int i, C13346c<Void> cVar) {
        synchronized (this.mEnqueuedRequestMonitor) {
            this.mEnqueuedRequests.put(i, cVar);
        }
    }

    @ReactMethod
    public void queryCache(final ReadableArray readableArray, final Promise promise) {
        new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) {
            /* access modifiers changed from: protected */
            public void doInBackgroundGuarded(Void... voidArr) {
                WritableMap createMap = Arguments.createMap();
                C13606i c = C13380c.m39172c();
                for (int i = 0; i < readableArray.size(); i++) {
                    String string = readableArray.getString(i);
                    Uri parse = Uri.parse(string);
                    if (c.mo33184c(parse)) {
                        createMap.putString(string, "memory");
                    } else if (c.mo33187d(parse)) {
                        createMap.putString(string, "disk");
                    }
                }
                promise.resolve(createMap);
            }
        }.executeOnExecutor(GuardedAsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public ImageLoaderModule(ReactApplicationContext reactApplicationContext, Object obj) {
        super(reactApplicationContext);
        this.mEnqueuedRequestMonitor = new Object();
        this.mEnqueuedRequests = new SparseArray<>();
        this.mCallerContext = obj;
    }

    @ReactMethod
    public void getSize(String str, final Promise promise) {
        if (str == null || str.isEmpty()) {
            promise.reject("E_INVALID_URI", "Cannot get the size of an image for an empty URI");
            return;
        }
        C13380c.m39172c().mo33172a(ImageRequestBuilder.m40865a(Uri.parse(str)).mo33476b(), this.mCallerContext).mo32633a(new C13345b<C13326a<C13645c>>() {
            public void onFailureImpl(C13346c<C13326a<C13645c>> cVar) {
                promise.reject("E_GET_SIZE_FAILURE", cVar.mo32642e());
            }

            public void onNewResultImpl(C13346c<C13326a<C13645c>> cVar) {
                if (cVar.mo32639b()) {
                    C13326a aVar = (C13326a) cVar.mo32641d();
                    if (aVar != null) {
                        try {
                            C13645c cVar2 = (C13645c) aVar.mo32609a();
                            WritableMap createMap = Arguments.createMap();
                            createMap.putInt("width", cVar2.getWidth());
                            createMap.putInt("height", cVar2.getHeight());
                            promise.resolve(createMap);
                        } catch (Exception e) {
                            promise.reject("E_GET_SIZE_FAILURE", (Throwable) e);
                        } catch (Throwable th) {
                            C13326a.m39001c(aVar);
                            throw th;
                        }
                        C13326a.m39001c(aVar);
                    } else {
                        promise.reject("E_GET_SIZE_FAILURE");
                    }
                }
            }
        }, C13275a.m38815a());
    }

    @ReactMethod
    public void prefetchImage(String str, final int i, final Promise promise) {
        if (str == null || str.isEmpty()) {
            promise.reject("E_INVALID_URI", "Cannot prefetch an image for an empty URI");
            return;
        }
        C13346c d = C13380c.m39172c().mo33185d(ImageRequestBuilder.m40865a(Uri.parse(str)).mo33476b(), this.mCallerContext);
        C143472 r0 = new C13345b<Void>() {
            public void onFailureImpl(C13346c<Void> cVar) {
                try {
                    ImageLoaderModule.this.removeRequest(i);
                    promise.reject("E_PREFETCH_FAILURE", cVar.mo32642e());
                } finally {
                    cVar.mo32644g();
                }
            }

            public void onNewResultImpl(C13346c<Void> cVar) {
                if (cVar.mo32639b()) {
                    try {
                        ImageLoaderModule.this.removeRequest(i);
                        promise.resolve(Boolean.valueOf(true));
                    } finally {
                        cVar.mo32644g();
                    }
                }
            }
        };
        registerRequest(i, d);
        d.mo32633a(r0, C13275a.m38815a());
    }
}
