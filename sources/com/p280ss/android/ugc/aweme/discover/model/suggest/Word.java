package com.p280ss.android.ugc.aweme.discover.model.suggest;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.discover.model.suggest.Word */
public final class Word implements Serializable {
    @C6593c(mo15949a = "words_type")
    private String _wordType = "0";
    @C6593c(mo15949a = "id", mo15950b = {"group_id"})

    /* renamed from: id */
    private String f70745id;
    private boolean isShowed;
    @C6593c(mo15949a = "params")
    private Params params;
    @C6593c(mo15949a = "word", mo15950b = {"words_content"})
    private String word;
    @C6593c(mo15949a = "words_position")
    private int wordPosition;
    @C6593c(mo15949a = "words_source")
    private String wordSource;
    private int wordType;

    public final String getId() {
        return this.f70745id;
    }

    public final Params getParams() {
        return this.params;
    }

    public final String getWord() {
        return this.word;
    }

    public final int getWordPosition() {
        return this.wordPosition;
    }

    public final String getWordSource() {
        return this.wordSource;
    }

    public final boolean isShowed() {
        return this.isShowed;
    }

    public final int getWordType() {
        Integer d = C7634n.m23706d(this._wordType);
        if (d != null) {
            return d.intValue();
        }
        return 0;
    }

    public final int hashCode() {
        String str = this.word;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final void setId(String str) {
        this.f70745id = str;
    }

    public final void setParams(Params params2) {
        this.params = params2;
    }

    public final void setShowed(boolean z) {
        this.isShowed = z;
    }

    public final void setWord(String str) {
        this.word = str;
    }

    public final void setWordPosition(int i) {
        this.wordPosition = i;
    }

    public final void setWordSource(String str) {
        this.wordSource = str;
    }

    public final void setWordType(int i) {
        this.wordType = i;
    }

    public final boolean equals(Object obj) {
        Class cls;
        if (this == obj) {
            return true;
        }
        Class cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C7573i.m23585a((Object) cls2, (Object) cls)) {
            return false;
        }
        if (obj == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.model.suggest.Word");
        } else if (!C7573i.m23585a((Object) this.word, (Object) ((Word) obj).word)) {
            return false;
        } else {
            return true;
        }
    }
}
