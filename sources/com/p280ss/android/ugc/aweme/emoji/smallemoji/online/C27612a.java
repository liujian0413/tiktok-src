package com.p280ss.android.ugc.aweme.emoji.smallemoji.online;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.emoji.base.C27517a;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.C27605a;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.online.C27621d.C27622a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.emoji.smallemoji.online.a */
public final class C27612a implements C27605a {

    /* renamed from: a */
    public static final C27613a f72775a = new C27613a(null);

    /* renamed from: com.ss.android.ugc.aweme.emoji.smallemoji.online.a$a */
    public static final class C27613a {
        private C27613a() {
        }

        /* renamed from: a */
        public static boolean m90534a() {
            return C27622a.m90577a().mo70958c();
        }

        public /* synthetic */ C27613a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: b */
    public final String mo70935b() {
        return C27622a.m90577a().f72794d;
    }

    /* renamed from: a */
    public final int mo70928a() {
        return C27622a.m90577a().mo70959d();
    }

    /* renamed from: a */
    public final Drawable mo70929a(Context context) {
        return C27622a.m90577a().mo70947a(context);
    }

    /* renamed from: a */
    public final boolean mo70934a(String str) {
        if (str != null) {
            return C27622a.m90577a().mo70954a(str);
        }
        return false;
    }

    /* renamed from: a */
    public final Drawable mo70930a(Context context, String str) {
        boolean z;
        if (context != null) {
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                Bitmap b = C27622a.m90577a().mo70955b(str);
                if (b != null) {
                    return new BitmapDrawable(context.getResources(), b);
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final List<C27517a> mo70931a(int i, int i2) {
        return C27622a.m90577a().mo70949a(i, i2);
    }

    /* renamed from: a */
    public final List<C27517a> mo70932a(List<String> list, int i) {
        if (list != null) {
            return C27622a.m90577a().mo70950a(list, i);
        }
        return new ArrayList<>();
    }

    /* renamed from: a */
    public final void mo70933a(RemoteImageView remoteImageView, C27517a aVar) {
        boolean z;
        C27517a aVar2;
        if (!(remoteImageView == null || aVar == null)) {
            CharSequence charSequence = aVar.f72557b;
            boolean z2 = false;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                aVar2 = aVar;
            } else {
                aVar2 = null;
            }
            if (aVar2 != null) {
                C27622a.m90577a().mo70951a(remoteImageView, aVar2);
            } else {
                if (aVar.f72556a > 0) {
                    z2 = true;
                }
                if (!z2) {
                    aVar = null;
                }
                if (aVar != null) {
                    remoteImageView.setImageResource(aVar.f72556a);
                }
            }
        }
    }
}
