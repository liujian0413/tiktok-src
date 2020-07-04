package com.brentvatne.react;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Matrix;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.CookieManager;
import android.widget.MediaController;
import android.widget.MediaController.MediaPlayerControl;
import com.android.vending.expansion.zipfile.C1854a;
import com.android.vending.expansion.zipfile.C1855b;
import com.bef.effectsdk.message.MessageCenter;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.yqritc.scalablevideoview.C47241a;
import com.yqritc.scalablevideoview.C47243b;
import com.yqritc.scalablevideoview.ScalableType;
import com.yqritc.scalablevideoview.ScalableVideoView;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public final class ReactVideoView extends ScalableVideoView implements OnBufferingUpdateListener, OnCompletionListener, OnErrorListener, OnInfoListener, OnPreparedListener, MediaPlayerControl, LifecycleEventListener {

    /* renamed from: A */
    private float f7085A = 1.0f;

    /* renamed from: B */
    private boolean f7086B = false;

    /* renamed from: C */
    private boolean f7087C = false;

    /* renamed from: D */
    private int f7088D = 0;

    /* renamed from: E */
    private int f7089E = 0;

    /* renamed from: F */
    private boolean f7090F = false;

    /* renamed from: a */
    public RCTEventEmitter f7091a;

    /* renamed from: b */
    public Handler f7092b = new Handler();

    /* renamed from: c */
    public Runnable f7093c = null;

    /* renamed from: d */
    public MediaController f7094d;

    /* renamed from: e */
    public boolean f7095e = false;

    /* renamed from: f */
    public float f7096f = 250.0f;

    /* renamed from: g */
    public boolean f7097g = false;

    /* renamed from: h */
    public boolean f7098h = false;

    /* renamed from: i */
    public int f7099i = 0;

    /* renamed from: j */
    public int f7100j = 0;

    /* renamed from: k */
    public boolean f7101k = false;

    /* renamed from: n */
    private ThemedReactContext f7102n;

    /* renamed from: o */
    private Handler f7103o = new Handler();

    /* renamed from: p */
    private String f7104p = null;

    /* renamed from: q */
    private String f7105q = "mp4";

    /* renamed from: r */
    private ReadableMap f7106r = null;

    /* renamed from: s */
    private boolean f7107s = false;

    /* renamed from: t */
    private boolean f7108t = false;

    /* renamed from: u */
    private ScalableType f7109u = ScalableType.LEFT_TOP;

    /* renamed from: v */
    private boolean f7110v = false;

    /* renamed from: w */
    private boolean f7111w = false;

    /* renamed from: x */
    private float f7112x = 1.0f;

    /* renamed from: y */
    private float f7113y = 0.0f;

    /* renamed from: z */
    private float f7114z = 1.0f;

    public enum Events {
        EVENT_LOAD_START("onVideoLoadStart"),
        EVENT_LOAD("onVideoLoad"),
        EVENT_ERROR("onVideoError"),
        EVENT_PROGRESS("onVideoProgress"),
        EVENT_SEEK("onVideoSeek"),
        EVENT_END("onVideoEnd"),
        EVENT_STALLED("onPlaybackStalled"),
        EVENT_RESUME("onPlaybackResume"),
        EVENT_READY_FOR_DISPLAY("onReadyForDisplay"),
        EVENT_FULLSCREEN_WILL_PRESENT("onVideoFullscreenPlayerWillPresent"),
        EVENT_FULLSCREEN_DID_PRESENT("onVideoFullscreenPlayerDidPresent"),
        EVENT_FULLSCREEN_WILL_DISMISS("onVideoFullscreenPlayerWillDismiss"),
        EVENT_FULLSCREEN_DID_DISMISS("onVideoFullscreenPlayerDidDismiss");
        
        private final String mName;

        public final String toString() {
            return this.mName;
        }

        private Events(String str) {
            this.mName = str;
        }
    }

    public final boolean canPause() {
        return true;
    }

    public final boolean canSeekBackward() {
        return true;
    }

    public final boolean canSeekForward() {
        return true;
    }

    public final int getAudioSessionId() {
        return 0;
    }

    public final int getBufferPercentage() {
        return 0;
    }

    public final void onHostDestroy() {
    }

    /* renamed from: d */
    private void m9076d() {
        if (this.f7094d == null) {
            this.f7094d = new MediaController(getContext());
        }
    }

    public final void onDetachedFromWindow() {
        this.f7098h = false;
        super.onDetachedFromWindow();
        setKeepScreenOn(false);
    }

    /* renamed from: e */
    private float m9077e() {
        return new BigDecimal((double) (this.f7112x * (1.0f - Math.abs(this.f7113y)))).setScale(1, 4).floatValue();
    }

    /* renamed from: f */
    private void m9078f() {
        setResizeModeModifier(this.f7109u);
        setRepeatModifier(this.f7110v);
        setPausedModifier(this.f7095e);
        setMutedModifier(this.f7111w);
        setProgressUpdateInterval(this.f7096f);
        setRateModifier(this.f7114z);
    }

    public final void onHostPause() {
        if (this.f7098h && !this.f7095e && !this.f7086B) {
            this.f7097g = true;
            this.f121409l.pause();
        }
    }

    public final void onHostResume() {
        this.f7097g = false;
        if (this.f7098h && !this.f7086B && !this.f7095e) {
            new Handler().post(new Runnable() {
                public final void run() {
                    ReactVideoView.this.setPausedModifier(false);
                }
            });
        }
    }

    /* renamed from: c */
    private void m9075c() {
        if (this.f121409l == null) {
            this.f7098h = false;
            this.f121409l = new MediaPlayer();
            this.f121409l.setScreenOnWhilePlaying(true);
            this.f121409l.setOnVideoSizeChangedListener(this);
            this.f121409l.setOnErrorListener(this);
            this.f121409l.setOnPreparedListener(this);
            this.f121409l.setOnBufferingUpdateListener(this);
            this.f121409l.setOnCompletionListener(this);
            this.f121409l.setOnInfoListener(this);
        }
    }

    /* renamed from: a */
    public final void mo7660a() {
        if (this.f7094d != null) {
            this.f7094d.hide();
        }
        if (this.f121409l != null) {
            this.f7098h = false;
            mo118729b();
        }
        if (this.f7087C) {
            setFullscreen(false);
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f7088D > 0) {
            mo7662a(this.f7104p, this.f7105q, this.f7107s, this.f7108t, this.f7106r, this.f7088D, this.f7089E);
        } else {
            mo7661a(this.f7104p, this.f7105q, this.f7107s, this.f7108t, this.f7106r);
        }
        setKeepScreenOn(true);
    }

    public final void setControls(boolean z) {
        this.f7090F = z;
    }

    public final void setPlayInBackground(boolean z) {
        this.f7086B = z;
    }

    public final void setProgressUpdateInterval(float f) {
        this.f7096f = f;
    }

    public final void setStereoPan(float f) {
        this.f7113y = f;
        setMutedModifier(this.f7111w);
    }

    public final void setVolumeModifier(float f) {
        this.f7112x = f;
        setMutedModifier(this.f7111w);
    }

    public final void setRepeatModifier(boolean z) {
        this.f7110v = z;
        if (this.f7098h) {
            setLooping(z);
        }
    }

    public final void setResizeModeModifier(ScalableType scalableType) {
        this.f7109u = scalableType;
        if (this.f7098h) {
            setScalableType(scalableType);
            invalidate();
        }
    }

    /* renamed from: a */
    private static Map<String, String> m9074a(ReadableMap readableMap) {
        HashMap hashMap = new HashMap();
        if (readableMap == null) {
            return hashMap;
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            hashMap.put(nextKey, readableMap.getString(nextKey));
        }
        return hashMap;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        this.f7101k = true;
        this.f7091a.receiveEvent(getId(), Events.EVENT_END.toString(), null);
        if (!this.f7110v) {
            setKeepScreenOn(false);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f7090F) {
            m9076d();
            this.f7094d.show();
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setMutedModifier(boolean z) {
        this.f7111w = z;
        if (this.f7098h) {
            if (this.f7111w) {
                mo118724a(0.0f, 0.0f);
            } else if (this.f7113y < 0.0f) {
                mo118724a(this.f7112x, m9077e());
            } else if (this.f7113y > 0.0f) {
                mo118724a(m9077e(), this.f7112x);
            } else {
                mo118724a(this.f7112x, this.f7112x);
            }
        }
    }

    public final void setPausedModifier(boolean z) {
        this.f7095e = z;
        if (this.f7098h) {
            if (this.f7095e) {
                if (this.f121409l.isPlaying()) {
                    pause();
                }
            } else if (!this.f121409l.isPlaying()) {
                start();
                if (this.f7114z != this.f7085A) {
                    setRateModifier(this.f7114z);
                }
                this.f7092b.post(this.f7093c);
            }
            setKeepScreenOn(!this.f7095e);
        }
    }

    public final void setRateModifier(float f) {
        this.f7114z = f;
        if (this.f7098h && VERSION.SDK_INT >= 23 && !this.f7095e) {
            try {
                this.f121409l.setPlaybackParams(this.f121409l.getPlaybackParams().setSpeed(f));
                this.f7085A = f;
            } catch (Exception unused) {
            }
        }
    }

    public ReactVideoView(ThemedReactContext themedReactContext) {
        super(themedReactContext);
        this.f7102n = themedReactContext;
        this.f7091a = (RCTEventEmitter) themedReactContext.getJSModule(RCTEventEmitter.class);
        themedReactContext.addLifecycleEventListener(this);
        m9075c();
        setSurfaceTextureListener(this);
        this.f7093c = new Runnable() {
            public final void run() {
                if (ReactVideoView.this.f7098h && !ReactVideoView.this.f7101k && !ReactVideoView.this.f7095e && !ReactVideoView.this.f7097g) {
                    WritableMap createMap = Arguments.createMap();
                    double currentPosition = (double) ReactVideoView.this.f121409l.getCurrentPosition();
                    Double.isNaN(currentPosition);
                    createMap.putDouble("currentTime", currentPosition / 1000.0d);
                    double d = (double) ReactVideoView.this.f7100j;
                    Double.isNaN(d);
                    createMap.putDouble("playableDuration", d / 1000.0d);
                    double d2 = (double) ReactVideoView.this.f7099i;
                    Double.isNaN(d2);
                    createMap.putDouble("seekableDuration", d2 / 1000.0d);
                    ReactVideoView.this.f7091a.receiveEvent(ReactVideoView.this.getId(), Events.EVENT_PROGRESS.toString(), createMap);
                    ReactVideoView.this.f7092b.postDelayed(ReactVideoView.this.f7093c, (long) Math.round(ReactVideoView.this.f7096f));
                }
            }
        };
    }

    public final void seekTo(int i) {
        if (this.f7098h) {
            WritableMap createMap = Arguments.createMap();
            double currentPosition = (double) getCurrentPosition();
            Double.isNaN(currentPosition);
            createMap.putDouble("currentTime", currentPosition / 1000.0d);
            double d = (double) i;
            Double.isNaN(d);
            createMap.putDouble("seekTime", d / 1000.0d);
            this.f7091a.receiveEvent(getId(), Events.EVENT_SEEK.toString(), createMap);
            super.seekTo(i);
            if (this.f7101k && this.f7099i != 0 && i < this.f7099i) {
                this.f7101k = false;
            }
        }
    }

    public final void setFullscreen(boolean z) {
        int i;
        if (z != this.f7087C) {
            this.f7087C = z;
            Activity currentActivity = this.f7102n.getCurrentActivity();
            if (currentActivity != null) {
                View decorView = currentActivity.getWindow().getDecorView();
                if (this.f7087C) {
                    if (VERSION.SDK_INT >= 19) {
                        i = MessageCenter.MSG_CLIENT_TO_SDK_RESTART_GAME;
                    } else {
                        i = 6;
                    }
                    this.f7091a.receiveEvent(getId(), Events.EVENT_FULLSCREEN_WILL_PRESENT.toString(), null);
                    decorView.setSystemUiVisibility(i);
                    this.f7091a.receiveEvent(getId(), Events.EVENT_FULLSCREEN_DID_PRESENT.toString(), null);
                    return;
                }
                this.f7091a.receiveEvent(getId(), Events.EVENT_FULLSCREEN_WILL_DISMISS.toString(), null);
                decorView.setSystemUiVisibility(0);
                this.f7091a.receiveEvent(getId(), Events.EVENT_FULLSCREEN_DID_DISMISS.toString(), null);
            }
        }
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        this.f7098h = true;
        this.f7099i = mediaPlayer.getDuration();
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("width", mediaPlayer.getVideoWidth());
        createMap.putInt("height", mediaPlayer.getVideoHeight());
        if (mediaPlayer.getVideoWidth() > mediaPlayer.getVideoHeight()) {
            createMap.putString("orientation", "landscape");
        } else {
            createMap.putString("orientation", "portrait");
        }
        WritableMap createMap2 = Arguments.createMap();
        double d = (double) this.f7099i;
        Double.isNaN(d);
        createMap2.putDouble("duration", d / 1000.0d);
        double currentPosition = (double) mediaPlayer.getCurrentPosition();
        Double.isNaN(currentPosition);
        createMap2.putDouble("currentTime", currentPosition / 1000.0d);
        createMap2.putMap("naturalSize", createMap);
        createMap2.putBoolean("canPlayFastForward", true);
        createMap2.putBoolean("canPlaySlowForward", true);
        createMap2.putBoolean("canPlaySlowReverse", true);
        createMap2.putBoolean("canPlayReverse", true);
        createMap2.putBoolean("canPlayFastForward", true);
        createMap2.putBoolean("canStepBackward", true);
        createMap2.putBoolean("canStepForward", true);
        this.f7091a.receiveEvent(getId(), Events.EVENT_LOAD.toString(), createMap2);
        m9078f();
        if (this.f7090F) {
            m9076d();
            this.f7094d.setMediaPlayer(this);
            this.f7094d.setAnchorView(this);
            this.f7103o.post(new Runnable() {
                public final void run() {
                    ReactVideoView.this.f7094d.setEnabled(true);
                    ReactVideoView.this.f7094d.show();
                }
            });
        }
    }

    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        double d = (double) (this.f7099i * i);
        Double.isNaN(d);
        this.f7100j = (int) Math.round(d / 100.0d);
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("what", i);
        createMap.putInt("extra", i2);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putMap("error", createMap);
        this.f7091a.receiveEvent(getId(), Events.EVENT_ERROR.toString(), createMap2);
        return true;
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        if (i != 3) {
            switch (i) {
                case 701:
                    this.f7091a.receiveEvent(getId(), Events.EVENT_STALLED.toString(), Arguments.createMap());
                    break;
                case 702:
                    this.f7091a.receiveEvent(getId(), Events.EVENT_RESUME.toString(), Arguments.createMap());
                    break;
            }
        } else {
            this.f7091a.receiveEvent(getId(), Events.EVENT_READY_FOR_DISPLAY.toString(), Arguments.createMap());
        }
        return false;
    }

    /* renamed from: a */
    public final void mo7661a(String str, String str2, boolean z, boolean z2, ReadableMap readableMap) {
        mo7662a(str, str2, z, z2, readableMap, 0, 0);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z && this.f7098h) {
            int videoWidth = getVideoWidth();
            int videoHeight = getVideoHeight();
            if (videoWidth != 0 && videoHeight != 0) {
                Matrix a = new C47241a(new C47243b(getWidth(), getHeight()), new C47243b(videoWidth, videoHeight)).mo118751a(this.f121410m);
                if (a != null) {
                    setTransform(a);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo7662a(String str, String str2, boolean z, boolean z2, ReadableMap readableMap, int i, int i2) {
        this.f7104p = str;
        this.f7105q = str2;
        this.f7107s = z;
        this.f7108t = z2;
        this.f7106r = readableMap;
        this.f7088D = i;
        this.f7089E = i2;
        this.f7098h = false;
        this.f7099i = 0;
        this.f7100j = 0;
        m9075c();
        this.f121409l.reset();
        if (z) {
            try {
                CookieManager instance = CookieManager.getInstance();
                Uri parse = Uri.parse(str);
                String cookie = instance.getCookie(parse.buildUpon().build().toString());
                HashMap hashMap = new HashMap();
                if (cookie != null) {
                    hashMap.put("Cookie", cookie);
                }
                if (this.f7106r != null) {
                    hashMap.putAll(m9074a(this.f7106r));
                }
                mo118726a((Context) this.f7102n, parse, (Map<String, String>) hashMap);
            } catch (Exception unused) {
                return;
            }
        } else if (!z2) {
            AssetFileDescriptor assetFileDescriptor = null;
            if (this.f7088D > 0) {
                try {
                    C1855b a = C1854a.m8623a(this.f7102n, this.f7088D, this.f7089E);
                    StringBuilder sb = new StringBuilder();
                    sb.append(str.replace(".mp4", ""));
                    sb.append(".mp4");
                    assetFileDescriptor = a.mo7375a(sb.toString());
                } catch (IOException | NullPointerException unused2) {
                }
            }
            if (assetFileDescriptor == null) {
                int identifier = this.f7102n.getResources().getIdentifier(str, "drawable", this.f7102n.getPackageName());
                if (identifier == 0) {
                    identifier = this.f7102n.getResources().getIdentifier(str, "raw", this.f7102n.getPackageName());
                }
                setRawData(identifier);
            } else {
                mo118728a(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
            }
        } else if (str.startsWith("content://")) {
            mo118725a((Context) this.f7102n, Uri.parse(str));
        } else {
            setDataSource(str);
        }
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.merge(this.f7106r);
        createMap.putString("uri", str);
        createMap.putString("type", str2);
        createMap.putMap("requestHeaders", createMap2);
        createMap.putBoolean("isNetwork", z);
        if (this.f7088D > 0) {
            createMap.putInt("mainVer", this.f7088D);
            if (this.f7089E > 0) {
                createMap.putInt("patchVer", this.f7089E);
            }
        }
        WritableMap createMap3 = Arguments.createMap();
        createMap3.putMap("src", createMap);
        this.f7091a.receiveEvent(getId(), Events.EVENT_LOAD_START.toString(), createMap3);
        this.f7101k = false;
        try {
            mo118727a(this);
        } catch (Exception unused3) {
        }
    }
}
