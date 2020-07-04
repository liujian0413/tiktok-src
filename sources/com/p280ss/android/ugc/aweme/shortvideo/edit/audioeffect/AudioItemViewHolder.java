package com.p280ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p280ss.android.ugc.aweme.shortvideo.edit.audioeffect.C39440c.C39441a;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.p280ss.android.ugc.aweme.utils.C42939as;
import com.p280ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioItemViewHolder */
public final class AudioItemViewHolder extends C1293v {

    /* renamed from: c */
    public static final C39425a f102370c = new C39425a(null);

    /* renamed from: a */
    public final FrameLayout f102371a;

    /* renamed from: b */
    public final C39426b f102372b;

    /* renamed from: d */
    private ImageView f102373d = ((ImageView) this.itemView.findViewById(R.id.b63));

    /* renamed from: e */
    private AVDmtImageTextView f102374e = ((AVDmtImageTextView) this.itemView.findViewById(R.id.b0a));

    /* renamed from: f */
    private ObjectAnimator f102375f;

    /* renamed from: g */
    private int f102376g = -1;

    /* renamed from: h */
    private long f102377h;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioItemViewHolder$a */
    public static final class C39425a {
        private C39425a() {
        }

        public /* synthetic */ C39425a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static FrameLayout m125943a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            C7573i.m23587b(layoutInflater, "inflater");
            C7573i.m23587b(viewGroup, "parent");
            View inflate = layoutInflater.inflate(R.layout.gl, viewGroup, false);
            if (inflate != null) {
                return (FrameLayout) inflate;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioItemViewHolder$b */
    public interface C39426b {
        /* renamed from: a */
        void mo98248a(View view, int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioItemViewHolder$c */
    static final class C39427c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AudioItemViewHolder f102379a;

        C39427c(AudioItemViewHolder audioItemViewHolder) {
            this.f102379a = audioItemViewHolder;
        }

        public final void run() {
            this.f102379a.mo98257a();
        }
    }

    /* renamed from: b */
    private final boolean m125934b() {
        if (getAdapterPosition() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo98257a() {
        ImageView imageView = this.f102373d;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        m125937e();
    }

    /* renamed from: e */
    private final void m125937e() {
        ObjectAnimator objectAnimator = this.f102375f;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            ObjectAnimator objectAnimator2 = this.f102375f;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
        }
        ImageView imageView = this.f102373d;
        if (imageView != null) {
            imageView.setRotation(0.0f);
        }
    }

    /* renamed from: d */
    private final void m125936d() {
        ImageView imageView = this.f102373d;
        if (imageView == null) {
            C7573i.m23580a();
        }
        this.f102375f = ObjectAnimator.ofFloat(imageView, "rotation", new float[]{0.0f, 360.0f});
        ObjectAnimator objectAnimator = this.f102375f;
        if (objectAnimator != null) {
            objectAnimator.setDuration(800);
        }
        ObjectAnimator objectAnimator2 = this.f102375f;
        if (objectAnimator2 != null) {
            objectAnimator2.setRepeatMode(1);
        }
        ObjectAnimator objectAnimator3 = this.f102375f;
        if (objectAnimator3 != null) {
            objectAnimator3.setRepeatCount(-1);
        }
        ObjectAnimator objectAnimator4 = this.f102375f;
        if (objectAnimator4 != null) {
            objectAnimator4.start();
        }
    }

    /* renamed from: c */
    private final void m125935c() {
        String str;
        AVDmtImageTextView aVDmtImageTextView = this.f102374e;
        Drawable drawable = null;
        if (aVDmtImageTextView != null) {
            AVDmtImageTextView aVDmtImageTextView2 = this.f102374e;
            if (aVDmtImageTextView2 != null) {
                Context context = aVDmtImageTextView2.getContext();
                if (context != null) {
                    str = context.getString(R.string.cn9);
                    aVDmtImageTextView.setText(str);
                }
            }
            str = null;
            aVDmtImageTextView.setText(str);
        }
        AVDmtImageTextView aVDmtImageTextView3 = this.f102374e;
        if (aVDmtImageTextView3 != null) {
            AVDmtImageTextView aVDmtImageTextView4 = this.f102374e;
            if (aVDmtImageTextView4 != null) {
                Context context2 = aVDmtImageTextView4.getContext();
                if (context2 != null) {
                    Resources resources = context2.getResources();
                    if (resources != null) {
                        drawable = resources.getDrawable(R.drawable.an4);
                    }
                }
            }
            aVDmtImageTextView3.mo103496a(drawable);
        }
        ImageView imageView = this.f102373d;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        mo98260a(false);
        mo98258a(1);
    }

    /* renamed from: a */
    public final void mo98259a(Effect effect) {
        if (m125934b()) {
            m125935c();
        } else {
            m125933b(effect);
        }
    }

    /* renamed from: a */
    public final void mo98260a(boolean z) {
        AVDmtImageTextView aVDmtImageTextView = this.f102374e;
        if (aVDmtImageTextView != null) {
            aVDmtImageTextView.mo103501a(z);
        }
    }

    /* renamed from: a */
    public final void mo98258a(int i) {
        if (!m125934b() && i != this.f102376g) {
            int i2 = this.f102376g;
            this.f102376g = i;
            switch (i) {
                case 0:
                case 3:
                    ImageView imageView = this.f102373d;
                    if (imageView != null) {
                        imageView.setImageResource(R.drawable.als);
                    }
                    ImageView imageView2 = this.f102373d;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                    }
                    m125937e();
                    break;
                case 1:
                    if (2 != i2 || this.f102377h <= 0) {
                        mo98257a();
                        return;
                    }
                    long currentTimeMillis = System.currentTimeMillis() - this.f102377h;
                    if (currentTimeMillis >= 100) {
                        mo98257a();
                        return;
                    } else {
                        this.itemView.postDelayed(new C39427c(this), 100 - currentTimeMillis);
                        return;
                    }
                case 2:
                    this.f102377h = System.currentTimeMillis();
                    ImageView imageView3 = this.f102373d;
                    if (imageView3 != null) {
                        imageView3.setVisibility(0);
                    }
                    ImageView imageView4 = this.f102373d;
                    if (imageView4 != null) {
                        imageView4.setImageResource(R.drawable.eq);
                    }
                    m125936d();
                    return;
            }
        }
    }

    /* renamed from: b */
    private final void m125933b(Effect effect) {
        List list;
        boolean z;
        int i;
        if (effect != null) {
            AVDmtImageTextView aVDmtImageTextView = this.f102374e;
            if (aVDmtImageTextView != null) {
                aVDmtImageTextView.setText(effect.getName());
            }
            UrlModel iconUrl = effect.getIconUrl();
            Drawable drawable = null;
            if (iconUrl != null) {
                list = iconUrl.getUrlList();
            } else {
                list = null;
            }
            Collection collection = list;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (C39428a.m125948a(effect)) {
                    if (list == null) {
                        C7573i.m23580a();
                    }
                    Object obj = list.get(0);
                    C7573i.m23582a(obj, "iconUrlList!![0]");
                    Integer d = C7634n.m23706d((String) obj);
                    if (d != null) {
                        i = d.intValue();
                    } else {
                        i = 0;
                    }
                    AVDmtImageTextView aVDmtImageTextView2 = this.f102374e;
                    if (aVDmtImageTextView2 != null) {
                        AVDmtImageTextView aVDmtImageTextView3 = this.f102374e;
                        if (aVDmtImageTextView3 != null) {
                            Context context = aVDmtImageTextView3.getContext();
                            if (context != null) {
                                Resources resources = context.getResources();
                                if (resources != null) {
                                    drawable = resources.getDrawable(i);
                                }
                            }
                        }
                        aVDmtImageTextView2.mo103496a(drawable);
                    }
                } else {
                    AVDmtImageTextView aVDmtImageTextView4 = this.f102374e;
                    if (aVDmtImageTextView4 != null) {
                        if (list == null) {
                            C7573i.m23580a();
                        }
                        aVDmtImageTextView4.mo103499a((String) list.get(0));
                    }
                }
            }
            mo98260a(false);
            C39441a.m125976a();
            mo98258a(C39440c.m125971a(effect) ? 1 : 0);
        }
    }

    public AudioItemViewHolder(FrameLayout frameLayout, C39426b bVar) {
        C7573i.m23587b(frameLayout, "parent");
        super(frameLayout);
        this.f102371a = frameLayout;
        this.f102372b = bVar;
        this.itemView.setOnClickListener(new C42939as(this) {

            /* renamed from: a */
            final /* synthetic */ AudioItemViewHolder f102378a;

            {
                this.f102378a = r1;
            }

            /* renamed from: a */
            public final void mo70606a(View view) {
                C7573i.m23587b(view, "v");
                C39426b bVar = this.f102378a.f102372b;
                if (bVar != null) {
                    bVar.mo98248a(view, this.f102378a.getAdapterPosition());
                }
            }
        });
    }
}
