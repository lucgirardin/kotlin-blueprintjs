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

external interface IRefObject<T> {
    var current: T?
}

external fun <T : HTMLElement> isRefObject(value: IRefObject<T>?): Boolean

external fun <T : HTMLElement> isRefObject(value: IRefCallback<T>?): Boolean

typealias IRefCallback<T> = (ref: T?) -> Any

external fun <T : HTMLElement> isRefCallback(value: IRefObject<T>?): Boolean

external fun <T : HTMLElement> isRefCallback(value: IRefCallback<T>?): Boolean

external fun <T> getRef(ref: T?): T?

external fun <T> getRef(ref: IRefObject<T>?): T?