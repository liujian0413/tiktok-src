package com.p280ss.android.ugc.aweme.commercialize.anchor.adapter;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.support.constraint.ConstraintLayout;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType;
import com.p280ss.android.ugc.aweme.commercialize.anchor.C24522a;
import com.p280ss.android.ugc.aweme.commercialize.anchor.C24536e;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.miniapp.anchor.response.model.GameInfo;
import com.p280ss.android.ugc.aweme.services.publish.AnchorTransData;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C42996by;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.net.URLDecoder;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.adapter.SimpleAnchorViewHolder */
public class SimpleAnchorViewHolder extends C1293v {

    /* renamed from: a */
    public final ConstraintLayout f64735a;

    /* renamed from: b */
    public final C0043i f64736b;

    /* renamed from: c */
    private final RemoteImageView f64737c;

    /* renamed from: d */
    private final DmtTextView f64738d;

    /* renamed from: e */
    private final DmtTextView f64739e;

    /* renamed from: f */
    private final DmtTextView f64740f;

    /* renamed from: g */
    private final ImageView f64741g;

    /* renamed from: h */
    private final ImageView f64742h;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.adapter.SimpleAnchorViewHolder$a */
    static final class C24525a<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ SimpleAnchorViewHolder f64743a;

        /* renamed from: b */
        final /* synthetic */ C24536e f64744b;

        C24525a(SimpleAnchorViewHolder simpleAnchorViewHolder, C24536e eVar) {
            this.f64743a = simpleAnchorViewHolder;
            this.f64744b = eVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            float f;
            if (bool != null) {
                C7573i.m23582a((Object) bool, "it");
                boolean z = true;
                if (!bool.booleanValue() || !C7573i.m23585a((Object) (Boolean) this.f64744b.f64771l.getExtensionDataRepo().getI18nPrivacy().getValue(), (Object) Boolean.valueOf(true)) || !C7573i.m23585a((Object) (Boolean) this.f64744b.f64771l.getExtensionDataRepo().getI18nStarAtlasClosed().getValue(), (Object) Boolean.valueOf(true))) {
                    z = false;
                }
                ConstraintLayout constraintLayout = this.f64743a.f64735a;
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.34f;
                }
                constraintLayout.setAlpha(f);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.adapter.SimpleAnchorViewHolder$b */
    static final class C24526b<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ SimpleAnchorViewHolder f64745a;

        /* renamed from: b */
        final /* synthetic */ C24536e f64746b;

        C24526b(SimpleAnchorViewHolder simpleAnchorViewHolder, C24536e eVar) {
            this.f64745a = simpleAnchorViewHolder;
            this.f64746b = eVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            float f;
            if (bool != null) {
                C7573i.m23582a((Object) bool, "it");
                boolean z = true;
                if (!bool.booleanValue() || !C7573i.m23585a((Object) (Boolean) this.f64746b.f64771l.getExtensionDataRepo().getI18nPrivacy().getValue(), (Object) Boolean.valueOf(true)) || !C7573i.m23585a((Object) (Boolean) this.f64746b.f64771l.getExtensionDataRepo().getI18nStarAtlasClosed().getValue(), (Object) Boolean.valueOf(true))) {
                    z = false;
                }
                ConstraintLayout constraintLayout = this.f64745a.f64735a;
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.34f;
                }
                constraintLayout.setAlpha(f);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.adapter.SimpleAnchorViewHolder$c */
    static final class C24527c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C24536e f64747a;

        C24527c(C24536e eVar) {
            this.f64747a = eVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f64747a.f64760a == AnchorBusinessType.GAME.getTYPE()) {
                GameInfo gameInfo = (GameInfo) C42996by.m136484a(this.f64747a.f64766g, GameInfo.class);
                C7573i.m23582a((Object) gameInfo, "gameInfo");
                C6907h.m21524a("gc_label_game_add", (Map) C22984d.m75611a().mo59973a("params_for_special", "game_platform").mo59973a("target_app_id", "2210").mo59973a("game_name", this.f64747a.f64762c).mo59973a("game_id", gameInfo.getId()).mo59973a("position", "auto_page").f60753a);
            }
            int i = this.f64747a.f64760a;
            String str = this.f64747a.f64766g;
            if (str == null) {
                str = "";
            }
            String decode = URLDecoder.decode(str);
            C7573i.m23582a((Object) decode, "URLDecoder.decode(anchor…                   ?: \"\")");
            AnchorTransData anchorTransData = new AnchorTransData(i, decode, this.f64747a.f64762c, null, null, null, null, 120, null);
            C42961az.m136380a(new C24522a(anchorTransData));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.adapter.SimpleAnchorViewHolder$d */
    static final class C24528d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C24536e f64748a;

        C24528d(C24536e eVar) {
            this.f64748a = eVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f64748a.f64770k.invoke();
        }
    }

    /* renamed from: a */
    public final void mo64325a(C24536e eVar) {
        int i;
        int i2;
        C7573i.m23587b(eVar, "anchorItem");
        if (eVar.f64760a == AnchorBusinessType.ANCHOR_SHOP_LINK.getTYPE()) {
            eVar.f64771l.getExtensionDataRepo().getI18nPrivacy().observe(this.f64736b, new C24525a(this, eVar));
            eVar.f64771l.getExtensionDataRepo().getI18nStarAtlasClosed().observe(this.f64736b, new C24526b(this, eVar));
        }
        DmtTextView dmtTextView = this.f64740f;
        int i3 = 8;
        if (eVar.f64768i) {
            i = 0;
        } else {
            i = 8;
        }
        dmtTextView.setVisibility(i);
        this.f64740f.setText(R.string.h);
        ImageView imageView = this.f64742h;
        if (eVar.f64767h) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        ImageView imageView2 = this.f64741g;
        if (eVar.f64767h) {
            i3 = 0;
        }
        imageView2.setVisibility(i3);
        if (eVar.f64767h) {
            C6907h.m21524a("gc_label_page_show", (Map) C22984d.m75611a().mo59973a("params_for_special", "game_platform").mo59973a("target_app_id", "2210").mo59973a("position", "auto_page").f60753a);
            if (eVar.f64760a == AnchorBusinessType.GAME.getTYPE()) {
                GameInfo gameInfo = (GameInfo) C42996by.m136484a(eVar.f64766g, GameInfo.class);
                C7573i.m23582a((Object) gameInfo, "gameInfo");
                C6907h.m21524a("gc_label_game_show", (Map) C22984d.m75611a().mo59973a("params_for_special", "game_platform").mo59973a("target_app_id", "2210").mo59973a("game_name", eVar.f64762c).mo59973a("game_id", gameInfo.getId()).mo59973a("position", "auto_page").f60753a);
            }
        }
        this.f64741g.setOnClickListener(new C24527c(eVar));
        String str = eVar.f64765f;
        if (str != null) {
            this.f64739e.setText(str);
        }
        C23323e.m76524b(this.f64737c, eVar.f64761b);
        this.f64738d.setText(eVar.f64762c);
        this.itemView.setOnClickListener(new C24528d(eVar));
    }

    public SimpleAnchorViewHolder(View view, C0043i iVar) {
        C7573i.m23587b(view, "view");
        C7573i.m23587b(iVar, "lifecycleOwner");
        super(view);
        this.f64736b = iVar;
        View findViewById = this.itemView.findViewById(R.id.b5y);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.iv_anchor)");
        this.f64737c = (RemoteImageView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.dqj);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.tv_anchor)");
        this.f64738d = (DmtTextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.fz);
        C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.anchor_item_container)");
        this.f64735a = (ConstraintLayout) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.e2v);
        C7573i.m23582a((Object) findViewById4, "itemView.findViewById(R.id.tv_subtitle)");
        this.f64739e = (DmtTextView) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.la);
        C7573i.m23582a((Object) findViewById5, "itemView.findViewById(R.id.beta_anchor)");
        this.f64740f = (DmtTextView) findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.b5s);
        C7573i.m23582a((Object) findViewById6, "itemView.findViewById(R.id.iv_add)");
        this.f64741g = (ImageView) findViewById6;
        View findViewById7 = this.itemView.findViewById(R.id.b5w);
        C7573i.m23582a((Object) findViewById7, "itemView.findViewById(R.id.iv_ai_tag)");
        this.f64742h = (ImageView) findViewById7;
    }
}
