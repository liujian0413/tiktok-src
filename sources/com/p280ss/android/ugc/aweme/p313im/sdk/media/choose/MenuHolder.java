package com.p280ss.android.ugc.aweme.p313im.sdk.media.choose;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.p313im.sdk.BaseViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.model.C31403a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.MenuHolder */
public final class MenuHolder extends BaseViewHolder<C31403a> {

    /* renamed from: b */
    public C31403a f82164b;

    /* renamed from: c */
    private RemoteImageView f82165c;

    /* renamed from: d */
    private TextView f82166d;

    /* renamed from: e */
    private TextView f82167e;

    /* renamed from: b */
    public final void mo80310b() {
        super.mo80310b();
        Object a = mo80306a((int) R.id.b3m);
        C7573i.m23582a(a, "findViewById(R.id.item_image_view)");
        this.f82165c = (RemoteImageView) a;
        Object a2 = mo80306a((int) R.id.b5c);
        C7573i.m23582a(a2, "findViewById(R.id.item_tv)");
        this.f82166d = (TextView) a2;
        Object a3 = mo80306a((int) R.id.dsr);
        C7573i.m23582a(a3, "findViewById(R.id.tv_count)");
        this.f82167e = (TextView) a3;
    }

    /* renamed from: a */
    public final void mo80308a(C31403a aVar) {
        CharSequence charSequence;
        C7573i.m23587b(aVar, "album");
        super.mo80308a(aVar);
        TextView textView = this.f82166d;
        if (textView == null) {
            C7573i.m23583a("textView");
        }
        if (aVar.f82254b) {
            View view = this.itemView;
            C7573i.m23582a((Object) view, "itemView");
            Context context = view.getContext();
            C7573i.m23582a((Object) context, "itemView.context");
            charSequence = context.getResources().getString(R.string.bgp);
        } else {
            Locale locale = Locale.ENGLISH;
            C7573i.m23582a((Object) locale, "Locale.ENGLISH");
            String a = C1642a.m8035a(locale, "%1$s", Arrays.copyOf(new Object[]{aVar.f82255c}, 1));
            C7573i.m23582a((Object) a, "java.lang.String.format(locale, format, *args)");
            charSequence = a;
        }
        textView.setText(charSequence);
        TextView textView2 = this.f82167e;
        if (textView2 == null) {
            C7573i.m23583a("countView");
        }
        Locale locale2 = Locale.ENGLISH;
        C7573i.m23582a((Object) locale2, "Locale.ENGLISH");
        String a2 = C1642a.m8035a(locale2, "%1$d", Arrays.copyOf(new Object[]{Integer.valueOf(aVar.mo81979a())}, 1));
        C7573i.m23582a((Object) a2, "java.lang.String.format(locale, format, *args)");
        textView2.setText(a2);
        RemoteImageView remoteImageView = this.f82165c;
        if (remoteImageView == null) {
            C7573i.m23583a("imageView");
        }
        StringBuilder sb = new StringBuilder("file://");
        sb.append(aVar.mo81980b());
        C23323e.m76525b(remoteImageView, sb.toString(), NormalGiftView.MASK_TRANSLATE_VALUE, NormalGiftView.MASK_TRANSLATE_VALUE);
        this.f82164b = aVar;
    }

    public MenuHolder(View view, final C7562b<? super C31403a, C7581n> bVar) {
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(bVar, "openAlbum");
        super(view);
        view.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ MenuHolder f82168a;

            {
                this.f82168a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C31403a aVar = this.f82168a.f82164b;
                if (aVar != null) {
                    bVar.invoke(aVar);
                }
            }
        });
    }
}
