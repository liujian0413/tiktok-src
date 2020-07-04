package com.p280ss.android.ugc.aweme.unlogin;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.base.utils.C23485m;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.main.TabChangeManager;
import com.p280ss.android.ugc.aweme.setting.p337ui.SettingNewVersionActivity;
import com.p280ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import com.p280ss.android.ugc.aweme.unlogin.UnloginSignUpFragment.C42753a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.unlogin.d */
public final class C42760d {

    /* renamed from: a */
    public static final C42760d f111092a = new C42760d();

    /* renamed from: com.ss.android.ugc.aweme.unlogin.d$a */
    static final class C42761a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C7561a f111093a;

        C42761a(C7561a aVar) {
            this.f111093a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f111093a.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.unlogin.d$b */
    static final class C42762b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C7561a f111094a;

        C42762b(C7561a aVar) {
            this.f111094a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f111094a.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.unlogin.d$c */
    static final class C42763c extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ SettingNewVersionActivity f111095a;

        /* renamed from: b */
        final /* synthetic */ HashSet f111096b;

        C42763c(SettingNewVersionActivity settingNewVersionActivity, HashSet hashSet) {
            this.f111095a = settingNewVersionActivity;
            this.f111096b = hashSet;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m135715a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m135715a() {
            C32656f.m105745a((Activity) this.f111095a, "settings_page", "click_setting", (C23305g) new C23305g(this) {

                /* renamed from: a */
                final /* synthetic */ C42763c f111097a;

                {
                    this.f111097a = r1;
                }

                /* renamed from: a */
                public final void mo58664a(Bundle bundle) {
                }

                /* renamed from: a */
                public final void mo58663a() {
                    View findViewById = this.f111097a.f111095a.findViewById(R.id.edm);
                    C7573i.m23582a((Object) findViewById, "activity.findViewById<View>(R.id.view_unlogin)");
                    findViewById.setVisibility(8);
                    if (!this.f111097a.f111096b.isEmpty()) {
                        Iterator it = this.f111097a.f111096b.iterator();
                        while (it.hasNext()) {
                            View view = (View) it.next();
                            C7573i.m23582a((Object) view, "view");
                            view.setVisibility(0);
                        }
                        this.f111097a.f111096b.clear();
                    }
                    C42961az.m136380a(new C42757b());
                    C23485m.m77117a(new Runnable(this) {

                        /* renamed from: a */
                        final /* synthetic */ C427641 f111098a;

                        {
                            this.f111098a = r1;
                        }

                        public final void run() {
                            if (!this.f111098a.f111097a.f111095a.isFinishing()) {
                                this.f111098a.f111097a.f111095a.finish();
                            }
                        }
                    }, 500);
                }
            });
            C42753a.m135697a("settings_page", "click_setting");
        }
    }

    private C42760d() {
    }

    /* renamed from: a */
    public static List<String> m135709a() {
        return C42758c.f111089b.mo104368a();
    }

    /* renamed from: a */
    public static void m135710a(ContentLanguage contentLanguage) {
        C7573i.m23587b(contentLanguage, "language");
        C42758c.f111089b.mo104369a(contentLanguage);
    }

    /* renamed from: a */
    public static void m135712a(String str) {
        C7573i.m23587b(str, "code");
        C42758c.f111089b.mo104370a(str);
    }

    /* renamed from: b */
    private static String m135713b(String str) {
        C7573i.m23587b(str, "name");
        int hashCode = str.hashCode();
        if (hashCode != -1672998758) {
            if (hashCode != -1382453013) {
                if (hashCode != 2614219) {
                    if (hashCode == 53655674 && str.equals("UNLOGIN_NOTIFICATION")) {
                        return "NOTIFICATION";
                    }
                } else if (str.equals("USER")) {
                    return "UNLOGIN_PROFILE";
                }
            } else if (str.equals("NOTIFICATION")) {
                return "UNLOGIN_NOTIFICATION";
            }
        } else if (str.equals("UNLOGIN_PROFILE")) {
            return "USER";
        }
        return str;
    }

    /* renamed from: a */
    public final String mo104372a(TabChangeManager tabChangeManager, String str) {
        C7573i.m23587b(tabChangeManager, "tabChangeManager");
        C7573i.m23587b(str, "tag");
        String b = m135713b(str);
        if (tabChangeManager.mo84577b(b) == null) {
            Bundle bundle = new Bundle();
            bundle.putString("tab", b);
            tabChangeManager.mo84573a(UnloginSignUpFragment.class, b, bundle);
        }
        return b;
    }

    /* renamed from: a */
    public static void m135711a(SettingNewVersionActivity settingNewVersionActivity, HashSet<View> hashSet) {
        C7573i.m23587b(settingNewVersionActivity, "activity");
        C7573i.m23587b(hashSet, "unloginGoneView");
        C7561a cVar = new C42763c(settingNewVersionActivity, hashSet);
        View findViewById = settingNewVersionActivity.findViewById(R.id.edm);
        View findViewById2 = settingNewVersionActivity.findViewById(R.id.rn);
        C7573i.m23582a((Object) findViewById, "viewSignin");
        findViewById.setVisibility(0);
        findViewById.setOnClickListener(new C42761a(cVar));
        findViewById2.setOnClickListener(new C42762b(cVar));
        View[] d = settingNewVersionActivity.mo59893d();
        C7573i.m23582a((Object) d, "views");
        for (int i = 0; i < 9; i++) {
            View view = d[i];
            C7573i.m23582a((Object) view, "view");
            if (view.getVisibility() != 8) {
                hashSet.add(view);
                view.setVisibility(8);
            }
        }
    }

    /* renamed from: a */
    public static C42756a m135708a(List<String> list, List<ContentLanguage> list2) {
        boolean z;
        if (C6307b.m19566a((Collection<T>) list) || C6307b.m19566a((Collection<T>) list2)) {
            return new C42756a(null, list2);
        }
        ArrayList arrayList = new ArrayList();
        if (list2 == null) {
            C7573i.m23580a();
        }
        Iterable iterable = list2;
        Collection arrayList2 = new ArrayList();
        for (Object next : iterable) {
            ContentLanguage contentLanguage = (ContentLanguage) next;
            if (list == null) {
                C7573i.m23580a();
            }
            Iterator it = list.iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                if (C7634n.m23717a(contentLanguage.getLanguageCode(), (String) it.next(), true)) {
                    ContentLanguage contentLanguage2 = new ContentLanguage();
                    contentLanguage2.setLanguageCode(contentLanguage.getLanguageCode());
                    contentLanguage2.setLocalName(contentLanguage.getLocalName());
                    contentLanguage2.setEnglishName(contentLanguage.getEnglishName());
                    arrayList.add(contentLanguage2);
                    z = false;
                    break;
                }
            }
            if (z) {
                arrayList2.add(next);
            }
        }
        return new C42756a(arrayList, (List) arrayList2);
    }
}
