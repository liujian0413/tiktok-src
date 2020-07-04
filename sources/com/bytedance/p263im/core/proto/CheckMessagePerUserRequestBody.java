package com.bytedance.p263im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.WireField.Label;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.CheckMessagePerUserRequestBody */
public final class CheckMessagePerUserRequestBody extends Message<CheckMessagePerUserRequestBody, Builder> {
    public static final ProtoAdapter<CheckMessagePerUserRequestBody> ADAPTER = new ProtoAdapter_CheckMessagePerUserRequestBody();
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.im.core.proto.InboxMessagesPerUser#ADAPTER", label = Label.REPEATED, tag = 1)
    public final List<InboxMessagesPerUser> checks;

    /* renamed from: com.bytedance.im.core.proto.CheckMessagePerUserRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<CheckMessagePerUserRequestBody, Builder> {
        public List<InboxMessagesPerUser> checks = Internal.newMutableList();

        public final CheckMessagePerUserRequestBody build() {
            return new CheckMessagePerUserRequestBody(this.checks, super.buildUnknownFields());
        }

        public final Builder checks(List<InboxMessagesPerUser> list) {
            Internal.checkElementsNotNull(list);
            this.checks = list;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.CheckMessagePerUserRequestBody$ProtoAdapter_CheckMessagePerUserRequestBody */
    static final class ProtoAdapter_CheckMessagePerUserRequestBody extends ProtoAdapter<CheckMessagePerUserRequestBody> {
        public ProtoAdapter_CheckMessagePerUserRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, CheckMessagePerUserRequestBody.class);
        }

        public final int encodedSize(CheckMessagePerUserRequestBody checkMessagePerUserRequestBody) {
            return InboxMessagesPerUser.ADAPTER.asRepeated().encodedSizeWithTag(1, checkMessagePerUserRequestBody.checks) + checkMessagePerUserRequestBody.unknownFields().size();
        }

        public final CheckMessagePerUserRequestBody redact(CheckMessagePerUserRequestBody checkMessagePerUserRequestBody) {
            Builder newBuilder = checkMessagePerUserRequestBody.newBuilder();
            Internal.redactElements(newBuilder.checks, InboxMessagesPerUser.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final CheckMessagePerUserRequestBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.checks.add(InboxMessagesPerUser.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, CheckMessagePerUserRequestBody checkMessagePerUserRequestBody) throws IOException {
            InboxMessagesPerUser.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, checkMessagePerUserRequestBody.checks);
            protoWriter.writeBytes(checkMessagePerUserRequestBody.unknownFields());
        }
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (unknownFields().hashCode() * 37) + this.checks.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.checks = Internal.copyOf("checks", this.checks);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.checks.isEmpty()) {
            sb.append(", checks=");
            sb.append(this.checks);
        }
        StringBuilder replace = sb.replace(0, 2, "CheckMessagePerUserRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public CheckMessagePerUserRequestBody(List<InboxMessagesPerUser> list) {
        this(list, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CheckMessagePerUserRequestBody)) {
            return false;
        }
        CheckMessagePerUserRequestBody checkMessagePerUserRequestBody = (CheckMessagePerUserRequestBody) obj;
        if (!unknownFields().equals(checkMessagePerUserRequestBody.unknownFields()) || !this.checks.equals(checkMessagePerUserRequestBody.checks)) {
            return false;
        }
        return true;
    }

    public CheckMessagePerUserRequestBody(List<InboxMessagesPerUser> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.checks = Internal.immutableCopyOf("checks", list);
    }
}
