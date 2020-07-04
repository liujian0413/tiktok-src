package com.p280ss.android.ugc.aweme.experiment;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.p1062f.C23339g;
import com.p280ss.android.ugc.aweme.profile.C35738c;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.experiment.h */
public final class C27693h implements C35738c {

    /* renamed from: a */
    public static final C27693h f72988a = new C27693h();

    /* renamed from: b */
    private static final C23339g f72989b = new C23339g(C6399b.m19921a(), "change_username");

    private C27693h() {
    }

    /* renamed from: a */
    public final boolean mo71141a() {
        if (!C6399b.m19947w() || !C6384b.m19835a().mo15292a(TTChangeUsernameGuideExperiment.class, true, "change_username_guide", C6384b.m19835a().mo15295d().change_username_guide, false)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo71142b() {
        if (!C6399b.m19947w() || !C6384b.m19835a().mo15292a(TTNickNameToUsernameExperiment.class, true, "nickname_to_username_on_video_player", C6384b.m19835a().mo15295d().nickname_to_username_on_video_player, false)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final long m90844a(String str, long j) {
        C7573i.m23587b(str, "userId");
        C23339g gVar = f72989b;
        StringBuilder sb = new StringBuilder("last_time_show_change_username_bubble_");
        sb.append(str);
        return gVar.mo60621a(sb.toString(), 0);
    }

    /* renamed from: b */
    public static final void m90845b(String str, long j) {
        C7573i.m23587b(str, "userId");
        C23339g gVar = f72989b;
        StringBuilder sb = new StringBuilder("last_time_show_change_username_bubble_");
        sb.append(str);
        gVar.mo60630b(sb.toString(), j);
    }

    /* renamed from: c */
    public static final long m90846c(String str, long j) {
        C7573i.m23587b(str, "userId");
        C23339g gVar = f72989b;
        StringBuilder sb = new StringBuilder("last_time_show_publish_success_window_");
        sb.append(str);
        return gVar.mo60621a(sb.toString(), 0);
    }

    /* renamed from: d */
    public static final void m90847d(String str, long j) {
        C7573i.m23587b(str, "userId");
        C23339g gVar = f72989b;
        StringBuilder sb = new StringBuilder("last_time_show_publish_success_window_");
        sb.append(str);
        gVar.mo60630b(sb.toString(), j);
    }
}
