package com.facebook.react.bridge;

import android.content.Context;
import com.facebook.react.bridge.RNJavaScriptRuntime.SplitCommonType;
import com.facebook.react.common.DebugServerException;

public abstract class JSBundleLoader {
    public boolean mDebugRemote;
    public SplitCommonType mUseCommonSplit;

    public abstract String loadScript(CatalystInstanceImpl catalystInstanceImpl);

    public JSBundleLoader() {
        this.mUseCommonSplit = SplitCommonType.NONE;
        this.mUseCommonSplit = SplitCommonType.NONE;
    }

    public static JSBundleLoader createFileLoader(String str) {
        return createFileLoader(str, str, false, SplitCommonType.NONE);
    }

    public JSBundleLoader(SplitCommonType splitCommonType) {
        this.mUseCommonSplit = SplitCommonType.NONE;
        this.mUseCommonSplit = splitCommonType;
    }

    public static JSBundleLoader createFileLoader(String str, SplitCommonType splitCommonType) {
        return createFileLoader(str, str, false, splitCommonType);
    }

    public JSBundleLoader(SplitCommonType splitCommonType, boolean z) {
        this.mUseCommonSplit = SplitCommonType.NONE;
        this.mUseCommonSplit = splitCommonType;
        this.mDebugRemote = z;
    }

    public static JSBundleLoader createAssetLoader(final Context context, final String str, final boolean z) {
        return new JSBundleLoader(SplitCommonType.NONE) {
            public final String loadScript(CatalystInstanceImpl catalystInstanceImpl) {
                catalystInstanceImpl.loadScriptFromAssets(context.getAssets(), str, z);
                return str;
            }
        };
    }

    public static JSBundleLoader createCachedBundleFromNetworkLoader(final String str, final String str2, SplitCommonType splitCommonType) {
        return new JSBundleLoader(splitCommonType) {
            public final String loadScript(CatalystInstanceImpl catalystInstanceImpl) {
                try {
                    catalystInstanceImpl.loadScriptFromFile(str2, str, false, true);
                    return str;
                } catch (Exception e) {
                    throw DebugServerException.makeGeneric(e.getMessage(), e);
                }
            }
        };
    }

    public static JSBundleLoader createRemoteDebuggerBundleLoader(final String str, final String str2, SplitCommonType splitCommonType) {
        return new JSBundleLoader(splitCommonType, true) {
            public final String loadScript(CatalystInstanceImpl catalystInstanceImpl) {
                catalystInstanceImpl.setSourceURLs(str2, str);
                return str2;
            }
        };
    }

    public static JSBundleLoader createAssetLoader(final Context context, final String str, final boolean z, SplitCommonType splitCommonType) {
        return new JSBundleLoader(splitCommonType) {
            public final String loadScript(CatalystInstanceImpl catalystInstanceImpl) {
                catalystInstanceImpl.loadScriptFromAssets(context.getAssets(), str, z);
                return str;
            }
        };
    }

    public static JSBundleLoader createFileLoader(final String str, final String str2, final boolean z, SplitCommonType splitCommonType) {
        return new JSBundleLoader(splitCommonType) {
            public final String loadScript(CatalystInstanceImpl catalystInstanceImpl) {
                catalystInstanceImpl.loadScriptFromFile(str, str2, z);
                return str;
            }
        };
    }
}
