@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")


@file:JsModule("@blueprintjs/core")
package com.palantir.blueprintjs

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

typealias IKeyWhitelist<T> = IKeyAllowlist<T>

typealias IKeyBlacklist<T> = IKeyDenylist<T>

external interface IKeyAllowlist<T> {
    var include: Array<Any>
}

external interface IKeyDenylist<T> {
    var exclude: Array<Any>
}

external fun arraysEqual(arrA: Array<Any>, arrB: Array<Any>, compare: (a: Any, b: Any) -> Boolean = definedExternally): Boolean

external fun <T : Any> shallowCompareKeys(objA: T, objB: T, keys: IKeyDenylist<T> = definedExternally): Boolean

external fun <T : Any> shallowCompareKeys(objA: T, objB: T): Boolean

external fun <T : Any> shallowCompareKeys(objA: T, objB: T, keys: IKeyAllowlist<T> = definedExternally): Boolean

external fun deepCompareKeys(objA: Any, objB: Any, keys: Array<Any /* String | Number | Any */> = definedExternally): Boolean

external interface `T$12` {
    var key: Any
    var valueA: Any
    var valueB: Any
}

external fun <T : Any> getDeepUnequalKeyValues(objA: T = definedExternally, objB: T = definedExternally, keys: Array<Any> = definedExternally): Array<`T$12`>