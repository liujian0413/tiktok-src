package com.p280ss.android.ugc.aweme.shortvideo.p1548ar.text;

import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import com.p280ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view.C42078c;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view.C42078c.C42080a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ar.text.n */
public class C38490n {

    /* renamed from: a */
    public EffectTextInputView f100081a;

    /* renamed from: b */
    protected C42078c f100082b;

    /* renamed from: c */
    protected ASCameraView f100083c;

    /* renamed from: d */
    public C38489m f100084d;

    /* renamed from: e */
    protected C38492b f100085e;

    /* renamed from: f */
    protected FragmentActivity f100086f;

    /* renamed from: g */
    protected boolean f100087g;

    /* renamed from: h */
    public int f100088h;

    /* renamed from: i */
    protected int f100089i;

    /* renamed from: j */
    protected String f100090j;

    /* renamed from: k */
    public boolean f100091k;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ar.text.n$a */
    class C38491a implements C42080a {
        /* renamed from: c */
        public final void mo96461c(int i) {
        }

        C38491a() {
        }

        /* renamed from: a */
        public final void mo96459a(int i) {
            if (C38490n.this.f100087g) {
                if (C38490n.this.f100081a != null) {
                    C38490n.this.f100081a.mo96429d();
                    C38490n.this.f100081a.mo96405a(i);
                }
                if (C38490n.this.f100085e != null) {
                    C38490n.this.f100085e.mo96462a(true);
                }
            }
        }

        /* renamed from: b */
        public final void mo96460b(int i) {
            if (C38490n.this.f100087g) {
                C38490n.this.f100087g = false;
                if (C38490n.this.f100081a != null) {
                    C38490n.this.mo96452a(C38490n.this.f100081a.getText());
                    C38490n.this.f100081a.dismiss();
                    C38490n.this.f100081a.setText("");
                }
                if (C38490n.this.f100083c != null) {
                    C38490n.this.f100083c.mo56250e(true);
                }
                if (C38490n.this.f100085e != null) {
                    C38490n.this.f100085e.mo96462a(false);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ar.text.n$b */
    public interface C38492b {
        /* renamed from: a */
        void mo96462a(boolean z);
    }

    /* renamed from: a */
    public int mo96436a(int i, String str) {
        return 0;
    }

    /* renamed from: a */
    public void mo96441a() {
    }

    /* renamed from: b */
    public final void mo96454b() {
        this.f100087g = true;
        if (this.f100081a != null) {
            this.f100081a.mo96428c();
        }
    }

    /* renamed from: c */
    public final void mo96456c() {
        if (this.f100081a != null) {
            this.f100081a.mo96426b();
        }
    }

    /* renamed from: d */
    public final void mo96457d() {
        if (this.f100082b != null) {
            this.f100082b.mo103393a();
        }
        mo96452a("");
    }

    /* renamed from: e */
    public final void mo96458e() {
        if (this.f100082b != null) {
            this.f100082b.mo103394a(new C38491a());
        }
    }

    /* renamed from: a */
    public final C38490n mo96450a(int i) {
        this.f100088h = i;
        return this;
    }

    /* renamed from: a */
    public C38490n mo96437a(EffectTextInputView effectTextInputView) {
        this.f100081a = effectTextInputView;
        this.f100081a.setVisibility(8);
        return this;
    }

    /* renamed from: a */
    public final C38490n mo96451a(C38492b bVar) {
        this.f100085e = bVar;
        return this;
    }

    /* renamed from: a */
    public final void mo96452a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        if (this.f100083c != null && this.f100084d != null) {
            this.f100090j = str;
            this.f100083c.mo56225a(str, this.f100084d.f100078b, this.f100084d.f100079c, this.f100084d.f100080d);
        }
    }

    public C38490n(FragmentActivity fragmentActivity, ASCameraView aSCameraView) {
        if (fragmentActivity != null) {
            this.f100086f = fragmentActivity;
            this.f100083c = aSCameraView;
            this.f100082b = new C42078c(fragmentActivity);
        }
    }

    /* renamed from: b */
    public final void mo96455b(int i, String str) {
        int a = mo96436a(i, str);
        if (this.f100081a != null) {
            this.f100081a.setMaxTextCount(a);
        }
    }

    /* renamed from: a */
    public final void mo96453a(String str, int i) {
        if (!TextUtils.isEmpty(str) && this.f100081a != null) {
            if (i == 0) {
                this.f100081a.setText(str);
                return;
            }
            this.f100081a.setHintText(str);
        }
    }
}
