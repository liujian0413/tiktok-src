package com.facebook.react.uimanager;

import com.facebook.infer.p728a.C13854a;
import com.facebook.yoga.C14644a;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaBaselineFunction;
import com.facebook.yoga.YogaConfig;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaDisplay;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaNode;
import com.facebook.yoga.YogaNodeClonedFunction;
import com.facebook.yoga.YogaOverflow;
import com.facebook.yoga.YogaPositionType;
import com.facebook.yoga.YogaValue;
import com.facebook.yoga.YogaWrap;
import java.util.ArrayList;
import java.util.Arrays;

public class ReactShadowNodeImpl implements ReactShadowNode<ReactShadowNodeImpl> {
    private static final YogaConfig sYogaConfig;
    private ArrayList<ReactShadowNodeImpl> mChildren;
    private final Spacing mDefaultPadding = new Spacing(0.0f);
    private boolean mIsLayoutOnly;
    private ArrayList<ReactShadowNodeImpl> mNativeChildren;
    private ReactShadowNodeImpl mNativeParent;
    private ReactStylesDiffMap mNewProps;
    private boolean mNodeUpdated = true;
    private final float[] mPadding = new float[9];
    private final boolean[] mPaddingIsPercent = new boolean[9];
    private ReactShadowNodeImpl mParent;
    private int mReactTag;
    private ReactShadowNodeImpl mRootNode;
    private int mRootTag;
    private int mScreenHeight;
    private int mScreenWidth;
    private int mScreenX;
    private int mScreenY;
    private boolean mShouldNotifyOnLayout;
    private ThemedReactContext mThemedContext;
    private int mTotalNativeChildren;
    private String mViewClassName;
    private final YogaNode mYogaNode;

    public final ReactShadowNodeImpl getNativeParent() {
        return this.mNativeParent;
    }

    public ReactStylesDiffMap getNewProps() {
        return this.mNewProps;
    }

    public final ReactShadowNodeImpl getParent() {
        return this.mParent;
    }

    public final int getReactTag() {
        return this.mReactTag;
    }

    public int getScreenHeight() {
        return this.mScreenHeight;
    }

    public int getScreenWidth() {
        return this.mScreenWidth;
    }

    public int getScreenX() {
        return this.mScreenX;
    }

    public int getScreenY() {
        return this.mScreenY;
    }

    public final int getTotalNativeChildren() {
        return this.mTotalNativeChildren;
    }

    public final boolean hasUnseenUpdates() {
        return this.mNodeUpdated;
    }

    public final boolean isLayoutOnly() {
        return this.mIsLayoutOnly;
    }

    public boolean isVirtual() {
        return false;
    }

    public boolean isVirtualAnchor() {
        return false;
    }

    public void onAfterUpdateTransaction() {
    }

    public void onBeforeLayout() {
    }

    public void onCollectExtraUpdates(UIViewOperationQueue uIViewOperationQueue) {
    }

    public void setLocalData(Object obj) {
    }

    public final boolean shouldNotifyOnLayout() {
        return this.mShouldNotifyOnLayout;
    }

    public String toString() {
        return this.mViewClassName;
    }

    public final YogaDirection getLayoutDirection() {
        return this.mYogaNode.getLayoutDirection();
    }

    public final float getLayoutHeight() {
        return this.mYogaNode.getLayoutHeight();
    }

    public final float getLayoutWidth() {
        return this.mYogaNode.getLayoutWidth();
    }

    public final float getLayoutX() {
        return this.mYogaNode.getLayoutX();
    }

    public final float getLayoutY() {
        return this.mYogaNode.getLayoutY();
    }

    public final YogaValue getStyleHeight() {
        return this.mYogaNode.getHeight();
    }

    public final YogaValue getStyleWidth() {
        return this.mYogaNode.getWidth();
    }

    public boolean isMeasureDefined() {
        return this.mYogaNode.isMeasureDefined();
    }

    public boolean isYogaLeafNode() {
        return isMeasureDefined();
    }

    public void setFlexBasisAuto() {
        this.mYogaNode.setFlexBasisAuto();
    }

    public void setStyleHeightAuto() {
        this.mYogaNode.setHeightAuto();
    }

    public void setStyleWidthAuto() {
        this.mYogaNode.setWidthAuto();
    }

    static {
        YogaConfig yogaConfig = ReactYogaConfigProvider.get();
        sYogaConfig = yogaConfig;
        yogaConfig.setOnNodeCloned(new YogaNodeClonedFunction() {
            public final void onNodeCloned(YogaNode yogaNode, YogaNode yogaNode2, YogaNode yogaNode3, int i) {
                C13854a.m40916b((ReactShadowNode) yogaNode3.getData());
                C13854a.m40916b((ReactShadowNode) yogaNode2.getData());
            }
        });
    }

    public void calculateLayout() {
        this.mYogaNode.calculateLayout(1.0E21f, 1.0E21f);
    }

    public void dirty() {
        if (!isVirtual()) {
            this.mYogaNode.dirty();
        }
    }

    public final int getChildCount() {
        if (this.mChildren == null) {
            return 0;
        }
        return this.mChildren.size();
    }

    public String getHierarchyInfo() {
        StringBuilder sb = new StringBuilder();
        getHierarchyInfoWithIndentation(sb, 0);
        return sb.toString();
    }

    public final int getNativeChildCount() {
        if (this.mNativeChildren == null) {
            return 0;
        }
        return this.mNativeChildren.size();
    }

    public final ReactShadowNodeImpl getRootNode() {
        return (ReactShadowNodeImpl) C13854a.m40916b(this.mRootNode);
    }

    public final ThemedReactContext getThemedContext() {
        return (ThemedReactContext) C13854a.m40916b(this.mThemedContext);
    }

    public final String getViewClass() {
        return (String) C13854a.m40916b(this.mViewClassName);
    }

    public final boolean hasNewLayout() {
        if (this.mYogaNode == null || !this.mYogaNode.hasNewLayout()) {
            return false;
        }
        return true;
    }

    public final boolean isDirty() {
        if (this.mYogaNode == null || !this.mYogaNode.isDirty()) {
            return false;
        }
        return true;
    }

    public final void markLayoutSeen() {
        if (this.mYogaNode != null) {
            this.mYogaNode.markLayoutSeen();
        }
    }

    public final void markUpdateSeen() {
        this.mNodeUpdated = false;
        if (hasNewLayout()) {
            markLayoutSeen();
        }
    }

    public ReactShadowNodeImpl mutableCopy() {
        return new ReactShadowNodeImpl(this);
    }

    public ReactShadowNodeImpl mutableCopyWithNewChildren() {
        ReactShadowNodeImpl mutableCopy = mutableCopy();
        mutableCopy.mNativeChildren = null;
        mutableCopy.mChildren = null;
        return mutableCopy;
    }

    public void dispose() {
        if (this.mYogaNode != null) {
            this.mYogaNode.reset();
            YogaNodePool.get().release(this.mYogaNode);
        }
    }

    public final boolean hasUpdates() {
        if (this.mNodeUpdated || hasNewLayout() || isDirty()) {
            return true;
        }
        return false;
    }

    public void markUpdated() {
        if (!this.mNodeUpdated) {
            this.mNodeUpdated = true;
            ReactShadowNodeImpl parent = getParent();
            if (parent != null) {
                parent.markUpdated();
            }
        }
    }

    public final void removeAllNativeChildren() {
        if (this.mNativeChildren != null) {
            for (int size = this.mNativeChildren.size() - 1; size >= 0; size--) {
                ((ReactShadowNodeImpl) this.mNativeChildren.get(size)).mNativeParent = null;
            }
            this.mNativeChildren.clear();
        }
    }

    public ReactShadowNodeImpl() {
        if (!isVirtual()) {
            YogaNode yogaNode = (YogaNode) YogaNodePool.get().acquire();
            if (yogaNode == null) {
                yogaNode = new YogaNode(sYogaConfig);
            }
            this.mYogaNode = yogaNode;
            this.mYogaNode.setData(this);
            Arrays.fill(this.mPadding, 1.0E21f);
            return;
        }
        this.mYogaNode = null;
    }

    public void removeAndDisposeAllChildren() {
        int i;
        if (getChildCount() != 0) {
            int i2 = 0;
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (this.mYogaNode != null && !isYogaLeafNode()) {
                    this.mYogaNode.removeChildAt(childCount);
                }
                ReactShadowNodeImpl childAt = getChildAt(childCount);
                childAt.mParent = null;
                childAt.dispose();
                if (childAt.isLayoutOnly()) {
                    i = childAt.getTotalNativeChildren();
                } else {
                    i = 1;
                }
                i2 += i;
            }
            ((ArrayList) C13854a.m40916b(this.mChildren)).clear();
            markUpdated();
            this.mTotalNativeChildren -= i2;
            updateNativeChildrenCountInParent(-i2);
        }
    }

    private void updatePadding() {
        for (int i = 0; i <= 8; i++) {
            if (i == 0 || i == 2 || i == 4 || i == 5) {
                if (C14644a.m42350a(this.mPadding[i]) && C14644a.m42350a(this.mPadding[6]) && C14644a.m42350a(this.mPadding[8])) {
                    this.mYogaNode.setPadding(YogaEdge.fromInt(i), this.mDefaultPadding.getRaw(i));
                }
            } else if (i == 1 || i == 3) {
                if (C14644a.m42350a(this.mPadding[i]) && C14644a.m42350a(this.mPadding[7]) && C14644a.m42350a(this.mPadding[8])) {
                    this.mYogaNode.setPadding(YogaEdge.fromInt(i), this.mDefaultPadding.getRaw(i));
                }
            } else if (C14644a.m42350a(this.mPadding[i])) {
                this.mYogaNode.setPadding(YogaEdge.fromInt(i), this.mDefaultPadding.getRaw(i));
            }
            if (this.mPaddingIsPercent[i]) {
                this.mYogaNode.setPaddingPercent(YogaEdge.fromInt(i), this.mPadding[i]);
            } else {
                this.mYogaNode.setPadding(YogaEdge.fromInt(i), this.mPadding[i]);
            }
        }
    }

    public void setReactTag(int i) {
        this.mReactTag = i;
    }

    public final void setRootNode(ReactShadowNodeImpl reactShadowNodeImpl) {
        this.mRootNode = reactShadowNodeImpl;
    }

    public void setShouldNotifyOnLayout(boolean z) {
        this.mShouldNotifyOnLayout = z;
    }

    public void setThemedContext(ThemedReactContext themedReactContext) {
        this.mThemedContext = themedReactContext;
    }

    public final void setViewClassName(String str) {
        this.mViewClassName = str;
    }

    public void setAlignContent(YogaAlign yogaAlign) {
        this.mYogaNode.setAlignContent(yogaAlign);
    }

    public void setAlignItems(YogaAlign yogaAlign) {
        this.mYogaNode.setAlignItems(yogaAlign);
    }

    public void setAlignSelf(YogaAlign yogaAlign) {
        this.mYogaNode.setAlignSelf(yogaAlign);
    }

    public void setBaselineFunction(YogaBaselineFunction yogaBaselineFunction) {
        this.mYogaNode.setBaselineFunction(yogaBaselineFunction);
    }

    public void setDisplay(YogaDisplay yogaDisplay) {
        this.mYogaNode.setDisplay(yogaDisplay);
    }

    public void setFlex(float f) {
        this.mYogaNode.setFlex(f);
    }

    public void setFlexBasis(float f) {
        this.mYogaNode.setFlexBasis(f);
    }

    public void setFlexBasisPercent(float f) {
        this.mYogaNode.setFlexBasisPercent(f);
    }

    public void setFlexDirection(YogaFlexDirection yogaFlexDirection) {
        this.mYogaNode.setFlexDirection(yogaFlexDirection);
    }

    public void setFlexGrow(float f) {
        this.mYogaNode.setFlexGrow(f);
    }

    public void setFlexShrink(float f) {
        this.mYogaNode.setFlexShrink(f);
    }

    public void setFlexWrap(YogaWrap yogaWrap) {
        this.mYogaNode.setWrap(yogaWrap);
    }

    public void setJustifyContent(YogaJustify yogaJustify) {
        this.mYogaNode.setJustifyContent(yogaJustify);
    }

    public void setLayoutDirection(YogaDirection yogaDirection) {
        this.mYogaNode.setDirection(yogaDirection);
    }

    public void setOverflow(YogaOverflow yogaOverflow) {
        this.mYogaNode.setOverflow(yogaOverflow);
    }

    public void setPositionType(YogaPositionType yogaPositionType) {
        this.mYogaNode.setPositionType(yogaPositionType);
    }

    public void setStyleAspectRatio(float f) {
        this.mYogaNode.setAspectRatio(f);
    }

    public void setStyleHeight(float f) {
        this.mYogaNode.setHeight(f);
    }

    public void setStyleHeightPercent(float f) {
        this.mYogaNode.setHeightPercent(f);
    }

    public void setStyleMaxHeight(float f) {
        this.mYogaNode.setMaxHeight(f);
    }

    public void setStyleMaxHeightPercent(float f) {
        this.mYogaNode.setMaxHeightPercent(f);
    }

    public void setStyleMaxWidth(float f) {
        this.mYogaNode.setMaxWidth(f);
    }

    public void setStyleMaxWidthPercent(float f) {
        this.mYogaNode.setMaxWidthPercent(f);
    }

    public void setStyleMinHeight(float f) {
        this.mYogaNode.setMinHeight(f);
    }

    public void setStyleMinHeightPercent(float f) {
        this.mYogaNode.setMinHeightPercent(f);
    }

    public void setStyleMinWidth(float f) {
        this.mYogaNode.setMinWidth(f);
    }

    public void setStyleMinWidthPercent(float f) {
        this.mYogaNode.setMinWidthPercent(f);
    }

    public void setStyleWidth(float f) {
        this.mYogaNode.setWidth(f);
    }

    public void setStyleWidthPercent(float f) {
        this.mYogaNode.setWidthPercent(f);
    }

    public final void updateProperties(ReactStylesDiffMap reactStylesDiffMap) {
        ViewManagerPropertyUpdater.updateProps(this, reactStylesDiffMap);
        onAfterUpdateTransaction();
    }

    public final float getPadding(int i) {
        return this.mYogaNode.getLayoutPadding(YogaEdge.fromInt(i));
    }

    public final YogaValue getStylePadding(int i) {
        return this.mYogaNode.getPadding(YogaEdge.fromInt(i));
    }

    public final int indexOf(ReactShadowNodeImpl reactShadowNodeImpl) {
        if (this.mChildren == null) {
            return -1;
        }
        return this.mChildren.indexOf(reactShadowNodeImpl);
    }

    public final int indexOfNativeChild(ReactShadowNodeImpl reactShadowNodeImpl) {
        C13854a.m40916b(this.mNativeChildren);
        return this.mNativeChildren.indexOf(reactShadowNodeImpl);
    }

    public ReactShadowNodeImpl mutableCopyWithNewChildrenAndProps(ReactStylesDiffMap reactStylesDiffMap) {
        ReactShadowNodeImpl mutableCopyWithNewChildren = mutableCopyWithNewChildren();
        if (reactStylesDiffMap != null) {
            mutableCopyWithNewChildren.updateProperties(reactStylesDiffMap);
            mutableCopyWithNewChildren.mNewProps = reactStylesDiffMap;
        }
        return mutableCopyWithNewChildren;
    }

    public ReactShadowNodeImpl mutableCopyWithNewProps(ReactStylesDiffMap reactStylesDiffMap) {
        ReactShadowNodeImpl mutableCopy = mutableCopy();
        if (reactStylesDiffMap != null) {
            mutableCopy.updateProperties(reactStylesDiffMap);
            mutableCopy.mNewProps = reactStylesDiffMap;
        }
        return mutableCopy;
    }

    public void setMarginAuto(int i) {
        this.mYogaNode.setMarginAuto(YogaEdge.fromInt(i));
    }

    private void updateNativeChildrenCountInParent(int i) {
        if (this.mIsLayoutOnly) {
            ReactShadowNodeImpl parent = getParent();
            while (parent != null) {
                parent.mTotalNativeChildren += i;
                if (parent.isLayoutOnly()) {
                    parent = parent.getParent();
                } else {
                    return;
                }
            }
        }
    }

    public boolean isDescendantOf(ReactShadowNodeImpl reactShadowNodeImpl) {
        for (ReactShadowNodeImpl parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent == reactShadowNodeImpl) {
                return true;
            }
        }
        return false;
    }

    public final ReactShadowNodeImpl removeNativeChildAt(int i) {
        C13854a.m40916b(this.mNativeChildren);
        ReactShadowNodeImpl reactShadowNodeImpl = (ReactShadowNodeImpl) this.mNativeChildren.remove(i);
        reactShadowNodeImpl.mNativeParent = null;
        return reactShadowNodeImpl;
    }

    public final ReactShadowNodeImpl getChildAt(int i) {
        if (this.mChildren != null) {
            return (ReactShadowNodeImpl) this.mChildren.get(i);
        }
        StringBuilder sb = new StringBuilder("Index ");
        sb.append(i);
        sb.append(" out of bounds: node has no children");
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }

    public final void setIsLayoutOnly(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (getParent() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C13854a.m40915a(z2, "Must remove from no opt parent first");
        if (this.mNativeParent == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        C13854a.m40915a(z3, "Must remove from native parent first");
        if (getNativeChildCount() == 0) {
            z4 = true;
        }
        C13854a.m40915a(z4, "Must remove all native children first");
        this.mIsLayoutOnly = z;
    }

    public void setMeasureFunction(YogaMeasureFunction yogaMeasureFunction) {
        boolean z;
        if (yogaMeasureFunction == null) {
            z = true;
        } else {
            z = false;
        }
        if (!(z ^ this.mYogaNode.isMeasureDefined()) || getChildCount() == 0) {
            this.mYogaNode.setMeasureFunction(yogaMeasureFunction);
            return;
        }
        throw new RuntimeException("Since a node with a measure function does not add any native yoga children, it's not safe to transition to/from having a measure function unless a node has no children");
    }

    public final int getNativeOffsetForChild(ReactShadowNodeImpl reactShadowNodeImpl) {
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i >= getChildCount()) {
                break;
            }
            ReactShadowNodeImpl childAt = getChildAt(i);
            if (reactShadowNodeImpl == childAt) {
                z = true;
                break;
            }
            if (childAt.isLayoutOnly()) {
                i3 = childAt.getTotalNativeChildren();
            }
            i2 += i3;
            i++;
        }
        if (z) {
            return i2;
        }
        StringBuilder sb = new StringBuilder("Child ");
        sb.append(reactShadowNodeImpl.getReactTag());
        sb.append(" was not a child of ");
        sb.append(this.mReactTag);
        throw new RuntimeException(sb.toString());
    }

    public ReactShadowNodeImpl removeChildAt(int i) {
        int i2;
        if (this.mChildren != null) {
            ReactShadowNodeImpl reactShadowNodeImpl = (ReactShadowNodeImpl) this.mChildren.remove(i);
            reactShadowNodeImpl.mParent = null;
            if (this.mYogaNode != null && !isYogaLeafNode()) {
                this.mYogaNode.removeChildAt(i);
            }
            markUpdated();
            if (reactShadowNodeImpl.isLayoutOnly()) {
                i2 = reactShadowNodeImpl.getTotalNativeChildren();
            } else {
                i2 = 1;
            }
            this.mTotalNativeChildren -= i2;
            updateNativeChildrenCountInParent(-i2);
            return reactShadowNodeImpl;
        }
        StringBuilder sb = new StringBuilder("Index ");
        sb.append(i);
        sb.append(" out of bounds: node has no children");
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }

    public ReactShadowNodeImpl(ReactShadowNodeImpl reactShadowNodeImpl) {
        ArrayList<ReactShadowNodeImpl> arrayList;
        ArrayList<ReactShadowNodeImpl> arrayList2;
        try {
            this.mReactTag = reactShadowNodeImpl.mReactTag;
            this.mRootTag = reactShadowNodeImpl.mRootTag;
            this.mViewClassName = reactShadowNodeImpl.mViewClassName;
            this.mRootNode = reactShadowNodeImpl.mRootNode;
            this.mThemedContext = reactShadowNodeImpl.mThemedContext;
            this.mShouldNotifyOnLayout = reactShadowNodeImpl.mShouldNotifyOnLayout;
            this.mNodeUpdated = reactShadowNodeImpl.mNodeUpdated;
            if (reactShadowNodeImpl.mChildren == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList<>(reactShadowNodeImpl.mChildren);
            }
            this.mChildren = arrayList;
            this.mIsLayoutOnly = reactShadowNodeImpl.mIsLayoutOnly;
            this.mTotalNativeChildren = reactShadowNodeImpl.mTotalNativeChildren;
            this.mNativeParent = reactShadowNodeImpl.mNativeParent;
            if (reactShadowNodeImpl.mNativeChildren == null) {
                arrayList2 = null;
            } else {
                arrayList2 = new ArrayList<>(reactShadowNodeImpl.mNativeChildren);
            }
            this.mNativeChildren = arrayList2;
            this.mNativeParent = reactShadowNodeImpl.mNativeParent;
            this.mScreenX = reactShadowNodeImpl.mScreenX;
            this.mScreenY = reactShadowNodeImpl.mScreenY;
            this.mScreenWidth = reactShadowNodeImpl.mScreenWidth;
            this.mScreenHeight = reactShadowNodeImpl.mScreenHeight;
            System.arraycopy(reactShadowNodeImpl.mPadding, 0, this.mPadding, 0, reactShadowNodeImpl.mPadding.length);
            System.arraycopy(reactShadowNodeImpl.mPaddingIsPercent, 0, this.mPaddingIsPercent, 0, reactShadowNodeImpl.mPaddingIsPercent.length);
            this.mYogaNode = reactShadowNodeImpl.mYogaNode.clone();
            this.mYogaNode.setData(this);
            this.mParent = null;
            this.mNewProps = null;
        } catch (CloneNotSupportedException unused) {
            throw new IllegalArgumentException();
        }
    }

    public void setBorder(int i, float f) {
        this.mYogaNode.setBorder(YogaEdge.fromInt(i), f);
    }

    public void setDefaultPadding(int i, float f) {
        this.mDefaultPadding.set(i, f);
        updatePadding();
    }

    public void setMargin(int i, float f) {
        this.mYogaNode.setMargin(YogaEdge.fromInt(i), f);
    }

    public void setMarginPercent(int i, float f) {
        this.mYogaNode.setMarginPercent(YogaEdge.fromInt(i), f);
    }

    public void setPadding(int i, float f) {
        this.mPadding[i] = f;
        this.mPaddingIsPercent[i] = false;
        updatePadding();
    }

    public void setPosition(int i, float f) {
        this.mYogaNode.setPosition(YogaEdge.fromInt(i), f);
    }

    public void setPositionPercent(int i, float f) {
        this.mYogaNode.setPositionPercent(YogaEdge.fromInt(i), f);
    }

    public void setPaddingPercent(int i, float f) {
        this.mPadding[i] = f;
        this.mPaddingIsPercent[i] = !C14644a.m42350a(f);
        updatePadding();
    }

    public final void addNativeChildAt(ReactShadowNodeImpl reactShadowNodeImpl, int i) {
        C13854a.m40914a(!this.mIsLayoutOnly);
        C13854a.m40914a(!reactShadowNodeImpl.mIsLayoutOnly);
        if (this.mNativeChildren == null) {
            this.mNativeChildren = new ArrayList<>(4);
        }
        this.mNativeChildren.add(i, reactShadowNodeImpl);
        reactShadowNodeImpl.mNativeParent = this;
    }

    private void getHierarchyInfoWithIndentation(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("__");
        }
        sb.append(getClass().getSimpleName());
        sb.append(" ");
        sb.append(getReactTag());
        sb.append(" ");
        if (this.mYogaNode != null) {
            sb.append(getScreenX());
            sb.append(";");
            sb.append(getScreenY());
            sb.append(";");
            sb.append(getLayoutWidth());
            sb.append(";");
            sb.append(getLayoutHeight());
        } else {
            sb.append("(virtual node)");
        }
        sb.append("\n");
        if (getChildCount() != 0) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                getChildAt(i3).getHierarchyInfoWithIndentation(sb, i + 1);
            }
        }
    }

    public void addChildAt(ReactShadowNodeImpl reactShadowNodeImpl, int i) {
        int i2;
        if (reactShadowNodeImpl.getParent() == null) {
            if (this.mChildren == null) {
                this.mChildren = new ArrayList<>(4);
            }
            this.mChildren.add(i, reactShadowNodeImpl);
            reactShadowNodeImpl.mParent = this;
            if (this.mYogaNode != null && !isYogaLeafNode()) {
                YogaNode yogaNode = reactShadowNodeImpl.mYogaNode;
                if (yogaNode != null) {
                    this.mYogaNode.addChildAt(yogaNode, i);
                } else {
                    StringBuilder sb = new StringBuilder("Cannot add a child that doesn't have a YogaNode to a parent without a measure function! (Trying to add a '");
                    sb.append(reactShadowNodeImpl.toString());
                    sb.append("' to a '");
                    sb.append(toString());
                    sb.append("')");
                    throw new RuntimeException(sb.toString());
                }
            }
            markUpdated();
            if (reactShadowNodeImpl.isLayoutOnly()) {
                i2 = reactShadowNodeImpl.getTotalNativeChildren();
            } else {
                i2 = 1;
            }
            this.mTotalNativeChildren += i2;
            updateNativeChildrenCountInParent(i2);
            return;
        }
        throw new IllegalViewOperationException("Tried to add child that already has a parent! Remove it from its parent first.");
    }

    public boolean dispatchUpdates(float f, float f2, UIViewOperationQueue uIViewOperationQueue, NativeViewHierarchyOptimizer nativeViewHierarchyOptimizer) {
        if (this.mNodeUpdated) {
            onCollectExtraUpdates(uIViewOperationQueue);
        }
        boolean z = false;
        if (!hasNewLayout()) {
            return false;
        }
        float layoutX = getLayoutX();
        float layoutY = getLayoutY();
        float f3 = f + layoutX;
        int round = Math.round(f3);
        float f4 = f2 + layoutY;
        int round2 = Math.round(f4);
        int round3 = Math.round(f3 + getLayoutWidth());
        int round4 = Math.round(f4 + getLayoutHeight());
        int round5 = Math.round(layoutX);
        int round6 = Math.round(layoutY);
        int i = round3 - round;
        int i2 = round4 - round2;
        if (!(round5 == this.mScreenX && round6 == this.mScreenY && i == this.mScreenWidth && i2 == this.mScreenHeight)) {
            z = true;
        }
        this.mScreenX = round5;
        this.mScreenY = round6;
        this.mScreenWidth = i;
        this.mScreenHeight = i2;
        if (z) {
            if (nativeViewHierarchyOptimizer != null) {
                nativeViewHierarchyOptimizer.handleUpdateLayout(this);
            } else {
                uIViewOperationQueue.enqueueUpdateLayout(getParent().getReactTag(), getReactTag(), getScreenX(), getScreenY(), getScreenWidth(), getScreenHeight());
            }
        }
        return z;
    }
}
