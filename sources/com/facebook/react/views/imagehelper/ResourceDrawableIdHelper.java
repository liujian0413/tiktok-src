package com.facebook.react.views.imagehelper;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.Uri.Builder;
import java.util.HashMap;
import java.util.Map;

public class ResourceDrawableIdHelper {
    private static volatile ResourceDrawableIdHelper sResourceDrawableIdHelper;
    private Map<String, Integer> mResourceDrawableIdMap = new HashMap();

    private ResourceDrawableIdHelper() {
    }

    public synchronized void clear() {
        this.mResourceDrawableIdMap.clear();
    }

    public static ResourceDrawableIdHelper getInstance() {
        if (sResourceDrawableIdHelper == null) {
            synchronized (ResourceDrawableIdHelper.class) {
                if (sResourceDrawableIdHelper == null) {
                    sResourceDrawableIdHelper = new ResourceDrawableIdHelper();
                }
            }
        }
        return sResourceDrawableIdHelper;
    }

    public Drawable getResourceDrawable(Context context, String str) {
        int resourceDrawableId = getResourceDrawableId(context, str);
        if (resourceDrawableId > 0) {
            return context.getResources().getDrawable(resourceDrawableId);
        }
        return null;
    }

    public Uri getResourceDrawableUri(Context context, String str) {
        int resourceDrawableId = getResourceDrawableId(context, str);
        if (resourceDrawableId > 0) {
            return new Builder().scheme("res").path(String.valueOf(resourceDrawableId)).build();
        }
        return Uri.EMPTY;
    }

    public int getResourceDrawableId(Context context, String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String replace = str.toLowerCase().replace("-", "_");
        try {
            return Integer.parseInt(replace);
        } catch (NumberFormatException unused) {
            synchronized (this) {
                if (this.mResourceDrawableIdMap.containsKey(replace)) {
                    return ((Integer) this.mResourceDrawableIdMap.get(replace)).intValue();
                }
                int identifier = context.getResources().getIdentifier(replace, "drawable", context.getPackageName());
                this.mResourceDrawableIdMap.put(replace, Integer.valueOf(identifier));
                return identifier;
            }
        }
    }
}
