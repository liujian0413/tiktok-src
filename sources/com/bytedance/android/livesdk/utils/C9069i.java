package com.bytedance.android.livesdk.utils;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import com.bytedance.android.live.core.utils.C3358ac;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.android.livesdk.utils.i */
public final class C9069i {

    /* renamed from: a */
    public static final Set<OnAudioFocusChangeListener> f24727a = new HashSet();

    /* renamed from: b */
    private static ComponentName f24728b = new ComponentName(m27078c().getPackageName(), C9071a.class.getName());

    /* renamed from: c */
    private static AudioManager f24729c = ((AudioManager) m27078c().getSystemService("audio"));

    /* renamed from: d */
    private static OnAudioFocusChangeListener f24730d = new OnAudioFocusChangeListener() {
        public final void onAudioFocusChange(int i) {
            for (OnAudioFocusChangeListener onAudioFocusChange : new HashSet(C9069i.f24727a)) {
                onAudioFocusChange.onAudioFocusChange(i);
            }
        }
    };

    /* renamed from: com.bytedance.android.livesdk.utils.i$a */
    static class C9071a extends BroadcastReceiver {
        private C9071a() {
        }

        public void onReceive(Context context, Intent intent) {
        }
    }

    /* renamed from: c */
    private static Context m27078c() {
        return C3358ac.m12528e();
    }

    /* renamed from: b */
    public static void m27076b() {
        try {
            f24729c.unregisterMediaButtonEventReceiver(f24728b);
            f24729c.abandonAudioFocus(f24730d);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static int m27074a() {
        try {
            int requestAudioFocus = f24729c.requestAudioFocus(f24730d, 3, 2);
            if (requestAudioFocus != 1) {
                return requestAudioFocus;
            }
            try {
                f24729c.registerMediaButtonEventReceiver(f24728b);
                return requestAudioFocus;
            } catch (Exception unused) {
                return requestAudioFocus;
            }
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: a */
    public static void m27075a(OnAudioFocusChangeListener onAudioFocusChangeListener) {
        f24727a.add(onAudioFocusChangeListener);
    }

    /* renamed from: b */
    public static void m27077b(OnAudioFocusChangeListener onAudioFocusChangeListener) {
        f24727a.remove(onAudioFocusChangeListener);
    }
}
