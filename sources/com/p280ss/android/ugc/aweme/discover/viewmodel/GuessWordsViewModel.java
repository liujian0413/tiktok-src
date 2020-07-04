package com.p280ss.android.ugc.aweme.discover.viewmodel;

import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.api.C22832g;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23084b;
import com.p280ss.android.ugc.aweme.base.p1062f.C23338f;
import com.p280ss.android.ugc.aweme.base.p1062f.C23339g;
import com.p280ss.android.ugc.aweme.discover.api.SuggestWordsApi;
import com.p280ss.android.ugc.aweme.discover.api.p1174a.C26568a;
import com.p280ss.android.ugc.aweme.discover.api.p1174a.C26569b;
import com.p280ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.p280ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import com.p280ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p280ss.android.ugc.aweme.discover.p1177c.C26610b;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.search.model.SearchEnterParam;
import java.util.List;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel */
public final class GuessWordsViewModel extends C0063u {

    /* renamed from: d */
    public static final C27234a f71741d = new C27234a(null);

    /* renamed from: a */
    public final C23084b<C26568a<TypeWords>> f71742a = new C23084b<>();

    /* renamed from: b */
    public final C23084b<C26568a<TypeWords>> f71743b = new C23084b<>();

    /* renamed from: c */
    public final C23339g f71744c = C23338f.m76567e();

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel$a */
    public static final class C27234a {
        private C27234a() {
        }

        public /* synthetic */ C27234a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static GuessWordsViewModel m89237a(FragmentActivity fragmentActivity) {
            C7573i.m23587b(fragmentActivity, "activity");
            C0063u a = C0069x.m159a(fragmentActivity).mo147a(GuessWordsViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…rdsViewModel::class.java)");
            return (GuessWordsViewModel) a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel$b */
    static final class C27235b<TTaskResult, TContinuationResult> implements C1591g<SuggestWordResponse, Object> {

        /* renamed from: a */
        final /* synthetic */ GuessWordsViewModel f71745a;

        C27235b(GuessWordsViewModel guessWordsViewModel) {
            this.f71745a = guessWordsViewModel;
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m89238a(hVar);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m89238a(C1592h<SuggestWordResponse> hVar) {
            Object obj;
            boolean z;
            C7573i.m23582a((Object) hVar, "it");
            if (hVar.mo6882b()) {
                SuggestWordResponse suggestWordResponse = (SuggestWordResponse) hVar.mo6890e();
                C26610b a = C26610b.f70175a.mo68294a(0);
                if (suggestWordResponse != null) {
                    a.mo68296a(suggestWordResponse.getRequestId()).mo68295a((C22832g) suggestWordResponse);
                }
                a.mo68299c();
                if (suggestWordResponse != null) {
                    List<TypeWords> list = suggestWordResponse.data;
                    Word a2 = this.f71745a.mo69983a();
                    if (a2 != null) {
                        if (C6399b.m19944t()) {
                            try {
                                IESSettingsProxy a3 = C30199h.m98861a();
                                C7573i.m23582a((Object) a3, "SettingsReader.get()");
                                Boolean mtForbidInsertPlaceholderWord = a3.getMtForbidInsertPlaceholderWord();
                                C7573i.m23582a((Object) mtForbidInsertPlaceholderWord, "SettingsReader.get().mtForbidInsertPlaceholderWord");
                                z = mtForbidInsertPlaceholderWord.booleanValue();
                            } catch (Exception unused) {
                                z = false;
                            }
                            if (list != null) {
                                TypeWords typeWords = (TypeWords) C7525m.m23511f(list);
                                if (typeWords != null) {
                                    List<Word> list2 = typeWords.words;
                                    if (list2 != null) {
                                        if (list2.contains(a2)) {
                                            list2.remove(a2);
                                        }
                                        if (!z) {
                                            list2.add(0, a2);
                                        }
                                    }
                                }
                            }
                        } else if (list != null) {
                            TypeWords typeWords2 = (TypeWords) C7525m.m23511f(list);
                            if (typeWords2 != null) {
                                List<Word> list3 = typeWords2.words;
                                if (list3 != null) {
                                    list3.add(0, a2);
                                }
                            }
                        }
                    }
                    C23084b<C26568a<TypeWords>> bVar = this.f71745a.f71742a;
                    TypeWords typeWords3 = null;
                    if (list != null) {
                        obj = (TypeWords) C7525m.m23511f(list);
                    } else {
                        obj = null;
                    }
                    bVar.setValue(new C26568a(obj));
                    C23339g gVar = this.f71745a.f71744c;
                    String str = "key_guess_words";
                    if (list != null) {
                        typeWords3 = (TypeWords) C7525m.m23511f(list);
                    }
                    gVar.mo60626a(str, (Object) typeWords3);
                    return;
                }
                TypeWords typeWords4 = (TypeWords) this.f71745a.f71744c.mo60622a("key_guess_words", TypeWords.class);
                if (typeWords4 != null) {
                    this.f71745a.f71742a.setValue(new C26568a(typeWords4));
                }
                return;
            }
            if (hVar.mo6889d()) {
                TypeWords typeWords5 = (TypeWords) this.f71745a.f71744c.mo60622a("key_guess_words", TypeWords.class);
                if (typeWords5 != null) {
                    this.f71745a.f71742a.setValue(new C26568a(typeWords5));
                } else {
                    C23084b<C26568a<TypeWords>> bVar2 = this.f71745a.f71742a;
                    Exception f = hVar.mo6891f();
                    C7573i.m23582a((Object) f, "it.error");
                    bVar2.setValue(new C26568a(f));
                }
                C26610b b = C26610b.f70175a.mo68294a(1).mo68298b(hVar.mo6891f().getMessage());
                SuggestWordResponse suggestWordResponse2 = (SuggestWordResponse) hVar.mo6890e();
                if (suggestWordResponse2 != null) {
                    b.mo68296a(suggestWordResponse2.getRequestId()).mo68295a((C22832g) suggestWordResponse2);
                }
                b.mo68299c();
                C26610b.m87389d();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel$c */
    static final class C27236c<TTaskResult, TContinuationResult> implements C1591g<SuggestWordResponse, Object> {

        /* renamed from: a */
        final /* synthetic */ GuessWordsViewModel f71746a;

        C27236c(GuessWordsViewModel guessWordsViewModel) {
            this.f71746a = guessWordsViewModel;
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m89239a(hVar);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m89239a(C1592h<SuggestWordResponse> hVar) {
            Object obj;
            C7573i.m23582a((Object) hVar, "it");
            if (hVar.mo6882b()) {
                SuggestWordResponse suggestWordResponse = (SuggestWordResponse) hVar.mo6890e();
                if (suggestWordResponse != null) {
                    List<TypeWords> list = suggestWordResponse.data;
                    C23084b<C26568a<TypeWords>> bVar = this.f71746a.f71743b;
                    TypeWords typeWords = null;
                    if (list != null) {
                        obj = (TypeWords) C7525m.m23511f(list);
                    } else {
                        obj = null;
                    }
                    bVar.setValue(new C26568a(obj));
                    C23339g gVar = this.f71746a.f71744c;
                    String str = "key_inbox_word";
                    if (list != null) {
                        typeWords = (TypeWords) C7525m.m23511f(list);
                    }
                    gVar.mo60626a(str, (Object) typeWords);
                    return;
                }
                TypeWords typeWords2 = (TypeWords) this.f71746a.f71744c.mo60622a("key_inbox_word", TypeWords.class);
                if (typeWords2 != null) {
                    this.f71746a.f71743b.setValue(new C26568a(typeWords2));
                }
                return;
            }
            if (hVar.mo6889d()) {
                TypeWords typeWords3 = (TypeWords) this.f71746a.f71744c.mo60622a("key_inbox_word", TypeWords.class);
                if (typeWords3 != null) {
                    this.f71746a.f71743b.setValue(new C26568a(typeWords3));
                    return;
                }
                C23084b<C26568a<TypeWords>> bVar2 = this.f71746a.f71743b;
                Exception f = hVar.mo6891f();
                C7573i.m23582a((Object) f, "it.error");
                bVar2.setValue(new C26568a(f));
            }
        }
    }

    /* renamed from: a */
    public static final GuessWordsViewModel m89232a(FragmentActivity fragmentActivity) {
        return C27234a.m89237a(fragmentActivity);
    }

    /* renamed from: b */
    private static IRetrofit m89233b() {
        IRetrofit iRetrofit;
        if (C6399b.m19944t()) {
            iRetrofit = C26569b.f70093c;
        } else {
            iRetrofit = C26569b.f70092b;
        }
        C7573i.m23582a((Object) iRetrofit, "retrofit");
        return iRetrofit;
    }

    /* renamed from: a */
    public final Word mo69983a() {
        C26568a aVar = (C26568a) this.f71743b.getValue();
        if (aVar != null) {
            TypeWords typeWords = (TypeWords) aVar.f70089b;
            if (typeWords != null) {
                List<Word> list = typeWords.words;
                if (list != null) {
                    if (!(!list.isEmpty())) {
                        list = null;
                    }
                    if (list != null) {
                        return (Word) list.get(0);
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo69985b(SearchEnterParam searchEnterParam) {
        String str;
        String str2;
        IRetrofit b = m89233b();
        if (C6399b.m19944t()) {
            str = "30001";
        } else {
            str = "10006";
        }
        String str3 = str;
        SuggestWordsApi suggestWordsApi = (SuggestWordsApi) b.create(SuggestWordsApi.class);
        if (searchEnterParam != null) {
            str2 = searchEnterParam.getGidRequest();
        } else {
            str2 = null;
        }
        suggestWordsApi.getSuggestWords(str3, str2, "").mo6876a((C1591g<TResult, TContinuationResult>) new C27236c<TResult,TContinuationResult>(this), C1592h.f5958b);
    }

    /* renamed from: a */
    public final void mo69984a(SearchEnterParam searchEnterParam) {
        String str;
        String str2;
        IRetrofit b = m89233b();
        if (C6399b.m19944t()) {
            str = "30000";
        } else {
            str = "10005";
        }
        String str3 = str;
        C26610b.f70175a.mo68297b();
        SuggestWordsApi suggestWordsApi = (SuggestWordsApi) b.create(SuggestWordsApi.class);
        if (searchEnterParam != null) {
            str2 = searchEnterParam.consumeGid();
        } else {
            str2 = null;
        }
        suggestWordsApi.getSuggestWords(str3, str2, "").mo6876a((C1591g<TResult, TContinuationResult>) new C27235b<TResult,TContinuationResult>(this), C1592h.f5958b);
    }
}
