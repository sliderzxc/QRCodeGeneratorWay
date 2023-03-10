package com.main.core.navigation

import androidx.core.net.toUri

object DeepLinks {
    val GENERATION_DEEP_LINK = "QRCodeGeneratorWay://generation".toUri()
    val GENERATION_FROM_TEXT_DEEP_LINK = "QRCodeGeneratorWay://generation/from/text".toUri()
    val GENERATION_FROM_LINK_DEEP_LINK = "QRCodeGeneratorWay://generation/from/link".toUri()
}