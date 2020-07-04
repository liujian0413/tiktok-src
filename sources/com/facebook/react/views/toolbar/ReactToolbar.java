package com.facebook.react.views.toolbar;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.p029v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.MeasureSpec;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.controller.C13400c;
import com.facebook.drawee.controller.C13401d;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.generic.C13439b;
import com.facebook.drawee.p698c.C13386a;
import com.facebook.drawee.view.C13445b;
import com.facebook.drawee.view.C13446c;
import com.facebook.imagepipeline.p720g.C13648f;
import com.facebook.imagepipeline.p720g.C13650h;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.PixelUtil;

public class ReactToolbar extends Toolbar {
    private final C13446c<C13438a> mActionsHolder = new C13446c<>();
    private final Runnable mLayoutRunnable = new Runnable() {
        public void run() {
            ReactToolbar.this.measure(MeasureSpec.makeMeasureSpec(ReactToolbar.this.getWidth(), 1073741824), MeasureSpec.makeMeasureSpec(ReactToolbar.this.getHeight(), 1073741824));
            ReactToolbar.this.layout(ReactToolbar.this.getLeft(), ReactToolbar.this.getTop(), ReactToolbar.this.getRight(), ReactToolbar.this.getBottom());
        }
    };
    private IconControllerListener mLogoControllerListener;
    private final C13445b mLogoHolder;
    private IconControllerListener mNavIconControllerListener;
    private final C13445b mNavIconHolder;
    private IconControllerListener mOverflowIconControllerListener;
    private final C13445b mOverflowIconHolder;

    class ActionIconControllerListener extends IconControllerListener {
        private final MenuItem mItem;

        /* access modifiers changed from: protected */
        public void setDrawable(Drawable drawable) {
            this.mItem.setIcon(drawable);
            ReactToolbar.this.requestLayout();
        }

        ActionIconControllerListener(MenuItem menuItem, C13445b bVar) {
            super(bVar);
            this.mItem = menuItem;
        }
    }

    abstract class IconControllerListener extends C13400c<C13648f> {
        private final C13445b mHolder;
        private IconImageInfo mIconImageInfo;

        /* access modifiers changed from: protected */
        public abstract void setDrawable(Drawable drawable);

        public void setIconImageInfo(IconImageInfo iconImageInfo) {
            this.mIconImageInfo = iconImageInfo;
        }

        public IconControllerListener(C13445b bVar) {
            this.mHolder = bVar;
        }

        public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
            super.onFinalImageSet(str, fVar, animatable);
            if (this.mIconImageInfo != null) {
                fVar = this.mIconImageInfo;
            }
            setDrawable(new DrawableWithIntrinsicSize(this.mHolder.mo32938f(), fVar));
        }
    }

    static class IconImageInfo implements C13648f {
        private int mHeight;
        private int mWidth;

        public int getHeight() {
            return this.mHeight;
        }

        public C13650h getQualityInfo() {
            return null;
        }

        public int getWidth() {
            return this.mWidth;
        }

        public IconImageInfo(int i, int i2) {
            this.mWidth = i;
            this.mHeight = i2;
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        attachDraweeHolders();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        detachDraweeHolders();
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        attachDraweeHolders();
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        detachDraweeHolders();
    }

    public void requestLayout() {
        super.requestLayout();
        post(this.mLayoutRunnable);
    }

    private void attachDraweeHolders() {
        this.mLogoHolder.mo32934b();
        this.mNavIconHolder.mo32934b();
        this.mOverflowIconHolder.mo32934b();
        this.mActionsHolder.mo32940a();
    }

    private C13438a createDraweeHierarchy() {
        return new C13439b(getResources()).mo32927e(C13423b.f35595c).mo32910a(0).mo32908a();
    }

    private void detachDraweeHolders() {
        this.mLogoHolder.mo32935c();
        this.mNavIconHolder.mo32935c();
        this.mOverflowIconHolder.mo32935c();
        this.mActionsHolder.mo32942b();
    }

    /* access modifiers changed from: 0000 */
    public void setLogoSource(ReadableMap readableMap) {
        setIconSource(readableMap, this.mLogoControllerListener, this.mLogoHolder);
    }

    /* access modifiers changed from: 0000 */
    public void setNavIconSource(ReadableMap readableMap) {
        setIconSource(readableMap, this.mNavIconControllerListener, this.mNavIconHolder);
    }

    /* access modifiers changed from: 0000 */
    public void setOverflowIconSource(ReadableMap readableMap) {
        setIconSource(readableMap, this.mOverflowIconControllerListener, this.mOverflowIconHolder);
    }

    private Drawable getDrawableByName(String str) {
        if (getDrawableResourceByName(str) != 0) {
            return getResources().getDrawable(getDrawableResourceByName(str));
        }
        return null;
    }

    private int getDrawableResourceByName(String str) {
        return getResources().getIdentifier(str, "drawable", getContext().getPackageName());
    }

    private IconImageInfo getIconImageInfo(ReadableMap readableMap) {
        if (!readableMap.hasKey("width") || !readableMap.hasKey("height")) {
            return null;
        }
        return new IconImageInfo(Math.round(PixelUtil.toPixelFromDIP((float) readableMap.getInt("width"))), Math.round(PixelUtil.toPixelFromDIP((float) readableMap.getInt("height"))));
    }

    public ReactToolbar(Context context) {
        super(context);
        this.mLogoHolder = C13445b.m39493a(createDraweeHierarchy(), context);
        this.mNavIconHolder = C13445b.m39493a(createDraweeHierarchy(), context);
        this.mOverflowIconHolder = C13445b.m39493a(createDraweeHierarchy(), context);
        this.mLogoControllerListener = new IconControllerListener(this.mLogoHolder) {
            /* access modifiers changed from: protected */
            public void setDrawable(Drawable drawable) {
                ReactToolbar.this.setLogo(drawable);
            }
        };
        this.mNavIconControllerListener = new IconControllerListener(this.mNavIconHolder) {
            /* access modifiers changed from: protected */
            public void setDrawable(Drawable drawable) {
                ReactToolbar.this.setNavigationIcon(drawable);
            }
        };
        this.mOverflowIconControllerListener = new IconControllerListener(this.mOverflowIconHolder) {
            /* access modifiers changed from: protected */
            public void setDrawable(Drawable drawable) {
                ReactToolbar.this.setOverflowIcon(drawable);
            }
        };
    }

    /* access modifiers changed from: 0000 */
    public void setActions(ReadableArray readableArray) {
        int i;
        Menu menu = getMenu();
        menu.clear();
        this.mActionsHolder.mo32943c();
        if (readableArray != null) {
            for (int i2 = 0; i2 < readableArray.size(); i2++) {
                ReadableMap map = readableArray.getMap(i2);
                MenuItem add = menu.add(0, 0, i2, map.getString("title"));
                if (map.hasKey("icon")) {
                    setMenuItemIcon(add, map.getMap("icon"));
                }
                if (map.hasKey("show")) {
                    i = map.getInt("show");
                } else {
                    i = 0;
                }
                if (map.hasKey("showWithText") && map.getBoolean("showWithText")) {
                    i |= 4;
                }
                add.setShowAsAction(i);
            }
        }
    }

    private void setMenuItemIcon(MenuItem menuItem, ReadableMap readableMap) {
        C13445b a = C13445b.m39493a(createDraweeHierarchy(), getContext());
        ActionIconControllerListener actionIconControllerListener = new ActionIconControllerListener(menuItem, a);
        actionIconControllerListener.setIconImageInfo(getIconImageInfo(readableMap));
        setIconSource(readableMap, actionIconControllerListener, a);
        this.mActionsHolder.mo32941a(a);
    }

    private void setIconSource(ReadableMap readableMap, IconControllerListener iconControllerListener, C13445b bVar) {
        String str;
        if (readableMap != null) {
            str = readableMap.getString("uri");
        } else {
            str = null;
        }
        if (str == null) {
            iconControllerListener.setIconImageInfo(null);
            iconControllerListener.setDrawable(null);
        } else if (str.startsWith("http://") || str.startsWith("https://") || str.startsWith("file://")) {
            iconControllerListener.setIconImageInfo(getIconImageInfo(readableMap));
            bVar.mo32931a((C13386a) ((C13382e) ((C13382e) C13380c.m39166a().mo32713b(Uri.parse(str)).mo32743a((C13401d<? super INFO>) iconControllerListener)).mo32729b(bVar.f35652b)).mo32730f());
            bVar.mo32938f().setVisible(true, true);
        } else {
            iconControllerListener.setDrawable(getDrawableByName(str));
        }
    }
}
