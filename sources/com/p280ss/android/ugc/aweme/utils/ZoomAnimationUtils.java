package com.p280ss.android.ugc.aweme.utils;

import android.animation.Animator.AnimatorListener;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.drawable.ColorDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.animation.AccelerateDecelerateInterpolator;

/* renamed from: com.ss.android.ugc.aweme.utils.ZoomAnimationUtils */
public final class ZoomAnimationUtils {

    /* renamed from: com.ss.android.ugc.aweme.utils.ZoomAnimationUtils$ZoomInfo */
    public static class ZoomInfo implements Parcelable {
        public static final Creator<ZoomInfo> CREATOR = new Creator<ZoomInfo>() {
            /* renamed from: a */
            private static ZoomInfo[] m136233a(int i) {
                return new ZoomInfo[i];
            }

            /* renamed from: a */
            private static ZoomInfo m136232a(Parcel parcel) {
                return new ZoomInfo(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m136232a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m136233a(i);
            }
        };

        /* renamed from: a */
        public int f111435a;

        /* renamed from: b */
        public int f111436b;

        /* renamed from: c */
        public int f111437c;

        /* renamed from: d */
        public int f111438d;

        public int describeContents() {
            return 0;
        }

        protected ZoomInfo(Parcel parcel) {
            this.f111435a = parcel.readInt();
            this.f111436b = parcel.readInt();
            this.f111437c = parcel.readInt();
            this.f111438d = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f111435a);
            parcel.writeInt(this.f111436b);
            parcel.writeInt(this.f111437c);
            parcel.writeInt(this.f111438d);
        }

        public ZoomInfo(int i, int i2, int i3, int i4) {
            this.f111435a = i;
            this.f111436b = i2;
            this.f111437c = i3;
            this.f111438d = i4;
        }
    }

    /* renamed from: a */
    public static ZoomInfo m136228a(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new ZoomInfo(iArr[0], iArr[1], view.getWidth(), view.getHeight());
    }

    /* renamed from: a */
    public static void m136230a(final ZoomInfo zoomInfo, final View view, AnimatorListener animatorListener) {
        view.getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener(null) {
            public final boolean onPreDraw() {
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                int i = zoomInfo.f111437c;
                int i2 = zoomInfo.f111438d;
                float width = ((float) view.getWidth()) / ((float) i);
                float height = ((float) view.getHeight()) / ((float) i2);
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int i3 = iArr[0];
                int i4 = zoomInfo.f111435a - i3;
                int i5 = zoomInfo.f111436b - iArr[1];
                view.setPivotX(0.0f);
                view.setPivotY(0.0f);
                view.setAlpha(0.0f);
                view.setTranslationX((float) i4);
                view.setTranslationY((float) i5);
                if (width == 0.0f || height == 0.0f) {
                    return false;
                }
                view.setScaleX(1.0f / width);
                view.setScaleY(1.0f / height);
                view.setVisibility(0);
                ViewPropertyAnimator animate = view.animate();
                animate.setDuration(300).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationX(0.0f).translationY(0.0f);
                animate.setInterpolator(new AccelerateDecelerateInterpolator());
                if (null != null) {
                    animate.setListener(null);
                }
                animate.start();
                return true;
            }
        });
    }

    /* renamed from: a */
    public static void m136229a(final View view, final ColorDrawable colorDrawable, int... iArr) {
        if (view != null) {
            ObjectAnimator ofInt = ObjectAnimator.ofInt(colorDrawable, "alpha", iArr);
            ofInt.setDuration(300);
            ofInt.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    view.setBackgroundDrawable(colorDrawable);
                }
            });
            ofInt.start();
        }
    }

    /* renamed from: b */
    public static void m136231b(ZoomInfo zoomInfo, View view, AnimatorListener animatorListener) {
        int i = zoomInfo.f111437c;
        int i2 = zoomInfo.f111438d;
        int width = view.getWidth();
        int height = view.getHeight();
        int i3 = zoomInfo.f111435a;
        int i4 = zoomInfo.f111436b;
        float f = ((float) i) / ((float) width);
        float f2 = ((float) i2) / ((float) height);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i5 = i3 - iArr[0];
        int i6 = i4 - iArr[1];
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setVisibility(0);
        ViewPropertyAnimator animate = view.animate();
        animate.setDuration(300).scaleX(f).scaleY(f2).translationX((float) i5).translationY((float) i6);
        animate.setListener(animatorListener);
        animate.start();
    }
}
