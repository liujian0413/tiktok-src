package com.facebook.react.modules.debug;

import android.os.Build.VERSION;
import android.widget.Toast;
import com.C1642a;
import com.facebook.common.p686c.C13286a;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.ChoreographerCompat;
import com.facebook.react.modules.debug.FpsDebugFrameCallback.FpsInfo;
import com.facebook.react.modules.debug.interfaces.DeveloperSettings;
import com.p280ss.android.ugc.aweme.utils.C43112ex;
import java.util.Locale;

@ReactModule(name = "AnimationsDebugModule")
public class AnimationsDebugModule extends ReactContextBaseJavaModule {
    private final DeveloperSettings mCatalystSettings;
    private FpsDebugFrameCallback mFrameCallback;

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

    public String getName() {
        return "AnimationsDebugModule";
    }

    public void onCatalystInstanceDestroy() {
        if (this.mFrameCallback != null) {
            this.mFrameCallback.stop();
            this.mFrameCallback = null;
        }
    }

    @ReactMethod
    public void startRecordingFps() {
        if (this.mCatalystSettings != null && this.mCatalystSettings.isAnimationFpsDebugEnabled()) {
            if (this.mFrameCallback == null) {
                this.mFrameCallback = new FpsDebugFrameCallback(ChoreographerCompat.getInstance(), getReactApplicationContext());
                this.mFrameCallback.startAndRecordFpsAtEachFrame();
                return;
            }
            throw new JSApplicationCausedNativeException("Already recording FPS!");
        }
    }

    @ReactMethod
    public void stopRecordingFps(double d) {
        if (this.mFrameCallback != null) {
            this.mFrameCallback.stop();
            FpsInfo fpsInfo = this.mFrameCallback.getFpsInfo((long) d);
            if (fpsInfo == null) {
                Toast.makeText(getReactApplicationContext(), "Unable to get FPS info", 1);
            } else {
                String a = C1642a.m8035a(Locale.US, "FPS: %.2f, %d frames (%d expected)", new Object[]{Double.valueOf(fpsInfo.fps), Integer.valueOf(fpsInfo.totalFrames), Integer.valueOf(fpsInfo.totalExpectedFrames)});
                String a2 = C1642a.m8035a(Locale.US, "JS FPS: %.2f, %d frames (%d expected)", new Object[]{Double.valueOf(fpsInfo.jsFps), Integer.valueOf(fpsInfo.totalJsFrames), Integer.valueOf(fpsInfo.totalExpectedFrames)});
                StringBuilder sb = new StringBuilder();
                sb.append(a);
                sb.append("\n");
                sb.append(a2);
                sb.append("\nTotal Time MS: ");
                sb.append(C1642a.m8035a(Locale.US, "%d", new Object[]{Integer.valueOf(fpsInfo.totalTimeMs)}));
                String sb2 = sb.toString();
                C13286a.m38842a("ReactNative", sb2);
                _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast.makeText(getReactApplicationContext(), sb2, 1));
            }
            this.mFrameCallback = null;
        }
    }

    public AnimationsDebugModule(ReactApplicationContext reactApplicationContext, DeveloperSettings developerSettings) {
        super(reactApplicationContext);
        this.mCatalystSettings = developerSettings;
    }
}
