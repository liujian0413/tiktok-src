package com.p280ss.android.ugc.trill.language;

import android.app.Dialog;
import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.i18n.language.C30477c;
import com.p280ss.android.ugc.aweme.i18n.language.p1303a.C30468e;
import com.p280ss.android.ugc.aweme.language.C7120e;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.trill.language.ChooseLanguageDialogAdapter */
public class ChooseLanguageDialogAdapter extends C1262a<ViewHolder> {

    /* renamed from: a */
    public Context f115679a;

    /* renamed from: b */
    public Dialog f115680b;

    /* renamed from: c */
    private List<C30477c> f115681c;

    /* renamed from: com.ss.android.ugc.trill.language.ChooseLanguageDialogAdapter$ViewHolder */
    static class ViewHolder extends C1293v {
        ImageView mChooseImg;
        TextView mLanguageLabel;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind((Object) this, view);
        }
    }

    /* renamed from: com.ss.android.ugc.trill.language.ChooseLanguageDialogAdapter$ViewHolder_ViewBinding */
    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ViewHolder f115684a;

        public void unbind() {
            ViewHolder viewHolder = this.f115684a;
            if (viewHolder != null) {
                this.f115684a = null;
                viewHolder.mLanguageLabel = null;
                viewHolder.mChooseImg = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f115684a = viewHolder;
            viewHolder.mLanguageLabel = (TextView) Utils.findRequiredViewAsType(view, R.id.bg0, "field 'mLanguageLabel'", TextView.class);
            viewHolder.mChooseImg = (ImageView) Utils.findRequiredViewAsType(view, R.id.vt, "field 'mChooseImg'", ImageView.class);
        }
    }

    public int getItemCount() {
        return this.f115681c.size();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(this.f115679a).inflate(R.layout.jv, viewGroup, false));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(ViewHolder viewHolder, final int i) {
        C30477c cVar = (C30477c) this.f115681c.get(i);
        viewHolder.mLanguageLabel.setText(cVar.mo80152a());
        if (cVar.f80071a) {
            viewHolder.mChooseImg.setVisibility(0);
        } else {
            viewHolder.mChooseImg.setVisibility(8);
        }
        viewHolder.itemView.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (TextUtils.equals(((C7120e) ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getI18nItems().get(i)).mo18536g(), ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getCurrentI18nItem(ChooseLanguageDialogAdapter.this.f115679a).mo18536g())) {
                    C45017a.m142010a(ChooseLanguageDialogAdapter.this.f115680b);
                    return;
                }
                C45017a.m142010a(ChooseLanguageDialogAdapter.this.f115680b);
                C6907h.onEvent(MobClick.obtain().setEventName("change_language").setLabelName("login_page").setJsonObject(new C6909j().mo16966a("language", ((C7120e) ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getI18nItems().get(i)).mo18536g()).mo16966a("change_from", ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getCurrentI18nItem(ChooseLanguageDialogAdapter.this.f115679a).mo18536g()).mo16967a()));
                C30468e.m99511a().mo80141a(((C7120e) ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getI18nItems().get(i)).mo18530a(), ((C7120e) ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getI18nItems().get(i)).mo18536g(), ChooseLanguageDialogAdapter.this.f115679a);
            }
        });
    }

    public ChooseLanguageDialogAdapter(Context context, List<C30477c> list, Dialog dialog) {
        this.f115679a = context;
        this.f115681c = list;
        this.f115680b = dialog;
    }
}
