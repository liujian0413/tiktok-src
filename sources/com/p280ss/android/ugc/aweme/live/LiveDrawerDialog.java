package com.p280ss.android.ugc.aweme.live;

import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.DialogFragment;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.widget.DrawerLayout;
import android.support.p022v4.widget.DrawerLayout.C1009c;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import com.bytedance.android.livesdk.C3916b;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtLoadingLayout;
import com.p280ss.android.ugc.aweme.app.p1028c.C22911a;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.reflect.Field;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.live.LiveDrawerDialog */
public class LiveDrawerDialog extends DialogFragment {

    /* renamed from: a */
    public View f84551a;

    /* renamed from: b */
    public DrawerLayout f84552b;

    /* renamed from: c */
    public Fragment f84553c;

    /* renamed from: d */
    public DmtLoadingLayout f84554d;

    /* renamed from: e */
    private List<C1009c> f84555e;

    /* renamed from: f */
    private C1009c f84556f = new C1009c() {
        public final void onDrawerSlide(View view, float f) {
        }

        public final void onDrawerOpened(View view) {
            C3916b.m13813a().mo11465b();
        }

        public final void onDrawerClosed(View view) {
            C3916b.m13813a().mo11466c();
            LiveDrawerDialog.this.dismissAllowingStateLoss();
        }

        public final void onDrawerStateChanged(int i) {
            if (i == 0 && LiveDrawerDialog.this.f84552b != null && !LiveDrawerDialog.this.f84552b.isDrawerOpen(8388613)) {
                LiveDrawerDialog.this.f84552b.closeDrawer(8388613);
                LiveDrawerDialog.this.dismissAllowingStateLoss();
            }
        }
    };

    /* renamed from: b */
    public final void mo83646b() {
        if (this.f84554d != null) {
            this.f84554d.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final boolean mo83645a() {
        if (this.f84552b == null || !C0991u.m4170G(this.f84552b) || !this.f84552b.isDrawerOpen(8388613)) {
            return false;
        }
        this.f84552b.closeDrawer(8388613);
        return true;
    }

    /* renamed from: a */
    public static LiveDrawerDialog m105007a(List<C1009c> list) {
        LiveDrawerDialog liveDrawerDialog = new LiveDrawerDialog();
        liveDrawerDialog.f84555e = list;
        return liveDrawerDialog;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.ut);
    }

    /* renamed from: a */
    public final void mo83644a(boolean z) {
        if (this.f84552b != null && C0991u.m4170G(this.f84552b)) {
            this.f84552b.closeDrawer(8388613);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Window window = getDialog().getWindow();
        if (window != null) {
            if (VERSION.SDK_INT >= 21) {
                window.addFlags(Integer.MIN_VALUE);
                window.setNavigationBarColor(-16777216);
            }
            if (C22911a.m75401a(getContext())) {
                window.clearFlags(PreloadTask.BYTE_UNIT_NUMBER);
            }
        }
    }

    /* renamed from: a */
    private void m105008a(String str, Object obj) {
        try {
            Field declaredField = LiveDrawerDialog.class.getSuperclass().getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(this, obj);
        } catch (Exception unused) {
        }
    }

    public void show(C0608j jVar, String str) {
        m105008a("mDismissed", Boolean.valueOf(false));
        m105008a("mShownByMe", Boolean.valueOf(true));
        C0633q a = jVar.mo2645a();
        a.mo2588a((Fragment) this, str);
        a.mo2606d();
    }

    public void showNow(C0608j jVar, String str) {
        m105008a("mDismissed", Boolean.valueOf(false));
        m105008a("mShownByMe", Boolean.valueOf(true));
        C0633q a = jVar.mo2645a();
        a.mo2588a((Fragment) this, str);
        try {
            a.mo2610f();
        } catch (Throwable unused) {
            a.mo2606d();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f84552b = (DrawerLayout) this.f84551a.findViewById(R.id.abi);
        this.f84552b.addDrawerListener(this.f84556f);
        if (C6311g.m19574b(this.f84555e)) {
            for (C1009c addDrawerListener : this.f84555e) {
                this.f84552b.addDrawerListener(addDrawerListener);
            }
        }
        ViewGroup viewGroup = (ViewGroup) this.f84551a.findViewById(R.id.c_9);
        int a = (int) (((float) C9738o.m28691a(getContext())) - C9738o.m28708b(getContext(), 50.0f));
        if (a > 0) {
            LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.width = a;
            viewGroup.setLayoutParams(layoutParams);
            this.f84552b.post(new Runnable() {
                public final void run() {
                    if (LiveDrawerDialog.this.isVisible()) {
                        if (LiveDrawerDialog.this.f84552b != null) {
                            LiveDrawerDialog.this.f84552b.openDrawer(8388613);
                        }
                        if (LiveDrawerDialog.this.f84553c == null) {
                            LiveDrawerDialog.this.f84554d = (DmtLoadingLayout) LiveDrawerDialog.this.f84551a.findViewById(R.id.a_3);
                            LiveDrawerDialog.this.f84554d.setVisibility(0);
                            LiveDrawerDialog.this.f84553c = null;
                        }
                        if (!LiveDrawerDialog.this.f84553c.isAdded()) {
                            C0633q a = LiveDrawerDialog.this.getChildFragmentManager().mo2645a();
                            a.mo2585a((int) R.id.c_8, LiveDrawerDialog.this.f84553c);
                            a.mo2606d();
                        }
                    }
                }
            });
            getDialog().setOnKeyListener(new OnKeyListener() {
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    if (4 == i && 1 == keyEvent.getAction()) {
                        return LiveDrawerDialog.this.mo83645a();
                    }
                    return false;
                }
            });
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f84551a = layoutInflater.inflate(R.layout.kl, viewGroup, false);
        return this.f84551a;
    }
}
