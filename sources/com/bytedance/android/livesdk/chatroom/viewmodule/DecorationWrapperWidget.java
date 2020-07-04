package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.livesdk.chatroom.event.C4417ai;
import com.bytedance.android.livesdk.chatroom.event.C4426ar;
import com.bytedance.android.livesdk.chatroom.event.C4448r;
import com.bytedance.android.livesdk.chatroom.model.C4883ap;
import com.bytedance.android.livesdk.chatroom.p220ui.C5300dw;
import com.bytedance.android.livesdk.chatroom.p220ui.SimpleInputDialogFragment;
import com.bytedance.android.livesdk.chatroom.p220ui.SimpleInputDialogFragment.C5171a;
import com.bytedance.android.livesdk.chatroom.presenter.C5029m;
import com.bytedance.android.livesdk.chatroom.presenter.C5029m.C5032a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5735a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5738d.C5739a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5747j;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ToolbarButton;
import com.bytedance.android.livesdk.chatroom.widget.C5798d;
import com.bytedance.android.livesdk.chatroom.widget.C5798d.C5800a;
import com.bytedance.android.livesdk.config.C5864b;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.log.p405b.C8439k;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdkapi.depend.model.live.C9379p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7497x;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

public class DecorationWrapperWidget extends LiveWidget implements C0053p<KVData>, C5032a, C5800a {

    /* renamed from: h */
    private static final String f15840h = "DecorationWrapperWidget";

    /* renamed from: s */
    private static long f15841s;

    /* renamed from: t */
    private static long f15842t;

    /* renamed from: a */
    public C5029m f15843a;

    /* renamed from: b */
    public String f15844b = "";

    /* renamed from: c */
    public C5300dw f15845c;

    /* renamed from: d */
    public C5412a f15846d;

    /* renamed from: e */
    public int f15847e;

    /* renamed from: f */
    public C4883ap f15848f;

    /* renamed from: g */
    public SimpleInputDialogFragment f15849g = null;

    /* renamed from: i */
    private boolean f15850i;

    /* renamed from: j */
    private boolean f15851j;

    /* renamed from: k */
    private int[] f15852k = new int[4];

    /* renamed from: l */
    private int[] f15853l = new int[4];

    /* renamed from: m */
    private List<C5798d> f15854m = new ArrayList();

    /* renamed from: n */
    private long f15855n;

    /* renamed from: o */
    private boolean f15856o;

    /* renamed from: p */
    private boolean f15857p = false;

    /* renamed from: q */
    private boolean f15858q = false;

    /* renamed from: r */
    private Room f15859r;

    /* renamed from: u */
    private C7321c f15860u;

    /* renamed from: v */
    private C7321c f15861v;

    /* renamed from: w */
    private C5171a f15862w = new C5171a() {
        /* renamed from: b */
        public final void mo13424b(String str) {
            DecorationWrapperWidget.this.f15849g = null;
        }

        /* renamed from: a */
        public final void mo13423a(String str) {
            if (DecorationWrapperWidget.this.f15843a != null) {
                if (!DecorationWrapperWidget.this.f15843a.mo13055b()) {
                    C3517a.m12962a(DecorationWrapperWidget.this.context, DecorationWrapperWidget.this.context.getString(R.string.f78, new Object[]{C5864b.f17258M.mo10240a()}));
                } else if (!DecorationWrapperWidget.this.f15843a.f14302a) {
                    if (TextUtils.isEmpty(str)) {
                        str = DecorationWrapperWidget.this.f15844b;
                    }
                    if (str.length() <= DecorationWrapperWidget.this.f15847e) {
                        DecorationWrapperWidget.this.f15843a.mo13051a(str);
                    } else {
                        C3517a.m12962a(DecorationWrapperWidget.this.context, DecorationWrapperWidget.this.context.getString(R.string.ehr, new Object[]{Integer.valueOf(DecorationWrapperWidget.this.f15847e)}));
                    }
                }
            }
        }
    };

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget$a */
    public interface C5412a {
        /* renamed from: d */
        void mo13129d(boolean z);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget$b */
    class C5413b implements C5739a {
        /* renamed from: a */
        public final void mo8811a(View view, DataCenter dataCenter) {
        }

        /* renamed from: a */
        public final void mo8812a(C5735a aVar) {
        }

        /* renamed from: b */
        public final void mo8813b(View view, DataCenter dataCenter) {
        }

        private C5413b() {
        }

        public final void onClick(View view) {
            int i;
            if (DecorationWrapperWidget.this.f15845c == null) {
                DecorationWrapperWidget decorationWrapperWidget = DecorationWrapperWidget.this;
                Context context = DecorationWrapperWidget.this.getContext();
                if (C3358ac.m12529f()) {
                    i = R.style.ym;
                } else {
                    i = R.style.yn;
                }
                decorationWrapperWidget.f15845c = new C5300dw(context, i, DecorationWrapperWidget.this.f15848f);
            }
            if (!DecorationWrapperWidget.this.f15845c.isShowing()) {
                DecorationWrapperWidget.this.f15845c.show();
            }
        }
    }

    /* renamed from: d */
    public static long m17238d() {
        return f15841s;
    }

    /* renamed from: f */
    public static long m17241f() {
        return f15842t;
    }

    /* renamed from: a */
    public final void mo9118a(Throwable th) {
        C5596au.m18013a(this, th);
    }

    /* renamed from: e */
    public final String mo9125e() {
        return C5596au.m18012a(this);
    }

    public int getLayoutId() {
        return R.layout.b00;
    }

    /* renamed from: a */
    public final void mo13059a(List<C9379p> list) {
        if (isViewValid() && !this.f15856o) {
            for (C5798d removeView : this.f15854m) {
                ((ViewGroup) this.contentView).removeView(removeView);
            }
            this.f15854m.clear();
            if (list != null) {
                for (C9379p pVar : list) {
                    if (pVar != null) {
                        m17236b(pVar);
                    }
                }
                if (this.f15859r != null) {
                    this.f15859r.setDecorationList(list);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo13741a(String str, int i) {
        if (isViewValid()) {
            this.f15847e = i;
            this.dataCenter.lambda$put$1$DataCenter("data_pre_show_keyboard", Boolean.valueOf(true));
            if (this.f15849g == null) {
                FragmentActivity a = m17231a(this.context);
                if (a != null) {
                    this.f15849g = SimpleInputDialogFragment.m16765a(str, this.context.getString(R.string.ehr, new Object[]{Integer.valueOf(i)}), i, false, this.f15856o);
                    this.f15849g.f15184e = this.f15862w;
                    try {
                        this.f15849g.show(a.getSupportFragmentManager(), f15840h);
                    } catch (IllegalStateException unused) {
                        this.f15849g = null;
                    }
                }
                return;
            }
            this.f15849g.mo13416a(str);
        }
    }

    /* renamed from: a */
    public final void mo13742a(boolean z) {
        if (this.f15846d != null) {
            this.f15846d.mo13129d(z);
        }
    }

    /* renamed from: j */
    private void m17246j() {
        if (this.f15849g != null) {
            this.f15849g.mo13418b();
        }
    }

    /* renamed from: i */
    private boolean m17245i() {
        if (!this.f15856o || ((Integer) LiveSettingKeys.LIVE_OPTIMIZE_STYLE_V1.mo10240a()).intValue() <= 1) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo13060b() {
        if (isViewValid()) {
            for (C5798d dVar : this.f15854m) {
                if (dVar != null && dVar.getType() == 1) {
                    dVar.mo14295a();
                }
            }
            mo13744g();
        }
    }

    /* renamed from: c */
    public final int[] mo13063c() {
        return new int[]{C9738o.m28691a(this.context), C9738o.m28709b(this.context)};
    }

    public void onDestroy() {
        super.onDestroy();
        this.dataCenter.removeObserver(this);
        m17246j();
        this.f15843a.mo8963a();
        f15842t = 0;
        f15841s = 0;
        if (this.f15845c != null) {
            this.f15845c.dismiss();
        }
        m17234a(this.f15860u);
        m17234a(this.f15861v);
        if (this.f15856o) {
            m17247k();
        }
    }

    public void onPause() {
        super.onPause();
        boolean equals = Build.BRAND.equals("HUAWEI");
        if (!this.f15856o && equals) {
            if (this.f15858q) {
                this.f15858q = false;
            }
            ((ViewGroup) this.contentView).removeAllViews();
        }
    }

    /* renamed from: h */
    private void m17244h() {
        int i;
        if (isViewValid() && this.context != null && !this.f15857p) {
            int[] iArr = new int[2];
            this.contentView.getLocationInWindow(iArr);
            this.f15852k[0] = 0;
            int[] iArr2 = this.f15852k;
            int height = iArr[1] + this.contentView.getHeight();
            if (m17245i()) {
                i = R.dimen.o9;
            } else {
                i = R.dimen.o8;
            }
            iArr2[1] = height - C3358ac.m12526d(i);
            this.f15852k[2] = 0;
            this.f15852k[3] = C9738o.m28691a(this.context);
            this.f15853l = Arrays.copyOf(this.f15852k, this.f15852k.length);
            this.f15857p = true;
        }
    }

    /* renamed from: g */
    public final void mo13744g() {
        if (isViewValid() && this.f15856o && this.f15843a != null) {
            JSONArray jSONArray = new JSONArray();
            for (C5798d dVar : this.f15854m) {
                if (dVar != null) {
                    JSONObject decorationInfo = dVar.getDecorationInfo();
                    if (decorationInfo != null) {
                        jSONArray.put(decorationInfo);
                    }
                }
            }
            this.f15843a.mo13053b(jSONArray.toString());
            ArrayList arrayList = new ArrayList();
            for (C5798d dVar2 : this.f15854m) {
                if (dVar2 != null) {
                    arrayList.add(dVar2.getRoomDecoration());
                }
            }
            String b = C2317a.m9932a().mo15979b((Object) arrayList);
            C8946b.f24381aF.mo22118a(Long.valueOf(this.f15855n));
            C8946b.f24382aG.mo22118a(b);
        }
    }

    public void onResume() {
        super.onResume();
        boolean equals = Build.BRAND.equals("HUAWEI");
        if (!this.f15856o && equals && !this.f15858q && !C6307b.m19566a((Collection<T>) this.f15859r.getDecorationList())) {
            ArrayList arrayList = new ArrayList();
            for (C9379p pVar : this.f15859r.getDecorationList()) {
                arrayList.add(new C9379p(pVar));
            }
            mo13062b((List<C9379p>) arrayList);
        }
    }

    /* renamed from: k */
    private void m17247k() {
        String str;
        String str2;
        long j;
        if (this.f15851j) {
            str = "use";
        } else {
            str = "unused";
        }
        if (this.f15850i) {
            str2 = "use";
        } else {
            str2 = "unused";
        }
        if (this.f15859r != null) {
            j = this.f15859r.getId();
        } else {
            j = 0;
        }
        HashMap hashMap = new HashMap();
        if (!(this.f15859r == null || this.f15859r.getOwner() == null)) {
            hashMap.put("anchor_id", String.valueOf(this.f15859r.getOwner().getId()));
        }
        hashMap.put("room_id", String.valueOf(j));
        hashMap.put("use_status", str2);
        C8443c.m25663a().mo21606a("live_picture_prop_use", hashMap, new C8438j().mo21598a("live_take_detail").mo21603f("other").mo21599b("live_take"), new C8439k());
        hashMap.put("use_status", str);
        C8443c.m25663a().mo21606a("live_character_prop_use", hashMap, new C8438j().mo21598a("live_take_detail").mo21603f("other").mo21599b("live_take"), new C8439k());
    }

    /* renamed from: a */
    public final void mo13056a() {
        if (isViewValid()) {
            m17246j();
        }
    }

    public void onCreate() {
        super.onCreate();
        this.f15856o = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.f15859r = (Room) this.dataCenter.get("data_room");
        if (this.f15859r.getOwner() != null) {
            this.f15855n = this.f15859r.getOwner().getId();
        }
        C5029m mVar = new C5029m(this.f15859r.getId(), this.f15859r.getOwner().getId(), this.f15856o);
        this.f15843a = mVar;
        this.f15843a.mo9142a((C5032a) this);
        C5747j.m18104b().mo14165a(ToolbarButton.DECORATION, (C5739a) new C5413b());
        if (!this.f15856o && !C6307b.m19566a((Collection<T>) this.f15859r.getDecorationList())) {
            ArrayList arrayList = new ArrayList();
            for (C9379p pVar : this.f15859r.getDecorationList()) {
                arrayList.add(new C9379p(pVar));
            }
            mo13062b((List<C9379p>) arrayList);
            this.f15858q = true;
        }
        C9097a.m27146a().mo22266a(C4417ai.class).mo19293a((C7497x<? super T, ? extends R>) getAutoUnbindTransformer()).mo19325f((C7326g<? super T>) new C7326g<C4417ai>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(C4417ai aiVar) throws Exception {
                DecorationWrapperWidget.this.onEvent(aiVar);
            }
        });
        this.dataCenter.observeForever("cmd_pk_state_change", this).observe("cmd_update_sticker_position", this, true);
    }

    /* renamed from: a */
    public final void mo13057a(C4883ap apVar) {
        this.f15848f = apVar;
    }

    /* renamed from: d */
    private void m17239d(C9379p pVar) {
        m17236b(pVar);
        m17240e(pVar);
    }

    /* renamed from: a */
    private static void m17234a(C7321c cVar) {
        if (cVar != null && !cVar.isDisposed()) {
            cVar.dispose();
        }
    }

    /* renamed from: b */
    public final void mo13062b(List<C9379p> list) {
        this.contentView.post(new C5581af(this, list));
    }

    /* renamed from: a */
    private FragmentActivity m17231a(Context context) {
        while (!(context instanceof FragmentActivity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (FragmentActivity) context;
    }

    /* renamed from: b */
    private void m17235b(C4426ar arVar) {
        if (isViewValid() && this.context != null) {
            this.contentView.post(new C5580ae(this, arVar));
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.bytedance.android.livesdkapi.depend.model.live.p>, for r2v0, types: [java.util.List, java.util.List<com.bytedance.android.livesdkapi.depend.model.live.p>] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo13743c(java.util.List<com.bytedance.android.livesdkapi.depend.model.live.C9379p> r2) {
        /*
            r1 = this;
            java.util.Iterator r2 = r2.iterator()
        L_0x0004:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0017
            java.lang.Object r0 = r2.next()
            com.bytedance.android.livesdkapi.depend.model.live.p r0 = (com.bytedance.android.livesdkapi.depend.model.live.C9379p) r0
            r1.m17236b(r0)
            r1.m17240e(r0)
            goto L_0x0004
        L_0x0017:
            r1.mo13744g()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget.mo13743c(java.util.List):void");
    }

    public void onEvent(C4417ai aiVar) {
        if (isViewValid() && aiVar != null && aiVar.f12838a != null) {
            m17239d(aiVar.f12838a);
        }
    }

    /* renamed from: a */
    private void m17232a(C4448r rVar) {
        if (rVar.f12904a == 0) {
            this.f15852k[1] = LinkCrossRoomWidget.m17464j() + LinkCrossRoomWidget.m17466l();
        } else if (rVar.f12904a == 1) {
            this.f15852k = this.f15853l;
        } else {
            return;
        }
        for (C5798d a : this.f15854m) {
            a.mo14296a(this.f15852k);
        }
    }

    /* renamed from: f */
    private void m17242f(C9379p pVar) {
        C7321c cVar;
        boolean z = true;
        if (pVar.f25752g != 1) {
            z = false;
        }
        if (z) {
            cVar = this.f15860u;
        } else {
            cVar = this.f15861v;
        }
        m17234a(cVar);
        C7321c f = C7492s.m23295b(30, TimeUnit.SECONDS).mo19304b(C47549a.m148327a()).mo19325f((C7326g<? super T>) new C5582ag<Object>(this, pVar));
        if (z) {
            this.f15860u = f;
        } else {
            this.f15861v = f;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (isViewValid() && kVData != null && !TextUtils.isEmpty(kVData.getKey()) && kVData.getData() != null) {
            String key = kVData.getKey();
            char c = 65535;
            int hashCode = key.hashCode();
            if (hashCode != -1540323875) {
                if (hashCode == 421233308 && key.equals("cmd_update_sticker_position")) {
                    c = 1;
                }
            } else if (key.equals("cmd_pk_state_change")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    m17232a((C4448r) kVData.getData());
                    return;
                case 1:
                    if (this.f15856o) {
                        m17235b((C4426ar) kVData.getData());
                        break;
                    }
                    break;
            }
        }
    }

    /* renamed from: b */
    private void m17236b(C9379p pVar) {
        if (isViewValid() && pVar != null) {
            m17237c(pVar);
            m17244h();
            C5798d dVar = new C5798d(this.context, pVar, this.f15856o, this.f15852k, this, (ViewGroup) this.contentView);
            if (pVar.f25752g == 1 && this.f15843a != null) {
                dVar.setText(this.f15843a.mo13048a(pVar));
                this.f15844b = pVar.f25749d;
            }
            this.f15854m.add(dVar);
            ((ViewGroup) this.contentView).addView(dVar);
            if (this.f15856o) {
                if (1 == pVar.f25752g) {
                    f15841s = pVar.f25753h;
                    return;
                }
                if (2 == pVar.f25752g) {
                    f15842t = pVar.f25753h;
                }
            }
        }
    }

    /* renamed from: c */
    private void m17237c(C9379p pVar) {
        if (isViewValid()) {
            Iterator it = this.f15854m.iterator();
            while (it.hasNext()) {
                C5798d dVar = (C5798d) it.next();
                if (dVar != null && dVar.getType() == pVar.f25752g) {
                    ((ViewGroup) this.contentView).removeView(dVar);
                    it.remove();
                }
            }
            if (this.f15856o) {
                if (1 == pVar.f25752g) {
                    f15841s = 0;
                    return;
                }
                if (2 == pVar.f25752g) {
                    f15842t = 0;
                }
            }
        }
    }

    /* renamed from: e */
    private void m17240e(C9379p pVar) {
        boolean z;
        long j;
        String str;
        if (this.f15856o) {
            if (pVar.f25752g == 1) {
                z = true;
            } else {
                z = false;
            }
            if (this.f15859r != null) {
                j = this.f15859r.getId();
            } else {
                j = 0;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("room_id", String.valueOf(j));
            hashMap.put("prop_id", String.valueOf(pVar.f25753h));
            if (z) {
                hashMap.put("words", pVar.f25749d);
            }
            C8443c a = C8443c.m25663a();
            if (z) {
                str = "live_character_prop_show";
            } else {
                str = "live_picture_prop_show";
            }
            a.mo21606a(str, hashMap, new C8438j().mo21598a("live_take_detail").mo21603f("other").mo21599b("live_take"), new C8439k());
            m17242f(pVar);
        }
    }

    /* renamed from: g */
    private void m17243g(C9379p pVar) {
        boolean z;
        long j;
        String str;
        if (pVar != null) {
            if (pVar.f25752g == 1) {
                z = true;
            } else {
                z = false;
            }
            if (this.f15859r != null) {
                j = this.f15859r.getId();
            } else {
                j = 0;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("room_id", String.valueOf(j));
            hashMap.put("prop_id", String.valueOf(pVar.f25753h));
            if (z) {
                hashMap.put("words", pVar.f25749d);
            }
            if (!(this.f15859r == null || this.f15859r.getOwner() == null)) {
                hashMap.put("anchor_id", String.valueOf(this.f15859r.getOwner().getId()));
            }
            C8443c a = C8443c.m25663a();
            if (z) {
                str = "live_character_prop_effective_use";
            } else {
                str = "live_picture_prop_effective_use";
            }
            a.mo21606a(str, hashMap, new C8438j().mo21598a("live_take_detail").mo21603f("other").mo21599b("live_take"), new C8439k());
            if (z) {
                this.f15851j = true;
                return;
            }
            this.f15850i = true;
        }
    }

    /* renamed from: b */
    public final void mo13061b(String str) {
        if (isViewValid()) {
            for (C5798d dVar : this.f15854m) {
                if (dVar != null && dVar.getType() == 1) {
                    dVar.setText(str);
                }
            }
            mo13744g();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13738a(C4426ar arVar) {
        this.f15852k[1] = C9738o.m28709b(this.context) - arVar.f12859a;
        for (C5798d a : this.f15854m) {
            a.mo14296a(this.f15852k);
        }
    }

    /* renamed from: a */
    public final void mo13739a(C9379p pVar) {
        C7321c cVar;
        if (isViewValid() && pVar != null) {
            boolean z = true;
            if (pVar.f25752g != 1) {
                z = false;
            }
            if (z) {
                cVar = this.f15860u;
            } else {
                cVar = this.f15861v;
            }
            m17234a(cVar);
            m17237c(pVar);
        }
    }

    /* renamed from: a */
    public final void mo13058a(String str) {
        if (isViewValid()) {
            C3517a.m12962a(this.context, str);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13740a(C9379p pVar, Long l) throws Exception {
        m17243g(pVar);
    }
}
