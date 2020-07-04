package com.ttnet.org.chromium.base;

import android.app.Activity;
import android.app.ActivityManager.TaskDescription;
import android.app.ActivityOptions;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.Process;
import android.os.StatFs;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.os.UserManager;
import android.provider.Settings.Secure;
import android.support.p022v4.widget.C1052j;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodSubtype;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.File;
import java.io.UnsupportedEncodingException;

public class ApiCompatibilityUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    static class FinishAndRemoveTaskWithRetry implements Runnable {
        private final Activity mActivity;
        private int mTryCount;

        public void run() {
            this.mActivity.finishAndRemoveTask();
            this.mTryCount++;
            if (!this.mActivity.isFinishing()) {
                if (((long) this.mTryCount) < 3) {
                    ThreadUtils.postOnUiThreadDelayed(this, 500);
                    return;
                }
                this.mActivity.finish();
            }
        }

        FinishAndRemoveTaskWithRetry(Activity activity) {
            this.mActivity = activity;
        }
    }

    static class LayerDrawableCompat extends LayerDrawable {
        private boolean mMutated;

        public Drawable mutate() {
            if (this.mMutated) {
                return this;
            }
            Rect[] layersBounds = ApiCompatibilityUtils.getLayersBounds(this);
            Drawable mutate = super.mutate();
            if (mutate != this) {
                return mutate;
            }
            ApiCompatibilityUtils.restoreLayersBounds(this, layersBounds);
            this.mMutated = true;
            return this;
        }

        LayerDrawableCompat(Drawable[] drawableArr) {
            super(drawableArr);
        }
    }

    static class TransitionDrawableCompat extends TransitionDrawable {
        private boolean mMutated;

        public Drawable mutate() {
            if (this.mMutated) {
                return this;
            }
            Rect[] layersBounds = ApiCompatibilityUtils.getLayersBounds(this);
            Drawable mutate = super.mutate();
            if (mutate != this) {
                return mutate;
            }
            ApiCompatibilityUtils.restoreLayersBounds(this, layersBounds);
            this.mMutated = true;
            return this;
        }

        TransitionDrawableCompat(Drawable[] drawableArr) {
            super(drawableArr);
        }
    }

    private ApiCompatibilityUtils() {
    }

    public static int compareBoolean(boolean z, boolean z2) {
        if (z == z2) {
            return 0;
        }
        return z ? 1 : -1;
    }

    public static int compareLong(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    private static boolean isPasswordInputType(int i) {
        int i2 = i & 4095;
        return i2 == 129 || i2 == 225 || i2 == 18;
    }

    public static int getActivityNewDocumentFlag() {
        return VERSION.SDK_INT >= 21 ? 524288 : 524288;
    }

    public static boolean isElevationSupported() {
        if (VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    public static boolean isPrintingSupported() {
        if (VERSION.SDK_INT >= 19) {
            return true;
        }
        return false;
    }

    public static void disableSmartSelectionTextClassifier(TextView textView) {
        if (VERSION.SDK_INT >= 26) {
            textView.setTextClassifier(TextClassifier.NO_OP);
        }
    }

    public static void finishAfterTransition(Activity activity) {
        if (VERSION.SDK_INT >= 21) {
            activity.finishAfterTransition();
        } else {
            activity.finish();
        }
    }

    public static byte[] getBytesUtf8(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException("UTF-8 encoding not available.", e);
        }
    }

    public static ColorFilter getColorFilter(Drawable drawable) {
        if (VERSION.SDK_INT >= 21) {
            return drawable.getColorFilter();
        }
        return null;
    }

    public static String getLocale(InputMethodSubtype inputMethodSubtype) {
        if (VERSION.SDK_INT >= 24) {
            return inputMethodSubtype.getLanguageTag();
        }
        return inputMethodSubtype.getLocale();
    }

    public static Uri getUriForDownloadedFile(File file) {
        if (VERSION.SDK_INT > 23) {
            return FileUtils.getUriForFile(file);
        }
        return Uri.fromFile(file);
    }

    public static boolean isInMultiWindowMode(Activity activity) {
        if (VERSION.SDK_INT < 24) {
            return false;
        }
        return activity.isInMultiWindowMode();
    }

    public static <T> T requireNonNull(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    public static void setWindowIndeterminateProgress(Window window) {
        if (VERSION.SDK_INT < 21) {
            window.setFeatureInt(5, -2);
        }
    }

    public static Bundle createLaunchDisplayIdActivityOptions(int i) {
        if (VERSION.SDK_INT < 26) {
            return null;
        }
        ActivityOptions makeBasic = ActivityOptions.makeBasic();
        makeBasic.setLaunchDisplayId(i);
        return makeBasic.toBundle();
    }

    public static LayerDrawable createLayerDrawable(Drawable[] drawableArr) {
        if (VERSION.SDK_INT <= 19) {
            return new LayerDrawableCompat(drawableArr);
        }
        return new LayerDrawable(drawableArr);
    }

    public static TransitionDrawable createTransitionDrawable(Drawable[] drawableArr) {
        if (VERSION.SDK_INT <= 19) {
            return new TransitionDrawableCompat(drawableArr);
        }
        return new TransitionDrawable(drawableArr);
    }

    public static void finishAndRemoveTask(Activity activity) {
        if (VERSION.SDK_INT > 21) {
            activity.finishAndRemoveTask();
        } else if (VERSION.SDK_INT == 21) {
            new FinishAndRemoveTaskWithRetry(activity).run();
        } else {
            activity.finish();
        }
    }

    public static long getAvailableBlocks(StatFs statFs) {
        if (VERSION.SDK_INT >= 19) {
            return statFs.getAvailableBlocksLong();
        }
        return (long) statFs.getAvailableBlocks();
    }

    public static long getBlockCount(StatFs statFs) {
        if (VERSION.SDK_INT >= 19) {
            return statFs.getBlockCountLong();
        }
        return (long) statFs.getBlockCount();
    }

    public static long getBlockSize(StatFs statFs) {
        if (VERSION.SDK_INT >= 19) {
            return statFs.getBlockSizeLong();
        }
        return (long) statFs.getBlockSize();
    }

    public static Rect[] getLayersBounds(LayerDrawable layerDrawable) {
        Rect[] rectArr = new Rect[layerDrawable.getNumberOfLayers()];
        for (int i = 0; i < layerDrawable.getNumberOfLayers(); i++) {
            rectArr[i] = layerDrawable.getDrawable(i).getBounds();
        }
        return rectArr;
    }

    public static boolean isDemoUser(Context context) {
        if (VERSION.SDK_INT < 25) {
            return false;
        }
        return ((UserManager) context.getSystemService("user")).isDemoUser();
    }

    public static boolean isInteractive(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (VERSION.SDK_INT >= 20) {
            return powerManager.isInteractive();
        }
        return powerManager.isScreenOn();
    }

    public static boolean shouldSkipFirstUseHints(ContentResolver contentResolver) {
        if (VERSION.SDK_INT < 21 || Secure.getInt(contentResolver, "skip_first_use_hints", 0) == 0) {
            return false;
        }
        return true;
    }

    public static Intent getNotificationSettingsIntent(Context context) {
        Intent intent = new Intent();
        if (VERSION.SDK_INT >= 26) {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        } else {
            intent.setAction("android.settings.ACTION_APP_NOTIFICATION_SETTINGS");
            intent.putExtra("app_package", context.getPackageName());
            intent.putExtra("app_uid", context.getApplicationInfo().uid);
        }
        return intent;
    }

    public static void setPasswordEditTextContentDescription(EditText editText) {
        if (VERSION.SDK_INT < 24 && isPasswordInputType(editText.getInputType()) && !TextUtils.isEmpty(editText.getHint())) {
            editText.setContentDescription(editText.getHint());
        }
    }

    public static void setAccessibilityTraversalBefore(View view, int i) {
        if (VERSION.SDK_INT >= 22) {
            view.setAccessibilityTraversalBefore(i);
        }
    }

    public static boolean setElevation(View view, float f) {
        if (!isElevationSupported()) {
            return false;
        }
        view.setElevation(f);
        return true;
    }

    public static String toHtml(Spanned spanned, int i) {
        if (VERSION.SDK_INT >= 24) {
            return Html.toHtml(spanned, i);
        }
        return Html.toHtml(spanned);
    }

    public static int getColor(Resources resources, int i) throws NotFoundException {
        if (VERSION.SDK_INT >= 23) {
            return resources.getColor(i, null);
        }
        return resources.getColor(i);
    }

    public static Drawable getDrawable(Resources resources, int i) throws NotFoundException {
        ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (VERSION.SDK_INT >= 21) {
                return resources.getDrawable(i, null);
            }
            Drawable drawable = resources.getDrawable(i);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return drawable;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static Drawable getUserBadgedIcon(Context context, int i) {
        Drawable drawable = getDrawable(context.getResources(), i);
        if (VERSION.SDK_INT >= 21) {
            return context.getPackageManager().getUserBadgedIcon(drawable, Process.myUserHandle());
        }
        return drawable;
    }

    public static <T> T requireNonNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static void restoreLayersBounds(LayerDrawable layerDrawable, Rect[] rectArr) {
        for (int i = 0; i < layerDrawable.getNumberOfLayers(); i++) {
            layerDrawable.getDrawable(i).setBounds(rectArr[i]);
        }
    }

    public static boolean setElevation(PopupWindow popupWindow, float f) {
        if (!isElevationSupported()) {
            return false;
        }
        popupWindow.setElevation(f);
        return true;
    }

    public static void setImageTintList(ImageView imageView, ColorStateList colorStateList) {
        if (VERSION.SDK_INT == 21 && colorStateList != null && imageView.getImageTintMode() == null) {
            imageView.setImageTintMode(Mode.SRC_IN);
        }
        C1052j.m4546a(imageView, colorStateList);
    }

    public static void setStatusBarIconColor(View view, boolean z) {
        int i;
        if (VERSION.SDK_INT >= 23) {
            int systemUiVisibility = view.getSystemUiVisibility();
            if (z) {
                i = systemUiVisibility | VideoCacheReadBuffersizeExperiment.DEFAULT;
            } else {
                i = systemUiVisibility & -8193;
            }
            view.setSystemUiVisibility(i);
        }
    }

    public static void setTextAppearance(TextView textView, int i) {
        if (VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    public static void setStatusBarColor(Window window, int i) {
        if (VERSION.SDK_INT >= 21) {
            if (VERSION.SDK_INT < 26 && i == -16777216 && window.getNavigationBarColor() == -16777216) {
                window.clearFlags(Integer.MIN_VALUE);
            } else {
                window.addFlags(Integer.MIN_VALUE);
            }
            window.setStatusBarColor(i);
        }
    }

    public static Drawable getDrawableForDensity(Resources resources, int i, int i2) {
        if (VERSION.SDK_INT >= 21) {
            return resources.getDrawableForDensity(i, i2, null);
        }
        return resources.getDrawableForDensity(i, i2);
    }

    public static int checkPermission(Context context, String str, int i, int i2) {
        try {
            return context.checkPermission(str, i, i2);
        } catch (RuntimeException unused) {
            return -1;
        }
    }

    public static void setTaskDescription(Activity activity, String str, Bitmap bitmap, int i) {
        if (VERSION.SDK_INT >= 21) {
            activity.setTaskDescription(new TaskDescription(str, bitmap, i));
        }
    }

    public static Drawable getUserBadgedDrawableForDensity(Context context, Drawable drawable, Rect rect, int i) {
        if (VERSION.SDK_INT >= 21) {
            return context.getPackageManager().getUserBadgedDrawableForDensity(drawable, Process.myUserHandle(), rect, i);
        }
        return drawable;
    }
}
