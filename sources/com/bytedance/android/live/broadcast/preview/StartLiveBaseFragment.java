package com.bytedance.android.live.broadcast.preview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import com.bytedance.android.live.core.p157ui.BaseFragment;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdkapi.C9402f;
import com.bytedance.android.livesdkapi.IPropertyCache;
import com.bytedance.android.livesdkapi.depend.model.p445a.C9350e;
import com.bytedance.android.livesdkapi.host.C9439a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p346io.reactivex.p347b.C47562b;

public abstract class StartLiveBaseFragment extends BaseFragment implements C9350e {

    /* renamed from: a */
    protected IPropertyCache f8745a;

    /* renamed from: b */
    protected final C47562b f8746b = new C47562b();

    /* renamed from: c */
    protected Activity f8747c;

    /* renamed from: d */
    protected boolean f8748d = false;

    /* renamed from: e */
    public int f8749e = 0;

    /* renamed from: f */
    public int f8750f = 0;

    /* renamed from: g */
    protected ArrayList<C9402f> f8751g = new ArrayList<>();

    /* renamed from: h */
    public Handler f8752h = new Handler(Looper.getMainLooper());

    /* renamed from: i */
    private final List<Object> f8753i = new ArrayList();

    public void onDestroy() {
        this.f8753i.clear();
        super.onDestroy();
        m11043a("onDestroy");
    }

    public void onPause() {
        super.onPause();
        m11043a("onPause");
    }

    public void onResume() {
        super.onResume();
        m11043a("onResume");
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        this.f8747c = (Activity) context;
    }

    /* renamed from: a */
    private static void m11043a(String str) {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("StartLiveFragment:");
        sb.append(str);
        hashMap.put("page_name", sb.toString());
        C8444d.m25673b().mo10001b("ttlive_page", (Map) hashMap);
    }

    public void onCreate(Bundle bundle) {
        if (C3596c.m13172a(C3592a.class) == null || ((C3592a) C3596c.m13172a(C3592a.class)).user() == null) {
            C2911g.m11395a(Toast.makeText(getActivity(), R.string.ejm, 0));
            getActivity().finish();
            this.f8748d = true;
        } else {
            this.f8745a = ((C9439a) C3596c.m13172a(C9439a.class)).mo23190b();
        }
        super.onCreate(bundle);
        m11043a("onCreate");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Iterator it = this.f8753i.iterator();
        while (it.hasNext()) {
            it.next();
        }
        super.onActivityResult(i, i2, intent);
    }
}
