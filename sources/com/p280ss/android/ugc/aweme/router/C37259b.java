package com.p280ss.android.ugc.aweme.router;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.p022v4.app.ActivityCompat;
import android.support.p022v4.app.C0598c;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.framwork.core.monitor.C6379c;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.app.C22912d;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.router.b */
public final class C37259b implements C37273j {

    /* renamed from: a */
    public String f97374a;

    /* renamed from: b */
    public C37260c f97375b;

    /* renamed from: c */
    public boolean f97376c;

    /* renamed from: d */
    private Context f97377d;

    /* renamed from: e */
    private Class<? extends Activity> f97378e;

    /* renamed from: f */
    private String f97379f;

    /* renamed from: b */
    private static void m119717b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                str = "empty url";
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("service", "in_app_router_no_matched");
            jSONObject.put(C22912d.f60642b, str);
            C6379c.m19826a("common_log", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final boolean mo59315a(String str) {
        return m119718b((Activity) null, str, (View) null);
    }

    /* renamed from: a */
    public final boolean mo59313a(Activity activity, String str) {
        return m119718b(activity, str, (View) null);
    }

    /* renamed from: a */
    private void m119714a(Intent intent, String str) {
        Map b = C37286v.m119760b(str);
        for (String str2 : b.keySet()) {
            m119716b(intent, str2, C37286v.m119759b(str, (String) b.get(str2)));
        }
    }

    public C37259b(Context context, String str, Class<? extends Activity> cls) {
        this.f97377d = context;
        this.f97374a = str;
        this.f97378e = cls;
    }

    /* renamed from: a */
    public final boolean mo59314a(Activity activity, String str, View view) {
        return m119718b(activity, str, view);
    }

    /* renamed from: a */
    private static void m119715a(Intent intent, String str, String str2) {
        List a = C37286v.m119757a(str);
        List a2 = C37286v.m119757a(str2);
        int size = a.size();
        for (int i = 1; i < size; i++) {
            if (i < size) {
                String str3 = (String) a2.get(i);
                intent.putExtra(((String) a.get(i)).substring(1), str3);
            }
        }
    }

    /* renamed from: b */
    private static void m119716b(Intent intent, String str, String str2) {
        C37283q qVar = C7195s.m22438a().f20133a;
        if (qVar != null) {
            switch (qVar.mo93888d(str)) {
                case 1:
                    intent.putExtra(str, Integer.parseInt(str2));
                    return;
                case 2:
                    intent.putExtra(str, Long.parseLong(str2));
                    return;
                case 3:
                    intent.putExtra(str, Boolean.parseBoolean(str2));
                    return;
                case 4:
                    intent.putExtra(str, Short.parseShort(str2));
                    return;
                case 5:
                    intent.putExtra(str, Float.parseFloat(str2));
                    return;
                case 6:
                    intent.putExtra(str, Double.parseDouble(str2));
                    return;
                case 7:
                    intent.putExtra(str, Byte.parseByte(str2));
                    return;
                case 8:
                    intent.putExtra(str, str2.charAt(0));
                    return;
                default:
                    intent.putExtra(str, str2);
                    return;
            }
        }
    }

    /* renamed from: b */
    private boolean m119718b(Activity activity, String str, View view) {
        Context context;
        Intent intent;
        if (activity != 0) {
            context = activity;
        } else {
            context = this.f97377d;
        }
        if (context == 0) {
            return false;
        }
        boolean z = true;
        if (!this.f97376c) {
            if (!TextUtils.isEmpty(this.f97379f)) {
                intent = new Intent();
                intent.setClassName(context, this.f97379f);
            } else {
                intent = new Intent(context, this.f97378e);
            }
            m119715a(intent, this.f97374a, str);
            m119714a(intent, str);
            C7195s.m22438a().f20133a.mo93884a();
            if (activity == 0) {
                intent.addFlags(268435456);
            }
            if (this.f97375b == null) {
                if (view == null) {
                    context.startActivity(intent);
                } else {
                    ActivityCompat.m2905a((Context) activity, intent, C0598c.m2486a(view, view.getWidth() / 2, view.getHeight() / 2, 0, 0).mo2580a());
                }
                return true;
            }
            int i = this.f97375b.f97384e;
            intent.addFlags(this.f97375b.f97383d);
            if (i == 0) {
                context.startActivity(intent);
            } else if (1 != i || activity == 0) {
                z = false;
            } else {
                activity.startActivityForResult(intent, this.f97375b.f97382c);
            }
            if (!(activity == 0 || this.f97375b.f97380a == -1 || this.f97375b.f97381b == -1)) {
                activity.overridePendingTransition(this.f97375b.f97380a, this.f97375b.f97381b);
            }
            return z;
        } else if (!SmartRouter.canOpen(str)) {
            m119717b(str);
            return false;
        } else {
            if (this.f97375b != null) {
                Intent buildIntent = SmartRouter.buildRoute(context, str).buildIntent();
                if (buildIntent == null) {
                    return false;
                }
                int i2 = this.f97375b.f97384e;
                buildIntent.addFlags(this.f97375b.f97383d);
                if (activity == 0) {
                    buildIntent.addFlags(268435456);
                }
                if (i2 == 0) {
                    context.startActivity(buildIntent);
                } else if (1 == i2 && activity != 0) {
                    activity.startActivityForResult(buildIntent, this.f97375b.f97382c);
                }
                if (!(activity == 0 || this.f97375b.f97380a == -1 || this.f97375b.f97381b == -1)) {
                    activity.overridePendingTransition(this.f97375b.f97380a, this.f97375b.f97381b);
                }
            } else if (view == null) {
                SmartRouter.buildRoute(context, str).open();
            } else {
                Intent buildIntent2 = SmartRouter.buildRoute(context, str).buildIntent();
                if (buildIntent2 == null) {
                    return false;
                }
                C0598c a = C0598c.m2486a(view, view.getWidth() / 2, view.getHeight() / 2, 0, 0);
                if (activity == 0) {
                    buildIntent2.addFlags(268435456);
                }
                ActivityCompat.m2905a(context, buildIntent2, a.mo2580a());
            }
            return true;
        }
    }
}
