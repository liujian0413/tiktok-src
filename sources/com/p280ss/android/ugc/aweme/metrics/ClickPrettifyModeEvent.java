package com.p280ss.android.ugc.aweme.metrics;

import com.p280ss.android.ugc.aweme.metrics.C33259d.C33260a;

/* renamed from: com.ss.android.ugc.aweme.metrics.ClickPrettifyModeEvent */
public final class ClickPrettifyModeEvent extends C33259d {

    /* renamed from: a */
    private ContentType f86462a;

    /* renamed from: b */
    private EnterFrom f86463b;

    /* renamed from: c */
    private FilterMode f86464c;

    /* renamed from: com.ss.android.ugc.aweme.metrics.ClickPrettifyModeEvent$ContentType */
    public enum ContentType {
        Video("video"),
        Photo("photo");
        
        String value;

        private ContentType(String str) {
            this.value = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.metrics.ClickPrettifyModeEvent$EnterFrom */
    public enum EnterFrom {
        ShootPage("shoot_page"),
        MidPage("mid_page");
        
        String value;

        private EnterFrom(String str) {
            this.value = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.metrics.ClickPrettifyModeEvent$FilterMode */
    public enum FilterMode {
        Filter("filter"),
        SmoothSkin("smooth_skin"),
        BiggerEye("bigger_eye"),
        BlackSkin("black_skin");
        
        String value;

        private FilterMode(String str) {
            this.value = str;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67592a() {
        mo85248a("content_type", this.f86462a.value, C33260a.f86770a);
        mo85248a("enter_from", this.f86463b.value, C33260a.f86770a);
        mo85248a("filter_mode", this.f86464c.value, C33260a.f86770a);
    }
}
