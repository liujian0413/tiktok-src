package com.p280ss.android.ugc.aweme.profile.p1487ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageWithVerify;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.AvatarImageWithVerifyMus */
public final class AvatarImageWithVerifyMus extends AvatarImageWithVerify {

    /* renamed from: f */
    public static final C36594a f96011f = new C36594a(null);

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.AvatarImageWithVerifyMus$a */
    public static final class C36594a {
        private C36594a() {
        }

        public /* synthetic */ C36594a(C7571f fVar) {
            this();
        }
    }

    public AvatarImageWithVerifyMus(Context context) {
        this(context, null, 0, 6, null);
    }

    public AvatarImageWithVerifyMus(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final int getVerifyIconSize() {
        return (int) C9738o.m28708b(C6399b.m19921a(), 20.0f);
    }

    public AvatarImageWithVerifyMus(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ AvatarImageWithVerifyMus(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
