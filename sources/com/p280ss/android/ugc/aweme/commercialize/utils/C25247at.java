package com.p280ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.ies.NullValueException;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.DouplusTextStruct;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.sequences.C7605h;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.at */
public final class C25247at {

    /* renamed from: a */
    public static final C25247at f66586a = new C25247at();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.at$a */
    static final class C25248a extends Lambda implements C7562b<DouplusTextStruct, Boolean> {

        /* renamed from: a */
        final /* synthetic */ int f66587a;

        C25248a(int i) {
            this.f66587a = i;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m82993a((DouplusTextStruct) obj));
        }

        /* renamed from: a */
        private boolean m82993a(DouplusTextStruct douplusTextStruct) {
            C7573i.m23587b(douplusTextStruct, "it");
            try {
                Integer type = douplusTextStruct.getType();
                if (type == null) {
                    return false;
                }
                if (type.intValue() == this.f66587a) {
                    return true;
                }
                return false;
            } catch (NullValueException unused) {
                return false;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.at$b */
    static final class C25249b extends Lambda implements C7562b<DouplusTextStruct, String> {

        /* renamed from: a */
        public static final C25249b f66588a = new C25249b();

        C25249b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m82994a((DouplusTextStruct) obj);
        }

        /* renamed from: a */
        private static String m82994a(DouplusTextStruct douplusTextStruct) {
            C7573i.m23587b(douplusTextStruct, "it");
            try {
                return douplusTextStruct.getTitle();
            } catch (NullValueException unused) {
                return null;
            }
        }
    }

    private C25247at() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static String m82991a(int i, String str) {
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            List douplusEntryTitle = a.getDouplusEntryTitle();
            C7573i.m23582a((Object) douplusEntryTitle, "douplusEntryTitle");
            String str2 = (String) C7605h.m23658d(C7605h.m23662f(C7605h.m23659d(C7605h.m23653a(C7605h.m23662f(C7525m.m23526p(douplusEntryTitle)), (C7562b<? super T, Boolean>) new C25248a<Object,Boolean>(i)), C25249b.f66588a)));
            if (str2 == null) {
                str2 = str;
            }
            return str2;
        } catch (NullValueException unused) {
            return str;
        }
    }
}
