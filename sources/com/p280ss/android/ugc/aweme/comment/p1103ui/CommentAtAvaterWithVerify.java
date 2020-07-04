package com.p280ss.android.ugc.aweme.comment.p1103ui;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageWithVerify;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentAtAvaterWithVerify */
public final class CommentAtAvaterWithVerify extends AvatarImageWithVerify {

    /* renamed from: f */
    public static final C24254a f63990f = new C24254a(null);

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentAtAvaterWithVerify$a */
    public static final class C24254a {
        private C24254a() {
        }

        public /* synthetic */ C24254a(C7571f fVar) {
            this();
        }
    }

    public CommentAtAvaterWithVerify(Context context) {
        this(context, null, 0, 6, null);
    }

    public CommentAtAvaterWithVerify(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final int getVerifyIconSize() {
        return (int) C9738o.m28708b(C6399b.m19921a(), 16.0f);
    }

    public CommentAtAvaterWithVerify(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ CommentAtAvaterWithVerify(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
