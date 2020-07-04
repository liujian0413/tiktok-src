package com.facebook.react.views.viewpager;

import android.support.p022v4.view.PagerAdapter;
import android.support.p022v4.view.ViewPager;
import android.support.p022v4.view.ViewPager.C0935e;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.NativeGestureUtil;
import java.util.ArrayList;
import java.util.List;

public class ReactViewPager extends ViewPager {
    public final EventDispatcher mEventDispatcher;
    public boolean mIsCurrentItemFromJs;
    private boolean mScrollEnabled = true;
    private final Runnable measureAndLayout = new Runnable() {
        public void run() {
            ReactViewPager.this.measure(MeasureSpec.makeMeasureSpec(ReactViewPager.this.getWidth(), 1073741824), MeasureSpec.makeMeasureSpec(ReactViewPager.this.getHeight(), 1073741824));
            ReactViewPager.this.layout(ReactViewPager.this.getLeft(), ReactViewPager.this.getTop(), ReactViewPager.this.getRight(), ReactViewPager.this.getBottom());
        }
    };

    class Adapter extends PagerAdapter {
        private boolean mIsViewPagerInIntentionallyInconsistentState;
        private final List<View> mViews;

        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        public int getCount() {
            return this.mViews.size();
        }

        private Adapter() {
            this.mViews = new ArrayList();
            this.mIsViewPagerInIntentionallyInconsistentState = false;
        }

        /* access modifiers changed from: 0000 */
        public View getViewAt(int i) {
            return (View) this.mViews.get(i);
        }

        /* access modifiers changed from: 0000 */
        public void removeAllViewsFromAdapter(ViewPager viewPager) {
            this.mViews.clear();
            viewPager.removeAllViews();
            this.mIsViewPagerInIntentionallyInconsistentState = true;
        }

        public int getItemPosition(Object obj) {
            if (this.mIsViewPagerInIntentionallyInconsistentState || !this.mViews.contains(obj)) {
                return -2;
            }
            return this.mViews.indexOf(obj);
        }

        /* access modifiers changed from: 0000 */
        public void removeViewAt(int i) {
            this.mViews.remove(i);
            notifyDataSetChanged();
            ReactViewPager.this.setOffscreenPageLimit(this.mViews.size());
        }

        /* access modifiers changed from: 0000 */
        public void setViews(List<View> list) {
            this.mViews.clear();
            this.mViews.addAll(list);
            notifyDataSetChanged();
            this.mIsViewPagerInIntentionallyInconsistentState = false;
        }

        /* access modifiers changed from: 0000 */
        public void addView(View view, int i) {
            this.mViews.add(i, view);
            notifyDataSetChanged();
            ReactViewPager.this.setOffscreenPageLimit(this.mViews.size());
        }

        public Object instantiateItem(ViewGroup viewGroup, int i) {
            View view = (View) this.mViews.get(i);
            viewGroup.addView(view, 0, ReactViewPager.this.generateDefaultLayoutParams());
            return view;
        }

        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }
    }

    class PageChangeListener implements C0935e {
        private PageChangeListener() {
        }

        public void onPageSelected(int i) {
            if (!ReactViewPager.this.mIsCurrentItemFromJs) {
                ReactViewPager.this.mEventDispatcher.dispatchEvent(new PageSelectedEvent(ReactViewPager.this.getId(), i));
            }
        }

        public void onPageScrollStateChanged(int i) {
            String str;
            switch (i) {
                case 0:
                    str = "idle";
                    break;
                case 1:
                    str = "dragging";
                    break;
                case 2:
                    str = "settling";
                    break;
                default:
                    throw new IllegalStateException("Unsupported pageScrollState");
            }
            ReactViewPager.this.mEventDispatcher.dispatchEvent(new PageScrollStateChangedEvent(ReactViewPager.this.getId(), str));
        }

        public void onPageScrolled(int i, float f, int i2) {
            ReactViewPager.this.mEventDispatcher.dispatchEvent(new PageScrollEvent(ReactViewPager.this.getId(), i, f));
        }
    }

    public void removeAllViewsFromAdapter() {
        getAdapter().removeAllViewsFromAdapter(this);
    }

    public Adapter getAdapter() {
        return (Adapter) super.getAdapter();
    }

    /* access modifiers changed from: 0000 */
    public int getViewCountInAdapter() {
        return getAdapter().getCount();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestLayout();
        post(this.measureAndLayout);
    }

    public void setScrollEnabled(boolean z) {
        this.mScrollEnabled = z;
    }

    /* access modifiers changed from: 0000 */
    public void removeViewFromAdapter(int i) {
        getAdapter().removeViewAt(i);
    }

    public void setViews(List<View> list) {
        getAdapter().setViews(list);
    }

    /* access modifiers changed from: 0000 */
    public View getViewFromAdapter(int i) {
        return getAdapter().getViewAt(i);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.mScrollEnabled) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.mScrollEnabled) {
            return false;
        }
        try {
            if (super.onInterceptTouchEvent(motionEvent)) {
                NativeGestureUtil.notifyNativeGestureStarted(this, motionEvent);
                return true;
            }
        } catch (IllegalArgumentException unused) {
        }
        return false;
    }

    public ReactViewPager(ReactContext reactContext) {
        super(reactContext);
        this.mEventDispatcher = ((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher();
        this.mIsCurrentItemFromJs = false;
        setOnPageChangeListener(new PageChangeListener());
        setAdapter(new Adapter());
    }

    /* access modifiers changed from: 0000 */
    public void addViewToAdapter(View view, int i) {
        getAdapter().addView(view, i);
    }

    public void setCurrentItemFromJs(int i, boolean z) {
        this.mIsCurrentItemFromJs = true;
        setCurrentItem(i, z);
        this.mIsCurrentItemFromJs = false;
    }
}
