package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.NullValueException;
import com.bytedance.ies.settings.C10938a;
import com.bytedance.ies.settings.MissingRequiredFieldsException;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.PushPrePermissionView */
public final class PushPrePermissionView extends Message<PushPrePermissionView, Builder> {
    public static final DefaultValueProtoAdapter<PushPrePermissionView> ADAPTER = new ProtoAdapter_PushPrePermissionView();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String toast_text;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String toast_title;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.PushPrePermissionView$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<PushPrePermissionView, Builder> {
        public String toast_text;
        public String toast_title;

        public final PushPrePermissionView build() {
            return new PushPrePermissionView(this.toast_title, this.toast_text, super.buildUnknownFields());
        }

        public final Builder toast_text(String str) {
            this.toast_text = str;
            return this;
        }

        public final Builder toast_title(String str) {
            this.toast_title = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.PushPrePermissionView$ProtoAdapter_PushPrePermissionView */
    static final class ProtoAdapter_PushPrePermissionView extends DefaultValueProtoAdapter<PushPrePermissionView> {
        public final PushPrePermissionView redact(PushPrePermissionView pushPrePermissionView) {
            return pushPrePermissionView;
        }

        public ProtoAdapter_PushPrePermissionView() {
            super(FieldEncoding.LENGTH_DELIMITED, PushPrePermissionView.class);
        }

        public final PushPrePermissionView decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (PushPrePermissionView) null);
        }

        public final int encodedSize(PushPrePermissionView pushPrePermissionView) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, pushPrePermissionView.toast_title) + ProtoAdapter.STRING.encodedSizeWithTag(2, pushPrePermissionView.toast_text) + pushPrePermissionView.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, PushPrePermissionView pushPrePermissionView) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushPrePermissionView.toast_title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, pushPrePermissionView.toast_text);
            protoWriter.writeBytes(pushPrePermissionView.unknownFields());
        }

        public final PushPrePermissionView decode(ProtoReader protoReader, PushPrePermissionView pushPrePermissionView) throws IOException {
            Builder builder;
            PushPrePermissionView pushPrePermissionView2 = (PushPrePermissionView) C10938a.m32097a().mo26425a(PushPrePermissionView.class, pushPrePermissionView);
            if (pushPrePermissionView2 != null) {
                builder = pushPrePermissionView2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.toast_title((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.toast_text((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (pushPrePermissionView2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }
    }

    public final String getToastText() throws NullValueException {
        if (this.toast_text != null) {
            return this.toast_text;
        }
        throw new NullValueException();
    }

    public final String getToastTitle() throws NullValueException {
        if (this.toast_title != null) {
            return this.toast_title;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.toast_title = this.toast_title;
        builder.toast_text = this.toast_text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i3 = 0;
        if (this.toast_title != null) {
            i = this.toast_title.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.toast_text != null) {
            i3 = this.toast_text.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.toast_title != null) {
            sb.append(", toast_title=");
            sb.append(this.toast_title);
        }
        if (this.toast_text != null) {
            sb.append(", toast_text=");
            sb.append(this.toast_text);
        }
        StringBuilder replace = sb.replace(0, 2, "PushPrePermissionView{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PushPrePermissionView)) {
            return false;
        }
        PushPrePermissionView pushPrePermissionView = (PushPrePermissionView) obj;
        if (!unknownFields().equals(pushPrePermissionView.unknownFields()) || !Internal.equals(this.toast_title, pushPrePermissionView.toast_title) || !Internal.equals(this.toast_text, pushPrePermissionView.toast_text)) {
            return false;
        }
        return true;
    }

    public PushPrePermissionView(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public PushPrePermissionView(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.toast_title = str;
        this.toast_text = str2;
    }
}
