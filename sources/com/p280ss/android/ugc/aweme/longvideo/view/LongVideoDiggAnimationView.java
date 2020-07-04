package com.p280ss.android.ugc.aweme.longvideo.view;

import android.content.Context;
import android.support.p029v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.facebook.keyframes.C14005b;
import com.facebook.keyframes.C14005b.C14008c;
import com.p280ss.android.ugc.aweme.anim.C22544a;
import com.p280ss.android.ugc.aweme.anim.C22549b;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28491k;
import com.p280ss.android.ugc.aweme.festival.christmas.C29132a;

/* renamed from: com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView */
public class LongVideoDiggAnimationView extends AppCompatImageView {

    /* renamed from: a */
    C14005b f85413a;

    /* renamed from: b */
    public C14008c f85414b = new C14008c() {
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
            if (r1 == null) goto L_0x0013;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo33668a() {
            /*
                r3 = this;
                com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView r0 = com.p280ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView.this
                r1 = 254(0xfe, float:3.56E-43)
                r0.setImageAlpha(r1)
                boolean r1 = com.p280ss.android.ugc.aweme.festival.christmas.C29132a.m95560a()
                if (r1 == 0) goto L_0x0013
                android.graphics.drawable.Drawable r1 = com.p280ss.android.ugc.aweme.festival.p311a.C29125d.m95523c()
                if (r1 != 0) goto L_0x0020
            L_0x0013:
                com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView r1 = com.p280ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView.this
                android.content.Context r1 = r1.getContext()
                r2 = 2131231266(0x7f080222, float:1.8078608E38)
                android.graphics.drawable.Drawable r1 = android.support.p022v4.content.C0683b.m2903a(r1, r2)
            L_0x0020:
                r0.setImageDrawable(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView.C327602.mo33668a():void");
        }
    };

    /* renamed from: a */
    private boolean m106032a() {
        Boolean bool = (Boolean) getTag(C29132a.d6i);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: b */
    private void m106033b() {
        animate().scaleY(0.0f).scaleX(0.0f).setDuration(200).setInterpolator(new AccelerateDecelerateInterpolator()).withEndAction(new Runnable() {
            public final void run() {
                C22544a.m74540a().mo59153a(AwemeApplication.m21341a(), "new_follow_anim_likes_explode", new C22549b() {
                    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
                        if (r8 == null) goto L_0x000c;
                     */
                    /* renamed from: a */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void mo59157a(com.facebook.keyframes.model.C14052j r7, java.lang.String r8) {
                        /*
                            r6 = this;
                            boolean r8 = com.p280ss.android.ugc.aweme.festival.christmas.C29132a.m95560a()
                            if (r8 == 0) goto L_0x000c
                            android.graphics.drawable.Drawable r8 = com.p280ss.android.ugc.aweme.festival.p311a.C29125d.m95525d()
                            if (r8 != 0) goto L_0x001b
                        L_0x000c:
                            com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView$1 r8 = com.p280ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView.C327581.this
                            com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView r8 = com.p280ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView.this
                            android.content.Context r8 = r8.getContext()
                            r0 = 2131232031(0x7f08051f, float:1.808016E38)
                            android.graphics.drawable.Drawable r8 = android.support.p022v4.content.C0683b.m2903a(r8, r0)
                        L_0x001b:
                            r0 = 1
                            r1 = 0
                            if (r8 == 0) goto L_0x0052
                            r2 = 120(0x78, float:1.68E-43)
                            r3 = 114(0x72, float:1.6E-43)
                            r8.setBounds(r1, r1, r2, r3)
                            com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView$1 r2 = com.p280ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView.C327581.this
                            com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView r2 = com.p280ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView.this
                            com.facebook.keyframes.d r3 = new com.facebook.keyframes.d
                            r3.<init>()
                            com.facebook.keyframes.d r7 = r3.mo33683a(r7)
                            com.facebook.keyframes.d$a r7 = r7.f37043c
                            android.util.Pair[] r3 = new android.util.Pair[r0]
                            java.lang.String r4 = "keyframes"
                            android.graphics.Matrix r5 = new android.graphics.Matrix
                            r5.<init>()
                            android.util.Pair r8 = android.util.Pair.create(r8, r5)
                            android.util.Pair r8 = android.util.Pair.create(r4, r8)
                            r3[r1] = r8
                            com.facebook.keyframes.d$a r7 = r7.mo33685a(r3)
                            com.facebook.keyframes.b r7 = r7.mo33684a()
                            r2.f85413a = r7
                        L_0x0052:
                            com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView$1 r7 = com.p280ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView.C327581.this
                            com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView r7 = com.p280ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView.this
                            android.view.ViewPropertyAnimator r8 = r7.animate()
                            r2 = 1065353216(0x3f800000, float:1.0)
                            android.view.ViewPropertyAnimator r8 = r8.scaleX(r2)
                            android.view.ViewPropertyAnimator r8 = r8.scaleY(r2)
                            r2 = 1
                            android.view.ViewPropertyAnimator r8 = r8.setDuration(r2)
                            r8.start()
                            r7.setVisibility(r1)
                            r8 = 0
                            r7.setLayerType(r0, r8)
                            com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView$1 r8 = com.p280ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView.C327581.this
                            com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView r8 = com.p280ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView.this
                            com.facebook.keyframes.b r8 = r8.f85413a
                            r7.setImageDrawable(r8)
                            r7.setImageAlpha(r1)
                            com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView$1 r7 = com.p280ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView.C327581.this
                            com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView r7 = com.p280ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView.this
                            com.facebook.keyframes.b r7 = r7.f85413a
                            r7.mo33650a()
                            com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView$1 r7 = com.p280ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView.C327581.this
                            com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView r7 = com.p280ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView.this
                            com.facebook.keyframes.b r7 = r7.f85413a
                            r7.mo33654c()
                            com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView$1 r7 = com.p280ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView.C327581.this
                            com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView r7 = com.p280ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView.this
                            com.facebook.keyframes.b r7 = r7.f85413a
                            com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView$1 r8 = com.p280ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView.C327581.this
                            com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView r8 = com.p280ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView.this
                            com.facebook.keyframes.b$c r8 = r8.f85414b
                            r7.mo33652a(r8)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView.C327581.C327591.mo59157a(com.facebook.keyframes.model.j, java.lang.String):void");
                    }
                });
            }
        }).start();
    }

    public LongVideoDiggAnimationView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo84256a(View view) {
        if (m106032a()) {
            C28491k.m93636a(view);
        } else if (!isSelected()) {
            m106033b();
        } else {
            C28491k.m93636a(view);
        }
    }

    public LongVideoDiggAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LongVideoDiggAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
