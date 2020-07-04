package com.bytedance.p263im.core.internal.utils;

import com.bytedance.p263im.core.model.Message;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.utils.MessageSortedList */
public class MessageSortedList extends ArrayList<Message> {
    public MessageSortedList() {
    }

    public MessageSortedList(Collection<? extends Message> collection) {
        super(collection);
    }

    public boolean update(Message message) {
        int indexOf = indexOf(message);
        if (indexOf < 0) {
            return false;
        }
        set(indexOf, message);
        return true;
    }

    private boolean canShow(Message message) {
        if (message == null || message.isDeleted() || message.getSvrStatus() != 0) {
            return false;
        }
        return true;
    }

    public boolean add(Message message) {
        int indexOf = indexOf(message);
        if (indexOf < 0) {
            super.add((-indexOf) - 1, message);
        } else {
            set(indexOf, message);
        }
        return true;
    }

    public void addList(List<Message> list) {
        if (list != null && !list.isEmpty()) {
            for (Message message : list) {
                if (canShow(message)) {
                    add(message);
                }
            }
        }
    }

    public void appendList(List<Message> list) {
        if (list != null && !list.isEmpty()) {
            for (Message message : list) {
                if (canShow(message)) {
                    int indexOf = indexOf(message);
                    if (indexOf < 0) {
                        super.add(message);
                    } else {
                        set(indexOf, message);
                    }
                }
            }
        }
    }

    public void updateList(List<Message> list) {
        if (list != null && !list.isEmpty()) {
            for (Message message : list) {
                if (canShow(message)) {
                    update(message);
                }
            }
        }
    }
}
