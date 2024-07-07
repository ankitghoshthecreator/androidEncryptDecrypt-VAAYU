package com.ankitghoshthecreator.androidcrypto

import android.os.Build
import android.security.keystore.KeyProperties
import androidx.annotation.RequiresApi
import java.security.KeyStore
@RequiresApi(Build.VERSION_CODES.M)


class CryptoManager {
    private val keystore =KeyStore.getInstance("AndroidKeyStore").apply {
        load(null)
    }

    companion object{

        private const val ALGORITHM = KeyProperties.KEY_ALGORITHM_AES
        private const val BLOCK_MODE = KeyProperties.BLOCK_MODE_CBC
        private const val PADDING = KeyProperties.ENCRYPTION_PADDING_PKCS7
        private const val TRANSFORMATION = "$ALGORITHM/$BLOCK_MODE/$PADDING"

    }
}