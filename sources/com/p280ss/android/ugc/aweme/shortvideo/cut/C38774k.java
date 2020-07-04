package com.p280ss.android.ugc.aweme.shortvideo.cut;

import android.content.Context;
import android.graphics.Outline;
import android.os.Build.VERSION;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.shortvideo.C39810eq;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.C38783b;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40413c;
import com.p280ss.android.ugc.aweme.tools.RecordingSpeed;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.k */
public final class C38774k {

    /* renamed from: a */
    public static int f100743a = ((int) C9738o.m28708b((Context) C35574k.m114861b(), 60.0f));

    /* renamed from: b */
    public static int f100744b = ((int) C9738o.m28708b((Context) C35574k.m114861b(), 30.0f));

    /* renamed from: c */
    public static int f100745c = ((int) C9738o.m28708b((Context) C35574k.m114861b(), 64.0f));

    /* renamed from: d */
    public static int f100746d = ((int) C9738o.m28708b((Context) C35574k.m114861b(), 12.0f));

    /* renamed from: e */
    public static int f100747e = ((int) C9738o.m28708b((Context) C35574k.m114861b(), 8.0f));

    /* renamed from: f */
    public static int f100748f = ((int) C9738o.m28708b((Context) C35574k.m114861b(), 5.0f));

    /* renamed from: g */
    public static int f100749g = C35574k.m114861b().getResources().getDimensionPixelSize(R.dimen.x8);

    /* renamed from: h */
    public static int f100750h = ((int) C9738o.m28708b((Context) C35574k.m114861b(), 20.0f));

    /* renamed from: b */
    public static float m123819b(float f) {
        return 500.0f / f;
    }

    /* renamed from: a */
    public static void m123815a() {
        C6907h.m21524a("rotate_upload_video", (Map) null);
    }

    /* renamed from: b */
    public static void m123821b() {
        C6907h.m21524a("click_edit_segments_return", (Map) null);
    }

    /* renamed from: c */
    public static void m123823c() {
        C6907h.m21524a("click_edit_segments", (Map) null);
    }

    /* renamed from: d */
    private static boolean m123825d() {
        if (C35574k.m114859a().mo70091f().mo93342a(Property.LongVideoPermitted) || C35574k.m114859a().mo70072F().mo83149a()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static float m123811a(float f) {
        return (((float) C39810eq.m127460a()) * 1.0f) / f;
    }

    /* renamed from: c */
    public static float m123822c(float f) {
        return (((float) C39810eq.m127460a()) * 1.0f) / f;
    }

    /* renamed from: a */
    public static long m123814a(long j) {
        if (C35574k.m114859a().mo70072F().mo83149a()) {
            if (j > 300000) {
                return 300000;
            }
            return j;
        } else if (m123825d()) {
            if (j > C35574k.m114859a().mo70091f().mo93344c(Property.LongVideoThreshold)) {
                j = C35574k.m114859a().mo70091f().mo93344c(Property.LongVideoThreshold);
            }
            return j;
        } else if (j > C40413c.f105051b) {
            return C40413c.f105051b;
        } else {
            return j;
        }
    }

    /* renamed from: d */
    public static RecordingSpeed m123824d(float f) {
        if (f == RecordingSpeed.EPIC.value()) {
            return RecordingSpeed.EPIC;
        }
        if (f == RecordingSpeed.SLOW.value()) {
            return RecordingSpeed.SLOW;
        }
        if (f == RecordingSpeed.NORMAL.value()) {
            return RecordingSpeed.NORMAL;
        }
        if (f == RecordingSpeed.FAST.value()) {
            return RecordingSpeed.FAST;
        }
        if (f == RecordingSpeed.LAPSE.value()) {
            return RecordingSpeed.LAPSE;
        }
        return null;
    }

    /* renamed from: a */
    public static void m123816a(Context context) {
        Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(10);
        }
    }

    /* renamed from: a */
    public static void m123818a(View view) {
        if (VERSION.SDK_INT >= 21) {
            view.setOutlineProvider(new ViewOutlineProvider() {
                public final void getOutline(View view, Outline outline) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) ((int) C9738o.m28708b((Context) C35574k.m114861b(), 2.0f)));
                }
            });
            view.setClipToOutline(true);
        }
    }

    /* renamed from: b */
    public static float m123820b(Context context, int i) {
        return (float) ((C23482j.m77098b(context) - (i * 2)) - (f100746d * 2));
    }

    /* renamed from: a */
    public static void m123817a(Context context, int i) {
        Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate((long) i);
        }
    }

    /* renamed from: a */
    public static float m123813a(C38783b bVar, VideoSegment videoSegment, int i, int i2) {
        return (((((float) videoSegment.mo96909h()) * 1.0f) / (videoSegment.mo96911j() * bVar.f100786e)) + ((float) i2)) - ((float) i);
    }

    /* renamed from: a */
    public static float m123812a(Context context, C38783b bVar, float f, VideoSegment videoSegment, int i) {
        if (videoSegment.mo96910i() - videoSegment.mo96909h() == videoSegment.f100761c) {
            return (float) ((C23482j.m77098b(context) - i) - f100746d);
        }
        return f + ((float) f100746d) + (((float) (videoSegment.mo96910i() - videoSegment.mo96909h())) / (videoSegment.mo96911j() * bVar.f100786e));
    }
}
