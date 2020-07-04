package com.p280ss.android.ugc.aweme.mobile.p1400a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import com.p280ss.android.common.util.C6776h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.mobile.a.b */
public final class C33601b {

    /* renamed from: com.ss.android.ugc.aweme.mobile.a.b$a */
    public static final class C33602a {

        /* renamed from: a */
        private WeakReference<Activity> f87712a;

        /* renamed from: b */
        private WeakReference<Fragment> f87713b;

        /* renamed from: c */
        private WeakReference<Context> f87714c;

        /* renamed from: d */
        private Class<? extends Activity> f87715d;

        /* renamed from: e */
        private int f87716e;

        /* renamed from: f */
        private int f87717f;

        /* renamed from: g */
        private Bundle f87718g = new Bundle();

        /* renamed from: a */
        public final void mo85936a() {
            this.f87717f = 1;
            m108493b();
        }

        /* renamed from: c */
        private Context m108494c() {
            if (this.f87712a != null) {
                return (Context) this.f87712a.get();
            }
            if (this.f87713b != null && this.f87713b.get() != null) {
                return ((Fragment) this.f87713b.get()).getActivity();
            }
            if (this.f87714c != null) {
                return (Context) this.f87714c.get();
            }
            return null;
        }

        /* renamed from: b */
        private void m108493b() {
            Context c = m108494c();
            if (c != null) {
                boolean z = false;
                Intent intent = new Intent();
                if (this.f87715d != null) {
                    intent.setClass(c, this.f87715d);
                    z = true;
                }
                if (z) {
                    if (!this.f87718g.isEmpty()) {
                        intent.putExtras(this.f87718g);
                    }
                    if (this.f87716e == 0) {
                        if (this.f87712a != null && this.f87712a.get() != null) {
                            ((Activity) this.f87712a.get()).startActivity(intent);
                        } else if (this.f87713b != null && this.f87713b.get() != null) {
                            ((Fragment) this.f87713b.get()).startActivity(intent);
                        } else if (!(this.f87714c == null || this.f87714c.get() == null)) {
                            intent.addFlags(268435456);
                            ((Context) this.f87714c.get()).startActivity(intent);
                        }
                    } else if (this.f87712a != null && this.f87712a.get() != null) {
                        ((Activity) this.f87712a.get()).startActivityForResult(intent, this.f87716e);
                    } else if (this.f87713b != null && this.f87713b.get() != null) {
                        ((Fragment) this.f87713b.get()).startActivityForResult(intent, this.f87716e);
                    } else if (!(this.f87714c == null || this.f87714c.get() == null)) {
                        intent.addFlags(268435456);
                        ((Context) this.f87714c.get()).startActivity(intent);
                    }
                    if (this.f87717f == 1) {
                        if (this.f87712a != null && this.f87712a.get() != null) {
                            ((Activity) this.f87712a.get()).overridePendingTransition(R.anim.c4, R.anim.cc);
                        } else if (!(this.f87713b == null || this.f87713b.get() == null || ((Fragment) this.f87713b.get()).getActivity() == null)) {
                            ((Fragment) this.f87713b.get()).getActivity().overridePendingTransition(R.anim.c4, R.anim.cc);
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public final C33602a mo85935a(Class<? extends Activity> cls) {
            this.f87715d = cls;
            return this;
        }

        /* renamed from: a */
        public static C33602a m108492a(Activity activity) {
            return new C33602a(activity);
        }

        private C33602a(Activity activity) {
            this.f87712a = new WeakReference<>(activity);
        }
    }

    /* renamed from: a */
    public static void m108491a(Activity activity, boolean z, boolean z2) {
        if (!activity.isFinishing()) {
            Intent intent = null;
            if (activity.isTaskRoot()) {
                intent = C6776h.m20941a((Context) activity, activity.getPackageName());
            }
            activity.finish();
            if (intent != null) {
                activity.startActivity(intent);
            }
        }
    }
}
