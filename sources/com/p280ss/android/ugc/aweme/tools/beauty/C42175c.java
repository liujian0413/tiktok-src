package com.p280ss.android.ugc.aweme.tools.beauty;

import com.p280ss.android.ugc.aweme.beauty.BeautyCategory;
import com.p280ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.shortvideo.C38511bc;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.p280ss.android.ugc.aweme.tools.beauty.manager.C42226h;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.c */
public final class C42175c {

    /* renamed from: a */
    public static final C42175c f109736a = new C42175c();

    private C42175c() {
    }

    /* renamed from: a */
    public final void mo103626a(AVETParameter aVETParameter) {
        C6907h.m21524a("click_beautify_entrance", (Map) m134163b(aVETParameter).f100112a);
    }

    /* renamed from: b */
    private static C38511bc m134163b(AVETParameter aVETParameter) {
        String str;
        String str2;
        String str3;
        C38511bc a = C38511bc.m123103a();
        String str4 = "creation_id";
        String str5 = null;
        if (aVETParameter != null) {
            str = aVETParameter.getCreationId();
        } else {
            str = null;
        }
        C38511bc a2 = a.mo96485a(str4, str);
        String str6 = "shoot_way";
        if (aVETParameter != null) {
            str2 = aVETParameter.getShootWay();
        } else {
            str2 = null;
        }
        C38511bc a3 = a2.mo96485a(str6, str2);
        String str7 = "content_source";
        if (aVETParameter != null) {
            str3 = aVETParameter.getContentSource();
        } else {
            str3 = null;
        }
        C38511bc a4 = a3.mo96485a(str7, str3);
        String str8 = "content_type";
        if (aVETParameter != null) {
            str5 = aVETParameter.getContentType();
        }
        C38511bc a5 = a4.mo96485a(str8, str5).mo96485a("enter_from", "video_shoot_page");
        C7573i.m23582a((Object) a5, "EventMapBuilder.newBuild…l.ENTER_FROM, ENTER_FROM)");
        return a5;
    }

    /* renamed from: a */
    public static void m134162a(ComposerBeauty composerBeauty, AVETParameter aVETParameter) {
        if (composerBeauty != null) {
            C6907h.m21524a("click_beautify_tab", (Map) f109736a.m134166d(composerBeauty, aVETParameter).f100112a);
        }
    }

    /* renamed from: a */
    public static void m134161a(BeautyCategory beautyCategory, AVETParameter aVETParameter) {
        if (beautyCategory != null) {
            C6907h.m21524a("click_beautify_category", (Map) m134163b(aVETParameter).mo96485a("beautify_category_id", beautyCategory.getCategoryResponse().f113500id).mo96485a("beautify_category_name", beautyCategory.getCategoryResponse().name).f100112a);
        }
    }

    /* renamed from: b */
    public static void m134164b(ComposerBeauty composerBeauty, AVETParameter aVETParameter) {
        if (composerBeauty != null) {
            C6907h.m21524a("select_beautify", (Map) f109736a.m134166d(composerBeauty, aVETParameter).mo96485a("beautify_value", String.valueOf(((float) composerBeauty.getProgressValue()) / 100.0f)).f100112a);
        }
    }

    /* renamed from: c */
    public static void m134165c(ComposerBeauty composerBeauty, AVETParameter aVETParameter) {
        if (composerBeauty != null) {
            C6907h.m21524a("reset_beautify", (Map) f109736a.m134166d(composerBeauty, aVETParameter).mo96485a("beautify_value", String.valueOf(composerBeauty.getProgressValue() / 100)).f100112a);
        }
    }

    /* renamed from: d */
    private final C38511bc m134166d(ComposerBeauty composerBeauty, AVETParameter aVETParameter) {
        C38511bc b = m134163b(aVETParameter);
        if (C42226h.m134342b(composerBeauty)) {
            b.mo96485a("beautify_name_parent", composerBeauty.getParentName()).mo96485a("beautify_id_parent", composerBeauty.getParentId()).mo96485a("beautify_name_child", composerBeauty.getEffect().getName()).mo96485a("beautify_id_child", composerBeauty.getEffect().getEffectId());
        } else {
            b.mo96485a("beautify_name_parent", composerBeauty.getEffect().getName()).mo96485a("beautify_id_parent", composerBeauty.getEffect().getEffectId());
        }
        return b;
    }
}
