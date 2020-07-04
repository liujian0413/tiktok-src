package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.view.MotionEvent;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.UIManagerModule;
import com.swmansion.gesturehandler.C46345a;
import com.swmansion.gesturehandler.C46347b;
import com.swmansion.gesturehandler.C46353g;
import com.swmansion.gesturehandler.C46355h;
import com.swmansion.gesturehandler.C46356i;
import com.swmansion.gesturehandler.C46357j;
import com.swmansion.gesturehandler.C46358k;
import com.swmansion.gesturehandler.C46362m;
import com.swmansion.gesturehandler.C46364n;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@ReactModule(name = "RNGestureHandlerModule")
public class RNGestureHandlerModule extends ReactContextBaseJavaModule {
    public List<Integer> mEnqueuedRootViewInit = new ArrayList();
    private C46356i mEventListener = new C46356i() {
        /* renamed from: a */
        public final void mo115231a(C46347b bVar, MotionEvent motionEvent) {
            RNGestureHandlerModule.this.onTouchEvent(bVar, motionEvent);
        }

        /* renamed from: a */
        public final void mo115230a(C46347b bVar, int i, int i2) {
            RNGestureHandlerModule.this.onStateChange(bVar, i, i2);
        }
    };
    private C46371b[] mHandlerFactories = {new C46373d(), new C46377h(), new C46372c(), new C46374e(), new C46375f(), new C46376g(), new C46370a()};
    private C46381d mInteractionManager = new C46381d();
    private final C46383f mRegistry = new C46383f();
    private List<C46384g> mRoots = new ArrayList();

    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$a */
    static class C46370a extends C46371b<C46345a> {
        /* renamed from: a */
        public final Class<C46345a> mo115291a() {
            return C46345a.class;
        }

        /* renamed from: b */
        public final String mo115294b() {
            return "FlingGestureHandler";
        }

        private C46370a() {
            super();
        }

        /* renamed from: b */
        private static C46345a m145632b(Context context) {
            return new C46345a();
        }

        /* renamed from: a */
        public final /* synthetic */ C46347b mo115290a(Context context) {
            return m145632b(context);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo115292a(C46345a aVar, ReadableMap readableMap) {
            super.mo115292a(aVar, readableMap);
            if (readableMap.hasKey("numberOfPointers")) {
                aVar.f119272b = readableMap.getInt("numberOfPointers");
            }
            if (readableMap.hasKey("direction")) {
                aVar.f119271a = readableMap.getInt("direction");
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo115293a(C46345a aVar, WritableMap writableMap) {
            super.mo115293a(aVar, writableMap);
            writableMap.putDouble("x", (double) PixelUtil.toDIPFromPixel(aVar.mo115217j()));
            writableMap.putDouble("y", (double) PixelUtil.toDIPFromPixel(aVar.mo115218k()));
            writableMap.putDouble("absoluteX", (double) PixelUtil.toDIPFromPixel(aVar.f119291j));
            writableMap.putDouble("absoluteY", (double) PixelUtil.toDIPFromPixel(aVar.f119292k));
        }
    }

    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$b */
    static abstract class C46371b<T extends C46347b> implements C46380c<T> {
        private C46371b() {
        }

        /* renamed from: a */
        public abstract T mo115290a(Context context);

        /* renamed from: a */
        public abstract Class<T> mo115291a();

        /* renamed from: b */
        public abstract String mo115294b();

        /* renamed from: a */
        public void mo115293a(T t, WritableMap writableMap) {
            writableMap.putDouble("numberOfPointers", (double) t.f119293l);
        }

        /* renamed from: a */
        public void mo115292a(T t, ReadableMap readableMap) {
            if (readableMap.hasKey("shouldCancelWhenOutside")) {
                t.mo115195a(readableMap.getBoolean("shouldCancelWhenOutside"));
            }
            if (readableMap.hasKey("enabled")) {
                t.mo115201b(readableMap.getBoolean("enabled"));
            }
            if (readableMap.hasKey("hitSlop")) {
                RNGestureHandlerModule.handleHitSlopProperty(t, readableMap);
            }
        }
    }

    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$c */
    static class C46372c extends C46371b<C46353g> {
        /* renamed from: a */
        public final Class<C46353g> mo115291a() {
            return C46353g.class;
        }

        /* renamed from: b */
        public final String mo115294b() {
            return "LongPressGestureHandler";
        }

        private C46372c() {
            super();
        }

        /* renamed from: b */
        private static C46353g m145645b(Context context) {
            return new C46353g(context);
        }

        /* renamed from: a */
        public final /* synthetic */ C46347b mo115290a(Context context) {
            return m145645b(context);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo115292a(C46353g gVar, ReadableMap readableMap) {
            super.mo115292a(gVar, readableMap);
            if (readableMap.hasKey("minDurationMs")) {
                gVar.f119326a = (long) readableMap.getInt("minDurationMs");
            }
            if (readableMap.hasKey("maxDist")) {
                gVar.mo115226a(PixelUtil.toPixelFromDIP(readableMap.getDouble("maxDist")));
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo115293a(C46353g gVar, WritableMap writableMap) {
            super.mo115293a(gVar, writableMap);
            writableMap.putDouble("x", (double) PixelUtil.toDIPFromPixel(gVar.mo115217j()));
            writableMap.putDouble("y", (double) PixelUtil.toDIPFromPixel(gVar.mo115218k()));
            writableMap.putDouble("absoluteX", (double) PixelUtil.toDIPFromPixel(gVar.f119291j));
            writableMap.putDouble("absoluteY", (double) PixelUtil.toDIPFromPixel(gVar.f119292k));
        }
    }

    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$d */
    static class C46373d extends C46371b<C46355h> {
        /* renamed from: a */
        public final Class<C46355h> mo115291a() {
            return C46355h.class;
        }

        /* renamed from: b */
        public final String mo115294b() {
            return "NativeViewGestureHandler";
        }

        private C46373d() {
            super();
        }

        /* renamed from: b */
        private static C46355h m145653b(Context context) {
            return new C46355h();
        }

        /* renamed from: a */
        public final /* synthetic */ C46347b mo115290a(Context context) {
            return m145653b(context);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo115293a(C46355h hVar, WritableMap writableMap) {
            super.mo115293a(hVar, writableMap);
            writableMap.putBoolean("pointerInside", hVar.f119289h);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo115292a(C46355h hVar, ReadableMap readableMap) {
            super.mo115292a(hVar, readableMap);
            if (readableMap.hasKey("shouldActivateOnStart")) {
                hVar.mo115228c(readableMap.getBoolean("shouldActivateOnStart"));
            }
            if (readableMap.hasKey("disallowInterruption")) {
                hVar.mo115229d(readableMap.getBoolean("disallowInterruption"));
            }
        }
    }

    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$e */
    static class C46374e extends C46371b<C46357j> {
        /* renamed from: a */
        public final Class<C46357j> mo115291a() {
            return C46357j.class;
        }

        /* renamed from: b */
        public final String mo115294b() {
            return "PanGestureHandler";
        }

        private C46374e() {
            super();
        }

        /* renamed from: b */
        private static C46357j m145661b(Context context) {
            return new C46357j(context);
        }

        /* renamed from: a */
        public final /* synthetic */ C46347b mo115290a(Context context) {
            return m145661b(context);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo115293a(C46357j jVar, WritableMap writableMap) {
            super.mo115293a(jVar, writableMap);
            writableMap.putDouble("x", (double) PixelUtil.toDIPFromPixel(jVar.mo115217j()));
            writableMap.putDouble("y", (double) PixelUtil.toDIPFromPixel(jVar.mo115218k()));
            writableMap.putDouble("absoluteX", (double) PixelUtil.toDIPFromPixel(jVar.f119291j));
            writableMap.putDouble("absoluteY", (double) PixelUtil.toDIPFromPixel(jVar.f119292k));
            writableMap.putDouble("translationX", (double) PixelUtil.toDIPFromPixel(jVar.mo115245l()));
            writableMap.putDouble("translationY", (double) PixelUtil.toDIPFromPixel(jVar.mo115247m()));
            writableMap.putDouble("velocityX", (double) PixelUtil.toDIPFromPixel(jVar.f119353a));
            writableMap.putDouble("velocityY", (double) PixelUtil.toDIPFromPixel(jVar.f119354b));
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo115292a(C46357j jVar, ReadableMap readableMap) {
            boolean z;
            super.mo115292a(jVar, readableMap);
            if (readableMap.hasKey("activeOffsetXStart")) {
                jVar.mo115226a(PixelUtil.toPixelFromDIP(readableMap.getDouble("activeOffsetXStart")));
                z = true;
            } else {
                z = false;
            }
            if (readableMap.hasKey("activeOffsetXEnd")) {
                jVar.mo115232b(PixelUtil.toPixelFromDIP(readableMap.getDouble("activeOffsetXEnd")));
                z = true;
            }
            if (readableMap.hasKey("failOffsetXStart")) {
                jVar.mo115233c(PixelUtil.toPixelFromDIP(readableMap.getDouble("failOffsetXStart")));
                z = true;
            }
            if (readableMap.hasKey("failOffsetXEnd")) {
                jVar.mo115236d(PixelUtil.toPixelFromDIP(readableMap.getDouble("failOffsetXEnd")));
                z = true;
            }
            if (readableMap.hasKey("activeOffsetYStart")) {
                jVar.mo115238e(PixelUtil.toPixelFromDIP(readableMap.getDouble("activeOffsetYStart")));
                z = true;
            }
            if (readableMap.hasKey("activeOffsetYEnd")) {
                jVar.mo115239f(PixelUtil.toPixelFromDIP(readableMap.getDouble("activeOffsetYEnd")));
                z = true;
            }
            if (readableMap.hasKey("failOffsetYStart")) {
                jVar.mo115240g(PixelUtil.toPixelFromDIP(readableMap.getDouble("failOffsetYStart")));
                z = true;
            }
            if (readableMap.hasKey("failOffsetYEnd")) {
                jVar.mo115241h(PixelUtil.toPixelFromDIP(readableMap.getDouble("failOffsetYEnd")));
                z = true;
            }
            if (readableMap.hasKey("minVelocity")) {
                jVar.mo115243j(PixelUtil.toPixelFromDIP(readableMap.getDouble("minVelocity")));
                z = true;
            }
            if (readableMap.hasKey("minVelocityX")) {
                jVar.mo115244k(PixelUtil.toPixelFromDIP(readableMap.getDouble("minVelocityX")));
                z = true;
            }
            if (readableMap.hasKey("minVelocityY")) {
                jVar.mo115246l(PixelUtil.toPixelFromDIP(readableMap.getDouble("minVelocityY")));
                z = true;
            }
            if (readableMap.hasKey("minDist")) {
                jVar.mo115242i(PixelUtil.toPixelFromDIP(readableMap.getDouble("minDist")));
            } else if (z) {
                jVar.mo115242i(Float.MAX_VALUE);
            }
            if (readableMap.hasKey("minPointers")) {
                jVar.mo115234c(readableMap.getInt("minPointers"));
            }
            if (readableMap.hasKey("maxPointers")) {
                jVar.mo115237d(readableMap.getInt("maxPointers"));
            }
            if (readableMap.hasKey("avgTouches")) {
                jVar.mo115235c(readableMap.getBoolean("avgTouches"));
            }
        }
    }

    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$f */
    static class C46375f extends C46371b<C46358k> {
        /* renamed from: a */
        public final Class<C46358k> mo115291a() {
            return C46358k.class;
        }

        /* renamed from: b */
        public final String mo115294b() {
            return "PinchGestureHandler";
        }

        private C46375f() {
            super();
        }

        /* renamed from: b */
        private static C46358k m145668b(Context context) {
            return new C46358k();
        }

        /* renamed from: a */
        public final /* synthetic */ C46347b mo115290a(Context context) {
            return m145668b(context);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo115293a(C46358k kVar, WritableMap writableMap) {
            super.mo115293a(kVar, writableMap);
            writableMap.putDouble("scale", kVar.f119362a);
            writableMap.putDouble("focalX", (double) PixelUtil.toDIPFromPixel(kVar.mo115245l()));
            writableMap.putDouble("focalY", (double) PixelUtil.toDIPFromPixel(kVar.mo115248m()));
            writableMap.putDouble("velocity", kVar.f119363b);
        }
    }

    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$g */
    static class C46376g extends C46371b<C46362m> {
        /* renamed from: a */
        public final Class<C46362m> mo115291a() {
            return C46362m.class;
        }

        /* renamed from: b */
        public final String mo115294b() {
            return "RotationGestureHandler";
        }

        private C46376g() {
            super();
        }

        /* renamed from: b */
        private static C46362m m145674b(Context context) {
            return new C46362m();
        }

        /* renamed from: a */
        public final /* synthetic */ C46347b mo115290a(Context context) {
            return m145674b(context);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo115293a(C46362m mVar, WritableMap writableMap) {
            super.mo115293a(mVar, writableMap);
            writableMap.putDouble("rotation", mVar.f119378a);
            writableMap.putDouble("anchorX", (double) PixelUtil.toDIPFromPixel(mVar.mo115245l()));
            writableMap.putDouble("anchorY", (double) PixelUtil.toDIPFromPixel(mVar.mo115256m()));
            writableMap.putDouble("velocity", mVar.f119379b);
        }
    }

    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$h */
    static class C46377h extends C46371b<C46364n> {
        /* renamed from: a */
        public final Class<C46364n> mo115291a() {
            return C46364n.class;
        }

        /* renamed from: b */
        public final String mo115294b() {
            return "TapGestureHandler";
        }

        private C46377h() {
            super();
        }

        /* renamed from: b */
        private static C46364n m145681b(Context context) {
            return new C46364n();
        }

        /* renamed from: a */
        public final /* synthetic */ C46347b mo115290a(Context context) {
            return m145681b(context);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo115293a(C46364n nVar, WritableMap writableMap) {
            super.mo115293a(nVar, writableMap);
            writableMap.putDouble("x", (double) PixelUtil.toDIPFromPixel(nVar.mo115217j()));
            writableMap.putDouble("y", (double) PixelUtil.toDIPFromPixel(nVar.mo115218k()));
            writableMap.putDouble("absoluteX", (double) PixelUtil.toDIPFromPixel(nVar.f119291j));
            writableMap.putDouble("absoluteY", (double) PixelUtil.toDIPFromPixel(nVar.f119292k));
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo115292a(C46364n nVar, ReadableMap readableMap) {
            super.mo115292a(nVar, readableMap);
            if (readableMap.hasKey("numberOfTaps")) {
                nVar.mo115234c(readableMap.getInt("numberOfTaps"));
            }
            if (readableMap.hasKey("maxDurationMs")) {
                nVar.mo115259b((long) readableMap.getInt("maxDurationMs"));
            }
            if (readableMap.hasKey("maxDelayMs")) {
                nVar.mo115257a((long) readableMap.getInt("maxDelayMs"));
            }
            if (readableMap.hasKey("maxDeltaX")) {
                nVar.mo115226a(PixelUtil.toPixelFromDIP(readableMap.getDouble("maxDeltaX")));
            }
            if (readableMap.hasKey("maxDeltaY")) {
                nVar.mo115258b(PixelUtil.toPixelFromDIP(readableMap.getDouble("maxDeltaY")));
            }
            if (readableMap.hasKey("maxDist")) {
                nVar.mo115260c(PixelUtil.toPixelFromDIP(readableMap.getDouble("maxDist")));
            }
            if (readableMap.hasKey("minPointers")) {
                nVar.mo115237d(readableMap.getInt("minPointers"));
            }
        }
    }

    public String getName() {
        return "RNGestureHandlerModule";
    }

    public C46383f getRegistry() {
        return this.mRegistry;
    }

    @ReactMethod
    public void handleClearJSResponder() {
    }

    public Map getConstants() {
        return MapBuilder.m41789of("State", MapBuilder.m41793of("UNDETERMINED", Integer.valueOf(0), "BEGAN", Integer.valueOf(2), "ACTIVE", Integer.valueOf(4), "CANCELLED", Integer.valueOf(3), "FAILED", Integer.valueOf(1), "END", Integer.valueOf(5)), "Direction", MapBuilder.m41791of("RIGHT", Integer.valueOf(1), "LEFT", Integer.valueOf(2), "UP", Integer.valueOf(4), "DOWN", Integer.valueOf(8)));
    }

    public void onCatalystInstanceDestroy() {
        this.mRegistry.mo115303a();
        this.mInteractionManager.mo115299a();
        synchronized (this.mRoots) {
            while (!this.mRoots.isEmpty()) {
                int size = this.mRoots.size();
                C46384g gVar = (C46384g) this.mRoots.get(0);
                ReactRootView reactRootView = gVar.f119421a;
                if (reactRootView instanceof C46378a) {
                    ((C46378a) reactRootView).mo115297b();
                } else {
                    gVar.mo115307a();
                }
                if (this.mRoots.size() >= size) {
                    throw new IllegalStateException("Expected root helper to get unregistered while tearing down");
                }
            }
        }
        super.onCatalystInstanceDestroy();
    }

    @ReactMethod
    public void dropGestureHandler(int i) {
        this.mInteractionManager.mo115300a(i);
        this.mRegistry.mo115306b(i);
    }

    public void unregisterRootHelper(C46384g gVar) {
        synchronized (this.mRoots) {
            this.mRoots.remove(gVar);
        }
    }

    private C46371b findFactoryForHandler(C46347b bVar) {
        for (C46371b bVar2 : this.mHandlerFactories) {
            if (bVar2.mo115291a().equals(bVar.getClass())) {
                return bVar2;
            }
        }
        return null;
    }

    private C46384g findRootHelperForViewAncestor(int i) {
        int resolveRootTagFromReactTag = ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).resolveRootTagFromReactTag(i);
        if (resolveRootTagFromReactTag <= 0) {
            return null;
        }
        synchronized (this.mRoots) {
            for (int i2 = 0; i2 < this.mRoots.size(); i2++) {
                C46384g gVar = (C46384g) this.mRoots.get(i2);
                if (gVar.f119421a.getRootViewTag() == resolveRootTagFromReactTag) {
                    return gVar;
                }
            }
            return null;
        }
    }

    public void registerRootHelper(C46384g gVar) {
        synchronized (this.mRoots) {
            if (!this.mRoots.contains(gVar)) {
                this.mRoots.add(gVar);
            } else {
                StringBuilder sb = new StringBuilder("Root helper");
                sb.append(gVar);
                sb.append(" already registered");
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    public RNGestureHandlerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        r5 = r4.mEnqueuedRootViewInit;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        if (r4.mEnqueuedRootViewInit.contains(java.lang.Integer.valueOf(r1)) == false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0044, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0045, code lost:
        r4.mEnqueuedRootViewInit.add(java.lang.Integer.valueOf(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004f, code lost:
        r0.addUIBlock(new com.swmansion.gesturehandler.react.RNGestureHandlerModule.C463692(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0057, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void tryInitializeHandlerForReactRootView(int r5) {
        /*
            r4 = this;
            com.facebook.react.bridge.ReactApplicationContext r0 = r4.getReactApplicationContext()
            java.lang.Class<com.facebook.react.uimanager.UIManagerModule> r1 = com.facebook.react.uimanager.UIManagerModule.class
            com.facebook.react.bridge.NativeModule r0 = r0.getNativeModule(r1)
            com.facebook.react.uimanager.UIManagerModule r0 = (com.facebook.react.uimanager.UIManagerModule) r0
            int r1 = r0.resolveRootTagFromReactTag(r5)
            if (r1 <= 0) goto L_0x005e
            java.util.List<com.swmansion.gesturehandler.react.g> r2 = r4.mRoots
            monitor-enter(r2)
            r5 = 0
        L_0x0016:
            java.util.List<com.swmansion.gesturehandler.react.g> r3 = r4.mRoots     // Catch:{ all -> 0x005b }
            int r3 = r3.size()     // Catch:{ all -> 0x005b }
            if (r5 >= r3) goto L_0x0033
            java.util.List<com.swmansion.gesturehandler.react.g> r3 = r4.mRoots     // Catch:{ all -> 0x005b }
            java.lang.Object r3 = r3.get(r5)     // Catch:{ all -> 0x005b }
            com.swmansion.gesturehandler.react.g r3 = (com.swmansion.gesturehandler.react.C46384g) r3     // Catch:{ all -> 0x005b }
            com.facebook.react.ReactRootView r3 = r3.f119421a     // Catch:{ all -> 0x005b }
            int r3 = r3.getRootViewTag()     // Catch:{ all -> 0x005b }
            if (r3 != r1) goto L_0x0030
            monitor-exit(r2)     // Catch:{ all -> 0x005b }
            return
        L_0x0030:
            int r5 = r5 + 1
            goto L_0x0016
        L_0x0033:
            monitor-exit(r2)     // Catch:{ all -> 0x005b }
            java.util.List<java.lang.Integer> r5 = r4.mEnqueuedRootViewInit
            monitor-enter(r5)
            java.util.List<java.lang.Integer> r2 = r4.mEnqueuedRootViewInit     // Catch:{ all -> 0x0058 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0058 }
            boolean r2 = r2.contains(r3)     // Catch:{ all -> 0x0058 }
            if (r2 == 0) goto L_0x0045
            monitor-exit(r5)     // Catch:{ all -> 0x0058 }
            return
        L_0x0045:
            java.util.List<java.lang.Integer> r2 = r4.mEnqueuedRootViewInit     // Catch:{ all -> 0x0058 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0058 }
            r2.add(r3)     // Catch:{ all -> 0x0058 }
            monitor-exit(r5)     // Catch:{ all -> 0x0058 }
            com.swmansion.gesturehandler.react.RNGestureHandlerModule$2 r5 = new com.swmansion.gesturehandler.react.RNGestureHandlerModule$2
            r5.<init>(r1)
            r0.addUIBlock(r5)
            return
        L_0x0058:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0058 }
            throw r0
        L_0x005b:
            r5 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x005b }
            throw r5
        L_0x005e:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r0 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Could find root view for a given ancestor with tag "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.gesturehandler.react.RNGestureHandlerModule.tryInitializeHandlerForReactRootView(int):void");
    }

    @ReactMethod
    public void handleSetJSResponder(int i, boolean z) {
        if (this.mRegistry != null) {
            C46384g findRootHelperForViewAncestor = findRootHelperForViewAncestor(i);
            if (findRootHelperForViewAncestor != null) {
                findRootHelperForViewAncestor.mo115308a(i, z);
            }
        }
    }

    @ReactMethod
    public void updateGestureHandler(int i, ReadableMap readableMap) {
        C46347b a = this.mRegistry.mo115302a(i);
        if (a != null) {
            C46371b findFactoryForHandler = findFactoryForHandler(a);
            if (findFactoryForHandler != null) {
                this.mInteractionManager.mo115300a(i);
                this.mInteractionManager.mo115301a(a, readableMap);
                findFactoryForHandler.mo115292a(a, readableMap);
            }
        }
    }

    @ReactMethod
    public void attachGestureHandler(int i, int i2) {
        tryInitializeHandlerForReactRootView(i2);
        if (!this.mRegistry.mo115305a(i, i2)) {
            StringBuilder sb = new StringBuilder("Handler with tag ");
            sb.append(i);
            sb.append(" does not exists");
            throw new JSApplicationIllegalArgumentException(sb.toString());
        }
    }

    public void onTouchEvent(C46347b bVar, MotionEvent motionEvent) {
        if (bVar.f119284c >= 0 && bVar.f119286e == 4) {
            ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(C46379b.m145689a(bVar, findFactoryForHandler(bVar)));
        }
    }

    public static void handleHitSlopProperty(C46347b bVar, ReadableMap readableMap) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        if (readableMap.getType("hitSlop") == ReadableType.Number) {
            float pixelFromDIP = PixelUtil.toPixelFromDIP(readableMap.getDouble("hitSlop"));
            bVar.mo115192a(pixelFromDIP, pixelFromDIP, pixelFromDIP, pixelFromDIP, Float.NaN, Float.NaN);
            return;
        }
        ReadableMap map = readableMap.getMap("hitSlop");
        if (map.hasKey("horizontal")) {
            f2 = PixelUtil.toPixelFromDIP(map.getDouble("horizontal"));
            f = f2;
        } else {
            f2 = Float.NaN;
            f = Float.NaN;
        }
        if (map.hasKey("vertical")) {
            f4 = PixelUtil.toPixelFromDIP(map.getDouble("vertical"));
            f3 = f4;
        } else {
            f4 = Float.NaN;
            f3 = Float.NaN;
        }
        if (map.hasKey("left")) {
            f2 = PixelUtil.toPixelFromDIP(map.getDouble("left"));
        }
        float f7 = f2;
        if (map.hasKey("top")) {
            f4 = PixelUtil.toPixelFromDIP(map.getDouble("top"));
        }
        float f8 = f4;
        if (map.hasKey("right")) {
            f = PixelUtil.toPixelFromDIP(map.getDouble("right"));
        }
        float f9 = f;
        if (map.hasKey("bottom")) {
            f3 = PixelUtil.toPixelFromDIP(map.getDouble("bottom"));
        }
        float f10 = f3;
        if (map.hasKey("width")) {
            f5 = PixelUtil.toPixelFromDIP(map.getDouble("width"));
        } else {
            f5 = Float.NaN;
        }
        if (map.hasKey("height")) {
            f6 = PixelUtil.toPixelFromDIP(map.getDouble("height"));
        } else {
            f6 = Float.NaN;
        }
        bVar.mo115192a(f7, f8, f9, f10, f5, f6);
    }

    public void onStateChange(C46347b bVar, int i, int i2) {
        if (bVar.f119284c >= 0) {
            ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(C46388i.m145716a(bVar, i, i2, findFactoryForHandler(bVar)));
        }
    }

    @ReactMethod
    public void createGestureHandler(String str, int i, ReadableMap readableMap) {
        for (C46371b bVar : this.mHandlerFactories) {
            if (bVar.mo115294b().equals(str)) {
                C46347b a = bVar.mo115290a(getReactApplicationContext());
                a.f119284c = i;
                a.mo115194a(this.mEventListener);
                this.mRegistry.mo115304a(a);
                this.mInteractionManager.mo115301a(a, readableMap);
                bVar.mo115292a(a, readableMap);
                return;
            }
        }
        StringBuilder sb = new StringBuilder("Invalid handler name ");
        sb.append(str);
        throw new JSApplicationIllegalArgumentException(sb.toString());
    }
}
