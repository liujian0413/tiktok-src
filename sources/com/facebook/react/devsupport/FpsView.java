package com.facebook.react.devsupport;

import android.widget.FrameLayout;
import android.widget.TextView;
import com.C1642a;
import com.facebook.common.p686c.C13286a;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.ChoreographerCompat;
import com.facebook.react.modules.debug.FpsDebugFrameCallback;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Locale;

public class FpsView extends FrameLayout {
    private final FPSMonitorRunnable mFPSMonitorRunnable;
    public final FpsDebugFrameCallback mFrameCallback;
    private final TextView mTextView = ((TextView) findViewById(R.id.aol));

    class FPSMonitorRunnable implements Runnable {
        private boolean mShouldStop;
        private int mTotal4PlusFrameStutters;
        private int mTotalFramesDropped;

        public void stop() {
            this.mShouldStop = true;
        }

        public void start() {
            this.mShouldStop = false;
            FpsView.this.post(this);
        }

        public void run() {
            if (!this.mShouldStop) {
                this.mTotalFramesDropped += FpsView.this.mFrameCallback.getExpectedNumFrames() - FpsView.this.mFrameCallback.getNumFrames();
                this.mTotal4PlusFrameStutters += FpsView.this.mFrameCallback.get4PlusFrameStutters();
                FpsView.this.setCurrentFPS(FpsView.this.mFrameCallback.getFPS(), FpsView.this.mFrameCallback.getJSFPS(), this.mTotalFramesDropped, this.mTotal4PlusFrameStutters);
                FpsView.this.mFrameCallback.reset();
                FpsView.this.postDelayed(this, 500);
            }
        }

        private FPSMonitorRunnable() {
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mFrameCallback.stop();
        this.mFPSMonitorRunnable.stop();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFrameCallback.reset();
        this.mFrameCallback.start();
        this.mFPSMonitorRunnable.start();
    }

    public FpsView(ReactContext reactContext) {
        super(reactContext);
        inflate(reactContext, R.layout.mz, this);
        this.mFrameCallback = new FpsDebugFrameCallback(ChoreographerCompat.getInstance(), reactContext);
        this.mFPSMonitorRunnable = new FPSMonitorRunnable();
        setCurrentFPS(0.0d, 0.0d, 0, 0);
    }

    public void setCurrentFPS(double d, double d2, int i, int i2) {
        String a = C1642a.m8035a(Locale.US, "UI: %.1f fps\n%d dropped so far\n%d stutters (4+) so far\nJS: %.1f fps", new Object[]{Double.valueOf(d), Integer.valueOf(i), Integer.valueOf(i2), Double.valueOf(d2)});
        this.mTextView.setText(a);
        C13286a.m38842a("ReactNative", a);
    }
}
