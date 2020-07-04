package com.bytedance.android.livesdk.gift.effect.entry.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.C2380l;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.p212e.C4374z;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.gift.effect.entry.p380b.C8006a.C8007a;
import com.bytedance.android.livesdk.gift.effect.entry.p383e.C8026a;
import com.bytedance.android.livesdk.message.model.C8514bj.C8515a;
import com.bytedance.android.livesdkapi.message.C9505f;
import com.bytedance.android.livesdkapi.message.C9507h;
import com.bytedance.android.livesdkapi.message.C9511l;
import com.bytedance.android.livesdkapi.message.PieceType;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.controller.C13396a;
import com.facebook.drawee.controller.C13401d;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.p720g.C13648f;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.p1878b.C47891a;

public final class UserSpecialEntryView extends FrameLayout {

    /* renamed from: a */
    public static final C8033a f21861a = new C8033a(null);

    /* renamed from: b */
    private final SimpleDraweeView f21862b;

    /* renamed from: c */
    private final TextView f21863c;

    /* renamed from: d */
    private final View f21864d;

    /* renamed from: e */
    private final View f21865e;

    /* renamed from: f */
    private final HSImageView f21866f;

    /* renamed from: g */
    private int f21867g;

    /* renamed from: h */
    private final C8034b f21868h;

    /* renamed from: com.bytedance.android.livesdk.gift.effect.entry.view.UserSpecialEntryView$a */
    public static final class C8033a {
        private C8033a() {
        }

        public /* synthetic */ C8033a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m24643a(View view, int i) {
            if (view != null) {
                LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = i;
                }
                view.requestLayout();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.gift.effect.entry.view.UserSpecialEntryView$b */
    public static final class C8034b implements C13401d<C13648f> {

        /* renamed from: a */
        final /* synthetic */ UserSpecialEntryView f21869a;

        public final void onFailure(String str, Throwable th) {
        }

        public final void onIntermediateImageFailed(String str, Throwable th) {
        }

        public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, Object obj) {
        }

        public final void onRelease(String str) {
        }

        public final void onSubmit(String str, Object obj) {
        }

        C8034b(UserSpecialEntryView userSpecialEntryView) {
            this.f21869a = userSpecialEntryView;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
            int i;
            int i2 = 0;
            if (fVar != null) {
                i2 = fVar.getWidth();
                i = fVar.getHeight();
            } else {
                i = 0;
            }
            if (i2 <= 0 || i <= 0) {
                StringBuilder sb = new StringBuilder("Invalid image info received: (w=");
                sb.append(i2);
                sb.append(",h=");
                sb.append(i);
                sb.append(')');
                C3166a.m11966e("UserSpecialEntryView", sb.toString());
                i2 = 540;
                i = 32;
            }
            C8033a.m24643a(this.f21869a, C47891a.m148821a(((float) i2) * (((float) C3358ac.m12510a(32.0f)) / ((float) i))));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.gift.effect.entry.view.UserSpecialEntryView$c */
    static final class C8035c extends Lambda implements C7562b<C9507h, ImageModel> {

        /* renamed from: a */
        public static final C8035c f21870a = new C8035c();

        C8035c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m24645a((C9507h) obj);
        }

        /* renamed from: a */
        private static ImageModel m24645a(C9507h hVar) {
            if (hVar != null) {
                C9511l lVar = hVar.f26023d;
                if (lVar != null) {
                    User user = lVar.f26032a;
                    if (user != null) {
                        C2380l userHonor = user.getUserHonor();
                        if (userHonor != null) {
                            return userHonor.mo8707k();
                        }
                    }
                }
            }
            return null;
        }
    }

    public UserSpecialEntryView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo20982a() {
        if (this.f21865e != null && this.f21864d != null) {
            int width = this.f21865e.getWidth() - this.f21864d.getWidth();
            if (width > 0) {
                ObjectAnimator.ofInt(this.f21864d, "scrollX", new int[]{0, width}).setDuration((long) this.f21867g).start();
            }
        }
    }

    public final void setupUi(C8026a aVar) {
        boolean z;
        CharSequence charSequence;
        boolean z2;
        C7573i.m23587b(aVar, "message");
        if (aVar.mo20933a()) {
            C8515a aVar2 = aVar.f21789m;
            C7573i.m23582a((Object) aVar2, "message.effectConfig");
            ImageModel imageModel = aVar2.f23407e;
            C7573i.m23582a((Object) imageModel, "message.effectConfig.textIcon");
            String a = C8007a.m24542a(imageModel);
            CharSequence charSequence2 = a;
            if (charSequence2 == null || charSequence2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                C13396a c = ((C13382e) ((C13382e) C13380c.m39166a().mo32711a(a).mo32751c(true)).mo32743a((C13401d<? super INFO>) this.f21868h)).mo32730f();
                SimpleDraweeView simpleDraweeView = this.f21862b;
                if (simpleDraweeView != null) {
                    simpleDraweeView.setController(c);
                }
                C8515a aVar3 = aVar.f21789m;
                C7573i.m23582a((Object) aVar3, "message.effectConfig");
                C9505f fVar = aVar3.f23405c;
                C9507h hVar = null;
                if (fVar != null) {
                    charSequence = C4374z.m14751a(fVar.f26014b, fVar);
                } else {
                    charSequence = null;
                }
                TextView textView = this.f21863c;
                if (textView != null) {
                    textView.setText(charSequence);
                }
                C8515a aVar4 = aVar.f21789m;
                C7573i.m23582a((Object) aVar4, "message.effectConfig");
                this.f21867g = aVar4.f23408f;
                C7562b bVar = C8035c.f21870a;
                if (fVar != null) {
                    List<C9507h> list = fVar.f26016d;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            C9507h hVar2 = (C9507h) next;
                            C7573i.m23582a((Object) hVar2, "it");
                            if (hVar2.f26020a != PieceType.USER.getPieceType() || bVar.invoke(hVar2) == null) {
                                z2 = false;
                                continue;
                            } else {
                                z2 = true;
                                continue;
                            }
                            if (z2) {
                                hVar = next;
                                break;
                            }
                        }
                        hVar = hVar;
                    }
                }
                ImageModel imageModel2 = (ImageModel) bVar.invoke(hVar);
                if (imageModel2 != null) {
                    HSImageView hSImageView = this.f21866f;
                    if (hSImageView != null) {
                        C5343e.m17038a(hSImageView, imageModel2);
                    }
                } else {
                    HSImageView hSImageView2 = this.f21866f;
                    if (hSImageView2 != null) {
                        hSImageView2.setVisibility(8);
                    }
                }
            }
        }
    }

    public UserSpecialEntryView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.azk, this);
        this.f21862b = (SimpleDraweeView) findViewById(R.id.k_);
        this.f21864d = findViewById(R.id.kf);
        this.f21865e = findViewById(R.id.kb);
        this.f21863c = (TextView) findViewById(R.id.kh);
        this.f21866f = (HSImageView) findViewById(R.id.ki);
        this.f21868h = new C8034b(this);
    }

    public /* synthetic */ UserSpecialEntryView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
