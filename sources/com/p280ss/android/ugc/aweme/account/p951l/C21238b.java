package com.p280ss.android.ugc.aweme.account.p951l;

import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.widget.EditText;
import java.util.Collection;
import kotlin.TypeCastException;
import kotlin.collections.C7519g;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.sequences.C7605h;

/* renamed from: com.ss.android.ugc.aweme.account.l.b */
public final class C21238b {

    /* renamed from: a */
    public static final C21238b f57050a = new C21238b();

    /* renamed from: com.ss.android.ugc.aweme.account.l.b$a */
    static final class C21239a extends Lambda implements C7562b<InputFilter, Boolean> {

        /* renamed from: a */
        public static final C21239a f57051a = new C21239a();

        C21239a() {
            super(1);
        }

        /* renamed from: a */
        private static boolean m71494a(InputFilter inputFilter) {
            if (!(inputFilter instanceof LengthFilter)) {
                return true;
            }
            return false;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m71494a((InputFilter) obj));
        }
    }

    private C21238b() {
    }

    /* renamed from: a */
    public static final void m71493a(EditText editText, int i) {
        boolean z;
        InputFilter[] inputFilterArr;
        if (editText != null && i >= 0) {
            InputFilter[] filters = editText.getFilters();
            C7573i.m23582a((Object) filters, "editText.filters");
            if (filters.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                inputFilterArr = (InputFilter[]) new LengthFilter[]{new LengthFilter(i)};
            } else {
                InputFilter[] filters2 = editText.getFilters();
                C7573i.m23582a((Object) filters2, "editText.filters");
                Collection h = C7605h.m23664h(C7605h.m23651a(C7605h.m23653a(C7519g.m23455i(filters2), (C7562b<? super T, Boolean>) C21239a.f57051a), new LengthFilter(i)));
                if (h != null) {
                    Object[] array = h.toArray(new InputFilter[0]);
                    if (array != null) {
                        inputFilterArr = (InputFilter[]) array;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.util.Collection<T>");
                }
            }
            editText.setFilters(inputFilterArr);
        }
    }
}
