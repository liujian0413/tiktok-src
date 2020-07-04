package com.p280ss.android.ugc.aweme.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build.VERSION;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.audio.AudioUtils */
public final class AudioUtils {

    /* renamed from: a */
    public static int f60964a = -1;

    /* renamed from: b */
    private static final boolean f60965b = C7163a.m22363a();

    /* renamed from: c */
    private static AudioManager f60966c;

    /* renamed from: d */
    private static int f60967d = -1;

    /* renamed from: e */
    private static boolean f60968e = false;

    /* renamed from: f */
    private static OnVolumeChangeListener f60969f = null;

    /* renamed from: com.ss.android.ugc.aweme.audio.AudioUtils$OnVolumeChangeListener */
    public static class OnVolumeChangeListener extends BroadcastReceiver {

        /* renamed from: a */
        private WeakReference<AudioManager> f60970a;

        public OnVolumeChangeListener(AudioManager audioManager) {
            this.f60970a = new WeakReference<>(audioManager);
        }

        public void onReceive(Context context, Intent intent) {
            try {
                if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3 && this.f60970a.get() != null) {
                    int streamVolume = ((AudioManager) this.f60970a.get()).getStreamVolume(3);
                    if (streamVolume >= 0) {
                        AudioUtils.f60964a = streamVolume;
                    }
                }
            } catch (Exception unused) {
                AudioUtils.f60964a = -1;
            }
        }
    }

    /* renamed from: a */
    public static double m75891a() {
        double d = 0.0d;
        if (m75907i(C6399b.m19921a())) {
            return 0.0d;
        }
        try {
            if (f60967d < 0) {
                f60967d = m75892a(C6399b.m19921a());
            }
            if (f60964a < 0 || !f60968e) {
                f60964a = m75893a(C6399b.m19921a(), 3);
            }
            double d2 = (double) f60964a;
            Double.isNaN(d2);
            double d3 = d2 * 1.0d;
            double d4 = (double) f60967d;
            Double.isNaN(d4);
            d = d3 / d4;
        } catch (Exception unused) {
        }
        return d;
    }

    /* renamed from: b */
    public static int m75898b(Context context) {
        return m75893a(context, 3);
    }

    /* renamed from: f */
    public static boolean m75904f(Context context) {
        return m75899b(context, 3);
    }

    /* renamed from: d */
    public static int m75902d(Context context) {
        if (m75907i(context)) {
            return -1;
        }
        return f60966c.getRingerMode();
    }

    /* renamed from: a */
    public static int m75892a(Context context) {
        if (m75907i(context)) {
            return -1;
        }
        if (f60967d < 0) {
            f60967d = f60966c.getStreamMaxVolume(3);
        }
        return f60967d;
    }

    /* renamed from: c */
    public static boolean m75901c(Context context) {
        if (!m75907i(context) && f60966c.getRingerMode() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static void m75906h(Context context) {
        if (f60968e) {
            try {
                context.unregisterReceiver(f60969f);
                f60969f = null;
                f60968e = false;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: i */
    private static boolean m75907i(Context context) {
        if (f60966c == null) {
            try {
                f60966c = (AudioManager) context.getApplicationContext().getSystemService("audio");
            } catch (Exception unused) {
            }
        }
        if (f60966c == null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static void m75905g(Context context) {
        if (!f60968e) {
            try {
                if (!m75907i(context)) {
                    f60969f = new OnVolumeChangeListener(f60966c);
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                    context.registerReceiver(f60969f, intentFilter);
                    f60968e = true;
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: e */
    public static boolean m75903e(Context context) {
        if (m75907i(context)) {
            return false;
        }
        if (VERSION.SDK_INT >= 23) {
            AudioDeviceInfo[] devices = f60966c.getDevices(2);
            if (devices == null) {
                return false;
            }
            for (AudioDeviceInfo type : devices) {
                int type2 = type.getType();
                if (type2 == 3 || type2 == 4 || type2 == 7 || type2 == 8) {
                    return true;
                }
            }
            return false;
        } else if (f60966c.isWiredHeadsetOn() || f60966c.isBluetoothScoOn() || f60966c.isBluetoothA2dpOn()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private static int m75893a(Context context, int i) {
        if (m75907i(context)) {
            return -1;
        }
        try {
            return f60966c.getStreamVolume(i);
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: b */
    private static boolean m75899b(Context context, int i) {
        if (m75893a(context, 3) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m75894a(Context context, float f) {
        float a = (float) m75892a(context);
        int b = m75898b(context);
        if (a != -1.0f && b != -1 && ((float) b) / a > 0.2f) {
            m75895a(context, 0.2f, 16);
        }
    }

    /* renamed from: a */
    public static void m75896a(Context context, boolean z) {
        int i;
        if (!m75907i(context)) {
            try {
                if (VERSION.SDK_INT > 23) {
                    AudioManager audioManager = f60966c;
                    if (z) {
                        i = -100;
                    } else {
                        i = 100;
                    }
                    audioManager.adjustStreamVolume(3, i, 0);
                    return;
                }
                f60966c.setStreamMute(3, z);
            } catch (Exception e) {
                C6921a.m21559a((Throwable) e);
            }
        }
    }

    /* renamed from: b */
    public static boolean m75900b(Context context, int i, int i2) {
        m75892a(context);
        m75898b(context);
        return m75897a(context, m75898b(context) + i, 8);
    }

    /* renamed from: a */
    private static void m75895a(Context context, float f, int i) {
        m75897a(context, (int) (f * ((float) m75892a(context))), 16);
    }

    /* renamed from: a */
    public static boolean m75897a(Context context, int i, int i2) {
        if (m75907i(context)) {
            return false;
        }
        try {
            f60966c.setStreamVolume(3, i, i2);
            return true;
        } catch (Exception e) {
            C6921a.m21559a((Throwable) e);
            return false;
        }
    }
}
