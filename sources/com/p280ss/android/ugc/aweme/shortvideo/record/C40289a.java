package com.p280ss.android.ugc.aweme.shortvideo.record;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.p029v7.app.AppCompatActivity;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;
import org.libsdl.app.AudioRecorderInterface;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.a */
public final class C40289a {

    /* renamed from: a */
    public WeakReference<AppCompatActivity> f104659a;

    /* renamed from: b */
    public volatile long f104660b = -1;

    /* renamed from: c */
    public final C40294b f104661c;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.record.a$a */
    class C40291a implements AudioRecorderInterface {

        /* renamed from: b */
        private Dialog f104663b;

        /* renamed from: a */
        private static JSONObject m128718a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("audio", false);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }

        public final void lackPermission() {
            C42880h.m136156a("lackPermission() called");
            C6893q.m21444a("checkPermission", 1, m128718a());
            m128719b();
        }

        /* renamed from: b */
        private void m128719b() {
            AppCompatActivity appCompatActivity = (AppCompatActivity) C40289a.this.f104659a.get();
            if (this.f104663b == null && appCompatActivity != null) {
                this.f104663b = new C10741a(appCompatActivity).mo25657b((int) R.string.l_).mo25658b((int) R.string.w_, (OnClickListener) new OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        AppCompatActivity appCompatActivity = (AppCompatActivity) C40289a.this.f104659a.get();
                        if (appCompatActivity != null) {
                            appCompatActivity.finish();
                        }
                    }
                }).mo25650a((int) R.string.afp, (OnClickListener) new OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        AppCompatActivity appCompatActivity = (AppCompatActivity) C40289a.this.f104659a.get();
                        if (appCompatActivity != null) {
                            C35563c.f93224F.mo70088c().mo90361d(appCompatActivity);
                            appCompatActivity.finish();
                        }
                    }
                }).mo25656a().mo25637a();
            }
            if (!this.f104663b.isShowing() && appCompatActivity != null) {
                C23487o.m77138a(this.f104663b);
                this.f104663b.show();
            }
        }

        private C40291a() {
        }

        public final int closeWavFile(boolean z) {
            C42880h.m136156a("closeWavFile() called");
            return 0;
        }

        public final void recordStatus(boolean z) {
            if (!z && C40289a.this.f104660b == -1) {
                C40289a.this.f104660b = System.currentTimeMillis();
            }
        }

        public final int addPCMData(byte[] bArr, int i) {
            if (C40289a.this.f104660b == -1) {
                C40289a.this.f104660b = System.currentTimeMillis();
            }
            return 0;
        }

        public final int initWavFile(int i, int i2, double d) {
            C40289a.this.f104660b = -1;
            StringBuilder sb = new StringBuilder("initWavFile() called with: sampleRate = [");
            sb.append(i);
            sb.append("], channels = [");
            sb.append(i2);
            sb.append("], speed = [");
            sb.append(d);
            sb.append("]");
            C42880h.m136156a(sb.toString());
            return 0;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.record.a$b */
    public interface C40294b {
    }

    /* renamed from: a */
    public final AudioRecorderInterface mo100104a() {
        return new C40291a();
    }

    public C40289a(AppCompatActivity appCompatActivity, C40294b bVar) {
        this.f104659a = new WeakReference<>(appCompatActivity);
        this.f104661c = bVar;
    }
}
