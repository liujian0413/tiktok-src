package com.graphic.RNCanvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.Region.Op;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.facebook.common.p686c.C13286a;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class CanvasTextureView extends TextureView {
    private static final CanvasMethodDelegate delegate = new CanvasMethodDelegate(CanvasRenderingContext2D.class);
    private final String TAG = "CanvasTextureView";
    private ArrayList<HashMap> actions = new ArrayList<>();
    private Integer mBackgroundColor;
    public Surface mSurface;
    private final CanvasRenderingContext2D renderingContext2D = new CanvasRenderingContext2D();

    public void onReady() {
        ((RCTEventEmitter) ((ReactContext) getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "onReady", null);
    }

    private void runActions() {
        Iterator it = this.actions.iterator();
        while (it.hasNext()) {
            HashMap hashMap = (HashMap) it.next();
            delegate.invoke(this.renderingContext2D, (String) hashMap.get("method"), (Object[]) hashMap.get("arguments"));
        }
    }

    public void drawOutput() {
        if (this.mSurface != null && this.mSurface.isValid()) {
            try {
                Canvas lockCanvas = this.mSurface.lockCanvas(null);
                drawCanvas(lockCanvas);
                if (this.mSurface != null) {
                    this.mSurface.unlockCanvasAndPost(lockCanvas);
                }
            } catch (IllegalArgumentException | IllegalStateException unused) {
                C13286a.m38863d("CanvasTextureView", "in Surface.unlockCanvasAndPost");
            }
        }
    }

    public void setBackgroundColor(Integer num) {
        this.mBackgroundColor = num;
    }

    public void setActions(ArrayList<HashMap> arrayList) {
        this.actions = new ArrayList<>(arrayList);
    }

    private void setDevicePixelRatio(Context context) {
        this.renderingContext2D.setDevicePixelRatio(context.getResources().getDisplayMetrics().density);
    }

    public CanvasTextureView(Context context) {
        super(context);
        setOpaque(false);
        setDevicePixelRatio(context);
        setSurfaceTextureListener(new SurfaceTextureListener() {
            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            }

            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                surfaceTexture.release();
                CanvasTextureView.this.mSurface = null;
                return true;
            }

            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                CanvasTextureView.this.mSurface = new Surface(surfaceTexture);
                CanvasTextureView.this.drawOutput();
                CanvasTextureView.this.onReady();
            }
        });
    }

    private void drawCanvas(Canvas canvas) {
        canvas.drawColor(0, Mode.CLEAR);
        if (this.mBackgroundColor != null) {
            canvas.drawColor(this.mBackgroundColor.intValue());
        } else {
            canvas.drawColor(Color.rgb(NormalGiftView.ALPHA_255, NormalGiftView.ALPHA_255, NormalGiftView.ALPHA_255));
        }
        canvas.clipRect(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), Op.REPLACE);
        this.renderingContext2D.setCanvas(canvas);
        runActions();
    }
}
