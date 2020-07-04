package com.p280ss.android.ugc.aweme.i18n.language.initial;

import android.app.Dialog;
import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.p1062f.C23336d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.i18n.language.p1303a.C30468e;
import com.p280ss.android.ugc.aweme.language.C7120e;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.i18n.language.initial.InitialChooseLanguageDialogAdapter */
public class InitialChooseLanguageDialogAdapter extends C1262a<ViewHolder> {

    /* renamed from: a */
    private Context f80075a;

    /* renamed from: b */
    private List<C7120e> f80076b;

    /* renamed from: c */
    private Dialog f80077c;

    /* renamed from: com.ss.android.ugc.aweme.i18n.language.initial.InitialChooseLanguageDialogAdapter$ViewHolder */
    static class ViewHolder extends C1293v {
        TextView mLanguageLabel;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind((Object) this, view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.language.initial.InitialChooseLanguageDialogAdapter$ViewHolder_ViewBinding */
    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ViewHolder f80078a;

        public void unbind() {
            ViewHolder viewHolder = this.f80078a;
            if (viewHolder != null) {
                this.f80078a = null;
                viewHolder.mLanguageLabel = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f80078a = viewHolder;
            viewHolder.mLanguageLabel = (TextView) Utils.findRequiredViewAsType(view, R.id.bg0, "field 'mLanguageLabel'", TextView.class);
        }
    }

    public int getItemCount() {
        return this.f80076b.size();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(this.f80075a).inflate(R.layout.kg, viewGroup, false));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        C7120e eVar = (C7120e) this.f80076b.get(i);
        viewHolder.mLanguageLabel.setText(eVar.mo18535f());
        viewHolder.itemView.setOnClickListener(new C30481c(this, eVar));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo80156a(C7120e eVar, View view) {
        ((C30489i) C23336d.m76560a(this.f80075a, C30489i.class)).mo60442b(3);
        C6907h.m21524a("choose_language_popup", (Map) new C22984d().mo59973a("enter_from", "homepage_hot").mo59973a("language_type", eVar.mo18536g()).f60753a);
        if (TextUtils.equals(eVar.mo18536g(), ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getCurrentI18nItem(this.f80075a).mo18536g())) {
            C30482d.m99568a(this.f80077c);
            return;
        }
        C30482d.m99568a(this.f80077c);
        C30468e.m99511a().mo80141a(eVar.mo18530a(), eVar.mo18536g(), this.f80075a);
        C21115b.m71197a().updateLanguage(null, ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getAppLanguage(), 0);
    }

    public InitialChooseLanguageDialogAdapter(Context context, List<C7120e> list, Dialog dialog) {
        this.f80075a = context;
        this.f80076b = list;
        this.f80077c = dialog;
    }
}
