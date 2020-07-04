package com.p280ss.android.ugc.aweme.comment.repo;

import com.bytedance.jedi.model.p603e.C11801a.C11808c;
import com.p280ss.android.ugc.aweme.comment.model.GifEmoji;
import java.util.Collection;
import java.util.List;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.comment.repo.GifEmojiListRepository$$special$$inlined$syncAppendedListTo$1 */
public final class GifEmojiListRepository$$special$$inlined$syncAppendedListTo$1 extends Lambda implements C7562b<C11808c<C24215d, List<? extends GifEmoji>, String, List<? extends GifEmoji>>, C7581n> {
    public GifEmojiListRepository$$special$$inlined$syncAppendedListTo$1() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C11808c) obj);
        return C7581n.f20898a;
    }

    public final void invoke(C11808c<C24215d, List<GifEmoji>, String, List<GifEmoji>> cVar) {
        C7573i.m23587b(cVar, "$this$keySyncTo");
        cVar.mo29359a((C7563m<? super K, ? super V, ? extends K1>) new C7563m<C24215d, List<? extends GifEmoji>, String>(this) {
            final /* synthetic */ GifEmojiListRepository$$special$$inlined$syncAppendedListTo$1 this$0;

            {
                this.this$0 = r1;
            }

            public final String invoke(C24215d dVar, List<? extends GifEmoji> list) {
                if (C7573i.m23585a((Object) C24215d.class, (Object) String.class)) {
                    if (dVar != null) {
                        return (String) dVar;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                } else if (C7573i.m23585a((Object) String.class, (Object) C7581n.class)) {
                    return (String) C7581n.f20898a;
                } else {
                    throw new RuntimeException();
                }
            }
        });
        cVar.mo29360a((C48006q<? super K, ? super V, ? super V1, ? extends V1>) new C48006q<C24215d, List<? extends GifEmoji>, List<? extends GifEmoji>, List<? extends GifEmoji>>(this) {
            final /* synthetic */ GifEmojiListRepository$$special$$inlined$syncAppendedListTo$1 this$0;

            {
                this.this$0 = r1;
            }

            public final List<GifEmoji> invoke(C24215d dVar, List<? extends GifEmoji> list, List<? extends GifEmoji> list2) {
                boolean z;
                if (dVar.f63930b == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    if (list2 == null) {
                        list2 = C7525m.m23461a();
                    }
                    Collection collection = list2;
                    if (list == null) {
                        list = C7525m.m23461a();
                    }
                    if (list != null) {
                        return C7525m.m23506c(collection, (Iterable<? extends T>) list);
                    }
                    throw new RuntimeException();
                } else if (list == null) {
                    return null;
                } else {
                    if (list != null) {
                        return list;
                    }
                    throw new RuntimeException();
                }
            }
        });
    }
}
