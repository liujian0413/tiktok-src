package com.p280ss.android.ugc.aweme.discover.model;

/* renamed from: com.ss.android.ugc.aweme.discover.model.CardType */
public enum CardType {
    TYPE_NORMAL(1),
    TYPE_CLUSTER(2),
    TYPE_MUSICIAN(3);
    
    private final int value;

    public final int getValue() {
        return this.value;
    }

    private CardType(int i) {
        this.value = i;
    }
}
