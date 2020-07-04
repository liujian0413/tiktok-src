package com.facebook.react.flat;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.RootViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerRegistry;
import com.facebook.react.uimanager.common.SizeMonitoringFrameLayout;
import java.util.ArrayList;

final class FlatNativeViewHierarchyManager extends NativeViewHierarchyManager implements ViewResolver {
    public final View getView(int i) {
        return super.resolveView(i);
    }

    FlatNativeViewHierarchyManager(ViewManagerRegistry viewManagerRegistry) {
        super(viewManagerRegistry, (RootViewManager) new FlatRootViewManager());
    }

    /* access modifiers changed from: 0000 */
    public final void detachAllChildrenFromViews(int[] iArr) {
        for (int i : iArr) {
            View resolveView = resolveView(i);
            if (resolveView instanceof FlatViewGroup) {
                ((FlatViewGroup) resolveView).detachAllViewsFromParent();
            } else {
                ((ViewGroupManager) resolveViewManager(i)).removeAllViews((ViewGroup) resolveView);
            }
        }
    }

    public final void dropView(View view) {
        super.dropView(view);
        if (view instanceof FlatViewGroup) {
            FlatViewGroup flatViewGroup = (FlatViewGroup) view;
            if (flatViewGroup.getRemoveClippedSubviews()) {
                SparseArray detachedViews = flatViewGroup.getDetachedViews();
                int size = detachedViews.size();
                for (int i = 0; i < size; i++) {
                    View view2 = (View) detachedViews.valueAt(i);
                    try {
                        dropView(view2);
                    } catch (Exception unused) {
                    }
                    flatViewGroup.removeDetachedView(view2);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void dropViews(SparseIntArray sparseIntArray) {
        int size = sparseIntArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseIntArray.keyAt(i);
            View view = null;
            if (keyAt > 0) {
                try {
                    View resolveView = resolveView(keyAt);
                    try {
                        dropView(resolveView);
                    } catch (Exception unused) {
                    }
                    view = resolveView;
                } catch (Exception unused2) {
                }
            } else {
                removeRootView(-keyAt);
            }
            int valueAt = sparseIntArray.valueAt(i);
            if (valueAt > 0 && view != null && view.getParent() == null) {
                View resolveView2 = resolveView(valueAt);
                if (resolveView2 instanceof FlatViewGroup) {
                    ((FlatViewGroup) resolveView2).onViewDropped(view);
                }
            }
        }
    }

    public final void addRootView(int i, SizeMonitoringFrameLayout sizeMonitoringFrameLayout, ThemedReactContext themedReactContext) {
        FlatViewGroup flatViewGroup = new FlatViewGroup(themedReactContext);
        sizeMonitoringFrameLayout.addView(flatViewGroup);
        sizeMonitoringFrameLayout.setId(i);
        addRootViewGroup(i, flatViewGroup, themedReactContext);
    }

    /* access modifiers changed from: 0000 */
    public final void updateViewGroup(int i, int[] iArr, int[] iArr2) {
        View resolveView = resolveView(i);
        if (resolveView instanceof FlatViewGroup) {
            ((FlatViewGroup) resolveView).mountViews(this, iArr, iArr2);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) resolveView;
        ViewGroupManager viewGroupManager = (ViewGroupManager) resolveViewManager(i);
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int abs : iArr) {
            arrayList.add(resolveView(Math.abs(abs)));
        }
        viewGroupManager.addViews(viewGroup, arrayList);
    }

    /* access modifiers changed from: 0000 */
    public final void updateMountState(int i, DrawCommand[] drawCommandArr, AttachDetachListener[] attachDetachListenerArr, NodeRegion[] nodeRegionArr) {
        FlatViewGroup flatViewGroup = (FlatViewGroup) resolveView(i);
        if (drawCommandArr != null) {
            flatViewGroup.mountDrawCommands(drawCommandArr);
        }
        if (attachDetachListenerArr != null) {
            flatViewGroup.mountAttachDetachListeners(attachDetachListenerArr);
        }
        if (nodeRegionArr != null) {
            flatViewGroup.mountNodeRegions(nodeRegionArr);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void setPadding(int i, int i2, int i3, int i4, int i5) {
        resolveView(i).setPadding(i2, i3, i4, i5);
    }

    /* access modifiers changed from: 0000 */
    public final void updateViewBounds(int i, int i2, int i3, int i4, int i5) {
        View resolveView = resolveView(i);
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        if (resolveView.getWidth() == i6 && resolveView.getHeight() == i7) {
            resolveView.offsetLeftAndRight(i2 - resolveView.getLeft());
            resolveView.offsetTopAndBottom(i3 - resolveView.getTop());
            return;
        }
        resolveView.measure(MeasureSpec.makeMeasureSpec(i6, 1073741824), MeasureSpec.makeMeasureSpec(i7, 1073741824));
        resolveView.layout(i2, i3, i4, i5);
    }

    /* access modifiers changed from: 0000 */
    public final void updateClippingMountState(int i, DrawCommand[] drawCommandArr, SparseIntArray sparseIntArray, float[] fArr, float[] fArr2, AttachDetachListener[] attachDetachListenerArr, NodeRegion[] nodeRegionArr, float[] fArr3, float[] fArr4, boolean z) {
        AttachDetachListener[] attachDetachListenerArr2 = attachDetachListenerArr;
        NodeRegion[] nodeRegionArr2 = nodeRegionArr;
        FlatViewGroup flatViewGroup = (FlatViewGroup) resolveView(i);
        if (drawCommandArr != null) {
            flatViewGroup.mountClippingDrawCommands(drawCommandArr, sparseIntArray, fArr, fArr2, z);
        }
        if (attachDetachListenerArr2 != null) {
            flatViewGroup.mountAttachDetachListeners(attachDetachListenerArr);
        }
        if (nodeRegionArr2 != null) {
            flatViewGroup.mountClippingNodeRegions(nodeRegionArr2, fArr3, fArr4);
        }
    }
}
