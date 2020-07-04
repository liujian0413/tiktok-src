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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.DownloadDialogSettings */
public final class DownloadDialogSettings extends Message<DownloadDialogSettings, Builder> {
    public static final DefaultValueProtoAdapter<DownloadDialogSettings> ADAPTER = new ProtoAdapter_DownloadDialogSettings();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer is_enable_back_dialog;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.DownloadDialogSettings$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<DownloadDialogSettings, Builder> {
        public Integer is_enable_back_dialog;

        public final DownloadDialogSettings build() {
            return new DownloadDialogSettings(this.is_enable_back_dialog, super.buildUnknownFields());
        }

        public final Builder is_enable_back_dialog(Integer num) {
            this.is_enable_back_dialog = num;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.DownloadDialogSettings$ProtoAdapter_DownloadDialogSettings */
    static final class ProtoAdapter_DownloadDialogSettings extends DefaultValueProtoAdapter<DownloadDialogSettings> {
        public final DownloadDialogSettings redact(DownloadDialogSettings downloadDialogSettings) {
            return downloadDialogSettings;
        }

        public ProtoAdapter_DownloadDialogSettings() {
            super(FieldEncoding.LENGTH_DELIMITED, DownloadDialogSettings.class);
        }

        public final DownloadDialogSettings decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (DownloadDialogSettings) null);
        }

        public final int encodedSize(DownloadDialogSettings downloadDialogSettings) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, downloadDialogSettings.is_enable_back_dialog) + downloadDialogSettings.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, DownloadDialogSettings downloadDialogSettings) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, downloadDialogSettings.is_enable_back_dialog);
            protoWriter.writeBytes(downloadDialogSettings.unknownFields());
        }

        public final DownloadDialogSettings decode(ProtoReader protoReader, DownloadDialogSettings downloadDialogSettings) throws IOException {
            Builder builder;
            DownloadDialogSettings downloadDialogSettings2 = (DownloadDialogSettings) C10938a.m32097a().mo26425a(DownloadDialogSettings.class, downloadDialogSettings);
            if (downloadDialogSettings2 != null) {
                builder = downloadDialogSettings2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    try {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } catch (MissingRequiredFieldsException e) {
                        if (downloadDialogSettings2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.is_enable_back_dialog((Integer) ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }
    }

    public final Integer getIsEnableBackDialog() throws NullValueException {
        if (this.is_enable_back_dialog != null) {
            return this.is_enable_back_dialog;
        }
        throw new NullValueException();
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        if (this.is_enable_back_dialog != null) {
            i = this.is_enable_back_dialog.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.is_enable_back_dialog = this.is_enable_back_dialog;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.is_enable_back_dialog != null) {
            sb.append(", is_enable_back_dialog=");
            sb.append(this.is_enable_back_dialog);
        }
        StringBuilder replace = sb.replace(0, 2, "DownloadDialogSettings{");
        replace.append('}');
        return replace.toString();
    }

    public DownloadDialogSettings(Integer num) {
        this(num, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DownloadDialogSettings)) {
            return false;
        }
        DownloadDialogSettings downloadDialogSettings = (DownloadDialogSettings) obj;
        if (!unknownFields().equals(downloadDialogSettings.unknownFields()) || !Internal.equals(this.is_enable_back_dialog, downloadDialogSettings.is_enable_back_dialog)) {
            return false;
        }
        return true;
    }

    public DownloadDialogSettings(Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_enable_back_dialog = num;
    }
}
