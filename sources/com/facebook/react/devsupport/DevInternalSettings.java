package com.facebook.react.devsupport;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.preference.PreferenceManager;
import com.facebook.react.modules.debug.interfaces.DeveloperSettings;
import com.facebook.react.packagerconnection.PackagerConnectionSettings;

public class DevInternalSettings implements OnSharedPreferenceChangeListener, DeveloperSettings {
    private final Listener mListener;
    private final PackagerConnectionSettings mPackagerConnectionSettings;
    private final SharedPreferences mPreferences;

    public interface Listener {
        void onInternalSettingsChanged();
    }

    public PackagerConnectionSettings getPackagerConnectionSettings() {
        return this.mPackagerConnectionSettings;
    }

    public boolean isNuclideJSDebugEnabled() {
        return false;
    }

    public boolean isAnimationFpsDebugEnabled() {
        return this.mPreferences.getBoolean("animations_debug", false);
    }

    public boolean isBundleDeltasEnabled() {
        return this.mPreferences.getBoolean("js_bundle_deltas", true);
    }

    public boolean isElementInspectorEnabled() {
        return this.mPreferences.getBoolean("inspector_debug", false);
    }

    public boolean isFpsDebugEnabled() {
        return this.mPreferences.getBoolean("fps_debug", false);
    }

    public boolean isHotModuleReplacementEnabled() {
        return this.mPreferences.getBoolean("hot_module_replacement", false);
    }

    public boolean isJSDevModeEnabled() {
        return this.mPreferences.getBoolean("js_dev_mode_debug", true);
    }

    public boolean isJSMinifyEnabled() {
        return this.mPreferences.getBoolean("js_minify_debug", false);
    }

    public boolean isReloadOnJSChangeEnabled() {
        return this.mPreferences.getBoolean("reload_on_js_change", false);
    }

    public boolean isRemoteJSDebugEnabled() {
        return this.mPreferences.getBoolean("remote_js_debug", false);
    }

    public void setBundleDeltasEnabled(boolean z) {
        this.mPreferences.edit().putBoolean("js_bundle_deltas", z).apply();
    }

    public void setElementInspectorEnabled(boolean z) {
        this.mPreferences.edit().putBoolean("inspector_debug", z).apply();
    }

    public void setFpsDebugEnabled(boolean z) {
        this.mPreferences.edit().putBoolean("fps_debug", z).apply();
    }

    public void setHotModuleReplacementEnabled(boolean z) {
        this.mPreferences.edit().putBoolean("hot_module_replacement", z).apply();
    }

    public void setReloadOnJSChangeEnabled(boolean z) {
        this.mPreferences.edit().putBoolean("reload_on_js_change", z).apply();
    }

    public void setRemoteJSDebugEnabled(boolean z) {
        this.mPreferences.edit().putBoolean("remote_js_debug", z).apply();
    }

    public DevInternalSettings(Context context, Listener listener) {
        this.mListener = listener;
        this.mPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        this.mPreferences.registerOnSharedPreferenceChangeListener(this);
        this.mPackagerConnectionSettings = new PackagerConnectionSettings(context);
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (this.mListener == null) {
            return;
        }
        if ("fps_debug".equals(str) || "reload_on_js_change".equals(str) || "js_dev_mode_debug".equals(str) || "js_bundle_deltas".equals(str) || "js_minify_debug".equals(str)) {
            this.mListener.onInternalSettingsChanged();
        }
    }
}
