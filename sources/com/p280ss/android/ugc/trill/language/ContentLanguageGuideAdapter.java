package com.p280ss.android.ugc.trill.language;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.controller.C13400c;
import com.facebook.drawee.controller.C13401d;
import com.facebook.imagepipeline.p720g.C13648f;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.p1142c.C25660c;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.ContentLanguageGuideSetting;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.trill.settings.ContentLangLimitSettings;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.trill.language.ContentLanguageGuideAdapter */
public final class ContentLanguageGuideAdapter extends C1262a<ContentLanguageGuideViewHolder> {

    /* renamed from: a */
    public C45035h f115692a;

    /* renamed from: b */
    public ArrayList<String> f115693b = new ArrayList<>();

    /* renamed from: c */
    private List<ContentLanguageGuideSetting> f115694c;

    /* renamed from: d */
    private final String f115695d;

    /* renamed from: com.ss.android.ugc.trill.language.ContentLanguageGuideAdapter$a */
    public static final class C45007a extends C25660c {

        /* renamed from: a */
        final /* synthetic */ ContentLanguageGuideAdapter f115696a;

        /* renamed from: b */
        final /* synthetic */ ContentLanguageGuideViewHolder f115697b;

        /* renamed from: c */
        final /* synthetic */ ContentLanguageGuideSetting f115698c;

        /* renamed from: b */
        public final Animator mo63223b(View view) {
            RelativeLayout relativeLayout;
            if (view != null) {
                relativeLayout = (RelativeLayout) view.findViewById(R.id.bib);
            } else {
                relativeLayout = null;
            }
            String str = "backgroundColor";
            int[] iArr = new int[2];
            iArr[0] = 0;
            if (view == null) {
                C7573i.m23580a();
            }
            Resources resources = view.getResources();
            if (resources == null) {
                C7573i.m23580a();
            }
            iArr[1] = resources.getColor(R.color.l1);
            ObjectAnimator ofArgb = ObjectAnimator.ofArgb(relativeLayout, str, iArr);
            C7573i.m23582a((Object) ofArgb, "animator");
            ofArgb.setDuration(150);
            return ofArgb;
        }

        /* renamed from: c */
        public final Animator mo63224c(View view) {
            RelativeLayout relativeLayout;
            if (view != null) {
                relativeLayout = (RelativeLayout) view.findViewById(R.id.bib);
            } else {
                relativeLayout = null;
            }
            String str = "backgroundColor";
            int[] iArr = new int[2];
            if (view == null) {
                C7573i.m23580a();
            }
            Resources resources = view.getResources();
            if (resources == null) {
                C7573i.m23580a();
            }
            iArr[0] = resources.getColor(R.color.l1);
            iArr[1] = 0;
            ObjectAnimator ofArgb = ObjectAnimator.ofArgb(relativeLayout, str, iArr);
            C7573i.m23582a((Object) ofArgb, "animator");
            ofArgb.setDuration(150);
            return ofArgb;
        }

        /* renamed from: a */
        public final void mo63222a(View view, MotionEvent motionEvent) {
            this.f115696a.mo107522a(this.f115697b, this.f115698c);
        }

        C45007a(ContentLanguageGuideAdapter contentLanguageGuideAdapter, ContentLanguageGuideViewHolder contentLanguageGuideViewHolder, ContentLanguageGuideSetting contentLanguageGuideSetting) {
            this.f115696a = contentLanguageGuideAdapter;
            this.f115697b = contentLanguageGuideViewHolder;
            this.f115698c = contentLanguageGuideSetting;
        }
    }

    /* renamed from: com.ss.android.ugc.trill.language.ContentLanguageGuideAdapter$b */
    static final class C45008b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ContentLanguageGuideAdapter f115699a;

        /* renamed from: b */
        final /* synthetic */ ContentLanguageGuideViewHolder f115700b;

        /* renamed from: c */
        final /* synthetic */ ContentLanguageGuideSetting f115701c;

        C45008b(ContentLanguageGuideAdapter contentLanguageGuideAdapter, ContentLanguageGuideViewHolder contentLanguageGuideViewHolder, ContentLanguageGuideSetting contentLanguageGuideSetting) {
            this.f115699a = contentLanguageGuideAdapter;
            this.f115700b = contentLanguageGuideViewHolder;
            this.f115701c = contentLanguageGuideSetting;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f115699a.mo107522a(this.f115700b, this.f115701c);
        }
    }

    /* renamed from: com.ss.android.ugc.trill.language.ContentLanguageGuideAdapter$c */
    public static final class C45009c extends C13400c<C13648f> {

        /* renamed from: a */
        final /* synthetic */ ContentLanguageGuideAdapter f115702a;

        /* renamed from: b */
        final /* synthetic */ ContentLanguageGuideSetting f115703b;

        C45009c(ContentLanguageGuideAdapter contentLanguageGuideAdapter, ContentLanguageGuideSetting contentLanguageGuideSetting) {
            this.f115702a = contentLanguageGuideAdapter;
            this.f115703b = contentLanguageGuideSetting;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
            super.onFinalImageSet(str, fVar, animatable);
            try {
                this.f115702a.f115692a.mo107540b(this.f115703b.getCode());
            } catch (NullValueException unused) {
            }
        }
    }

    public final int getItemCount() {
        return this.f115694c.size();
    }

    public final /* synthetic */ C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m141992a(viewGroup, i);
    }

    /* renamed from: a */
    private static ContentLanguageGuideViewHolder m141992a(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.u8, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…age_guide, parent, false)");
        return new ContentLanguageGuideViewHolder(inflate);
    }

    public ContentLanguageGuideAdapter(String str, C45035h hVar) {
        C7573i.m23587b(str, "enterFrom");
        C7573i.m23587b(hVar, "itemListener");
        IESSettingsProxy a = C30199h.m98861a();
        C7573i.m23582a((Object) a, "SettingsReader.get()");
        List<ContentLanguageGuideSetting> contentLanguageGuideCodes = a.getContentLanguageGuideCodes();
        C7573i.m23582a((Object) contentLanguageGuideCodes, "SettingsReader.get().contentLanguageGuideCodes");
        this.f115694c = contentLanguageGuideCodes;
        this.f115692a = hVar;
        this.f115695d = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(ContentLanguageGuideViewHolder contentLanguageGuideViewHolder, int i) {
        C7573i.m23587b(contentLanguageGuideViewHolder, "viewHolder");
        ContentLanguageGuideSetting contentLanguageGuideSetting = (ContentLanguageGuideSetting) this.f115694c.get(i);
        try {
            contentLanguageGuideViewHolder.mo107524a().setText(contentLanguageGuideSetting.getLocalName());
            contentLanguageGuideViewHolder.mo107525b().setText(contentLanguageGuideSetting.getEnName());
            if (TextUtils.isEmpty(contentLanguageGuideSetting.getIcon())) {
                C23323e.m76503a(contentLanguageGuideViewHolder.mo107526c(), (int) R.drawable.a_j);
            } else {
                contentLanguageGuideViewHolder.mo107526c().setController(((C13382e) ((C13382e) ((C13382e) C13380c.m39166a().mo32729b(contentLanguageGuideViewHolder.mo107526c().getController())).mo32748b(ImageRequestBuilder.m40865a(Uri.parse(contentLanguageGuideSetting.getIcon())).mo33476b())).mo32743a((C13401d<? super INFO>) new C45009c<Object>(this, contentLanguageGuideSetting))).mo32730f());
            }
            if (VERSION.SDK_INT >= 21) {
                contentLanguageGuideViewHolder.itemView.setOnTouchListener(new C45007a(this, contentLanguageGuideViewHolder, contentLanguageGuideSetting));
            } else {
                contentLanguageGuideViewHolder.itemView.setOnClickListener(new C45008b(this, contentLanguageGuideViewHolder, contentLanguageGuideSetting));
            }
            contentLanguageGuideViewHolder.mo107528e().setTag(contentLanguageGuideSetting.getHighlightColor());
        } catch (NullValueException unused) {
        }
    }

    /* renamed from: a */
    public final void mo107522a(ContentLanguageGuideViewHolder contentLanguageGuideViewHolder, ContentLanguageGuideSetting contentLanguageGuideSetting) {
        try {
            if (this.f115693b.contains(contentLanguageGuideSetting.getCode()) || this.f115693b.size() < ContentLangLimitSettings.getContentLangLimitSetting()) {
                if (this.f115693b.contains(contentLanguageGuideSetting.getCode())) {
                    this.f115693b.remove(contentLanguageGuideSetting.getCode());
                    C6907h.m21524a("click_content_language_popup", (Map) C22984d.m75611a().mo59973a("enter_from", this.f115695d).mo59973a("language_type", contentLanguageGuideSetting.getCode()).mo59973a("click_type", "unchoose").f60753a);
                } else {
                    this.f115693b.add(contentLanguageGuideSetting.getCode());
                    C6907h.m21524a("click_content_language_popup", (Map) C22984d.m75611a().mo59973a("enter_from", this.f115695d).mo59973a("language_type", contentLanguageGuideSetting.getCode()).mo59973a("click_type", "choose").f60753a);
                }
                C45035h hVar = this.f115692a;
                String code = contentLanguageGuideSetting.getCode();
                C7573i.m23582a((Object) code, "item.code");
                hVar.mo107539a(code);
                contentLanguageGuideViewHolder.mo107529f();
                return;
            }
            View view = contentLanguageGuideViewHolder.itemView;
            C7573i.m23582a((Object) view, "viewHolder.itemView");
            Context context = view.getContext();
            View view2 = contentLanguageGuideViewHolder.itemView;
            C7573i.m23582a((Object) view2, "viewHolder.itemView");
            String string = view2.getContext().getString(R.string.bcv, new Object[]{String.valueOf(ContentLangLimitSettings.getContentLangLimitSetting())});
            View view3 = contentLanguageGuideViewHolder.itemView;
            C7573i.m23582a((Object) view3, "viewHolder.itemView");
            C10761a.m31406c(context, string, 1, 2, (int) C9738o.m28708b(view3.getContext(), 52.0f)).mo25750a();
        } catch (NullValueException unused) {
        }
    }
}
