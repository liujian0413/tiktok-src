package android.support.p029v7.app;

import android.support.p022v4.widget.DrawerLayout.C1009c;
import android.support.p029v7.graphics.drawable.C1132c;
import android.view.View;

/* renamed from: android.support.v7.app.ActionBarDrawerToggle */
public class ActionBarDrawerToggle implements C1009c {

    /* renamed from: a */
    public C1132c f3704a;

    /* renamed from: b */
    public boolean f3705b;

    /* renamed from: c */
    public boolean f3706c;

    /* renamed from: d */
    private final C1068a f3707d;

    /* renamed from: e */
    private final int f3708e;

    /* renamed from: f */
    private final int f3709f;

    /* renamed from: android.support.v7.app.ActionBarDrawerToggle$a */
    public interface C1068a {
        /* renamed from: a */
        void mo4191a(int i);
    }

    public void onDrawerStateChanged(int i) {
    }

    /* renamed from: a */
    private void m4672a(int i) {
        this.f3707d.mo4191a(i);
    }

    public void onDrawerClosed(View view) {
        m4671a(0.0f);
        if (this.f3706c) {
            m4672a(this.f3708e);
        }
    }

    public void onDrawerOpened(View view) {
        m4671a(1.0f);
        if (this.f3706c) {
            m4672a(this.f3709f);
        }
    }

    /* renamed from: a */
    private void m4671a(float f) {
        if (f == 1.0f) {
            this.f3704a.mo4526a(true);
        } else if (f == 0.0f) {
            this.f3704a.mo4526a(false);
        }
        this.f3704a.mo4525a(f);
    }

    public void onDrawerSlide(View view, float f) {
        if (this.f3705b) {
            m4671a(Math.min(1.0f, Math.max(0.0f, f)));
        } else {
            m4671a(0.0f);
        }
    }
}
