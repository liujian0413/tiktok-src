package com.p280ss.android.ugc.aweme.i18n.language.initial;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Handler;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.view.KeyEvent;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.p1062f.C23336d;
import com.p280ss.android.ugc.aweme.base.p308ui.RecyclerItemDecoration;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.language.C7120e;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import com.p280ss.android.ugc.aweme.video.C43316v;
import com.p280ss.android.ugc.aweme.views.C43374j;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.i18n.language.initial.InitialChooseLanguageDialog */
public class InitialChooseLanguageDialog extends C43374j {

    /* renamed from: a */
    private Handler f80073a;

    /* renamed from: b */
    private boolean f80074b;
    RecyclerView mLanguageList;

    /* renamed from: a */
    static final /* synthetic */ boolean m99561a(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return i == 84;
    }

    /* renamed from: c */
    public final void mo73992c() {
        this.f112344h = (int) C9738o.m28708b(C6399b.m19921a(), 280.0f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo71375a() {
        if (isShowing()) {
            if (C43316v.m137450K().mo104916o()) {
                C43316v.m137450K().mo104948x();
                this.f80074b = true;
                return;
            }
            m99562b();
        }
    }

    public void dismiss() {
        super.dismiss();
        if (this.f80074b) {
            C43316v.m137450K().mo104946v();
            this.f80074b = false;
        }
    }

    /* renamed from: b */
    private void m99562b() {
        if (C43316v.m137450K().mo104916o()) {
            C43316v.m137450K().mo104948x();
            this.f80074b = true;
            return;
        }
        this.f80073a.postDelayed(new C30480b(this), 1000);
    }

    /* access modifiers changed from: 0000 */
    public void cancelClick() {
        ((C30489i) C23336d.m76560a(getContext(), C30489i.class)).mo60442b(3);
        C6907h.m21524a("choose_language_popup", (Map) new C22984d().mo59973a("enter_from", "homepage_hot").mo59973a("language_type", "cancel").f60753a);
        dismiss();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            m99562b();
        }
    }

    public InitialChooseLanguageDialog(Context context, String[] strArr) {
        super(context, (int) R.style.uu, false, true);
        setContentView(R.layout.kf);
        ButterKnife.bind((Dialog) this);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        setOnKeyListener(C30479a.f80083a);
        ArrayList arrayList = new ArrayList();
        Map localeMap = ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getLocaleMap();
        HashMap hashMap = new HashMap();
        for (C7120e eVar : localeMap.values()) {
            hashMap.put(eVar.mo18530a(), eVar);
        }
        for (String str : strArr) {
            C7120e eVar2 = (C7120e) hashMap.get(str);
            if (eVar2 != null) {
                arrayList.add(eVar2);
            }
        }
        this.mLanguageList.setLayoutManager(new WrapLinearLayoutManager(context));
        this.mLanguageList.mo5525a((C1272h) new RecyclerItemDecoration(1, C23486n.m77122a(0.5d), Color.parseColor("#20161823")));
        this.mLanguageList.setAdapter(new InitialChooseLanguageDialogAdapter(context, arrayList, this));
        this.f80073a = new Handler();
        C6907h.m21524a("show_language_popup", (Map) new C22984d().mo59973a("enter_from", "homepage_hot").f60753a);
    }
}
