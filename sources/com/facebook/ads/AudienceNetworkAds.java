package com.facebook.ads;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.util.common.Preconditions;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

public final class AudienceNetworkAds {
    private static final String ADNW_PROCESS_NAME = ":adnw";
    public static final String TAG = "FBAudienceNetwork";

    @Retention(RetentionPolicy.SOURCE)
    public @interface AdFormat {
        public static final int BANNER = 1;
        public static final int INSTREAM_VIDEO_MOBILE = 3;
        public static final int INTERSTITIAL = 2;
        public static final int NATIVE = 4;
        public static final int NATIVE_BANNER = 5;
        public static final int REWARDED_VIDEO = 6;
        public static final int UNKNOWN = 0;
    }

    public interface InitListener {
        void onInitialized(InitResult initResult);
    }

    public interface InitResult {
        String getMessage();

        boolean isSuccess();
    }

    public interface InitSettingsBuilder {
        void initialize();

        InitSettingsBuilder withInitListener(InitListener initListener);

        InitSettingsBuilder withMediationService(String str);

        InitSettingsBuilder withPlacementIds(List<String> list);
    }

    private AudienceNetworkAds() {
    }

    public static InitSettingsBuilder buildInitSettings(Context context) {
        return new com.facebook.ads.internal.api.InitSettingsBuilder(context);
    }

    public static String getAdsProcessName(Context context) {
        ProcessUtils.sCurrentProcessCheckCalled = true;
        return ADNW_PROCESS_NAME;
    }

    public static void initialize(Context context) {
        Preconditions.checkNotNull(context, "Context can not be null.");
        DynamicLoaderFactory.initialize(context, null, null);
    }

    public static boolean isInAdsProcess(Context context) {
        ProcessUtils.sCurrentProcessCheckCalled = true;
        String processName = ProcessUtils.getProcessName(context);
        if (TextUtils.isEmpty(processName) || !processName.endsWith(ADNW_PROCESS_NAME)) {
            return false;
        }
        return true;
    }

    public static boolean isInitialized(Context context) {
        if (DynamicLoaderFactory.getDynamicLoader() == null) {
            return false;
        }
        return DynamicLoaderFactory.makeLoader(context).createAudienceNetworkAdsApi().isInitialized();
    }

    public static int getAdFormatForPlacement(Context context, String str) {
        return DynamicLoaderFactory.makeLoader(context).createAudienceNetworkAdsApi().getAdFormatForPlacement(str);
    }
}
