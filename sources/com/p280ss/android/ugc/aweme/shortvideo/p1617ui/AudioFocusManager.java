package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.media.AudioManager;
import android.support.p029v7.app.AppCompatActivity;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.AudioFocusManager */
public final class AudioFocusManager implements C0042h {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f107010a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(AudioFocusManager.class), "audioManager", "getAudioManager()Landroid/media/AudioManager;"))};

    /* renamed from: c */
    public static final C41127a f107011c = new C41127a(null);

    /* renamed from: b */
    public final AppCompatActivity f107012b;

    /* renamed from: d */
    private final C7541d f107013d;

    /* renamed from: e */
    private final C41250af f107014e;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.AudioFocusManager$a */
    public static final class C41127a {
        private C41127a() {
        }

        public /* synthetic */ C41127a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static AudioFocusManager m131311a(AppCompatActivity appCompatActivity) {
            C7573i.m23587b(appCompatActivity, "host");
            return new AudioFocusManager(appCompatActivity, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.AudioFocusManager$b */
    static final class C41128b extends Lambda implements C7561a<AudioManager> {

        /* renamed from: a */
        final /* synthetic */ AudioFocusManager f107015a;

        C41128b(AudioFocusManager audioFocusManager) {
            this.f107015a = audioFocusManager;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public AudioManager invoke() {
            Object systemService = this.f107015a.f107012b.getApplicationContext().getSystemService("audio");
            if (systemService != null) {
                return (AudioManager) systemService;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.media.AudioManager");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.AudioFocusManager$c */
    static final class C41129c extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ AudioFocusManager f107016a;

        C41129c(AudioFocusManager audioFocusManager) {
            this.f107016a = audioFocusManager;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m131313a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m131313a() {
            try {
                this.f107016a.mo101587a().requestAudioFocus(null, 3, 1);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.AudioFocusManager$d */
    static final class C41130d extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ AudioFocusManager f107017a;

        C41130d(AudioFocusManager audioFocusManager) {
            this.f107017a = audioFocusManager;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m131314a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m131314a() {
            try {
                this.f107017a.mo101587a().abandonAudioFocus(null);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static final AudioFocusManager m131309a(AppCompatActivity appCompatActivity) {
        return C41127a.m131311a(appCompatActivity);
    }

    /* renamed from: a */
    public final AudioManager mo101587a() {
        return (AudioManager) this.f107013d.getValue();
    }

    @C0054q(mo125a = Event.ON_START)
    public final void onStart() {
        this.f107014e.mo101944a();
    }

    @C0054q(mo125a = Event.ON_STOP)
    public final void onStop() {
        this.f107014e.mo101945b();
    }

    private AudioFocusManager(AppCompatActivity appCompatActivity) {
        this.f107012b = appCompatActivity;
        this.f107012b.getLifecycle().mo55a(this);
        this.f107013d = C7546e.m23569a(new C41128b(this));
        this.f107014e = new C41250af(new C41129c(this), new C41130d(this));
    }

    public /* synthetic */ AudioFocusManager(AppCompatActivity appCompatActivity, C7571f fVar) {
        this(appCompatActivity);
    }
}
