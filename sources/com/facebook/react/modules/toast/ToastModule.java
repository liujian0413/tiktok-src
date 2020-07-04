package com.facebook.react.modules.toast;

import android.os.Build.VERSION;
import android.widget.Toast;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.p280ss.android.ugc.aweme.utils.C43112ex;
import java.util.HashMap;
import java.util.Map;

@ReactModule(name = "ToastAndroid")
public class ToastModule extends ReactContextBaseJavaModule {
    public String getName() {
        return "ToastAndroid";
    }

    public Map<String, Object> getConstants() {
        HashMap newHashMap = MapBuilder.newHashMap();
        newHashMap.put("SHORT", Integer.valueOf(0));
        newHashMap.put("LONG", Integer.valueOf(1));
        newHashMap.put("TOP", Integer.valueOf(49));
        newHashMap.put("BOTTOM", Integer.valueOf(81));
        newHashMap.put("CENTER", Integer.valueOf(17));
        return newHashMap;
    }

    public ToastModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void show(final String str, final int i) {
        UiThreadUtil.runOnUiThread(new Runnable() {

            /* renamed from: com.facebook.react.modules.toast.ToastModule$1$_lancet */
            class _lancet {
                private _lancet() {
                }

                static void com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast toast) {
                    if (VERSION.SDK_INT == 25) {
                        C43112ex.m136740a(toast);
                    }
                    toast.show();
                }
            }

            public void run() {
                _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast.makeText(ToastModule.this.getReactApplicationContext(), str, i));
            }
        });
    }

    @ReactMethod
    public void showWithGravity(final String str, final int i, final int i2) {
        UiThreadUtil.runOnUiThread(new Runnable() {

            /* renamed from: com.facebook.react.modules.toast.ToastModule$2$_lancet */
            class _lancet {
                private _lancet() {
                }

                static void com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast toast) {
                    if (VERSION.SDK_INT == 25) {
                        C43112ex.m136740a(toast);
                    }
                    toast.show();
                }
            }

            public void run() {
                Toast makeText = Toast.makeText(ToastModule.this.getReactApplicationContext(), str, i);
                makeText.setGravity(i2, 0, 0);
                _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(makeText);
            }
        });
    }

    @ReactMethod
    public void showWithGravityAndOffset(String str, int i, int i2, int i3, int i4) {
        final String str2 = str;
        final int i5 = i;
        final int i6 = i2;
        final int i7 = i3;
        final int i8 = i4;
        C143833 r0 = new Runnable() {

            /* renamed from: com.facebook.react.modules.toast.ToastModule$3$_lancet */
            class _lancet {
                private _lancet() {
                }

                static void com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast toast) {
                    if (VERSION.SDK_INT == 25) {
                        C43112ex.m136740a(toast);
                    }
                    toast.show();
                }
            }

            public void run() {
                Toast makeText = Toast.makeText(ToastModule.this.getReactApplicationContext(), str2, i5);
                makeText.setGravity(i6, i7, i8);
                _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(makeText);
            }
        };
        UiThreadUtil.runOnUiThread(r0);
    }
}
