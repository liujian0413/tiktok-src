package com.p280ss.android.mobilelib;

import android.text.SpannableStringBuilder;
import java.util.LinkedList;

/* renamed from: com.ss.android.mobilelib.Truss */
public class Truss {
    private final SpannableStringBuilder builder = new SpannableStringBuilder();
    private final LinkedList<Span> stack = new LinkedList<>();

    /* renamed from: com.ss.android.mobilelib.Truss$Span */
    static final class Span {
        final Object span;
        final int start;

        public Span(int i, Object obj) {
            this.start = i;
            this.span = obj;
        }
    }

    public CharSequence build() {
        while (!this.stack.isEmpty()) {
            popSpan();
        }
        return this.builder;
    }

    public Truss popSpan() {
        Span span = (Span) this.stack.removeLast();
        this.builder.setSpan(span.span, span.start, this.builder.length(), 17);
        return this;
    }

    public Truss append(char c) {
        this.builder.append(c);
        return this;
    }

    public Truss append(int i) {
        this.builder.append(String.valueOf(i));
        return this;
    }

    public Truss append(CharSequence charSequence) {
        this.builder.append(charSequence);
        return this;
    }

    public Truss pushSpan(Object obj) {
        this.stack.add(new Span(this.builder.length(), obj));
        return this;
    }

    public Truss append(String str) {
        this.builder.append(str);
        return this;
    }
}
