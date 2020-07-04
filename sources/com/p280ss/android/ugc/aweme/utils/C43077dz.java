package com.p280ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import bolts.C1592h;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.ies.ugc.aweme.network.C10944e;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.utils.dz */
public class C43077dz {

    /* renamed from: a */
    public static final String[] f111686a = {"uid", "user_id", "author_id", "target_user_ud", "to_user_id", "push_user_id", "share_user_id", "star_uid"};

    /* renamed from: f */
    private static volatile C43077dz f111687f;

    /* renamed from: b */
    public WeakReference<Activity> f111688b;

    /* renamed from: c */
    public final List<String> f111689c = new ArrayList();

    /* renamed from: d */
    public int f111690d;

    /* renamed from: e */
    public boolean f111691e;

    /* renamed from: g */
    private final ConcurrentHashMap<String, String> f111692g = new ConcurrentHashMap<>();

    /* renamed from: h */
    private int f111693h = PreloadTask.BYTE_UNIT_NUMBER;

    /* renamed from: i */
    private int f111694i = 1;

    /* renamed from: b */
    public final void mo104735b() {
        if (this.f111691e) {
            m136658a(true, true, "你正在企图打开UserProfile页，但并没有传递secUid，这是不被允许的。\n如何传递请参考：https://bytedance.feishu.cn/space/doc/doccnl8ioZLuwJM6Xhm4uBJ78og");
        }
    }

    /* renamed from: a */
    public static C43077dz m136657a() {
        if (f111687f == null) {
            synchronized (C43077dz.class) {
                if (f111687f == null) {
                    f111687f = new C43077dz();
                }
            }
        }
        return f111687f;
    }

    /* renamed from: d */
    private void m136661d() {
        if (C7163a.m22363a()) {
            C10944e.m32115b().f29619a.registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
                public final void onActivityPaused(Activity activity) {
                }

                public final void onActivityResumed(Activity activity) {
                }

                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                public final void onActivityStarted(Activity activity) {
                }

                public final void onActivityStopped(Activity activity) {
                }

                public final void onActivityDestroyed(Activity activity) {
                    C43077dz.this.f111689c.remove(activity.getClass().getCanonicalName());
                }

                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    C43077dz.this.f111689c.add(activity.getClass().getCanonicalName());
                    C43077dz.this.f111688b = new WeakReference<>(activity);
                }
            });
        }
    }

    private C43077dz() {
        m136661d();
        this.f111691e = C7163a.m22363a();
    }

    /* renamed from: c */
    public final String mo104736c() {
        StringBuilder sb = new StringBuilder();
        for (int size = this.f111689c.size() - 1; size >= 0; size--) {
            sb.append("\n");
            sb.append((String) this.f111689c.get(size));
        }
        return sb.toString();
    }

    /* renamed from: b */
    public final String mo104733b(String str) {
        return mo104734b(str, null);
    }

    /* renamed from: a */
    public final boolean mo104732a(String str) {
        if (!this.f111691e || str.contains("passport")) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private void m136659c(String str) {
        if (this.f111691e) {
            StringBuilder sb = new StringBuilder("你正在企图添加一个uid(");
            sb.append(str);
            sb.append(")到secUid的映射，但secUid是空，这是不被允许的。\n这可能是你主动调用的，也可能是网络数据返回的，请检查你的代码。");
            m136658a(false, false, sb.toString());
        }
    }

    /* renamed from: b */
    public final String mo104734b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.equals("0", str) || TextUtils.equals("-1", str)) {
            return null;
        }
        String str3 = (String) this.f111692g.get(str);
        if (TextUtils.isEmpty(str3)) {
            m136660c(str, str2);
        }
        StringBuilder sb = new StringBuilder("SecUidManager----->get: key:");
        sb.append(str);
        sb.append(", value:");
        sb.append(str3);
        return str3;
    }

    /* renamed from: c */
    private void m136660c(String str, String str2) {
        boolean z;
        if (this.f111691e) {
            StringBuilder sb = new StringBuilder("你正在企图取出一个uid(");
            sb.append(str);
            sb.append(")到secUid的映射，但并没有取到或取到一个空串，这是不被允许的。");
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(str2)) {
                z = true;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append("\n这发生在请求这个地址时：");
                sb3.append(str2);
                sb2 = sb3.toString();
            } else {
                z = false;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb2);
            sb4.append("\n这可能是你主动调用的，也可能是网络数据返回的，请检查你的代码。");
            String sb5 = sb4.toString();
            if (TextUtils.equals(C10944e.m32115b().f29621c.getUserId(), str)) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(sb5);
                sb6.append("\n这是当前登录用户，如果有空的话，也修改一下，但优先级不高。\n如有疑问请飞书联系黄凌毓");
                sb6.append(mo104736c());
                return;
            }
            m136658a(false, z, sb5);
        }
    }

    /* renamed from: a */
    public final void mo104731a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals("0", str) && !TextUtils.equals("-1", str)) {
            if (TextUtils.isEmpty(str2)) {
                m136659c(str);
                return;
            }
            StringBuilder sb = new StringBuilder("SecUidManager----->put: key:");
            sb.append(str);
            sb.append(", value:");
            sb.append(str2);
            this.f111692g.put(str, str2);
            int size = this.f111692g.size();
            if (C10944e.m32115b() != null && size >= this.f111693h) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("map_size", size);
                    int i = this.f111694i;
                    this.f111694i = i + 1;
                    jSONObject.put("report_count", i);
                } catch (JSONException unused) {
                }
                C6893q.m21452b("aweme_secuid_map_size", "aweme_secuid_map_size", jSONObject);
                this.f111693h *= 2;
            }
        }
    }

    /* renamed from: a */
    private void m136658a(boolean z, boolean z2, final String str) {
        if (C6399b.m19928c() && z) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("\n如有疑问请飞书联系黄凌毓");
            sb.append(mo104736c());
            throw new IllegalArgumentException(sb.toString());
        } else if (C7163a.m22363a() && z2 && this.f111688b != null && this.f111688b.get() != null) {
            C1592h.m7855a((Callable<TResult>) new Callable<Object>() {
                public final Object call() throws Exception {
                    if (!(C43077dz.this.f111688b == null || C43077dz.this.f111688b.get() == null)) {
                        Builder builder = new Builder(C6405d.m19984g());
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append("\n如有疑问请飞书联系黄凌毓");
                        sb.append(C43077dz.this.mo104736c());
                        Builder message = builder.setMessage(sb.toString());
                        if (C43077dz.this.f111690d < 10) {
                            message.setTitle("非法错误").setCancelable(true).setPositiveButton("好的，知道了，一会儿去联系", null);
                        } else if (C43077dz.this.f111690d < 30) {
                            message.setTitle("我已经提示你好多次了呢～").setCancelable(false).setPositiveButton("好的，现在立即就去联系 黄凌毓", new OnClickListener() {
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    dialogInterface.dismiss();
                                }
                            });
                        } else {
                            message.setTitle("-->>律师函警告<<--").setCancelable(false);
                            C43085ea.m136675a(Toast.makeText(C6399b.m19921a(), "杀进程冷启动才能恢复", 1));
                        }
                        message.show();
                        C43077dz.this.f111690d++;
                    }
                    return null;
                }
            }, C1592h.f5958b);
        }
    }
}
