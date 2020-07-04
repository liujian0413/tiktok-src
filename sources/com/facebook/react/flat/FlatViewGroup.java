package com.facebook.react.flat;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.facebook.infer.p728a.C13854a;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.touch.OnInterceptTouchEventListener;
import com.facebook.react.touch.ReactHitSlopView;
import com.facebook.react.touch.ReactInterceptingViewGroup;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactClippingViewGroup;
import com.facebook.react.uimanager.ReactCompoundViewGroup;
import com.facebook.react.uimanager.ReactPointerEventsView;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.views.image.ImageLoadEvent;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

final class FlatViewGroup extends ViewGroup implements FlatMeasuredViewGroup, ReactHitSlopView, ReactInterceptingViewGroup, ReactClippingViewGroup, ReactCompoundViewGroup, ReactPointerEventsView {
    private static final SparseArray<View> EMPTY_DETACHED_VIEWS = new SparseArray<>(0);
    private static final ArrayList<FlatViewGroup> LAYOUT_REQUESTS = new ArrayList<>();
    private static final Rect VIEW_BOUNDS = new Rect();
    private static Paint sDebugCornerPaint;
    private static Rect sDebugRect;
    private static Paint sDebugRectPaint;
    private static Paint sDebugTextBackgroundPaint;
    private static Paint sDebugTextPaint;
    private boolean mAndroidDebugDraw;
    private AttachDetachListener[] mAttachDetachListeners = AttachDetachListener.EMPTY_ARRAY;
    private int mDrawChildIndex;
    private DrawCommandManager mDrawCommandManager;
    private DrawCommand[] mDrawCommands = DrawCommand.EMPTY_ARRAY;
    private Rect mHitSlopRect;
    private Drawable mHotspot;
    private InvalidateCallback mInvalidateCallback;
    private boolean mIsAttached;
    private boolean mIsLayoutRequested;
    private long mLastTouchDownTime;
    private boolean mNeedsOffscreenAlphaCompositing;
    private NodeRegion[] mNodeRegions = NodeRegion.EMPTY_ARRAY;
    private OnInterceptTouchEventListener mOnInterceptTouchEventListener;
    private PointerEvents mPointerEvents = PointerEvents.AUTO;

    static final class InvalidateCallback extends WeakReference<FlatViewGroup> {
        public final void invalidate() {
            FlatViewGroup flatViewGroup = (FlatViewGroup) get();
            if (flatViewGroup != null) {
                flatViewGroup.invalidate();
            }
        }

        private InvalidateCallback(FlatViewGroup flatViewGroup) {
            super(flatViewGroup);
        }

        public final void dispatchImageLoadEvent(int i, int i2) {
            FlatViewGroup flatViewGroup = (FlatViewGroup) get();
            if (flatViewGroup != null) {
                ((UIManagerModule) ((ReactContext) flatViewGroup.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(new ImageLoadEvent(i, i2));
            }
        }
    }

    private static int sign(float f) {
        return f >= 0.0f ? 1 : -1;
    }

    /* access modifiers changed from: protected */
    public final void detachAllViewsFromParent() {
        super.detachAllViewsFromParent();
    }

    /* access modifiers changed from: protected */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return false;
    }

    public final Rect getHitSlopRect() {
        return this.mHitSlopRect;
    }

    public final PointerEvents getPointerEvents() {
        return this.mPointerEvents;
    }

    public final boolean hasOverlappingRendering() {
        return this.mNeedsOffscreenAlphaCompositing;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    public final boolean getRemoveClippedSubviews() {
        if (this.mDrawCommandManager != null) {
            return true;
        }
        return false;
    }

    public final void removeAllViewsInLayout() {
        this.mDrawCommands = DrawCommand.EMPTY_ARRAY;
        super.removeAllViewsInLayout();
    }

    private InvalidateCallback getInvalidateCallback() {
        if (this.mInvalidateCallback == null) {
            this.mInvalidateCallback = new InvalidateCallback();
        }
        return this.mInvalidateCallback;
    }

    /* access modifiers changed from: 0000 */
    public final SparseArray<View> getDetachedViews() {
        if (this.mDrawCommandManager == null) {
            return EMPTY_DETACHED_VIEWS;
        }
        return this.mDrawCommandManager.getDetachedViews();
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.mHotspot != null) {
            this.mHotspot.jumpToCurrentState();
        }
    }

    public final void requestLayout() {
        if (!this.mIsLayoutRequested) {
            this.mIsLayoutRequested = true;
            LAYOUT_REQUESTS.add(this);
        }
    }

    static void processLayoutRequests() {
        int size = LAYOUT_REQUESTS.size();
        for (int i = 0; i != size; i++) {
            ((FlatViewGroup) LAYOUT_REQUESTS.get(i)).processLayoutRequest();
        }
        LAYOUT_REQUESTS.clear();
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.mHotspot != null && this.mHotspot.isStateful()) {
            this.mHotspot.setState(getDrawableState());
        }
    }

    public final void invalidate() {
        invalidate(0, 0, getWidth() + 1, getHeight() + 1);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        if (!this.mIsAttached) {
            this.mIsAttached = true;
            super.onAttachedToWindow();
            dispatchOnAttached(this.mAttachDetachListeners);
            updateClippingRect();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        if (this.mIsAttached) {
            this.mIsAttached = false;
            super.onDetachedFromWindow();
            dispatchOnDetached(this.mAttachDetachListeners);
            return;
        }
        throw new RuntimeException("Double detach");
    }

    public final void updateClippingRect() {
        if (this.mDrawCommandManager != null && this.mDrawCommandManager.updateClippingRect()) {
            invalidate();
        }
    }

    private void processLayoutRequest() {
        this.mIsLayoutRequested = false;
        int childCount = getChildCount();
        for (int i = 0; i != childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.isLayoutRequested()) {
                childAt.measure(MeasureSpec.makeMeasureSpec(childAt.getWidth(), 1073741824), MeasureSpec.makeMeasureSpec(childAt.getHeight(), 1073741824));
                childAt.layout(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
            }
        }
    }

    private void initDebugDrawResources() {
        if (sDebugTextPaint == null) {
            Paint paint = new Paint();
            sDebugTextPaint = paint;
            paint.setTextAlign(Align.RIGHT);
            sDebugTextPaint.setTextSize((float) dipsToPixels(9));
            sDebugTextPaint.setTypeface(Typeface.MONOSPACE);
            sDebugTextPaint.setAntiAlias(true);
            sDebugTextPaint.setColor(-65536);
        }
        if (sDebugTextBackgroundPaint == null) {
            Paint paint2 = new Paint();
            sDebugTextBackgroundPaint = paint2;
            paint2.setColor(-1);
            sDebugTextBackgroundPaint.setAlpha(C34943c.f91127w);
            sDebugTextBackgroundPaint.setStyle(Style.FILL);
        }
        if (sDebugRectPaint == null) {
            Paint paint3 = new Paint();
            sDebugRectPaint = paint3;
            paint3.setAlpha(100);
            sDebugRectPaint.setStyle(Style.STROKE);
        }
        if (sDebugCornerPaint == null) {
            Paint paint4 = new Paint();
            sDebugCornerPaint = paint4;
            paint4.setAlpha(C34943c.f91127w);
            sDebugCornerPaint.setColor(Color.rgb(63, 127, NormalGiftView.ALPHA_255));
            sDebugCornerPaint.setStyle(Style.FILL);
        }
        if (sDebugRect == null) {
            sDebugRect = new Rect();
        }
    }

    public final Rect measureWithCommands() {
        DrawCommand[] drawCommandArr;
        int childCount = getChildCount();
        if (childCount == 0 && this.mDrawCommands.length == 0) {
            return new Rect(0, 0, 0, 0);
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MIN_VALUE;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            i = Math.min(i, childAt.getLeft());
            i2 = Math.min(i2, childAt.getTop());
            i3 = Math.max(i3, childAt.getRight());
            i4 = Math.max(i4, childAt.getBottom());
        }
        for (DrawCommand drawCommand : this.mDrawCommands) {
            if (drawCommand instanceof AbstractDrawCommand) {
                AbstractDrawCommand abstractDrawCommand = (AbstractDrawCommand) drawCommand;
                i = Math.min(i, Math.round(abstractDrawCommand.getLeft()));
                i2 = Math.min(i2, Math.round(abstractDrawCommand.getTop()));
                i3 = Math.max(i3, Math.round(abstractDrawCommand.getRight()));
                i4 = Math.max(i4, Math.round(abstractDrawCommand.getBottom()));
            }
        }
        return new Rect(i, i2, i3, i4);
    }

    /* access modifiers changed from: 0000 */
    public final void mountNodeRegions(NodeRegion[] nodeRegionArr) {
        this.mNodeRegions = nodeRegionArr;
    }

    /* access modifiers changed from: protected */
    public final void onDebugDraw(Canvas canvas) {
        this.mAndroidDebugDraw = true;
    }

    /* access modifiers changed from: 0000 */
    public final void setHitSlopRect(Rect rect) {
        this.mHitSlopRect = rect;
    }

    /* access modifiers changed from: 0000 */
    public final void setNeedsOffscreenAlphaCompositing(boolean z) {
        this.mNeedsOffscreenAlphaCompositing = z;
    }

    public final void setOnInterceptTouchEventListener(OnInterceptTouchEventListener onInterceptTouchEventListener) {
        this.mOnInterceptTouchEventListener = onInterceptTouchEventListener;
    }

    /* access modifiers changed from: 0000 */
    public final void setPointerEvents(PointerEvents pointerEvents) {
        this.mPointerEvents = pointerEvents;
    }

    /* access modifiers changed from: 0000 */
    public final void mountDrawCommands(DrawCommand[] drawCommandArr) {
        this.mDrawCommands = drawCommandArr;
        invalidate();
    }

    /* access modifiers changed from: 0000 */
    public final void removeDetachedView(View view) {
        removeDetachedView(view, false);
    }

    private static void dispatchOnDetached(AttachDetachListener[] attachDetachListenerArr) {
        for (AttachDetachListener onDetached : attachDetachListenerArr) {
            onDetached.onDetached();
        }
    }

    private LayoutParams ensureLayoutParams(LayoutParams layoutParams) {
        if (checkLayoutParams(layoutParams)) {
            return layoutParams;
        }
        return generateDefaultLayoutParams();
    }

    /* access modifiers changed from: 0000 */
    public final void addViewInLayout(View view) {
        addViewInLayout(view, -1, ensureLayoutParams(view.getLayoutParams()), true);
    }

    /* access modifiers changed from: 0000 */
    public final void attachViewToParent(View view) {
        attachViewToParent(view, -1, ensureLayoutParams(view.getLayoutParams()));
    }

    /* access modifiers changed from: 0000 */
    public final void mountAttachDetachListeners(AttachDetachListener[] attachDetachListenerArr) {
        if (this.mIsAttached) {
            dispatchOnAttached(attachDetachListenerArr);
            dispatchOnDetached(this.mAttachDetachListeners);
        }
        this.mAttachDetachListeners = attachDetachListenerArr;
    }

    /* access modifiers changed from: 0000 */
    public final void onViewDropped(View view) {
        if (this.mDrawCommandManager != null) {
            this.mDrawCommandManager.onClippedViewDropped(view);
        }
    }

    FlatViewGroup(Context context) {
        super(context);
        setClipChildren(false);
    }

    private void debugDraw(Canvas canvas) {
        if (this.mDrawCommandManager != null) {
            this.mDrawCommandManager.debugDraw(canvas);
        } else {
            for (DrawCommand debugDraw : this.mDrawCommands) {
                debugDraw.debugDraw(this, canvas);
            }
        }
        this.mDrawChildIndex = 0;
    }

    private void dispatchOnAttached(AttachDetachListener[] attachDetachListenerArr) {
        if (attachDetachListenerArr.length != 0) {
            InvalidateCallback invalidateCallback = getInvalidateCallback();
            for (AttachDetachListener onAttached : attachDetachListenerArr) {
                onAttached.onAttached(invalidateCallback);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final int dipsToPixels(int i) {
        return (int) ((((float) i) * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final void getClippingRect(Rect rect) {
        if (this.mDrawCommandManager != null) {
            this.mDrawCommandManager.getClippingRect(rect);
            return;
        }
        throw new RuntimeException("Trying to get the clipping rect for a non-clipping FlatViewGroup");
    }

    /* access modifiers changed from: 0000 */
    public final NodeRegion getNodeRegionForTag(int i) {
        NodeRegion[] nodeRegionArr;
        for (NodeRegion nodeRegion : this.mNodeRegions) {
            if (nodeRegion.matchesTag(i)) {
                return nodeRegion;
            }
        }
        return NodeRegion.EMPTY;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mPointerEvents == PointerEvents.NONE) {
            return false;
        }
        if (this.mPointerEvents == PointerEvents.BOX_NONE && virtualNodeRegionWithinBounds(motionEvent.getX(), motionEvent.getY()) == null) {
            return false;
        }
        return true;
    }

    public final void setRemoveClippedSubviews(boolean z) {
        boolean removeClippedSubviews = getRemoveClippedSubviews();
        if (z != removeClippedSubviews) {
            if (!removeClippedSubviews) {
                this.mDrawCommandManager = DrawCommandManager.getVerticalClippingInstance(this, this.mDrawCommands);
                this.mDrawCommands = DrawCommand.EMPTY_ARRAY;
                return;
            }
            throw new RuntimeException("Trying to transition FlatViewGroup from clipping to non-clipping state");
        }
    }

    private static void ensureViewHasNoParent(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            StringBuilder sb = new StringBuilder("Cannot add view ");
            sb.append(view);
            sb.append(" to FlatViewGroup while it has a parent ");
            sb.append(parent);
            throw new RuntimeException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    public final void debugDrawNextChild(Canvas canvas) {
        int i;
        View childAt = getChildAt(this.mDrawChildIndex);
        if (childAt instanceof FlatViewGroup) {
            i = -12303292;
        } else {
            i = -65536;
        }
        debugDrawRect(canvas, i, (float) childAt.getLeft(), (float) childAt.getTop(), (float) childAt.getRight(), (float) childAt.getBottom());
        this.mDrawChildIndex++;
    }

    /* access modifiers changed from: 0000 */
    public final void drawNextChild(Canvas canvas) {
        View childAt = getChildAt(this.mDrawChildIndex);
        if (childAt instanceof FlatViewGroup) {
            super.drawChild(canvas, childAt, getDrawingTime());
        } else {
            canvas.save(2);
            childAt.getHitRect(VIEW_BOUNDS);
            canvas.clipRect(VIEW_BOUNDS);
            super.drawChild(canvas, childAt, getDrawingTime());
            canvas.restore();
        }
        this.mDrawChildIndex++;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        long downTime = motionEvent.getDownTime();
        if (downTime != this.mLastTouchDownTime) {
            this.mLastTouchDownTime = downTime;
            if (interceptsTouchEvent(motionEvent.getX(), motionEvent.getY())) {
                return true;
            }
        }
        if ((this.mOnInterceptTouchEventListener != null && this.mOnInterceptTouchEventListener.onInterceptTouchEvent(this, motionEvent)) || this.mPointerEvents == PointerEvents.NONE || this.mPointerEvents == PointerEvents.BOX_ONLY) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* access modifiers changed from: 0000 */
    public final void setHotspot(Drawable drawable) {
        if (this.mHotspot != null) {
            this.mHotspot.setCallback(null);
            unscheduleDrawable(this.mHotspot);
        }
        if (drawable != null) {
            drawable.setCallback(this);
            if (drawable.isStateful()) {
                drawable.setState(getDrawableState());
            }
        }
        this.mHotspot = drawable;
        invalidate();
    }

    public final void dispatchDraw(Canvas canvas) {
        this.mAndroidDebugDraw = false;
        super.dispatchDraw(canvas);
        if (this.mDrawCommandManager != null) {
            this.mDrawCommandManager.draw(canvas);
        } else {
            for (DrawCommand draw : this.mDrawCommands) {
                draw.draw(this, canvas);
            }
        }
        if (this.mDrawChildIndex == getChildCount()) {
            this.mDrawChildIndex = 0;
            if (this.mAndroidDebugDraw) {
                initDebugDrawResources();
                debugDraw(canvas);
            }
            if (this.mHotspot != null) {
                this.mHotspot.draw(canvas);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("Did not draw all children: ");
        sb.append(this.mDrawChildIndex);
        sb.append(" / ");
        sb.append(getChildCount());
        throw new RuntimeException(sb.toString());
    }

    public final void dispatchDrawableHotspotChanged(float f, float f2) {
        if (this.mHotspot != null) {
            this.mHotspot.setHotspot(f, f2);
            invalidate();
        }
    }

    public final boolean interceptsTouchEvent(float f, float f2) {
        NodeRegion anyNodeRegionWithinBounds = anyNodeRegionWithinBounds(f, f2);
        if (anyNodeRegionWithinBounds == null || !anyNodeRegionWithinBounds.mIsVirtual) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final void addViewInLayout(View view, int i) {
        addViewInLayout(view, i, ensureLayoutParams(view.getLayoutParams()), true);
    }

    /* access modifiers changed from: 0000 */
    public final void attachViewToParent(View view, int i) {
        attachViewToParent(view, i, ensureLayoutParams(view.getLayoutParams()));
    }

    private NodeRegion anyNodeRegionWithinBounds(float f, float f2) {
        if (this.mDrawCommandManager != null) {
            return this.mDrawCommandManager.anyNodeRegionWithinBounds(f, f2);
        }
        for (int length = this.mNodeRegions.length - 1; length >= 0; length--) {
            NodeRegion nodeRegion = this.mNodeRegions[length];
            if (nodeRegion.withinBounds(f, f2)) {
                return nodeRegion;
            }
        }
        return null;
    }

    private NodeRegion virtualNodeRegionWithinBounds(float f, float f2) {
        if (this.mDrawCommandManager != null) {
            return this.mDrawCommandManager.virtualNodeRegionWithinBounds(f, f2);
        }
        for (int length = this.mNodeRegions.length - 1; length >= 0; length--) {
            NodeRegion nodeRegion = this.mNodeRegions[length];
            if (nodeRegion.mIsVirtual && nodeRegion.withinBounds(f, f2)) {
                return nodeRegion;
            }
        }
        return null;
    }

    public final int reactTagForTouch(float f, float f2) {
        boolean z;
        if (this.mPointerEvents != PointerEvents.NONE) {
            z = true;
        } else {
            z = false;
        }
        SoftAssertions.assertCondition(z, "TouchTargetHelper should not allow calling this method when pointer events are NONE");
        if (this.mPointerEvents != PointerEvents.BOX_ONLY) {
            NodeRegion virtualNodeRegionWithinBounds = virtualNodeRegionWithinBounds(f, f2);
            if (virtualNodeRegionWithinBounds != null) {
                return virtualNodeRegionWithinBounds.getReactTag(f, f2);
            }
        }
        return getId();
    }

    /* access modifiers changed from: 0000 */
    public final void mountClippingNodeRegions(NodeRegion[] nodeRegionArr, float[] fArr, float[] fArr2) {
        this.mNodeRegions = nodeRegionArr;
        ((DrawCommandManager) C13854a.m40916b(this.mDrawCommandManager)).mountNodeRegions(nodeRegionArr, fArr, fArr2);
    }

    /* access modifiers changed from: 0000 */
    public final void mountViews(ViewResolver viewResolver, int[] iArr, int[] iArr2) {
        if (this.mDrawCommandManager != null) {
            this.mDrawCommandManager.mountViews(viewResolver, iArr, iArr2);
        } else {
            for (int i : iArr) {
                if (i > 0) {
                    View view = viewResolver.getView(i);
                    ensureViewHasNoParent(view);
                    addViewInLayout(view);
                } else {
                    View view2 = viewResolver.getView(-i);
                    ensureViewHasNoParent(view2);
                    attachViewToParent(view2);
                }
            }
            int length = iArr2.length;
            int i2 = 0;
            while (i2 < length) {
                View view3 = viewResolver.getView(iArr2[i2]);
                if (view3.getParent() == null) {
                    removeDetachedView(view3, false);
                    i2++;
                } else {
                    throw new RuntimeException("Trying to remove view not owned by FlatViewGroup");
                }
            }
        }
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (this.mHotspot != null) {
            this.mHotspot.setBounds(0, 0, i, i2);
            invalidate();
        }
        updateClippingRect();
    }

    /* access modifiers changed from: 0000 */
    public final void mountClippingDrawCommands(DrawCommand[] drawCommandArr, SparseIntArray sparseIntArray, float[] fArr, float[] fArr2, boolean z) {
        ((DrawCommandManager) C13854a.m40916b(this.mDrawCommandManager)).mountDrawCommands(drawCommandArr, sparseIntArray, fArr, fArr2, z);
        invalidate();
    }

    private void debugDrawRect(Canvas canvas, int i, float f, float f2, float f3, float f4) {
        debugDrawNamedRect(canvas, i, "", f, f2, f3, f4);
    }

    private static void fillRect(Canvas canvas, Paint paint, float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7;
        float f8;
        if (f != f3 && f2 != f4) {
            if (f > f3) {
                f5 = f;
                f6 = f3;
            } else {
                f6 = f;
                f5 = f3;
            }
            if (f2 > f4) {
                f7 = f2;
                f8 = f4;
            } else {
                f8 = f2;
                f7 = f4;
            }
            canvas.drawRect(f6, f8, f5, f7, paint);
        }
    }

    private static void drawCorner(Canvas canvas, Paint paint, float f, float f2, float f3, float f4, float f5) {
        Canvas canvas2 = canvas;
        Paint paint2 = paint;
        float f6 = f;
        float f7 = f2;
        fillRect(canvas2, paint2, f6, f7, f + f3, f2 + (((float) sign(f4)) * f5));
        fillRect(canvas2, paint2, f6, f7, f + (f5 * ((float) sign(f3))), f2 + f4);
    }

    /* access modifiers changed from: 0000 */
    public final void debugDrawNamedRect(Canvas canvas, int i, String str, float f, float f2, float f3, float f4) {
        Paint paint = sDebugRectPaint;
        paint.setColor((paint.getColor() & -16777216) | (16777215 & i));
        sDebugRectPaint.setAlpha(100);
        canvas.drawRect(f, f2, f3 - 1.0f, f4 - 1.0f, sDebugRectPaint);
        drawRectCorners(canvas, f, f2, f3, f4, sDebugCornerPaint, dipsToPixels(8), dipsToPixels(1));
    }

    private static void drawRectCorners(Canvas canvas, float f, float f2, float f3, float f4, Paint paint, int i, int i2) {
        float f5 = (float) i;
        Canvas canvas2 = canvas;
        Paint paint2 = paint;
        float f6 = f;
        float f7 = f5;
        float f8 = (float) i2;
        drawCorner(canvas2, paint2, f6, f2, f7, f5, f8);
        float f9 = (float) (-i);
        drawCorner(canvas2, paint2, f6, f4, f7, f9, f8);
        float f10 = f3;
        float f11 = f9;
        drawCorner(canvas2, paint2, f10, f2, f11, f5, f8);
        drawCorner(canvas2, paint2, f10, f4, f11, f9, f8);
    }
}
