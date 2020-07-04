package com.p280ss.android.ugc.aweme.shortvideo.sticker.p1600b;

import android.app.Activity;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.jedi.arch.JediViewModel;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.scene.C37299a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.gamora.editor.EditViewModel;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.b.c */
public final class C40480c extends C40474a {

    /* renamed from: g */
    public VideoPublishEditModel f105224g;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.b.c$a */
    static final class C40481a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C40480c f105225a;

        C40481a(C40480c cVar) {
            this.f105225a = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f105225a.mo100527b();
            C40485e eVar = this.f105225a.f105216e;
            if (eVar != null) {
                eVar.mo98456c();
            }
            this.f105225a.f105214c.mo98504a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.b.c$b */
    static final class C40482b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C40480c f105226a;

        C40482b(C40480c cVar) {
            this.f105226a = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f105226a.mo100527b();
            C40485e eVar = this.f105226a.f105216e;
            if (eVar != null) {
                eVar.mo98454a();
            }
            this.f105226a.f105214c.mo98504a(true);
        }
    }

    /* renamed from: h */
    private final boolean m129415h() {
        if (!C35563c.f93231M.mo93305a(Property.StudioStickerPinEnable) || this.f105224g == null) {
            return false;
        }
        VideoPublishEditModel videoPublishEditModel = this.f105224g;
        if (videoPublishEditModel == null || videoPublishEditModel.videoType != 7) {
            VideoPublishEditModel videoPublishEditModel2 = this.f105224g;
            if (videoPublishEditModel2 == null || videoPublishEditModel2.videoType != 8) {
                VideoPublishEditModel videoPublishEditModel3 = this.f105224g;
                if (videoPublishEditModel3 == null || videoPublishEditModel3.videoType != 9) {
                    Context context = this.f105215d.getContext();
                    C7573i.m23582a((Object) context, "contentView.context");
                    Activity a = C37299a.m119788a(context);
                    if (a != null) {
                        JediViewModel a2 = C36113b.m116288a((FragmentActivity) a).mo91871a(EditViewModel.class);
                        C7573i.m23582a((Object) a2, "JediViewModelProviders.o…ditViewModel::class.java)");
                        if (((EditViewModel) a2).mo106458s()) {
                            return false;
                        }
                        return true;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public final View mo100528c() {
        LinearLayout d = mo100529d();
        LinearLayout a = mo100523a(R.drawable.em, R.string.ak7);
        a.setOnClickListener(new C40481a(this));
        LinearLayout a2 = mo100523a(R.drawable.en, R.string.ajs);
        a2.setOnClickListener(new C40482b(this));
        if (m129415h()) {
            d.addView(a);
            d.addView(mo100530e());
        }
        d.addView(a2);
        return d;
    }

    public C40480c(View view, C40485e eVar) {
        C7573i.m23587b(view, "contentView");
        super(view, eVar);
    }
}
