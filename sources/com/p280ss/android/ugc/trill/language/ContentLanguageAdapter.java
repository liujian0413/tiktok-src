package com.p280ss.android.ugc.trill.language;

import android.app.Activity;
import android.app.Dialog;
import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.C0069x;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.app.AppCompatActivity;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.i18n.C30538p;
import com.p280ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import com.p280ss.android.ugc.trill.language.C45032g.C45034a;
import com.p280ss.android.ugc.trill.language.viewmodel.ContentPreferenceViewModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.trill.language.ContentLanguageAdapter */
public class ContentLanguageAdapter extends C1262a<ViewHolder> implements C0043i, C45034a {

    /* renamed from: a */
    public ArrayList<ContentLanguage> f115686a = new ArrayList<>();

    /* renamed from: b */
    public ContentPreferenceViewModel f115687b;

    /* renamed from: c */
    C45032g f115688c;

    /* renamed from: d */
    private Activity f115689d;

    /* renamed from: com.ss.android.ugc.trill.language.ContentLanguageAdapter$ViewHolder */
    public static class ViewHolder extends C1293v {

        /* renamed from: a */
        CommonItemView f115691a;

        public ViewHolder(View view) {
            super(view);
            this.f115691a = (CommonItemView) view;
        }
    }

    /* renamed from: a */
    public final void mo107518a(Throwable th) {
    }

    public int getItemCount() {
        if (this.f115686a != null) {
            return this.f115686a.size();
        }
        return 0;
    }

    public Lifecycle getLifecycle() {
        if (this.f115689d instanceof C0043i) {
            return ((C0043i) this.f115689d).getLifecycle();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo107515a() {
        String str = "";
        for (int i = 0; i < ((ArrayList) this.f115687b.mo107572d().getValue()).size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(((ContentLanguage) ((ArrayList) this.f115687b.mo107572d().getValue()).get(i)).getLanguageCode());
            sb.append(",");
            str = sb.toString();
        }
        SharePrefCache.inst().getUserAddLanguages().mo59871a(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo107519a(ArrayList arrayList) {
        this.f115686a = arrayList;
        notifyDataSetChanged();
    }

    public ContentLanguageAdapter(Activity activity) {
        this.f115689d = activity;
        this.f115687b = (ContentPreferenceViewModel) C0069x.m159a((FragmentActivity) (AppCompatActivity) this.f115689d).mo147a(ContentPreferenceViewModel.class);
        this.f115687b.mo107572d().observe(this, new C45019b(this));
        this.f115688c = new C45032g();
        this.f115688c.f115742b = this;
        if (activity instanceof C0043i) {
            ((C0043i) activity).getLifecycle().mo55a(new C0042h() {
                @C0054q(mo125a = Event.ON_DESTROY)
                public void onDestroy() {
                    if (ContentLanguageAdapter.this.f115688c != null) {
                        ContentLanguageAdapter.this.f115688c.mo107553a();
                    }
                }

                @C0054q(mo125a = Event.ON_RESUME)
                public void onResume() {
                    if (ContentLanguageAdapter.this.f115687b != null) {
                        ContentLanguageAdapter.this.f115686a = (ArrayList) ContentLanguageAdapter.this.f115687b.mo107572d().getValue();
                        ContentLanguageAdapter.this.notifyDataSetChanged();
                    }
                }
            });
        }
    }

    public /* synthetic */ C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m141985a(viewGroup, i);
    }

    /* renamed from: a */
    private static ViewHolder m141985a(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.st, viewGroup, false));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        if (getItemCount() != 0 && C30538p.m99745a()) {
            ContentLanguage contentLanguage = (ContentLanguage) this.f115686a.get(i);
            if (contentLanguage.getLocalName() != null) {
                viewHolder.f115691a.setLeftText(contentLanguage.getLocalName());
                viewHolder.f115691a.setRightIconRes(R.drawable.a5r);
                viewHolder.f115691a.setOnClickListener(new C45020c(this, contentLanguage, i));
            }
        }
    }

    /* renamed from: a */
    private Dialog m141984a(ContentLanguage contentLanguage, int i) {
        if (contentLanguage == null) {
            return null;
        }
        C10741a aVar = new C10741a(this.f115689d);
        aVar.mo25660b(this.f115689d.getString(R.string.dec, new Object[]{contentLanguage.getLocalName()}));
        C45021d dVar = new C45021d(this, contentLanguage);
        aVar.mo25661b(this.f115689d.getString(R.string.w_), (OnClickListener) dVar);
        aVar.mo25654a(this.f115689d.getString(R.string.deb), (OnClickListener) dVar);
        Dialog a = aVar.mo25656a().mo25637a();
        a.setCancelable(false);
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo107516a(ContentLanguage contentLanguage, int i, View view) {
        m141984a(contentLanguage, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo107517a(ContentLanguage contentLanguage, DialogInterface dialogInterface, int i) {
        if (i == -2) {
            dialogInterface.dismiss();
            return;
        }
        if (i == -1) {
            this.f115686a.remove(contentLanguage);
            this.f115687b.mo107569b(contentLanguage);
            this.f115688c.mo107554a(contentLanguage, 0);
            notifyDataSetChanged();
            dialogInterface.dismiss();
        }
    }
}
