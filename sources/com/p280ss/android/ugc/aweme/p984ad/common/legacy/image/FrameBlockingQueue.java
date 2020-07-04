package com.p280ss.android.ugc.aweme.p984ad.common.legacy.image;

import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: com.ss.android.ugc.aweme.ad.common.legacy.image.FrameBlockingQueue */
public class FrameBlockingQueue<E> extends LinkedBlockingDeque<E> {
    private int mFixedSize;

    public FrameBlockingQueue(int i) {
        this.mFixedSize = i;
    }

    public boolean offer(E e) {
        synchronized (this) {
            if (size() == this.mFixedSize) {
                removeLast();
            }
        }
        return super.offerFirst(e);
    }
}
