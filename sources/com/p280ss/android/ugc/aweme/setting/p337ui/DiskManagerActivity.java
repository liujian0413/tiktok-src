package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.dialog.C11029b.C11030a;
import com.bytedance.storage.C12918a;
import com.bytedance.storage.C12920c;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p280ss.android.ugc.aweme.base.p1062f.C23336d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.draft.C27303b;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.video.IAVPublishService;
import com.p280ss.android.ugc.aweme.setting.p337ui.widget.StorageCleanLoadingDialog;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7595j;
import org.json.JSONObject;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.DiskManagerActivity */
public final class DiskManagerActivity extends AmeBaseActivity implements OnClickListener {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f98396a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(DiskManagerActivity.class), "itemCleanDraft", "getItemCleanDraft()Lcom/bytedance/ies/dmt/ui/common/views/CommonItemView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(DiskManagerActivity.class), "itemCleanTemp", "getItemCleanTemp()Lcom/bytedance/ies/dmt/ui/common/views/CommonItemView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(DiskManagerActivity.class), "itemCleanResource", "getItemCleanResource()Lcom/bytedance/ies/dmt/ui/common/views/CommonItemView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(DiskManagerActivity.class), "drafDivider", "getDrafDivider()Lcom/ss/android/ugc/aweme/setting/ui/Divider;"))};

    /* renamed from: b */
    public static final C7541d f98397b = C7546e.m23568a(LazyThreadSafetyMode.NONE, C37755b.f98406a);

    /* renamed from: c */
    public static final C37754a f98398c = new C37754a(null);

    /* renamed from: d */
    private final C7541d f98399d = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C37757d(this));

    /* renamed from: e */
    private final C7541d f98400e = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C37759f(this));

    /* renamed from: q */
    private final C7541d f98401q = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C37758e(this));

    /* renamed from: r */
    private final C7541d f98402r = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C37756c(this));

    /* renamed from: s */
    private StorageCleanLoadingDialog f98403s;

    /* renamed from: t */
    private HashMap f98404t;

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.DiskManagerActivity$a */
    public static final class C37754a {

        /* renamed from: a */
        static final /* synthetic */ C7595j[] f98405a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C37754a.class), "DISK_MANAGER_PREFERENCES", "getDISK_MANAGER_PREFERENCES()Lcom/ss/android/ugc/aweme/setting/ui/DiskManagerPreferences;"))};

        private C37754a() {
        }

        /* renamed from: e */
        private static C37918h m120742e() {
            return (C37918h) DiskManagerActivity.f98397b.getValue();
        }

        /* renamed from: c */
        public final void mo95147c() {
            m120742e().mo60396b(true);
        }

        /* renamed from: f */
        private static long m120743f() {
            Long l;
            try {
                IESSettingsProxy a = C30199h.m98861a();
                C7573i.m23582a((Object) a, "SettingsReader.get()");
                l = a.getShowStorageTipSize();
                C7573i.m23582a((Object) l, "SettingsReader.get().showStorageTipSize");
            } catch (Exception unused) {
                l = Long.valueOf(314572800);
            }
            return l.longValue();
        }

        /* renamed from: g */
        private static long m120744g() {
            Long l;
            try {
                IESSettingsProxy a = C30199h.m98861a();
                C7573i.m23582a((Object) a, "SettingsReader.get()");
                l = a.getShowStorageDotSize();
                C7573i.m23582a((Object) l, "SettingsReader.get().showStorageDotSize");
            } catch (Exception unused) {
                l = Long.valueOf(1073741824);
            }
            return l.longValue();
        }

        /* renamed from: b */
        public final boolean mo95146b() {
            if (m120742e().mo60394a(false) || m120745h() < m120743f()) {
                return false;
            }
            return true;
        }

        /* renamed from: d */
        public final void mo95148d() {
            m120742e().mo60395b(System.currentTimeMillis());
            if (!m120742e().mo60397c(false)) {
                m120742e().mo60398d(true);
            }
        }

        /* renamed from: a */
        public final boolean mo95145a() {
            long h = m120745h();
            if (!m120742e().mo60397c(false)) {
                return true;
            }
            if (h < m120744g()) {
                return false;
            }
            if (System.currentTimeMillis() - m120742e().mo60393a(0) >= 2592000000L) {
                return true;
            }
            return false;
        }

        /* renamed from: h */
        private static long m120745h() {
            List b = C12920c.m37612b();
            if (b == null) {
                return 0;
            }
            Iterable<C12918a> iterable = b;
            Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
            for (C12918a aVar : iterable) {
                C7573i.m23582a((Object) aVar, "it");
                arrayList.add(Long.valueOf(aVar.mo31402d()));
            }
            return C7525m.m23528r((List) arrayList);
        }

        public /* synthetic */ C37754a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.DiskManagerActivity$b */
    static final class C37755b extends Lambda implements C7561a<C37918h> {

        /* renamed from: a */
        public static final C37755b f98406a = new C37755b();

        C37755b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m120750a();
        }

        /* renamed from: a */
        private static C37918h m120750a() {
            return (C37918h) C23336d.m76560a(AwemeApplication.m21341a(), C37918h.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.DiskManagerActivity$c */
    static final class C37756c extends Lambda implements C7561a<Divider> {

        /* renamed from: a */
        final /* synthetic */ DiskManagerActivity f98407a;

        C37756c(DiskManagerActivity diskManagerActivity) {
            this.f98407a = diskManagerActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Divider invoke() {
            return (Divider) this.f98407a.mo95139a((int) R.id.ef5);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.DiskManagerActivity$d */
    static final class C37757d extends Lambda implements C7561a<CommonItemView> {

        /* renamed from: a */
        final /* synthetic */ DiskManagerActivity f98408a;

        C37757d(DiskManagerActivity diskManagerActivity) {
            this.f98408a = diskManagerActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public CommonItemView invoke() {
            return (CommonItemView) this.f98408a.mo95139a((int) R.id.w9);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.DiskManagerActivity$e */
    static final class C37758e extends Lambda implements C7561a<CommonItemView> {

        /* renamed from: a */
        final /* synthetic */ DiskManagerActivity f98409a;

        C37758e(DiskManagerActivity diskManagerActivity) {
            this.f98409a = diskManagerActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public CommonItemView invoke() {
            return (CommonItemView) this.f98409a.mo95139a((int) R.id.w_);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.DiskManagerActivity$f */
    static final class C37759f extends Lambda implements C7561a<CommonItemView> {

        /* renamed from: a */
        final /* synthetic */ DiskManagerActivity f98410a;

        C37759f(DiskManagerActivity diskManagerActivity) {
            this.f98410a = diskManagerActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public CommonItemView invoke() {
            return (CommonItemView) this.f98410a.mo95139a((int) R.id.wa);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.DiskManagerActivity$g */
    static final class C37760g extends Lambda implements C7563m<Object, Object, C7581n> {

        /* renamed from: a */
        final /* synthetic */ DiskManagerActivity f98411a;

        C37760g(DiskManagerActivity diskManagerActivity) {
            this.f98411a = diskManagerActivity;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m120755a(obj, obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m120755a(Object obj, Object obj2) {
            C7573i.m23587b(obj, "<anonymous parameter 0>");
            C7573i.m23587b(obj2, "<anonymous parameter 1>");
            this.f98411a.mo95141i();
            C7492s.m23301b("").mo19304b(C7333a.m23044b()).mo19317d((C7327h<? super T, ? extends R>) C377611.f98412a).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C7326g<String>(this) {

                /* renamed from: a */
                final /* synthetic */ C37760g f98413a;

                {
                    this.f98413a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void accept(String str) {
                    this.f98413a.f98411a.mo95142j();
                    CommonItemView c = this.f98413a.f98411a.mo58711c();
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f98413a.f98411a.getString(R.string.dqm));
                    sb.append(": 0.0MB");
                    c.setLeftText(sb.toString());
                }
            }, (C7326g<? super Throwable>) new C7326g<Throwable>(this) {

                /* renamed from: a */
                final /* synthetic */ C37760g f98414a;

                {
                    this.f98414a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void accept(Throwable th) {
                    this.f98414a.f98411a.mo95142j();
                    CommonItemView c = this.f98414a.f98411a.mo58711c();
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f98414a.f98411a.getString(R.string.dqm));
                    sb.append(": 0.0MB");
                    c.setLeftText(sb.toString());
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.DiskManagerActivity$h */
    static final class C37764h extends Lambda implements C7563m<Object, Object, C7581n> {

        /* renamed from: a */
        final /* synthetic */ DiskManagerActivity f98415a;

        C37764h(DiskManagerActivity diskManagerActivity) {
            this.f98415a = diskManagerActivity;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m120759a(obj, obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m120759a(Object obj, Object obj2) {
            C7573i.m23587b(obj, "<anonymous parameter 0>");
            C7573i.m23587b(obj2, "<anonymous parameter 1>");
            this.f98415a.mo95141i();
            C7492s.m23301b("").mo19304b(C7333a.m23044b()).mo19317d((C7327h<? super T, ? extends R>) C377651.f98416a).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C7326g<String>(this) {

                /* renamed from: a */
                final /* synthetic */ C37764h f98417a;

                {
                    this.f98417a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void accept(String str) {
                    this.f98417a.f98415a.mo95142j();
                    CommonItemView d = this.f98417a.f98415a.mo59893d();
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f98417a.f98415a.getString(R.string.dqa));
                    sb.append(": 0.0MB");
                    d.setLeftText(sb.toString());
                }
            }, (C7326g<? super Throwable>) new C7326g<Throwable>(this) {

                /* renamed from: a */
                final /* synthetic */ C37764h f98418a;

                {
                    this.f98418a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void accept(Throwable th) {
                    this.f98418a.f98415a.mo95142j();
                    CommonItemView d = this.f98418a.f98415a.mo59893d();
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f98418a.f98415a.getString(R.string.dqa));
                    sb.append(": 0.0MB");
                    d.setLeftText(sb.toString());
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.DiskManagerActivity$i */
    public static final class C37768i implements C10797a {

        /* renamed from: a */
        final /* synthetic */ DiskManagerActivity f98419a;

        /* renamed from: b */
        public final void mo25896b(View view) {
            C7573i.m23587b(view, "view");
        }

        C37768i(DiskManagerActivity diskManagerActivity) {
            this.f98419a = diskManagerActivity;
        }

        /* renamed from: a */
        public final void mo25895a(View view) {
            C7573i.m23587b(view, "view");
            this.f98419a.exit(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.DiskManagerActivity$j */
    static final /* synthetic */ class C37769j extends FunctionReference implements C7562b<View, C7581n> {
        C37769j(DiskManagerActivity diskManagerActivity) {
            super(1, diskManagerActivity);
        }

        public final String getName() {
            return "onClick";
        }

        public final C7585d getOwner() {
            return C7575l.m23595a(DiskManagerActivity.class);
        }

        public final String getSignature() {
            return "onClick(Landroid/view/View;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m120765a((View) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m120765a(View view) {
            C7573i.m23587b(view, "p1");
            ((DiskManagerActivity) this.receiver).onClick(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.DiskManagerActivity$k */
    static final /* synthetic */ class C37770k extends FunctionReference implements C7562b<View, C7581n> {
        C37770k(DiskManagerActivity diskManagerActivity) {
            super(1, diskManagerActivity);
        }

        public final String getName() {
            return "onClick";
        }

        public final C7585d getOwner() {
            return C7575l.m23595a(DiskManagerActivity.class);
        }

        public final String getSignature() {
            return "onClick(Landroid/view/View;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m120766a((View) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m120766a(View view) {
            C7573i.m23587b(view, "p1");
            ((DiskManagerActivity) this.receiver).onClick(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.DiskManagerActivity$l */
    static final /* synthetic */ class C37771l extends FunctionReference implements C7562b<View, C7581n> {
        C37771l(DiskManagerActivity diskManagerActivity) {
            super(1, diskManagerActivity);
        }

        public final String getName() {
            return "onClick";
        }

        public final C7585d getOwner() {
            return C7575l.m23595a(DiskManagerActivity.class);
        }

        public final String getSignature() {
            return "onClick(Landroid/view/View;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m120767a((View) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m120767a(View view) {
            C7573i.m23587b(view, "p1");
            ((DiskManagerActivity) this.receiver).onClick(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.DiskManagerActivity$m */
    public static final class C37772m implements C27303b {

        /* renamed from: a */
        final /* synthetic */ String f98420a;

        C37772m(String str) {
            this.f98420a = str;
        }

        /* renamed from: a */
        public final boolean mo70115a(C27311c cVar) {
            C7573i.m23587b(cVar, "draft");
            return !C7573i.m23585a((Object) cVar.mo70221aj(), (Object) this.f98420a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.DiskManagerActivity$n */
    static final class C37773n<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        final /* synthetic */ DiskManagerActivity f98421a;

        /* renamed from: b */
        final /* synthetic */ String f98422b;

        C37773n(DiskManagerActivity diskManagerActivity, String str) {
            this.f98421a = diskManagerActivity;
            this.f98422b = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String apply(DiskManagerActivity diskManagerActivity) {
            Object obj;
            C7573i.m23587b(diskManagerActivity, "it");
            List b = C12920c.m37612b();
            Long l = null;
            if (b != null) {
                Iterable iterable = b;
                Collection arrayList = new ArrayList();
                for (Object next : iterable) {
                    C12918a aVar = (C12918a) next;
                    String str = this.f98422b;
                    if (aVar != null) {
                        obj = aVar.mo31399a();
                    } else {
                        obj = null;
                    }
                    if (C7573i.m23585a((Object) str, obj)) {
                        arrayList.add(next);
                    }
                }
                Iterable<C12918a> iterable2 = (List) arrayList;
                Collection arrayList2 = new ArrayList(C7525m.m23469a(iterable2, 10));
                for (C12918a aVar2 : iterable2) {
                    C7573i.m23582a((Object) aVar2, "it");
                    arrayList2.add(Long.valueOf(aVar2.mo31402d()));
                }
                l = Long.valueOf(C7525m.m23528r((List) arrayList2));
            }
            if (l == null) {
                return "0.0MB";
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("module", this.f98422b);
            jSONObject.put("size", l.longValue());
            C6893q.m21447a("disk_manager_module_size", jSONObject);
            return DiskManagerActivity.m120726a((double) l.longValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.DiskManagerActivity$o */
    static final class C37774o<T> implements C7326g<String> {

        /* renamed from: a */
        final /* synthetic */ CommonItemView f98423a;

        /* renamed from: b */
        final /* synthetic */ String f98424b;

        C37774o(CommonItemView commonItemView, String str) {
            this.f98423a = commonItemView;
            this.f98424b = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(String str) {
            CommonItemView commonItemView = this.f98423a;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f98424b);
            sb.append(": ");
            sb.append(str);
            commonItemView.setLeftText(sb.toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.DiskManagerActivity$p */
    static final class C37775p<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ CommonItemView f98425a;

        /* renamed from: b */
        final /* synthetic */ String f98426b;

        C37775p(CommonItemView commonItemView, String str) {
            this.f98425a = commonItemView;
            this.f98426b = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            CommonItemView commonItemView = this.f98425a;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f98426b);
            sb.append(": 0.0MB");
            commonItemView.setLeftText(sb.toString());
        }
    }

    /* renamed from: k */
    public static final boolean m120729k() {
        return f98398c.mo95145a();
    }

    /* renamed from: l */
    public static final void m120730l() {
        f98398c.mo95148d();
    }

    /* renamed from: m */
    private final CommonItemView m120731m() {
        return (CommonItemView) this.f98399d.getValue();
    }

    /* renamed from: n */
    private final Divider m120732n() {
        return (Divider) this.f98402r.getValue();
    }

    /* renamed from: a */
    public final int mo58708a() {
        return R.layout.bf;
    }

    /* renamed from: a */
    public final View mo95139a(int i) {
        if (this.f98404t == null) {
            this.f98404t = new HashMap();
        }
        View view = (View) this.f98404t.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f98404t.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: c */
    public final CommonItemView mo58711c() {
        return (CommonItemView) this.f98400e.getValue();
    }

    /* renamed from: d */
    public final CommonItemView mo59893d() {
        return (CommonItemView) this.f98401q.getValue();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DiskManagerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onBackPressed() {
        StorageCleanLoadingDialog storageCleanLoadingDialog = this.f98403s;
        if (storageCleanLoadingDialog == null || !storageCleanLoadingDialog.isShowing()) {
            super.onBackPressed();
        }
    }

    public final void onDestroy() {
        ImmersionBar.with((Activity) this).destroy();
        super.onDestroy();
    }

    /* renamed from: i */
    public final void mo95141i() {
        if (this.f98403s == null) {
            StorageCleanLoadingDialog storageCleanLoadingDialog = new StorageCleanLoadingDialog(this);
            storageCleanLoadingDialog.setCancelable(false);
            this.f98403s = storageCleanLoadingDialog;
        }
        StorageCleanLoadingDialog storageCleanLoadingDialog2 = this.f98403s;
        if (storageCleanLoadingDialog2 != null) {
            storageCleanLoadingDialog2.show();
        }
    }

    /* renamed from: j */
    public final void mo95142j() {
        StorageCleanLoadingDialog storageCleanLoadingDialog = this.f98403s;
        if (storageCleanLoadingDialog != null && storageCleanLoadingDialog.isShowing()) {
            StorageCleanLoadingDialog storageCleanLoadingDialog2 = this.f98403s;
            if (storageCleanLoadingDialog2 != null) {
                storageCleanLoadingDialog2.dismiss();
            }
        }
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DiskManagerActivity", "onResume", true);
        super.onResume();
        m120733o();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DiskManagerActivity", "onResume", false);
    }

    /* renamed from: q */
    private final void m120735q() {
        IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_disk_manage_mode", true);
        iAVService.draftService().enterDraftBoxWithArgs(this, bundle);
    }

    public final void setStatusBarColor() {
        if (C6399b.m19944t()) {
            ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) R.color.a03).init();
        } else {
            ImmersionBar.with((Activity) this).statusBarColor((int) R.color.a3z).init();
        }
    }

    /* renamed from: o */
    private final void m120733o() {
        int i;
        CommonItemView m = m120731m();
        C7573i.m23582a((Object) m, "itemCleanDraft");
        String string = getString(R.string.dqb);
        C7573i.m23582a((Object) string, "getString(R.string.setting_storage_mgmt_drafts)");
        m120728a("DRAFT", m, string);
        CommonItemView c = mo58711c();
        C7573i.m23582a((Object) c, "itemCleanTemp");
        String string2 = getString(R.string.dqm);
        C7573i.m23582a((Object) string2, "getString(R.string.setti…torage_mgmt_storage_temp)");
        m120728a("CACHE", c, string2);
        CommonItemView d = mo59893d();
        C7573i.m23582a((Object) d, "itemCleanResource");
        String string3 = getString(R.string.dqa);
        C7573i.m23582a((Object) string3, "getString(R.string.setting_storage_mgmt_downloads)");
        m120728a("RESOURCE", d, string3);
        int p = m120734p();
        CommonItemView m2 = m120731m();
        C7573i.m23582a((Object) m2, "itemCleanDraft");
        if (p <= 0) {
            i = 8;
        } else {
            i = 0;
        }
        m2.setVisibility(i);
        Divider n = m120732n();
        C7573i.m23582a((Object) n, "drafDivider");
        CommonItemView m3 = m120731m();
        C7573i.m23582a((Object) m3, "itemCleanDraft");
        n.setVisibility(m3.getVisibility());
    }

    /* renamed from: p */
    private static int m120734p() {
        IAVPublishService publishService = ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService();
        C7573i.m23582a((Object) publishService, "ServiceManager.get().get…ss.java).publishService()");
        String publishingDraftKey = publishService.getPublishingDraftKey();
        C7573i.m23582a((Object) publishingDraftKey, "ServiceManager.get().get…vice().publishingDraftKey");
        List queryListWithFilter = ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService().queryListWithFilter(new C37772m(publishingDraftKey));
        C7573i.m23582a((Object) queryListWithFilter, "ServiceManager.get().get…\n            }\n        })");
        return queryListWithFilter.size();
    }

    public final void exit(View view) {
        C7573i.m23587b(view, "view");
        finish();
    }

    /* renamed from: a */
    public static String m120726a(double d) {
        String a = C1642a.m8034a("%.1fMB", Arrays.copyOf(new Object[]{Double.valueOf(d / 1048576.0d)}, 1));
        C7573i.m23582a((Object) a, "java.lang.String.format(format, *args)");
        return a;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C7573i.m23587b(view, "view");
        int id = view.getId();
        if (id == R.id.w9) {
            m120735q();
        } else if (id == R.id.wa) {
            m120727a(R.string.dq_, new C37760g(this));
            C6907h.onEventV3("clean_temp_file");
        } else {
            if (id == R.id.w_) {
                m120727a(R.string.dq9, new C37764h(this));
                C6907h.onEventV3("clean_resource_file");
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int i2;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DiskManagerActivity", "onCreate", true);
        super.onCreate(bundle);
        Context context = this;
        int b = (int) C9738o.m28708b(context, 18.0f);
        int b2 = (int) C9738o.m28708b(context, 4.0f);
        CommonItemView c = mo58711c();
        C7573i.m23582a((Object) c, "itemCleanTemp");
        TextView tvwRight = c.getTvwRight();
        C7573i.m23582a((Object) tvwRight, "itemCleanTemp.tvwRight");
        tvwRight.setTextSize(12.0f);
        CommonItemView c2 = mo58711c();
        C7573i.m23582a((Object) c2, "itemCleanTemp");
        TextView tvwRight2 = c2.getTvwRight();
        if (C6399b.m19944t()) {
            i = getResources().getColor(R.color.a4z);
        } else {
            i = getResources().getColor(R.color.a53);
        }
        tvwRight2.setTextColor(i);
        CommonItemView c3 = mo58711c();
        C7573i.m23582a((Object) c3, "itemCleanTemp");
        c3.getTvwRight().setBackgroundResource(R.drawable.sg);
        CommonItemView c4 = mo58711c();
        C7573i.m23582a((Object) c4, "itemCleanTemp");
        c4.getTvwRight().setPadding(b, b2, b, b2);
        CommonItemView d = mo59893d();
        C7573i.m23582a((Object) d, "itemCleanResource");
        TextView tvwRight3 = d.getTvwRight();
        C7573i.m23582a((Object) tvwRight3, "itemCleanResource.tvwRight");
        tvwRight3.setTextSize(12.0f);
        CommonItemView d2 = mo59893d();
        C7573i.m23582a((Object) d2, "itemCleanResource");
        TextView tvwRight4 = d2.getTvwRight();
        if (C6399b.m19944t()) {
            i2 = getResources().getColor(R.color.a4z);
        } else {
            i2 = getResources().getColor(R.color.a53);
        }
        tvwRight4.setTextColor(i2);
        CommonItemView d3 = mo59893d();
        C7573i.m23582a((Object) d3, "itemCleanResource");
        d3.getTvwRight().setBackgroundResource(R.drawable.sg);
        CommonItemView d4 = mo59893d();
        C7573i.m23582a((Object) d4, "itemCleanResource");
        d4.getTvwRight().setPadding(b, b2, b, b2);
        ((TextTitleBar) findViewById(R.id.djz)).setOnTitleBarClickListener(new C37768i(this));
        DiskManagerActivity diskManagerActivity = this;
        findViewById(R.id.w9).setOnClickListener(new C37917g(new C37769j(diskManagerActivity)));
        findViewById(R.id.wa).setOnClickListener(new C37917g(new C37770k(diskManagerActivity)));
        findViewById(R.id.w_).setOnClickListener(new C37917g(new C37771l(diskManagerActivity)));
        CommonItemView m = m120731m();
        StringBuilder sb = new StringBuilder();
        sb.append(getString(R.string.dqb));
        sb.append(": ...");
        m.setLeftText(sb.toString());
        CommonItemView c5 = mo58711c();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getString(R.string.dqm));
        sb2.append(": ...");
        c5.setLeftText(sb2.toString());
        CommonItemView d5 = mo59893d();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(getString(R.string.dqa));
        sb3.append(": ...");
        d5.setLeftText(sb3.toString());
        C6907h.onEventV3("enter_storage_management");
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DiskManagerActivity", "onCreate", false);
    }

    /* renamed from: a */
    private final void m120727a(int i, C7563m<Object, Object, C7581n> mVar) {
        try {
            new C11030a(this).mo26645b(i).mo26641a((CharSequence) getResources().getString(R.string.dq8), (DialogInterface.OnClickListener) new C37916f(mVar)).mo26648b((CharSequence) getResources().getString(R.string.w_), (DialogInterface.OnClickListener) null).mo26642a(true).mo26644a().show();
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private final void m120728a(String str, CommonItemView commonItemView, String str2) {
        C7492s.m23301b(this).mo19304b(C7333a.m23044b()).mo19317d((C7327h<? super T, ? extends R>) new C37773n<Object,Object>(this, str)).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C37774o<Object>(commonItemView, str2), (C7326g<? super Throwable>) new C37775p<Object>(commonItemView, str2));
    }
}
