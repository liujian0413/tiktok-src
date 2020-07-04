package com.p280ss.android.ugc.aweme.shortvideo.p1571f;

import android.support.p022v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.base.activity.C23254a;
import com.p280ss.android.ugc.aweme.base.activity.C23258e;
import com.p280ss.android.ugc.aweme.scene.C37299a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.gamora.editor.EditViewModel;
import com.p280ss.android.ugc.gamora.editor.EditVolumeViewModel;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.f.k */
public final class C39852k {

    /* renamed from: a */
    public View f103563a;

    /* renamed from: b */
    public TextView f103564b;

    /* renamed from: c */
    public TextView f103565c;

    /* renamed from: d */
    public int f103566d = 50;

    /* renamed from: e */
    public int f103567e = 50;

    /* renamed from: f */
    public boolean f103568f;

    /* renamed from: g */
    public C39856a f103569g;

    /* renamed from: h */
    public C39857b f103570h;

    /* renamed from: i */
    public EditVolumeViewModel f103571i;

    /* renamed from: j */
    private SeekBar f103572j;

    /* renamed from: k */
    private SeekBar f103573k;

    /* renamed from: l */
    private View f103574l;

    /* renamed from: m */
    private FragmentActivity f103575m;

    /* renamed from: n */
    private VideoPublishEditModel f103576n;

    /* renamed from: o */
    private C23258e f103577o;

    /* renamed from: p */
    private C23254a f103578p = new C39858l(this);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.f.k$a */
    public interface C39856a {
        /* renamed from: a */
        void mo99288a(float f, float f2);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.f.k$b */
    public interface C39857b {
        /* renamed from: a */
        void mo99289a();
    }

    /* renamed from: d */
    private void m127561d() {
        if (this.f103568f) {
            this.f103573k.setProgress(this.f103566d);
        }
    }

    /* renamed from: e */
    private void m127562e() {
        if (this.f103568f) {
            this.f103572j.setProgress(this.f103567e);
        }
    }

    /* renamed from: g */
    private void m127564g() {
        this.f103571i = (EditVolumeViewModel) C36113b.m116288a(this.f103575m).mo91871a(EditVolumeViewModel.class);
    }

    /* renamed from: a */
    public final void mo99271a() {
        if (!this.f103568f) {
            m127563f();
            m127564g();
            m127565h();
            this.f103568f = true;
        }
    }

    /* renamed from: f */
    private void m127563f() {
        this.f103572j = (SeekBar) this.f103563a.findViewById(R.id.d1w);
        this.f103573k = (SeekBar) this.f103563a.findViewById(R.id.d1x);
        this.f103564b = (TextView) this.f103563a.findViewById(R.id.dzd);
        this.f103565c = (TextView) this.f103563a.findViewById(R.id.dze);
        this.f103574l = this.f103563a.findViewById(R.id.b77);
    }

    /* renamed from: h */
    private void m127565h() {
        this.f103573k.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            public final void onStartTrackingTouch(SeekBar seekBar) {
            }

            public final void onStopTrackingTouch(SeekBar seekBar) {
                C39852k.this.f103571i.mo106475a(seekBar.getProgress());
            }

            public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                float f = (((float) C39852k.this.f103567e) * 1.0f) / 100.0f;
                float f2 = (((float) i) * 1.0f) / 100.0f;
                if (C39852k.this.f103569g != null) {
                    C39852k.this.f103569g.mo99288a(f, f2);
                }
                C39852k.this.f103566d = i;
            }
        });
        this.f103572j.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            public final void onStartTrackingTouch(SeekBar seekBar) {
            }

            public final void onStopTrackingTouch(SeekBar seekBar) {
            }

            public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                float f = (((float) i) * 1.0f) / 100.0f;
                float f2 = (((float) C39852k.this.f103566d) * 1.0f) / 100.0f;
                if (C39852k.this.f103569g != null) {
                    C39852k.this.f103569g.mo99288a(f, f2);
                }
                C39852k.this.f103567e = i;
            }
        });
        if (this.f103574l != null) {
            this.f103574l.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    C39852k.this.mo99277b();
                }
            });
        }
    }

    /* renamed from: i */
    private void m127566i() {
        this.f103563a.setAlpha(0.0f);
        this.f103563a.setVisibility(0);
        this.f103563a.animate().alpha(1.0f).setDuration(200).start();
    }

    /* renamed from: j */
    private void m127567j() {
        this.f103563a.setAlpha(1.0f);
        this.f103563a.animate().alpha(1.0f).setDuration(200).start();
        this.f103563a.setVisibility(4);
    }

    /* renamed from: b */
    public final void mo99277b() {
        if (this.f103570h != null) {
            this.f103570h.mo99289a();
        }
        try {
            C6893q.m21452b("aweme_short_video_volume_set", (String) null, new JSONObject().put("mVoiceVolume", this.f103567e).put("mMusicVolume", this.f103566d));
        } catch (JSONException unused) {
        }
    }

    /* renamed from: c */
    public final C39852k mo99278c() {
        if (this.f103576n == null && this.f103572j != null && (C37299a.m119788a(this.f103572j.getContext()) instanceof VEVideoPublishEditActivity)) {
            EditViewModel editViewModel = (EditViewModel) C36113b.m116288a((VEVideoPublishEditActivity) C37299a.m119788a(this.f103572j.getContext())).mo91871a(EditViewModel.class);
            if (editViewModel != null) {
                this.f103576n = editViewModel.f113782d;
            }
        }
        if (!(this.f103576n == null || this.f103576n.veAudioRecorderParam == null || this.f103572j == null)) {
            if (!this.f103576n.veAudioRecorderParam.getNeedOriginalSound()) {
                this.f103572j.setEnabled(false);
                this.f103572j.setAlpha(0.5f);
            } else if ((this.f103576n.isFastImport || this.f103576n.getWavFile() != null) && !this.f103576n.isMuted) {
                this.f103572j.setEnabled(true);
                this.f103572j.setAlpha(1.0f);
            } else {
                this.f103572j.setEnabled(false);
                this.f103572j.setAlpha(0.5f);
            }
            if (this.f103576n.mMusicPath != null) {
                this.f103566d = (int) (this.f103576n.musicVolume * 100.0f);
            }
            this.f103572j.setProgress((int) (this.f103576n.voiceVolume * 100.0f));
        }
        return this;
    }

    /* renamed from: a */
    public final C39852k mo99270a(int i) {
        this.f103566d = i;
        m127561d();
        return this;
    }

    /* renamed from: b */
    public final C39852k mo99275b(int i) {
        this.f103567e = i;
        m127562e();
        return this;
    }

    /* renamed from: b */
    public final C39852k mo99276b(boolean z) {
        float f;
        if (this.f103568f) {
            this.f103572j.setEnabled(z);
            SeekBar seekBar = this.f103572j;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            seekBar.setAlpha(f);
        }
        mo99278c();
        return this;
    }

    /* renamed from: c */
    public final C39852k mo99279c(boolean z) {
        float f;
        if (this.f103568f) {
            this.f103573k.setEnabled(z);
            SeekBar seekBar = this.f103573k;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            seekBar.setAlpha(f);
        }
        return this;
    }

    /* renamed from: a */
    public final void mo99273a(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 50;
        }
        this.f103567e = i;
    }

    /* renamed from: d */
    public final void mo99280d(boolean z) {
        if (this.f103568f) {
            if (z) {
                m127566i();
                if (this.f103577o != null) {
                    this.f103577o.mo60525a(this.f103578p);
                }
            } else {
                m127567j();
                if (this.f103577o != null) {
                    this.f103577o.mo60526b(this.f103578p);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo99272a(FragmentActivity fragmentActivity, C23258e eVar) {
        this.f103575m = fragmentActivity;
        this.f103577o = eVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo99274a(int i, KeyEvent keyEvent) {
        if (i != 4 || !this.f103568f || this.f103570h == null) {
            return false;
        }
        this.f103570h.mo99289a();
        return true;
    }
}
