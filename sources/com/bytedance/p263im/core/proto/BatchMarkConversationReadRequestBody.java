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

/* renamed from: com.bytedance.im.core.proto.BatchMarkConversationReadRequestBody */
public final class BatchMarkConversationReadRequestBody extends Message<BatchMarkConversationReadRequestBody, Builder> {
    public static final ProtoAdapter<BatchMarkConversationReadRequestBody> ADAPTER = new ProtoAdapter_BatchMarkConversationReadRequestBody();
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.im.core.proto.MarkConversationReadRequestBody#ADAPTER", label = Label.REPEATED, tag = 1)
    public final List<MarkConversationReadRequestBody> mark_read_requests;

    /* renamed from: com.bytedance.im.core.proto.BatchMarkConversationReadRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<BatchMarkConversationReadRequestBody, Builder> {
        public List<MarkConversationReadRequestBody> mark_read_requests = Internal.newMutableList();

        public final BatchMarkConversationReadRequestBody build() {
            return new BatchMarkConversationReadRequestBody(this.mark_read_requests, super.buildUnknownFields());
        }

        public final Builder mark_read_requests(List<MarkConversationReadRequestBody> list) {
            Internal.checkElementsNotNull(list);
            this.mark_read_requests = list;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.BatchMarkConversationReadRequestBody$ProtoAdapter_BatchMarkConversationReadRequestBody */
    static final class ProtoAdapter_BatchMarkConversationReadRequestBody extends ProtoAdapter<BatchMarkConversationReadRequestBody> {
        public ProtoAdapter_BatchMarkConversationReadRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, BatchMarkConversationReadRequestBody.class);
        }

        public final int encodedSize(BatchMarkConversationReadRequestBody batchMarkConversationReadRequestBody) {
            return MarkConversationReadRequestBody.ADAPTER.asRepeated().encodedSizeWithTag(1, batchMarkConversationReadRequestBody.mark_read_requests) + batchMarkConversationReadRequestBody.unknownFields().size();
        }

        public final BatchMarkConversationReadRequestBody redact(BatchMarkConversationReadRequestBody batchMarkConversationReadRequestBody) {
            Builder newBuilder = batchMarkConversationReadRequestBody.newBuilder();
            Internal.redactElements(newBuilder.mark_read_requests, MarkConversationReadRequestBody.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final BatchMarkConversationReadRequestBody decode(ProtoReader protoReader) throws IOException {
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
                    builder.mark_read_requests.add(MarkConversationReadRequestBody.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, BatchMarkConversationReadRequestBody batchMarkConversationReadRequestBody) throws IOException {
            MarkConversationReadRequestBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, batchMarkConversationReadRequestBody.mark_read_requests);
            protoWriter.writeBytes(batchMarkConversationReadRequestBody.unknownFields());
        }
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (unknownFields().hashCode() * 37) + this.mark_read_requests.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.mark_read_requests = Internal.copyOf("mark_read_requests", this.mark_read_requests);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mark_read_requests.isEmpty()) {
            sb.append(", mark_read_requests=");
            sb.append(this.mark_read_requests);
        }
        StringBuilder replace = sb.replace(0, 2, "BatchMarkConversationReadRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public BatchMarkConversationReadRequestBody(List<MarkConversationReadRequestBody> list) {
        this(list, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BatchMarkConversationReadRequestBody)) {
            return false;
        }
        BatchMarkConversationReadRequestBody batchMarkConversationReadRequestBody = (BatchMarkConversationReadRequestBody) obj;
        if (!unknownFields().equals(batchMarkConversationReadRequestBody.unknownFields()) || !this.mark_read_requests.equals(batchMarkConversationReadRequestBody.mark_read_requests)) {
            return false;
        }
        return true;
    }

    public BatchMarkConversationReadRequestBody(List<MarkConversationReadRequestBody> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mark_read_requests = Internal.immutableCopyOf("mark_read_requests", list);
    }
}
