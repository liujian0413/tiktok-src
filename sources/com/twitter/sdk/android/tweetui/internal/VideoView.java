package com.twitter.sdk.android.tweetui.internal;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import com.twitter.sdk.android.tweetui.internal.VideoControlView.C47050a;

public class VideoView extends SurfaceView implements C47050a {

    /* renamed from: A */
    private GestureDetector f120738A;

    /* renamed from: a */
    public String f120739a;

    /* renamed from: b */
    public int f120740b;

    /* renamed from: c */
    public int f120741c;

    /* renamed from: d */
    public SurfaceHolder f120742d;

    /* renamed from: e */
    public MediaPlayer f120743e;

    /* renamed from: f */
    public int f120744f;

    /* renamed from: g */
    public int f120745g;

    /* renamed from: h */
    public int f120746h;

    /* renamed from: i */
    public int f120747i;

    /* renamed from: j */
    public VideoControlView f120748j;

    /* renamed from: k */
    public OnCompletionListener f120749k;

    /* renamed from: l */
    public OnPreparedListener f120750l;

    /* renamed from: m */
    public int f120751m;

    /* renamed from: n */
    public OnErrorListener f120752n;

    /* renamed from: o */
    public OnInfoListener f120753o;

    /* renamed from: p */
    public int f120754p;

    /* renamed from: q */
    OnVideoSizeChangedListener f120755q;

    /* renamed from: r */
    OnPreparedListener f120756r;

    /* renamed from: s */
    Callback f120757s;

    /* renamed from: t */
    private Uri f120758t;

    /* renamed from: u */
    private int f120759u;

    /* renamed from: v */
    private boolean f120760v;

    /* renamed from: w */
    private OnCompletionListener f120761w;

    /* renamed from: x */
    private OnInfoListener f120762x;

    /* renamed from: y */
    private OnErrorListener f120763y;

    /* renamed from: z */
    private OnBufferingUpdateListener f120764z;

    public int getBufferPercentage() {
        if (this.f120743e != null) {
            return this.f120751m;
        }
        return 0;
    }

    public int getCurrentPosition() {
        if (mo118310g()) {
            return this.f120743e.getCurrentPosition();
        }
        return 0;
    }

    public int getDuration() {
        if (mo118310g()) {
            return this.f120743e.getDuration();
        }
        return -1;
    }

    /* renamed from: i */
    private void m147139i() {
        if (this.f120743e != null && this.f120748j != null) {
            this.f120748j.setMediaPlayer(this);
            this.f120748j.setEnabled(mo118310g());
        }
    }

    /* renamed from: a */
    public final void mo118298a() {
        if (mo118310g()) {
            this.f120743e.start();
            this.f120740b = 3;
        }
        this.f120741c = 3;
    }

    /* renamed from: b */
    public final void mo118300b() {
        if (mo118310g() && this.f120743e.isPlaying()) {
            this.f120743e.pause();
            this.f120740b = 4;
        }
        this.f120741c = 4;
    }

    /* renamed from: c */
    public final boolean mo118301c() {
        if (!mo118310g() || !this.f120743e.isPlaying()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final void mo118307d() {
        if (this.f120743e != null) {
            this.f120743e.stop();
            this.f120743e.release();
            this.f120743e = null;
            this.f120740b = 0;
            this.f120741c = 0;
        }
    }

    /* renamed from: f */
    public final void mo118309f() {
        if (this.f120748j.mo118288e()) {
            this.f120748j.mo118286c();
        } else {
            this.f120748j.mo118287d();
        }
    }

    /* renamed from: g */
    public final boolean mo118310g() {
        if (this.f120743e == null || this.f120740b == -1 || this.f120740b == 0 || this.f120740b == 1) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private void m147138h() {
        this.f120744f = 0;
        this.f120745g = 0;
        getHolder().addCallback(this.f120757s);
        getHolder().setType(3);
        setFocusable(true);
        setFocusableInTouchMode(true);
        setClickable(true);
        requestFocus();
        this.f120740b = 0;
        this.f120741c = 0;
    }

    /* renamed from: e */
    public final void mo118308e() {
        if (this.f120758t != null && this.f120742d != null) {
            mo118306a(false);
            try {
                this.f120743e = new MediaPlayer();
                if (this.f120759u != 0) {
                    this.f120743e.setAudioSessionId(this.f120759u);
                } else {
                    this.f120759u = this.f120743e.getAudioSessionId();
                }
                this.f120743e.setOnPreparedListener(this.f120756r);
                this.f120743e.setOnVideoSizeChangedListener(this.f120755q);
                this.f120743e.setOnCompletionListener(this.f120761w);
                this.f120743e.setOnErrorListener(this.f120763y);
                this.f120743e.setOnInfoListener(this.f120762x);
                this.f120743e.setOnBufferingUpdateListener(this.f120764z);
                this.f120751m = 0;
                this.f120743e.setLooping(this.f120760v);
                this.f120743e.setDataSource(getContext(), this.f120758t);
                this.f120743e.setDisplay(this.f120742d);
                this.f120743e.setAudioStreamType(3);
                this.f120743e.setScreenOnWhilePlaying(true);
                this.f120743e.prepareAsync();
                this.f120740b = 1;
                m147139i();
            } catch (Exception unused) {
                this.f120740b = -1;
                this.f120741c = -1;
                this.f120763y.onError(this.f120743e, 1, 0);
            }
        }
    }

    public void setOnCompletionListener(OnCompletionListener onCompletionListener) {
        this.f120749k = onCompletionListener;
    }

    public void setOnErrorListener(OnErrorListener onErrorListener) {
        this.f120752n = onErrorListener;
    }

    public void setOnInfoListener(OnInfoListener onInfoListener) {
        this.f120753o = onInfoListener;
    }

    public void setOnPreparedListener(OnPreparedListener onPreparedListener) {
        this.f120750l = onPreparedListener;
    }

    public void setMediaController(VideoControlView videoControlView) {
        if (this.f120748j != null) {
            this.f120748j.mo118286c();
        }
        this.f120748j = videoControlView;
        m147139i();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f120738A.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo118299a(int i) {
        if (mo118310g()) {
            this.f120743e.seekTo(i);
            this.f120754p = 0;
            return;
        }
        this.f120754p = i;
    }

    public VideoView(Context context) {
        super(context);
        this.f120739a = "VideoView";
        this.f120755q = new OnVideoSizeChangedListener() {
            public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
                VideoView.this.f120744f = mediaPlayer.getVideoWidth();
                VideoView.this.f120745g = mediaPlayer.getVideoHeight();
                if (VideoView.this.f120744f != 0 && VideoView.this.f120745g != 0) {
                    VideoView.this.getHolder().setFixedSize(VideoView.this.f120744f, VideoView.this.f120745g);
                    VideoView.this.requestLayout();
                }
            }
        };
        this.f120756r = new OnPreparedListener() {
            public final void onPrepared(MediaPlayer mediaPlayer) {
                VideoView.this.f120740b = 2;
                if (VideoView.this.f120750l != null) {
                    VideoView.this.f120750l.onPrepared(VideoView.this.f120743e);
                }
                if (VideoView.this.f120748j != null) {
                    VideoView.this.f120748j.setEnabled(true);
                }
                VideoView.this.f120744f = mediaPlayer.getVideoWidth();
                VideoView.this.f120745g = mediaPlayer.getVideoHeight();
                int i = VideoView.this.f120754p;
                if (i != 0) {
                    VideoView.this.mo118299a(i);
                }
                if (VideoView.this.f120744f != 0 && VideoView.this.f120745g != 0) {
                    VideoView.this.getHolder().setFixedSize(VideoView.this.f120744f, VideoView.this.f120745g);
                    if (VideoView.this.f120746h == VideoView.this.f120744f && VideoView.this.f120747i == VideoView.this.f120745g) {
                        if (VideoView.this.f120741c == 3) {
                            VideoView.this.mo118298a();
                            if (VideoView.this.f120748j != null) {
                                VideoView.this.f120748j.mo118287d();
                            }
                        } else if (!VideoView.this.mo118301c() && ((i != 0 || VideoView.this.getCurrentPosition() > 0) && VideoView.this.f120748j != null)) {
                            VideoView.this.f120748j.mo118287d();
                        }
                    }
                } else if (VideoView.this.f120741c == 3) {
                    VideoView.this.mo118298a();
                }
            }
        };
        this.f120761w = new OnCompletionListener() {
            public final void onCompletion(MediaPlayer mediaPlayer) {
                VideoView.this.f120740b = 5;
                VideoView.this.f120741c = 5;
                if (VideoView.this.f120749k != null) {
                    VideoView.this.f120749k.onCompletion(VideoView.this.f120743e);
                }
            }
        };
        this.f120762x = new OnInfoListener() {
            public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
                if (VideoView.this.f120753o != null) {
                    VideoView.this.f120753o.onInfo(mediaPlayer, i, i2);
                }
                return true;
            }
        };
        this.f120763y = new OnErrorListener() {
            public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                VideoView.this.f120740b = -1;
                VideoView.this.f120741c = -1;
                if (VideoView.this.f120748j != null) {
                    VideoView.this.f120748j.mo118286c();
                }
                return (VideoView.this.f120752n == null || VideoView.this.f120752n.onError(VideoView.this.f120743e, i, i2)) ? true : true;
            }
        };
        this.f120764z = new OnBufferingUpdateListener() {
            public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
                VideoView.this.f120751m = i;
            }
        };
        this.f120738A = new GestureDetector(getContext(), new SimpleOnGestureListener() {
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                if (VideoView.this.mo118310g() && VideoView.this.f120748j != null) {
                    VideoView.this.mo118309f();
                }
                return false;
            }
        });
        this.f120757s = new Callback() {
            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                VideoView.this.f120742d = surfaceHolder;
                VideoView.this.mo118308e();
            }

            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                VideoView.this.f120742d = null;
                if (VideoView.this.f120748j != null) {
                    VideoView.this.f120748j.mo118286c();
                }
                VideoView.this.mo118306a(true);
            }

            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                boolean z;
                VideoView.this.f120746h = i2;
                VideoView.this.f120747i = i3;
                boolean z2 = false;
                if (VideoView.this.f120741c == 3) {
                    z = true;
                } else {
                    z = false;
                }
                if (VideoView.this.f120744f == i2 && VideoView.this.f120745g == i3) {
                    z2 = true;
                }
                if (VideoView.this.f120743e != null && z && z2) {
                    if (VideoView.this.f120754p != 0) {
                        VideoView.this.mo118299a(VideoView.this.f120754p);
                    }
                    VideoView.this.mo118298a();
                    if (VideoView.this.f120748j != null) {
                        VideoView.this.f120748j.mo118287d();
                    }
                }
            }
        };
        m147138h();
    }

    /* renamed from: a */
    public final void mo118306a(boolean z) {
        if (this.f120743e != null) {
            this.f120743e.reset();
            this.f120743e.release();
            this.f120743e = null;
            this.f120740b = 0;
            if (z) {
                this.f120741c = 0;
            }
        }
    }

    public VideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo118305a(Uri uri, boolean z) {
        this.f120758t = uri;
        this.f120760v = z;
        this.f120754p = 0;
        mo118308e();
        requestLayout();
        invalidate();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z;
        if (i == 4 || i == 24 || i == 25 || i == 82 || i == 5 || i == 6) {
            z = false;
        } else {
            z = true;
        }
        if (mo118310g() && z && this.f120748j != null) {
            if (i == 79 || i == 85) {
                if (this.f120743e.isPlaying()) {
                    mo118300b();
                    this.f120748j.mo118287d();
                } else {
                    mo118298a();
                    this.f120748j.mo118286c();
                }
                return true;
            } else if (i == 126) {
                if (!this.f120743e.isPlaying()) {
                    mo118298a();
                    this.f120748j.mo118286c();
                }
                return true;
            } else if (i == 86 || i == 127) {
                if (this.f120743e.isPlaying()) {
                    mo118300b();
                    this.f120748j.mo118287d();
                }
                return true;
            } else {
                mo118309f();
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006e, code lost:
        if (r1 > r6) goto L_0x0094;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.f120744f
            int r0 = getDefaultSize(r0, r6)
            int r1 = r5.f120745g
            int r1 = getDefaultSize(r1, r7)
            int r2 = r5.f120744f
            if (r2 <= 0) goto L_0x0092
            int r2 = r5.f120745g
            if (r2 <= 0) goto L_0x0092
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L_0x0051
            if (r1 != r2) goto L_0x0051
            int r0 = r5.f120744f
            int r0 = r0 * r7
            int r1 = r5.f120745g
            int r1 = r1 * r6
            if (r0 >= r1) goto L_0x003e
            int r6 = r5.f120744f
            int r6 = r6 * r7
            int r0 = r5.f120745g
            int r0 = r6 / r0
            r6 = r0
            goto L_0x0094
        L_0x003e:
            int r0 = r5.f120744f
            int r0 = r0 * r7
            int r1 = r5.f120745g
            int r1 = r1 * r6
            if (r0 <= r1) goto L_0x0094
            int r7 = r5.f120745g
            int r7 = r7 * r6
            int r0 = r5.f120744f
            int r1 = r7 / r0
            goto L_0x0093
        L_0x0051:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L_0x0063
            int r0 = r5.f120745g
            int r0 = r0 * r6
            int r2 = r5.f120744f
            int r0 = r0 / r2
            if (r1 != r3) goto L_0x0061
            if (r0 <= r7) goto L_0x0061
            goto L_0x0094
        L_0x0061:
            r7 = r0
            goto L_0x0094
        L_0x0063:
            if (r1 != r2) goto L_0x0073
            int r1 = r5.f120744f
            int r1 = r1 * r7
            int r2 = r5.f120745g
            int r1 = r1 / r2
            if (r0 != r3) goto L_0x0071
            if (r1 <= r6) goto L_0x0071
            goto L_0x0094
        L_0x0071:
            r6 = r1
            goto L_0x0094
        L_0x0073:
            int r2 = r5.f120744f
            int r4 = r5.f120745g
            if (r1 != r3) goto L_0x0083
            if (r4 <= r7) goto L_0x0083
            int r1 = r5.f120744f
            int r1 = r1 * r7
            int r2 = r5.f120745g
            int r1 = r1 / r2
            goto L_0x0085
        L_0x0083:
            r1 = r2
            r7 = r4
        L_0x0085:
            if (r0 != r3) goto L_0x0071
            if (r1 <= r6) goto L_0x0071
            int r7 = r5.f120745g
            int r7 = r7 * r6
            int r0 = r5.f120744f
            int r1 = r7 / r0
            goto L_0x0093
        L_0x0092:
            r6 = r0
        L_0x0093:
            r7 = r1
        L_0x0094:
            r5.setMeasuredDimension(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.twitter.sdk.android.tweetui.internal.VideoView.onMeasure(int, int):void");
    }

    public VideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f120739a = "VideoView";
        this.f120755q = new OnVideoSizeChangedListener() {
            public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
                VideoView.this.f120744f = mediaPlayer.getVideoWidth();
                VideoView.this.f120745g = mediaPlayer.getVideoHeight();
                if (VideoView.this.f120744f != 0 && VideoView.this.f120745g != 0) {
                    VideoView.this.getHolder().setFixedSize(VideoView.this.f120744f, VideoView.this.f120745g);
                    VideoView.this.requestLayout();
                }
            }
        };
        this.f120756r = new OnPreparedListener() {
            public final void onPrepared(MediaPlayer mediaPlayer) {
                VideoView.this.f120740b = 2;
                if (VideoView.this.f120750l != null) {
                    VideoView.this.f120750l.onPrepared(VideoView.this.f120743e);
                }
                if (VideoView.this.f120748j != null) {
                    VideoView.this.f120748j.setEnabled(true);
                }
                VideoView.this.f120744f = mediaPlayer.getVideoWidth();
                VideoView.this.f120745g = mediaPlayer.getVideoHeight();
                int i = VideoView.this.f120754p;
                if (i != 0) {
                    VideoView.this.mo118299a(i);
                }
                if (VideoView.this.f120744f != 0 && VideoView.this.f120745g != 0) {
                    VideoView.this.getHolder().setFixedSize(VideoView.this.f120744f, VideoView.this.f120745g);
                    if (VideoView.this.f120746h == VideoView.this.f120744f && VideoView.this.f120747i == VideoView.this.f120745g) {
                        if (VideoView.this.f120741c == 3) {
                            VideoView.this.mo118298a();
                            if (VideoView.this.f120748j != null) {
                                VideoView.this.f120748j.mo118287d();
                            }
                        } else if (!VideoView.this.mo118301c() && ((i != 0 || VideoView.this.getCurrentPosition() > 0) && VideoView.this.f120748j != null)) {
                            VideoView.this.f120748j.mo118287d();
                        }
                    }
                } else if (VideoView.this.f120741c == 3) {
                    VideoView.this.mo118298a();
                }
            }
        };
        this.f120761w = new OnCompletionListener() {
            public final void onCompletion(MediaPlayer mediaPlayer) {
                VideoView.this.f120740b = 5;
                VideoView.this.f120741c = 5;
                if (VideoView.this.f120749k != null) {
                    VideoView.this.f120749k.onCompletion(VideoView.this.f120743e);
                }
            }
        };
        this.f120762x = new OnInfoListener() {
            public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
                if (VideoView.this.f120753o != null) {
                    VideoView.this.f120753o.onInfo(mediaPlayer, i, i2);
                }
                return true;
            }
        };
        this.f120763y = new OnErrorListener() {
            public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                VideoView.this.f120740b = -1;
                VideoView.this.f120741c = -1;
                if (VideoView.this.f120748j != null) {
                    VideoView.this.f120748j.mo118286c();
                }
                return (VideoView.this.f120752n == null || VideoView.this.f120752n.onError(VideoView.this.f120743e, i, i2)) ? true : true;
            }
        };
        this.f120764z = new OnBufferingUpdateListener() {
            public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
                VideoView.this.f120751m = i;
            }
        };
        this.f120738A = new GestureDetector(getContext(), new SimpleOnGestureListener() {
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                if (VideoView.this.mo118310g() && VideoView.this.f120748j != null) {
                    VideoView.this.mo118309f();
                }
                return false;
            }
        });
        this.f120757s = new Callback() {
            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                VideoView.this.f120742d = surfaceHolder;
                VideoView.this.mo118308e();
            }

            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                VideoView.this.f120742d = null;
                if (VideoView.this.f120748j != null) {
                    VideoView.this.f120748j.mo118286c();
                }
                VideoView.this.mo118306a(true);
            }

            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                boolean z;
                VideoView.this.f120746h = i2;
                VideoView.this.f120747i = i3;
                boolean z2 = false;
                if (VideoView.this.f120741c == 3) {
                    z = true;
                } else {
                    z = false;
                }
                if (VideoView.this.f120744f == i2 && VideoView.this.f120745g == i3) {
                    z2 = true;
                }
                if (VideoView.this.f120743e != null && z && z2) {
                    if (VideoView.this.f120754p != 0) {
                        VideoView.this.mo118299a(VideoView.this.f120754p);
                    }
                    VideoView.this.mo118298a();
                    if (VideoView.this.f120748j != null) {
                        VideoView.this.f120748j.mo118287d();
                    }
                }
            }
        };
        m147138h();
    }
}
