package com.p280ss.android.ugc.gamora.recorder;

import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.C12629j;
import com.bytedance.scene.group.C12604b;
import com.bytedance.scene.ktx.C12636a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.scene.C37299a;
import com.p280ss.android.ugc.aweme.shortvideo.C39382ed;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p280ss.android.ugc.aweme.tools.C42581q;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.speed.C44725a;
import com.p280ss.android.ugc.gamora.recorder.toolbar.RecordToolbarViewModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.gamora.recorder.af */
public final class C44452af {

    /* renamed from: a */
    private final C39382ed f114715a;

    /* renamed from: b */
    private final RecordToolbarViewModel f114716b;

    /* renamed from: c */
    private final C44643g f114717c;

    /* renamed from: d */
    public final void mo106895d() {
        C44825x xVar = (C44825x) this.f114717c.mo30924a("RecordCommerceTagScene");
        if (xVar != null) {
            xVar.mo30920G();
        }
    }

    /* renamed from: a */
    public final void mo106892a() {
        if (!C37299a.m119791a((C12604b) this.f114717c, "RecordSpeedGroupScene")) {
            this.f114717c.mo30925a((int) R.id.cpy, (C12629j) new C44725a(), "RecordSpeedGroupScene");
            C35563c.f93230L.mo93341a(Property.SpeedPanelOpen, true);
            this.f114716b.mo107184b(0);
            C44825x xVar = (C44825x) this.f114717c.mo30924a("RecordCommerceTagScene");
            if (xVar != null) {
                xVar.mo30920G();
            }
        }
    }

    /* renamed from: c */
    public final void mo106894c() {
        C44825x xVar = (C44825x) this.f114717c.mo30924a("RecordCommerceTagScene");
        if (xVar != null) {
            xVar.mo107269a(new C42581q(0, this.f114715a.mo97967T(), this.f114715a.mo97965R().f99788x));
        }
        C12636a.m36712c(this.f114717c, "RecordSpeedGroupScene");
        C35563c.f93230L.mo93341a(Property.SpeedPanelOpen, false);
        this.f114716b.mo107184b(8);
    }

    /* renamed from: f */
    public final void mo106897f() {
        if (C35563c.f93230L.mo93342a(Property.SpeedPanelOpen)) {
            C12636a.m36711b(this.f114717c, "RecordSpeedGroupScene");
            return;
        }
        C44825x xVar = (C44825x) this.f114717c.mo30924a("RecordCommerceTagScene");
        if (xVar != null) {
            xVar.mo30920G();
        }
    }

    /* renamed from: b */
    public final void mo106893b() {
        boolean z;
        C12636a.m36712c(this.f114717c, "RecordSpeedGroupScene");
        C35563c.f93230L.mo93341a(Property.SpeedPanelOpen, false);
        this.f114716b.mo107184b(8);
        FaceStickerBean T = this.f114715a.mo97967T();
        if (T != null) {
            z = T.shouldShowCommerceStickerTag();
        } else {
            z = false;
        }
        if (z) {
            C44825x xVar = (C44825x) this.f114717c.mo30924a("RecordCommerceTagScene");
            if (xVar != null) {
                xVar.mo107269a(new C42581q(0, this.f114715a.mo97967T(), this.f114715a.mo97965R().f99788x));
            }
        }
    }

    /* renamed from: e */
    public final void mo106896e() {
        boolean z;
        if (C35563c.f93230L.mo93342a(Property.SpeedPanelOpen)) {
            C12636a.m36710a(this.f114717c, "RecordSpeedGroupScene");
            return;
        }
        FaceStickerBean T = this.f114715a.mo97967T();
        if (T != null) {
            z = T.shouldShowCommerceStickerTag();
        } else {
            z = false;
        }
        if (z) {
            C44825x xVar = (C44825x) this.f114717c.mo30924a("RecordCommerceTagScene");
            if (xVar != null) {
                xVar.mo107269a(new C42581q(0, this.f114715a.mo97967T(), this.f114715a.mo97965R().f99788x));
            }
        }
    }

    public C44452af(C44643g gVar) {
        C7573i.m23587b(gVar, "parent");
        this.f114717c = gVar;
        Object b = this.f114717c.mo30998F().mo31126b((Object) "owner");
        if (b == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a(b, "parent.scope.getService<…ootScene.OWNER_CONTEXT)!!");
        this.f114715a = (C39382ed) b;
        JediViewModel a = C36113b.m116288a(this.f114715a.mo97962O()).mo91871a(RecordToolbarViewModel.class);
        C7573i.m23582a((Object) a, "JediViewModelProviders.o…barViewModel::class.java)");
        this.f114716b = (RecordToolbarViewModel) a;
    }
}
