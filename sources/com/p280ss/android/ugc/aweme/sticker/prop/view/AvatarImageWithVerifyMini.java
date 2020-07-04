package com.p280ss.android.ugc.aweme.sticker.prop.view;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageWithVerify;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.sticker.prop.view.AvatarImageWithVerifyMini */
public final class AvatarImageWithVerifyMini extends AvatarImageWithVerify {

    /* renamed from: f */
    public static final C41890a f108966f = new C41890a(null);

    /* renamed from: com.ss.android.ugc.aweme.sticker.prop.view.AvatarImageWithVerifyMini$a */
    public static final class C41890a {
        private C41890a() {
        }

        public /* synthetic */ C41890a(C7571f fVar) {
            this();
        }
    }

    public AvatarImageWithVerifyMini(Context context) {
        this(context, null, 0, 6, null);
    }

    public AvatarImageWithVerifyMini(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final int getVerifyIconSize() {
        return (int) C9738o.m28708b(C6399b.m19921a(), 12.0f);
    }

    public AvatarImageWithVerifyMini(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ AvatarImageWithVerifyMini(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
