package com.facebook.react.uimanager;

import android.os.SystemClock;
import com.facebook.common.p686c.C13286a;
import com.facebook.react.animation.Animation;
import com.facebook.react.animation.AnimationRegistry;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.modules.core.ReactChoreographer.CallbackType;
import com.facebook.react.uimanager.common.SizeMonitoringFrameLayout;
import com.facebook.react.uimanager.debug.NotThreadSafeViewHierarchyUpdateDebugListener;
import com.facebook.systrace.Systrace;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UIViewOperationQueue {
    public final AnimationRegistry mAnimationRegistry;
    private final Object mDispatchRunnablesLock = new Object();
    private final DispatchUIFrameCallback mDispatchUIFrameCallback;
    private ArrayList<Runnable> mDispatchUIRunnables = new ArrayList<>();
    private boolean mIsDispatchUIFrameCallbackEnqueued = false;
    public boolean mIsInIllegalUIState = false;
    public boolean mIsProfilingNextBatch = false;
    public final int[] mMeasureBuffer = new int[4];
    public final NativeViewHierarchyManager mNativeViewHierarchyManager;
    public long mNonBatchedExecutionTotalTime;
    public ArrayDeque<UIOperation> mNonBatchedOperations = new ArrayDeque<>();
    public final Object mNonBatchedOperationsLock = new Object();
    private ArrayList<UIOperation> mOperations = new ArrayList<>();
    private long mProfiledBatchBatchedExecutionTime;
    public long mProfiledBatchCommitStartTime;
    public long mProfiledBatchDispatchViewUpdatesTime;
    public long mProfiledBatchLayoutTime;
    private long mProfiledBatchNonBatchedExecutionTime;
    public long mProfiledBatchRunStartTime;
    private final ReactApplicationContext mReactApplicationContext;
    public NotThreadSafeViewHierarchyUpdateDebugListener mViewHierarchyUpdateDebugListener;

    class AddAnimationOperation extends AnimationOperation {
        private final int mReactTag;
        private final Callback mSuccessCallback;

        public void execute() {
            Animation animation = UIViewOperationQueue.this.mAnimationRegistry.getAnimation(this.mAnimationID);
            if (animation != null) {
                UIViewOperationQueue.this.mNativeViewHierarchyManager.startAnimationForNativeView(this.mReactTag, animation, this.mSuccessCallback);
                return;
            }
            StringBuilder sb = new StringBuilder("Animation with id ");
            sb.append(this.mAnimationID);
            sb.append(" was not found");
            throw new IllegalViewOperationException(sb.toString());
        }

        private AddAnimationOperation(int i, int i2, Callback callback) {
            super(i2);
            this.mReactTag = i;
            this.mSuccessCallback = callback;
        }
    }

    static abstract class AnimationOperation implements UIOperation {
        protected final int mAnimationID;

        public AnimationOperation(int i) {
            this.mAnimationID = i;
        }
    }

    final class ChangeJSResponderOperation extends ViewOperation {
        private final boolean mBlockNativeResponder;
        private final boolean mClearResponder;
        private final int mInitialTag;

        public final void execute() {
            if (!this.mClearResponder) {
                UIViewOperationQueue.this.mNativeViewHierarchyManager.setJSResponder(this.mTag, this.mInitialTag, this.mBlockNativeResponder);
            } else {
                UIViewOperationQueue.this.mNativeViewHierarchyManager.clearJSResponder();
            }
        }

        public ChangeJSResponderOperation(int i, int i2, boolean z, boolean z2) {
            super(i);
            this.mInitialTag = i2;
            this.mClearResponder = z;
            this.mBlockNativeResponder = z2;
        }
    }

    class ConfigureLayoutAnimationOperation implements UIOperation {
        private final ReadableMap mConfig;

        public void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.configureLayoutAnimation(this.mConfig);
        }

        private ConfigureLayoutAnimationOperation(ReadableMap readableMap) {
            this.mConfig = readableMap;
        }
    }

    final class CreateViewOperation extends ViewOperation {
        private final String mClassName;
        private final ReactStylesDiffMap mInitialProps;
        private final ThemedReactContext mThemedContext;

        public final void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.createView(this.mThemedContext, this.mTag, this.mClassName, this.mInitialProps);
        }

        public CreateViewOperation(ThemedReactContext themedReactContext, int i, String str, ReactStylesDiffMap reactStylesDiffMap) {
            super(i);
            this.mThemedContext = themedReactContext;
            this.mClassName = str;
            this.mInitialProps = reactStylesDiffMap;
        }
    }

    final class DispatchCommandOperation extends ViewOperation {
        private final ReadableArray mArgs;
        private final int mCommand;

        public final void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.dispatchCommand(this.mTag, this.mCommand, this.mArgs);
        }

        public DispatchCommandOperation(int i, int i2, ReadableArray readableArray) {
            super(i);
            this.mCommand = i2;
            this.mArgs = readableArray;
        }
    }

    class DispatchUIFrameCallback extends GuardedFrameCallback {
        private final int mMinTimeLeftInFrameForNonBatchedOperationMs;

        /* JADX INFO: finally extract failed */
        public void doFrameGuarded(long j) {
            if (UIViewOperationQueue.this.mIsInIllegalUIState) {
                C13286a.m38860c("ReactNative", "Not flushing pending UI operations because of previously thrown Exception");
                return;
            }
            Systrace.m42324a(0, "dispatchNonBatchedUIOperations");
            try {
                dispatchPendingNonBatchedOperations(j);
                Systrace.m42323a(0);
                UIViewOperationQueue.this.flushPendingBatches();
                ReactChoreographer.getInstance().postFrameCallback(CallbackType.DISPATCH_UI, this);
            } catch (Throwable th) {
                Systrace.m42323a(0);
                throw th;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
            r2 = android.os.SystemClock.uptimeMillis();
            r1.execute();
            r8.this$0.mNonBatchedExecutionTotalTime += android.os.SystemClock.uptimeMillis() - r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
            r9 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
            throw r9;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void dispatchPendingNonBatchedOperations(long r9) {
            /*
                r8 = this;
            L_0x0000:
                r0 = 16
                long r2 = java.lang.System.nanoTime()
                long r2 = r2 - r9
                r4 = 1000000(0xf4240, double:4.940656E-318)
                long r2 = r2 / r4
                long r0 = r0 - r2
                int r2 = r8.mMinTimeLeftInFrameForNonBatchedOperationMs
                long r2 = (long) r2
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 < 0) goto L_0x004b
                com.facebook.react.uimanager.UIViewOperationQueue r0 = com.facebook.react.uimanager.UIViewOperationQueue.this
                java.lang.Object r0 = r0.mNonBatchedOperationsLock
                monitor-enter(r0)
                com.facebook.react.uimanager.UIViewOperationQueue r1 = com.facebook.react.uimanager.UIViewOperationQueue.this     // Catch:{ all -> 0x0048 }
                java.util.ArrayDeque<com.facebook.react.uimanager.UIViewOperationQueue$UIOperation> r1 = r1.mNonBatchedOperations     // Catch:{ all -> 0x0048 }
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0048 }
                if (r1 == 0) goto L_0x0024
                monitor-exit(r0)     // Catch:{ all -> 0x0048 }
                return
            L_0x0024:
                com.facebook.react.uimanager.UIViewOperationQueue r1 = com.facebook.react.uimanager.UIViewOperationQueue.this     // Catch:{ all -> 0x0048 }
                java.util.ArrayDeque<com.facebook.react.uimanager.UIViewOperationQueue$UIOperation> r1 = r1.mNonBatchedOperations     // Catch:{ all -> 0x0048 }
                java.lang.Object r1 = r1.pollFirst()     // Catch:{ all -> 0x0048 }
                com.facebook.react.uimanager.UIViewOperationQueue$UIOperation r1 = (com.facebook.react.uimanager.UIViewOperationQueue.UIOperation) r1     // Catch:{ all -> 0x0048 }
                monitor-exit(r0)     // Catch:{ all -> 0x0048 }
                long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0046 }
                r1.execute()     // Catch:{ Exception -> 0x0046 }
                com.facebook.react.uimanager.UIViewOperationQueue r0 = com.facebook.react.uimanager.UIViewOperationQueue.this     // Catch:{ Exception -> 0x0046 }
                com.facebook.react.uimanager.UIViewOperationQueue r1 = com.facebook.react.uimanager.UIViewOperationQueue.this     // Catch:{ Exception -> 0x0046 }
                long r4 = r1.mNonBatchedExecutionTotalTime     // Catch:{ Exception -> 0x0046 }
                long r6 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0046 }
                r1 = 0
                long r6 = r6 - r2
                long r4 = r4 + r6
                r0.mNonBatchedExecutionTotalTime = r4     // Catch:{ Exception -> 0x0046 }
                goto L_0x0000
            L_0x0046:
                r9 = move-exception
                throw r9
            L_0x0048:
                r9 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0048 }
                throw r9
            L_0x004b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.UIViewOperationQueue.DispatchUIFrameCallback.dispatchPendingNonBatchedOperations(long):void");
        }

        private DispatchUIFrameCallback(ReactContext reactContext, int i) {
            super(reactContext);
            this.mMinTimeLeftInFrameForNonBatchedOperationMs = i;
        }
    }

    final class FindTargetForTouchOperation implements UIOperation {
        private final Callback mCallback;
        private final int mReactTag;
        private final float mTargetX;
        private final float mTargetY;

        public final void execute() {
            try {
                UIViewOperationQueue.this.mNativeViewHierarchyManager.measure(this.mReactTag, UIViewOperationQueue.this.mMeasureBuffer);
                float f = (float) UIViewOperationQueue.this.mMeasureBuffer[0];
                float f2 = (float) UIViewOperationQueue.this.mMeasureBuffer[1];
                int findTargetTagForTouch = UIViewOperationQueue.this.mNativeViewHierarchyManager.findTargetTagForTouch(this.mReactTag, this.mTargetX, this.mTargetY);
                try {
                    UIViewOperationQueue.this.mNativeViewHierarchyManager.measure(findTargetTagForTouch, UIViewOperationQueue.this.mMeasureBuffer);
                    float dIPFromPixel = PixelUtil.toDIPFromPixel(((float) UIViewOperationQueue.this.mMeasureBuffer[0]) - f);
                    float dIPFromPixel2 = PixelUtil.toDIPFromPixel(((float) UIViewOperationQueue.this.mMeasureBuffer[1]) - f2);
                    float dIPFromPixel3 = PixelUtil.toDIPFromPixel((float) UIViewOperationQueue.this.mMeasureBuffer[2]);
                    float dIPFromPixel4 = PixelUtil.toDIPFromPixel((float) UIViewOperationQueue.this.mMeasureBuffer[3]);
                    this.mCallback.invoke(Integer.valueOf(findTargetTagForTouch), Float.valueOf(dIPFromPixel), Float.valueOf(dIPFromPixel2), Float.valueOf(dIPFromPixel3), Float.valueOf(dIPFromPixel4));
                } catch (IllegalViewOperationException unused) {
                    this.mCallback.invoke(new Object[0]);
                }
            } catch (IllegalViewOperationException unused2) {
                this.mCallback.invoke(new Object[0]);
            }
        }

        private FindTargetForTouchOperation(int i, float f, float f2, Callback callback) {
            this.mReactTag = i;
            this.mTargetX = f;
            this.mTargetY = f2;
            this.mCallback = callback;
        }
    }

    final class ManageChildrenOperation extends ViewOperation {
        private final int[] mIndicesToRemove;
        private final int[] mTagsToDelete;
        private final ViewAtIndex[] mViewsToAdd;

        public final void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.manageChildren(this.mTag, this.mIndicesToRemove, this.mViewsToAdd, this.mTagsToDelete);
        }

        public ManageChildrenOperation(int i, int[] iArr, ViewAtIndex[] viewAtIndexArr, int[] iArr2) {
            super(i);
            this.mIndicesToRemove = iArr;
            this.mViewsToAdd = viewAtIndexArr;
            this.mTagsToDelete = iArr2;
        }
    }

    final class MeasureInWindowOperation implements UIOperation {
        private final Callback mCallback;
        private final int mReactTag;

        public final void execute() {
            try {
                UIViewOperationQueue.this.mNativeViewHierarchyManager.measureInWindow(this.mReactTag, UIViewOperationQueue.this.mMeasureBuffer);
                float dIPFromPixel = PixelUtil.toDIPFromPixel((float) UIViewOperationQueue.this.mMeasureBuffer[0]);
                float dIPFromPixel2 = PixelUtil.toDIPFromPixel((float) UIViewOperationQueue.this.mMeasureBuffer[1]);
                float dIPFromPixel3 = PixelUtil.toDIPFromPixel((float) UIViewOperationQueue.this.mMeasureBuffer[2]);
                float dIPFromPixel4 = PixelUtil.toDIPFromPixel((float) UIViewOperationQueue.this.mMeasureBuffer[3]);
                this.mCallback.invoke(Float.valueOf(dIPFromPixel), Float.valueOf(dIPFromPixel2), Float.valueOf(dIPFromPixel3), Float.valueOf(dIPFromPixel4));
            } catch (NoSuchNativeViewException unused) {
                this.mCallback.invoke(new Object[0]);
            }
        }

        private MeasureInWindowOperation(int i, Callback callback) {
            this.mReactTag = i;
            this.mCallback = callback;
        }
    }

    final class MeasureOperation implements UIOperation {
        private final Callback mCallback;
        private final int mReactTag;

        public final void execute() {
            try {
                UIViewOperationQueue.this.mNativeViewHierarchyManager.measure(this.mReactTag, UIViewOperationQueue.this.mMeasureBuffer);
                float dIPFromPixel = PixelUtil.toDIPFromPixel((float) UIViewOperationQueue.this.mMeasureBuffer[0]);
                float dIPFromPixel2 = PixelUtil.toDIPFromPixel((float) UIViewOperationQueue.this.mMeasureBuffer[1]);
                float dIPFromPixel3 = PixelUtil.toDIPFromPixel((float) UIViewOperationQueue.this.mMeasureBuffer[2]);
                float dIPFromPixel4 = PixelUtil.toDIPFromPixel((float) UIViewOperationQueue.this.mMeasureBuffer[3]);
                this.mCallback.invoke(Integer.valueOf(0), Integer.valueOf(0), Float.valueOf(dIPFromPixel3), Float.valueOf(dIPFromPixel4), Float.valueOf(dIPFromPixel), Float.valueOf(dIPFromPixel2));
            } catch (NoSuchNativeViewException unused) {
                this.mCallback.invoke(new Object[0]);
            }
        }

        private MeasureOperation(int i, Callback callback) {
            this.mReactTag = i;
            this.mCallback = callback;
        }
    }

    class RegisterAnimationOperation extends AnimationOperation {
        private final Animation mAnimation;

        public void execute() {
            UIViewOperationQueue.this.mAnimationRegistry.registerAnimation(this.mAnimation);
        }

        private RegisterAnimationOperation(Animation animation) {
            super(animation.getAnimationID());
            this.mAnimation = animation;
        }
    }

    final class RemoveAnimationOperation extends AnimationOperation {
        public final void execute() {
            Animation animation = UIViewOperationQueue.this.mAnimationRegistry.getAnimation(this.mAnimationID);
            if (animation != null) {
                animation.cancel();
            }
        }

        private RemoveAnimationOperation(int i) {
            super(i);
        }
    }

    final class RemoveRootViewOperation extends ViewOperation {
        public final void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.removeRootView(this.mTag);
        }

        public RemoveRootViewOperation(int i) {
            super(i);
        }
    }

    final class SendAccessibilityEvent extends ViewOperation {
        private final int mEventType;

        public final void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.sendAccessibilityEvent(this.mTag, this.mEventType);
        }

        private SendAccessibilityEvent(int i, int i2) {
            super(i);
            this.mEventType = i2;
        }
    }

    final class SetChildrenOperation extends ViewOperation {
        private final ReadableArray mChildrenTags;

        public final void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.setChildren(this.mTag, this.mChildrenTags);
        }

        public SetChildrenOperation(int i, ReadableArray readableArray) {
            super(i);
            this.mChildrenTags = readableArray;
        }
    }

    class SetLayoutAnimationEnabledOperation implements UIOperation {
        private final boolean mEnabled;

        public void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.setLayoutAnimationEnabled(this.mEnabled);
        }

        private SetLayoutAnimationEnabledOperation(boolean z) {
            this.mEnabled = z;
        }
    }

    final class ShowPopupMenuOperation extends ViewOperation {
        private final Callback mError;
        private final ReadableArray mItems;
        private final Callback mSuccess;

        public final void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.showPopupMenu(this.mTag, this.mItems, this.mSuccess, this.mError);
        }

        public ShowPopupMenuOperation(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
            super(i);
            this.mItems = readableArray;
            this.mError = callback;
            this.mSuccess = callback2;
        }
    }

    class UIBlockOperation implements UIOperation {
        private final UIBlock mBlock;

        public void execute() {
            this.mBlock.execute(UIViewOperationQueue.this.mNativeViewHierarchyManager);
        }

        public UIBlockOperation(UIBlock uIBlock) {
            this.mBlock = uIBlock;
        }
    }

    public interface UIOperation {
        void execute();
    }

    final class UpdateLayoutOperation extends ViewOperation {
        private final int mHeight;
        private final int mParentTag;
        private final int mWidth;

        /* renamed from: mX */
        private final int f37428mX;

        /* renamed from: mY */
        private final int f37429mY;

        public final void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.updateLayout(this.mParentTag, this.mTag, this.f37428mX, this.f37429mY, this.mWidth, this.mHeight);
        }

        public UpdateLayoutOperation(int i, int i2, int i3, int i4, int i5, int i6) {
            super(i2);
            this.mParentTag = i;
            this.f37428mX = i3;
            this.f37429mY = i4;
            this.mWidth = i5;
            this.mHeight = i6;
        }
    }

    final class UpdatePropertiesOperation extends ViewOperation {
        private final ReactStylesDiffMap mProps;

        public final void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.updateProperties(this.mTag, this.mProps);
        }

        private UpdatePropertiesOperation(int i, ReactStylesDiffMap reactStylesDiffMap) {
            super(i);
            this.mProps = reactStylesDiffMap;
        }
    }

    final class UpdateViewExtraData extends ViewOperation {
        private final Object mExtraData;

        public final void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.updateViewExtraData(this.mTag, this.mExtraData);
        }

        public UpdateViewExtraData(int i, Object obj) {
            super(i);
            this.mExtraData = obj;
        }
    }

    abstract class ViewOperation implements UIOperation {
        public int mTag;

        public ViewOperation(int i) {
            this.mTag = i;
        }
    }

    /* access modifiers changed from: 0000 */
    public NativeViewHierarchyManager getNativeViewHierarchyManager() {
        return this.mNativeViewHierarchyManager;
    }

    public boolean isEmpty() {
        return this.mOperations.isEmpty();
    }

    public void profileNextBatch() {
        this.mIsProfilingNextBatch = true;
        this.mProfiledBatchCommitStartTime = 0;
    }

    /* access modifiers changed from: 0000 */
    public void resumeFrameCallback() {
        this.mIsDispatchUIFrameCallbackEnqueued = true;
        ReactChoreographer.getInstance().postFrameCallback(CallbackType.DISPATCH_UI, this.mDispatchUIFrameCallback);
    }

    public void enqueueClearJSResponder() {
        ArrayList<UIOperation> arrayList = this.mOperations;
        ChangeJSResponderOperation changeJSResponderOperation = new ChangeJSResponderOperation(0, 0, true, false);
        arrayList.add(changeJSResponderOperation);
    }

    /* access modifiers changed from: 0000 */
    public void pauseFrameCallback() {
        this.mIsDispatchUIFrameCallbackEnqueued = false;
        ReactChoreographer.getInstance().removeFrameCallback(CallbackType.DISPATCH_UI, this.mDispatchUIFrameCallback);
        flushPendingBatches();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        r2 = android.os.SystemClock.uptimeMillis();
        r0 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r0.hasNext() == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        if (r4.mIsProfilingNextBatch == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        r4.mProfiledBatchBatchedExecutionTime = android.os.SystemClock.uptimeMillis() - r2;
        r4.mProfiledBatchNonBatchedExecutionTime = r4.mNonBatchedExecutionTotalTime;
        r4.mIsProfilingNextBatch = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        r4.mNonBatchedExecutionTotalTime = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void flushPendingBatches() {
        /*
            r4 = this;
            boolean r0 = r4.mIsInIllegalUIState
            if (r0 == 0) goto L_0x000c
            java.lang.String r0 = "ReactNative"
            java.lang.String r1 = "Not flushing pending UI operations because of previously thrown Exception"
            com.facebook.common.p686c.C13286a.m38860c(r0, r1)
            return
        L_0x000c:
            java.lang.Object r0 = r4.mDispatchRunnablesLock
            monitor-enter(r0)
            java.util.ArrayList<java.lang.Runnable> r1 = r4.mDispatchUIRunnables     // Catch:{ all -> 0x0052 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0052 }
            if (r1 != 0) goto L_0x0050
            java.util.ArrayList<java.lang.Runnable> r1 = r4.mDispatchUIRunnables     // Catch:{ all -> 0x0052 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0052 }
            r2.<init>()     // Catch:{ all -> 0x0052 }
            r4.mDispatchUIRunnables = r2     // Catch:{ all -> 0x0052 }
            monitor-exit(r0)     // Catch:{ all -> 0x0052 }
            long r2 = android.os.SystemClock.uptimeMillis()
            java.util.Iterator r0 = r1.iterator()
        L_0x0029:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0039
            java.lang.Object r1 = r0.next()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r1.run()
            goto L_0x0029
        L_0x0039:
            boolean r0 = r4.mIsProfilingNextBatch
            if (r0 == 0) goto L_0x004b
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r2
            r4.mProfiledBatchBatchedExecutionTime = r0
            long r0 = r4.mNonBatchedExecutionTotalTime
            r4.mProfiledBatchNonBatchedExecutionTime = r0
            r0 = 0
            r4.mIsProfilingNextBatch = r0
        L_0x004b:
            r0 = 0
            r4.mNonBatchedExecutionTotalTime = r0
            return
        L_0x0050:
            monitor-exit(r0)     // Catch:{ all -> 0x0052 }
            return
        L_0x0052:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0052 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.UIViewOperationQueue.flushPendingBatches():void");
    }

    public Map<String, Long> getProfiledBatchPerfCounters() {
        HashMap hashMap = new HashMap();
        hashMap.put("CommitStartTime", Long.valueOf(this.mProfiledBatchCommitStartTime));
        hashMap.put("LayoutTime", Long.valueOf(this.mProfiledBatchLayoutTime));
        hashMap.put("DispatchViewUpdatesTime", Long.valueOf(this.mProfiledBatchDispatchViewUpdatesTime));
        hashMap.put("RunStartTime", Long.valueOf(this.mProfiledBatchRunStartTime));
        hashMap.put("BatchedExecutionTime", Long.valueOf(this.mProfiledBatchBatchedExecutionTime));
        hashMap.put("NonBatchedExecutionTime", Long.valueOf(this.mProfiledBatchNonBatchedExecutionTime));
        return hashMap;
    }

    public void setViewHierarchyUpdateDebugListener(NotThreadSafeViewHierarchyUpdateDebugListener notThreadSafeViewHierarchyUpdateDebugListener) {
        this.mViewHierarchyUpdateDebugListener = notThreadSafeViewHierarchyUpdateDebugListener;
    }

    public void enqueueRegisterAnimation(Animation animation) {
        this.mOperations.add(new RegisterAnimationOperation(animation));
    }

    public void enqueueRemoveAnimation(int i) {
        this.mOperations.add(new RemoveAnimationOperation(i));
    }

    public void enqueueRemoveRootView(int i) {
        this.mOperations.add(new RemoveRootViewOperation(i));
    }

    public void enqueueSetLayoutAnimationEnabled(boolean z) {
        this.mOperations.add(new SetLayoutAnimationEnabledOperation(z));
    }

    public void enqueueUIBlock(UIBlock uIBlock) {
        this.mOperations.add(new UIBlockOperation(uIBlock));
    }

    /* access modifiers changed from: protected */
    public void enqueueUIOperation(UIOperation uIOperation) {
        SoftAssertions.assertNotNull(uIOperation);
        this.mOperations.add(uIOperation);
    }

    public void prependUIBlock(UIBlock uIBlock) {
        this.mOperations.add(0, new UIBlockOperation(uIBlock));
    }

    public void enqueueMeasure(int i, Callback callback) {
        this.mOperations.add(new MeasureOperation(i, callback));
    }

    public void enqueueMeasureInWindow(int i, Callback callback) {
        this.mOperations.add(new MeasureInWindowOperation(i, callback));
    }

    public void enqueueSendAccessibilityEvent(int i, int i2) {
        this.mOperations.add(new SendAccessibilityEvent(i, i2));
    }

    public void enqueueSetChildren(int i, ReadableArray readableArray) {
        this.mOperations.add(new SetChildrenOperation(i, readableArray));
    }

    public void enqueueUpdateExtraData(int i, Object obj) {
        this.mOperations.add(new UpdateViewExtraData(i, obj));
    }

    public void addRootView(int i, SizeMonitoringFrameLayout sizeMonitoringFrameLayout, ThemedReactContext themedReactContext) {
        this.mNativeViewHierarchyManager.addRootView(i, sizeMonitoringFrameLayout, themedReactContext);
    }

    public void enqueueConfigureLayoutAnimation(ReadableMap readableMap, Callback callback, Callback callback2) {
        this.mOperations.add(new ConfigureLayoutAnimationOperation(readableMap));
    }

    public void enqueueDispatchCommand(int i, int i2, ReadableArray readableArray) {
        this.mOperations.add(new DispatchCommandOperation(i, i2, readableArray));
    }

    public void enqueueUpdateProperties(int i, String str, ReactStylesDiffMap reactStylesDiffMap) {
        this.mOperations.add(new UpdatePropertiesOperation(i, reactStylesDiffMap));
    }

    public void enqueueAddAnimation(int i, int i2, Callback callback) {
        ArrayList<UIOperation> arrayList = this.mOperations;
        AddAnimationOperation addAnimationOperation = new AddAnimationOperation(i, i2, callback);
        arrayList.add(addAnimationOperation);
    }

    public void enqueueSetJSResponder(int i, int i2, boolean z) {
        ArrayList<UIOperation> arrayList = this.mOperations;
        ChangeJSResponderOperation changeJSResponderOperation = new ChangeJSResponderOperation(i, i2, false, z);
        arrayList.add(changeJSResponderOperation);
    }

    public UIViewOperationQueue(ReactApplicationContext reactApplicationContext, NativeViewHierarchyManager nativeViewHierarchyManager, int i) {
        this.mNativeViewHierarchyManager = nativeViewHierarchyManager;
        this.mAnimationRegistry = nativeViewHierarchyManager.getAnimationRegistry();
        if (i == -1) {
            i = 8;
        }
        this.mDispatchUIFrameCallback = new DispatchUIFrameCallback(reactApplicationContext, i);
        this.mReactApplicationContext = reactApplicationContext;
    }

    public void dispatchViewUpdates(int i, long j, long j2) {
        final ArrayList arrayList;
        final ArrayDeque arrayDeque;
        try {
            final long uptimeMillis = SystemClock.uptimeMillis();
            if (!this.mOperations.isEmpty()) {
                ArrayList<UIOperation> arrayList2 = this.mOperations;
                this.mOperations = new ArrayList<>();
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            synchronized (this.mNonBatchedOperationsLock) {
                if (!this.mNonBatchedOperations.isEmpty()) {
                    ArrayDeque<UIOperation> arrayDeque2 = this.mNonBatchedOperations;
                    this.mNonBatchedOperations = new ArrayDeque<>();
                    arrayDeque = arrayDeque2;
                } else {
                    arrayDeque = null;
                }
            }
            if (this.mViewHierarchyUpdateDebugListener != null) {
                this.mViewHierarchyUpdateDebugListener.onViewHierarchyUpdateEnqueued();
            }
            final int i2 = i;
            final long j3 = j;
            final long j4 = j2;
            C144311 r1 = new Runnable() {
                public void run() {
                    try {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        if (arrayDeque != null) {
                            Iterator it = arrayDeque.iterator();
                            while (it.hasNext()) {
                                ((UIOperation) it.next()).execute();
                            }
                        }
                        if (arrayList != null) {
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                ((UIOperation) it2.next()).execute();
                            }
                        }
                        if (UIViewOperationQueue.this.mIsProfilingNextBatch && UIViewOperationQueue.this.mProfiledBatchCommitStartTime == 0) {
                            UIViewOperationQueue.this.mProfiledBatchCommitStartTime = j3;
                            UIViewOperationQueue.this.mProfiledBatchLayoutTime = j4;
                            UIViewOperationQueue.this.mProfiledBatchDispatchViewUpdatesTime = uptimeMillis;
                            UIViewOperationQueue.this.mProfiledBatchRunStartTime = uptimeMillis;
                        }
                        UIViewOperationQueue.this.mNativeViewHierarchyManager.clearLayoutAnimation();
                        if (UIViewOperationQueue.this.mViewHierarchyUpdateDebugListener != null) {
                            UIViewOperationQueue.this.mViewHierarchyUpdateDebugListener.onViewHierarchyUpdateFinished();
                        }
                        Systrace.m42323a(0);
                    } catch (Exception e) {
                        throw e;
                    } catch (Throwable th) {
                        Systrace.m42323a(0);
                        throw th;
                    }
                }
            };
            synchronized (this.mDispatchRunnablesLock) {
                Systrace.m42323a(0);
                this.mDispatchUIRunnables.add(r1);
            }
            if (!this.mIsDispatchUIFrameCallbackEnqueued) {
                UiThreadUtil.runOnUiThread(new GuardedRunnable(this.mReactApplicationContext) {
                    public void runGuarded() {
                        UIViewOperationQueue.this.flushPendingBatches();
                    }
                });
            }
            Systrace.m42323a(0);
        } catch (Throwable th) {
            Systrace.m42323a(0);
            throw th;
        }
    }

    public void enqueueCreateView(ThemedReactContext themedReactContext, int i, String str, ReactStylesDiffMap reactStylesDiffMap) {
        synchronized (this.mNonBatchedOperationsLock) {
            ArrayDeque<UIOperation> arrayDeque = this.mNonBatchedOperations;
            CreateViewOperation createViewOperation = new CreateViewOperation(themedReactContext, i, str, reactStylesDiffMap);
            arrayDeque.addLast(createViewOperation);
        }
    }

    public void enqueueFindTargetForTouch(int i, float f, float f2, Callback callback) {
        ArrayList<UIOperation> arrayList = this.mOperations;
        FindTargetForTouchOperation findTargetForTouchOperation = new FindTargetForTouchOperation(i, f, f2, callback);
        arrayList.add(findTargetForTouchOperation);
    }

    public void enqueueManageChildren(int i, int[] iArr, ViewAtIndex[] viewAtIndexArr, int[] iArr2) {
        ArrayList<UIOperation> arrayList = this.mOperations;
        ManageChildrenOperation manageChildrenOperation = new ManageChildrenOperation(i, iArr, viewAtIndexArr, iArr2);
        arrayList.add(manageChildrenOperation);
    }

    public void enqueueShowPopupMenu(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
        ArrayList<UIOperation> arrayList = this.mOperations;
        ShowPopupMenuOperation showPopupMenuOperation = new ShowPopupMenuOperation(i, readableArray, callback, callback2);
        arrayList.add(showPopupMenuOperation);
    }

    public void enqueueUpdateLayout(int i, int i2, int i3, int i4, int i5, int i6) {
        ArrayList<UIOperation> arrayList = this.mOperations;
        UpdateLayoutOperation updateLayoutOperation = new UpdateLayoutOperation(i, i2, i3, i4, i5, i6);
        arrayList.add(updateLayoutOperation);
    }
}
