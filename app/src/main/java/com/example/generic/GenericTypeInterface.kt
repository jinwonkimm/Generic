package com.example.generic

/**
 * 제너릭 타입 인터페이스
 */
interface GenericTypeInterface<S, I> {
    fun stringToInt(s: S): I
    fun intToString(i: I): S
}