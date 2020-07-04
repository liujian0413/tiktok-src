package org.apache.commons.net;

import java.util.EventObject;

public class ProtocolCommandEvent extends EventObject {
    private static final long serialVersionUID = 403743538418947240L;
    private final String __command;
    private final boolean __isCommand;
    private final String __message;
    private final int __replyCode;

    public String getCommand() {
        return this.__command;
    }

    public String getMessage() {
        return this.__message;
    }

    public int getReplyCode() {
        return this.__replyCode;
    }

    public boolean isCommand() {
        return this.__isCommand;
    }

    public boolean isReply() {
        if (!isCommand()) {
            return true;
        }
        return false;
    }

    public ProtocolCommandEvent(Object obj, int i, String str) {
        super(obj);
        this.__replyCode = i;
        this.__message = str;
    }

    public ProtocolCommandEvent(Object obj, String str, String str2) {
        super(obj);
        this.__message = str2;
        this.__isCommand = true;
        this.__command = str;
    }
}
