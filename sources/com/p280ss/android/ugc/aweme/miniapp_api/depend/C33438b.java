package com.p280ss.android.ugc.aweme.miniapp_api.depend;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View.OnClickListener;
import com.p280ss.android.ugc.aweme.miniapp_api.model.C33450a;
import com.p280ss.android.ugc.aweme.miniapp_api.model.C33457b;
import com.p280ss.android.ugc.aweme.miniapp_api.model.C33458c;
import com.p280ss.android.ugc.aweme.miniapp_api.model.C33462f;
import com.p280ss.android.ugc.aweme.miniapp_api.model.C33463g;
import com.p280ss.android.ugc.aweme.miniapp_api.p1397a.C33423a;
import com.p280ss.android.ugc.aweme.miniapp_api.p1397a.C33427b;
import com.p280ss.android.ugc.aweme.miniapp_api.p1397a.C33428c;
import com.p280ss.android.ugc.aweme.miniapp_api.p1397a.C33430e;
import com.p280ss.android.ugc.aweme.miniapp_api.p1397a.C33432g;
import com.p280ss.android.ugc.aweme.miniapp_api.p1397a.p1398a.C33424a;
import com.p280ss.android.ugc.aweme.miniapp_api.p1397a.p1398a.C33425b;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.miniapp_api.depend.b */
public interface C33438b {
    /* renamed from: a */
    Dialog mo85562a(Activity activity, String str, String str2, String str3, C33427b bVar);

    /* renamed from: a */
    C33458c mo85563a(String str, long j);

    /* renamed from: a */
    String mo85564a();

    /* renamed from: a */
    void mo85565a(long j, long j2);

    /* renamed from: a */
    void mo85566a(long j, C33424a aVar, C33425b bVar, boolean z);

    /* renamed from: a */
    void mo85567a(Activity activity);

    /* renamed from: a */
    void mo85568a(Activity activity, Intent intent);

    /* renamed from: a */
    void mo85569a(Activity activity, C33458c cVar, long j, OnClickListener onClickListener, OnClickListener onClickListener2);

    /* renamed from: a */
    void mo85570a(Activity activity, String str, Bundle bundle, C33428c cVar);

    /* renamed from: a */
    void mo85571a(Activity activity, String str, String str2, C33432g gVar);

    /* renamed from: a */
    void mo85572a(Application application);

    /* renamed from: a */
    void mo85573a(Application application, int i, int i2, Map<String, String> map);

    /* renamed from: a */
    void mo85574a(Context context, Bundle bundle, C33430e eVar);

    /* renamed from: a */
    void mo85575a(Context context, String str);

    /* renamed from: a */
    void mo85576a(Context context, String str, JSONObject jSONObject);

    /* renamed from: a */
    void mo85577a(Exception exc);

    /* renamed from: a */
    void mo85578a(Runnable runnable);

    /* renamed from: a */
    void mo85579a(String str);

    /* renamed from: a */
    void mo85580a(String str, C33423a aVar);

    /* renamed from: a */
    void mo85581a(String str, String str2, String str3, int i, C33430e eVar);

    /* renamed from: a */
    void mo85582a(String str, String str2, String str3, Throwable th);

    /* renamed from: a */
    void mo85583a(Map<String, String> map);

    /* renamed from: a */
    void mo85584a(boolean z);

    /* renamed from: b */
    C33450a mo85585b(String str);

    /* renamed from: b */
    C33462f mo85586b(long j, long j2);

    /* renamed from: b */
    String mo85587b();

    /* renamed from: b */
    void mo85588b(Activity activity, Intent intent);

    /* renamed from: b */
    void mo85589b(Application application);

    /* renamed from: b */
    void mo85590b(Runnable runnable);

    /* renamed from: c */
    boolean mo85591c();

    /* renamed from: d */
    void mo85592d();

    /* renamed from: e */
    String mo85593e();

    /* renamed from: f */
    String mo85594f();

    /* renamed from: g */
    String mo85595g();

    /* renamed from: h */
    boolean mo85596h();

    /* renamed from: i */
    C33463g mo85597i();

    /* renamed from: j */
    C33457b mo85598j();
}
