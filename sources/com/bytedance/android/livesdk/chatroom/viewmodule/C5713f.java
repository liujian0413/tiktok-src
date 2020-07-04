package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.chatroom.model.C4894b;
import com.bytedance.android.livesdk.chatroom.model.C4899c.C4900a;
import com.bytedance.android.livesdk.chatroom.p212e.C4374z;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.chatroom.viewmodule.C5559a.C5565f;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.user.C8984e;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.C9505f;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7579l;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.C7507ae;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.f */
public final class C5713f extends C5559a<BottomRightBannerWidget> {

    /* renamed from: g */
    public static final C5715b f16807g = new C5715b(null);

    /* renamed from: l */
    private static boolean f16808l;

    /* renamed from: h */
    private final ViewGroup f16809h;

    /* renamed from: i */
    private final HSImageView f16810i = ((HSImageView) this.f16809h.findViewById(R.id.k5));

    /* renamed from: j */
    private final TextView f16811j = ((TextView) this.f16809h.findViewById(R.id.title));

    /* renamed from: k */
    private final TransitionDrawable f16812k;

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.f$a */
    static final class C5714a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5713f f16813a;

        C5714a(C5713f fVar) {
            this.f16813a = fVar;
        }

        public final void onClick(View view) {
            String str;
            C8443c a = C8443c.m25663a();
            String str2 = "live_activity_banner_button_click";
            Pair[] pairArr = new Pair[2];
            String str3 = "click_type";
            if (this.f16813a.f16606d) {
                str = "open";
            } else {
                str = "retract";
            }
            pairArr[0] = C7579l.m23633a(str3, str);
            C8984e user = ((C3592a) C3596c.m13172a(C3592a.class)).user();
            C7573i.m23582a((Object) user, "ServiceManager.getServic…rvice::class.java).user()");
            pairArr[1] = C7579l.m23633a("user_id", String.valueOf(user.mo22179b()));
            a.mo21606a(str2, C7507ae.m23393a(pairArr), C8438j.class, Room.class);
            this.f16813a.mo14071l();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.f$b */
    static final class C5715b {
        private C5715b() {
        }

        public /* synthetic */ C5715b(C7571f fVar) {
            this();
        }
    }

    /* renamed from: b */
    public final void mo14061b() {
        this.f16812k.startTransition(C34943c.f91128x);
        f16808l = false;
    }

    /* renamed from: c */
    public final void mo14062c() {
        this.f16812k.reverseTransition(C34943c.f91128x);
        f16808l = true;
    }

    /* renamed from: d */
    public final void mo14063d() {
        BottomRightBannerWidget bottomRightBannerWidget = (BottomRightBannerWidget) this.f16604b;
        if (bottomRightBannerWidget != null) {
            bottomRightBannerWidget.f15714b = this;
        }
        if (f16808l) {
            mo14070k();
        } else {
            mo14069j();
        }
    }

    /* renamed from: e */
    public final void mo14064e() {
        TextView textView = this.f16811j;
        C7573i.m23582a((Object) textView, "titleView");
        textView.setText("");
        this.f16810i.setActualImageResource(0);
        this.f16810i.setBackgroundResource(R.drawable.bwv);
    }

    /* renamed from: a */
    public final View mo14057a(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parentView");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.aw4, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…older, parentView, false)");
        return inflate;
    }

    /* renamed from: a */
    private final void m18052a(int i) {
        HSImageView hSImageView = this.f16810i;
        C7573i.m23582a((Object) hSImageView, "backgroundView");
        Drawable background = hSImageView.getBackground();
        if (background instanceof ShapeDrawable) {
            HSImageView hSImageView2 = this.f16810i;
            C7573i.m23582a((Object) hSImageView2, "backgroundView");
            Drawable background2 = hSImageView2.getBackground();
            if (background2 != null) {
                Paint paint = ((ShapeDrawable) background2).getPaint();
                C7573i.m23582a((Object) paint, "(backgroundView.background as ShapeDrawable).paint");
                paint.setColor(i);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.graphics.drawable.ShapeDrawable");
        } else if (background instanceof GradientDrawable) {
            HSImageView hSImageView3 = this.f16810i;
            C7573i.m23582a((Object) hSImageView3, "backgroundView");
            Drawable background3 = hSImageView3.getBackground();
            if (background3 != null) {
                ((GradientDrawable) background3).setColor(i);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        } else {
            if (background instanceof ColorDrawable) {
                HSImageView hSImageView4 = this.f16810i;
                C7573i.m23582a((Object) hSImageView4, "backgroundView");
                Drawable background4 = hSImageView4.getBackground();
                if (background4 != null) {
                    ((ColorDrawable) background4).setColor(i);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo14059a(C4900a aVar) {
        String str;
        Number number;
        C7573i.m23587b(aVar, "info");
        super.mo14059a(aVar);
        C4894b bVar = aVar.f14016d;
        if (bVar != null) {
            C9505f fVar = bVar.f14005a;
            if (fVar != null) {
                TextView textView = this.f16811j;
                C7573i.m23582a((Object) textView, "titleView");
                textView.setText(C4374z.m14754a(fVar));
            }
        }
        C4894b bVar2 = aVar.f14016d;
        boolean z = false;
        if (bVar2 != null) {
            ImageModel imageModel = bVar2.f14007c;
            if (imageModel != null) {
                C5343e.m17038a(this.f16810i, imageModel);
                m18052a(0);
                if (imageModel != null) {
                    return;
                }
            }
        }
        C5713f fVar2 = this;
        C4894b bVar3 = aVar.f14016d;
        if (bVar3 != null) {
            str = bVar3.f14006b;
        } else {
            str = null;
        }
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        }
        if (!(!z)) {
            str = null;
        }
        try {
            number = Integer.valueOf(Color.parseColor(str));
        } catch (Throwable unused) {
            number = null;
        }
        if (number != null) {
            fVar2.m18052a(number.intValue());
        } else {
            fVar2.f16810i.setBackgroundResource(R.drawable.bwv);
        }
    }

    public C5713f(ViewGroup viewGroup, C5565f fVar) {
        C7573i.m23587b(viewGroup, "parentView");
        C7573i.m23587b(fVar, "stateChangeListener");
        super(viewGroup, R.id.crb, fVar);
        ViewGroup viewGroup2 = (ViewGroup) mo14056a().findViewById(R.id.kk);
        viewGroup2.setOnClickListener(new C5714a(this));
        this.f16809h = viewGroup2;
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{C3358ac.m12524c(R.drawable.c30), C3358ac.m12524c(R.drawable.c31)});
        transitionDrawable.setCrossFadeEnabled(true);
        ((ImageView) this.f16809h.findViewById(R.id.ah8)).setImageDrawable(transitionDrawable);
        transitionDrawable.startTransition(0);
        this.f16812k = transitionDrawable;
    }
}
