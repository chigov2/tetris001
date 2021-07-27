package techmarket.uno.tetris001.helper

fun array2dOfByte(sizeOuter: Int, sizeInner: Int): Array<ByteArray>
        = Array(sizeOuter) { ByteArray(sizeInner) }