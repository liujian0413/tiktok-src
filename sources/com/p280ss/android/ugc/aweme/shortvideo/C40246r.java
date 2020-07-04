package com.p280ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.C0052o;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.p280ss.android.ugc.aweme.tools.C42346k;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.choosemusic.RecordChooseMusicViewModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.reflect.Type;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.r */
public final class C40246r implements C42161ba {

    /* renamed from: a */
    public final String f104584a = "-";

    /* renamed from: b */
    public RecordChooseMusicViewModel f104585b;

    /* renamed from: c */
    public final C39382ed f104586c;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.r$a */
    public static final class C40247a implements C42159az<T> {

        /* renamed from: a */
        final /* synthetic */ C40246r f104587a;

        C40247a(C40246r rVar) {
            this.f104587a = rVar;
        }

        /* renamed from: a */
        public final void mo96096a(Object obj, T t) {
            boolean z;
            if (this.f104587a.f104586c.f33526d_ != null) {
                if (this.f104587a.f104585b == null) {
                    this.f104587a.f104585b = (RecordChooseMusicViewModel) C36113b.m116288a(this.f104587a.f104586c.mo97962O()).mo91871a(RecordChooseMusicViewModel.class);
                }
                AVMusic b = C39360dw.m125725a().mo97931b();
                String string = this.f104587a.f104586c.mo31017x().getString(R.string.a3q);
                if (b != null) {
                    StringBuilder sb = new StringBuilder(b.getName());
                    if (b.getSinger() != null) {
                        String singer = b.getSinger();
                        C7573i.m23582a((Object) singer, "musicModel.singer");
                        if (singer.length() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            sb.append(this.f104587a.f104584a);
                            sb.append(b.getSinger());
                        }
                    }
                    string = sb.toString();
                    RecordChooseMusicViewModel recordChooseMusicViewModel = this.f104587a.f104585b;
                    if (recordChooseMusicViewModel != null) {
                        Drawable drawable = this.f104587a.f104586c.mo31017x().getDrawable(R.drawable.app);
                        C7573i.m23582a((Object) drawable, "mOwner.resources.getDraw…camera_addmusic_complete)");
                        recordChooseMusicViewModel.mo106927a(drawable);
                    }
                } else {
                    RecordChooseMusicViewModel recordChooseMusicViewModel2 = this.f104587a.f104585b;
                    if (recordChooseMusicViewModel2 != null) {
                        Context N = this.f104587a.f104586c.mo97961N();
                        C7573i.m23582a((Object) N, "mOwner.context");
                        Drawable drawable2 = N.getResources().getDrawable(R.drawable.apo);
                        C7573i.m23582a((Object) drawable2, "mOwner.context.resources…ble.icon_camera_addmusic)");
                        recordChooseMusicViewModel2.mo106927a(drawable2);
                    }
                }
                RecordChooseMusicViewModel recordChooseMusicViewModel3 = this.f104587a.f104585b;
                if (recordChooseMusicViewModel3 != null) {
                    C7573i.m23582a((Object) string, "musicName");
                    recordChooseMusicViewModel3.mo106928a(string);
                }
                RecordChooseMusicViewModel recordChooseMusicViewModel4 = this.f104587a.f104585b;
                if (recordChooseMusicViewModel4 != null) {
                    C0052o<Boolean> oVar = recordChooseMusicViewModel4.f114735g;
                    if (oVar != null) {
                        oVar.setValue(Boolean.valueOf(false));
                    }
                }
            }
        }
    }

    public C40246r(C39382ed edVar) {
        C7573i.m23587b(edVar, "mOwner");
        this.f104586c = edVar;
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        C7573i.m23587b(awVar, "context");
        C7573i.m23587b(type, "type");
        if (type != C42346k.class) {
            return null;
        }
        return new C40247a<>(this);
    }
}
