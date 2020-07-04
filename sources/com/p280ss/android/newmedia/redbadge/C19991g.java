package com.p280ss.android.newmedia.redbadge;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.text.TextUtils;
import com.p280ss.android.newmedia.redbadge.p894a.C19954a;
import com.p280ss.android.newmedia.redbadge.p894a.C19955b;
import com.p280ss.android.newmedia.redbadge.p894a.C19956c;
import com.p280ss.android.newmedia.redbadge.p894a.C19957d;
import com.p280ss.android.newmedia.redbadge.p894a.C19958e;
import com.p280ss.android.newmedia.redbadge.p894a.C19959f;
import com.p280ss.android.newmedia.redbadge.p894a.C19960g;
import com.p280ss.android.newmedia.redbadge.p894a.C19961h;
import com.p280ss.android.newmedia.redbadge.p894a.C19962i;
import com.p280ss.android.newmedia.redbadge.p894a.C19963j;
import com.p280ss.android.newmedia.redbadge.p894a.C19964k;
import com.p280ss.android.newmedia.redbadge.p894a.C19965l;
import com.p280ss.android.newmedia.redbadge.p894a.C19969m;
import com.p280ss.android.newmedia.redbadge.p894a.C19970n;
import com.p280ss.android.newmedia.redbadge.p894a.C19971o;
import com.p280ss.android.newmedia.redbadge.p894a.C19972p;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.newmedia.redbadge.g */
public class C19991g {

    /* renamed from: a */
    private static final List<Class<? extends C19953a>> f54110a;

    /* renamed from: d */
    private static volatile C19991g f54111d;

    /* renamed from: b */
    private C19953a f54112b;

    /* renamed from: c */
    private ComponentName f54113c;

    private C19991g() {
    }

    /* renamed from: a */
    public static synchronized C19991g m65902a() {
        C19991g gVar;
        synchronized (C19991g.class) {
            if (f54111d == null) {
                synchronized (C19991g.class) {
                    if (f54111d == null) {
                        f54111d = new C19991g();
                    }
                }
            }
            gVar = f54111d;
        }
        return gVar;
    }

    static {
        LinkedList linkedList = new LinkedList();
        f54110a = linkedList;
        linkedList.add(C19954a.class);
        f54110a.add(C19955b.class);
        f54110a.add(C19960g.class);
        f54110a.add(C19961h.class);
        f54110a.add(C19965l.class);
        f54110a.add(C19970n.class);
        f54110a.add(C19956c.class);
        f54110a.add(C19959f.class);
        f54110a.add(C19962i.class);
        f54110a.add(C19969m.class);
        f54110a.add(C19971o.class);
        f54110a.add(C19972p.class);
        f54110a.add(C19963j.class);
        f54110a.add(C19958e.class);
        f54110a.add(C19964k.class);
    }

    /* renamed from: a */
    public final boolean mo53508a(Context context) {
        return mo53509a(context, 0);
    }

    /* renamed from: b */
    private boolean m65903b(Context context) {
        C19953a aVar;
        boolean z = false;
        if (context == null) {
            return false;
        }
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                return false;
            }
            this.f54113c = launchIntentForPackage.getComponent();
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
            if (!(resolveActivity == null || resolveActivity.activityInfo == null || TextUtils.isEmpty(resolveActivity.activityInfo.name))) {
                if (!resolveActivity.activityInfo.name.toLowerCase().contains("resolver")) {
                    String str = resolveActivity.activityInfo.packageName;
                    Iterator it = f54110a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        try {
                            aVar = (C19953a) ((Class) it.next()).newInstance();
                        } catch (Throwable unused) {
                            aVar = null;
                        }
                        if (aVar != null) {
                            if (aVar.mo53458a().contains(str)) {
                                this.f54112b = aVar;
                                z = true;
                                break;
                            }
                        }
                    }
                    if (this.f54112b == null) {
                        if (Build.MANUFACTURER.equalsIgnoreCase("OPPO")) {
                            this.f54112b = new C19962i();
                        } else if (Build.MANUFACTURER.equalsIgnoreCase("VIVO")) {
                            this.f54112b = new C19969m();
                        } else if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
                            this.f54112b = new C19970n();
                        } else if (Build.MANUFACTURER.equalsIgnoreCase("ZUK")) {
                            this.f54112b = new C19972p();
                        } else if (Build.MANUFACTURER.equalsIgnoreCase("ZTE")) {
                            this.f54112b = new C19971o();
                        } else if (Build.MANUFACTURER.equalsIgnoreCase("SONY")) {
                            this.f54112b = new C19965l();
                        } else if (Build.MANUFACTURER.equalsIgnoreCase("Samsung")) {
                            this.f54112b = new C19963j();
                        } else {
                            this.f54112b = new C19957d();
                        }
                        z = true;
                    }
                    return z;
                }
            }
            return false;
        } catch (Exception unused2) {
        }
    }

    /* renamed from: a */
    public final boolean mo53509a(Context context, int i) {
        try {
            mo53510b(context, i);
            return true;
        } catch (RedBadgerException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public final void mo53510b(Context context, int i) throws RedBadgerException {
        if (this.f54112b != null || m65903b(context)) {
            try {
                this.f54112b.mo53459a(context, this.f54113c, i);
            } catch (Exception e) {
                throw new RedBadgerException("Unable to execute badge", e);
            }
        } else {
            throw new RedBadgerException("No default launcher available");
        }
    }
}
