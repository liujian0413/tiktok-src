package com.p280ss.android.ugc.aweme.shortvideo.sticker;

import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43760j;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.u */
public interface C40949u {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.u$a */
    public static class C40950a {

        /* renamed from: a */
        public C40951b f106462a;

        /* renamed from: a */
        public final void mo101237a(Effect effect) {
            if (this.f106462a != null) {
                this.f106462a.mo100188b(effect);
            }
        }

        /* renamed from: a */
        public final void mo101238a(Effect effect, int i) {
            if (this.f106462a != null) {
                this.f106462a.mo100196a(effect, i);
            }
        }

        /* renamed from: a */
        public final void mo101239a(Effect effect, C43726c cVar) {
            if (this.f106462a != null) {
                this.f106462a.mo100187a(effect, cVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.u$b */
    public interface C40951b {
        /* renamed from: a */
        void mo100195a();

        /* renamed from: a */
        void mo100186a(Effect effect);

        /* renamed from: a */
        void mo100196a(Effect effect, int i);

        /* renamed from: a */
        void mo100187a(Effect effect, C43726c cVar);

        /* renamed from: b */
        void mo100188b(Effect effect);
    }

    /* renamed from: a */
    void mo100621a(StickerWrapper stickerWrapper);

    /* renamed from: a */
    void mo100622a(StickerWrapper stickerWrapper, C40951b bVar);

    /* renamed from: a */
    void mo100632a(String str, Map<String, String> map, C43760j jVar);
}
