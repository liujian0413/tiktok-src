package com.bytedance.android.livesdk.action;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.livesdk.action.C3868d.C3869a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.android.livesdk.action.a */
public final class C3852a {

    /* renamed from: a */
    public List<C3871f> f11546a = new ArrayList();

    /* renamed from: b */
    private Map<String, C3871f> f11547b = new ConcurrentHashMap();

    /* renamed from: c */
    private boolean f11548c = false;

    /* renamed from: com.bytedance.android.livesdk.action.a$a */
    class C3854a implements C3869a<Object> {

        /* renamed from: b */
        private String f11552b;

        /* renamed from: a */
        public final void mo11403a(Object obj) {
            if (TextUtils.isEmpty(this.f11552b)) {
                try {
                    C3852a.this.mo11401a(this.f11552b);
                } catch (Exception unused) {
                }
            }
        }

        public C3854a(String str) {
            this.f11552b = str;
        }
    }

    /* renamed from: a */
    public final void mo11401a(String str) throws Exception {
        mo11402a(str, null);
    }

    /* renamed from: a */
    public final void mo11400a(C3868d dVar) {
        if (dVar != null) {
            C3871f fVar = new C3871f(dVar);
            StringBuilder sb = new StringBuilder();
            sb.append(fVar.f11574c);
            sb.append(" register ");
            sb.append(dVar.toString());
            this.f11547b.put(fVar.f11574c, new C3871f(dVar));
        }
    }

    /* renamed from: a */
    public final void mo11402a(String str, C3869a aVar) throws Exception {
        if (str == null) {
            if (this.f11548c) {
                throw new Exception("action can not be null");
            }
        } else if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                final C3871f fVar = (C3871f) this.f11547b.get(parse.getHost());
                if (fVar != null) {
                    String queryParameter = parse.getQueryParameter("action_callback");
                    if (aVar == null && !TextUtils.isEmpty(str)) {
                        aVar = new C3854a(queryParameter);
                    }
                    this.f11546a.add(fVar);
                    C3868d dVar = fVar.f11572a;
                    if (aVar == null) {
                        dVar.mo11411a(str, null);
                        this.f11546a.remove(fVar);
                        return;
                    }
                    dVar.mo11411a(str, new C3870e(aVar) {
                    });
                } else if (this.f11548c) {
                    throw new Exception("can't find action");
                }
            }
        } else if (this.f11548c) {
            throw new Exception("action name can not be null");
        }
    }
}
